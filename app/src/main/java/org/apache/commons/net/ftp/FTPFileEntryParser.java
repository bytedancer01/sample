package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPFileEntryParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPFileEntryParser.class */
public interface FTPFileEntryParser {
    FTPFile parseFTPEntry(String str);

    List<String> preParse(List<String> list);

    String readNextEntry(BufferedReader bufferedReader);
}
