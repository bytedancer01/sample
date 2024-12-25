package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/MacOsPeterFTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/MacOsPeterFTPEntryParser.class */
public class MacOsPeterFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    public static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
    public static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
    private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)";

    public MacOsPeterFTPEntryParser() {
        this(null);
    }

    public MacOsPeterFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_UNIX, "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|(2:4|5)|6|7|(17:9|(15:11|12|15|(4:18|(2:25|26)(2:22|23)|24|16)|27|28|(2:48|49)|30|31|32|33|34|(1:36)(2:40|(1:45)(1:44))|37|38)|54|14|15|(1:16)|27|28|(0)|30|31|32|33|34|(0)(0)|37|38)|55|14|15|(1:16)|27|28|(0)|30|31|32|33|34|(0)(0)|37|38) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.MacOsPeterFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }
}
