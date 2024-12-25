package p132he;

import p444zd.C10193a;
import td.EnumC8686a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/f.class
 */
/* renamed from: he.f */
/* loaded from: combined.jar:classes2.jar:he/f.class */
public final class C5064f extends AbstractC5074p {

    /* renamed from: i */
    public final int[] f29159i = new int[4];

    @Override // p132he.AbstractC5074p
    /* renamed from: l */
    public int mo25316l(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29159i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m42664h = c10193a.m42664h();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < m42664h; i11++) {
            sb2.append((char) (AbstractC5074p.m25345j(c10193a, iArr2, i10, AbstractC5074p.f29183g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = AbstractC5074p.m25346n(c10193a, i10, true, AbstractC5074p.f29181e)[1];
        for (int i14 = 0; i14 < 4 && i13 < m42664h; i14++) {
            sb2.append((char) (AbstractC5074p.m25345j(c10193a, iArr2, i13, AbstractC5074p.f29183g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: q */
    public EnumC8686a mo25317q() {
        return EnumC8686a.EAN_8;
    }
}
