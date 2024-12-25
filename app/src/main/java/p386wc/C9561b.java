package p386wc;

import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/b.class
 */
/* renamed from: wc.b */
/* loaded from: combined.jar:classes2.jar:wc/b.class */
public final class C9561b extends OutputStream {

    /* renamed from: b */
    public long f43548b = 0;

    /* renamed from: f */
    public long m40100f() {
        return this.f43548b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f43548b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f43548b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f43548b += i11;
    }
}
