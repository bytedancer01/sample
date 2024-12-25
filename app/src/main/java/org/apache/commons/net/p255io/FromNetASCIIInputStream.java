package org.apache.commons.net.p255io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/FromNetASCIIInputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/FromNetASCIIInputStream.class */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    public static final String _lineSeparator;
    public static final byte[] _lineSeparatorBytes;
    public static final boolean _noConversionRequired;
    private int __length;

    static {
        String property = System.getProperty("line.separator");
        _lineSeparator = property;
        _noConversionRequired = property.equals(SocketClient.NETASCII_EOL);
        try {
            _lineSeparatorBytes = property.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Broken JVM - cannot find US-ASCII charset!", e10);
        }
    }

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, _lineSeparatorBytes.length + 1);
        this.__length = 0;
    }

    private int __read() {
        int read = super.read();
        int i10 = read;
        if (read == 13) {
            int read2 = super.read();
            if (read2 != 10) {
                if (read2 == -1) {
                    return 13;
                }
                unread(read2);
                return 13;
            }
            unread(_lineSeparatorBytes);
            i10 = super.read();
            this.__length--;
        }
        return i10;
    }

    public static final boolean isConversionRequired() {
        return !_noConversionRequired;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((PushbackInputStream) this).in != null) {
            return (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos) + ((PushbackInputStream) this).in.available();
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return _noConversionRequired ? super.read() : __read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (_noConversionRequired) {
            return super.read(bArr, i10, i11);
        }
        if (i11 < 1) {
            return 0;
        }
        int available = available();
        int i13 = i11;
        if (i11 > available) {
            i13 = available;
        }
        this.__length = i13;
        if (i13 < 1) {
            this.__length = 1;
        }
        int __read = __read();
        if (__read == -1) {
            return -1;
        }
        int i14 = i10;
        while (true) {
            int i15 = i14;
            i12 = i15 + 1;
            bArr[i15] = (byte) __read;
            int i16 = this.__length - 1;
            this.__length = i16;
            if (i16 <= 0) {
                break;
            }
            __read = __read();
            if (__read == -1) {
                break;
            }
            i14 = i12;
        }
        return i12 - i10;
    }
}
