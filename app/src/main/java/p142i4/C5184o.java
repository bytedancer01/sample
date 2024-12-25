package p142i4;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/o.class
 */
/* renamed from: i4.o */
/* loaded from: combined.jar:classes1.jar:i4/o.class */
public class C5184o extends FilterInputStream {

    /* renamed from: b */
    public volatile byte[] f29587b;

    /* renamed from: c */
    public int f29588c;

    /* renamed from: d */
    public int f29589d;

    /* renamed from: e */
    public int f29590e;

    /* renamed from: f */
    public int f29591f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/o$a.class
     */
    /* renamed from: i4.o$a */
    /* loaded from: combined.jar:classes1.jar:i4/o$a.class */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public C5184o(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f29590e = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f29587b = bArr;
    }

    /* renamed from: o */
    public static IOException m25868o() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10;
        int i11;
        int available;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.f29587b == null || inputStream == null) {
                throw m25868o();
            }
            i10 = this.f29588c;
            i11 = this.f29591f;
            available = inputStream.available();
        }
        return (i10 - i11) + available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29587b = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: f */
    public final int m25869f(InputStream inputStream, byte[] bArr) {
        byte[] bArr2;
        int i10 = this.f29590e;
        if (i10 != -1) {
            int i11 = this.f29591f;
            int i12 = this.f29589d;
            if (i11 - i10 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f29588c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    if (Log.isLoggable("BufferedIs", 3)) {
                        Log.d("BufferedIs", "allocate buffer of length: " + i12);
                    }
                    bArr2 = new byte[i12];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f29587b = bArr2;
                } else {
                    bArr2 = bArr;
                    if (i10 > 0) {
                        System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                        bArr2 = bArr;
                    }
                }
                int i13 = this.f29591f - this.f29590e;
                this.f29591f = i13;
                this.f29590e = 0;
                this.f29588c = 0;
                int read = inputStream.read(bArr2, i13, bArr2.length - i13);
                int i14 = this.f29591f;
                if (read > 0) {
                    i14 += read;
                }
                this.f29588c = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f29590e = -1;
            this.f29591f = 0;
            this.f29588c = read2;
        }
        return read2;
    }

    /* renamed from: l */
    public void m25870l() {
        synchronized (this) {
            this.f29589d = this.f29587b.length;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        synchronized (this) {
            this.f29589d = Math.max(this.f29589d, i10);
            this.f29590e = this.f29591f;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        synchronized (this) {
            byte[] bArr = this.f29587b;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                throw m25868o();
            }
            if (this.f29591f >= this.f29588c && m25869f(inputStream, bArr) == -1) {
                return -1;
            }
            byte[] bArr2 = bArr;
            if (bArr != this.f29587b) {
                bArr2 = this.f29587b;
                if (bArr2 == null) {
                    throw m25868o();
                }
            }
            int i10 = this.f29588c;
            int i11 = this.f29591f;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f29591f = i11 + 1;
            return bArr2[i11] & 255;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2;
        int i14;
        synchronized (this) {
            byte[] bArr3 = this.f29587b;
            if (bArr3 == null) {
                throw m25868o();
            }
            if (i11 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw m25868o();
            }
            int i15 = this.f29591f;
            int i16 = this.f29588c;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i11 ? i11 : i16 - i15;
                System.arraycopy(bArr3, i15, bArr, i10, i17);
                this.f29591f += i17;
                if (i17 == i11 || inputStream.available() == 0) {
                    return i17;
                }
                int i18 = i10 + i17;
                i13 = i11 - i17;
                i12 = i18;
            } else {
                i12 = i10;
                i13 = i11;
            }
            while (true) {
                int i19 = -1;
                if (this.f29590e == -1 && i13 >= bArr3.length) {
                    int read = inputStream.read(bArr, i12, i13);
                    bArr2 = bArr3;
                    i14 = read;
                    if (read == -1) {
                        if (i13 != i11) {
                            i19 = i11 - i13;
                        }
                        return i19;
                    }
                } else {
                    if (m25869f(inputStream, bArr3) == -1) {
                        if (i13 != i11) {
                            i19 = i11 - i13;
                        }
                        return i19;
                    }
                    bArr2 = bArr3;
                    if (bArr3 != this.f29587b) {
                        bArr2 = this.f29587b;
                        if (bArr2 == null) {
                            throw m25868o();
                        }
                    }
                    int i20 = this.f29588c;
                    int i21 = this.f29591f;
                    int i22 = i20 - i21 >= i13 ? i13 : i20 - i21;
                    System.arraycopy(bArr2, i21, bArr, i12, i22);
                    this.f29591f += i22;
                    i14 = i22;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i13;
                }
                i12 += i14;
                bArr3 = bArr2;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        synchronized (this) {
            if (this.f29587b == null) {
                throw new IOException("Stream is closed");
            }
            int i10 = this.f29590e;
            if (-1 == i10) {
                throw new a("Mark has been invalidated");
            }
            this.f29591f = i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        synchronized (this) {
            byte[] bArr = this.f29587b;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null) {
                throw m25868o();
            }
            if (j10 < 1) {
                return 0L;
            }
            if (inputStream == null) {
                throw m25868o();
            }
            int i10 = this.f29588c;
            int i11 = this.f29591f;
            if (i10 - i11 >= j10) {
                this.f29591f = (int) (i11 + j10);
                return j10;
            }
            long j11 = i10 - i11;
            this.f29591f = i10;
            if (this.f29590e == -1 || j10 > this.f29589d) {
                return j11 + inputStream.skip(j10 - j11);
            }
            if (m25869f(inputStream, bArr) == -1) {
                return j11;
            }
            int i12 = this.f29588c;
            int i13 = this.f29591f;
            long j12 = i12 - i13;
            long j13 = j10 - j11;
            if (j12 >= j13) {
                this.f29591f = (int) (i13 + j13);
                return j10;
            }
            long j14 = i12;
            long j15 = i13;
            this.f29591f = i12;
            return (j11 + j14) - j15;
        }
    }
}
