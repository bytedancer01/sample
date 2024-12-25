package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0439y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0572g;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/a.class
 */
/* renamed from: androidx.fragment.app.a */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a.class */
public final class C0408a extends AbstractC0439y implements AbstractC0428n.o {

    /* renamed from: t */
    public final AbstractC0428n f2743t;

    /* renamed from: u */
    public boolean f2744u;

    /* renamed from: v */
    public int f2745v;

    public C0408a(AbstractC0428n abstractC0428n) {
        super(abstractC0428n.m2232r0(), abstractC0428n.m2241u0() != null ? abstractC0428n.m2241u0().m2107f().getClassLoader() : null);
        this.f2745v = -1;
        this.f2743t = abstractC0428n;
    }

    /* renamed from: I */
    public static boolean m1950I(AbstractC0439y.a aVar) {
        Fragment fragment = aVar.f3054b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* renamed from: A */
    public void m1951A(String str, PrintWriter printWriter) {
        m1952B(str, printWriter, true);
    }

    /* renamed from: B */
    public void m1952B(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3044k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2745v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2744u);
            if (this.f3041h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3041h));
            }
            if (this.f3037d != 0 || this.f3038e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3037d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3038e));
            }
            if (this.f3039f != 0 || this.f3040g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3039f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3040g));
            }
            if (this.f3045l != 0 || this.f3046m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3045l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3046m);
            }
            if (this.f3047n != 0 || this.f3048o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3047n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3048o);
            }
        }
        if (this.f3036c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3036c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0439y.a aVar = this.f3036c.get(i10);
            switch (aVar.f3053a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3053a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3054b);
            if (z10) {
                if (aVar.f3055c != 0 || aVar.f3056d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3055c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3056d));
                }
                if (aVar.f3057e != 0 || aVar.f3058f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3057e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3058f));
                }
            }
        }
    }

    /* renamed from: C */
    public void m1953C() {
        int size = this.f3036c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0439y.a aVar = this.f3036c.get(i10);
            Fragment fragment = aVar.f3054b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3041h);
                fragment.setSharedElementNames(this.f3049p, this.f3050q);
            }
            switch (aVar.f3053a) {
                case 1:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, false);
                    this.f2743t.m2199g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3053a);
                case 3:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2201g1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2141D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, false);
                    this.f2743t.m2239t1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2252y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, false);
                    this.f2743t.m2214l(fragment);
                    break;
                case 8:
                    this.f2743t.m2233r1(fragment);
                    break;
                case 9:
                    this.f2743t.m2233r1(null);
                    break;
                case 10:
                    this.f2743t.m2230q1(fragment, aVar.f3060h);
                    break;
            }
            if (!this.f3051r && aVar.f3053a != 1 && fragment != null && !AbstractC0428n.f2918P) {
                this.f2743t.m2166Q0(fragment);
            }
        }
        if (this.f3051r || AbstractC0428n.f2918P) {
            return;
        }
        AbstractC0428n abstractC0428n = this.f2743t;
        abstractC0428n.m2168R0(abstractC0428n.f2949q, true);
    }

    /* renamed from: D */
    public void m1954D(boolean z10) {
        for (int size = this.f3036c.size() - 1; size >= 0; size--) {
            AbstractC0439y.a aVar = this.f3036c.get(size);
            Fragment fragment = aVar.f3054b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(AbstractC0428n.m2134l1(this.f3041h));
                fragment.setSharedElementNames(this.f3050q, this.f3049p);
            }
            switch (aVar.f3053a) {
                case 1:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, true);
                    this.f2743t.m2201g1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3053a);
                case 3:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2199g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2239t1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, true);
                    this.f2743t.m2141D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2214l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3055c, aVar.f3056d, aVar.f3057e, aVar.f3058f);
                    this.f2743t.m2227p1(fragment, true);
                    this.f2743t.m2252y(fragment);
                    break;
                case 8:
                    this.f2743t.m2233r1(null);
                    break;
                case 9:
                    this.f2743t.m2233r1(fragment);
                    break;
                case 10:
                    this.f2743t.m2230q1(fragment, aVar.f3059g);
                    break;
            }
            if (!this.f3051r && aVar.f3053a != 3 && fragment != null && !AbstractC0428n.f2918P) {
                this.f2743t.m2166Q0(fragment);
            }
        }
        if (this.f3051r || !z10 || AbstractC0428n.f2918P) {
            return;
        }
        AbstractC0428n abstractC0428n = this.f2743t;
        abstractC0428n.m2168R0(abstractC0428n.f2949q, true);
    }

    /* renamed from: E */
    public Fragment m1955E(ArrayList<Fragment> arrayList, Fragment fragment) {
        int i10;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            Fragment fragment2 = fragment;
            if (i12 >= this.f3036c.size()) {
                return fragment2;
            }
            AbstractC0439y.a aVar = this.f3036c.get(i12);
            int i13 = aVar.f3053a;
            if (i13 != 1) {
                if (i13 == 2) {
                    Fragment fragment3 = aVar.f3054b;
                    int i14 = fragment3.mContainerId;
                    int size = arrayList.size() - 1;
                    boolean z10 = false;
                    i10 = i12;
                    fragment = fragment2;
                    while (size >= 0) {
                        Fragment fragment4 = arrayList.get(size);
                        Fragment fragment5 = fragment;
                        int i15 = i10;
                        boolean z11 = z10;
                        if (fragment4.mContainerId == i14) {
                            if (fragment4 == fragment3) {
                                z11 = true;
                                fragment5 = fragment;
                                i15 = i10;
                            } else {
                                fragment5 = fragment;
                                int i16 = i10;
                                if (fragment4 == fragment) {
                                    this.f3036c.add(i10, new AbstractC0439y.a(9, fragment4));
                                    i16 = i10 + 1;
                                    fragment5 = null;
                                }
                                AbstractC0439y.a aVar2 = new AbstractC0439y.a(3, fragment4);
                                aVar2.f3055c = aVar.f3055c;
                                aVar2.f3057e = aVar.f3057e;
                                aVar2.f3056d = aVar.f3056d;
                                aVar2.f3058f = aVar.f3058f;
                                this.f3036c.add(i16, aVar2);
                                arrayList.remove(fragment4);
                                i15 = i16 + 1;
                                z11 = z10;
                            }
                        }
                        size--;
                        fragment = fragment5;
                        i10 = i15;
                        z10 = z11;
                    }
                    if (z10) {
                        this.f3036c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3053a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i13 == 3 || i13 == 6) {
                    arrayList.remove(aVar.f3054b);
                    Fragment fragment6 = aVar.f3054b;
                    fragment = fragment2;
                    i10 = i12;
                    if (fragment6 == fragment2) {
                        this.f3036c.add(i12, new AbstractC0439y.a(9, fragment6));
                        i10 = i12 + 1;
                        fragment = null;
                    }
                } else if (i13 != 7) {
                    if (i13 != 8) {
                        fragment = fragment2;
                        i10 = i12;
                    } else {
                        this.f3036c.add(i12, new AbstractC0439y.a(9, fragment2));
                        i10 = i12 + 1;
                        fragment = aVar.f3054b;
                    }
                }
                i11 = i10 + 1;
            }
            arrayList.add(aVar.f3054b);
            i10 = i12;
            fragment = fragment2;
            i11 = i10 + 1;
        }
    }

    /* renamed from: F */
    public String m1956F() {
        return this.f3044k;
    }

    /* renamed from: G */
    public boolean m1957G(int i10) {
        int size = this.f3036c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f3036c.get(i11).f3054b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public boolean m1958H(ArrayList<C0408a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f3036c.size();
        int i12 = -1;
        int i13 = 0;
        while (i13 < size) {
            Fragment fragment = this.f3036c.get(i13).f3054b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            int i15 = i12;
            if (i14 != 0) {
                i15 = i12;
                if (i14 != i12) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        C0408a c0408a = arrayList.get(i16);
                        int size2 = c0408a.f3036c.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            Fragment fragment2 = c0408a.f3036c.get(i17).f3054b;
                            if ((fragment2 != null ? fragment2.mContainerId : 0) == i14) {
                                return true;
                            }
                        }
                    }
                    i15 = i14;
                } else {
                    continue;
                }
            }
            i13++;
            i12 = i15;
        }
        return false;
    }

    /* renamed from: J */
    public boolean m1959J() {
        for (int i10 = 0; i10 < this.f3036c.size(); i10++) {
            if (m1950I(this.f3036c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public void m1960K() {
        if (this.f3052s != null) {
            for (int i10 = 0; i10 < this.f3052s.size(); i10++) {
                this.f3052s.get(i10).run();
            }
            this.f3052s = null;
        }
    }

    /* renamed from: L */
    public void m1961L(Fragment.InterfaceC0406l interfaceC0406l) {
        for (int i10 = 0; i10 < this.f3036c.size(); i10++) {
            AbstractC0439y.a aVar = this.f3036c.get(i10);
            if (m1950I(aVar)) {
                aVar.f3054b.setOnStartEnterTransitionListener(interfaceC0406l);
            }
        }
    }

    /* renamed from: M */
    public Fragment m1962M(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3036c.size() - 1; size >= 0; size--) {
            AbstractC0439y.a aVar = this.f3036c.get(size);
            int i10 = aVar.f3053a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3054b;
                            break;
                        case 10:
                            aVar.f3060h = aVar.f3059g;
                            break;
                    }
                }
                arrayList.add(aVar.f3054b);
            }
            arrayList.remove(aVar.f3054b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC0428n.o
    /* renamed from: a */
    public boolean mo1963a(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3042i) {
            return true;
        }
        this.f2743t.m2193e(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: j */
    public int mo1964j() {
        return m1974z(false);
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: k */
    public int mo1965k() {
        return m1974z(true);
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: l */
    public void mo1966l() {
        m2369o();
        this.f2743t.m2189c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: m */
    public void mo1967m() {
        m2369o();
        this.f2743t.m2189c0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: n */
    public AbstractC0439y mo1968n(Fragment fragment) {
        AbstractC0428n abstractC0428n = fragment.mFragmentManager;
        if (abstractC0428n == null || abstractC0428n == this.f2743t) {
            return super.mo1968n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: p */
    public void mo1969p(int i10, Fragment fragment, String str, int i11) {
        super.mo1969p(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f2743t;
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: q */
    public AbstractC0439y mo1970q(Fragment fragment) {
        AbstractC0428n abstractC0428n = fragment.mFragmentManager;
        if (abstractC0428n == null || abstractC0428n == this.f2743t) {
            return super.mo1970q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2745v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2745v);
        }
        if (this.f3044k != null) {
            sb2.append(" ");
            sb2.append(this.f3044k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: v */
    public AbstractC0439y mo1971v(Fragment fragment, AbstractC0572g.c cVar) {
        if (fragment.mFragmentManager != this.f2743t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2743t);
        }
        if (cVar == AbstractC0572g.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != AbstractC0572g.c.DESTROYED) {
            return super.mo1971v(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.AbstractC0439y
    /* renamed from: w */
    public AbstractC0439y mo1972w(Fragment fragment) {
        AbstractC0428n abstractC0428n;
        if (fragment == null || (abstractC0428n = fragment.mFragmentManager) == null || abstractC0428n == this.f2743t) {
            return super.mo1972w(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: y */
    public void m1973y(int i10) {
        if (this.f3042i) {
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3036c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0439y.a aVar = this.f3036c.get(i11);
                Fragment fragment = aVar.f3054b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (AbstractC0428n.m2129G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3054b + " to " + aVar.f3054b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public int m1974z(boolean z10) {
        if (this.f2744u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0415d0("FragmentManager"));
            m1951A("  ", printWriter);
            printWriter.close();
        }
        this.f2744u = true;
        this.f2745v = this.f3042i ? this.f2743t.m2208j() : -1;
        this.f2743t.m2183Z(this, z10);
        return this.f2745v;
    }
}
