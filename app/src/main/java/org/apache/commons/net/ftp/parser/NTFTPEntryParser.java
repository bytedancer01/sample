package org.apache.commons.net.ftp.parser;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.text.ParseException;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/NTFTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/NTFTPEntryParser.class */
public class NTFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "MM-dd-yy hh:mma";
    private static final String DEFAULT_DATE_FORMAT2 = "MM-dd-yy kk:mm";
    private static final String REGEX = "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)";
    private final FTPTimestampParser timestampParser;

    public NTFTPEntryParser() {
        this(null);
    }

    public NTFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX, 32);
        configure(fTPClientConfig);
        FTPClientConfig fTPClientConfig2 = new FTPClientConfig(FTPClientConfig.SYST_NT, DEFAULT_DATE_FORMAT2, null);
        fTPClientConfig2.setDefaultDateFormatStr(DEFAULT_DATE_FORMAT2);
        FTPTimestampParserImpl fTPTimestampParserImpl = new FTPTimestampParserImpl();
        this.timestampParser = fTPTimestampParserImpl;
        fTPTimestampParserImpl.configure(fTPClientConfig2);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_NT, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        long parseLong;
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        if (!matches(str)) {
            return null;
        }
        String str2 = group(1) + " " + group(2);
        String group = group(3);
        String group2 = group(4);
        String group3 = group(5);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
        } catch (ParseException e10) {
            try {
                fTPFile.setTimestamp(this.timestampParser.parseTimestamp(str2));
            } catch (ParseException e11) {
            }
        }
        if (group3 == null || group3.equals(InstructionFileId.DOT) || group3.equals("..")) {
            return null;
        }
        fTPFile.setName(group3);
        if (!"<DIR>".equals(group)) {
            fTPFile.setType(0);
            if (group2 != null) {
                parseLong = Long.parseLong(group2);
            }
            return fTPFile;
        }
        fTPFile.setType(1);
        parseLong = 0;
        fTPFile.setSize(parseLong);
        return fTPFile;
    }
}
