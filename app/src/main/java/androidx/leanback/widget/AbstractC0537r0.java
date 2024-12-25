package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.leanback.widget.C0535q0;
import p432z0.C10028a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/r0.class
 */
/* renamed from: androidx.leanback.widget.r0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/r0.class */
public abstract class AbstractC0537r0 extends AbstractC0519j0 {

    /* renamed from: b */
    public C0535q0 f3585b;

    /* renamed from: c */
    public boolean f3586c;

    /* renamed from: d */
    public int f3587d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/r0$a.class
     */
    /* renamed from: androidx.leanback.widget.r0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/r0$a.class */
    public static class a extends AbstractC0519j0.a {

        /* renamed from: c */
        public final b f3588c;

        public a(C0531p0 c0531p0, b bVar) {
            super(c0531p0);
            c0531p0.m2916b(bVar.f3459a);
            C0535q0.a aVar = bVar.f3590d;
            if (aVar != null) {
                c0531p0.m2915a(aVar.f3459a);
            }
            this.f3588c = bVar;
            bVar.f3589c = this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/r0$b.class
     */
    /* renamed from: androidx.leanback.widget.r0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/r0$b.class */
    public static class b extends AbstractC0519j0.a {

        /* renamed from: c */
        public a f3589c;

        /* renamed from: d */
        public C0535q0.a f3590d;

        /* renamed from: e */
        public C0529o0 f3591e;

        /* renamed from: f */
        public Object f3592f;

        /* renamed from: g */
        public int f3593g;

        /* renamed from: h */
        public boolean f3594h;

        /* renamed from: i */
        public boolean f3595i;

        /* renamed from: j */
        public boolean f3596j;

        /* renamed from: k */
        public float f3597k;

        /* renamed from: l */
        public final C10028a f3598l;

        /* renamed from: m */
        public View.OnKeyListener f3599m;

        /* renamed from: n */
        public InterfaceC0502d f3600n;

        /* renamed from: o */
        public InterfaceC0499c f3601o;

        public b(View view) {
            super(view);
            this.f3593g = 0;
            this.f3597k = 0.0f;
            this.f3598l = C10028a.m42178a(view.getContext());
        }

        /* renamed from: a */
        public final C0535q0.a m2968a() {
            return this.f3590d;
        }

        /* renamed from: b */
        public final InterfaceC0499c m2969b() {
            return this.f3601o;
        }

        /* renamed from: d */
        public final InterfaceC0502d m2970d() {
            return this.f3600n;
        }

        /* renamed from: e */
        public View.OnKeyListener m2971e() {
            return this.f3599m;
        }

        /* renamed from: f */
        public final C0529o0 m2972f() {
            return this.f3591e;
        }

        /* renamed from: g */
        public final Object m2973g() {
            return this.f3592f;
        }

        /* renamed from: h */
        public final boolean m2974h() {
            return this.f3595i;
        }

        /* renamed from: i */
        public final boolean m2975i() {
            return this.f3594h;
        }

        /* renamed from: j */
        public final void m2976j(boolean z10) {
            this.f3593g = z10 ? 1 : 2;
        }

        /* renamed from: k */
        public final void m2977k(InterfaceC0499c interfaceC0499c) {
            this.f3601o = interfaceC0499c;
        }

        /* renamed from: l */
        public final void m2978l(InterfaceC0502d interfaceC0502d) {
            this.f3600n = interfaceC0502d;
        }

        /* renamed from: m */
        public final void m2979m(View view) {
            int i10 = this.f3593g;
            if (i10 == 1) {
                view.setActivated(true);
            } else if (i10 == 2) {
                view.setActivated(false);
            }
        }
    }

    public AbstractC0537r0() {
        C0535q0 c0535q0 = new C0535q0();
        this.f3585b = c0535q0;
        this.f3586c = true;
        this.f3587d = 1;
        c0535q0.m2937l(true);
    }

    /* renamed from: A */
    public void mo2943A(b bVar) {
        C0535q0.a aVar = bVar.f3590d;
        if (aVar != null) {
            this.f3585b.mo2655f(aVar);
        }
        bVar.f3591e = null;
        bVar.f3592f = null;
    }

    /* renamed from: B */
    public void mo2944B(b bVar, boolean z10) {
        C0535q0.a aVar = bVar.f3590d;
        if (aVar == null || aVar.f3459a.getVisibility() == 8) {
            return;
        }
        bVar.f3590d.f3459a.setVisibility(z10 ? 0 : 4);
    }

    /* renamed from: C */
    public final void m2945C(AbstractC0519j0.a aVar, boolean z10) {
        b m2954m = m2954m(aVar);
        m2954m.f3595i = z10;
        mo2965x(m2954m, z10);
    }

    /* renamed from: D */
    public final void m2946D(AbstractC0519j0.a aVar, boolean z10) {
        b m2954m = m2954m(aVar);
        m2954m.f3594h = z10;
        mo2966y(m2954m, z10);
    }

    /* renamed from: E */
    public final void m2947E(AbstractC0519j0.a aVar, float f10) {
        b m2954m = m2954m(aVar);
        m2954m.f3597k = f10;
        mo2967z(m2954m);
    }

    /* renamed from: F */
    public final void m2948F(b bVar, View view) {
        boolean m2974h;
        int i10 = this.f3587d;
        boolean z10 = true;
        if (i10 == 1) {
            m2974h = bVar.m2974h();
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (!bVar.m2974h() || !bVar.m2975i()) {
                        z10 = false;
                    }
                    bVar.m2976j(z10);
                }
                bVar.m2979m(view);
            }
            m2974h = bVar.m2975i();
        }
        bVar.m2976j(m2974h);
        bVar.m2979m(view);
    }

