package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0572g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/y.class
 */
/* renamed from: androidx.fragment.app.y */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/y.class */
public abstract class AbstractC0439y {

    /* renamed from: a */
    public final C0424j f3034a;

    /* renamed from: b */
    public final ClassLoader f3035b;

    /* renamed from: d */
    public int f3037d;

    /* renamed from: e */
    public int f3038e;

    /* renamed from: f */
    public int f3039f;

    /* renamed from: g */
    public int f3040g;

    /* renamed from: h */
    public int f3041h;

    /* renamed from: i */
    public boolean f3042i;

    /* renamed from: k */
    public String f3044k;

    /* renamed from: l */
    public int f3045l;

    /* renamed from: m */
    public CharSequence f3046m;

    /* renamed from: n */
    public int f3047n;

    /* renamed from: o */
    public CharSequence f3048o;

    /* renamed from: p */
    public ArrayList<String> f3049p;

    /* renamed from: q */
    public ArrayList<String> f3050q;

    /* renamed from: s */
    public ArrayList<Runnable> f3052s;

    /* renamed from: c */
    public ArrayList<a> f3036c = new ArrayList<>();

    /* renamed from: j */
    public boolean f3043j = true;

    /* renamed from: r */
    public boolean f3051r = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/y$a.class
     */
    /* renamed from: androidx.fragment.app.y$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/y$a.class */
    public static final class a {

        /* renamed from: a */
        public int f3053a;

        /* renamed from: b */
        public Fragment f3054b;

        /* renamed from: c */
        public int f3055c;

        /* renamed from: d */
        public int f3056d;

        /* renamed from: e */
        public int f3057e;

        /* renamed from: f */
        public int f3058f;

        /* renamed from: g */
        public AbstractC0572g.c f3059g;

        /* renamed from: h */
        public AbstractC0572g.c f3060h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f3053a = i10;
            this.f3054b = fragment;
            AbstractC0572g.c cVar = AbstractC0572g.c.RESUMED;
            this.f3059g = cVar;
            this.f3060h = cVar;
        }

        public a(int i10, Fragment fragment, AbstractC0572g.c cVar) {
            this.f3053a = i10;
            this.f3054b = fragment;
            this.f3059g = fragment.mMaxState;
            this.f3060h = cVar;
        }
    }

    public AbstractC0439y(C0424j c0424j, ClassLoader classLoader) {
        this.f3034a = c0424j;
        this.f3035b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0439y m2361b(int i10, Fragment fragment) {
        mo1969p(i10, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0439y m2362c(int i10, Fragment fragment, String str) {
        mo1969p(i10, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public AbstractC0439y m2363d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m2362c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC0439y m2364e(Fragment fragment, String str) {
        mo1969p(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void m2365f(a aVar) {
        this.f3036c.add(aVar);
        aVar.f3055c = this.f3037d;
        aVar.f3056d = this.f3038e;
        aVar.f3057e = this.f3039f;
        aVar.f3058f = this.f3040g;
    }

    /* renamed from: g */
    public AbstractC0439y m2366g(View view, String str) {
        if (C0440z.m2377C()) {
            String m31491L = C6824g0.m31491L(view);
            if (m31491L == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f3049p == null) {
                this.f3049p = new ArrayList<>();
                this.f3050q = new ArrayList<>();
            } else {
                if (this.f3050q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f3049p.contains(m31491L)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + m31491L + "' has already been added to the transaction.");
                }
            }
            this.f3049p.add(m31491L);
            this.f3050q.add(str);
        }
        return this;
    }

    /* renamed from: h */
    public AbstractC0439y m2367h(String str) {
        if (!this.f3043j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f3042i = true;
        this.f3044k = str;
        return this;
    }

    /* renamed from: i */
    public AbstractC0439y m2368i(Fragment fragment) {
        m2365f(new a(7, fragment));
        return this;
    }

    /* renamed from: j */
    public abstract int mo1964j();

    /* renamed from: k */
    public abstract int mo1965k();

    /* renamed from: l */
    public abstract void mo1966l();

    /* renamed from: m */
    public abstract void mo1967m();

    /* renamed from: n */
    public AbstractC0439y mo1968n(Fragment fragment) {
        m2365f(new a(6, fragment));
        return this;
    }

    /* renamed from: o */
    public AbstractC0439y m2369o() {
        if (this.f3042i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3043j = false;
        return this;
    }

    /* renamed from: p */
    public void mo1969p(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        m2365f(new a(i11, fragment));
    }

    /* renamed from: q */
    public AbstractC0439y mo1970q(Fragment fragment) {
        m2365f(new a(3, fragment));
        return this;
    }

    /* renamed from: r */
    public AbstractC0439y m2370r(int i10, Fragment fragment) {
        return m2371s(i10, fragment, null);
    }

    /* renamed from: s */
    public AbstractC0439y m2371s(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo1969p(i10, fragment, str, 2);
        return this;
    }

    /* renamed from: t */
    public AbstractC0439y m2372t(int i10, int i11) {
        return m2373u(i10, i11, 0, 0);
    }

    /* renamed from: u */
    public AbstractC0439y m2373u(int i10, int i11, int i12, int i13) {
        this.f3037d = i10;
        this.f3038e = i11;
        this.f3039f = i12;
        this.f3040g = i13;
        return this;
    }

    /* renamed from: v */
    public AbstractC0439y mo1971v(Fragment fragment, AbstractC0572g.c cVar) {
        m2365f(new a(10, fragment, cVar));
        return this;
    }

    /* renamed from: w */
    public AbstractC0439y mo1972w(Fragment fragment) {
        m2365f(new a(8, fragment));
        return this;
    }

    /* renamed from: x */
    public AbstractC0439y m2374x(boolean z10) {
        this.f3051r = z10;
        return this;
    }
}
