package org.apache.commons.net.ftp.parser;

import java.util.List;
import java.util.ListIterator;
import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/UnixFTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/UnixFTPEntryParser.class */
public class UnixFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    public static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
    private static final String DEFAULT_DATE_FORMAT_JA = "M'月' d'日' yyyy'年'";
    public static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
    private static final String DEFAULT_RECENT_DATE_FORMAT_JA = "M'月' d'日' HH:mm";
    private static final String JA_DAY = "日";
    private static final String JA_MONTH = "月";
    private static final String JA_YEAR = "年";
    private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)";
    public final boolean trimLeadingSpaces;
    public static final String NUMERIC_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    public static final FTPClientConfig NUMERIC_DATE_CONFIG = new FTPClientConfig(FTPClientConfig.SYST_UNIX, NUMERIC_DATE_FORMAT, null);

    public UnixFTPEntryParser() {
        this(null);
    }

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig) {
        this(fTPClientConfig, false);
    }

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig, boolean z10) {
        super(REGEX);
        configure(fTPClientConfig);
        this.trimLeadingSpaces = z10;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_UNIX, "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:3|(1:5)|6|7|(1:9)(1:59)|10|11|12|(18:14|(15:16|17|20|(4:23|(2:30|31)(2:27|28)|29|21)|32|33|(2:50|51)|35|36|37|38|39|(1:47)(1:43)|44|45)|56|19|20|(1:21)|32|33|(0)|35|36|37|38|39|(1:41)|47|44|45)|57|19|20|(1:21)|32|33|(0)|35|36|37|38|39|(0)|47|44|45) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.UnixFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().matches("^total \\d+$")) {
                listIterator.remove();
            }
        }
        return list;
    }
}
