package p444zd;

import td.C8695j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/f.class
 */
/* renamed from: zd.f */
/* loaded from: combined.jar:classes2.jar:zd/f.class */
public final class C10198f extends AbstractC10201i {
    @Override // p444zd.AbstractC10201i
    /* renamed from: c */
    public C10194b mo42701c(C10194b c10194b, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return mo42702d(c10194b, i10, i11, C10203k.m42713b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25));
    }

    @Override // p444zd.AbstractC10201i
    /* renamed from: d */
    public C10194b mo42702d(C10194b c10194b, int i10, int i11, C10203k c10203k) {
        if (i10 <= 0 || i11 <= 0) {
            throw C8695j.m37209a();
        }
        C10194b c10194b2 = new C10194b(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = i13;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10 + 0.5f;
            }
            c10203k.m42718f(fArr);
            AbstractC10201i.m42707a(c10194b, fArr);
            for (int i15 = 0; i15 < i12; i15 += 2) {
                try {
                    if (c10194b.m42672d((int) fArr[i15], (int) fArr[i15 + 1])) {
                        c10194b2.m42680m(i15 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw C8695j.m37209a();
                }
            }
        }
        return c10194b2;
    }
}
