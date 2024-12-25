package p132he;

import p444zd.C10193a;
import td.C8695j;
import td.EnumC8686a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/e.class
 */
/* renamed from: he.e */
/* loaded from: combined.jar:classes2.jar:he/e.class */
public final class C5063e extends AbstractC5074p {

    /* renamed from: j */
    public static final int[] f29157j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    public final int[] f29158i = new int[4];

    /* renamed from: s */
    public static void m25315s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f29157j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: l */
    public int mo25316l(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        int i10;
        int[] iArr2 = this.f29158i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m42664h = c10193a.m42664h();
        int i11 = iArr[1];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = i13;
            if (i12 >= 6 || i11 >= m42664h) {
                break;
            }
            int m25345j = AbstractC5074p.m25345j(c10193a, iArr2, i11, AbstractC5074p.f29184h);
            sb2.append((char) ((m25345j % 10) + 48));
            for (int i14 : iArr2) {
                i11 += i14;
            }
            int i15 = i10;
            if (m25345j >= 10) {
                i15 = i10 | (1 << (5 - i12));
            }
            i12++;
            i13 = i15;
        }
        m25315s(sb2, i10);
        int i16 = AbstractC5074p.m25346n(c10193a, i11, true, AbstractC5074p.f29181e)[1];
        for (int i17 = 0; i17 < 6 && i16 < m42664h; i17++) {
            sb2.append((char) (AbstractC5074p.m25345j(c10193a, iArr2, i16, AbstractC5074p.f29183g) + 48));
            for (int i18 : iArr2) {
                i16 += i18;
            }
        }
        return i16;
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: q */
    public EnumC8686a mo25317q() {
        return EnumC8686a.EAN_13;
    }
}
