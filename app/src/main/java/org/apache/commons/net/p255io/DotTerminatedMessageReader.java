package org.apache.commons.net.p255io;

import java.io.BufferedReader;
import java.io.Reader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/DotTerminatedMessageReader.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/DotTerminatedMessageReader.class */
public final class DotTerminatedMessageReader extends BufferedReader {

    /* renamed from: CR */
    private static final char f36130CR = '\r';
    private static final int DOT = 46;

    /* renamed from: LF */
    private static final char f36131LF = '\n';
    private boolean atBeginning;
    private boolean eof;
    private boolean seenCR;

    public DotTerminatedMessageReader(Reader reader) {
        super(reader);
        this.atBeginning = true;
        this.eof = false;
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (((BufferedReader) this).lock) {
            if (!this.eof) {
                do {
                } while (read() != -1);
            }
            this.eof = true;
            this.atBeginning = false;
        }
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() {
        synchronized (((BufferedReader) this).lock) {
            if (this.eof) {
                return -1;
            }
            int read = super.read();
            if (read == -1) {
                this.eof = true;
                return -1;
            }
            if (this.atBeginning) {
                this.atBeginning = false;
                if (read == 46) {
                    mark(2);
                    int read2 = super.read();
                    if (read2 == -1) {
                        this.eof = true;
                        return 46;
                    }
                    if (read2 == 46) {
                        return read2;
                    }
                    if (read2 == 13) {
                        int read3 = super.read();
                        if (read3 == -1) {
                            reset();
                            return 46;
                        }
                        if (read3 == 10) {
                            this.atBeginning = true;
                            this.eof = true;
                            return -1;
                        }
                    }
                    reset();
                    return 46;
                }
            }
            if (this.seenCR) {
                this.seenCR = false;
                if (read == 10) {
                    this.atBeginning = true;
                }
            }
            if (read == 13) {
                this.seenCR = true;
            }
            return read;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        int i12;
        if (i11 < 1) {
            return 0;
        }
        synchronized (((BufferedReader) this).lock) {
            int read = read();
            if (read == -1) {
                return -1;
            }
            int i13 = i10;
            int i14 = i11;
            int i15 = read;
            while (true) {
                i12 = i13 + 1;
                cArr[i13] = (char) i15;
                i14--;
                if (i14 <= 0) {
                    break;
                }
                i15 = read();
                if (i15 == -1) {
                    break;
                }
                i13 = i12;
            }
            return i12 - i10;
        }
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
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
                if (read == 10 && this.atBeginning) {
                    return sb2.substring(0, sb2.length() - 1);
                }
                sb2.append((char) read);
            }
        }
    }
}
