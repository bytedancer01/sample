package p003a2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0411b0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p003a2.AbstractC0027l;
import p175k0.C5441b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/e.class
 */
@SuppressLint({"RestrictedApi"})
/* renamed from: a2.e */
/* loaded from: combined.jar:classes1.jar:a2/e.class */
public class C0013e extends AbstractC0411b0 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$a.class
     */
    /* renamed from: a2.e$a */
    /* loaded from: combined.jar:classes1.jar:a2/e$a.class */
    public class a extends AbstractC0027l.e {

        /* renamed from: a */
        public final Rect f58a;

        /* renamed from: b */
        public final C0013e f59b;

        public a(C0013e c0013e, Rect rect) {
            this.f59b = c0013e;
            this.f58a = rect;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$b.class
     */
    /* renamed from: a2.e$b */
    /* loaded from: combined.jar:classes1.jar:a2/e$b.class */
    public class b implements AbstractC0027l.f {

        /* renamed from: b */
        public final View f60b;

        /* renamed from: c */
        public final ArrayList f61c;

        /* renamed from: d */
        public final C0013e f62d;

        public b(C0013e c0013e, View view, ArrayList arrayList) {
            this.f62d = c0013e;
            this.f60b = view;
            this.f61c = arrayList;
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: a */
        public void mo98a(AbstractC0027l abstractC0027l) {
            abstractC0027l.mo134V(this);
            abstractC0027l.mo139a(this);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: b */
        public void mo64b(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: c */
        public void mo65c(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            abstractC0027l.mo134V(this);
            this.f60b.setVisibility(8);
            int size = this.f61c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f61c.get(i10)).setVisibility(0);
            }
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: e */
        public void mo67e(AbstractC0027l abstractC0027l) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$c.class
     */
    /* renamed from: a2.e$c */
    /* loaded from: combined.jar:classes1.jar:a2/e$c.class */
    public class c extends C0029m {

        /* renamed from: b */
        public final Object f63b;

        /* renamed from: c */
        public final ArrayList f64c;

        /* renamed from: d */
        public final Object f65d;

        /* renamed from: e */
        public final ArrayList f66e;

        /* renamed from: f */
        public final Object f67f;

        /* renamed from: g */
        public final ArrayList f68g;

        /* renamed from: h */
        public final C0013e f69h;

        public c(C0013e c0013e, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f69h = c0013e;
            this.f63b = obj;
            this.f64c = arrayList;
            this.f65d = obj2;
            this.f66e = arrayList2;
            this.f67f = obj3;
            this.f68g = arrayList3;
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: a */
        public void mo98a(AbstractC0027l abstractC0027l) {
            Object obj = this.f63b;
            if (obj != null) {
                this.f69h.mo91q(obj, this.f64c, null);
            }
            Object obj2 = this.f65d;
            if (obj2 != null) {
                this.f69h.mo91q(obj2, this.f66e, null);
            }
            Object obj3 = this.f67f;
            if (obj3 != null) {
                this.f69h.mo91q(obj3, this.f68g, null);
            }
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            abstractC0027l.mo134V(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$d.class
     */
    /* renamed from: a2.e$d */
    /* loaded from: combined.jar:classes1.jar:a2/e$d.class */
    public class d implements C5441b.a {

        /* renamed from: a */
        public final AbstractC0027l f70a;

        /* renamed from: b */
        public final C0013e f71b;

        public d(C0013e c0013e, AbstractC0027l abstractC0027l) {
            this.f71b = c0013e;
            this.f70a = abstractC0027l;
        }

        @Override // p175k0.C5441b.a
        public void onCancel() {
            this.f70a.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$e.class
     */
    /* renamed from: a2.e$e */
    /* loaded from: combined.jar:classes1.jar:a2/e$e.class */
    public class e implements AbstractC0027l.f {

        /* renamed from: b */
        public final Runnable f72b;

        /* renamed from: c */
        public final C0013e f73c;

        public e(C0013e c0013e, Runnable runnable) {
            this.f73c = c0013e;
            this.f72b = runnable;
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: a */
        public void mo98a(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: b */
        public void mo64b(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: c */
        public void mo65c(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            this.f72b.run();
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: e */
        public void mo67e(AbstractC0027l abstractC0027l) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/e$f.class
     */
    /* renamed from: a2.e$f */
    /* loaded from: combined.jar:classes1.jar:a2/e$f.class */
    public class f extends AbstractC0027l.e {

        /* renamed from: a */
        public final Rect f74a;

        /* renamed from: b */
        public final C0013e f75b;

        public f(C0013e c0013e, Rect rect) {
            this.f75b = c0013e;
            this.f74a = rect;
        }
    }

    /* renamed from: C */
    public static boolean m80C(AbstractC0027l abstractC0027l) {
        return (AbstractC0411b0.m1982l(abstractC0027l.m120F()) && AbstractC0411b0.m1982l(abstractC0027l.m121G()) && AbstractC0411b0.m1982l(abstractC0027l.m122H())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: A */
    public void mo81A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0035p c0035p = (C0035p) obj;
        if (c0035p != null) {
            c0035p.m123I().clear();
            c0035p.m123I().addAll(arrayList2);
            mo91q(c0035p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: B */
    public Object mo82B(Object obj) {
        if (obj == null) {
            return null;
        }
        C0035p c0035p = new C0035p();
        c0035p.m179k0((AbstractC0027l) obj);
        return c0035p;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: a */
    public void mo83a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0027l) obj).mo141b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: b */
    public void mo84b(Object obj, ArrayList<View> arrayList) {
        AbstractC0027l abstractC0027l = (AbstractC0027l) obj;
        if (abstractC0027l == null) {
            return;
        }
        if (abstractC0027l instanceof C0035p) {
            C0035p c0035p = (C0035p) abstractC0027l;
            int m182n0 = c0035p.m182n0();
            for (int i10 = 0; i10 < m182n0; i10++) {
                mo84b(c0035p.m181m0(i10), arrayList);
            }
            return;
        }
        if (m80C(abstractC0027l) || !AbstractC0411b0.m1982l(abstractC0027l.m123I())) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            abstractC0027l.mo141b(arrayList.get(i11));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: c */
    public void mo85c(ViewGroup viewGroup, Object obj) {
        C0031n.m165b(viewGroup, (AbstractC0027l) obj);
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: e */
    public boolean mo86e(Object obj) {
        return obj instanceof AbstractC0027l;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: g */
    public Object mo87g(Object obj) {
        return obj != null ? ((AbstractC0027l) obj).clone() : null;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: m */
    public Object mo88m(Object obj, Object obj2, Object obj3) {
        AbstractC0027l abstractC0027l = (AbstractC0027l) obj;
        AbstractC0027l abstractC0027l2 = (AbstractC0027l) obj2;
        AbstractC0027l abstractC0027l3 = (AbstractC0027l) obj3;
        if (abstractC0027l != null && abstractC0027l2 != null) {
            abstractC0027l = new C0035p().m179k0(abstractC0027l).m179k0(abstractC0027l2).m187s0(1);
        } else if (abstractC0027l == null) {
            abstractC0027l = abstractC0027l2 != null ? abstractC0027l2 : null;
        }
        if (abstractC0027l3 == null) {
            return abstractC0027l;
        }
        C0035p c0035p = new C0035p();
        if (abstractC0027l != null) {
            c0035p.m179k0(abstractC0027l);
        }
        c0035p.m179k0(abstractC0027l3);
        return c0035p;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: n */
    public Object mo89n(Object obj, Object obj2, Object obj3) {
        C0035p c0035p = new C0035p();
        if (obj != null) {
            c0035p.m179k0((AbstractC0027l) obj);
        }
        if (obj2 != null) {
            c0035p.m179k0((AbstractC0027l) obj2);
        }
        if (obj3 != null) {
            c0035p.m179k0((AbstractC0027l) obj3);
        }
        return c0035p;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: p */
    public void mo90p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0027l) obj).mo135W(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: q */
    public void mo91q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0027l abstractC0027l = (AbstractC0027l) obj;
        if (abstractC0027l instanceof C0035p) {
            C0035p c0035p = (C0035p) abstractC0027l;
            int m182n0 = c0035p.m182n0();
            for (int i10 = 0; i10 < m182n0; i10++) {
                mo91q(c0035p.m181m0(i10), arrayList, arrayList2);
            }
            return;
        }
        if (m80C(abstractC0027l)) {
            return;
        }
        List<View> m123I = abstractC0027l.m123I();
        if (m123I.size() == arrayList.size() && m123I.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                abstractC0027l.mo141b(arrayList2.get(i11));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0027l.mo135W(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: r */
    public void mo92r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0027l) obj).mo139a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: t */
    public void mo93t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0027l) obj).mo139a(new c(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: u */
    public void mo94u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0027l) obj).mo142b0(new f(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: v */
    public void mo95v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1985k(view, rect);
            ((AbstractC0027l) obj).mo142b0(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: w */
    public void mo96w(Fragment fragment, Object obj, C5441b c5441b, Runnable runnable) {
        AbstractC0027l abstractC0027l = (AbstractC0027l) obj;
        c5441b.m27193d(new d(this, abstractC0027l));
        abstractC0027l.mo139a(new e(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: z */
    public void mo97z(Object obj, View view, ArrayList<View> arrayList) {
        C0035p c0035p = (C0035p) obj;
        List<View> m123I = c0035p.m123I();
        m123I.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0411b0.m1979d(m123I, arrayList.get(i10));
        }
        m123I.add(view);
        arrayList.add(view);
        mo84b(c0035p, arrayList);
    }
}
