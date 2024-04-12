package com.tugalsan.api.file.common.server;

import com.tugalsan.api.callable.client.TGS_CallableType1;
import com.tugalsan.api.callable.client.TGS_CallableType2;
import com.tugalsan.api.callable.client.TGS_CallableType5;
import com.tugalsan.api.file.common.client.TGS_FileCommonFavIcon;
import com.tugalsan.api.font.client.TGS_FontFamily;
import com.tugalsan.api.font.server.TS_FontUtils;
import com.tugalsan.api.list.client.*;
import com.tugalsan.api.log.server.TS_Log;
import java.nio.file.*;
import com.tugalsan.api.time.client.*;
import com.tugalsan.api.union.client.TGS_UnionExcuse;
import java.util.*;
import com.tugalsan.api.url.client.TGS_Url;
import com.tugalsan.api.url.client.parser.TGS_UrlParser;
import java.awt.Font;
import java.util.stream.IntStream;

public class TS_FileCommonConfig {

    private static TS_Log d = TS_Log.of(false, TS_FileCommonConfig.class);

    public List<TGS_FontFamily<Path>> fontFamilyPaths;
    public List<TGS_FontFamily<Font>> fontFamilyFonts;
    public volatile int fontFamilyIdx = 0;

    public String fontColor;
    public float fontHeightK;

    //FILE NAMES
    public String prefferedFileNameLabel = "";

    //AUTOMATION
    public List<String> requestedFileTypes;
    public String fileNameLabel;

    //MACRO BASE
    public TGS_Time now;
    public String doFind_gotoLabel = null;
    public String macroLine;
    public String macroLineUpperCase;
    public List<String> macroLineTokens;
    public List<String> mapVars;
    public boolean insertPageTriggeredBefore = false;

    //FONT
    public int fontHeight;
    public boolean fontBold, fontItalic, fontUnderlined;
    public boolean enableTableCellBorder = true;

    //IMAGE WEB
    public long imageCounter = 0L;

    //GLOBALS
    public boolean runReport;
    public List<String> macroLines;
    public String username;
    public String tablename;
    public Long selectedId;
    public String funcName;
    public Integer cellHeight;
    public String userDotTablename;

    public TGS_Url url;
    public Path dirDat;
    public Path dirDatTbl;
    public Path dirDatPub;
    public Path dirDatUsr;
    public Path dirDatUsrTmp;

    public TGS_FileCommonFavIcon favIconPng;

    public TGS_CallableType1<TGS_Url, TGS_Url> manipulateInjectCode;
    public TGS_CallableType5<List<String>, String, String, Long, String, Boolean> libTableFileList_getFileNames_DataIn;
    public TGS_CallableType2<Path, String, String> libTableFileDir_datTblTblnameColname;
    public TGS_CallableType2<TGS_Url, String, Boolean> libTableFileGetUtils_urlUsrTmp;
    public TGS_CallableType1<String, CharSequence> libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE;
    public TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_PUBLIC;
    public TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_USER;

    public TGS_Url bootloaderJs;
    public String domainName;

    @Override
    public String toString() {
        return TS_FileCommonConfig.class.getSimpleName() + "{" + "runReport=" + runReport + ", username=" + username + ", tablename=" + tablename + ", selectedId=" + selectedId + ", funcName=" + funcName + ", userDotTablename=" + userDotTablename + ", url=" + url + ", dirDat=" + dirDat + '}';
    }

    public static TGS_UnionExcuse<TS_FileCommonConfig> of(
            List<String> macroLines, String username,
            String tablename, Long selectedId,
            String funcName, String fileNameLabel, TGS_Url url,
            List<String> requestedFileTypes, Path dirDat,
            List<TGS_FontFamily<Path>> fontFamilyPaths,
            TGS_FileCommonFavIcon favIconPng,
            Path dirDatTbl, Path dirDatPub, Path dirDatUsr, Path dirDatUsrTmp,
            TGS_Url bootloaderJs
    ) {
        TGS_CallableType1<TGS_Url, TGS_Url> manipulateInjectCode = _url -> _url;//SKIP LEGACY CODE
        TGS_CallableType5<List<String>, String, String, Long, String, Boolean> libTableFileList_getFileNames_DataIn = (a, b, c, d, e) -> TGS_ListUtils.of();//SKIP LEGACY CODE
        TGS_CallableType2<Path, String, String> libTableFileDir_datTblTblnameColname = (a, b) -> dirDatUsrTmp;//SKIP LEGACY CODE
        TGS_CallableType2<TGS_Url, String, Boolean> libTableFileGetUtils_urlUsrTmp = (a, b) -> bootloaderJs;//SKIP LEGACY CODE
        TGS_CallableType1<String, CharSequence> libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE = a -> "";//SKIP LEGACY CODE
        TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_PUBLIC = a -> "";//SKIP LEGACY CODE
        TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_USER = a -> "";//SKIP LEGACY CODE
        return of(
                macroLines, username,
                tablename, selectedId,
                funcName, fileNameLabel, url,
                requestedFileTypes, dirDat,
                fontFamilyPaths,
                favIconPng,
                manipulateInjectCode,
                dirDatTbl, dirDatPub, dirDatUsr, dirDatUsrTmp,
                libTableFileList_getFileNames_DataIn,
                libTableFileDir_datTblTblnameColname,
                libTableFileGetUtils_urlUsrTmp,
                libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE,
                libFileServletUtils_URL_SERVLET_FETCH_PUBLIC,
                libFileServletUtils_URL_SERVLET_FETCH_USER,
                bootloaderJs
        );
    }

