package com.tugalsan.api.file.common.client;

import com.tugalsan.api.url.client.TGS_Url;

public class TGS_FileCommonFavIcon {

    private TGS_FileCommonFavIcon(TGS_Url hrefPngIcon, String utf8Text, String optionalBackColor, boolean invertColors) {
        this.hrefPngIcon = hrefPngIcon;
        this.utf8Text = utf8Text;
        this.optionalBackColor = optionalBackColor;
        this.invertColors = invertColors;
    }
    final public TGS_Url hrefPngIcon;
    final public String utf8Text;
    final public String optionalBackColor;
    final public boolean invertColors;

    public static TGS_FileCommonFavIcon of(TGS_Url hrefPngIcon) {
        return new TGS_FileCommonFavIcon(hrefPngIcon, null, null, false);
    }

    public static TGS_FileCommonFavIcon of(String utf8Text, String optionalBackColor, boolean invertColors) {
        return new TGS_FileCommonFavIcon(null, utf8Text, optionalBackColor, invertColors);
    }

    public boolean isUTF8Text() {
        return hrefPngIcon == null;
    }

    public boolean isIcon() {
        return hrefPngIcon != null;
    }

    @Override
    public String toString() {
        if (isIcon()) {
            return "<link id=\"favicon\" rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"" + hrefPngIcon + "\"/>";
        }
        return "<link rel=\"icon\" href=\"data:image/svg+xml,<svg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 20 20' style='filter: invert(100%);'><rect width='100%' height='100%' fill='white'/><text x='-1' y='15.5' stroke='red'>ms</text></svg>\" type=\"image/svg+xml\" />";
    }
}
