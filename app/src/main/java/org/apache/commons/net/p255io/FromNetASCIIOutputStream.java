package org.apache.commons.net.p255io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/FromNetASCIIOutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/FromNetASCIIOutputStream.class */
public final class FromNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR;

    public FromNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.__lastWasCR = false;
    }

    private void __write(int i10) {
        if (i10 == 10) {
            if (this.__lastWasCR) {
                ((FilterOutputStream) this).out.write(FromNetASCIIInputStream._lineSeparatorBytes);
                this.__lastWasCR = false;
                return;
            } else {
                this.__lastWasCR = false;
                ((FilterOutputStream) this).out.write(10);
                return;
            }
        }
        if (i10 == 13) {
            this.__lastWasCR = true;
            return;
        }
        if (this.__lastWasCR) {
            ((FilterOutputStream) this).out.write(13);
            this.__lastWasCR = false;
        }
        ((FilterOutputStream) this).out.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (FromNetASCIIInputStream._noConversionRequired) {
                super.close();
                return;
            }
            if (this.__lastWasCR) {
                ((FilterOutputStream) this).out.write(13);
            }
            super.close();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        synchronized (this) {
            if (FromNetASCIIInputStream._noConversionRequired) {
                ((FilterOutputStream) this).out.write(i10);
            } else {
                __write(i10);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        synchronized (this) {
            write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            int i12 = i10;
            if (FromNetASCIIInputStream._noConversionRequired) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i13 = i11; i13 > 0; i13--) {
                __write(bArr[i12]);
                i12++;
            }
        }
    }
}
