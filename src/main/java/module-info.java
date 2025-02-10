module com.tugalsan.api.file.common {
    requires java.desktop;
    requires com.tugalsan.api.url;
    requires com.tugalsan.api.font;
    requires com.tugalsan.api.function;
    requires com.tugalsan.api.string;
    requires com.tugalsan.api.log;
    requires com.tugalsan.api.file;
    requires com.tugalsan.api.list;
    
    requires com.tugalsan.api.time;
    exports com.tugalsan.api.file.common.client;
    exports com.tugalsan.api.file.common.server;
}
