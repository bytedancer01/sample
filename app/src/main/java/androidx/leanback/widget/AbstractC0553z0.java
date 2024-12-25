package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC0522l;
import p294r.C7930c;
import p294r.C7931d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/z0.class
 */
/* renamed from: androidx.leanback.widget.z0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/z0.class */
public abstract class AbstractC0553z0 extends AbstractC0522l {

    /* renamed from: j */
    public C7930c<a> f3700j = new C7930c<>(64);

    /* renamed from: k */
    public int f3701k = -1;

    /* renamed from: l */
    public Object f3702l;

    /* renamed from: m */
    public int f3703m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/z0$a.class
     */
    /* renamed from: androidx.leanback.widget.z0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/z0$a.class */
    public static class a extends AbstractC0522l.a {

        /* renamed from: b */
        public int f3704b;

        /* renamed from: c */
        public int f3705c;

        public a(int i10, int i11, int i12) {
            super(i10);
            this.f3704b = i11;
            this.f3705c = i12;
        }
    }

    /* renamed from: H */
    public final boolean m3084H(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f3700j.m34381h() == 0) {
            return false;
        }
        int count = this.f3462b.getCount();
        int i13 = this.f3467g;
        if (i13 >= 0) {
            i11 = i13 + 1;
            i12 = this.f3462b.mo2694b(i13);
        } else {
            i11 = this.f3469i;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i11 > m3088M() + 1 || i11 < m3087L()) {
                this.f3700j.m34376c();
                return false;
            }
            if (i11 > m3088M()) {
                return false;
            }
            i12 = Integer.MAX_VALUE;
        }
        int m3088M = m3088M();
        int i14 = i12;
        while (i11 < count && i11 <= m3088M) {
            a mo2683q = mo2683q(i11);
            int i15 = i14;
            if (i14 != Integer.MAX_VALUE) {
                i15 = i14 + mo2683q.f3704b;
            }
            int i16 = mo2683q.f3470a;
            int mo2697e = this.f3462b.mo2697e(i11, true, this.f3461a, false);
            if (mo2697e != mo2683q.f3705c) {
                mo2683q.f3705c = mo2697e;
                this.f3700j.m34379f(m3088M - i11);
                m3088M = i11;
            }
            this.f3467g = i11;
            if (this.f3466f < 0) {
                this.f3466f = i11;
            }
            this.f3462b.mo2695c(this.f3461a[0], i11, mo2697e, i16, i15);
            if (!z10 && m2673d(i10)) {
                return true;
            }
            i14 = i15;
            if (i15 == Integer.MAX_VALUE) {
                i14 = this.f3462b.mo2694b(i11);
            }
            if (i16 == this.f3465e - 1 && z10) {
                return true;
            }
            i11++;
        }
        return false;
    }

    /* renamed from: I */
    public final int m3085I(int i10, int i11, int i12) {
        int i13 = this.f3467g;
        if (i13 >= 0 && (i13 != m3088M() || this.f3467g != i10 - 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.f3467g;
        a aVar = new a(i11, i14 < 0 ? (this.f3700j.m34381h() <= 0 || i10 != m3088M() + 1) ? 0 : m3086K(i11) : i12 - this.f3462b.mo2694b(i14), 0);
        this.f3700j.m34375b(aVar);
        Object obj = this.f3702l;
        if (obj != null) {
            aVar.f3705c = this.f3703m;
            this.f3702l = null;
        } else {
            aVar.f3705c = this.f3462b.mo2697e(i10, true, this.f3461a, false);
            obj = this.f3461a[0];
        }
        if (this.f3700j.m34381h() == 1) {
            this.f3467g = i10;
            this.f3466f = i10;
            this.f3701k = i10;
        } else {
            int i15 = this.f3467g;
            if (i15 < 0) {
                this.f3467g = i10;
                this.f3466f = i10;
            } else {
                this.f3467g = i15 + 1;
            }
        }
        this.f3462b.mo2695c(obj, i10, aVar.f3705c, i11, i12);
        return aVar.f3705c;
    }

    /* renamed from: J */
    public abstract boolean mo2547J(int i10, boolean z10);

    /* renamed from: K */
    public final int m3086K(int i10) {
        boolean z10;
        int m3088M = m3088M();
        while (true) {
            if (m3088M < this.f3701k) {
                z10 = false;
                break;
            }
            if (mo2683q(m3088M).f3470a == i10) {
                z10 = true;
                break;
            }
            m3088M--;
        }
        if (!z10) {
            m3088M = m3088M();
        }
        int i11 = m2687u() ? (-mo2683q(m3088M).f3705c) - this.f3464d : mo2683q(m3088M).f3705c + this.f3464d;
        while (true) {
            m3088M++;
            if (m3088M > m3088M()) {
                return i11;
            }
            i11 -= mo2683q(m3088M).f3704b;
        }
    }

    /* renamed from: L */
    public final int m3087L() {
        return this.f3701k;
    }

    /* renamed from: M */
    public final int m3088M() {
        return (this.f3701k + this.f3700j.m34381h()) - 1;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final a mo2683q(int i10) {
        int i11 = i10 - this.f3701k;
        if (i11 < 0 || i11 >= this.f3700j.m34381h()) {
            return null;
        }
        return this.f3700j.m34378e(i11);
    }

    /* renamed from: O */
    public final boolean m3090O(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (this.f3700j.m34381h() == 0) {
            return false;
        }
        int i14 = this.f3466f;
        if (i14 >= 0) {
            i11 = this.f3462b.mo2694b(i14);
            i13 = mo2683q(this.f3466f).f3704b;
            i12 = this.f3466f - 1;
        } else {
            i11 = Integer.MAX_VALUE;
            i12 = this.f3469i;
            if (i12 == -1) {
                i12 = 0;
            }
            if (i12 > m3088M() || i12 < m3087L() - 1) {
                this.f3700j.m34376c();
                return false;
            }
            if (i12 < m3087L()) {
                return false;
            }
            i13 = 0;
        }
        int max = Math.max(this.f3462b.mo2693a(), this.f3701k);
        while (i12 >= max) {
            a mo2683q = mo2683q(i12);
            int i15 = mo2683q.f3470a;
            int mo2697e = this.f3462b.mo2697e(i12, false, this.f3461a, false);
            if (mo2697e != mo2683q.f3705c) {
                this.f3700j.m34380g((i12 + 1) - this.f3701k);
                this.f3701k = this.f3466f;
                this.f3702l = this.f3461a[0];
                this.f3703m = mo2697e;
                return false;
            }
            this.f3466f = i12;
            if (this.f3467g < 0) {
                this.f3467g = i12;
            }
            this.f3462b.mo2695c(this.f3461a[0], i12, mo2697e, i15, i11 - i13);
            if (!z10 && m2674e(i10)) {
                return true;
            }
            i11 = this.f3462b.mo2694b(i12);
            i13 = mo2683q.f3704b;
            if (i15 == 0 && z10) {
                return true;
            }
            i12--;
        }
        return false;
    }

    /* renamed from: P */
    public final int m3091P(int i10, int i11, int i12) {
        int i13 = this.f3466f;
        if (i13 >= 0 && (i13 != m3087L() || this.f3466f != i10 + 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.f3701k;
        a mo2683q = i14 >= 0 ? mo2683q(i14) : null;
        int mo2694b = this.f3462b.mo2694b(this.f3701k);
        a aVar = new a(i11, 0, 0);
        this.f3700j.m34374a(aVar);
        Object obj = this.f3702l;
        if (obj != null) {
            aVar.f3705c = this.f3703m;
            this.f3702l = null;
        } else {
            aVar.f3705c = this.f3462b.mo2697e(i10, false, this.f3461a, false);
            obj = this.f3461a[0];
        }
        this.f3466f = i10;
        this.f3701k = i10;
        if (this.f3467g < 0) {
            this.f3467g = i10;
        }
        int i15 = !this.f3463c ? i12 - aVar.f3705c : i12 + aVar.f3705c;
        if (mo2683q != null) {
            mo2683q.f3704b = mo2694b - i15;
        }
        this.f3462b.mo2695c(obj, i10, aVar.f3705c, i11, i15);
        return aVar.f3705c;
    }

    /* renamed from: Q */
    public abstract boolean mo2548Q(int i10, boolean z10);

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: c */
    public final boolean mo2672c(int i10, boolean z10) {
        boolean mo2547J;
        if (this.f3462b.getCount() == 0) {
            return false;
        }
        if (!z10 && m2673d(i10)) {
            return false;
        }
        try {
            if (m3084H(i10, z10)) {
                mo2547J = true;
                this.f3461a[0] = null;
            } else {
                mo2547J = mo2547J(i10, z10);
                this.f3461a[0] = null;
            }
            this.f3702l = null;
            return mo2547J;
        } catch (Throwable th2) {
            this.f3461a[0] = null;
            this.f3702l = null;
            throw th2;
        }
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: o */
    public final C7931d[] mo2681o(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3465e; i12++) {
            this.f3468h[i12].m34383b();
        }
        if (i10 >= 0) {
            while (i10 <= i11) {
                C7931d c7931d = this.f3468h[mo2683q(i10).f3470a];
                if (c7931d.m34388g() <= 0 || c7931d.m34386e() != i10 - 1) {
                    c7931d.m34382a(i10);
                } else {
                    c7931d.m34387f();
                }
                c7931d.m34382a(i10);
                i10++;
            }
        }
        return this.f3468h;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: t */
    public void mo2686t(int i10) {
        super.mo2686t(i10);
        this.f3700j.m34379f((m3088M() - i10) + 1);
        if (this.f3700j.m34381h() == 0) {
            this.f3701k = -1;
        }
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: x */
    public final boolean mo2690x(int i10, boolean z10) {
        boolean mo2548Q;
        if (this.f3462b.getCount() == 0) {
            return false;
        }
        if (!z10 && m2674e(i10)) {
            return false;
        }
        try {
            if (m3090O(i10, z10)) {
                mo2548Q = true;
                this.f3461a[0] = null;
            } else {
                mo2548Q = mo2548Q(i10, z10);
                this.f3461a[0] = null;
            }
            this.f3702l = null;
            return mo2548Q;
        } catch (Throwable th2) {
            this.f3461a[0] = null;
            this.f3702l = null;
            throw th2;
        }
    }
}
