package org.apache.commons.net.telnet;

import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetOutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetOutputStream.class */
final class TelnetOutputStream extends OutputStream {
    private final TelnetClient __client;
    private final boolean __convertCRtoCRLF = true;
    private boolean __lastWasCR = false;

    public TelnetOutputStream(TelnetClient telnetClient) {
        this.__client = telnetClient;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.__client._closeOutputStream();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.__client._flushOutputStream();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        synchronized (this.__client) {
            int i11 = i10 & 255;
            if (this.__client._requestedWont(0)) {
                if (this.__lastWasCR) {
                    this.__client._sendByte(10);
                    if (i11 == 10) {
                        this.__lastWasCR = false;
                        return;
                    }
                }
                if (i11 == 10) {
                    if (!this.__lastWasCR) {
                        this.__client._sendByte(13);
                    }
                    this.__client._sendByte(i11);
                } else if (i11 == 13) {
                    this.__client._sendByte(13);
                    this.__lastWasCR = true;
                } else if (i11 != 255) {
                    this.__client._sendByte(i11);
                } else {
                    this.__client._sendByte(255);
                    this.__client._sendByte(255);
                }
                this.__lastWasCR = false;
            } else if (i11 == 255) {
                this.__client._sendByte(i11);
                this.__client._sendByte(255);
            } else {
                this.__client._sendByte(i11);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        synchronized (this.__client) {
            while (i11 > 0) {
                write(bArr[i10]);
                i10++;
                i11--;
            }
        }
    }
}
