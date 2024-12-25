package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/BaseNCodecInputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/BaseNCodecInputStream.class */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z10) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.doEncode = z10;
        this.baseNCodec = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return !this.context.eof ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int read = read(this.singleByte, 0, 1);
        while (true) {
            i10 = read;
            if (i10 != 0) {
                break;
            }
            read = read(this.singleByte, 0, 1);
        }
        if (i10 <= 0) {
            return -1;
        }
        byte b10 = this.singleByte[0];
        byte b11 = b10;
        if (b10 < 0) {
            b11 = b10 + 256;
        }
        return b11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 > bArr.length || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 != 0) {
                return i13;
            }
            if (!this.baseNCodec.hasData(this.context)) {
                byte[] bArr2 = new byte[this.doEncode ? 4096 : 8192];
                int read = ((FilterInputStream) this).in.read(bArr2);
                if (this.doEncode) {
                    this.baseNCodec.encode(bArr2, 0, read, this.context);
                } else {
                    this.baseNCodec.decode(bArr2, 0, read, this.context);
                }
            }
            i12 = this.baseNCodec.readResults(bArr, i10, i11, this.context);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        synchronized (this) {
            throw new IOException("mark/reset not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long j11;
        int read;
        if (j10 < 0) {
            throw new IllegalArgumentException("Negative skip length: " + j10);
        }
        byte[] bArr = new byte[512];
        long j12 = j10;
        while (true) {
            j11 = j12;
            if (j11 <= 0 || (read = read(bArr, 0, (int) Math.min(512, j11))) == -1) {
                break;
            }
            j12 = j11 - read;
        }
        return j10 - j11;
    }
}
