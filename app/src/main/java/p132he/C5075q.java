package p132he;

import p444zd.C10193a;
import td.C8695j;
import td.EnumC8686a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/q.class
 */
/* renamed from: he.q */
/* loaded from: combined.jar:classes2.jar:he/q.class */
public final class C5075q extends AbstractC5074p {

    /* renamed from: j */
    public static final int[] f29188j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    public static final int[][] f29189k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    public final int[] f29190i = new int[4];

    /* renamed from: s */
    public static String m25352s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: t */
    public static void m25353t(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f29189k[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: h */
    public boolean mo25350h(String str) {
        return super.mo25350h(m25352s(str));
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: k */
    public int[] mo25351k(C10193a c10193a, int i10) {
        return AbstractC5074p.m25346n(c10193a, i10, true, f29188j);
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: l */
    public int mo25316l(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        int i10;
        int[] iArr2 = this.f29190i;
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
        m25353t(sb2, i10);
        return i11;
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: q */
    public EnumC8686a mo25317q() {
        return EnumC8686a.UPC_E;
    }
}
