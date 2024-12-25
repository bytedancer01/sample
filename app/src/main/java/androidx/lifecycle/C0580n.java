package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0572g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p174k.C5436a;
import p190l.C5636a;
import p190l.C5637b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/n.class
 */
/* renamed from: androidx.lifecycle.n */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/n.class */
public class C0580n extends AbstractC0572g {

    /* renamed from: b */
    public C5636a<InterfaceC0578l, a> f3766b;

    /* renamed from: c */
    public AbstractC0572g.c f3767c;

    /* renamed from: d */
    public final WeakReference<InterfaceC0579m> f3768d;

    /* renamed from: e */
    public int f3769e;

    /* renamed from: f */
    public boolean f3770f;

    /* renamed from: g */
    public boolean f3771g;

    /* renamed from: h */
    public ArrayList<AbstractC0572g.c> f3772h;

    /* renamed from: i */
    public final boolean f3773i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/n$a.class
     */
    /* renamed from: androidx.lifecycle.n$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/n$a.class */
    public static class a {

        /* renamed from: a */
        public AbstractC0572g.c f3774a;

        /* renamed from: b */
        public InterfaceC0577k f3775b;

        public a(InterfaceC0578l interfaceC0578l, AbstractC0572g.c cVar) {
            this.f3775b = C0583q.m3180f(interfaceC0578l);
            this.f3774a = cVar;
        }

        /* renamed from: a */
        public void m3174a(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
            AbstractC0572g.c targetState = bVar.getTargetState();
            this.f3774a = C0580n.m3161k(this.f3774a, targetState);
            this.f3775b.mo775b(interfaceC0579m, bVar);
            this.f3774a = targetState;
        }
    }

    public C0580n(InterfaceC0579m interfaceC0579m) {
        this(interfaceC0579m, true);
    }

    public C0580n(InterfaceC0579m interfaceC0579m, boolean z10) {
        this.f3766b = new C5636a<>();
        this.f3769e = 0;
        this.f3770f = false;
        this.f3771g = false;
        this.f3772h = new ArrayList<>();
        this.f3768d = new WeakReference<>(interfaceC0579m);
        this.f3767c = AbstractC0572g.c.INITIALIZED;
        this.f3773i = z10;
    }

    /* renamed from: k */
    public static AbstractC0572g.c m3161k(AbstractC0572g.c cVar, AbstractC0572g.c cVar2) {
        AbstractC0572g.c cVar3 = cVar;
        if (cVar2 != null) {
            cVar3 = cVar;
            if (cVar2.compareTo(cVar) < 0) {
                cVar3 = cVar2;
            }
        }
        return cVar3;
    }

    @Override // androidx.lifecycle.AbstractC0572g
    /* renamed from: a */
    public void mo3154a(InterfaceC0578l interfaceC0578l) {
        InterfaceC0579m interfaceC0579m;
        m3164f("addObserver");
        AbstractC0572g.c cVar = this.f3767c;
        AbstractC0572g.c cVar2 = AbstractC0572g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0572g.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0578l, cVar2);
        if (this.f3766b.mo27808i(interfaceC0578l, aVar) == null && (interfaceC0579m = this.f3768d.get()) != null) {
            boolean z10 = this.f3769e != 0 || this.f3770f;
            AbstractC0572g.c m3163e = m3163e(interfaceC0578l);
            this.f3769e++;
            while (aVar.f3774a.compareTo(m3163e) < 0 && this.f3766b.contains(interfaceC0578l)) {
                m3171n(aVar.f3774a);
                AbstractC0572g.b upFrom = AbstractC0572g.b.upFrom(aVar.f3774a);
                if (upFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3774a);
                }
                aVar.m3174a(interfaceC0579m, upFrom);
                m3170m();
                m3163e = m3163e(interfaceC0578l);
            }
            if (!z10) {
                m3173p();
            }
            this.f3769e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0572g
    /* renamed from: b */
    public AbstractC0572g.c mo3155b() {
        return this.f3767c;
    }

    @Override // androidx.lifecycle.AbstractC0572g
    /* renamed from: c */
    public void mo3156c(InterfaceC0578l interfaceC0578l) {
        m3164f("removeObserver");
        this.f3766b.mo27809q(interfaceC0578l);
    }

