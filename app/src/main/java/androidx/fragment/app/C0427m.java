package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0428n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/m.class
 */
/* renamed from: androidx.fragment.app.m */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/m.class */
public class C0427m {

    /* renamed from: a */
    public final CopyOnWriteArrayList<a> f2913a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AbstractC0428n f2914b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/m$a.class
     */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/m$a.class */
    public static final class a {

        /* renamed from: a */
        public final AbstractC0428n.l f2915a;

        /* renamed from: b */
        public final boolean f2916b;

        public a(AbstractC0428n.l lVar, boolean z10) {
            this.f2915a = lVar;
            this.f2916b = z10;
        }
    }

    public C0427m(AbstractC0428n abstractC0428n) {
        this.f2914b = abstractC0428n;
    }

    /* renamed from: a */
    public void m2112a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2112a(fragment, bundle, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2265a(this.f2914b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m2113b(Fragment fragment, boolean z10) {
        Context m2107f = this.f2914b.m2241u0().m2107f();
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2113b(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2266b(this.f2914b, fragment, m2107f);
            }
        }
    }

    /* renamed from: c */
    public void m2114c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2114c(fragment, bundle, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2267c(this.f2914b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void m2115d(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2115d(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2268d(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void m2116e(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2116e(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.mo2269e(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m2117f(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2117f(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2270f(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m2118g(Fragment fragment, boolean z10) {
        Context m2107f = this.f2914b.m2241u0().m2107f();
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2118g(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2271g(this.f2914b, fragment, m2107f);
            }
        }
    }

    /* renamed from: h */
    public void m2119h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2119h(fragment, bundle, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2272h(this.f2914b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void m2120i(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2120i(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2273i(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void m2121j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2121j(fragment, bundle, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2274j(this.f2914b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void m2122k(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2122k(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2275k(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void m2123l(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2123l(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2276l(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void m2124m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2124m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2277m(this.f2914b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void m2125n(Fragment fragment, boolean z10) {
        Fragment m2250x0 = this.f2914b.m2250x0();
        if (m2250x0 != null) {
            m2250x0.getParentFragmentManager().m2247w0().m2125n(fragment, true);
        }
        Iterator<a> it = this.f2913a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2916b) {
                next.f2915a.m2278n(this.f2914b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m2126o(AbstractC0428n.l lVar, boolean z10) {
        this.f2913a.add(new a(lVar, z10));
    }

    /* renamed from: p */
    public void m2127p(AbstractC0428n.l lVar) {
        synchronized (this.f2913a) {
            int i10 = 0;
            int size = this.f2913a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (this.f2913a.get(i10).f2915a == lVar) {
                    this.f2913a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }
}