    /* renamed from: G */
    public final void m2949G(b bVar) {
        if (this.f3585b == null || bVar.f3590d == null) {
            return;
        }
        ((C0531p0) bVar.f3589c.f3459a).m2918d(bVar.m2974h());
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: b */
    public final void mo2652b(AbstractC0519j0.a aVar, Object obj) {
        mo2962u(m2954m(aVar), obj);
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: e */
    public final AbstractC0519j0.a mo2654e(ViewGroup viewGroup) {
        AbstractC0519j0.a aVar;
        b mo2950i = mo2950i(viewGroup);
        mo2950i.f3596j = false;
        if (m2961t()) {
            C0531p0 c0531p0 = new C0531p0(viewGroup.getContext());
            C0535q0 c0535q0 = this.f3585b;
            if (c0535q0 != null) {
                mo2950i.f3590d = (C0535q0.a) c0535q0.mo2654e((ViewGroup) mo2950i.f3459a);
            }
            aVar = new a(c0531p0, mo2950i);
        } else {
            aVar = mo2950i;
        }
        mo2957p(mo2950i);
        if (mo2950i.f3596j) {
            return aVar;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: f */
    public final void mo2655f(AbstractC0519j0.a aVar) {
        mo2943A(m2954m(aVar));
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: g */
    public final void mo2656g(AbstractC0519j0.a aVar) {
        m2963v(m2954m(aVar));
    }

    @Override // androidx.leanback.widget.AbstractC0519j0
    /* renamed from: h */
    public final void mo2657h(AbstractC0519j0.a aVar) {
        m2964w(m2954m(aVar));
    }

    /* renamed from: i */
    public abstract b mo2950i(ViewGroup viewGroup);

    /* renamed from: j */
    public void mo2951j(b bVar, boolean z10) {
        InterfaceC0502d interfaceC0502d;
        if (!z10 || (interfaceC0502d = bVar.f3600n) == null) {
            return;
        }
        interfaceC0502d.mo2579a(null, null, bVar, bVar.m2973g());
    }

    /* renamed from: k */
    public void mo2952k(b bVar, boolean z10) {
    }

    /* renamed from: l */
    public final C0535q0 m2953l() {
        return this.f3585b;
    }

    /* renamed from: m */
    public final b m2954m(AbstractC0519j0.a aVar) {
        return aVar instanceof a ? ((a) aVar).f3588c : (b) aVar;
    }

    /* renamed from: n */
    public final boolean m2955n() {
        return this.f3586c;
    }

    /* renamed from: o */
    public final float m2956o(AbstractC0519j0.a aVar) {
        return m2954m(aVar).f3597k;
    }

    /* renamed from: p */
    public void mo2957p(b bVar) {
        bVar.f3596j = true;
        if (m2958q()) {
            return;
        }
        View view = bVar.f3459a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        a aVar = bVar.f3589c;
        if (aVar != null) {
            ((ViewGroup) aVar.f3459a).setClipChildren(false);
        }
    }

    /* renamed from: q */
    public boolean m2958q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo2959r() {
        return true;
    }

    /* renamed from: s */
    public final boolean m2960s() {
        return mo2959r() && m2955n();
    }

    /* renamed from: t */
    public final boolean m2961t() {
        return this.f3585b != null || m2960s();
    }

    /* renamed from: u */
    public void mo2962u(b bVar, Object obj) {
        bVar.f3592f = obj;
        bVar.f3591e = obj instanceof C0529o0 ? (C0529o0) obj : null;
        if (bVar.f3590d == null || bVar.m2972f() == null) {
            return;
        }
        this.f3585b.mo2652b(bVar.f3590d, obj);
    }

    /* renamed from: v */
    public void m2963v(b bVar) {
        C0535q0.a aVar = bVar.f3590d;
        if (aVar != null) {
            this.f3585b.mo2656g(aVar);
        }
    }

    /* renamed from: w */
    public void m2964w(b bVar) {
        C0535q0.a aVar = bVar.f3590d;
        if (aVar != null) {
            this.f3585b.mo2657h(aVar);
        }
        AbstractC0519j0.m2651a(bVar.f3459a);
    }

    /* renamed from: x */
    public void mo2965x(b bVar, boolean z10) {
        m2949G(bVar);
        m2948F(bVar, bVar.f3459a);
    }

    /* renamed from: y */
    public void mo2966y(b bVar, boolean z10) {
        mo2951j(bVar, z10);
        m2949G(bVar);
        m2948F(bVar, bVar.f3459a);
    }

    /* renamed from: z */
    public void mo2967z(b bVar) {
        if (m2955n()) {
            bVar.f3598l.m42180c(bVar.f3597k);
            C0535q0.a aVar = bVar.f3590d;
            if (aVar != null) {
                this.f3585b.m2938m(aVar, bVar.f3597k);
            }
            if (mo2959r()) {
                ((C0531p0) bVar.f3589c.f3459a).m2917c(bVar.f3598l.m42179b().getColor());
            }
        }
    }
}
