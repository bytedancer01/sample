package p305ra;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j5.class
 */
/* renamed from: ra.j5 */
/* loaded from: combined.jar:classes2.jar:ra/j5.class */
public class C8200j5 extends AbstractC8185i5 {

    /* renamed from: f */
    public final byte[] f39133f;

    public C8200j5(byte[] bArr) {
        bArr.getClass();
        this.f39133f = bArr;
    }

    /* renamed from: B */
    public int mo35261B() {
        return 0;
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: a */
    public byte mo35262a(int i10) {
        return this.f39133f[i10];
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: b */
    public byte mo35263b(int i10) {
        return this.f39133f[i10];
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: d */
    public int mo35264d() {
        return this.f39133f.length;
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: e */
    public final AbstractC8230l5 mo35510e(int i10, int i11) {
        int m35568A = AbstractC8230l5.m35568A(0, i11, mo35264d());
        return m35568A == 0 ? AbstractC8230l5.f39165c : new C8125e5(this.f39133f, 0, m35568A);
    }

    @Override // p305ra.AbstractC8230l5
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8230l5) || mo35264d() != ((AbstractC8230l5) obj).mo35264d()) {
            return false;
        }
        if (mo35264d() == 0) {
            return true;
        }
        if (!(obj instanceof C8200j5)) {
            return obj.equals(this);
        }
        C8200j5 c8200j5 = (C8200j5) obj;
        int m35573y = m35573y();
        int m35573y2 = c8200j5.m35573y();
        if (m35573y != 0 && m35573y2 != 0 && m35573y != m35573y2) {
            return false;
        }
        int mo35264d = mo35264d();
        if (mo35264d > c8200j5.mo35264d()) {
            int mo35264d2 = mo35264d();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(mo35264d);
            sb2.append(mo35264d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (mo35264d > c8200j5.mo35264d()) {
            int mo35264d3 = c8200j5.mo35264d();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(0);
            sb3.append(", ");
            sb3.append(mo35264d);
            sb3.append(", ");
            sb3.append(mo35264d3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f39133f;
        byte[] bArr2 = c8200j5.f39133f;
        c8200j5.mo35261B();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i10 >= mo35264d) {
                break;
            }
            if (bArr[i10] != bArr2[i11]) {
                z10 = false;
                break;
            }
            i10++;
            i11++;
        }
        return z10;
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: f */
    public final void mo35511f(C8439z4 c8439z4) {
        ((C8305q5) c8439z4).m35713G(this.f39133f, 0, mo35264d());
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: g */
    public final String mo35512g(Charset charset) {
        return new String(this.f39133f, 0, mo35264d(), charset);
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: i */
    public final boolean mo35513i() {
        return C8189i9.m35456b(this.f39133f, 0, mo35264d());
    }

    @Override // p305ra.AbstractC8230l5
    /* renamed from: q */
    public final int mo35514q(int i10, int i11, int i12) {
        return C8366u6.m35909h(i10, this.f39133f, 0, i12);
    }
}
