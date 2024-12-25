package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/mf.class
 */
/* renamed from: ma.mf */
/* loaded from: combined.jar:classes2.jar:ma/mf.class */
public final class C6273mf extends C6336pf {

    /* renamed from: g */
    public final int f33891g;

    public C6273mf(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC6399sf.m30020q(0, i11, bArr.length);
        this.f33891g = i11;
    }

    @Override // ma.C6336pf, ma.AbstractC6399sf
    /* renamed from: a */
    public final byte mo29848a(int i10) {
        int i11 = this.f33891g;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f33966f[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // ma.C6336pf, ma.AbstractC6399sf
    /* renamed from: b */
    public final byte mo29849b(int i10) {
        return this.f33966f[i10];
    }

    @Override // ma.C6336pf, ma.AbstractC6399sf
    /* renamed from: d */
    public final int mo29850d() {
        return this.f33891g;
    }

    @Override // ma.C6336pf
    /* renamed from: w */
    public final int mo29851w() {
        return 0;
    }
}
