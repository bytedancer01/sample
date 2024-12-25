package org.apache.commons.net.p255io;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/ToNetASCIIInputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/ToNetASCIIInputStream.class */
public final class ToNetASCIIInputStream extends FilterInputStream {
    private static final int __LAST_WAS_CR = 1;
    private static final int __LAST_WAS_NL = 2;
    private static final int __NOTHING_SPECIAL = 0;
    private int __status;

    public ToNetASCIIInputStream(InputStream inputStream) {
        super(inputStream);
        this.__status = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int available = ((FilterInputStream) this).in.available();
        int i10 = available;
        if (this.__status == 2) {
            i10 = available + 1;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.__status == 2) {
            this.__status = 0;
            return 10;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != 10) {
            if (read == 13) {
                this.__status = 1;
                return 13;
            }
        } else if (this.__status != 1) {
            this.__status = 2;
            return 13;
        }
        this.__status = 0;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 < 1) {
            return 0;
        }
        int available = available();
        int i13 = i11;
        if (i11 > available) {
            i13 = available;
        }
        int i14 = i13 < 1 ? 1 : i13;
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i15 = i10;
        while (true) {
            int i16 = i15;
            i12 = i16 + 1;
            bArr[i16] = (byte) read;
            i14--;
            if (i14 <= 0) {
                break;
            }
            read = read();
            if (read == -1) {
                break;
            }
            i15 = i12;
        }
        return i12 - i10;
    }
}
