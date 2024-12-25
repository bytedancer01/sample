package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0417e0;
import androidx.fragment.app.C0418f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p175k0.C5441b;
import p221n0.C6616h;
import p235o0.C6824g0;
import p235o0.ViewTreeObserverOnPreDrawListenerC6865z;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/c.class
 */
/* renamed from: androidx.fragment.app.c */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c.class */
public class C0412c extends AbstractC0417e0 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$a.class
     */
    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f2788a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.fragment.app.e0$e$c[] r0 = androidx.fragment.app.AbstractC0417e0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.fragment.app.C0412c.a.f2788a = r0
                r0 = r4
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.GONE     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = androidx.fragment.app.C0412c.a.f2788a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = androidx.fragment.app.C0412c.a.f2788a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.REMOVED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = androidx.fragment.app.C0412c.a.f2788a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.AbstractC0417e0.e.c.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0412c.a.m43015clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$b.class
     */
    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final List f2789b;

        /* renamed from: c */
        public final AbstractC0417e0.e f2790c;

        /* renamed from: d */
        public final C0412c f2791d;

        public b(C0412c c0412c, List list, AbstractC0417e0.e eVar) {
            this.f2791d = c0412c;
            this.f2789b = list;
            this.f2790c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2789b.contains(this.f2790c)) {
                this.f2789b.remove(this.f2790c);
                this.f2791d.m1991s(this.f2790c);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$c.class
     */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$c.class */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final ViewGroup f2792b;

        /* renamed from: c */
        public final View f2793c;

        /* renamed from: d */
        public final boolean f2794d;

        /* renamed from: e */
        public final AbstractC0417e0.e f2795e;

        /* renamed from: f */
        public final k f2796f;

        /* renamed from: g */
        public final C0412c f2797g;

        public c(C0412c c0412c, ViewGroup viewGroup, View view, boolean z10, AbstractC0417e0.e eVar, k kVar) {
            this.f2797g = c0412c;
            this.f2792b = viewGroup;
            this.f2793c = view;
            this.f2794d = z10;
            this.f2795e = eVar;
            this.f2796f = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2792b.endViewTransition(this.f2793c);
            if (this.f2794d) {
                this.f2795e.m2064e().applyState(this.f2793c);
            }
            this.f2796f.m1998a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$d.class
     */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$d.class */
    public class d implements C5441b.a {

        /* renamed from: a */
        public final Animator f2798a;

        /* renamed from: b */
        public final C0412c f2799b;

        public d(C0412c c0412c, Animator animator) {
            this.f2799b = c0412c;
            this.f2798a = animator;
        }

        @Override // p175k0.C5441b.a
        public void onCancel() {
            this.f2798a.end();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$e.class
     */
    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$e.class */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        public final ViewGroup f2800a;

        /* renamed from: b */
        public final View f2801b;

        /* renamed from: c */
        public final k f2802c;

        /* renamed from: d */
        public final C0412c f2803d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/c$e$a.class
         */
        /* renamed from: androidx.fragment.app.c$e$a */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final e f2804b;

            public a(e eVar) {
                this.f2804b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = this.f2804b;
                eVar.f2800a.endViewTransition(eVar.f2801b);
                this.f2804b.f2802c.m1998a();
            }
        }

        public e(C0412c c0412c, ViewGroup viewGroup, View view, k kVar) {
            this.f2803d = c0412c;
            this.f2800a = viewGroup;
            this.f2801b = view;
            this.f2802c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2800a.post(new a(this));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$f.class
     */
    /* renamed from: androidx.fragment.app.c$f */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$f.class */
    public class f implements C5441b.a {

        /* renamed from: a */
        public final View f2805a;

        /* renamed from: b */
        public final ViewGroup f2806b;

        /* renamed from: c */
        public final k f2807c;

        /* renamed from: d */
        public final C0412c f2808d;

        public f(C0412c c0412c, View view, ViewGroup viewGroup, k kVar) {
            this.f2808d = c0412c;
            this.f2805a = view;
            this.f2806b = viewGroup;
            this.f2807c = kVar;
        }

        @Override // p175k0.C5441b.a
        public void onCancel() {
            this.f2805a.clearAnimation();
            this.f2806b.endViewTransition(this.f2805a);
            this.f2807c.m1998a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$g.class
     */
    /* renamed from: androidx.fragment.app.c$g */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$g.class */
    public class g implements Runnable {

        /* renamed from: b */
        public final AbstractC0417e0.e f2809b;

        /* renamed from: c */
        public final AbstractC0417e0.e f2810c;

        /* renamed from: d */
        public final boolean f2811d;

        /* renamed from: e */
        public final C7928a f2812e;

        /* renamed from: f */
        public final C0412c f2813f;

        public g(C0412c c0412c, AbstractC0417e0.e eVar, AbstractC0417e0.e eVar2, boolean z10, C7928a c7928a) {
            this.f2813f = c0412c;
            this.f2809b = eVar;
            this.f2810c = eVar2;
            this.f2811d = z10;
            this.f2812e = c7928a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0440z.m2383f(this.f2809b.m2065f(), this.f2810c.m2065f(), this.f2811d, this.f2812e, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$h.class
     */
    /* renamed from: androidx.fragment.app.c$h */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$h.class */
    public class h implements Runnable {

        /* renamed from: b */
        public final AbstractC0411b0 f2814b;

        /* renamed from: c */
        public final View f2815c;

        /* renamed from: d */
        public final Rect f2816d;

        /* renamed from: e */
        public final C0412c f2817e;

        public h(C0412c c0412c, AbstractC0411b0 abstractC0411b0, View view, Rect rect) {
            this.f2817e = c0412c;
            this.f2814b = abstractC0411b0;
            this.f2815c = view;
            this.f2816d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2814b.m1985k(this.f2815c, this.f2816d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$i.class
     */
    /* renamed from: androidx.fragment.app.c$i */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$i.class */
    public class i implements Runnable {

        /* renamed from: b */
        public final ArrayList f2818b;

        /* renamed from: c */
        public final C0412c f2819c;

        public i(C0412c c0412c, ArrayList arrayList) {
            this.f2819c = c0412c;
            this.f2818b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0440z.m2375A(this.f2818b, 4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$j.class
     */
    /* renamed from: androidx.fragment.app.c$j */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$j.class */
    public class j implements Runnable {

        /* renamed from: b */
        public final m f2820b;

        /* renamed from: c */
        public final C0412c f2821c;

        public j(C0412c c0412c, m mVar) {
            this.f2821c = c0412c;
            this.f2820b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2820b.m1998a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$k.class
     */
    /* renamed from: androidx.fragment.app.c$k */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$k.class */
    public static class k extends l {

        /* renamed from: c */
        public boolean f2822c;

        /* renamed from: d */
        public boolean f2823d;

        /* renamed from: e */
        public C0418f.d f2824e;

        public k(AbstractC0417e0.e eVar, C5441b c5441b, boolean z10) {
            super(eVar, c5441b);
            this.f2823d = false;
            this.f2822c = z10;
        }

        /* renamed from: e */
        public C0418f.d m1997e(Context context) {
            if (this.f2823d) {
                return this.f2824e;
            }
            C0418f.d m2073c = C0418f.m2073c(context, m1999b().m2065f(), m1999b().m2064e() == AbstractC0417e0.e.c.VISIBLE, this.f2822c);
            this.f2824e = m2073c;
            this.f2823d = true;
            return m2073c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$l.class
     */
    /* renamed from: androidx.fragment.app.c$l */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$l.class */
    public static class l {

        /* renamed from: a */
        public final AbstractC0417e0.e f2825a;

        /* renamed from: b */
        public final C5441b f2826b;

        public l(AbstractC0417e0.e eVar, C5441b c5441b) {
            this.f2825a = eVar;
            this.f2826b = c5441b;
        }

        /* renamed from: a */
        public void m1998a() {
            this.f2825a.m2063d(this.f2826b);
        }

        /* renamed from: b */
        public AbstractC0417e0.e m1999b() {
            return this.f2825a;
        }

        /* renamed from: c */
        public C5441b m2000c() {
            return this.f2826b;
        }

        /* renamed from: d */
        public boolean m2001d() {
            AbstractC0417e0.e.c cVar;
            AbstractC0417e0.e.c from = AbstractC0417e0.e.c.from(this.f2825a.m2065f().mView);
            AbstractC0417e0.e.c m2064e = this.f2825a.m2064e();
            return from == m2064e || !(from == (cVar = AbstractC0417e0.e.c.VISIBLE) || m2064e == cVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/c$m.class
     */
    /* renamed from: androidx.fragment.app.c$m */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c$m.class */
    public static class m extends l {

        /* renamed from: c */
        public final Object f2827c;

        /* renamed from: d */
        public final boolean f2828d;

        /* renamed from: e */
        public final Object f2829e;

        public m(AbstractC0417e0.e eVar, C5441b c5441b, boolean z10, boolean z11) {
            super(eVar, c5441b);
            boolean z12;
            Object obj;
            if (eVar.m2064e() == AbstractC0417e0.e.c.VISIBLE) {
                Fragment m2065f = eVar.m2065f();
                this.f2827c = z10 ? m2065f.getReenterTransition() : m2065f.getEnterTransition();
                Fragment m2065f2 = eVar.m2065f();
                z12 = z10 ? m2065f2.getAllowReturnTransitionOverlap() : m2065f2.getAllowEnterTransitionOverlap();
            } else {
                Fragment m2065f3 = eVar.m2065f();
                this.f2827c = z10 ? m2065f3.getReturnTransition() : m2065f3.getExitTransition();
                z12 = true;
            }
            this.f2828d = z12;
            if (z11) {
                Fragment m2065f4 = eVar.m2065f();
                obj = z10 ? m2065f4.getSharedElementReturnTransition() : m2065f4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f2829e = obj;
        }

        /* renamed from: e */
        public AbstractC0411b0 m2002e() {
            AbstractC0411b0 m2003f = m2003f(this.f2827c);
            AbstractC0411b0 m2003f2 = m2003f(this.f2829e);
            if (m2003f == null || m2003f2 == null || m2003f == m2003f2) {
                if (m2003f != null) {
                    m2003f2 = m2003f;
                }
                return m2003f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m1999b().m2065f() + " returned Transition " + this.f2827c + " which uses a different Transition  type than its shared element transition " + this.f2829e);
        }

        /* renamed from: f */
        public final AbstractC0411b0 m2003f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0411b0 abstractC0411b0 = C0440z.f3062b;
            if (abstractC0411b0 != null && abstractC0411b0.mo86e(obj)) {
                return abstractC0411b0;
            }
            AbstractC0411b0 abstractC0411b02 = C0440z.f3063c;
            if (abstractC0411b02 != null && abstractC0411b02.mo86e(obj)) {
                return abstractC0411b02;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m1999b().m2065f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: g */
        public Object m2004g() {
            return this.f2829e;
        }

        /* renamed from: h */
        public Object m2005h() {
            return this.f2827c;
        }

        /* renamed from: i */
        public boolean m2006i() {
            return this.f2829e != null;
        }

        /* renamed from: j */
        public boolean m2007j() {
            return this.f2828d;
        }
    }

    public C0412c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.AbstractC0417e0
    /* renamed from: f */
    public void mo1990f(List<AbstractC0417e0.e> list, boolean z10) {
        AbstractC0417e0.e eVar = null;
        AbstractC0417e0.e eVar2 = null;
        for (AbstractC0417e0.e eVar3 : list) {
            AbstractC0417e0.e.c from = AbstractC0417e0.e.c.from(eVar3.m2065f().mView);
            int i10 = a.f2788a[eVar3.m2064e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (from == AbstractC0417e0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && from != AbstractC0417e0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (AbstractC0417e0.e eVar4 : list) {
            C5441b c5441b = new C5441b();
            eVar4.m2069j(c5441b);
            arrayList.add(new k(eVar4, c5441b, z10));
            C5441b c5441b2 = new C5441b();
            eVar4.m2069j(c5441b2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c5441b2, z10, z11));
                    eVar4.m2061a(new b(this, arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c5441b2, z10, z11));
                eVar4.m2061a(new b(this, arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c5441b2, z10, z11));
                    eVar4.m2061a(new b(this, arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c5441b2, z10, z11));
                eVar4.m2061a(new b(this, arrayList3, eVar4));
            }
        }
        Map<AbstractC0417e0.e, Boolean> m1996x = m1996x(arrayList2, arrayList3, z10, eVar, eVar2);
        m1995w(arrayList, arrayList3, m1996x.containsValue(Boolean.TRUE), m1996x);
        Iterator<AbstractC0417e0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            m1991s(it.next());
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    public void m1991s(AbstractC0417e0.e eVar) {
        eVar.m2064e().applyState(eVar.m2065f().mView);
    }

    /* renamed from: t */
    public void m1992t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        if (!arrayList.contains(view) && C6824g0.m31491L(view) != null) {
            arrayList.add(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                m1992t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    public void m1993u(Map<String, View> map, View view) {
        String m31491L = C6824g0.m31491L(view);
        if (m31491L != null) {
            map.put(m31491L, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m1993u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void m1994v(C7928a<String, View> c7928a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c7928a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C6824g0.m31491L(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void m1995w(List<k> list, List<AbstractC0417e0.e> list2, boolean z10, Map<AbstractC0417e0.e, Boolean> map) {
        StringBuilder sb2;
        String str;
        C0418f.d m1997e;
        ViewGroup m2055m = m2055m();
        Context context = m2055m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.m2001d() || (m1997e = kVar.m1997e(context)) == null) {
                kVar.m1998a();
            } else {
                Animator animator = m1997e.f2893b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    AbstractC0417e0.e m1999b = kVar.m1999b();
                    Fragment m2065f = m1999b.m2065f();
                    if (Boolean.TRUE.equals(map.get(m1999b))) {
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + m2065f + " as this Fragment was involved in a Transition.");
                        }
                        kVar.m1998a();
                    } else {
                        boolean z12 = m1999b.m2064e() == AbstractC0417e0.e.c.GONE;
                        if (z12) {
                            list2.remove(m1999b);
                        }
                        View view = m2065f.mView;
                        m2055m.startViewTransition(view);
                        animator.addListener(new c(this, m2055m, view, z12, m1999b, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.m2000c().m27193d(new d(this, animator));
                        z11 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            AbstractC0417e0.e m1999b2 = kVar2.m1999b();
            Fragment m2065f2 = m1999b2.m2065f();
            if (z10) {
                if (AbstractC0428n.m2129G0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m2065f2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.m1998a();
            } else if (z11) {
                if (AbstractC0428n.m2129G0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m2065f2);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.m1998a();
            } else {
                View view2 = m2065f2.mView;
                Animation animation = (Animation) C6616h.m30527e(((C0418f.d) C6616h.m30527e(kVar2.m1997e(context))).f2892a);
                if (m1999b2.m2064e() != AbstractC0417e0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m1998a();
                } else {
                    m2055m.startViewTransition(view2);
                    C0418f.e eVar = new C0418f.e(animation, m2055m, view2);
                    eVar.setAnimationListener(new e(this, m2055m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m2000c().m27193d(new f(this, view2, m2055m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final Map<AbstractC0417e0.e, Boolean> m1996x(List<m> list, List<AbstractC0417e0.e> list2, boolean z10, AbstractC0417e0.e eVar, AbstractC0417e0.e eVar2) {
        AbstractC0417e0.e eVar3 = eVar;
        AbstractC0417e0.e eVar4 = eVar2;
        HashMap hashMap = new HashMap();
        AbstractC0411b0 abstractC0411b0 = null;
        for (m mVar : list) {
            if (!mVar.m2001d()) {
                AbstractC0411b0 m2002e = mVar.m2002e();
                if (abstractC0411b0 == null) {
                    abstractC0411b0 = m2002e;
                } else if (m2002e != null && abstractC0411b0 != m2002e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m1999b().m2065f() + " returned Transition " + mVar.m2005h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0411b0 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.m1999b(), Boolean.FALSE);
                mVar2.m1998a();
            }
            return hashMap;
        }
        View view = new View(m2055m().getContext());
        Rect rect = new Rect();
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        C7928a c7928a = new C7928a();
        Object obj = null;
        boolean z11 = false;
        AbstractC0411b0 abstractC0411b02 = abstractC0411b0;
        View view2 = null;
        for (m mVar3 : list) {
            if (mVar3.m2006i() && eVar3 != null && eVar4 != null) {
                Object mo82B = abstractC0411b02.mo82B(abstractC0411b02.mo87g(mVar3.m2004g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m2065f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m2065f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m2065f().getSharedElementTargetNames();
                for (int i10 = 0; i10 < sharedElementTargetNames.size(); i10++) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m2065f().getSharedElementTargetNames();
                Fragment m2065f = eVar.m2065f();
                if (z10) {
                    m2065f.getEnterTransitionCallback();
                    eVar2.m2065f().getExitTransitionCallback();
                } else {
                    m2065f.getExitTransitionCallback();
                    eVar2.m2065f().getEnterTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c7928a.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                }
                C7928a<String, View> c7928a2 = new C7928a<>();
                m1993u(c7928a2, eVar.m2065f().mView);
                c7928a2.m34356p(sharedElementSourceNames);
                c7928a.m34356p(c7928a2.keySet());
                C7928a<String, View> c7928a3 = new C7928a<>();
                m1993u(c7928a3, eVar2.m2065f().mView);
                c7928a3.m34356p(sharedElementTargetNames2);
                c7928a3.m34356p(c7928a.values());
                C0440z.m2401x(c7928a, c7928a3);
                m1994v(c7928a2, c7928a.keySet());
                m1994v(c7928a3, c7928a.values());
                if (c7928a.isEmpty()) {
                    arrayList.clear();
                    arrayList2.clear();
                    obj = null;
                } else {
                    C0440z.m2383f(eVar2.m2065f(), eVar.m2065f(), z10, c7928a2, true);
                    ViewTreeObserverOnPreDrawListenerC6865z.m31685a(m2055m(), new g(this, eVar2, eVar, z10, c7928a3));
                    Iterator<View> it = c7928a2.values().iterator();
                    while (it.hasNext()) {
                        m1992t(arrayList, it.next());
                    }
                    if (!sharedElementSourceNames.isEmpty()) {
                        view2 = (View) c7928a2.get(sharedElementSourceNames.get(0));
                        abstractC0411b02.mo95v(mo82B, view2);
                    }
                    Iterator<View> it2 = c7928a3.values().iterator();
                    while (it2.hasNext()) {
                        m1992t(arrayList2, it2.next());
                    }
                    boolean z12 = z11;
                    if (!sharedElementTargetNames2.isEmpty()) {
                        View view3 = (View) c7928a3.get(sharedElementTargetNames2.get(0));
                        z12 = z11;
                        if (view3 != null) {
                            ViewTreeObserverOnPreDrawListenerC6865z.m31685a(m2055m(), new h(this, abstractC0411b02, view3, rect));
                            z12 = true;
                        }
                    }
                    abstractC0411b02.mo97z(mo82B, view, arrayList);
                    abstractC0411b02.mo93t(mo82B, null, null, null, null, mo82B, arrayList2);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap.put(eVar4, bool);
                    obj = mo82B;
                    z11 = z12;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Object obj2 = null;
        Object obj3 = null;
        View view4 = view2;
        AbstractC0417e0.e eVar5 = eVar4;
        for (m mVar4 : list) {
            if (mVar4.m2001d()) {
                hashMap.put(mVar4.m1999b(), Boolean.FALSE);
                mVar4.m1998a();
            } else {
                Object mo87g = abstractC0411b02.mo87g(mVar4.m2005h());
                AbstractC0417e0.e m1999b = mVar4.m1999b();
                boolean z13 = obj != null && (m1999b == eVar3 || m1999b == eVar5);
                if (mo87g != null) {
                    ArrayList<View> arrayList4 = new ArrayList<>();
                    m1992t(arrayList4, m1999b.m2065f().mView);
                    if (z13) {
                        if (m1999b == eVar3) {
                            arrayList4.removeAll(arrayList);
                        } else {
                            arrayList4.removeAll(arrayList2);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        abstractC0411b02.mo83a(mo87g, view);
                    } else {
                        abstractC0411b02.mo84b(mo87g, arrayList4);
                        abstractC0411b02.mo93t(mo87g, mo87g, arrayList4, null, null, null, null);
                        if (m1999b.m2064e() == AbstractC0417e0.e.c.GONE) {
                            list2.remove(m1999b);
                            abstractC0411b02.mo92r(mo87g, m1999b.m2065f().mView, arrayList4);
                            ViewTreeObserverOnPreDrawListenerC6865z.m31685a(m2055m(), new i(this, arrayList4));
                        }
                    }
                    if (m1999b.m2064e() == AbstractC0417e0.e.c.VISIBLE) {
                        arrayList3.addAll(arrayList4);
                        if (z11) {
                            abstractC0411b02.mo94u(mo87g, rect);
                        }
                    } else {
                        abstractC0411b02.mo95v(mo87g, view4);
                    }
                    hashMap.put(m1999b, Boolean.TRUE);
                    if (mVar4.m2007j()) {
                        obj3 = abstractC0411b02.mo89n(obj3, mo87g, null);
                    } else {
                        obj2 = abstractC0411b02.mo89n(obj2, mo87g, null);
                    }
                } else if (!z13) {
                    hashMap.put(m1999b, Boolean.FALSE);
                    mVar4.m1998a();
                }
            }
        }
        Object mo88m = abstractC0411b02.mo88m(obj3, obj2, obj);
        for (m mVar5 : list) {
            if (!mVar5.m2001d()) {
                Object m2005h = mVar5.m2005h();
                AbstractC0417e0.e m1999b2 = mVar5.m1999b();
                boolean z14 = obj != null && (m1999b2 == eVar3 || m1999b2 == eVar5);
                if (m2005h != null || z14) {
                    if (C6824g0.m31502U(m2055m())) {
                        abstractC0411b02.mo96w(mVar5.m1999b().m2065f(), mo88m, mVar5.m2000c(), new j(this, mVar5));
                    } else {
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m2055m() + " has not been laid out. Completing operation " + m1999b2);
                        }
                        mVar5.m1998a();
                    }
                }
            }
        }
        if (!C6824g0.m31502U(m2055m())) {
            return hashMap;
        }
        C0440z.m2375A(arrayList3, 4);
        ArrayList<String> m1986o = abstractC0411b02.m1986o(arrayList2);
        abstractC0411b02.mo85c(m2055m(), mo88m);
        abstractC0411b02.m1989y(m2055m(), arrayList, arrayList2, m1986o, c7928a);
        C0440z.m2375A(arrayList3, 0);
        abstractC0411b02.mo81A(obj, arrayList, arrayList2);
        return hashMap;
    }
}
