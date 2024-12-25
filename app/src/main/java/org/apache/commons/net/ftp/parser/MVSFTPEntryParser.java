package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/MVSFTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/MVSFTPEntryParser.class */
public class MVSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    public static final String DEFAULT_DATE_FORMAT = "yyyy/MM/dd HH:mm";
    public static final String FILE_LIST_REGEX = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*";
    public static final int FILE_LIST_TYPE = 0;
    public static final String JES_LEVEL_1_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*";
    public static final int JES_LEVEL_1_LIST_TYPE = 3;
    public static final String JES_LEVEL_2_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*";
    public static final int JES_LEVEL_2_LIST_TYPE = 4;
    public static final String MEMBER_LIST_REGEX = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*";
    public static final int MEMBER_LIST_TYPE = 1;
    public static final int UNIX_LIST_TYPE = 2;
    public static final int UNKNOWN_LIST_TYPE = -1;
    private int isType;
    private UnixFTPEntryParser unixFTPEntryParser;

    public MVSFTPEntryParser() {
        super("");
        this.isType = -1;
        super.configure(null);
    }

    private boolean parseFileList(FTPFile fTPFile, String str) {
        if (!matches(str)) {
            return false;
        }
        fTPFile.setRawListing(str);
        String group = group(2);
        String group2 = group(1);
        fTPFile.setName(group);
        if ("PS".equals(group2)) {
            fTPFile.setType(0);
            return true;
        }
        if (!"PO".equals(group2) && !"PO-E".equals(group2)) {
            return false;
        }
        fTPFile.setType(1);
        return true;
    }

    private boolean parseJeslevel1List(FTPFile fTPFile, String str) {
        if (!matches(str) || !group(3).equalsIgnoreCase("OUTPUT")) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return true;
    }

    private boolean parseJeslevel2List(FTPFile fTPFile, String str) {
        if (!matches(str) || !group(4).equalsIgnoreCase("OUTPUT")) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return true;
    }

    private boolean parseMemberList(FTPFile fTPFile, String str) {
        if (!matches(str)) {
            return false;
        }
        fTPFile.setRawListing(str);
        String group = group(1);
        String str2 = group(2) + " " + group(3);
        fTPFile.setName(group);
        fTPFile.setType(0);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
            return true;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private boolean parseSimpleEntry(FTPFile fTPFile, String str) {
        if (str == null || str.trim().length() <= 0) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(str.split(" ")[0]);
        fTPFile.setType(0);
        return true;
    }

    private boolean parseUnixList(FTPFile fTPFile, String str) {
        return this.unixFTPEntryParser.parseFTPEntry(str) != null;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_MVS, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        boolean parseUnixList;
        FTPFile fTPFile = new FTPFile();
        int i10 = this.isType;
        if (i10 == 0) {
            parseUnixList = parseFileList(fTPFile, str);
        } else if (i10 == 1) {
            parseUnixList = parseMemberList(fTPFile, str);
            if (!parseUnixList) {
                parseUnixList = parseSimpleEntry(fTPFile, str);
            }
        } else {
            parseUnixList = i10 == 2 ? parseUnixList(fTPFile, str) : i10 == 3 ? parseJeslevel1List(fTPFile, str) : i10 == 4 ? parseJeslevel2List(fTPFile, str) : false;
        }
        FTPFile fTPFile2 = fTPFile;
        if (!parseUnixList) {
            fTPFile2 = null;
        }
        return fTPFile2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b6  */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> preParse(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Lbe
            r0 = r5
            int r0 = r0.size()
            if (r0 <= 0) goto Lbe
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Volume"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L3b
            r0 = r6
            java.lang.String r1 = "Dsname"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L3b
            r0 = r4
            r1 = 0
            r0.setType(r1)
            java.lang.String r0 = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*"
            r6 = r0
        L32:
            r0 = r4
            r1 = r6
            boolean r0 = super.setRegex(r1)
            goto Lae
        L3b:
            r0 = r6
            java.lang.String r1 = "Name"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L58
            r0 = r6
            java.lang.String r1 = "Id"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L58
            r0 = r4
            r1 = 1
            r0.setType(r1)
            java.lang.String r0 = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*"
            r6 = r0
            goto L32
        L58:
            r0 = r6
            java.lang.String r1 = "total"
            int r0 = r0.indexOf(r1)
            if (r0 != 0) goto L74
            r0 = r4
            r1 = 2
            r0.setType(r1)
            r0 = r4
            org.apache.commons.net.ftp.parser.UnixFTPEntryParser r1 = new org.apache.commons.net.ftp.parser.UnixFTPEntryParser
            r2 = r1
            r2.<init>()
            r0.unixFTPEntryParser = r1
            goto Lae
        L74:
            r0 = r6
            java.lang.String r1 = "Spool Files"
            int r0 = r0.indexOf(r1)
            r1 = 30
            if (r0 < r1) goto L8a
            r0 = r4
            r1 = 3
            r0.setType(r1)
            java.lang.String r0 = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*"
            r6 = r0
            goto L32
        L8a:
            r0 = r6
            java.lang.String r1 = "JOBNAME"
            int r0 = r0.indexOf(r1)
            if (r0 != 0) goto La9
            r0 = r6
            java.lang.String r1 = "JOBID"
            int r0 = r0.indexOf(r1)
            r1 = 8
            if (r0 <= r1) goto La9
            r0 = r4
            r1 = 4
            r0.setType(r1)
            java.lang.String r0 = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*"
            r6 = r0
            goto L32
        La9:
            r0 = r4
            r1 = -1
            r0.setType(r1)
        Lae:
            r0 = r4
            int r0 = r0.isType
            r1 = 3
            if (r0 == r1) goto Lbe
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
        Lbe:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.MVSFTPEntryParser.preParse(java.util.List):java.util.List");
    }

    public void setType(int i10) {
        this.isType = i10;
    }
}
