package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p003a2.C0013e;
import p175k0.C5441b;
import p235o0.C6824g0;
import p235o0.ViewTreeObserverOnPreDrawListenerC6865z;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/z.class
 */
/* renamed from: androidx.fragment.app.z */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z.class */
public class C0440z {

    /* renamed from: a */
    public static final int[] f3061a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final AbstractC0411b0 f3062b = new C0409a0();

    /* renamed from: c */
    public static final AbstractC0411b0 f3063c = m2400w();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$a.class
     */
    /* renamed from: androidx.fragment.app.z$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final g f3064b;

        /* renamed from: c */
        public final Fragment f3065c;

        /* renamed from: d */
        public final C5441b f3066d;

        public a(g gVar, Fragment fragment, C5441b c5441b) {
            this.f3064b = gVar;
            this.f3065c = fragment;
            this.f3066d = c5441b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3064b.mo2258a(this.f3065c, this.f3066d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$b.class
     */
    /* renamed from: androidx.fragment.app.z$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final ArrayList f3067b;

        public b(ArrayList arrayList) {
            this.f3067b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0440z.m2375A(this.f3067b, 4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$c.class
     */
    /* renamed from: androidx.fragment.app.z$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final g f3068b;

        /* renamed from: c */
        public final Fragment f3069c;

        /* renamed from: d */
        public final C5441b f3070d;

        public c(g gVar, Fragment fragment, C5441b c5441b) {
            this.f3068b = gVar;
            this.f3069c = fragment;
            this.f3070d = c5441b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3068b.mo2258a(this.f3069c, this.f3070d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$d.class
     */
    /* renamed from: androidx.fragment.app.z$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final Object f3071b;

        /* renamed from: c */
        public final AbstractC0411b0 f3072c;

        /* renamed from: d */
        public final View f3073d;

        /* renamed from: e */
        public final Fragment f3074e;

        /* renamed from: f */
        public final ArrayList f3075f;

        /* renamed from: g */
        public final ArrayList f3076g;

        /* renamed from: h */
        public final ArrayList f3077h;

        /* renamed from: i */
        public final Object f3078i;

        public d(Object obj, AbstractC0411b0 abstractC0411b0, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3071b = obj;
            this.f3072c = abstractC0411b0;
            this.f3073d = view;
            this.f3074e = fragment;
            this.f3075f = arrayList;
            this.f3076g = arrayList2;
            this.f3077h = arrayList3;
            this.f3078i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3071b;
            if (obj != null) {
                this.f3072c.mo90p(obj, this.f3073d);
                this.f3076g.addAll(C0440z.m2388k(this.f3072c, this.f3071b, this.f3074e, this.f3075f, this.f3073d));
            }
            if (this.f3077h != null) {
                if (this.f3078i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3073d);
                    this.f3072c.mo91q(this.f3078i, this.f3077h, arrayList);
                }
                this.f3077h.clear();
                this.f3077h.add(this.f3073d);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$e.class
     */
    /* renamed from: androidx.fragment.app.z$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final Fragment f3079b;

        /* renamed from: c */
        public final Fragment f3080c;

        /* renamed from: d */
        public final boolean f3081d;

        /* renamed from: e */
        public final C7928a f3082e;

        /* renamed from: f */
        public final View f3083f;

        /* renamed from: g */
        public final AbstractC0411b0 f3084g;

        /* renamed from: h */
        public final Rect f3085h;

        public e(Fragment fragment, Fragment fragment2, boolean z10, C7928a c7928a, View view, AbstractC0411b0 abstractC0411b0, Rect rect) {
            this.f3079b = fragment;
            this.f3080c = fragment2;
            this.f3081d = z10;
            this.f3082e = c7928a;
            this.f3083f = view;
            this.f3084g = abstractC0411b0;
            this.f3085h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0440z.m2383f(this.f3079b, this.f3080c, this.f3081d, this.f3082e, false);
            View view = this.f3083f;
            if (view != null) {
                this.f3084g.m1985k(view, this.f3085h);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$f.class
     */
    /* renamed from: androidx.fragment.app.z$f */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$f.class */
    public class f implements Runnable {

        /* renamed from: b */
        public final AbstractC0411b0 f3086b;

        /* renamed from: c */
        public final C7928a f3087c;

        /* renamed from: d */
        public final Object f3088d;

        /* renamed from: e */
        public final h f3089e;

        /* renamed from: f */
        public final ArrayList f3090f;

        /* renamed from: g */
        public final View f3091g;

        /* renamed from: h */
        public final Fragment f3092h;

        /* renamed from: i */
        public final Fragment f3093i;

        /* renamed from: j */
        public final boolean f3094j;

        /* renamed from: k */
        public final ArrayList f3095k;

        /* renamed from: l */
        public final Object f3096l;

        /* renamed from: m */
        public final Rect f3097m;

        public f(AbstractC0411b0 abstractC0411b0, C7928a c7928a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3086b = abstractC0411b0;
            this.f3087c = c7928a;
            this.f3088d = obj;
            this.f3089e = hVar;
            this.f3090f = arrayList;
            this.f3091g = view;
            this.f3092h = fragment;
            this.f3093i = fragment2;
            this.f3094j = z10;
            this.f3095k = arrayList2;
            this.f3096l = obj2;
            this.f3097m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7928a<String, View> m2385h = C0440z.m2385h(this.f3086b, this.f3087c, this.f3088d, this.f3089e);
            if (m2385h != null) {
                this.f3090f.addAll(m2385h.values());
                this.f3090f.add(this.f3091g);
            }
            C0440z.m2383f(this.f3092h, this.f3093i, this.f3094j, m2385h, false);
            Object obj = this.f3088d;
            if (obj != null) {
                this.f3086b.mo81A(obj, this.f3095k, this.f3090f);
                View m2396s = C0440z.m2396s(m2385h, this.f3089e, this.f3096l, this.f3094j);
                if (m2396s != null) {
                    this.f3086b.m1985k(m2396s, this.f3097m);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$g.class
     */
    /* renamed from: androidx.fragment.app.z$g */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$g.class */
    public interface g {
        /* renamed from: a */
        void mo2258a(Fragment fragment, C5441b c5441b);

        /* renamed from: b */
        void mo2259b(Fragment fragment, C5441b c5441b);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/z$h.class
     */
    /* renamed from: androidx.fragment.app.z$h */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/z$h.class */
    public static class h {

        /* renamed from: a */
        public Fragment f3098a;

        /* renamed from: b */
        public boolean f3099b;

        /* renamed from: c */
        public C0408a f3100c;

        /* renamed from: d */
        public Fragment f3101d;

        /* renamed from: e */
        public boolean f3102e;

        /* renamed from: f */
        public C0408a f3103f;
    }

    /* renamed from: A */
    public static void m2375A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* renamed from: B */
    public static void m2376B(Context context, AbstractC0420g abstractC0420g, ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            C0408a c0408a = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                m2382e(c0408a, sparseArray, z10);
            } else {
                m2380c(c0408a, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                C7928a<String, String> m2381d = m2381d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (abstractC0420g.mo1941d() && (viewGroup = (ViewGroup) abstractC0420g.mo1940c(keyAt)) != null) {
                    if (z10) {
                        m2392o(viewGroup, hVar, view, m2381d, gVar);
                    } else {
                        m2391n(viewGroup, hVar, view, m2381d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public static boolean m2377C() {
        return (f3062b == null && f3063c == null) ? false : true;
    }

    /* renamed from: a */
    public static void m2378a(ArrayList<View> arrayList, C7928a<String, View> c7928a, Collection<String> collection) {
        for (int size = c7928a.size() - 1; size >= 0; size--) {
            View m34443n = c7928a.m34443n(size);
            if (collection.contains(C6824g0.m31491L(m34443n))) {
                arrayList.add(m34443n);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x013d, code lost:
    
        if (r0.mHidden == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d2, code lost:
    
        if (r5.f3101d == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0089, code lost:
    
        if (r0.mAdded != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f8, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2379b(androidx.fragment.app.C0408a r4, androidx.fragment.app.AbstractC0439y.a r5, android.util.SparseArray<androidx.fragment.app.C0440z.h> r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0440z.m2379b(androidx.fragment.app.a, androidx.fragment.app.y$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m2380c(C0408a c0408a, SparseArray<h> sparseArray, boolean z10) {
        int size = c0408a.f3036c.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2379b(c0408a, c0408a.f3036c.get(i10), sparseArray, false, z10);
        }
    }

    /* renamed from: d */
    public static C7928a<String, String> m2381d(int i10, ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C7928a<String, String> c7928a = new C7928a<>();
        while (true) {
            i12--;
            if (i12 < i11) {
                return c7928a;
            }
            C0408a c0408a = arrayList.get(i12);
            if (c0408a.m1957G(i10)) {
                boolean booleanValue = arrayList2.get(i12).booleanValue();
                ArrayList<String> arrayList5 = c0408a.f3049p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList4 = c0408a.f3049p;
                        arrayList3 = c0408a.f3050q;
                    } else {
                        arrayList3 = c0408a.f3049p;
                        arrayList4 = c0408a.f3050q;
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        String str = arrayList3.get(i13);
                        String str2 = arrayList4.get(i13);
                        String remove = c7928a.remove(str2);
                        if (remove != null) {
                            c7928a.put(str, remove);
                        } else {
                            c7928a.put(str, str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m2382e(C0408a c0408a, SparseArray<h> sparseArray, boolean z10) {
        if (c0408a.f2743t.m2223o0().mo1941d()) {
            for (int size = c0408a.f3036c.size() - 1; size >= 0; size--) {
                m2379b(c0408a, c0408a.f3036c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* renamed from: f */
    public static void m2383f(Fragment fragment, Fragment fragment2, boolean z10, C7928a<String, View> c7928a, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: g */
    public static boolean m2384g(AbstractC0411b0 abstractC0411b0, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!abstractC0411b0.mo86e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static C7928a<String, View> m2385h(AbstractC0411b0 abstractC0411b0, C7928a<String, String> c7928a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3098a;
        View view = fragment.getView();
        if (c7928a.isEmpty() || obj == null || view == null) {
            c7928a.clear();
            return null;
        }
        C7928a<String, View> c7928a2 = new C7928a<>();
        abstractC0411b0.m1984j(c7928a2, view);
        C0408a c0408a = hVar.f3100c;
        if (hVar.f3099b) {
            fragment.getExitTransitionCallback();
            arrayList = c0408a.f3049p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = c0408a.f3050q;
        }
        if (arrayList != null) {
            c7928a2.m34356p(arrayList);
            c7928a2.m34356p(c7928a.values());
        }
        m2401x(c7928a, c7928a2);
        return c7928a2;
    }

    /* renamed from: i */
    public static C7928a<String, View> m2386i(AbstractC0411b0 abstractC0411b0, C7928a<String, String> c7928a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (c7928a.isEmpty() || obj == null) {
            c7928a.clear();
            return null;
        }
        Fragment fragment = hVar.f3101d;
        C7928a<String, View> c7928a2 = new C7928a<>();
        abstractC0411b0.m1984j(c7928a2, fragment.requireView());
        C0408a c0408a = hVar.f3103f;
        if (hVar.f3102e) {
            fragment.getEnterTransitionCallback();
            arrayList = c0408a.f3050q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = c0408a.f3049p;
        }
        if (arrayList != null) {
            c7928a2.m34356p(arrayList);
        }
        c7928a.m34356p(c7928a2.keySet());
        return c7928a2;
    }

    /* renamed from: j */
    public static AbstractC0411b0 m2387j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0411b0 abstractC0411b0 = f3062b;
        if (abstractC0411b0 != null && m2384g(abstractC0411b0, arrayList)) {
            return abstractC0411b0;
        }
        AbstractC0411b0 abstractC0411b02 = f3063c;
        if (abstractC0411b02 != null && m2384g(abstractC0411b02, arrayList)) {
            return abstractC0411b02;
        }
        if (abstractC0411b0 == null && abstractC0411b02 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    public static ArrayList<View> m2388k(AbstractC0411b0 abstractC0411b0, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                abstractC0411b0.m1983f(arrayList3, view2);
            }
            if (arrayList != null) {
                arrayList3.removeAll(arrayList);
            }
            arrayList2 = arrayList3;
            if (!arrayList3.isEmpty()) {
                arrayList3.add(view);
                abstractC0411b0.mo84b(obj, arrayList3);
                arrayList2 = arrayList3;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    /* renamed from: l */
    public static Object m2389l(AbstractC0411b0 abstractC0411b0, ViewGroup viewGroup, View view, C7928a<String, String> c7928a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Rect rect;
        Fragment fragment = hVar.f3098a;
        Fragment fragment2 = hVar.f3101d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3099b;
        Object m2397t = c7928a.isEmpty() ? null : m2397t(abstractC0411b0, fragment, fragment2, z10);
        C7928a<String, View> m2386i = m2386i(abstractC0411b0, c7928a, m2397t, hVar);
        if (c7928a.isEmpty()) {
            m2397t = null;
        } else {
            arrayList.addAll(m2386i.values());
        }
        if (obj == null && obj2 == null && m2397t == null) {
            return null;
        }
        m2383f(fragment, fragment2, z10, m2386i, true);
        if (m2397t != null) {
            Rect rect2 = new Rect();
            abstractC0411b0.mo97z(m2397t, view, arrayList);
            m2403z(abstractC0411b0, m2397t, obj2, m2386i, hVar.f3102e, hVar.f3103f);
            rect = rect2;
            if (obj != null) {
                abstractC0411b0.mo94u(obj, rect2);
                rect = rect2;
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(viewGroup, new f(abstractC0411b0, c7928a, m2397t, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return m2397t;
    }

    /* renamed from: m */
    public static Object m2390m(AbstractC0411b0 abstractC0411b0, ViewGroup viewGroup, View view, C7928a<String, String> c7928a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3098a;
        Fragment fragment2 = hVar.f3101d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3099b;
        Object m2397t = c7928a.isEmpty() ? null : m2397t(abstractC0411b0, fragment, fragment2, z10);
        C7928a<String, View> m2386i = m2386i(abstractC0411b0, c7928a, m2397t, hVar);
        C7928a<String, View> m2385h = m2385h(abstractC0411b0, c7928a, m2397t, hVar);
        if (c7928a.isEmpty()) {
            if (m2386i != null) {
                m2386i.clear();
            }
            if (m2385h != null) {
                m2385h.clear();
            }
            obj3 = null;
        } else {
            m2378a(arrayList, m2386i, c7928a.keySet());
            m2378a(arrayList2, m2385h, c7928a.values());
            obj3 = m2397t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2383f(fragment, fragment2, z10, m2386i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0411b0.mo97z(obj3, view, arrayList);
            m2403z(abstractC0411b0, obj3, obj2, m2386i, hVar.f3102e, hVar.f3103f);
            rect = new Rect();
            view2 = m2396s(m2385h, hVar, obj, z10);
            if (view2 != null) {
                abstractC0411b0.mo94u(obj, rect);
            }
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(viewGroup, new e(fragment, fragment2, z10, m2385h, view2, abstractC0411b0, rect));
        return obj3;
    }

    /* renamed from: n */
    public static void m2391n(ViewGroup viewGroup, h hVar, View view, C7928a<String, String> c7928a, g gVar) {
        Fragment fragment = hVar.f3098a;
        Fragment fragment2 = hVar.f3101d;
        AbstractC0411b0 m2387j = m2387j(fragment2, fragment);
        if (m2387j == null) {
            return;
        }
        boolean z10 = hVar.f3099b;
        boolean z11 = hVar.f3102e;
        Object m2394q = m2394q(m2387j, fragment, z10);
        Object m2395r = m2395r(m2387j, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m2389l = m2389l(m2387j, viewGroup, view, c7928a, hVar, arrayList, arrayList2, m2394q, m2395r);
        if (m2394q == null && m2389l == null && m2395r == null) {
            return;
        }
        ArrayList<View> m2388k = m2388k(m2387j, m2395r, fragment2, arrayList, view);
        if (m2388k == null || m2388k.isEmpty()) {
            m2395r = null;
        }
        m2387j.mo83a(m2394q, view);
        Object m2398u = m2398u(m2387j, m2394q, m2395r, m2389l, fragment, hVar.f3099b);
        if (fragment2 != null && m2388k != null && (m2388k.size() > 0 || arrayList.size() > 0)) {
            C5441b c5441b = new C5441b();
            gVar.mo2259b(fragment2, c5441b);
            m2387j.mo96w(fragment2, m2398u, c5441b, new c(gVar, fragment2, c5441b));
        }
        if (m2398u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m2387j.mo93t(m2398u, m2394q, arrayList3, m2395r, m2388k, m2389l, arrayList2);
            m2402y(m2387j, viewGroup, fragment, view, arrayList2, m2394q, arrayList3, m2395r, m2388k);
            m2387j.m1988x(viewGroup, arrayList2, c7928a);
            m2387j.mo85c(viewGroup, m2398u);
            m2387j.m1987s(viewGroup, arrayList2, c7928a);
        }
    }

    /* renamed from: o */
    public static void m2392o(ViewGroup viewGroup, h hVar, View view, C7928a<String, String> c7928a, g gVar) {
        Fragment fragment = hVar.f3098a;
        Fragment fragment2 = hVar.f3101d;
        AbstractC0411b0 m2387j = m2387j(fragment2, fragment);
        if (m2387j == null) {
            return;
        }
        boolean z10 = hVar.f3099b;
        boolean z11 = hVar.f3102e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m2394q = m2394q(m2387j, fragment, z10);
        Object m2395r = m2395r(m2387j, fragment2, z11);
        Object m2390m = m2390m(m2387j, viewGroup, view, c7928a, hVar, arrayList2, arrayList, m2394q, m2395r);
        if (m2394q == null && m2390m == null && m2395r == null) {
            return;
        }
        ArrayList<View> m2388k = m2388k(m2387j, m2395r, fragment2, arrayList2, view);
        ArrayList<View> m2388k2 = m2388k(m2387j, m2394q, fragment, arrayList, view);
        m2375A(m2388k2, 4);
        Object m2398u = m2398u(m2387j, m2394q, m2395r, m2390m, fragment, z10);
        if (fragment2 != null && m2388k != null && (m2388k.size() > 0 || arrayList2.size() > 0)) {
            C5441b c5441b = new C5441b();
            gVar.mo2259b(fragment2, c5441b);
            m2387j.mo96w(fragment2, m2398u, c5441b, new a(gVar, fragment2, c5441b));
        }
        if (m2398u != null) {
            m2399v(m2387j, m2395r, fragment2, m2388k);
            ArrayList<String> m1986o = m2387j.m1986o(arrayList);
            m2387j.mo93t(m2398u, m2394q, m2388k2, m2395r, m2388k, m2390m, arrayList);
            m2387j.mo85c(viewGroup, m2398u);
            m2387j.m1989y(viewGroup, arrayList2, arrayList, m1986o, c7928a);
            m2375A(m2388k2, 0);
            m2387j.mo81A(m2390m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    public static h m2393p(h hVar, SparseArray<h> sparseArray, int i10) {
        h hVar2 = hVar;
        if (hVar == null) {
            hVar2 = new h();
            sparseArray.put(i10, hVar2);
        }
        return hVar2;
    }

    /* renamed from: q */
    public static Object m2394q(AbstractC0411b0 abstractC0411b0, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return abstractC0411b0.mo87g(z10 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* renamed from: r */
    public static Object m2395r(AbstractC0411b0 abstractC0411b0, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return abstractC0411b0.mo87g(z10 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* renamed from: s */
    public static View m2396s(C7928a<String, View> c7928a, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        C0408a c0408a = hVar.f3100c;
        if (obj == null || c7928a == null || (arrayList = c0408a.f3049p) == null || arrayList.isEmpty()) {
            return null;
        }
        return c7928a.get((z10 ? c0408a.f3049p : c0408a.f3050q).get(0));
    }

    /* renamed from: t */
    public static Object m2397t(AbstractC0411b0 abstractC0411b0, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC0411b0.mo82B(abstractC0411b0.mo87g(z10 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* renamed from: u */
    public static Object m2398u(AbstractC0411b0 abstractC0411b0, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? abstractC0411b0.mo89n(obj2, obj, obj3) : abstractC0411b0.mo88m(obj2, obj, obj3);
    }

    /* renamed from: v */
    public static void m2399v(AbstractC0411b0 abstractC0411b0, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            abstractC0411b0.mo92r(obj, fragment.getView(), arrayList);
            ViewTreeObserverOnPreDrawListenerC6865z.m31685a(fragment.mContainer, new b(arrayList));
        }
    }

    /* renamed from: w */
    public static AbstractC0411b0 m2400w() {
        try {
            return (AbstractC0411b0) C0013e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m2401x(C7928a<String, String> c7928a, C7928a<String, View> c7928a2) {
        for (int size = c7928a.size() - 1; size >= 0; size--) {
            if (!c7928a2.containsKey(c7928a.m34443n(size))) {
                c7928a.m34441l(size);
            }
        }
    }

    /* renamed from: y */
    public static void m2402y(AbstractC0411b0 abstractC0411b0, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(viewGroup, new d(obj, abstractC0411b0, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    public static void m2403z(AbstractC0411b0 abstractC0411b0, Object obj, Object obj2, C7928a<String, View> c7928a, boolean z10, C0408a c0408a) {
        ArrayList<String> arrayList = c0408a.f3049p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c7928a.get((z10 ? c0408a.f3050q : c0408a.f3049p).get(0));
        abstractC0411b0.mo95v(obj, view);
        if (obj2 != null) {
            abstractC0411b0.mo95v(obj2, view);
        }
    }
}
