package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0572g;
import java.util.ArrayList;
import p052d2.AbstractC4300a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/w.class
 */
@Deprecated
/* renamed from: androidx.fragment.app.w */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/w.class */
public abstract class AbstractC0437w extends AbstractC4300a {

    /* renamed from: c */
    public final AbstractC0428n f3024c;

    /* renamed from: d */
    public final int f3025d;

    /* renamed from: e */
    public AbstractC0439y f3026e;

    /* renamed from: f */
    public ArrayList<Fragment.C0407m> f3027f;

    /* renamed from: g */
    public ArrayList<Fragment> f3028g;

    /* renamed from: h */
    public Fragment f3029h;

    /* renamed from: i */
    public boolean f3030i;

    @Deprecated
    public AbstractC0437w(AbstractC0428n abstractC0428n) {
        this(abstractC0428n, 0);
    }

    public AbstractC0437w(AbstractC0428n abstractC0428n, int i10) {
        this.f3026e = null;
        this.f3027f = new ArrayList<>();
        this.f3028g = new ArrayList<>();
        this.f3029h = null;
        this.f3024c = abstractC0428n;
        this.f3025d = i10;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: a */
    public void mo2300a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3026e == null) {
            this.f3026e = this.f3024c.m2216m();
        }
        while (this.f3027f.size() <= i10) {
            this.f3027f.add(null);
        }
        this.f3027f.set(i10, fragment.isAdded() ? this.f3024c.m2221n1(fragment) : null);
        this.f3028g.set(i10, null);
        this.f3026e.mo1970q(fragment);
        if (fragment.equals(this.f3029h)) {
            this.f3029h = null;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: b */
    public void mo2301b(ViewGroup viewGroup) {
        AbstractC0439y abstractC0439y = this.f3026e;
        if (abstractC0439y != null) {
            if (!this.f3030i) {
                try {
                    this.f3030i = true;
                    abstractC0439y.mo1967m();
                } finally {
                    this.f3030i = false;
                }
            }
            this.f3026e = null;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: g */
    public Object mo2302g(ViewGroup viewGroup, int i10) {
        Fragment.C0407m c0407m;
        Fragment fragment;
        if (this.f3028g.size() > i10 && (fragment = this.f3028g.get(i10)) != null) {
            return fragment;
        }
        if (this.f3026e == null) {
            this.f3026e = this.f3024c.m2216m();
        }
        Fragment mo2336p = mo2336p(i10);
        if (this.f3027f.size() > i10 && (c0407m = this.f3027f.get(i10)) != null) {
            mo2336p.setInitialSavedState(c0407m);
        }
        while (this.f3028g.size() <= i10) {
            this.f3028g.add(null);
        }
        mo2336p.setMenuVisibility(false);
        if (this.f3025d == 0) {
            mo2336p.setUserVisibleHint(false);
        }
        this.f3028g.set(i10, mo2336p);
        this.f3026e.m2361b(viewGroup.getId(), mo2336p);
        if (this.f3025d == 1) {
            this.f3026e.mo1971v(mo2336p, AbstractC0572g.c.STARTED);
        }
        return mo2336p;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: h */
    public boolean mo2303h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: j */
    public void mo2304j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3027f.clear();
            this.f3028g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3027f.add((Fragment.C0407m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment m2226p0 = this.f3024c.m2226p0(bundle, str);
                    if (m2226p0 != null) {
                        while (this.f3028g.size() <= parseInt) {
                            this.f3028g.add(null);
                        }
                        m2226p0.setMenuVisibility(false);
                        this.f3028g.set(parseInt, m2226p0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: k */
    public Parcelable mo2305k() {
        Bundle bundle;
        if (this.f3027f.size() > 0) {
            bundle = new Bundle();
            Fragment.C0407m[] c0407mArr = new Fragment.C0407m[this.f3027f.size()];
            this.f3027f.toArray(c0407mArr);
            bundle.putParcelableArray("states", c0407mArr);
        } else {
            bundle = null;
        }
        int i10 = 0;
        while (i10 < this.f3028g.size()) {
            Fragment fragment = this.f3028g.get(i10);
            Bundle bundle2 = bundle;
            if (fragment != null) {
                bundle2 = bundle;
                if (fragment.isAdded()) {
                    bundle2 = bundle;
                    if (bundle == null) {
                        bundle2 = new Bundle();
                    }
                    this.f3024c.m2192d1(bundle2, "f" + i10, fragment);
                }
            }
            i10++;
            bundle = bundle2;
        }
        return bundle;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: l */
    public void mo2306l(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3029h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3025d == 1) {
                    if (this.f3026e == null) {
                        this.f3026e = this.f3024c.m2216m();
                    }
                    this.f3026e.mo1971v(this.f3029h, AbstractC0572g.c.STARTED);
                } else {
                    this.f3029h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3025d == 1) {
                if (this.f3026e == null) {
                    this.f3026e = this.f3024c.m2216m();
                }
                this.f3026e.mo1971v(fragment, AbstractC0572g.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3029h = fragment;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: n */
    public void mo2307n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    /* renamed from: p */
    public abstract Fragment mo2336p(int i10);
}
