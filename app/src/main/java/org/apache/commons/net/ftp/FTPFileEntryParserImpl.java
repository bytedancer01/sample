package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPFileEntryParserImpl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPFileEntryParserImpl.class */
public abstract class FTPFileEntryParserImpl implements FTPFileEntryParser {
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        return list;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public String readNextEntry(BufferedReader bufferedReader) {
        return bufferedReader.readLine();
    }
}
