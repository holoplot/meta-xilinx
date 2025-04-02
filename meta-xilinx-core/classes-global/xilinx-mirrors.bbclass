python() {
    import os.path
    from bb.fetch2 import decodeurl, CHECKSUM_LIST

    xlnx_mirrors = d.getVar('XILINX_MIRRORS')
    if xlnx_mirrors:
        mirrors = bb.fetch2.mirror_from_string(xlnx_mirrors)

        try:
            new_srcuri = []

            replace_uri = False
            newuris = None
            orig_seen = d.getVar("__BBSRCREV_SEEN")
            d.setVar("__BBSRCREV_SEEN", "1")
            for download_idx, src_uri in enumerate(d.getVar('SRC_URI').split()):
                ud = bb.fetch.FetchData(src_uri, d)

                newuris, uds = bb.fetch2.build_mirroruris(ud, mirrors, d)

                if newuris:
                    replace_uri = True
                    new_srcuri += newuris
                else:
                    new_srcuri += [ src_uri ]

            if replace_uri:
                d.setVar('SRC_URI', ' '.join(new_srcuri) )

        except Exception as e:
            bb.error('Unable to parse URL %s (%s)' % (d.getVar('SRC_URI'), src_uri))
        finally:
            d.setVar("__BBSRCREV_SEEN", orig_seen)
}
