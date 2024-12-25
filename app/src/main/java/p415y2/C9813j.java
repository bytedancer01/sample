package p415y2;

import java.io.ByteArrayOutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/j.class
 */
/* renamed from: y2.j */
/* loaded from: combined.jar:classes1.jar:y2/j.class */
public class C9813j extends ByteArrayOutputStream {

    /* renamed from: b */
    public final C9806c f45141b;

    public C9813j(C9806c c9806c, int i10) {
        this.f45141b = c9806c;
        ((ByteArrayOutputStream) this).buf = c9806c.m41293a(Math.max(i10, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45141b.m41294b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    /* renamed from: f */
    public final void m41344f(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m41293a = this.f45141b.m41293a((i11 + i10) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m41293a, 0, ((ByteArrayOutputStream) this).count);
        this.f45141b.m41294b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m41293a;
    }

    public void finalize() {
        this.f45141b.m41294b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i10) {
        synchronized (this) {
            m41344f(1);
            super.write(i10);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            m41344f(i11);
            super.write(bArr, i10, i11);
        }
    }
}
