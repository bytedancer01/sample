package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.leanback.widget.AbstractC0537r0;
import androidx.leanback.widget.C0542u;
import androidx.leanback.widget.C0548x;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.InterfaceC0499c;
import androidx.leanback.widget.InterfaceC0502d;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p413y0.C9793f;
import p413y0.C9794g;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/app/b.class
 */
/* renamed from: androidx.leanback.app.b */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/app/b.class */
public class C0442b extends AbstractC0441a {

    /* renamed from: j */
    public C0542u.d f3117j;

    /* renamed from: k */
    public int f3118k;

    /* renamed from: m */
    public boolean f3120m;

    /* renamed from: p */
    public boolean f3123p;

    /* renamed from: q */
    public InterfaceC0502d f3124q;

    /* renamed from: r */
    public InterfaceC0499c f3125r;

    /* renamed from: s */
    public int f3126s;

    /* renamed from: u */
    public RecyclerView.C0691v f3128u;

    /* renamed from: v */
    public ArrayList<AbstractC0519j0> f3129v;

    /* renamed from: w */
    public C0542u.b f3130w;

    /* renamed from: l */
    public boolean f3119l = true;

    /* renamed from: n */
    public int f3121n = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: o */
    public boolean f3122o = true;

    /* renamed from: t */
    public Interpolator f3127t = new DecelerateInterpolator(2.0f);

    /* renamed from: x */
    public final C0542u.b f3131x = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/app/b$a.class
     */
    /* renamed from: androidx.leanback.app.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/app/b$a.class */
    public class a extends C0542u.b {

        /* renamed from: a */
        public final C0442b f3132a;

        public a(C0442b c0442b) {
            this.f3132a = c0442b;
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: a */
        public void mo2431a(AbstractC0519j0 abstractC0519j0, int i10) {
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2431a(abstractC0519j0, i10);
            }
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: b */
        public void mo2432b(C0542u.d dVar) {
            C0442b.m2423S(dVar, this.f3132a.f3119l);
            AbstractC0537r0 abstractC0537r0 = (AbstractC0537r0) dVar.m3022S();
            AbstractC0537r0.b m2954m = abstractC0537r0.m2954m(dVar.m3023T());
            abstractC0537r0.mo2944B(m2954m, this.f3132a.f3122o);
            abstractC0537r0.mo2952k(m2954m, this.f3132a.f3123p);
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2432b(dVar);
            }
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: c */
        public void mo2433c(C0542u.d dVar) {
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2433c(dVar);
            }
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: e */
        public void mo2434e(C0542u.d dVar) {
            VerticalGridView m2413u = this.f3132a.m2413u();
            if (m2413u != null) {
                m2413u.setClipChildren(false);
            }
            this.f3132a.m2430U(dVar);
            C0442b c0442b = this.f3132a;
            c0442b.f3120m = true;
            dVar.m3024U(new b(c0442b, dVar));
            C0442b.m2424T(dVar, false, true);
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2434e(dVar);
            }
            AbstractC0537r0.b m2954m = ((AbstractC0537r0) dVar.m3022S()).m2954m(dVar.m3023T());
            m2954m.m2978l(this.f3132a.f3124q);
            m2954m.m2977k(this.f3132a.f3125r);
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: f */
        public void mo2435f(C0542u.d dVar) {
            C0542u.d dVar2 = this.f3132a.f3117j;
            if (dVar2 == dVar) {
                C0442b.m2424T(dVar2, false, true);
                this.f3132a.f3117j = null;
            }
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2435f(dVar);
            }
        }

