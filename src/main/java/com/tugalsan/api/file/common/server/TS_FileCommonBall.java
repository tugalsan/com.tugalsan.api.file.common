package com.tugalsan.api.file.common.server;

import com.tugalsan.api.callable.client.TGS_CallableType1;
import com.tugalsan.api.callable.client.TGS_CallableType2;
import com.tugalsan.api.callable.client.TGS_CallableType5;
import com.tugalsan.api.list.client.*;
import java.nio.file.*;
import com.tugalsan.api.time.client.*;
import java.util.*;
import com.tugalsan.api.url.client.TGS_Url;
import com.tugalsan.api.url.client.builder.TGS_UrlBuilderParameter;

public class TS_FileCommonBall {

    public String fontColor;
    public Path fontPathBold;
    public Path fontPathBoldItalic;
    public Path fontPathItalic;
    public Path fontPathRegular;
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
    public String domainName;
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

    public TGS_Url customDomain;
    public TGS_Url favIconPng;

    public TGS_CallableType1<TGS_Url, TGS_Url> manipulateInjectCode;
    public TGS_CallableType5<List<String>, String, String, Long, String, Boolean> libTableFileList_getFileNames_DataIn;
    public TGS_CallableType2<Path, String, String> libTableFileDir_datTblTblnameColname;
    public TGS_CallableType2<TGS_Url, String, Boolean> libTableFileGetUtils_urlUsrTmp;
    public TGS_CallableType1<String, CharSequence> libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE;
    public TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_PUBLIC;
    public TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_USER;
    
    @Override
    public String toString() {
        return TS_FileCommonBall.class.getSimpleName() + "{" + "runReport=" + runReport + ", username=" + username + ", tablename=" + tablename + ", selectedId=" + selectedId + ", funcName=" + funcName + ", userDotTablename=" + userDotTablename + ", url=" + url + ", dirDat=" + dirDat + '}';
    }

    public TS_FileCommonBall(
            List<String> macroLines, String username,
            String tablename, Long selectedId,
            String funcName, String fileNameLabel, TGS_Url url,
            List<String> requestedFileTypes, Path dirDat,
            Path fontPathBold, Path fontPathBoldItalic, Path fontPathItalic, Path fontPathRegular,
            TGS_Url customDomain, TGS_Url favIconPng, String domainName,
            TGS_CallableType1<TGS_Url, TGS_Url> manipulateInjectCode,
            Path dirDatTbl,Path dirDatPub, Path dirDatUsr, Path dirDatUsrTmp,
            TGS_CallableType5<List<String>, String, String, Long, String, Boolean> libTableFileList_getFileNames_DataIn,
            TGS_CallableType2<Path, String, String> libTableFileDir_datTblTblnameColname,
             TGS_CallableType2<TGS_Url, String, Boolean> libTableFileGetUtils_urlUsrTmp,
             TGS_CallableType1<String, CharSequence> libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE,
             TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_PUBLIC,
             TGS_CallableType1<String, CharSequence> libFileServletUtils_URL_SERVLET_FETCH_USER
    ) {
        this.macroLines = macroLines;
        this.username = username;
        this.selectedId = selectedId;
        this.funcName = funcName;
        this.fileNameLabel = fileNameLabel;
        this.url = url;
        this.requestedFileTypes = requestedFileTypes;
        this.dirDat = dirDat;
        this.fontPathBold = fontPathBold;
        this.fontPathBoldItalic = fontPathBoldItalic;
        this.fontPathItalic = fontPathItalic;
        this.fontPathRegular = fontPathRegular;
        this.customDomain = customDomain;
        this.favIconPng = favIconPng;
        this.domainName = domainName;
        this.manipulateInjectCode = manipulateInjectCode;
        this.dirDatTbl = dirDatTbl;
        this.dirDatPub = dirDatPub;
        this.dirDatUsr = dirDatUsr;
        this.dirDatUsrTmp = dirDatUsrTmp;
        this.libTableFileList_getFileNames_DataIn = libTableFileList_getFileNames_DataIn;
        this.libTableFileDir_datTblTblnameColname = libTableFileDir_datTblTblnameColname;
        this.libTableFileGetUtils_urlUsrTmp = libTableFileGetUtils_urlUsrTmp;
        this.libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE = libTableServletUtils_URL_SERVLET_FETCH_TBL_FILE;
        this.libFileServletUtils_URL_SERVLET_FETCH_PUBLIC = libFileServletUtils_URL_SERVLET_FETCH_PUBLIC;
        this.libFileServletUtils_URL_SERVLET_FETCH_USER = libFileServletUtils_URL_SERVLET_FETCH_USER;

        this.fontItalic = false;
        this.fontItalic = false;
        this.fontHeight = 12;
        this.fontColor = TS_FileCommonFontTags.CODE_TOKEN_FONT_COLOR_BLACK();
        this.runReport = false;
        this.tablename = tablename;
        this.now = TGS_Time.of();
        this.mapVars = TGS_ListUtils.of();
        this.cellHeight = null;
        this.userDotTablename = this.username + "." + this.tablename;
    }

}
