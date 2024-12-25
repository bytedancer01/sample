package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.C0462a;
import androidx.leanback.widget.AbstractC0496b;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.leanback.widget.AbstractC0537r0;
import androidx.leanback.widget.C0535q0;
import androidx.leanback.widget.C0542u;
import androidx.leanback.widget.C0545v0;
import java.util.HashMap;
import p002a1.C0004a;
import p413y0.C9790c;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/x.class
 */
/* renamed from: androidx.leanback.widget.x */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x.class */
public class C0548x extends AbstractC0537r0 {

    /* renamed from: r */
    public static int f3663r;

    /* renamed from: s */
    public static int f3664s;

    /* renamed from: t */
    public static int f3665t;

    /* renamed from: e */
    public int f3666e;

    /* renamed from: f */
    public int f3667f;

    /* renamed from: g */
    public int f3668g;

    /* renamed from: h */
    public AbstractC0521k0 f3669h;

    /* renamed from: i */
    public int f3670i;

    /* renamed from: j */
    public boolean f3671j;

    /* renamed from: k */
    public boolean f3672k;

    /* renamed from: l */
    public int f3673l;

    /* renamed from: m */
    public boolean f3674m;

    /* renamed from: n */
    public boolean f3675n;

    /* renamed from: o */
    public HashMap<AbstractC0519j0, Integer> f3676o;

    /* renamed from: p */
    public C0545v0 f3677p;

    /* renamed from: q */
    public C0542u.e f3678q;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/x$a.class
     */
    /* renamed from: androidx.leanback.widget.x$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x$a.class */
    public class a implements InterfaceC0500c0 {

        /* renamed from: a */
        public final d f3679a;

        /* renamed from: b */
        public final C0548x f3680b;

        public a(C0548x c0548x, d dVar) {
            this.f3680b = c0548x;
            this.f3679a = dVar;
        }

