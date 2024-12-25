package p003a2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p235o0.C6824g0;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/n.class
 */
/* renamed from: a2.n */
/* loaded from: combined.jar:classes1.jar:a2/n.class */
public class C0031n {

    /* renamed from: a */
    public static AbstractC0027l f132a = new C0007b();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C7928a<ViewGroup, ArrayList<AbstractC0027l>>>> f133b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f134c = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/n$a.class
     */
    /* renamed from: a2.n$a */
    /* loaded from: combined.jar:classes1.jar:a2/n$a.class */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public AbstractC0027l f135b;

        /* renamed from: c */
        public ViewGroup f136c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:a2/n$a$a.class
         */
        /* renamed from: a2.n$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:a2/n$a$a.class */
        public class C10248a extends C0029m {

            /* renamed from: b */
            public final C7928a f137b;

            /* renamed from: c */
            public final a f138c;

            public C10248a(a aVar, C7928a c7928a) {
                this.f138c = aVar;
                this.f137b = c7928a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p003a2.AbstractC0027l.f
            /* renamed from: d */
            public void mo66d(AbstractC0027l abstractC0027l) {
                ((ArrayList) this.f137b.get(this.f138c.f136c)).remove(abstractC0027l);
                abstractC0027l.mo134V(this);
            }
        }

        public a(AbstractC0027l abstractC0027l, ViewGroup viewGroup) {
            this.f135b = abstractC0027l;
            this.f136c = viewGroup;
        }

        /* renamed from: a */
        public final void m169a() {
            this.f136c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f136c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrayList<AbstractC0027l> arrayList;
            m169a();
            if (!C0031n.f134c.remove(this.f136c)) {
                return true;
            }
            C7928a<ViewGroup, ArrayList<AbstractC0027l>> m166c = C0031n.m166c();
            ArrayList<AbstractC0027l> arrayList2 = m166c.get(this.f136c);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList = new ArrayList<>();
                m166c.put(this.f136c, arrayList);
            } else {
                arrayList = arrayList2;
                if (arrayList2.size() > 0) {
                    arrayList3 = new ArrayList(arrayList2);
                    arrayList = arrayList2;
                }
            }
            arrayList.add(this.f135b);
            this.f135b.mo139a(new C10248a(this, m166c));
            this.f135b.m153k(this.f136c, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((AbstractC0027l) it.next()).mo136X(this.f136c);
                }
            }
            this.f135b.m133U(this.f136c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m169a();
            C0031n.f134c.remove(this.f136c);
            ArrayList<AbstractC0027l> arrayList = C0031n.m166c().get(this.f136c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0027l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo136X(this.f136c);
                }
            }
            this.f135b.m154l(true);
        }
    }

    /* renamed from: a */
    public static void m164a(ViewGroup viewGroup) {
        m165b(viewGroup, null);
    }

    /* renamed from: b */
    public static void m165b(ViewGroup viewGroup, AbstractC0027l abstractC0027l) {
        if (f134c.contains(viewGroup) || !C6824g0.m31502U(viewGroup)) {
            return;
        }
        f134c.add(viewGroup);
        AbstractC0027l abstractC0027l2 = abstractC0027l;
        if (abstractC0027l == null) {
            abstractC0027l2 = f132a;
        }
        AbstractC0027l clone = abstractC0027l2.clone();
        m168e(viewGroup, clone);
        C0025k.m111c(viewGroup, null);
        m167d(viewGroup, clone);
    }

    /* renamed from: c */
    public static C7928a<ViewGroup, ArrayList<AbstractC0027l>> m166c() {
        C7928a<ViewGroup, ArrayList<AbstractC0027l>> c7928a;
        WeakReference<C7928a<ViewGroup, ArrayList<AbstractC0027l>>> weakReference = f133b.get();
        if (weakReference != null && (c7928a = weakReference.get()) != null) {
            return c7928a;
        }
        C7928a<ViewGroup, ArrayList<AbstractC0027l>> c7928a2 = new C7928a<>();
        f133b.set(new WeakReference<>(c7928a2));
        return c7928a2;
    }

    /* renamed from: d */
    public static void m167d(ViewGroup viewGroup, AbstractC0027l abstractC0027l) {
        if (abstractC0027l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0027l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: e */
    public static void m168e(ViewGroup viewGroup, AbstractC0027l abstractC0027l) {
        ArrayList<AbstractC0027l> arrayList = m166c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0027l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo132T(viewGroup);
            }
        }
        if (abstractC0027l != null) {
            abstractC0027l.m153k(viewGroup, true);
        }
        C0025k m110b = C0025k.m110b(viewGroup);
        if (m110b != null) {
            m110b.m112a();
        }
    }
}