    public static TGS_UnionExcuse<TS_FileCommonConfig> of(
            List<String> macroLines, String username,
            String tablename, Long selectedId,
            String funcName, String fileNameLabel, TGS_Url url,
            List<String> requestedFileTypes, Path dirDat,
            List<TGS_FontFamily<Path>> fontFamilyPaths,
            TGS_FileCommonFavIcon favIconPng,
            TGS_CallableType1<TGS_Url, TGS_Url> manipulateInjectCode,
            Path dirDatTbl, Path dirDatPub, Path dirDatUsr, Path dirDatUsrTmp,
            TGS_CallableType5<List<String>, String, String, Long, String, Boolean> libTableFileList_getFileNames_DataIn,
            TGS_CallableType2<Path, String, String> libTableFileDir_datTblTblnameColname,
            TGS_CallableType2<TGS_Url, String, Boolean> libTableFileGetUtils_urlUsrTmp,
            TGS_CallableType1<String, CharSequence> libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE,
            TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_PUBLIC,
            TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_USER,
            TGS_Url bootloaderJs
    ) {
        var _this = new TS_FileCommonConfig();
        if (d.infoEnable) {
            IntStream.range(0, macroLines.size()).forEachOrdered(i -> {
                d.ci("macroLines", i, macroLines.get(i));
            });
            d.ci("username", username);
            d.ci("tablename", tablename);
            d.ci("selectedId", selectedId);
            d.ci("funcName", funcName);
            d.ci("fileNameLabel", fileNameLabel);
            d.ci("url", url);
            IntStream.range(0, requestedFileTypes.size()).forEachOrdered(i -> {
                d.ci("requestedFileTypes", i, requestedFileTypes.get(i));
            });
            d.ci("dirDat", dirDat);
            d.ci("fontFamilyPaths", fontFamilyPaths);
            d.ci("favIconPng", favIconPng);
            d.ci("manipulateInjectCode", manipulateInjectCode != null);
            d.ci("dirDatTbl", dirDatTbl);
            d.ci("dirDatPub", dirDatPub);
            d.ci("dirDatUsr", dirDatUsr);
            d.ci("dirDatUsrTmp", dirDatUsrTmp);
            d.ci("dirDatTbl", dirDatTbl);
            d.ci("dirDatTbl", dirDatTbl);
            d.ci("libTableFileList_getFileNames_DataIn", libTableFileList_getFileNames_DataIn != null);
            d.ci("libTableFileDir_datTblTblnameColname", libTableFileDir_datTblTblnameColname != null);
            d.ci("libTableFileGetUtils_urlUsrTmp", libTableFileGetUtils_urlUsrTmp != null);
            d.ci("libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE", libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE != null);
            d.ci("libFileServletUtils_URL_SERVLET_FETCH_PUBLIC", libFileServletUtils_URL_SERVLET_FETCH_PUBLIC != null);
            d.ci("libFileServletUtils_URL_SERVLET_FETCH_USER", libFileServletUtils_URL_SERVLET_FETCH_USER != null);
        }
        _this.macroLines = macroLines;
        _this.username = username;
        _this.selectedId = selectedId;
        _this.funcName = funcName;
        _this.fileNameLabel = fileNameLabel;
        _this.url = url;
        _this.requestedFileTypes = requestedFileTypes;
        _this.dirDat = dirDat;
        _this.fontFamilyPaths = fontFamilyPaths;
//        this.customDomain = customDomain;
        _this.favIconPng = favIconPng;
        _this.manipulateInjectCode = manipulateInjectCode;
        _this.dirDatTbl = dirDatTbl;
        _this.dirDatPub = dirDatPub;
        _this.dirDatUsr = dirDatUsr;
        _this.dirDatUsrTmp = dirDatUsrTmp;
        _this.libTableFileList_getFileNames_DataIn = libTableFileList_getFileNames_DataIn;
        _this.libTableFileDir_datTblTblnameColname = libTableFileDir_datTblTblnameColname;
        _this.libTableFileGetUtils_urlUsrTmp = libTableFileGetUtils_urlUsrTmp;
        _this.libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE = libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE;
        _this.libFileServletUtils_URL_SERVLET_FETCH_PUBLIC = libFileServletUtils_URL_SERVLET_FETCH_PUBLIC;
        _this.libFileServletUtils_URL_SERVLET_FETCH_USER = libFileServletUtils_URL_SERVLET_FETCH_USER;
        _this.bootloaderJs = bootloaderJs;

        _this.fontItalic = false;
        _this.fontItalic = false;
        _this.fontHeight = 12;
        _this.fontColor = TS_FileCommonFontTags.CODE_TOKEN_FONT_COLOR_BLACK();
        _this.runReport = false;
        _this.tablename = tablename;
        _this.now = TGS_Time.of();
        _this.mapVars = TGS_ListUtils.of();
        _this.cellHeight = null;
        _this.userDotTablename = _this.username + "." + _this.tablename;
        if (bootloaderJs == null) {
            _this.domainName = "localhost";
        } else {
            var u = TGS_UrlParser.of(bootloaderJs);
            if (u.isExcuse()) {
                return u.toExcuse();
            }
            _this.domainName = u.value().host.domain;
        }
        _this.fontFamilyFonts = TS_FontUtils.toFont(fontFamilyPaths, _this.fontHeight);
        return TGS_UnionExcuse.of(_this);
    }

    private TS_FileCommonConfig() {

    }

}