        @Override // androidx.leanback.widget.C0542u.b
        /* renamed from: g */
        public void mo2436g(C0542u.d dVar) {
            C0442b.m2424T(dVar, false, true);
            C0542u.b bVar = this.f3132a.f3130w;
            if (bVar != null) {
                bVar.mo2436g(dVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/app/b$b.class
     */
    /* renamed from: androidx.leanback.app.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/app/b$b.class */
    public final class b implements TimeAnimator.TimeListener {

        /* renamed from: a */
        public final AbstractC0537r0 f3133a;

        /* renamed from: b */
        public final AbstractC0519j0.a f3134b;

        /* renamed from: c */
        public final TimeAnimator f3135c;

        /* renamed from: d */
        public int f3136d;

        /* renamed from: e */
        public Interpolator f3137e;

        /* renamed from: f */
        public float f3138f;

        /* renamed from: g */
        public float f3139g;

        /* renamed from: h */
        public final C0442b f3140h;

        public b(C0442b c0442b, C0542u.d dVar) {
            this.f3140h = c0442b;
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f3135c = timeAnimator;
            this.f3133a = (AbstractC0537r0) dVar.m3022S();
            this.f3134b = dVar.m3023T();
            timeAnimator.setTimeListener(this);
        }

        /* renamed from: a */
        public void m2437a(boolean z10, boolean z11) {
            this.f3135c.end();
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                this.f3133a.m2947E(this.f3134b, f10);
                return;
            }
            if (this.f3133a.m2956o(this.f3134b) != f10) {
                C0442b c0442b = this.f3140h;
                this.f3136d = c0442b.f3126s;
                this.f3137e = c0442b.f3127t;
                float m2956o = this.f3133a.m2956o(this.f3134b);
                this.f3138f = m2956o;
                this.f3139g = f10 - m2956o;
                this.f3135c.start();
            }
        }

        /* renamed from: b */
        public void m2438b(long j10, long j11) {
            float f10;
            int i10 = this.f3136d;
            if (j10 >= i10) {
                f10 = 1.0f;
                this.f3135c.end();
            } else {
                f10 = (float) (j10 / i10);
            }
            Interpolator interpolator = this.f3137e;
            float f11 = f10;
            if (interpolator != null) {
                f11 = interpolator.getInterpolation(f10);
            }
            this.f3133a.m2947E(this.f3134b, this.f3138f + (f11 * this.f3139g));
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
            if (this.f3135c.isRunning()) {
                m2438b(j10, j11);
            }
        }
    }

    /* renamed from: I */
    public static AbstractC0537r0.b m2422I(C0542u.d dVar) {
        if (dVar == null) {
            return null;
        }
        return ((AbstractC0537r0) dVar.m3022S()).m2954m(dVar.m3023T());
    }

    /* renamed from: S */
    public static void m2423S(C0542u.d dVar, boolean z10) {
        ((AbstractC0537r0) dVar.m3022S()).m2945C(dVar.m3023T(), z10);
    }

    /* renamed from: T */
    public static void m2424T(C0542u.d dVar, boolean z10, boolean z11) {
        ((b) dVar.m3021R()).m2437a(z10, z11);
        ((AbstractC0537r0) dVar.m3022S()).m2946D(dVar.m3023T(), z10);
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: B */
    public /* bridge */ /* synthetic */ void mo2405B(int i10) {
        super.mo2405B(i10);
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: E */
    public /* bridge */ /* synthetic */ void mo2406E(int i10, boolean z10) {
        super.mo2406E(i10, z10);
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: F */
    public void mo2407F() {
        super.mo2407F();
        this.f3117j = null;
        this.f3120m = false;
        C0542u m2410p = m2410p();
        if (m2410p != null) {
            m2410p.m3012m0(this.f3131x);
        }
    }

    /* renamed from: G */
    public final void m2425G(boolean z10) {
        this.f3123p = z10;
        VerticalGridView m2413u = m2413u();
        if (m2413u != null) {
            int childCount = m2413u.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C0542u.d dVar = (C0542u.d) m2413u.m3939i0(m2413u.getChildAt(i10));
                AbstractC0537r0 abstractC0537r0 = (AbstractC0537r0) dVar.m3022S();
                abstractC0537r0.mo2952k(abstractC0537r0.m2954m(dVar.m3023T()), z10);
            }
        }
    }

    /* renamed from: J */
    public void m2426J(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return;
        }
        this.f3121n = i10;
        VerticalGridView m2413u = m2413u();
        if (m2413u != null) {
            m2413u.setItemAlignmentOffset(0);
            m2413u.setItemAlignmentOffsetPercent(-1.0f);
            m2413u.setItemAlignmentOffsetWithPadding(true);
            m2413u.setWindowAlignmentOffset(this.f3121n);
            m2413u.setWindowAlignmentOffsetPercent(-1.0f);
            m2413u.setWindowAlignment(0);
        }
    }

    /* renamed from: M */
    public void m2427M(boolean z10) {
        this.f3119l = z10;
        VerticalGridView m2413u = m2413u();
        if (m2413u != null) {
            int childCount = m2413u.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                m2423S((C0542u.d) m2413u.m3939i0(m2413u.getChildAt(i10)), this.f3119l);
            }
        }
    }

    /* renamed from: N */
    public void m2428N(InterfaceC0499c interfaceC0499c) {
        this.f3125r = interfaceC0499c;
        if (this.f3120m) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    /* renamed from: O */
    public void m2429O(InterfaceC0502d interfaceC0502d) {
        this.f3124q = interfaceC0502d;
        VerticalGridView m2413u = m2413u();
        if (m2413u != null) {
            int childCount = m2413u.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                m2422I((C0542u.d) m2413u.m3939i0(m2413u.getChildAt(i10))).m2978l(this.f3124q);
            }
        }
    }

    /* renamed from: U */
    public void m2430U(C0542u.d dVar) {
        AbstractC0537r0.b m2954m = ((AbstractC0537r0) dVar.m3022S()).m2954m(dVar.m3023T());
        if (m2954m instanceof C0548x.d) {
            C0548x.d dVar2 = (C0548x.d) m2954m;
            HorizontalGridView m3079o = dVar2.m3079o();
            RecyclerView.C0691v c0691v = this.f3128u;
            if (c0691v == null) {
                this.f3128u = m3079o.getRecycledViewPool();
            } else {
                m3079o.setRecycledViewPool(c0691v);
            }
            C0542u m3078n = dVar2.m3078n();
            ArrayList<AbstractC0519j0> arrayList = this.f3129v;
            if (arrayList == null) {
                this.f3129v = m3078n.m3004e0();
            } else {
                m3078n.m3017p0(arrayList);
            }
        }
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: m */
    public VerticalGridView mo2408m(View view) {
        return (VerticalGridView) view.findViewById(C9793f.f44982d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3126s = getResources().getInteger(C9794g.f45005a);
    }

    @Override // androidx.leanback.app.AbstractC0441a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.leanback.app.AbstractC0441a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f3120m = false;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.AbstractC0441a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.leanback.app.AbstractC0441a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m2413u().setItemAlignmentViewId(C9793f.f45002x);
        m2413u().setSaveChildrenPolicy(2);
        m2426J(this.f3121n);
        this.f3128u = null;
        this.f3129v = null;
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: q */
    public int mo2411q() {
        return C9795h.f45018i;
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: s */
    public /* bridge */ /* synthetic */ int mo2412s() {
        return super.mo2412s();
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: w */
    public void mo2414w(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11) {
        C0542u.d dVar = this.f3117j;
        if (dVar == abstractC0674e0 && this.f3118k == i11) {
            return;
        }
        this.f3118k = i11;
        if (dVar != null) {
            m2424T(dVar, false, false);
        }
        C0542u.d dVar2 = (C0542u.d) abstractC0674e0;
        this.f3117j = dVar2;
        if (dVar2 != null) {
            m2424T(dVar2, true, false);
        }
    }

    @Override // androidx.leanback.app.AbstractC0441a
    /* renamed from: x */
    public boolean mo2415x() {
        boolean mo2415x = super.mo2415x();
        if (mo2415x) {
            m2425G(true);
        }
        return mo2415x;
    }
}
