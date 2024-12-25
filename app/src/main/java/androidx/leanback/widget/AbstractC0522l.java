package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p294r.C7931d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/l.class
 */
/* renamed from: androidx.leanback.widget.l */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/l.class */
public abstract class AbstractC0522l {

    /* renamed from: b */
    public b f3462b;

    /* renamed from: c */
    public boolean f3463c;

    /* renamed from: d */
    public int f3464d;

    /* renamed from: e */
    public int f3465e;

    /* renamed from: h */
    public C7931d[] f3468h;

    /* renamed from: a */
    public Object[] f3461a = new Object[1];

    /* renamed from: f */
    public int f3466f = -1;

    /* renamed from: g */
    public int f3467g = -1;

    /* renamed from: i */
    public int f3469i = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/l$a.class
     */
    /* renamed from: androidx.leanback.widget.l$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/l$a.class */
    public static class a {

        /* renamed from: a */
        public int f3470a;

        public a(int i10) {
            this.f3470a = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/l$b.class
     */
    /* renamed from: androidx.leanback.widget.l$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/l$b.class */
    public interface b {
        /* renamed from: a */
        int mo2693a();

        /* renamed from: b */
        int mo2694b(int i10);

        /* renamed from: c */
        void mo2695c(Object obj, int i10, int i11, int i12, int i13);

        /* renamed from: d */
        int mo2696d(int i10);

        /* renamed from: e */
        int mo2697e(int i10, boolean z10, Object[] objArr, boolean z11);

        int getCount();

        void removeItem(int i10);
    }

    /* renamed from: g */
    public static AbstractC0522l m2662g(int i10) {
        AbstractC0522l c0495a1;
        if (i10 == 1) {
            c0495a1 = new C0549x0();
        } else {
            c0495a1 = new C0495a1();
            c0495a1.m2665C(i10);
        }
        return c0495a1;
    }

    /* renamed from: A */
    public void m2663A() {
        this.f3467g = -1;
        this.f3466f = -1;
    }

    /* renamed from: B */
    public final void m2664B() {
        if (this.f3467g < this.f3466f) {
            m2663A();
        }
    }

    /* renamed from: C */
    public void m2665C(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f3465e == i10) {
            return;
        }
        this.f3465e = i10;
        this.f3468h = new C7931d[i10];
        for (int i11 = 0; i11 < this.f3465e; i11++) {
            this.f3468h[i11] = new C7931d();
        }
    }

    /* renamed from: D */
    public void m2666D(b bVar) {
        this.f3462b = bVar;
    }

    /* renamed from: E */
    public final void m2667E(boolean z10) {
        this.f3463c = z10;
    }

    /* renamed from: F */
    public final void m2668F(int i10) {
        this.f3464d = i10;
    }

    /* renamed from: G */
    public void m2669G(int i10) {
        this.f3469i = i10;
    }

