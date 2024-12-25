package ma;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/pf.class
 */
/* renamed from: ma.pf */
/* loaded from: combined.jar:classes2.jar:ma/pf.class */
public class C6336pf extends AbstractC6315of {

    /* renamed from: f */
    public final byte[] f33966f;

    public C6336pf(byte[] bArr) {
        bArr.getClass();
        this.f33966f = bArr;
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: a */
    public byte mo29848a(int i10) {
        return this.f33966f[i10];
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: b */
    public byte mo29849b(int i10) {
        return this.f33966f[i10];
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: d */
    public int mo29850d() {
        return this.f33966f.length;
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: e */
    public final int mo29963e(int i10, int i11, int i12) {
        return C6482wg.m30095b(i10, this.f33966f, 0, i12);
    }

    @Override // ma.AbstractC6399sf
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6399sf) || mo29850d() != ((AbstractC6399sf) obj).mo29850d()) {
            return false;
        }
        if (mo29850d() == 0) {
            return true;
        }
        if (!(obj instanceof C6336pf)) {
            return obj.equals(this);
        }
        C6336pf c6336pf = (C6336pf) obj;
        int m30021t = m30021t();
        int m30021t2 = c6336pf.m30021t();
        if (m30021t != 0 && m30021t2 != 0 && m30021t != m30021t2) {
            return false;
        }
        int mo29850d = mo29850d();
        if (mo29850d > c6336pf.mo29850d()) {
            throw new IllegalArgumentException("Length too large: " + mo29850d + mo29850d());
        }
        if (mo29850d > c6336pf.mo29850d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + mo29850d + ", " + c6336pf.mo29850d());
        }
        byte[] bArr = this.f33966f;
        byte[] bArr2 = c6336pf.f33966f;
        c6336pf.mo29851w();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i10 >= mo29850d) {
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

    @Override // ma.AbstractC6399sf
    /* renamed from: f */
    public final AbstractC6399sf mo29964f(int i10, int i11) {
        AbstractC6399sf.m30020q(0, i11, mo29850d());
        return i11 == 0 ? AbstractC6399sf.f34033c : new C6273mf(this.f33966f, 0, i11);
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: g */
    public final String mo29965g(Charset charset) {
        return new String(this.f33966f, 0, mo29850d(), charset);
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: h */
    public final void mo29966h(C6189if c6189if) {
        ((C6501xf) c6189if).m30120B(this.f33966f, 0, mo29850d());
    }

    @Override // ma.AbstractC6399sf
    /* renamed from: i */
    public final boolean mo29967i() {
        return C6277mj.m29859e(this.f33966f, 0, mo29850d());
    }

    /* renamed from: w */
    public int mo29851w() {
        return 0;
    }
}
