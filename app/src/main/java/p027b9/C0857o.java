package p027b9;

import java.io.InputStream;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/o.class
 */
/* renamed from: b9.o */
/* loaded from: combined.jar:classes2.jar:b9/o.class */
public final class C0857o extends InputStream {

    /* renamed from: b */
    public final InterfaceC0854m f5841b;

    /* renamed from: c */
    public final C0858p f5842c;

    /* renamed from: g */
    public long f5846g;

    /* renamed from: e */
    public boolean f5844e = false;

    /* renamed from: f */
    public boolean f5845f = false;

    /* renamed from: d */
    public final byte[] f5843d = new byte[1];

    public C0857o(InterfaceC0854m interfaceC0854m, C0858p c0858p) {
        this.f5841b = interfaceC0854m;
        this.f5842c = c0858p;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5845f) {
            return;
        }
        this.f5841b.close();
        this.f5845f = true;
    }

    /* renamed from: f */
    public final void m5374f() {
        if (this.f5844e) {
            return;
        }
        this.f5841b.mo521a(this.f5842c);
        this.f5844e = true;
    }

    /* renamed from: l */
    public void m5375l() {
        m5374f();
    }

    @Override // java.io.InputStream
    public int read() {
        int i10 = -1;
        if (read(this.f5843d) != -1) {
            i10 = this.f5843d[0] & 255;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        C4349a.m21884g(!this.f5845f);
        m5374f();
        int read = this.f5841b.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f5846g += read;
        return read;
    }
}
