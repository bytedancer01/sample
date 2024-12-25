package ne;

import td.C8689d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ne/a.class
 */
/* renamed from: ne.a */
/* loaded from: combined.jar:classes2.jar:ne/a.class */
public final class C6779a {

    /* renamed from: a */
    public final C6780b f35376a = C6780b.f35377f;

    /* renamed from: a */
    public int m31215a(int[] iArr, int i10, int[] iArr2) {
        C6781c c6781c = new C6781c(this.f35376a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int m31230b = c6781c.m31230b(this.f35376a.m31221c(i11));
            iArr3[i10 - i11] = m31230b;
            if (m31230b != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        C6781c m31222d = this.f35376a.m31222d();
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                int m31221c = this.f35376a.m31221c((iArr.length - 1) - i12);
                C6780b c6780b = this.f35376a;
                m31222d = m31222d.m31235g(new C6781c(c6780b, new int[]{c6780b.m31228j(0, m31221c), 1}));
            }
        }
        C6781c[] m31218d = m31218d(this.f35376a.m31220b(i10, 1), new C6781c(this.f35376a, iArr3), i10);
        C6781c c6781c2 = m31218d[0];
        C6781c c6781c3 = m31218d[1];
        int[] m31216b = m31216b(c6781c2);
        int[] m31217c = m31217c(c6781c3, c6781c2, m31216b);
        for (int i13 = 0; i13 < m31216b.length; i13++) {
            int length = (iArr.length - 1) - this.f35376a.m31226h(m31216b[i13]);
            if (length < 0) {
                throw C8689d.m37196a();
            }
            iArr[length] = this.f35376a.m31228j(iArr[length], m31217c[i13]);
        }
        return m31216b.length;
    }

    /* renamed from: b */
    public final int[] m31216b(C6781c c6781c) {
        int i10;
        int m31232d = c6781c.m31232d();
        int[] iArr = new int[m31232d];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= this.f35376a.m31223e() || i10 >= m31232d) {
                break;
            }
            int i13 = i10;
            if (c6781c.m31230b(i11) == 0) {
                iArr[i10] = this.f35376a.m31225g(i11);
                i13 = i10 + 1;
            }
            i11++;
            i12 = i13;
        }
        if (i10 == m31232d) {
            return iArr;
        }
        throw C8689d.m37196a();
    }

    /* renamed from: c */
    public final int[] m31217c(C6781c c6781c, C6781c c6781c2, int[] iArr) {
        int m31232d = c6781c2.m31232d();
        int[] iArr2 = new int[m31232d];
        for (int i10 = 1; i10 <= m31232d; i10++) {
            iArr2[m31232d - i10] = this.f35376a.m31227i(i10, c6781c2.m31231c(i10));
        }
        C6781c c6781c3 = new C6781c(this.f35376a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int m31225g = this.f35376a.m31225g(iArr[i11]);
            iArr3[i11] = this.f35376a.m31227i(this.f35376a.m31228j(0, c6781c.m31230b(m31225g)), this.f35376a.m31225g(c6781c3.m31230b(m31225g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final C6781c[] m31218d(C6781c c6781c, C6781c c6781c2, int i10) {
        C6781c c6781c3 = c6781c;
        C6781c c6781c4 = c6781c2;
        if (c6781c.m31232d() < c6781c2.m31232d()) {
            c6781c4 = c6781c;
            c6781c3 = c6781c2;
        }
        C6781c m31224f = this.f35376a.m31224f();
        C6781c m31222d = this.f35376a.m31222d();
        C6781c c6781c5 = c6781c4;
        C6781c c6781c6 = m31224f;
        while (true) {
            C6781c c6781c7 = c6781c6;
            C6781c c6781c8 = c6781c3;
            c6781c3 = c6781c5;
            if (c6781c3.m31232d() < i10 / 2) {
                int m31231c = m31222d.m31231c(0);
                if (m31231c == 0) {
                    throw C8689d.m37196a();
                }
                int m31225g = this.f35376a.m31225g(m31231c);
                return new C6781c[]{m31222d.m31234f(m31225g), c6781c3.m31234f(m31225g)};
            }
            if (c6781c3.m31233e()) {
                throw C8689d.m37196a();
            }
            C6781c m31224f2 = this.f35376a.m31224f();
            int m31225g2 = this.f35376a.m31225g(c6781c3.m31231c(c6781c3.m31232d()));
            c6781c5 = c6781c8;
            C6781c c6781c9 = m31224f2;
            while (c6781c5.m31232d() >= c6781c3.m31232d() && !c6781c5.m31233e()) {
                int m31232d = c6781c5.m31232d() - c6781c3.m31232d();
                int m31227i = this.f35376a.m31227i(c6781c5.m31231c(c6781c5.m31232d()), m31225g2);
                c6781c9 = c6781c9.m31229a(this.f35376a.m31220b(m31232d, m31227i));
                c6781c5 = c6781c5.m31238j(c6781c3.m31236h(m31232d, m31227i));
            }
            C6781c m31237i = c6781c9.m31235g(m31222d).m31238j(c6781c7).m31237i();
            c6781c6 = m31222d;
            m31222d = m31237i;
        }
    }
}
