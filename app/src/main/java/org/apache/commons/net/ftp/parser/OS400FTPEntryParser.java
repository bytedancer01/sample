package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/OS400FTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/OS400FTPEntryParser.class */
public class OS400FTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "yy/MM/dd HH:mm:ss";
    private static final String REGEX = "(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+(?:(\\S+)\\s*)?";

    public OS400FTPEntryParser() {
        this(null);
    }

    public OS400FTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_OS400, DEFAULT_DATE_FORMAT, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:3|(1:70)(1:7)|8|9|10|11|(2:13|(1:35)(1:17))(11:37|(2:39|(1:44)(1:43))(3:46|(2:48|(1:53))(2:55|(2:57|(1:64)(1:65))(1:67))|52)|19|20|21|22|(1:24)|25|(2:27|(1:29))|30|31)|18|19|20|21|22|(0)|25|(0)|30|31) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.OS400FTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }
}
