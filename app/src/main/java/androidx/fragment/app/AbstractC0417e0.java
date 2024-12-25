package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p175k0.C5441b;
import p235o0.C6824g0;
import p374w0.C9394b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/e0.class
 */
/* renamed from: androidx.fragment.app.e0 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0.class */
public abstract class AbstractC0417e0 {

    /* renamed from: a */
    public final ViewGroup f2861a;

    /* renamed from: b */
    public final ArrayList<e> f2862b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<e> f2863c = new ArrayList<>();

    /* renamed from: d */
    public boolean f2864d = false;

    /* renamed from: e */
    public boolean f2865e = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e0$a.class
     */
    /* renamed from: androidx.fragment.app.e0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final d f2866b;

        /* renamed from: c */
        public final AbstractC0417e0 f2867c;

        public a(AbstractC0417e0 abstractC0417e0, d dVar) {
            this.f2867c = abstractC0417e0;
            this.f2866b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2867c.f2862b.contains(this.f2866b)) {
                this.f2866b.m2064e().applyState(this.f2866b.m2065f().mView);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e0$b.class
     */
    /* renamed from: androidx.fragment.app.e0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final d f2868b;

        /* renamed from: c */
        public final AbstractC0417e0 f2869c;

        public b(AbstractC0417e0 abstractC0417e0, d dVar) {
            this.f2869c = abstractC0417e0;
            this.f2868b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2869c.f2862b.remove(this.f2868b);
            this.f2869c.f2863c.remove(this.f2868b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e0$c.class
     */
    /* renamed from: androidx.fragment.app.e0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$c.class */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final int[] f2870a;

        /* renamed from: b */
        public static final int[] f2871b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x006c
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.fragment.app.e0$e$b[] r0 = androidx.fragment.app.AbstractC0417e0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.fragment.app.AbstractC0417e0.c.f2871b = r0
                r0 = r4
                androidx.fragment.app.e0$e$b r1 = androidx.fragment.app.AbstractC0417e0.e.b.ADDING     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L14:
                int[] r0 = androidx.fragment.app.AbstractC0417e0.c.f2871b     // Catch: java.lang.NoSuchFieldError -> L60 java.lang.NoSuchFieldError -> L64
                androidx.fragment.app.e0$e$b r1 = androidx.fragment.app.AbstractC0417e0.e.b.REMOVING     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L1f:
                int[] r0 = androidx.fragment.app.AbstractC0417e0.c.f2871b     // Catch: java.lang.NoSuchFieldError -> L64 java.lang.NoSuchFieldError -> L68
                androidx.fragment.app.e0$e$b r1 = androidx.fragment.app.AbstractC0417e0.e.b.NONE     // Catch: java.lang.NoSuchFieldError -> L68
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L68
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L68
            L2a:
                androidx.fragment.app.e0$e$c[] r0 = androidx.fragment.app.AbstractC0417e0.e.c.values()     // Catch: java.lang.NoSuchFieldError -> L68
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.fragment.app.AbstractC0417e0.c.f2870a = r0
                r0 = r4
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.REMOVED     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L3e:
                int[] r0 = androidx.fragment.app.AbstractC0417e0.c.f2870a     // Catch: java.lang.NoSuchFieldError -> L6c java.lang.NoSuchFieldError -> L70
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L70
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L70
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L70
            L49:
                int[] r0 = androidx.fragment.app.AbstractC0417e0.c.f2870a     // Catch: java.lang.NoSuchFieldError -> L70 java.lang.NoSuchFieldError -> L74
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.GONE     // Catch: java.lang.NoSuchFieldError -> L74
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L74
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L74
            L54:
                int[] r0 = androidx.fragment.app.AbstractC0417e0.c.f2870a     // Catch: java.lang.NoSuchFieldError -> L74 java.lang.NoSuchFieldError -> L78
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L5f:
                return
            L60:
                r4 = move-exception
                goto L14
            L64:
                r4 = move-exception
                goto L1f
            L68:
                r4 = move-exception
                goto L2a
            L6c:
                r4 = move-exception
                goto L3e
            L70:
                r4 = move-exception
                goto L49
            L74:
                r4 = move-exception
                goto L54
            L78:
                r4 = move-exception
                goto L5f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0417e0.c.m43016clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e0$d.class
     */
    /* renamed from: androidx.fragment.app.e0$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$d.class */
    public static class d extends e {

        /* renamed from: h */
        public final C0436v f2872h;

        public d(e.c cVar, e.b bVar, C0436v c0436v, C5441b c5441b) {
            super(cVar, bVar, c0436v.m2323k(), c5441b);
            this.f2872h = c0436v;
        }

        @Override // androidx.fragment.app.AbstractC0417e0.e
        /* renamed from: c */
        public void mo2059c() {
            super.mo2059c();
            this.f2872h.m2325m();
        }

        @Override // androidx.fragment.app.AbstractC0417e0.e
        /* renamed from: l */
        public void mo2060l() {
            if (m2066g() == e.b.ADDING) {
                Fragment m2323k = this.f2872h.m2323k();
                View findFocus = m2323k.mView.findFocus();
                if (findFocus != null) {
                    m2323k.setFocusedView(findFocus);
                    if (AbstractC0428n.m2129G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m2323k);
                    }
                }
                View requireView = m2065f().requireView();
                if (requireView.getParent() == null) {
                    this.f2872h.m2314b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m2323k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e0$e.class
     */
    /* renamed from: androidx.fragment.app.e0$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$e.class */
    public static class e {

        /* renamed from: a */
        public c f2873a;

        /* renamed from: b */
        public b f2874b;

        /* renamed from: c */
        public final Fragment f2875c;

        /* renamed from: d */
        public final List<Runnable> f2876d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C5441b> f2877e = new HashSet<>();

        /* renamed from: f */
        public boolean f2878f = false;

        /* renamed from: g */
        public boolean f2879g = false;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/e0$e$a.class
         */
        /* renamed from: androidx.fragment.app.e0$e$a */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$e$a.class */
        public class a implements C5441b.a {

            /* renamed from: a */
            public final e f2880a;

            public a(e eVar) {
                this.f2880a = eVar;
            }

            @Override // p175k0.C5441b.a
            public void onCancel() {
                this.f2880a.m2062b();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/e0$e$b.class
         */
        /* renamed from: androidx.fragment.app.e0$e$b */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$e$b.class */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/e0$e$c.class
         */
        /* renamed from: androidx.fragment.app.e0$e$c */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e0$e$c.class */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            public static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i10;
                int i11 = c.f2870a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (AbstractC0428n.m2129G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (AbstractC0428n.m2129G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, C5441b c5441b) {
            this.f2873a = cVar;
            this.f2874b = bVar;
            this.f2875c = fragment;
            c5441b.m27193d(new a(this));
        }

        /* renamed from: a */
        public final void m2061a(Runnable runnable) {
            this.f2876d.add(runnable);
        }

        /* renamed from: b */
        public final void m2062b() {
            if (m2067h()) {
                return;
            }
            this.f2878f = true;
            if (this.f2877e.isEmpty()) {
                mo2059c();
                return;
            }
            Iterator it = new ArrayList(this.f2877e).iterator();
            while (it.hasNext()) {
                ((C5441b) it.next()).m27190a();
            }
        }

        /* renamed from: c */
        public void mo2059c() {
            if (this.f2879g) {
                return;
            }
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2879g = true;
            Iterator<Runnable> it = this.f2876d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m2063d(C5441b c5441b) {
            if (this.f2877e.remove(c5441b) && this.f2877e.isEmpty()) {
                mo2059c();
            }
        }

        /* renamed from: e */
        public c m2064e() {
            return this.f2873a;
        }

        /* renamed from: f */
        public final Fragment m2065f() {
            return this.f2875c;
        }

        /* renamed from: g */
        public b m2066g() {
            return this.f2874b;
        }

        /* renamed from: h */
        public final boolean m2067h() {
            return this.f2878f;
        }

        /* renamed from: i */
        public final boolean m2068i() {
            return this.f2879g;
        }

        /* renamed from: j */
        public final void m2069j(C5441b c5441b) {
            mo2060l();
            this.f2877e.add(c5441b);
        }

        /* renamed from: k */
        public final void m2070k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f2871b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f2873a != c.REMOVED) {
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2875c + " mFinalState = " + this.f2873a + " -> " + cVar + ". ");
                        }
                        this.f2873a = cVar;
                        return;
                    }
                    return;
                }
                if (AbstractC0428n.m2129G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2875c + " mFinalState = " + this.f2873a + " -> REMOVED. mLifecycleImpact  = " + this.f2874b + " to REMOVING.");
                }
                this.f2873a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2873a != c.REMOVED) {
                    return;
                }
                if (AbstractC0428n.m2129G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2875c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2874b + " to ADDING.");
                }
                this.f2873a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2874b = bVar2;
        }

        /* renamed from: l */
        public void mo2060l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2873a + "} {mLifecycleImpact = " + this.f2874b + "} {mFragment = " + this.f2875c + "}";
        }
    }

    public AbstractC0417e0(ViewGroup viewGroup) {
        this.f2861a = viewGroup;
    }

    /* renamed from: n */
    public static AbstractC0417e0 m2042n(ViewGroup viewGroup, AbstractC0428n abstractC0428n) {
        return m2043o(viewGroup, abstractC0428n.m2255z0());
    }

    /* renamed from: o */
    public static AbstractC0417e0 m2043o(ViewGroup viewGroup, InterfaceC0419f0 interfaceC0419f0) {
        int i10 = C9394b.f43076b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof AbstractC0417e0) {
            return (AbstractC0417e0) tag;
        }
        AbstractC0417e0 mo2075a = interfaceC0419f0.mo2075a(viewGroup);
        viewGroup.setTag(i10, mo2075a);
        return mo2075a;
    }

