package be;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:be/c.class
 */
/* renamed from: be.c */
/* loaded from: combined.jar:classes2.jar:be/c.class */
public final class C0894c {

    /* renamed from: a */
    public final C0892a f6027a;

    public C0894c(C0892a c0892a) {
        this.f6027a = c0892a;
    }

    /* renamed from: a */
    public void m5548a(int[] iArr, int i10) {
        C0893b c0893b = new C0893b(this.f6027a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            C0892a c0892a = this.f6027a;
            int m5541b = c0893b.m5541b(c0892a.m5532c(c0892a.m5533d() + i11));
            iArr2[(i10 - 1) - i11] = m5541b;
            if (m5541b != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        C0893b[] m5551d = m5551d(this.f6027a.m5531b(i10, 1), new C0893b(this.f6027a, iArr2), i10);
        C0893b c0893b2 = m5551d[0];
        C0893b c0893b3 = m5551d[1];
        int[] m5549b = m5549b(c0893b2);
        int[] m5550c = m5550c(c0893b3, m5549b);
        for (int i12 = 0; i12 < m5549b.length; i12++) {
            int length = (iArr.length - 1) - this.f6027a.m5538i(m5549b[i12]);
            if (length < 0) {
                throw new C0895d("Bad error location");
            }
            iArr[length] = C0892a.m5530a(iArr[length], m5550c[i12]);
        }
    }

    /* renamed from: b */
    public final int[] m5549b(C0893b c0893b) {
        int m5543d = c0893b.m5543d();
        int i10 = 0;
        int i11 = 1;
        if (m5543d == 1) {
            return new int[]{c0893b.m5542c(1)};
        }
        int[] iArr = new int[m5543d];
        while (i11 < this.f6027a.m5535f() && i10 < m5543d) {
            int i12 = i10;
            if (c0893b.m5541b(i11) == 0) {
                iArr[i10] = this.f6027a.m5537h(i11);
                i12 = i10 + 1;
            }
            i11++;
            i10 = i12;
        }
        if (i10 == m5543d) {
            return iArr;
        }
        throw new C0895d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] m5550c(C0893b c0893b, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int m5537h = this.f6027a.m5537h(iArr[i10]);
            int i11 = 1;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i11;
                if (i10 != i12) {
                    int m5539j = this.f6027a.m5539j(iArr[i12], m5537h);
                    i13 = this.f6027a.m5539j(i11, (m5539j & 1) == 0 ? m5539j | 1 : m5539j & (-2));
                }
                i12++;
                i11 = i13;
            }
            iArr2[i10] = this.f6027a.m5539j(c0893b.m5541b(m5537h), this.f6027a.m5537h(i11));
            if (this.f6027a.m5533d() != 0) {
                iArr2[i10] = this.f6027a.m5539j(iArr2[i10], m5537h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final C0893b[] m5551d(C0893b c0893b, C0893b c0893b2, int i10) {
        C0893b c0893b3 = c0893b;
        C0893b c0893b4 = c0893b2;
        if (c0893b.m5543d() < c0893b2.m5543d()) {
            c0893b4 = c0893b;
            c0893b3 = c0893b2;
        }
        C0893b m5536g = this.f6027a.m5536g();
        C0893b m5534e = this.f6027a.m5534e();
        C0893b c0893b5 = c0893b4;
        C0893b c0893b6 = c0893b3;
        C0893b c0893b7 = m5536g;
        while (true) {
            C0893b c0893b8 = c0893b7;
            C0893b c0893b9 = c0893b6;
            c0893b6 = c0893b5;
            if (c0893b6.m5543d() < i10 / 2) {
                int m5542c = m5534e.m5542c(0);
                if (m5542c == 0) {
                    throw new C0895d("sigmaTilde(0) was zero");
                }
                int m5537h = this.f6027a.m5537h(m5542c);
                return new C0893b[]{m5534e.m5545f(m5537h), c0893b6.m5545f(m5537h)};
            }
            if (c0893b6.m5544e()) {
                throw new C0895d("r_{i-1} was zero");
            }
            C0893b m5536g2 = this.f6027a.m5536g();
            int m5537h2 = this.f6027a.m5537h(c0893b6.m5542c(c0893b6.m5543d()));
            c0893b5 = c0893b9;
            C0893b c0893b10 = m5536g2;
            while (c0893b5.m5543d() >= c0893b6.m5543d() && !c0893b5.m5544e()) {
                int m5543d = c0893b5.m5543d() - c0893b6.m5543d();
                int m5539j = this.f6027a.m5539j(c0893b5.m5542c(c0893b5.m5543d()), m5537h2);
                c0893b10 = c0893b10.m5540a(this.f6027a.m5531b(m5543d, m5539j));
                c0893b5 = c0893b5.m5540a(c0893b6.m5547h(m5543d, m5539j));
            }
            C0893b m5540a = c0893b10.m5546g(m5534e).m5540a(c0893b8);
            if (c0893b5.m5543d() >= c0893b6.m5543d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            c0893b7 = m5534e;
            m5534e = m5540a;
        }
    }
}
