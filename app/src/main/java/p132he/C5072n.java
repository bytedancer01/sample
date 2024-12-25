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
  classes2.jar:he/n.class
 */
/* renamed from: he.n */
/* loaded from: combined.jar:classes2.jar:he/n.class */
public final class C5072n {

    /* renamed from: c */
    public static final int[] f29174c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final int[] f29175a = new int[4];

    /* renamed from: b */
    public final StringBuilder f29176b = new StringBuilder();

    /* renamed from: c */
    public static int m25337c(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f29174c[i11]) {
                return i11;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: d */
    public static int m25338d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r3.equals("90000") == false) goto L11;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m25339e(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132he.C5072n.m25339e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static Map<EnumC8700o, Object> m25340f(String str) {
        String m25339e;
        if (str.length() != 5 || (m25339e = m25339e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC8700o.class);
        enumMap.put((EnumMap) EnumC8700o.SUGGESTED_PRICE, (EnumC8700o) m25339e);
        return enumMap;
    }

    /* renamed from: a */
    public final int m25341a(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29175a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m42664h = c10193a.m42664h();
        int i10 = iArr[1];
        int i11 = 0;
        int i12 = 0;
        while (i11 < 5 && i10 < m42664h) {
            int m25345j = AbstractC5074p.m25345j(c10193a, iArr2, i10, AbstractC5074p.f29184h);
            sb2.append((char) ((m25345j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            int i14 = i12;
            if (m25345j >= 10) {
                i14 = i12 | (1 << (4 - i11));
            }
            int i15 = i10;
            if (i11 != 4) {
                i15 = c10193a.m42663g(c10193a.m42662e(i10));
            }
            i11++;
            i12 = i14;
            i10 = i15;
        }
        if (sb2.length() != 5) {
            throw C8695j.m37209a();
        }
        if (m25338d(sb2.toString()) == m25337c(i12)) {
            return i10;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: b */
    public C8699n m25342b(int i10, C10193a c10193a, int[] iArr) {
        StringBuilder sb2 = this.f29176b;
        sb2.setLength(0);
        int m25341a = m25341a(c10193a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC8700o, Object> m25340f = m25340f(sb3);
        float f10 = i10;
        C8699n c8699n = new C8699n(sb3, null, new C8701p[]{new C8701p((iArr[0] + iArr[1]) / 2.0f, f10), new C8701p(m25341a, f10)}, EnumC8686a.UPC_EAN_EXTENSION);
        if (m25340f != null) {
            c8699n.m37217g(m25340f);
        }
        return c8699n;
    }
}
