package org.apache.commons.net.p255io;

import java.io.BufferedReader;
import java.io.Reader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/CRLFLineReader.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/CRLFLineReader.class */
public final class CRLFLineReader extends BufferedReader {

    /* renamed from: CR */
    private static final char f36128CR = '\r';

    /* renamed from: LF */
    private static final char f36129LF = '\n';

    public CRLFLineReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z10 = false;
            while (true) {
                int read = read();
                if (read == -1) {
                    String sb3 = sb2.toString();
                    String str = sb3;
                    if (sb3.length() == 0) {
                        str = null;
                    }
                    return str;
                }
                if (z10 && read == 10) {
                    return sb2.substring(0, sb2.length() - 1);
                }
                z10 = read == 13;
                sb2.append((char) read);
            }
        }
    }
}
