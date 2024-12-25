package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC0494a0;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/u.class
 */
/* renamed from: androidx.leanback.widget.u */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u.class */
public class C0542u extends RecyclerView.AbstractC0677h implements InterfaceC0508f {

    /* renamed from: e */
    public AbstractC0494a0 f3614e;

    /* renamed from: f */
    public e f3615f;

    /* renamed from: g */
    public AbstractC0521k0 f3616g;

    /* renamed from: h */
    public InterfaceC0511g f3617h;

    /* renamed from: i */
    public b f3618i;

    /* renamed from: j */
    public ArrayList<AbstractC0519j0> f3619j = new ArrayList<>();

    /* renamed from: k */
    public AbstractC0494a0.b f3620k = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/u$a.class
     */
    /* renamed from: androidx.leanback.widget.u$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u$a.class */
    public class a extends AbstractC0494a0.b {

        /* renamed from: a */
        public final C0542u f3621a;

        public a(C0542u c0542u) {
            this.f3621a = c0542u;
        }

        @Override // androidx.leanback.widget.AbstractC0494a0.b
        /* renamed from: a */
        public void mo2546a() {
            this.f3621a.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/u$b.class
     */
    /* renamed from: androidx.leanback.widget.u$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u$b.class */
    public static class b {
        /* renamed from: a */
        public void mo2431a(AbstractC0519j0 abstractC0519j0, int i10) {
            throw null;
        }

        /* renamed from: b */
        public void mo2432b(d dVar) {
            throw null;
        }

        /* renamed from: c */
        public void mo2433c(d dVar) {
            throw null;
        }

        /* renamed from: d */
        public void m3020d(d dVar, List list) {
            mo2433c(dVar);
        }

        /* renamed from: e */
        public void mo2434e(d dVar) {
            throw null;
        }

        /* renamed from: f */
        public void mo2435f(d dVar) {
            throw null;
        }

        /* renamed from: g */
        public void mo2436g(d dVar) {
            throw null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/u$c.class
     */
    /* renamed from: androidx.leanback.widget.u$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u$c.class */
    public final class c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public View.OnFocusChangeListener f3622b;

        /* renamed from: c */
        public final C0542u f3623c;

        public c(C0542u c0542u) {
            this.f3623c = c0542u;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            View view2 = view;
            if (this.f3623c.f3615f != null) {
                view2 = (View) view.getParent();
            }
            InterfaceC0511g interfaceC0511g = this.f3623c.f3617h;
            if (interfaceC0511g != null) {
                interfaceC0511g.mo2598a(view2, z10);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f3622b;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view2, z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/u$d.class
     */
    /* renamed from: androidx.leanback.widget.u$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u$d.class */
    public class d extends RecyclerView.AbstractC0674e0 implements InterfaceC0505e {

        /* renamed from: u */
        public final AbstractC0519j0 f3624u;

        /* renamed from: v */
        public final AbstractC0519j0.a f3625v;

        /* renamed from: w */
        public final c f3626w;

        /* renamed from: x */
        public Object f3627x;

        /* renamed from: y */
        public Object f3628y;

        /* renamed from: z */
        public final C0542u f3629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0542u c0542u, AbstractC0519j0 abstractC0519j0, View view, AbstractC0519j0.a aVar) {
            super(view);
            this.f3629z = c0542u;
            this.f3626w = new c(c0542u);
            this.f3624u = abstractC0519j0;
            this.f3625v = aVar;
        }

        /* renamed from: R */
        public final Object m3021R() {
            return this.f3628y;
        }

        /* renamed from: S */
        public final AbstractC0519j0 m3022S() {
            return this.f3624u;
        }

        /* renamed from: T */
        public final AbstractC0519j0.a m3023T() {
            return this.f3625v;
        }

        /* renamed from: U */
        public void m3024U(Object obj) {
            this.f3628y = obj;
        }

        @Override // androidx.leanback.widget.InterfaceC0505e
        /* renamed from: c */
        public Object mo2581c(Class<?> cls) {
            return this.f3625v.mo2581c(cls);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/u$e.class
     */
    /* renamed from: androidx.leanback.widget.u$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/u$e.class */
    public static abstract class e {
        /* renamed from: a */
        public abstract View mo3025a(View view);

        /* renamed from: b */
        public abstract void mo3026b(View view, View view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    public final void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        d dVar = (d) abstractC0674e0;
        Object mo2535a = this.f3614e.mo2535a(i10);
        dVar.f3627x = mo2535a;
        dVar.f3624u.mo2652b(dVar.f3625v, mo2535a);
        mo3007h0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.mo2433c(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: I */
    public final void mo2997I(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, List list) {
        d dVar = (d) abstractC0674e0;
        Object mo2535a = this.f3614e.mo2535a(i10);
        dVar.f3627x = mo2535a;
        dVar.f3624u.m2653d(dVar.f3625v, mo2535a, list);
        mo3007h0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.m3020d(dVar, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: J */
    public final RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
        AbstractC0519j0.a mo2654e;
        View view;
        AbstractC0519j0 abstractC0519j0 = this.f3619j.get(i10);
        e eVar = this.f3615f;
        if (eVar != null) {
            View mo3025a = eVar.mo3025a(viewGroup);
            AbstractC0519j0.a mo2654e2 = abstractC0519j0.mo2654e(viewGroup);
            this.f3615f.mo3026b(mo3025a, mo2654e2.f3459a);
            view = mo3025a;
            mo2654e = mo2654e2;
        } else {
            mo2654e = abstractC0519j0.mo2654e(viewGroup);
            view = mo2654e.f3459a;
        }
        d dVar = new d(this, abstractC0519j0, view, mo2654e);
        mo3008i0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.mo2434e(dVar);
        }
        View view2 = dVar.f3625v.f3459a;
        if (view2 != null) {
            dVar.f3626w.f3622b = view2.getOnFocusChangeListener();
            view2.setOnFocusChangeListener(dVar.f3626w);
        }
        InterfaceC0511g interfaceC0511g = this.f3617h;
        if (interfaceC0511g != null) {
            interfaceC0511g.mo2599b(view);
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: N */
    public final boolean mo2999N(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        mo3002T(abstractC0674e0);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: O */
    public final void mo3000O(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        d dVar = (d) abstractC0674e0;
        mo3006g0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.mo2432b(dVar);
        }
        dVar.f3624u.mo2656g(dVar.f3625v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: S */
    public final void mo3001S(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        d dVar = (d) abstractC0674e0;
        dVar.f3624u.mo2657h(dVar.f3625v);
        m3009j0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.mo2435f(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: T */
    public final void mo3002T(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        d dVar = (d) abstractC0674e0;
        dVar.f3624u.mo2655f(dVar.f3625v);
        mo3010k0(dVar);
        b bVar = this.f3618i;
        if (bVar != null) {
            bVar.mo2436g(dVar);
        }
        dVar.f3627x = null;
    }

    /* renamed from: d0 */
    public void m3003d0() {
        m3011l0(null);
    }

    /* renamed from: e0 */
    public ArrayList<AbstractC0519j0> m3004e0() {
        return this.f3619j;
    }

    @Override // androidx.leanback.widget.InterfaceC0508f
    /* renamed from: f */
    public InterfaceC0505e mo2583f(int i10) {
        return this.f3619j.get(i10);
    }

    /* renamed from: f0 */
    public void mo3005f0(AbstractC0519j0 abstractC0519j0, int i10) {
    }

    /* renamed from: g0 */
    public void mo3006g0(d dVar) {
    }

    /* renamed from: h0 */
    public void mo3007h0(d dVar) {
    }

    /* renamed from: i0 */
    public void mo3008i0(d dVar) {
    }

    /* renamed from: j0 */
    public void m3009j0(d dVar) {
    }

    /* renamed from: k0 */
    public void mo3010k0(d dVar) {
    }

    /* renamed from: l0 */
    public void m3011l0(AbstractC0494a0 abstractC0494a0) {
        AbstractC0494a0 abstractC0494a02 = this.f3614e;
        if (abstractC0494a0 == abstractC0494a02) {
            return;
        }
        if (abstractC0494a02 != null) {
            abstractC0494a02.m2544j(this.f3620k);
        }
        this.f3614e = abstractC0494a0;
        if (abstractC0494a0 == null) {
            m4099w();
            return;
        }
        abstractC0494a0.m2542g(this.f3620k);
        if (m4098u() != this.f3614e.m2539d()) {
            m4091X(this.f3614e.m2539d());
        }
        m4099w();
    }

    /* renamed from: m0 */
    public void m3012m0(b bVar) {
        this.f3618i = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        AbstractC0494a0 abstractC0494a0 = this.f3614e;
        return abstractC0494a0 != null ? abstractC0494a0.mo2536i() : 0;
    }

    /* renamed from: n0 */
    public void m3014n0(InterfaceC0511g interfaceC0511g) {
        this.f3617h = interfaceC0511g;
    }

    /* renamed from: o0 */
    public void m3015o0(AbstractC0521k0 abstractC0521k0) {
        this.f3616g = abstractC0521k0;
        m4099w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: p */
    public long mo3016p(int i10) {
        return this.f3614e.m2537b(i10);
    }

    /* renamed from: p0 */
    public void m3017p0(ArrayList<AbstractC0519j0> arrayList) {
        this.f3619j = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        AbstractC0521k0 abstractC0521k0 = this.f3616g;
        if (abstractC0521k0 == null) {
            abstractC0521k0 = this.f3614e.m2538c();
        }
        AbstractC0519j0 mo2661a = abstractC0521k0.mo2661a(this.f3614e.mo2535a(i10));
        int indexOf = this.f3619j.indexOf(mo2661a);
        int i11 = indexOf;
        if (indexOf < 0) {
            this.f3619j.add(mo2661a);
            int indexOf2 = this.f3619j.indexOf(mo2661a);
            mo3005f0(mo2661a, indexOf2);
            b bVar = this.f3618i;
            i11 = indexOf2;
            if (bVar != null) {
                bVar.mo2431a(mo2661a, indexOf2);
                i11 = indexOf2;
            }
        }
        return i11;
    }

    /* renamed from: q0 */
    public void m3019q0(e eVar) {
        this.f3615f = eVar;
    }
}
