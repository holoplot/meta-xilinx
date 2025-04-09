SRC_URI[vardepsexclude] += "XILINX_MIRRORS"

python() {
    import os.path
    from bb.fetch2 import decodeurl, CHECKSUM_LIST

    xlnx_mirrors = d.getVar('XILINX_MIRRORS')
    if xlnx_mirrors:
        orig_src_uri = d.getVar('SRC_URI')
        dl_dir = d.getVar('DL_DIR')

        mirrors = bb.fetch2.mirror_from_string(xlnx_mirrors)

        try:
            new_srcuri = []
            mirror_links = []

            replace_uri = False
            newuris = None
            orig_seen = d.getVar("__BBSRCREV_SEEN")
            d.setVar("__BBSRCREV_SEEN", "1")
            for download_idx, src_uri in enumerate(orig_src_uri.split()):
                ud = bb.fetch.FetchData(src_uri, d)

                newuris, uds = bb.fetch2.build_mirroruris(ud, mirrors, d)

                if newuris:
                    replace_uri = True
                    new_srcuri += newuris
                    for each_ud in uds:
                        try:
                            linkpath = os.path.join(dl_dir, ud.localpath)
                            targetpath = os.path.join(dl_dir, each_ud.localpath)

                            reltarget = os.path.relpath(targetpath, os.path.dirname(linkpath))

                            mirror_link = "%s:%s" % ( linkpath, reltarget )
                            if mirror_link not in mirror_links:
                                mirror_links += [ mirror_link ]
                        except Exception as e:
                            bb.debug(1, "xilinx-mirrors: localpath mirror link exception %s" % e)

                        try:
                            linkpath = os.path.join(dl_dir, ud.fullmirror)
                            targetpath = os.path.join(dl_dir, each_ud.fullmirror)

                            reltarget = os.path.relpath(targetpath, os.path.dirname(linkpath))

                            mirror_link = "%s:%s" % ( linkpath, reltarget )
                            if mirror_link not in mirror_links:
                                mirror_links += [ mirror_link ]
                        except Exception as e:
                            bb.debug(1, "xilinx-mirrors: fullmirror link exception %s" % e)

                        try:
                            count = 0
                            while (count < len(each_ud.mirrortarballs) and count < len(ud.mirrortarballs)):
                                linkpath = os.path.join(dl_dir, ud.mirrortarballs[count])
                                targetpath = os.path.join(dl_dir, each_ud.mirrortarballs[count])

                                reltarget = os.path.relpath(targetpath, os.path.dirname(linkpath))

                                mirror_link = "%s:%s" % ( linkpath, reltarget )
                                if mirror_link not in mirror_links:
                                    mirror_links += [ mirror_link ]

                                count = count + 1
                        except Exception as e:
                            bb.debug(1, "xilinx-mirrors: mirrortarballs link exception %s" % e)

                else:
                    new_srcuri += [ src_uri ]

            if replace_uri:
                # Since we've going to change the SRC_URI, we need to preserve the hash
                # based on code in bitbake data.py on value calculation
                ignored_vars = set((d.getVar("BB_BASEHASH_IGNORE_VARS") or "").split())
                exclusions = d.getVarFlag('SRC_URI', "vardepsexclude").split()

                def handle_contains(value, contains, exclusions, d):
                    newvalue = []
                    if value:
                        newvalue.append(str(value))
                    for k in sorted(contains):
                        if k in exclusions or k in ignored_vars:
                            continue
                        l = (d.getVar(k) or "").split()
                        for item in sorted(contains[k]):
                            for word in item.split():
                                if not word in l:
                                    newvalue.append("\n%s{%s} = Unset" % (k, item))
                                    break
                            else:
                                newvalue.append("\n%s{%s} = Set" % (k, item))
                    return "".join(newvalue)

                def handle_remove(value, deps, removes, d):
                    for r in sorted(removes):
                        r2 = d.expandWithRefs(r, None)
                        value += "\n_remove of %s" % r
                        deps |= r2.references
                        deps = deps | (keys & r2.execs)
                        value = handle_contains(value, r2.contains, exclusions, d)
                    return value

                mod_funcs = set(bb.codeparser.modulecode_deps.keys())
                keys = set(key for key in d if not key.startswith("__")) | mod_funcs

                deps = set()

                value, parser = d.getVarFlag('SRC_URI', "_content", False, retparser=True)
                deps |= parser.references
                deps = deps | (keys & parser.execs)
                value = handle_contains(value, parser.contains, exclusions, d)
                if hasattr(parser, "removes"):
                    value = handle_remove(value, deps, parser.removes, d)

                d.setVarFlag('SRC_URI', 'vardepvalue', value)

                # Original hash is now preserved, now change to our mirror and set for later links
                d.setVar('SRC_URI', ' '.join(new_srcuri) )
                d.setVar('__SRC_URI_MIRROR_LINKS', ' '.join(mirror_links) )

        except Exception as e:
            bb.error('Unable to parse URL %s (%s): %s' % (d.getVar('SRC_URI'), src_uri, e))
        finally:
            d.setVar("__BBSRCREV_SEEN", orig_seen)
}

python mirror_fetcher_set_symlinks() {
    mirror_links = d.getVar('__SRC_URI_MIRROR_LINKS')
    if not mirror_links:
        return

    # Copy from bitbake fetch2/__init__.py
    def ensure_symlink(target, link_name):
        if not os.path.exists(link_name):
            bb.debug(2, "mirror_fetcher set symlink %s -> %s" % (link,  target))
            dirname = os.path.dirname(link_name)
            bb.utils.mkdirhier(dirname)
            if os.path.islink(link_name):
                # Broken symbolic link
                os.unlink(link_name)

            # In case this is executing without any file locks held (as is
            # the case for file:// URLs), two tasks may end up here at the
            # same time, in which case we do not want the second task to
            # fail when the link has already been created by the first task.
            try:
                os.symlink(target, link_name)
            except FileExistsError:
                pass

    dl_dir = d.getVar('DL_DIR')
    for mirror_link in mirror_links.split():
        (link, target) = mirror_link.split(':')

        targetpath = os.path.join(os.path.dirname(link), target)

        if os.path.exists(targetpath):
            ensure_symlink(target, link)

        if os.path.exists(targetpath + '.done'):
            ensure_symlink(target + '.done', link + '.done')
}

do_fetch[postfuncs] += "mirror_fetcher_set_symlinks"
do_fetch[vardepsexclude] += "__SRC_URI_MIRROR_LINKS"