    /* renamed from: a */
    public boolean m2670a() {
        return mo2672c(this.f3463c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    /* renamed from: b */
    public final void m2671b(int i10) {
        mo2672c(i10, false);
    }

    /* renamed from: c */
    public abstract boolean mo2672c(int i10, boolean z10);

    /* renamed from: d */
    public final boolean m2673d(int i10) {
        boolean z10 = false;
        if (this.f3467g < 0) {
            return false;
        }
        if (!this.f3463c ? m2677j(false, null) >= i10 - this.f3464d : m2678l(true, null) <= i10 + this.f3464d) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: e */
    public final boolean m2674e(int i10) {
        boolean z10 = false;
        if (this.f3467g < 0) {
            return false;
        }
        if (!this.f3463c ? m2678l(true, null) <= i10 + this.f3464d : m2677j(false, null) >= i10 - this.f3464d) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: f */
    public void mo2675f(int i10, int i11, RecyclerView.AbstractC0685p.c cVar) {
    }

    /* renamed from: h */
    public void m2676h(int[] iArr, int i10, SparseIntArray sparseIntArray) {
        int m2682p = m2682p();
        int binarySearch = m2682p >= 0 ? Arrays.binarySearch(iArr, 0, i10, m2682p) : 0;
        if (binarySearch < 0) {
            int mo2694b = this.f3463c ? (this.f3462b.mo2694b(m2682p) - this.f3462b.mo2696d(m2682p)) - this.f3464d : this.f3462b.mo2694b(m2682p) + this.f3462b.mo2696d(m2682p) + this.f3464d;
            for (int i11 = (-binarySearch) - 1; i11 < i10; i11++) {
                int i12 = iArr[i11];
                int i13 = sparseIntArray.get(i12);
                if (i13 < 0) {
                    i13 = 0;
                }
                int mo2697e = this.f3462b.mo2697e(i12, true, this.f3461a, true);
                this.f3462b.mo2695c(this.f3461a[0], i12, mo2697e, i13, mo2694b);
                mo2694b = this.f3463c ? (mo2694b - mo2697e) - this.f3464d : mo2694b + mo2697e + this.f3464d;
            }
        }
        int m2679m = m2679m();
        int binarySearch2 = m2679m >= 0 ? Arrays.binarySearch(iArr, 0, i10, m2679m) : 0;
        if (binarySearch2 < 0) {
            boolean z10 = this.f3463c;
            int mo2694b2 = this.f3462b.mo2694b(m2679m);
            for (int i14 = (-binarySearch2) - 2; i14 >= 0; i14--) {
                int i15 = iArr[i14];
                int i16 = sparseIntArray.get(i15);
                if (i16 < 0) {
                    i16 = 0;
                }
                int mo2697e2 = this.f3462b.mo2697e(i15, false, this.f3461a, true);
                mo2694b2 = this.f3463c ? mo2694b2 + this.f3464d + mo2697e2 : (mo2694b2 - this.f3464d) - mo2697e2;
                this.f3462b.mo2695c(this.f3461a[0], i15, mo2697e2, i16, mo2694b2);
            }
        }
    }

    /* renamed from: i */
    public abstract int mo2552i(boolean z10, int i10, int[] iArr);

    /* renamed from: j */
    public final int m2677j(boolean z10, int[] iArr) {
        return mo2552i(z10, this.f3463c ? this.f3466f : this.f3467g, iArr);
    }

    /* renamed from: k */
    public abstract int mo2553k(boolean z10, int i10, int[] iArr);

    /* renamed from: l */
    public final int m2678l(boolean z10, int[] iArr) {
        return mo2553k(z10, this.f3463c ? this.f3467g : this.f3466f, iArr);
    }

    /* renamed from: m */
    public final int m2679m() {
        return this.f3466f;
    }

    /* renamed from: n */
    public final C7931d[] m2680n() {
        return mo2681o(m2679m(), m2682p());
    }

    /* renamed from: o */
    public abstract C7931d[] mo2681o(int i10, int i11);

    /* renamed from: p */
    public final int m2682p() {
        return this.f3467g;
    }

    /* renamed from: q */
    public abstract a mo2683q(int i10);

    /* renamed from: r */
    public int m2684r() {
        return this.f3465e;
    }

    /* renamed from: s */
    public final int m2685s(int i10) {
        a mo2683q = mo2683q(i10);
        if (mo2683q == null) {
            return -1;
        }
        return mo2683q.f3470a;
    }

    /* renamed from: t */
    public void mo2686t(int i10) {
        int i11;
        if (i10 >= 0 && (i11 = this.f3467g) >= 0) {
            if (i11 >= i10) {
                this.f3467g = i10 - 1;
            }
            m2664B();
            if (m2679m() < 0) {
                m2669G(i10);
            }
        }
    }

    /* renamed from: u */
    public boolean m2687u() {
        return this.f3463c;
    }

    /* renamed from: v */
    public final boolean m2688v() {
        return mo2690x(this.f3463c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    /* renamed from: w */
    public final void m2689w(int i10) {
        mo2690x(i10, false);
    }

    /* renamed from: x */
    public abstract boolean mo2690x(int i10, boolean z10);

    /* renamed from: y */
    public void m2691y(int i10, int i11) {
        while (true) {
            int i12 = this.f3467g;
            if (i12 < this.f3466f || i12 <= i10) {
                break;
            }
            boolean z10 = false;
            if (this.f3463c ? this.f3462b.mo2694b(i12) <= i11 : this.f3462b.mo2694b(i12) >= i11) {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            this.f3462b.removeItem(this.f3467g);
            this.f3467g--;
        }
        m2664B();
    }

    /* renamed from: z */
    public void m2692z(int i10, int i11) {
        while (true) {
            int i12 = this.f3467g;
            int i13 = this.f3466f;
            if (i12 < i13 || i13 >= i10) {
                break;
            }
            int mo2696d = this.f3462b.mo2696d(i13);
            boolean z10 = false;
            if (this.f3463c ? this.f3462b.mo2694b(this.f3466f) - mo2696d >= i11 : this.f3462b.mo2694b(this.f3466f) + mo2696d <= i11) {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            this.f3462b.removeItem(this.f3466f);
            this.f3466f++;
        }
        m2664B();
    }
}
