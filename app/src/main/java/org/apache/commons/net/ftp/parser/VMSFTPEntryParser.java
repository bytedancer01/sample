package org.apache.commons.net.ftp.parser;

import java.io.BufferedReader;
import java.io.InputStream;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/VMSFTPEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/VMSFTPEntryParser.class */
public class VMSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    private static final String DEFAULT_DATE_FORMAT = "d-MMM-yyyy HH:mm:ss";
    private static final String REGEX = "(.*?;[0-9]+)\\s*(\\d+)/\\d+\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)";

    public VMSFTPEntryParser() {
        this(null);
    }

    public VMSFTPEntryParser(FTPClientConfig fTPClientConfig) {
        super(REGEX);
        configure(fTPClientConfig);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_VMS, DEFAULT_DATE_FORMAT, null);
    }

    public boolean isVersioning() {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x017d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.VMSFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }

    @Deprecated
    public FTPFile[] parseFileList(InputStream inputStream) {
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(this);
        fTPListParseEngine.readServerList(inputStream, null);
        return fTPListParseEngine.getFiles();
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public String readNextEntry(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        StringBuilder sb2 = new StringBuilder();
        while (readLine != null) {
            if (!readLine.startsWith("Directory") && !readLine.startsWith("Total")) {
                sb2.append(readLine);
                if (readLine.trim().endsWith(")")) {
                    break;
                }
            }
            readLine = bufferedReader.readLine();
        }
        return sb2.length() == 0 ? null : sb2.toString();
    }
}
