package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC0522l;
import androidx.recyclerview.widget.RecyclerView;
import p294r.C7931d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/x0.class
 */
/* renamed from: androidx.leanback.widget.x0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x0.class */
public class C0549x0 extends AbstractC0522l {

    /* renamed from: j */
    public final AbstractC0522l.a f3695j = new AbstractC0522l.a(0);

    public C0549x0() {
        m2665C(1);
    }

    /* renamed from: H */
    public int m3080H() {
        int i10 = this.f3467g;
        if (i10 >= 0) {
            return i10 + 1;
        }
        int i11 = this.f3469i;
        if (i11 != -1) {
            return Math.min(i11, this.f3462b.getCount() - 1);
        }
        return 0;
    }

    /* renamed from: I */
    public int m3081I() {
        int i10 = this.f3466f;
        if (i10 >= 0) {
            return i10 - 1;
        }
        int i11 = this.f3469i;
        return i11 != -1 ? Math.min(i11, this.f3462b.getCount() - 1) : this.f3462b.getCount() - 1;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: c */
    public final boolean mo2672c(int i10, boolean z10) {
        boolean z11;
        int i11;
        if (this.f3462b.getCount() == 0) {
            return false;
        }
        if (!z10 && m2673d(i10)) {
            return false;
        }
        int m3080H = m3080H();
        boolean z12 = false;
        while (true) {
            z11 = z12;
            if (m3080H >= this.f3462b.getCount()) {
                break;
            }
            int mo2697e = this.f3462b.mo2697e(m3080H, true, this.f3461a, false);
            if (this.f3466f < 0 || this.f3467g < 0) {
                i11 = this.f3463c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f3466f = m3080H;
            } else if (this.f3463c) {
                int i12 = m3080H - 1;
                i11 = (this.f3462b.mo2694b(i12) - this.f3462b.mo2696d(i12)) - this.f3464d;
            } else {
                int i13 = m3080H - 1;
                i11 = this.f3462b.mo2694b(i13) + this.f3462b.mo2696d(i13) + this.f3464d;
            }
            this.f3467g = m3080H;
            this.f3462b.mo2695c(this.f3461a[0], m3080H, mo2697e, 0, i11);
            z11 = true;
            if (z10) {
                break;
            }
            if (m2673d(i10)) {
                z11 = true;
                break;
            }
            m3080H++;
            z12 = true;
        }
        return z11;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: f */
    public void mo2675f(int i10, int i11, RecyclerView.AbstractC0685p.c cVar) {
        int mo2694b;
        int i12;
        if (!this.f3463c ? i11 < 0 : i11 > 0) {
            if (m2682p() == this.f3462b.getCount() - 1) {
                return;
            }
            int m3080H = m3080H();
            int mo2696d = this.f3462b.mo2696d(this.f3467g) + this.f3464d;
            int mo2694b2 = this.f3462b.mo2694b(this.f3467g);
            int i13 = mo2696d;
            if (this.f3463c) {
                i13 = -mo2696d;
            }
            int i14 = i13 + mo2694b2;
            i12 = m3080H;
            mo2694b = i14;
        } else {
            if (m2679m() == 0) {
                return;
            }
            int m3081I = m3081I();
            mo2694b = this.f3462b.mo2694b(this.f3466f) + (this.f3463c ? this.f3464d : -this.f3464d);
            i12 = m3081I;
        }
        cVar.mo4245a(i12, Math.abs(mo2694b - i10));
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: i */
    public final int mo2552i(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        return this.f3463c ? this.f3462b.mo2694b(i10) : this.f3462b.mo2694b(i10) + this.f3462b.mo2696d(i10);
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: k */
    public final int mo2553k(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        return this.f3463c ? this.f3462b.mo2694b(i10) - this.f3462b.mo2696d(i10) : this.f3462b.mo2694b(i10);
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: o */
    public final C7931d[] mo2681o(int i10, int i11) {
        this.f3468h[0].m34383b();
        this.f3468h[0].m34382a(i10);
        this.f3468h[0].m34382a(i11);
        return this.f3468h;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: q */
    public final AbstractC0522l.a mo2683q(int i10) {
        return this.f3695j;
    }

    @Override // androidx.leanback.widget.AbstractC0522l
    /* renamed from: x */
    public final boolean mo2690x(int i10, boolean z10) {
        boolean z11;
        int i11;
        if (this.f3462b.getCount() == 0) {
            return false;
        }
        if (!z10 && m2674e(i10)) {
            return false;
        }
        int mo2693a = this.f3462b.mo2693a();
        int m3081I = m3081I();
        boolean z12 = false;
        while (true) {
            z11 = z12;
            if (m3081I < mo2693a) {
                break;
            }
            int mo2697e = this.f3462b.mo2697e(m3081I, false, this.f3461a, false);
            if (this.f3466f < 0 || this.f3467g < 0) {
                i11 = this.f3463c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f3466f = m3081I;
                this.f3467g = m3081I;
            } else {
                i11 = this.f3463c ? this.f3462b.mo2694b(m3081I + 1) + this.f3464d + mo2697e : (this.f3462b.mo2694b(m3081I + 1) - this.f3464d) - mo2697e;
                this.f3466f = m3081I;
            }
            this.f3462b.mo2695c(this.f3461a[0], m3081I, mo2697e, 0, i11);
            z11 = true;
            if (z10) {
                break;
            }
            if (m2674e(i10)) {
                z11 = true;
                break;
            }
            m3081I--;
            z12 = true;
        }
        return z11;
    }
}
