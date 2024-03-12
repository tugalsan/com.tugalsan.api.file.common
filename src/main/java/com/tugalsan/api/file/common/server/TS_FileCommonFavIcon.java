package com.tugalsan.api.file.common.server;

import com.tugalsan.api.url.client.TGS_Url;

public class TS_FileCommonFavIcon {

    private TS_FileCommonFavIcon(TGS_Url hrefPngIcon) {
        this.hrefPngIcon = hrefPngIcon;
    }
    final public TGS_Url hrefPngIcon;

    public static TS_FileCommonFavIcon of(TGS_Url hrefPngIcon) {
        return new TS_FileCommonFavIcon(hrefPngIcon);
    }

    @Override
    public String toString() {
        return "<link id=\"favicon\" rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"" + hrefPngIcon + "\"/>";
    }
}
