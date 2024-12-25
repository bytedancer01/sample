package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/OS2FTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/OS2FTPEntryParser.class */
public class OS2FTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "MM-dd-yy HH:mm";
    private static final String REGEX = "\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)";

    public OS2FTPEntryParser() {
        this(null);
    }

    public OS2FTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_OS2, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        FTPFile fTPFile = new FTPFile();
        if (!matches(str)) {
            return null;
        }
        String group = group(1);
        String group2 = group(2);
        String group3 = group(3);
        String str2 = group(4) + " " + group(5);
        String group4 = group(6);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
        } catch (ParseException e10) {
        }
        int i10 = 1;
        if (!group3.trim().equals("DIR")) {
            i10 = group2.trim().equals("DIR") ? 1 : 0;
        }
        fTPFile.setType(i10);
        fTPFile.setName(group4.trim());
        fTPFile.setSize(Long.parseLong(group.trim()));
        return fTPFile;
    }
}
