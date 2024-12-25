package p132he;

import java.util.Arrays;
import java.util.Map;
import p444zd.C10193a;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/a.class
 */
/* renamed from: he.a */
/* loaded from: combined.jar:classes2.jar:he/a.class */
public final class C5059a extends AbstractC5069k {

    /* renamed from: d */
    public static final char[] f29140d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f29141e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f29142f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f29143a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f29144b = new int[80];

    /* renamed from: c */
    public int f29145c = 0;

    /* renamed from: h */
    public static boolean m25296h(char[] cArr, char c10) {
        if (cArr == null) {
            return false;
        }
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        int i11;
        Arrays.fill(this.f29144b, 0);
        m25300k(c10193a);
        int m25299j = m25299j();
        this.f29143a.setLength(0);
        int i12 = m25299j;
        do {
            int m25301l = m25301l(i12);
            if (m25301l == -1) {
                throw C8695j.m37209a();
            }
            this.f29143a.append((char) m25301l);
            i11 = i12 + 8;
            if (this.f29143a.length() > 1 && m25296h(f29142f, f29140d[m25301l])) {
                break;
            }
            i12 = i11;
        } while (i11 < this.f29145c);
        int i13 = i11 - 1;
        int i14 = this.f29144b[i13];
        int i15 = 0;
        for (int i16 = -8; i16 < -1; i16++) {
            i15 += this.f29144b[i11 + i16];
        }
        if (i11 < this.f29145c && i14 < i15 / 2) {
            throw C8695j.m37209a();
        }
        m25302m(m25299j);
        for (int i17 = 0; i17 < this.f29143a.length(); i17++) {
            StringBuilder sb2 = this.f29143a;
            sb2.setCharAt(i17, f29140d[sb2.charAt(i17)]);
        }
        char charAt = this.f29143a.charAt(0);
        char[] cArr = f29142f;
        if (!m25296h(cArr, charAt)) {
            throw C8695j.m37209a();
        }
        StringBuilder sb3 = this.f29143a;
        if (!m25296h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw C8695j.m37209a();
        }
        if (this.f29143a.length() <= 3) {
            throw C8695j.m37209a();
        }
        if (map == null || !map.containsKey(EnumC8690e.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f29143a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f29143a.deleteCharAt(0);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < m25299j; i19++) {
            i18 += this.f29144b[i19];
        }
        float f10 = i18;
        while (m25299j < i13) {
            i18 += this.f29144b[m25299j];
            m25299j++;
        }
        float f11 = i10;
        return new C8699n(this.f29143a.toString(), null, new C8701p[]{new C8701p(f10, f11), new C8701p(i18, f11)}, EnumC8686a.CODABAR);
    }

    /* renamed from: i */
    public final void m25298i(int i10) {
        int[] iArr = this.f29144b;
        int i11 = this.f29145c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f29145c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f29144b = iArr2;
        }
    }

    /* renamed from: j */
    public final int m25299j() {
        for (int i10 = 1; i10 < this.f29145c; i10 += 2) {
            int m25301l = m25301l(i10);
            if (m25301l != -1 && m25296h(f29142f, f29140d[m25301l])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f29144b[i12];
                }
                if (i10 == 1 || this.f29144b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: k */
    public final void m25300k(C10193a c10193a) {
        int i10 = 0;
        this.f29145c = 0;
        int m42663g = c10193a.m42663g(0);
        int m42664h = c10193a.m42664h();
        if (m42663g >= m42664h) {
            throw C8695j.m37209a();
        }
        boolean z10 = true;
        while (m42663g < m42664h) {
            if (c10193a.m42660c(m42663g) != z10) {
                i10++;
            } else {
                m25298i(i10);
                z10 = !z10;
                i10 = 1;
            }
            m42663g++;
        }
        m25298i(i10);
    }

    /* renamed from: l */
    public final int m25301l(int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = i10 + 7;
        if (i14 >= this.f29145c) {
            return -1;
        }
        int[] iArr = this.f29144b;
        int i15 = i10;
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        while (true) {
            i11 = i17;
            if (i15 >= i14) {
                break;
            }
            int i18 = iArr[i15];
            int i19 = i16;
            if (i18 < i16) {
                i19 = i18;
            }
            int i20 = i11;
            if (i18 > i11) {
                i20 = i18;
            }
            i15 += 2;
            i16 = i19;
            i17 = i20;
        }
        int i21 = (i16 + i11) / 2;
        int i22 = i10 + 1;
        int i23 = 0;
        int i24 = Integer.MAX_VALUE;
        while (i22 < i14) {
            int i25 = iArr[i22];
            int i26 = i24;
            if (i25 < i24) {
                i26 = i25;
            }
            int i27 = i23;
            if (i25 > i23) {
                i27 = i25;
            }
            i22 += 2;
            i24 = i26;
            i23 = i27;
        }
        int i28 = (i24 + i23) / 2;
        int i29 = 128;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i12 = i31;
            i13 = 0;
            if (i30 >= 7) {
                break;
            }
            i29 >>= 1;
            int i32 = i12;
            if (iArr[i10 + i30] > ((i30 & 1) == 0 ? i21 : i28)) {
                i32 = i12 | i29;
            }
            i30++;
            i31 = i32;
        }
        while (true) {
            int[] iArr2 = f29141e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i12) {
                return i13;
            }
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0169, code lost:
    
        throw td.C8695j.m37209a();
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25302m(int r8) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132he.C5059a.m25302m(int):void");
    }
}
