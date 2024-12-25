package p132he;

import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.joda.time.DateTimeConstants;
import p444zd.C10193a;
import td.C8689d;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/c.class
 */
/* renamed from: he.c */
/* loaded from: combined.jar:classes2.jar:he/c.class */
public final class C5061c extends AbstractC5069k {

    /* renamed from: e */
    public static final int[] f29147e = {52, 289, 97, 352, 49, HttpStatus.SC_NOT_MODIFIED, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, DateTimeConstants.HOURS_PER_WEEK, 162, 138, 42};

    /* renamed from: a */
    public final boolean f29148a;

    /* renamed from: b */
    public final boolean f29149b;

    /* renamed from: c */
    public final StringBuilder f29150c;

    /* renamed from: d */
    public final int[] f29151d;

    public C5061c() {
        this(false);
    }

    public C5061c(boolean z10) {
        this(z10, false);
    }

    public C5061c(boolean z10, boolean z11) {
        this.f29148a = z10;
        this.f29149b = z11;
        this.f29150c = new StringBuilder(20);
        this.f29151d = new int[9];
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        throw td.C8691f.m37197a();
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m25305h(java.lang.CharSequence r4) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132he.C5061c.m25305h(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: i */
    public static int[] m25306i(C10193a c10193a, int[] iArr) {
        int m42664h = c10193a.m42664h();
        int m42662e = c10193a.m42662e(0);
        int length = iArr.length;
        int i10 = m42662e;
        boolean z10 = false;
        int i11 = 0;
        while (m42662e < m42664h) {
            if (c10193a.m42660c(m42662e) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (m25308k(iArr) == 148 && c10193a.m42665i(Math.max(0, i10 - ((m42662e - i10) / 2)), i10, false)) {
                        return new int[]{i10, m42662e};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            m42662e++;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: j */
    public static char m25307j(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f29147e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw C8695j.m37209a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    /* renamed from: k */
    public static int m25308k(int[] iArr) {
        int i10;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = Integer.MAX_VALUE;
            int length2 = iArr.length;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = iArr[i14];
                int i16 = i13;
                if (i15 < i13) {
                    i16 = i13;
                    if (i15 > i12) {
                        i16 = i15;
                    }
                }
                i14++;
                i13 = i16;
            }
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                i10 = i20;
                if (i17 >= length) {
                    break;
                }
                int i21 = iArr[i17];
                int i22 = i18;
                int i23 = i19;
                int i24 = i10;
                if (i21 > i13) {
                    i23 = i19 | (1 << ((length - 1) - i17));
                    i22 = i18 + 1;
                    i24 = i10 + i21;
                }
                i17++;
                i18 = i22;
                i19 = i23;
                i20 = i24;
            }
            if (i18 == 3) {
                int i25 = 0;
                while (i25 < length && i18 > 0) {
                    int i26 = iArr[i25];
                    int i27 = i18;
                    if (i26 > i13) {
                        i27 = i18 - 1;
                        if ((i26 << 1) >= i10) {
                            return -1;
                        }
                    }
                    i25++;
                    i18 = i27;
                }
                return i19;
            }
            if (i18 <= 3) {
                return -1;
            }
            i11 = i13;
        }
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        int[] iArr = this.f29151d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f29150c;
        sb2.setLength(0);
        int m42662e = c10193a.m42662e(m25306i(c10193a, iArr)[1]);
        int m42664h = c10193a.m42664h();
        while (true) {
            AbstractC5069k.m25329f(c10193a, m42662e, iArr);
            int m25308k = m25308k(iArr);
            if (m25308k < 0) {
                throw C8695j.m37209a();
            }
            char m25307j = m25307j(m25308k);
            sb2.append(m25307j);
            int i11 = m42662e;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m42662e2 = c10193a.m42662e(i11);
            if (m25307j == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (m42662e2 != m42664h && (((m42662e2 - m42662e) - i13) << 1) < i13) {
                    throw C8695j.m37209a();
                }
                if (this.f29148a) {
                    int length = sb2.length() - 1;
                    int i15 = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        i15 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f29150c.charAt(i16));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i15 % 43)) {
                        throw C8689d.m37196a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw C8695j.m37209a();
                }
                String m25305h = this.f29149b ? m25305h(sb2) : sb2.toString();
                float f10 = (r0[1] + r0[0]) / 2.0f;
                float f11 = i10;
                return new C8699n(m25305h, null, new C8701p[]{new C8701p(f10, f11), new C8701p(m42662e + (i13 / 2.0f), f11)}, EnumC8686a.CODE_39);
            }
            m42662e = m42662e2;
        }
    }
}
