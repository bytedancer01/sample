package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/e5.class
 */
/* renamed from: ra.e5 */
/* loaded from: combined.jar:classes2.jar:ra/e5.class */
public final class C8125e5 extends C8200j5 {

    /* renamed from: g */
    public final int f39053g;

    public C8125e5(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC8230l5.m35568A(0, i11, bArr.length);
        this.f39053g = i11;
    }

    @Override // p305ra.C8200j5
    /* renamed from: B */
    public final int mo35261B() {
        return 0;
    }

    @Override // p305ra.C8200j5, p305ra.AbstractC8230l5
    /* renamed from: a */
    public final byte mo35262a(int i10) {
        int i11 = this.f39053g;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f39133f[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // p305ra.C8200j5, p305ra.AbstractC8230l5
    /* renamed from: b */
    public final byte mo35263b(int i10) {
        return this.f39133f[i10];
    }

    @Override // p305ra.C8200j5, p305ra.AbstractC8230l5
    /* renamed from: d */
    public final int mo35264d() {
        return this.f39053g;
    }
}
