package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0563b0;
import androidx.lifecycle.C0565c0;
import androidx.lifecycle.C0567d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/q.class
 */
/* renamed from: androidx.fragment.app.q */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/q.class */
public final class C0431q extends AbstractC0563b0 {

    /* renamed from: j */
    public static final C0565c0.b f2990j = new a();

    /* renamed from: f */
    public final boolean f2994f;

    /* renamed from: c */
    public final HashMap<String, Fragment> f2991c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C0431q> f2992d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C0567d0> f2993e = new HashMap<>();

    /* renamed from: g */
    public boolean f2995g = false;

    /* renamed from: h */
    public boolean f2996h = false;

    /* renamed from: i */
    public boolean f2997i = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/q$a.class
     */
    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/q$a.class */
    public class a implements C0565c0.b {
        @Override // androidx.lifecycle.C0565c0.b
        /* renamed from: a */
        public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
            return new C0431q(true);
        }
    }

    public C0431q(boolean z10) {
        this.f2994f = z10;
    }

    /* renamed from: j */
    public static C0431q m2286j(C0567d0 c0567d0) {
        return (C0431q) new C0565c0(c0567d0, f2990j).m3136a(C0431q.class);
    }

    @Override // androidx.lifecycle.AbstractC0563b0
    /* renamed from: d */
    public void mo2287d() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2995g = true;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0431q.class != obj.getClass()) {
            return false;
        }
        C0431q c0431q = (C0431q) obj;
        if (!this.f2991c.equals(c0431q.f2991c) || !this.f2992d.equals(c0431q.f2992d) || !this.f2993e.equals(c0431q.f2993e)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public void m2288f(Fragment fragment) {
        if (this.f2997i) {
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2991c.containsKey(fragment.mWho)) {
                return;
            }
            this.f2991c.put(fragment.mWho, fragment);
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: g */
    public void m2289g(Fragment fragment) {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0431q c0431q = this.f2992d.get(fragment.mWho);
        if (c0431q != null) {
            c0431q.mo2287d();
            this.f2992d.remove(fragment.mWho);
        }
        C0567d0 c0567d0 = this.f2993e.get(fragment.mWho);
        if (c0567d0 != null) {
            c0567d0.m3142a();
            this.f2993e.remove(fragment.mWho);
        }
    }

    /* renamed from: h */
    public Fragment m2290h(String str) {
        return this.f2991c.get(str);
    }

    public int hashCode() {
        return (((this.f2991c.hashCode() * 31) + this.f2992d.hashCode()) * 31) + this.f2993e.hashCode();
    }

    /* renamed from: i */
    public C0431q m2291i(Fragment fragment) {
        C0431q c0431q = this.f2992d.get(fragment.mWho);
        C0431q c0431q2 = c0431q;
        if (c0431q == null) {
            c0431q2 = new C0431q(this.f2994f);
            this.f2992d.put(fragment.mWho, c0431q2);
        }
        return c0431q2;
    }

    /* renamed from: k */
    public Collection<Fragment> m2292k() {
        return new ArrayList(this.f2991c.values());
    }

    /* renamed from: l */
    public C0567d0 m2293l(Fragment fragment) {
        C0567d0 c0567d0 = this.f2993e.get(fragment.mWho);
        C0567d0 c0567d02 = c0567d0;
        if (c0567d0 == null) {
            c0567d02 = new C0567d0();
            this.f2993e.put(fragment.mWho, c0567d02);
        }
        return c0567d02;
    }

    /* renamed from: m */
    public boolean m2294m() {
        return this.f2995g;
    }

    /* renamed from: n */
    public void m2295n(Fragment fragment) {
        if (this.f2997i) {
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2991c.remove(fragment.mWho) != null) && AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: o */
    public void m2296o(boolean z10) {
        this.f2997i = z10;
    }

    /* renamed from: p */
    public boolean m2297p(Fragment fragment) {
        if (this.f2991c.containsKey(fragment.mWho)) {
            return this.f2994f ? this.f2995g : !this.f2996h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2991c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2992d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2993e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
