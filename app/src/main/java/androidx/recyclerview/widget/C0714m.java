package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/m.class
 */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/m.class */
public class C0714m extends AbstractC0718q {

    /* renamed from: d */
    public AbstractC0713l f4954d;

    /* renamed from: e */
    public AbstractC0713l f4955e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/m$a.class
     */
    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/m$a.class */
    public class a extends C0711j {

        /* renamed from: q */
        public final C0714m f4956q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0714m c0714m, Context context) {
            super(context);
            this.f4956q = c0714m;
        }

        @Override // androidx.recyclerview.widget.C0711j, androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: o */
        public void mo2882o(View view, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0666a0.a aVar) {
            C0714m c0714m = this.f4956q;
            int[] mo4630c = c0714m.mo4630c(c0714m.f4962a.getLayoutManager(), view);
            int i10 = mo4630c[0];
            int i11 = mo4630c[1];
            int m4602w = m4602w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m4602w > 0) {
                aVar.m4005d(i10, i11, m4602w, this.f4943j);
            }
        }

        @Override // androidx.recyclerview.widget.C0711j
        /* renamed from: v */
        public float mo4601v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0711j
        /* renamed from: x */
        public int mo2883x(int i10) {
            return Math.min(100, super.mo2883x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0718q
    /* renamed from: c */
    public int[] mo4630c(RecyclerView.AbstractC0685p abstractC0685p, View view) {
        int[] iArr = new int[2];
        if (abstractC0685p.mo2731H()) {
            iArr[0] = m4634k(view, m4636m(abstractC0685p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0685p.mo2736I()) {
            iArr[1] = m4634k(view, m4638o(abstractC0685p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0718q
    /* renamed from: d */
    public RecyclerView.AbstractC0666a0 mo4631d(RecyclerView.AbstractC0685p abstractC0685p) {
        if (abstractC0685p instanceof RecyclerView.AbstractC0666a0.b) {
            return new a(this, this.f4962a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0718q
    /* renamed from: f */
    public View mo4632f(RecyclerView.AbstractC0685p abstractC0685p) {
        AbstractC0713l m4636m;
        if (abstractC0685p.mo2736I()) {
            m4636m = m4638o(abstractC0685p);
        } else {
            if (!abstractC0685p.mo2731H()) {
                return null;
            }
            m4636m = m4636m(abstractC0685p);
        }
        return m4635l(abstractC0685p, m4636m);
    }

    @Override // androidx.recyclerview.widget.AbstractC0718q
    /* renamed from: g */
    public int mo4633g(RecyclerView.AbstractC0685p abstractC0685p, int i10, int i11) {
        AbstractC0713l m4637n;
        int i12;
        View view;
        int m4233w0 = abstractC0685p.m4233w0();
        if (m4233w0 == 0 || (m4637n = m4637n(abstractC0685p)) == null) {
            return -1;
        }
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int m4217h0 = abstractC0685p.m4217h0();
        int i15 = 0;
        View view2 = null;
        View view3 = null;
        while (i15 < m4217h0) {
            View m4216g0 = abstractC0685p.m4216g0(i15);
            if (m4216g0 == null) {
                i12 = i14;
                view = view2;
            } else {
                int m4634k = m4634k(m4216g0, m4637n);
                int i16 = i13;
                View view4 = view3;
                if (m4634k <= 0) {
                    i16 = i13;
                    view4 = view3;
                    if (m4634k > i13) {
                        view4 = m4216g0;
                        i16 = m4634k;
                    }
                }
                i13 = i16;
                i12 = i14;
                view = view2;
                view3 = view4;
                if (m4634k >= 0) {
                    i13 = i16;
                    i12 = i14;
                    view = view2;
                    view3 = view4;
                    if (m4634k < i14) {
                        i12 = m4634k;
                        view3 = view4;
                        view = m4216g0;
                        i13 = i16;
                    }
                }
            }
            i15++;
            i14 = i12;
            view2 = view;
        }
        boolean m4639p = m4639p(abstractC0685p, i10, i11);
        if (m4639p && view2 != null) {
            return abstractC0685p.m4155B0(view2);
        }
        if (!m4639p && view3 != null) {
            return abstractC0685p.m4155B0(view3);
        }
        if (m4639p) {
            view2 = view3;
        }
        if (view2 == null) {
            return -1;
        }
        int m4155B0 = abstractC0685p.m4155B0(view2) + (m4640q(abstractC0685p) == m4639p ? -1 : 1);
        if (m4155B0 < 0 || m4155B0 >= m4233w0) {
            return -1;
        }
        return m4155B0;
    }

    /* renamed from: k */
    public final int m4634k(View view, AbstractC0713l abstractC0713l) {
        return (abstractC0713l.mo4617g(view) + (abstractC0713l.mo4615e(view) / 2)) - (abstractC0713l.mo4623m() + (abstractC0713l.mo4624n() / 2));
    }

    /* renamed from: l */
    public final View m4635l(RecyclerView.AbstractC0685p abstractC0685p, AbstractC0713l abstractC0713l) {
        int m4217h0 = abstractC0685p.m4217h0();
        View view = null;
        if (m4217h0 == 0) {
            return null;
        }
        int mo4623m = abstractC0713l.mo4623m();
        int mo4624n = abstractC0713l.mo4624n() / 2;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        while (i11 < m4217h0) {
            View m4216g0 = abstractC0685p.m4216g0(i11);
            int abs = Math.abs((abstractC0713l.mo4617g(m4216g0) + (abstractC0713l.mo4615e(m4216g0) / 2)) - (mo4623m + mo4624n));
            int i12 = i10;
            if (abs < i10) {
                view = m4216g0;
                i12 = abs;
            }
            i11++;
            i10 = i12;
        }
        return view;
    }

    /* renamed from: m */
    public final AbstractC0713l m4636m(RecyclerView.AbstractC0685p abstractC0685p) {
        AbstractC0713l abstractC0713l = this.f4955e;
        if (abstractC0713l == null || abstractC0713l.f4951a != abstractC0685p) {
            this.f4955e = AbstractC0713l.m4611a(abstractC0685p);
        }
        return this.f4955e;
    }

    /* renamed from: n */
    public final AbstractC0713l m4637n(RecyclerView.AbstractC0685p abstractC0685p) {
        if (abstractC0685p.mo2736I()) {
            return m4638o(abstractC0685p);
        }
        if (abstractC0685p.mo2731H()) {
            return m4636m(abstractC0685p);
        }
        return null;
    }

    /* renamed from: o */
    public final AbstractC0713l m4638o(RecyclerView.AbstractC0685p abstractC0685p) {
        AbstractC0713l abstractC0713l = this.f4954d;
        if (abstractC0713l == null || abstractC0713l.f4951a != abstractC0685p) {
            this.f4954d = AbstractC0713l.m4613c(abstractC0685p);
        }
        return this.f4954d;
    }

    /* renamed from: p */
    public final boolean m4639p(RecyclerView.AbstractC0685p abstractC0685p, int i10, int i11) {
        boolean z10 = true;
        if (abstractC0685p.mo2731H()) {
            return i10 > 0;
        }
        if (i11 <= 0) {
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r0.y < 0.0f) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4640q(androidx.recyclerview.widget.RecyclerView.AbstractC0685p r5) {
        /*
            r4 = this;
            r0 = r5
            int r0 = r0.m4233w0()
            r6 = r0
            r0 = r5
            boolean r0 = r0 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC0666a0.b
            r9 = r0
            r0 = 0
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L41
            r0 = r5
            androidx.recyclerview.widget.RecyclerView$a0$b r0 = (androidx.recyclerview.widget.RecyclerView.AbstractC0666a0.b) r0
            r1 = r6
            r2 = 1
            int r1 = r1 - r2
            android.graphics.PointF r0 = r0.mo3816d(r1)
            r5 = r0
            r0 = r8
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L41
            r0 = r5
            float r0 = r0.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            r0 = r8
            r7 = r0
            r0 = r5
            float r0 = r0.y
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            r0 = 1
            r7 = r0
        L41:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0714m.m4640q(androidx.recyclerview.widget.RecyclerView$p):boolean");
    }
}