    /* renamed from: a */
    public final void m2044a(e.c cVar, e.b bVar, C0436v c0436v) {
        synchronized (this.f2862b) {
            C5441b c5441b = new C5441b();
            e m2050h = m2050h(c0436v.m2323k());
            if (m2050h != null) {
                m2050h.m2070k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0436v, c5441b);
            this.f2862b.add(dVar);
            dVar.m2061a(new a(this, dVar));
            dVar.m2061a(new b(this, dVar));
        }
    }

    /* renamed from: b */
    public void m2045b(e.c cVar, C0436v c0436v) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0436v.m2323k());
        }
        m2044a(cVar, e.b.ADDING, c0436v);
    }

    /* renamed from: c */
    public void m2046c(C0436v c0436v) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0436v.m2323k());
        }
        m2044a(e.c.GONE, e.b.NONE, c0436v);
    }

    /* renamed from: d */
    public void m2047d(C0436v c0436v) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0436v.m2323k());
        }
        m2044a(e.c.REMOVED, e.b.REMOVING, c0436v);
    }

    /* renamed from: e */
    public void m2048e(C0436v c0436v) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0436v.m2323k());
        }
        m2044a(e.c.VISIBLE, e.b.NONE, c0436v);
    }

    /* renamed from: f */
    public abstract void mo1990f(List<e> list, boolean z10);

    /* renamed from: g */
    public void m2049g() {
        if (this.f2865e) {
            return;
        }
        if (!C6824g0.m31501T(this.f2861a)) {
            m2052j();
            this.f2864d = false;
            return;
        }
        synchronized (this.f2862b) {
            if (!this.f2862b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2863c);
                this.f2863c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (AbstractC0428n.m2129G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m2062b();
                    if (!eVar.m2068i()) {
                        this.f2863c.add(eVar);
                    }
                }
                m2057q();
                ArrayList arrayList2 = new ArrayList(this.f2862b);
                this.f2862b.clear();
                this.f2863c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo2060l();
                }
                mo1990f(arrayList2, this.f2864d);
                this.f2864d = false;
            }
        }
    }

    /* renamed from: h */
    public final e m2050h(Fragment fragment) {
        Iterator<e> it = this.f2862b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2065f().equals(fragment) && !next.m2067h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final e m2051i(Fragment fragment) {
        Iterator<e> it = this.f2863c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2065f().equals(fragment) && !next.m2067h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m2052j() {
        String str;
        String str2;
        boolean m31501T = C6824g0.m31501T(this.f2861a);
        synchronized (this.f2862b) {
            m2057q();
            Iterator<e> it = this.f2862b.iterator();
            while (it.hasNext()) {
                it.next().mo2060l();
            }
            Iterator it2 = new ArrayList(this.f2863c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (AbstractC0428n.m2129G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m31501T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2861a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m2062b();
            }
            Iterator it3 = new ArrayList(this.f2862b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (AbstractC0428n.m2129G0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m31501T) {
                        str = "";
                    } else {
                        str = "Container " + this.f2861a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m2062b();
            }
        }
    }

    /* renamed from: k */
    public void m2053k() {
        if (this.f2865e) {
            this.f2865e = false;
            m2049g();
        }
    }

    /* renamed from: l */
    public e.b m2054l(C0436v c0436v) {
        e m2050h = m2050h(c0436v.m2323k());
        if (m2050h != null) {
            return m2050h.m2066g();
        }
        e m2051i = m2051i(c0436v.m2323k());
        if (m2051i != null) {
            return m2051i.m2066g();
        }
        return null;
    }

    /* renamed from: m */
    public ViewGroup m2055m() {
        return this.f2861a;
    }

    /* renamed from: p */
    public void m2056p() {
        synchronized (this.f2862b) {
            m2057q();
            this.f2865e = false;
            int size = this.f2862b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f2862b.get(size);
                e.c from = e.c.from(eVar.m2065f().mView);
                e.c m2064e = eVar.m2064e();
                e.c cVar = e.c.VISIBLE;
                if (m2064e == cVar && from != cVar) {
                    this.f2865e = eVar.m2065f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void m2057q() {
        Iterator<e> it = this.f2862b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m2066g() == e.b.ADDING) {
                next.m2070k(e.c.from(next.m2065f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* renamed from: r */
    public void m2058r(boolean z10) {
        this.f2864d = z10;
    }
}
