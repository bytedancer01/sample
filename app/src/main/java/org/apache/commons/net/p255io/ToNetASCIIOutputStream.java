package org.apache.commons.net.p255io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/ToNetASCIIOutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/ToNetASCIIOutputStream.class */
public final class ToNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR;

    public ToNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.__lastWasCR = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        synchronized (this) {
            if (i10 != 10) {
                if (i10 == 13) {
                    this.__lastWasCR = true;
                    ((FilterOutputStream) this).out.write(13);
                    return;
                }
            } else if (!this.__lastWasCR) {
                ((FilterOutputStream) this).out.write(13);
            }
            this.__lastWasCR = false;
            ((FilterOutputStream) this).out.write(i10);
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
            while (i11 > 0) {
                write(bArr[i10]);
                i10++;
                i11--;
            }
        }
    }
}
