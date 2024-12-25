package me;

import ae.C0156a;
import java.util.ArrayList;
import ne.C6779a;
import p202le.C5844a;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8689d;
import td.C8691f;
import td.C8695j;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/j.class
 */
/* renamed from: me.j */
/* loaded from: combined.jar:classes2.jar:me/j.class */
public final class C6582j {

    /* renamed from: a */
    public static final C6779a f34432a = new C6779a();

    /* renamed from: a */
    public static C6575c m30409a(C6580h c6580h) {
        int[] m30400j;
        int i10;
        int i11;
        if (c6580h == null || (m30400j = c6580h.m30400j()) == null) {
            return null;
        }
        int m30424p = m30424p(m30400j);
        int length = m30400j.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = i13;
            if (i12 >= length) {
                break;
            }
            int i14 = m30400j[i12];
            i13 += m30424p - i14;
            i10 = i13;
            if (i14 > 0) {
                break;
            }
            i12++;
        }
        C6576d[] m30394d = c6580h.m30394d();
        int i15 = i10;
        for (int i16 = 0; i15 > 0 && m30394d[i16] == null; i16++) {
            i15--;
        }
        int length2 = m30400j.length - 1;
        int i17 = 0;
        while (true) {
            i11 = i17;
            if (length2 < 0) {
                break;
            }
            int i18 = m30400j[length2];
            i17 += m30424p - i18;
            i11 = i17;
            if (i18 > 0) {
                break;
            }
            length2--;
        }
        for (int length3 = m30394d.length - 1; i11 > 0 && m30394d[length3] == null; length3--) {
            i11--;
        }
        return c6580h.m30391a().m30348a(i15, i11, c6580h.m30401k());
    }

    /* renamed from: b */
    public static void m30410b(C6578f c6578f, C6574b[][] c6574bArr) {
        C6574b c6574b = c6574bArr[0][1];
        int[] m30345a = c6574b.m30345a();
        int m30383j = (c6578f.m30383j() * c6578f.m30385l()) - m30426r(c6578f.m30384k());
        if (m30345a.length == 0) {
            if (m30383j <= 0 || m30383j > 928) {
                throw C8695j.m37209a();
            }
            c6574b.m30346b(m30383j);
            return;
        }
        if (m30345a[0] == m30383j || m30383j <= 0 || m30383j > 928) {
            return;
        }
        c6574b.m30346b(m30383j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m30411c(p444zd.C10194b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            r0 = r8
            if (r0 == 0) goto La
            r0 = -1
            r11 = r0
            goto Ld
        La:
            r0 = 1
            r11 = r0
        Ld:
            r0 = 0
            r12 = r0
            r0 = r9
            r13 = r0
        L14:
            r0 = r12
            r1 = 2
            if (r0 >= r1) goto L61
        L1a:
            r0 = r8
            if (r0 == 0) goto L27
            r0 = r13
            r1 = r6
            if (r0 < r1) goto L52
            goto L2d
        L27:
            r0 = r13
            r1 = r7
            if (r0 >= r1) goto L52
        L2d:
            r0 = r8
            r1 = r5
            r2 = r13
            r3 = r10
            boolean r1 = r1.m42672d(r2, r3)
            if (r0 != r1) goto L52
            r0 = r9
            r1 = r13
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 2
            if (r0 <= r1) goto L48
            r0 = r9
            return r0
        L48:
            r0 = r13
            r1 = r11
            int r0 = r0 + r1
            r13 = r0
            goto L1a
        L52:
            r0 = r11
            int r0 = -r0
            r11 = r0
            r0 = r8
            r1 = 1
            r0 = r0 ^ r1
            r8 = r0
            int r12 = r12 + 1
            goto L14
        L61:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6582j.m30411c(zd.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    public static boolean m30412d(int i10, int i11, int i12) {
        return i11 - 2 <= i10 && i10 <= i12 + 2;
    }

    /* renamed from: e */
    public static int m30413e(int[] iArr, int[] iArr2, int i10) {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f34432a.m31215a(iArr, i10, iArr2);
        }
        throw C8689d.m37196a();
    }

    /* renamed from: f */
    public static C6574b[][] m30414f(C6578f c6578f) {
        int m30359c;
        C6574b[][] c6574bArr = new C6574b[c6578f.m30385l()][c6578f.m30383j() + 2];
        for (C6574b[] c6574bArr2 : c6574bArr) {
            int i10 = 0;
            while (true) {
                if (i10 < c6574bArr2.length) {
                    c6574bArr2[i10] = new C6574b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (C6579g c6579g : c6578f.m30388o()) {
            if (c6579g != null) {
                for (C6576d c6576d : c6579g.m30394d()) {
                    if (c6576d != null && (m30359c = c6576d.m30359c()) >= 0 && m30359c < c6574bArr.length) {
                        c6574bArr[m30359c][i11].m30346b(c6576d.m30361e());
                    }
                }
            }
            i11++;
        }
        return c6574bArr;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [int[], int[][]] */
    /* renamed from: g */
    public static C10197e m30415g(C6578f c6578f) {
        C6574b[][] m30414f = m30414f(c6578f);
        m30410b(c6578f, m30414f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c6578f.m30385l() * c6578f.m30383j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < c6578f.m30385l(); i10++) {
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < c6578f.m30383j()) {
                    C6574b[] c6574bArr = m30414f[i10];
                    int i13 = i12 + 1;
                    int[] m30345a = c6574bArr[i13].m30345a();
                    int m30383j = (c6578f.m30383j() * i10) + i12;
                    if (m30345a.length == 0) {
                        arrayList.add(Integer.valueOf(m30383j));
                    } else if (m30345a.length == 1) {
                        iArr[m30383j] = m30345a[0];
                    } else {
                        arrayList3.add(Integer.valueOf(m30383j));
                        arrayList2.add(m30345a);
                    }
                    i11 = i13;
                }
            }
        }
        int size = arrayList2.size();
        ?? r02 = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            r02[i14] = (int[]) arrayList2.get(i14);
        }
        return m30416h(c6578f.m30384k(), iArr, C5844a.m28430b(arrayList), C5844a.m28430b(arrayList3), r02);
    }

    /* renamed from: h */
    public static C10197e m30416h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        for (int i11 = 100; i11 > 0; i11--) {
            for (int i12 = 0; i12 < length; i12++) {
                iArr[iArr3[i12]] = iArr4[i12][iArr5[i12]];
            }
            try {
                return m30418j(iArr, i10, iArr2);
            } catch (C8689d e10) {
                if (length == 0) {
                    throw C8689d.m37196a();
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    int i14 = iArr5[i13];
                    if (i14 < iArr4[i13].length - 1) {
                        iArr5[i13] = i14 + 1;
                        break;
                    }
                    iArr5[i13] = 0;
                    if (i13 == length - 1) {
                        throw C8689d.m37196a();
                    }
                    i13++;
                }
            }
        }
        throw C8689d.m37196a();
    }

    /* renamed from: i */
    public static C10197e m30417i(C10194b c10194b, C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4, int i10, int i11) {
        C6578f m30430v;
        C6579g c6580h;
        C6575c c6575c = new C6575c(c10194b, c8701p, c8701p2, c8701p3, c8701p4);
        C6580h c6580h2 = null;
        C6580h c6580h3 = null;
        boolean z10 = true;
        while (true) {
            boolean z11 = z10;
            if (c8701p != null) {
                c6580h2 = m30427s(c10194b, c6575c, c8701p, true, i10, i11);
            }
            if (c8701p3 != null) {
                c6580h3 = m30427s(c10194b, c6575c, c8701p3, false, i10, i11);
            }
            m30430v = m30430v(c6580h2, c6580h3);
            if (m30430v == null) {
                throw C8695j.m37209a();
            }
            C6575c m30386m = m30430v.m30386m();
            if (!z11 || m30386m == null || (m30386m.m30354g() >= c6575c.m30354g() && m30386m.m30352e() <= c6575c.m30352e())) {
                break;
            }
            c6575c = m30386m;
            z10 = false;
        }
        m30430v.m30389p(c6575c);
        int m30383j = m30430v.m30383j() + 1;
        m30430v.m30390q(0, c6580h2);
        m30430v.m30390q(m30383j, c6580h3);
        boolean z12 = c6580h2 != null;
        int i12 = i11;
        int i13 = 1;
        int i14 = i10;
        while (i13 <= m30383j) {
            int i15 = z12 ? i13 : m30383j - i13;
            int i16 = i14;
            int i17 = i12;
            if (m30430v.m30387n(i15) == null) {
                if (i15 == 0 || i15 == m30383j) {
                    c6580h = new C6580h(c6575c, i15 == 0);
                } else {
                    c6580h = new C6579g(c6575c);
                }
                m30430v.m30390q(i15, c6580h);
                int m30354g = c6575c.m30354g();
                int i18 = -1;
                while (true) {
                    i16 = i14;
                    i17 = i12;
                    if (m30354g <= c6575c.m30352e()) {
                        int m30428t = m30428t(m30430v, i15, m30354g, z12);
                        if (m30428t < 0 || m30428t > c6575c.m30351d()) {
                            if (i18 != -1) {
                                m30428t = i18;
                            } else {
                                m30354g++;
                            }
                        }
                        C6576d m30419k = m30419k(c10194b, c6575c.m30353f(), c6575c.m30351d(), z12, m30428t, m30354g, i14, i12);
                        if (m30419k != null) {
                            c6580h.m30396f(m30354g, m30419k);
                            i14 = Math.min(i14, m30419k.m30362f());
                            i12 = Math.max(i12, m30419k.m30362f());
                            i18 = m30428t;
                        }
                        m30354g++;
                    }
                }
            }
            i13++;
            i14 = i16;
            i12 = i17;
        }
        return m30415g(m30430v);
    }

    /* renamed from: j */
    public static C10197e m30418j(int[] iArr, int i10, int[] iArr2) {
        if (iArr.length == 0) {
            throw C8691f.m37197a();
        }
        int i11 = 1 << (i10 + 1);
        int m30413e = m30413e(iArr, iArr2, i11);
        m30431w(iArr, i11);
        C10197e m30368b = C6577e.m30368b(iArr, String.valueOf(i10));
        m30368b.m42698k(Integer.valueOf(m30413e));
        m30368b.m42697j(Integer.valueOf(iArr2.length));
        return m30368b;
    }

    /* renamed from: k */
    public static C6576d m30419k(C10194b c10194b, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int m30407d;
        int m28429a;
        int m30411c = m30411c(c10194b, i10, i11, z10, i12, i13);
        int[] m30425q = m30425q(c10194b, i10, i11, z10, m30411c, i13);
        if (m30425q == null) {
            return null;
        }
        int m678d = C0156a.m678d(m30425q);
        if (z10) {
            i16 = m30411c + m678d;
        } else {
            for (int i17 = 0; i17 < m30425q.length / 2; i17++) {
                int i18 = m30425q[i17];
                m30425q[i17] = m30425q[(m30425q.length - 1) - i17];
                m30425q[(m30425q.length - 1) - i17] = i18;
            }
            i16 = m30411c;
            m30411c -= m678d;
        }
        if (m30412d(m678d, i14, i15) && (m28429a = C5844a.m28429a((m30407d = C6581i.m30407d(m30425q)))) != -1) {
            return new C6576d(m30411c, i16, m30422n(m30407d), m28429a);
        }
        return null;
    }

    /* renamed from: l */
    public static C6573a m30420l(C6580h c6580h, C6580h c6580h2) {
        C6573a m30399i;
        C6573a m30399i2;
        if (c6580h == null || (m30399i = c6580h.m30399i()) == null) {
            if (c6580h2 == null) {
                return null;
            }
            return c6580h2.m30399i();
        }
        if (c6580h2 == null || (m30399i2 = c6580h2.m30399i()) == null || m30399i.m30340a() == m30399i2.m30340a() || m30399i.m30341b() == m30399i2.m30341b() || m30399i.m30342c() == m30399i2.m30342c()) {
            return m30399i;
        }
        return null;
    }

    /* renamed from: m */
    public static int[] m30421m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i12;
            int i14 = i10 & 1;
            int i15 = i11;
            int i16 = i13;
            if (i14 != i11) {
                i16 = i13 - 1;
                if (i16 < 0) {
                    return iArr;
                }
                i15 = i14;
            }
            iArr[i16] = iArr[i16] + 1;
            i10 >>= 1;
            i11 = i15;
            i12 = i16;
        }
    }

    /* renamed from: n */
    public static int m30422n(int i10) {
        return m30423o(m30421m(i10));
    }

    /* renamed from: o */
    public static int m30423o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m30424p(int[] iArr) {
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[EDGE_INSN: B:20:0x0062->B:21:0x0062 BREAK  A[LOOP:0: B:5:0x0019->B:16:0x0019], SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m30425q(p444zd.C10194b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            r0 = 8
            int[] r0 = new int[r0]
            r14 = r0
            r0 = r8
            if (r0 == 0) goto L10
            r0 = 1
            r11 = r0
            goto L13
        L10:
            r0 = -1
            r11 = r0
        L13:
            r0 = 0
            r12 = r0
            r0 = r8
            r13 = r0
        L19:
            r0 = r8
            if (r0 == 0) goto L26
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L62
            goto L2c
        L26:
            r0 = r9
            r1 = r6
            if (r0 < r1) goto L62
        L2c:
            r0 = r12
            r1 = 8
            if (r0 >= r1) goto L62
            r0 = r5
            r1 = r9
            r2 = r10
            boolean r0 = r0.m42672d(r1, r2)
            r1 = r13
            if (r0 != r1) goto L56
            r0 = r14
            r1 = r12
            r2 = r14
            r3 = r12
            r2 = r2[r3]
            r3 = 1
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = r9
            r1 = r11
            int r0 = r0 + r1
            r9 = r0
            goto L19
        L56:
            int r12 = r12 + 1
            r0 = r13
            r1 = 1
            r0 = r0 ^ r1
            r13 = r0
            goto L19
        L62:
            r0 = r12
            r1 = 8
            if (r0 == r1) goto L81
            r0 = r8
            if (r0 == 0) goto L6f
            r0 = r7
            r6 = r0
        L6f:
            r0 = r9
            r1 = r6
            if (r0 != r1) goto L7f
            r0 = r12
            r1 = 7
            if (r0 != r1) goto L7f
            goto L81
        L7f:
            r0 = 0
            return r0
        L81:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6582j.m30425q(zd.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    public static int m30426r(int i10) {
        return 2 << i10;
    }

    /* renamed from: s */
    public static C6580h m30427s(C10194b c10194b, C6575c c6575c, C8701p c8701p, boolean z10, int i10, int i11) {
        C6580h c6580h = new C6580h(c6575c, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int m37222c = (int) c8701p.m37222c();
            int m37223d = (int) c8701p.m37223d();
            while (true) {
                int i14 = m37223d;
                if (i14 <= c6575c.m30352e() && i14 >= c6575c.m30354g()) {
                    C6576d m30419k = m30419k(c10194b, 0, c10194b.m42678k(), z10, m37222c, i14, i10, i11);
                    if (m30419k != null) {
                        c6580h.m30396f(i14, m30419k);
                        m37222c = z10 ? m30419k.m30360d() : m30419k.m30358b();
                    }
                    m37223d = i14 + i13;
                }
            }
            i12++;
        }
        return c6580h;
    }

    /* renamed from: t */
    public static int m30428t(C6578f c6578f, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        C6576d m30392b = m30429u(c6578f, i13) ? c6578f.m30387n(i13).m30392b(i11) : null;
        if (m30392b != null) {
            return z10 ? m30392b.m30358b() : m30392b.m30360d();
        }
        C6576d m30393c = c6578f.m30387n(i10).m30393c(i11);
        if (m30393c != null) {
            return z10 ? m30393c.m30360d() : m30393c.m30358b();
        }
        if (m30429u(c6578f, i13)) {
            m30393c = c6578f.m30387n(i13).m30393c(i11);
        }
        if (m30393c != null) {
            return z10 ? m30393c.m30358b() : m30393c.m30360d();
        }
        int i14 = i10;
        int i15 = 0;
        while (true) {
            int i16 = i14 - i12;
            if (!m30429u(c6578f, i16)) {
                C6575c m30386m = c6578f.m30386m();
                return z10 ? m30386m.m30353f() : m30386m.m30351d();
            }
            for (C6576d c6576d : c6578f.m30387n(i16).m30394d()) {
                if (c6576d != null) {
                    return (z10 ? c6576d.m30358b() : c6576d.m30360d()) + (i12 * i15 * (c6576d.m30358b() - c6576d.m30360d()));
                }
            }
            i15++;
            i14 = i16;
        }
    }

    /* renamed from: u */
    public static boolean m30429u(C6578f c6578f, int i10) {
        return i10 >= 0 && i10 <= c6578f.m30383j() + 1;
    }

    /* renamed from: v */
    public static C6578f m30430v(C6580h c6580h, C6580h c6580h2) {
        C6573a m30420l;
        if ((c6580h == null && c6580h2 == null) || (m30420l = m30420l(c6580h, c6580h2)) == null) {
            return null;
        }
        return new C6578f(m30420l, C6575c.m30347j(m30409a(c6580h), m30409a(c6580h2)));
    }

    /* renamed from: w */
    public static void m30431w(int[] iArr, int i10) {
        if (iArr.length < 4) {
            throw C8691f.m37197a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw C8691f.m37197a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw C8691f.m37197a();
            }
            iArr[0] = iArr.length - i10;
        }
    }
}
