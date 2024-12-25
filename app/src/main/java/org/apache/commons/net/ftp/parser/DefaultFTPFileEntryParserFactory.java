package org.apache.commons.net.ftp.parser;

import java.util.regex.Pattern;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/DefaultFTPFileEntryParserFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/DefaultFTPFileEntryParserFactory.class */
public class DefaultFTPFileEntryParserFactory implements FTPFileEntryParserFactory {
    private static final String JAVA_IDENTIFIER = "\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final String JAVA_QUALIFIED_NAME = "(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*";
    private static final Pattern JAVA_QUALIFIED_NAME_PATTERN = Pattern.compile(JAVA_QUALIFIED_NAME);

    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.apache.commons.net.ftp.FTPFileEntryParser createFileEntryParser(java.lang.String r6, org.apache.commons.net.ftp.FTPClientConfig r7) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory.createFileEntryParser(java.lang.String, org.apache.commons.net.ftp.FTPClientConfig):org.apache.commons.net.ftp.FTPFileEntryParser");
    }

    private FTPFileEntryParser createNTFTPEntryParser(FTPClientConfig fTPClientConfig) {
        if (fTPClientConfig != null && FTPClientConfig.SYST_NT.equals(fTPClientConfig.getServerSystemKey())) {
            return new NTFTPEntryParser(fTPClientConfig);
        }
        FTPClientConfig fTPClientConfig2 = fTPClientConfig != null ? new FTPClientConfig(fTPClientConfig) : null;
        NTFTPEntryParser nTFTPEntryParser = new NTFTPEntryParser(fTPClientConfig);
        boolean z10 = false;
        if (fTPClientConfig2 != null) {
            z10 = false;
            if (FTPClientConfig.SYST_UNIX_TRIM_LEADING.equals(fTPClientConfig2.getServerSystemKey())) {
                z10 = true;
            }
        }
        return new CompositeFileEntryParser(new FTPFileEntryParser[]{nTFTPEntryParser, new UnixFTPEntryParser(fTPClientConfig2, z10)});
    }

    private FTPFileEntryParser createOS400FTPEntryParser(FTPClientConfig fTPClientConfig) {
        if (fTPClientConfig != null && FTPClientConfig.SYST_OS400.equals(fTPClientConfig.getServerSystemKey())) {
            return new OS400FTPEntryParser(fTPClientConfig);
        }
        FTPClientConfig fTPClientConfig2 = fTPClientConfig != null ? new FTPClientConfig(fTPClientConfig) : null;
        OS400FTPEntryParser oS400FTPEntryParser = new OS400FTPEntryParser(fTPClientConfig);
        boolean z10 = false;
        if (fTPClientConfig2 != null) {
            z10 = false;
            if (FTPClientConfig.SYST_UNIX_TRIM_LEADING.equals(fTPClientConfig2.getServerSystemKey())) {
                z10 = true;
            }
        }
        return new CompositeFileEntryParser(new FTPFileEntryParser[]{oS400FTPEntryParser, new UnixFTPEntryParser(fTPClientConfig2, z10)});
    }

    @Override // org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory
    public FTPFileEntryParser createFileEntryParser(String str) {
        if (str != null) {
            return createFileEntryParser(str, null);
        }
        throw new ParserInitializationException("Parser key cannot be null");
    }

    @Override // org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory
    public FTPFileEntryParser createFileEntryParser(FTPClientConfig fTPClientConfig) {
        return createFileEntryParser(fTPClientConfig.getServerSystemKey(), fTPClientConfig);
    }

    public FTPFileEntryParser createMVSEntryParser() {
        return new MVSFTPEntryParser();
    }

    public FTPFileEntryParser createNTFTPEntryParser() {
        return createNTFTPEntryParser(null);
    }

    public FTPFileEntryParser createNetwareFTPEntryParser() {
        return new NetwareFTPEntryParser();
    }

    public FTPFileEntryParser createOS2FTPEntryParser() {
        return new OS2FTPEntryParser();
    }

    public FTPFileEntryParser createOS400FTPEntryParser() {
        return createOS400FTPEntryParser(null);
    }

    public FTPFileEntryParser createUnixFTPEntryParser() {
        return new UnixFTPEntryParser();
    }

    public FTPFileEntryParser createVMSVersioningFTPEntryParser() {
        return new VMSVersioningFTPEntryParser();
    }
}
