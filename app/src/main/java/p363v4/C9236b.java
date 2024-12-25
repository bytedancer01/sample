package p363v4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/b.class
 */
/* renamed from: v4.b */
/* loaded from: combined.jar:classes1.jar:v4/b.class */
public final class C9236b extends FilterInputStream {

    /* renamed from: b */
    public final long f42223b;

    /* renamed from: c */
    public int f42224c;

    public C9236b(InputStream inputStream, long j10) {
        super(inputStream);
        this.f42223b = j10;
    }

    /* renamed from: l */
    public static InputStream m38945l(InputStream inputStream, long j10) {
        return new C9236b(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int max;
        synchronized (this) {
            max = (int) Math.max(this.f42223b - this.f42224c, ((FilterInputStream) this).in.available());
        }
        return max;
    }

    /* renamed from: f */
    public final int m38946f(int i10) {
        if (i10 >= 0) {
            this.f42224c += i10;
        } else if (this.f42223b - this.f42224c > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f42223b + ", but read: " + this.f42224c);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int m38946f;
        synchronized (this) {
            m38946f = m38946f(super.read());
        }
        return m38946f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int m38946f;
        synchronized (this) {
            m38946f = m38946f(super.read(bArr, i10, i11));
        }
        return m38946f;
    }
}