        @Override // androidx.leanback.widget.InterfaceC0500c0
        /* renamed from: a */
        public void mo2570a(ViewGroup viewGroup, View view, int i10, long j10) {
            this.f3680b.m3074W(this.f3679a, view, true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/x$b.class
     */
    /* renamed from: androidx.leanback.widget.x$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x$b.class */
    public class b implements AbstractC0496b.e {

        /* renamed from: a */
        public final d f3681a;

        /* renamed from: b */
        public final C0548x f3682b;

        public b(C0548x c0548x, d dVar) {
            this.f3682b = c0548x;
            this.f3681a = dVar;
        }

        @Override // androidx.leanback.widget.AbstractC0496b.e
        /* renamed from: a */
        public boolean mo2563a(KeyEvent keyEvent) {
            return this.f3681a.m2971e() != null && this.f3681a.m2971e().onKey(this.f3681a.f3459a, keyEvent.getKeyCode(), keyEvent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/x$c.class
     */
    /* renamed from: androidx.leanback.widget.x$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x$c.class */
    public class c extends C0542u {

        /* renamed from: l */
        public d f3683l;

        /* renamed from: m */
        public final C0548x f3684m;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/leanback/widget/x$c$a.class
         */
        /* renamed from: androidx.leanback.widget.x$c$a */
        /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x$c$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final C0542u.d f3685b;

            /* renamed from: c */
            public final c f3686c;

            public a(c cVar, C0542u.d dVar) {
                this.f3686c = cVar;
                this.f3685b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0542u.d dVar = (C0542u.d) this.f3686c.f3683l.f3688q.m3939i0(this.f3685b.f4620a);
                if (this.f3686c.f3683l.m2969b() != null) {
                    InterfaceC0499c m2969b = this.f3686c.f3683l.m2969b();
                    AbstractC0519j0.a aVar = this.f3685b.f3625v;
                    Object obj = dVar.f3627x;
                    d dVar2 = this.f3686c.f3683l;
                    m2969b.mo2569a(aVar, obj, dVar2, (C0546w) dVar2.f3591e);
                }
            }
        }

        public c(C0548x c0548x, d dVar) {
            this.f3684m = c0548x;
            this.f3683l = dVar;
        }

        @Override // androidx.leanback.widget.C0542u
        /* renamed from: f0 */
        public void mo3005f0(AbstractC0519j0 abstractC0519j0, int i10) {
            this.f3683l.m3079o().getRecycledViewPool().m4270k(i10, this.f3684m.m3064L(abstractC0519j0));
        }

        @Override // androidx.leanback.widget.C0542u
        /* renamed from: g0 */
        public void mo3006g0(C0542u.d dVar) {
            this.f3684m.m3060H(this.f3683l, dVar.f4620a);
            this.f3683l.m2979m(dVar.f4620a);
        }

        @Override // androidx.leanback.widget.C0542u
        /* renamed from: h0 */
        public void mo3007h0(C0542u.d dVar) {
            if (this.f3683l.m2969b() != null) {
                dVar.f3625v.f3459a.setOnClickListener(new a(this, dVar));
            }
        }

        @Override // androidx.leanback.widget.C0542u
        /* renamed from: i0 */
        public void mo3008i0(C0542u.d dVar) {
            View view = dVar.f4620a;
            if (view instanceof ViewGroup) {
                C0462a.m2451a((ViewGroup) view, true);
            }
            C0545v0 c0545v0 = this.f3684m.f3677p;
            if (c0545v0 != null) {
                c0545v0.m3042f(dVar.f4620a);
            }
        }

        @Override // androidx.leanback.widget.C0542u
        /* renamed from: k0 */
        public void mo3010k0(C0542u.d dVar) {
            if (this.f3683l.m2969b() != null) {
                dVar.f3625v.f3459a.setOnClickListener(null);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/x$d.class
     */
    /* renamed from: androidx.leanback.widget.x$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/x$d.class */
    public static class d extends AbstractC0537r0.b {

        /* renamed from: p */
        public final C0548x f3687p;

        /* renamed from: q */
        public final HorizontalGridView f3688q;

        /* renamed from: r */
        public C0542u f3689r;

        /* renamed from: s */
        public final C0530p f3690s;

        /* renamed from: t */
        public final int f3691t;

        /* renamed from: u */
        public final int f3692u;

        /* renamed from: v */
        public final int f3693v;

        /* renamed from: w */
        public final int f3694w;

        public d(View view, HorizontalGridView horizontalGridView, C0548x c0548x) {
            super(view);
            this.f3690s = new C0530p();
            this.f3688q = horizontalGridView;
            this.f3687p = c0548x;
            this.f3691t = horizontalGridView.getPaddingTop();
            this.f3692u = horizontalGridView.getPaddingBottom();
            this.f3693v = horizontalGridView.getPaddingLeft();
            this.f3694w = horizontalGridView.getPaddingRight();
        }

        /* renamed from: n */
        public final C0542u m3078n() {
            return this.f3689r;
        }

        /* renamed from: o */
        public final HorizontalGridView m3079o() {
            return this.f3688q;
        }
    }

    public C0548x() {
        this(2);
    }

    public C0548x(int i10) {
        this(i10, false);
    }

    public C0548x(int i10, boolean z10) {
        this.f3666e = 1;
        this.f3672k = true;
        this.f3673l = -1;
        this.f3674m = true;
        this.f3675n = true;
        this.f3676o = new HashMap<>();
        if (!C0514h.m2636b(i10)) {
            throw new IllegalArgumentException("Unhandled zoom factor");
        }
        this.f3670i = i10;
        this.f3671j = z10;
    }

    /* renamed from: P */
    public static void m3059P(Context context) {
        if (f3663r == 0) {
            f3663r = context.getResources().getDimensionPixelSize(C9790c.f44937c);
            f3664s = context.getResources().getDimensionPixelSize(C9790c.f44936b);
            f3665t = context.getResources().getDimensionPixelSize(C9790c.f44935a);
        }
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: A */
    public void mo2943A(AbstractC0537r0.b bVar) {
        d dVar = (d) bVar;
        dVar.f3688q.setAdapter(null);
        dVar.f3689r.m3003d0();
        super.mo2943A(bVar);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: B */
    public void mo2944B(AbstractC0537r0.b bVar, boolean z10) {
        super.mo2944B(bVar, z10);
        ((d) bVar).f3688q.setChildrenVisibility(z10 ? 0 : 4);
    }

    /* renamed from: H */
    public void m3060H(d dVar, View view) {
        C0545v0 c0545v0 = this.f3677p;
        if (c0545v0 == null || !c0545v0.m3040d()) {
            return;
        }
        this.f3677p.m3044j(view, dVar.f3598l.m42179b().getColor());
    }

    /* renamed from: I */
    public final boolean m3061I() {
        return this.f3674m;
    }

    /* renamed from: J */
    public C0545v0.b m3062J() {
        return C0545v0.b.f3656d;
    }

    /* renamed from: K */
    public int m3063K() {
        int i10 = this.f3668g;
        if (i10 == 0) {
            i10 = this.f3667f;
        }
        return i10;
    }

    /* renamed from: L */
    public int m3064L(AbstractC0519j0 abstractC0519j0) {
        return this.f3676o.containsKey(abstractC0519j0) ? this.f3676o.get(abstractC0519j0).intValue() : 24;
    }

    /* renamed from: M */
    public int m3065M() {
        return this.f3667f;
    }

    /* renamed from: N */
    public final boolean m3066N() {
        return this.f3672k;
    }

    /* renamed from: O */
    public final int m3067O(d dVar) {
        C0535q0.a m2968a = dVar.m2968a();
        if (m2968a != null) {
            return m2953l() != null ? m2953l().m2935j(m2968a) : m2968a.f3459a.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: Q */
    public boolean m3068Q() {
        return true;
    }

    /* renamed from: R */
    public boolean m3069R() {
        return C0545v0.m3037q();
    }

    /* renamed from: S */
    public boolean m3070S(Context context) {
        return !C0004a.m20c(context).m24d();
    }

    /* renamed from: T */
    public boolean m3071T(Context context) {
        return !C0004a.m20c(context).m25f();
    }

    /* renamed from: U */
    public final boolean m3072U() {
        return m3068Q() && m2955n();
    }

    /* renamed from: V */
    public final boolean m3073V() {
        return m3069R() && m3066N();
    }

    /* renamed from: W */
    public void m3074W(d dVar, View view, boolean z10) {
        if (view == null) {
            if (this.f3669h != null) {
                dVar.f3690s.m2707j();
            }
            if (!z10 || dVar.m2970d() == null) {
                return;
            }
            dVar.m2970d().mo2579a(null, null, dVar, dVar.f3591e);
            return;
        }
        if (dVar.f3594h) {
            C0542u.d dVar2 = (C0542u.d) dVar.f3688q.m3939i0(view);
            if (this.f3669h != null) {
                dVar.f3690s.m2914k(dVar.f3688q, view, dVar2.f3627x);
            }
            if (!z10 || dVar.m2970d() == null) {
                return;
            }
            dVar.m2970d().mo2579a(dVar2.f3625v, dVar2.f3627x, dVar, dVar.f3591e);
        }
    }

    /* renamed from: X */
    public final void m3075X(d dVar) {
        int i10;
        int i11;
        int i12;
        if (dVar.m2974h()) {
            i12 = (dVar.m2975i() ? f3664s : dVar.f3691t) - m3067O(dVar);
            i10 = i12;
            if (this.f3669h == null) {
                i11 = f3665t;
            }
            i12 = i10;
            i11 = dVar.f3692u;
        } else if (dVar.m2975i()) {
            i11 = f3663r;
            i12 = i11 - dVar.f3692u;
        } else {
            i10 = 0;
            i12 = i10;
            i11 = dVar.f3692u;
        }
        dVar.m3079o().setPadding(dVar.f3693v, i12, dVar.f3694w, i11);
    }

    /* renamed from: Y */
    public final void m3076Y(C0550y c0550y) {
        HorizontalGridView gridView = c0550y.getGridView();
        if (this.f3673l < 0) {
            TypedArray obtainStyledAttributes = gridView.getContext().obtainStyledAttributes(C9799l.f45079k);
            this.f3673l = (int) obtainStyledAttributes.getDimension(C9799l.f45081l, 0.0f);
            obtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f3673l);
    }

    /* renamed from: Z */
    public final void m3077Z(d dVar) {
        if (!dVar.f3595i || !dVar.f3594h) {
            if (this.f3669h != null) {
                dVar.f3690s.m2707j();
            }
        } else {
            AbstractC0521k0 abstractC0521k0 = this.f3669h;
            if (abstractC0521k0 != null) {
                dVar.f3690s.m2700c((ViewGroup) dVar.f3459a, abstractC0521k0);
            }
            HorizontalGridView horizontalGridView = dVar.f3688q;
            C0542u.d dVar2 = (C0542u.d) horizontalGridView.m3922b0(horizontalGridView.getSelectedPosition());
            m3074W(dVar, dVar2 == null ? null : dVar2.f4620a, false);
        }
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: i */
    public AbstractC0537r0.b mo2950i(ViewGroup viewGroup) {
        m3059P(viewGroup.getContext());
        C0550y c0550y = new C0550y(viewGroup.getContext());
        m3076Y(c0550y);
        if (this.f3667f != 0) {
            c0550y.getGridView().setRowHeight(this.f3667f);
        }
        return new d(c0550y, c0550y.getGridView(), this);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: j */
    public void mo2951j(AbstractC0537r0.b bVar, boolean z10) {
        d dVar = (d) bVar;
        HorizontalGridView horizontalGridView = dVar.f3688q;
        C0542u.d dVar2 = (C0542u.d) horizontalGridView.m3922b0(horizontalGridView.getSelectedPosition());
        if (dVar2 == null) {
            super.mo2951j(bVar, z10);
        } else {
            if (!z10 || bVar.m2970d() == null) {
                return;
            }
            bVar.m2970d().mo2579a(dVar2.m3023T(), dVar2.f3627x, dVar, dVar.m2972f());
        }
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: k */
    public void mo2952k(AbstractC0537r0.b bVar, boolean z10) {
        d dVar = (d) bVar;
        dVar.f3688q.setScrollEnabled(!z10);
        dVar.f3688q.setAnimateChildLayout(!z10);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: p */
    public void mo2957p(AbstractC0537r0.b bVar) {
        super.mo2957p(bVar);
        d dVar = (d) bVar;
        Context context = bVar.f3459a.getContext();
        if (this.f3677p == null) {
            C0545v0 m3047a = new C0545v0.a().m3049c(m3072U()).m3051e(m3073V()).m3050d(m3070S(context) && m3061I()).m3053g(m3071T(context)).m3048b(this.f3675n).m3052f(m3062J()).m3047a(context);
            this.f3677p = m3047a;
            if (m3047a.m3041e()) {
                this.f3678q = new C0544v(this.f3677p);
            }
        }
        c cVar = new c(this, dVar);
        dVar.f3689r = cVar;
        cVar.m3019q0(this.f3678q);
        this.f3677p.m3043g(dVar.f3688q);
        C0514h.m2637c(dVar.f3689r, this.f3670i, this.f3671j);
        dVar.f3688q.setFocusDrawingOrderEnabled(this.f3677p.m3039c() != 3);
        dVar.f3688q.setOnChildSelectedListener(new a(this, dVar));
        dVar.f3688q.setOnUnhandledKeyListener(new b(this, dVar));
        dVar.f3688q.setNumRows(this.f3666e);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: r */
    public final boolean mo2959r() {
        return false;
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: u */
    public void mo2962u(AbstractC0537r0.b bVar, Object obj) {
        super.mo2962u(bVar, obj);
        d dVar = (d) bVar;
        C0546w c0546w = (C0546w) obj;
        dVar.f3689r.m3011l0(c0546w.m3057b());
        dVar.f3688q.setAdapter(dVar.f3689r);
        dVar.f3688q.setContentDescription(c0546w.m3058c());
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: x */
    public void mo2965x(AbstractC0537r0.b bVar, boolean z10) {
        super.mo2965x(bVar, z10);
        d dVar = (d) bVar;
        if (m3065M() != m3063K()) {
            dVar.m3079o().setRowHeight(z10 ? m3063K() : m3065M());
        }
        m3075X(dVar);
        m3077Z(dVar);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: y */
    public void mo2966y(AbstractC0537r0.b bVar, boolean z10) {
        super.mo2966y(bVar, z10);
        d dVar = (d) bVar;
        m3075X(dVar);
        m3077Z(dVar);
    }

    @Override // androidx.leanback.widget.AbstractC0537r0
    /* renamed from: z */
    public void mo2967z(AbstractC0537r0.b bVar) {
        super.mo2967z(bVar);
        d dVar = (d) bVar;
        int childCount = dVar.f3688q.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m3060H(dVar, dVar.f3688q.getChildAt(i10));
        }
    }
}
