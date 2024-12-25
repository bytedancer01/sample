package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0572g;
import p052d2.AbstractC4300a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/s.class
 */
@Deprecated
/* renamed from: androidx.fragment.app.s */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/s.class */
public abstract class AbstractC0433s extends AbstractC4300a {

    /* renamed from: c */
    public final AbstractC0428n f2998c;

    /* renamed from: d */
    public final int f2999d;

    /* renamed from: e */
    public AbstractC0439y f3000e;

    /* renamed from: f */
    public Fragment f3001f;

    /* renamed from: g */
    public boolean f3002g;

    @Deprecated
    public AbstractC0433s(AbstractC0428n abstractC0428n) {
        this(abstractC0428n, 0);
    }

    public AbstractC0433s(AbstractC0428n abstractC0428n, int i10) {
        this.f3000e = null;
        this.f3001f = null;
        this.f2998c = abstractC0428n;
        this.f2999d = i10;
    }

    /* renamed from: r */
    public static String m2299r(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: a */
    public void mo2300a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3000e == null) {
            this.f3000e = this.f2998c.m2216m();
        }
        this.f3000e.mo1968n(fragment);
        if (fragment.equals(this.f3001f)) {
            this.f3001f = null;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: b */
    public void mo2301b(ViewGroup viewGroup) {
        AbstractC0439y abstractC0439y = this.f3000e;
        if (abstractC0439y != null) {
            if (!this.f3002g) {
                try {
                    this.f3002g = true;
                    abstractC0439y.mo1967m();
                } finally {
                    this.f3002g = false;
                }
            }
            this.f3000e = null;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: g */
    public Object mo2302g(ViewGroup viewGroup, int i10) {
        Fragment fragment;
        if (this.f3000e == null) {
            this.f3000e = this.f2998c.m2216m();
        }
        long m2309q = m2309q(i10);
        Fragment m2206i0 = this.f2998c.m2206i0(m2299r(viewGroup.getId(), m2309q));
        if (m2206i0 != null) {
            this.f3000e.m2368i(m2206i0);
            fragment = m2206i0;
        } else {
            Fragment mo2308p = mo2308p(i10);
            this.f3000e.m2362c(viewGroup.getId(), mo2308p, m2299r(viewGroup.getId(), m2309q));
            fragment = mo2308p;
        }
        if (fragment != this.f3001f) {
            fragment.setMenuVisibility(false);
            if (this.f2999d == 1) {
                this.f3000e.mo1971v(fragment, AbstractC0572g.c.STARTED);
            } else {
                fragment.setUserVisibleHint(false);
            }
        }
        return fragment;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: h */
    public boolean mo2303h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: j */
    public void mo2304j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: k */
    public Parcelable mo2305k() {
        return null;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: l */
    public void mo2306l(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3001f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2999d == 1) {
                    if (this.f3000e == null) {
                        this.f3000e = this.f2998c.m2216m();
                    }
                    this.f3000e.mo1971v(this.f3001f, AbstractC0572g.c.STARTED);
                } else {
                    this.f3001f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2999d == 1) {
                if (this.f3000e == null) {
                    this.f3000e = this.f2998c.m2216m();
                }
                this.f3000e.mo1971v(fragment, AbstractC0572g.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3001f = fragment;
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
    public abstract Fragment mo2308p(int i10);

    /* renamed from: q */
    public long m2309q(int i10) {
        return i10;
    }
}
