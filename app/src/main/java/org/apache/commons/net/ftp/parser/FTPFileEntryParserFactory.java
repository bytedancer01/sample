package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/FTPFileEntryParserFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/FTPFileEntryParserFactory.class */
public interface FTPFileEntryParserFactory {
    FTPFileEntryParser createFileEntryParser(String str);

    FTPFileEntryParser createFileEntryParser(FTPClientConfig fTPClientConfig);
}