    /* renamed from: d */
    public final void m3162d(InterfaceC0579m interfaceC0579m) {
        Iterator<Map.Entry<InterfaceC0578l, a>> descendingIterator = this.f3766b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3771g) {
            Map.Entry<InterfaceC0578l, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f3774a.compareTo(this.f3767c) > 0 && !this.f3771g && this.f3766b.contains(next.getKey())) {
                AbstractC0572g.b downFrom = AbstractC0572g.b.downFrom(value.f3774a);
                if (downFrom == null) {
                    throw new IllegalStateException("no event down from " + value.f3774a);
                }
                m3171n(downFrom.getTargetState());
                value.m3174a(interfaceC0579m, downFrom);
                m3170m();
            }
        }
    }

    /* renamed from: e */
    public final AbstractC0572g.c m3163e(InterfaceC0578l interfaceC0578l) {
        Map.Entry<InterfaceC0578l, a> m27810t = this.f3766b.m27810t(interfaceC0578l);
        AbstractC0572g.c cVar = null;
        AbstractC0572g.c cVar2 = m27810t != null ? m27810t.getValue().f3774a : null;
        if (!this.f3772h.isEmpty()) {
            ArrayList<AbstractC0572g.c> arrayList = this.f3772h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m3161k(m3161k(this.f3767c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    public final void m3164f(String str) {
        if (!this.f3773i || C5436a.m27181e().mo27183b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final void m3165g(InterfaceC0579m interfaceC0579m) {
        C5637b<InterfaceC0578l, a>.d m27812f = this.f3766b.m27812f();
        while (m27812f.hasNext() && !this.f3771g) {
            Map.Entry next = m27812f.next();
            a aVar = (a) next.getValue();
            while (aVar.f3774a.compareTo(this.f3767c) < 0 && !this.f3771g && this.f3766b.contains(next.getKey())) {
                m3171n(aVar.f3774a);
                AbstractC0572g.b upFrom = AbstractC0572g.b.upFrom(aVar.f3774a);
                if (upFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3774a);
                }
                aVar.m3174a(interfaceC0579m, upFrom);
                m3170m();
            }
        }
    }

    /* renamed from: h */
    public void m3166h(AbstractC0572g.b bVar) {
        m3164f("handleLifecycleEvent");
        m3169l(bVar.getTargetState());
    }

    /* renamed from: i */
    public final boolean m3167i() {
        boolean z10 = true;
        if (this.f3766b.size() == 0) {
            return true;
        }
        AbstractC0572g.c cVar = this.f3766b.m27811d().getValue().f3774a;
        AbstractC0572g.c cVar2 = this.f3766b.m27813g().getValue().f3774a;
        if (cVar != cVar2 || this.f3767c != cVar2) {
            z10 = false;
        }
        return z10;
    }

    @Deprecated
    /* renamed from: j */
    public void m3168j(AbstractC0572g.c cVar) {
        m3164f("markState");
        m3172o(cVar);
    }

    /* renamed from: l */
    public final void m3169l(AbstractC0572g.c cVar) {
        if (this.f3767c == cVar) {
            return;
        }
        this.f3767c = cVar;
        if (this.f3770f || this.f3769e != 0) {
            this.f3771g = true;
            return;
        }
        this.f3770f = true;
        m3173p();
        this.f3770f = false;
    }

    /* renamed from: m */
    public final void m3170m() {
        ArrayList<AbstractC0572g.c> arrayList = this.f3772h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    public final void m3171n(AbstractC0572g.c cVar) {
        this.f3772h.add(cVar);
    }

    /* renamed from: o */
    public void m3172o(AbstractC0572g.c cVar) {
        m3164f("setCurrentState");
        m3169l(cVar);
    }

    /* renamed from: p */
    public final void m3173p() {
        InterfaceC0579m interfaceC0579m = this.f3768d.get();
        if (interfaceC0579m == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean m3167i = m3167i();
            this.f3771g = false;
            if (m3167i) {
                return;
            }
            if (this.f3767c.compareTo(this.f3766b.m27811d().getValue().f3774a) < 0) {
                m3162d(interfaceC0579m);
            }
            Map.Entry<InterfaceC0578l, a> m27813g = this.f3766b.m27813g();
            if (!this.f3771g && m27813g != null && this.f3767c.compareTo(m27813g.getValue().f3774a) > 0) {
                m3165g(interfaceC0579m);
            }
        }
    }
}
