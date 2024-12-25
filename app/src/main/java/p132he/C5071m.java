package p132he;

import java.util.EnumMap;
import java.util.Map;
import p444zd.C10193a;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8700o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/m.class
 */
/* renamed from: he.m */
/* loaded from: combined.jar:classes2.jar:he/m.class */
public final class C5071m {

    /* renamed from: a */
    public final int[] f29172a = new int[4];

    /* renamed from: b */
    public final StringBuilder f29173b = new StringBuilder();

    /* renamed from: c */
    public static Map<EnumC8700o, Object> m25334c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC8700o.class);
        enumMap.put((EnumMap) EnumC8700o.ISSUE_NUMBER, (EnumC8700o) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int m25335a(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29172a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m42664h = c10193a.m42664h();
        int i10 = iArr[1];
        int i11 = 0;
        int i12 = 0;
        while (i11 < 2 && i10 < m42664h) {
            int m25345j = AbstractC5074p.m25345j(c10193a, iArr2, i10, AbstractC5074p.f29184h);
            sb2.append((char) ((m25345j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            int i14 = i12;
            if (m25345j >= 10) {
                i14 = i12 | (1 << (1 - i11));
            }
            int i15 = i10;
            if (i11 != 1) {
                i15 = c10193a.m42663g(c10193a.m42662e(i10));
            }
            i11++;
            i12 = i14;
            i10 = i15;
        }
        if (sb2.length() != 2) {
            throw C8695j.m37209a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i12) {
            return i10;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: b */
    public C8699n m25336b(int i10, C10193a c10193a, int[] iArr) {
        StringBuilder sb2 = this.f29173b;
        sb2.setLength(0);
        int m25335a = m25335a(c10193a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC8700o, Object> m25334c = m25334c(sb3);
        float f10 = i10;
        C8699n c8699n = new C8699n(sb3, null, new C8701p[]{new C8701p((iArr[0] + iArr[1]) / 2.0f, f10), new C8701p(m25335a, f10)}, EnumC8686a.UPC_EAN_EXTENSION);
        if (m25334c != null) {
            c8699n.m37217g(m25334c);
        }
        return c8699n;
    }
}
