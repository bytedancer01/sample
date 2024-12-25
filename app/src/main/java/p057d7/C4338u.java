package p057d7;

import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/u.class
 */
/* renamed from: d7.u */
/* loaded from: combined.jar:classes2.jar:d7/u.class */
public final class C4338u {

    /* renamed from: a */
    public final byte[] f26499a;

    /* renamed from: b */
    public final int f26500b;

    /* renamed from: c */
    public int f26501c;

    /* renamed from: d */
    public int f26502d;

    public C4338u(byte[] bArr) {
        this.f26499a = bArr;
        this.f26500b = bArr.length;
    }

    /* renamed from: a */
    public final void m21843a() {
        int i10;
        int i11 = this.f26501c;
        C4349a.m21884g(i11 >= 0 && (i11 < (i10 = this.f26500b) || (i11 == i10 && this.f26502d == 0)));
    }

    /* renamed from: b */
    public int m21844b() {
        return (this.f26501c * 8) + this.f26502d;
    }

    /* renamed from: c */
    public boolean m21845c() {
        boolean z10 = (((this.f26499a[this.f26501c] & 255) >> this.f26502d) & 1) == 1;
        m21847e(1);
        return z10;
    }

    /* renamed from: d */
    public int m21846d(int i10) {
        int i11 = this.f26501c;
        int min = Math.min(i10, 8 - this.f26502d);
        int i12 = i11 + 1;
        int i13 = ((this.f26499a[i11] & 255) >> this.f26502d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f26499a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        m21847e(i10);
        return i13 & ((-1) >>> (32 - i10));
    }

    /* renamed from: e */
    public void m21847e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f26501c + i11;
        this.f26501c = i12;
        int i13 = this.f26502d + (i10 - (i11 * 8));
        this.f26502d = i13;
        if (i13 > 7) {
            this.f26501c = i12 + 1;
            this.f26502d = i13 - 8;
        }
        m21843a();
    }
}
