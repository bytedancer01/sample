package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import p413y0.C9790c;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/v0.class
 */
/* renamed from: androidx.leanback.widget.v0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/v0.class */
public final class C0545v0 {

    /* renamed from: a */
    public int f3642a = 1;

    /* renamed from: b */
    public boolean f3643b;

    /* renamed from: c */
    public boolean f3644c;

    /* renamed from: d */
    public boolean f3645d;

    /* renamed from: e */
    public boolean f3646e;

    /* renamed from: f */
    public int f3647f;

    /* renamed from: g */
    public float f3648g;

    /* renamed from: h */
    public float f3649h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/v0$a.class
     */
    /* renamed from: androidx.leanback.widget.v0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/v0$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f3650a;

        /* renamed from: b */
        public boolean f3651b;

        /* renamed from: c */
        public boolean f3652c;

        /* renamed from: e */
        public boolean f3654e;

        /* renamed from: d */
        public boolean f3653d = true;

        /* renamed from: f */
        public b f3655f = b.f3656d;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        
            if (r4.f3654e != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
        
            r0.f3646e = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
        
            if (r0.f3643b != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        
            if (r4.f3654e != false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
        
            if (r0.f3643b != false) goto L38;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.leanback.widget.C0545v0 m3047a(android.content.Context r5) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0545v0.a.m3047a(android.content.Context):androidx.leanback.widget.v0");
        }

        /* renamed from: b */
        public a m3048b(boolean z10) {
            this.f3654e = z10;
            return this;
        }

        /* renamed from: c */
        public a m3049c(boolean z10) {
            this.f3650a = z10;
            return this;
        }

        /* renamed from: d */
        public a m3050d(boolean z10) {
            this.f3651b = z10;
            return this;
        }

        /* renamed from: e */
        public a m3051e(boolean z10) {
            this.f3652c = z10;
            return this;
        }

        /* renamed from: f */
        public a m3052f(b bVar) {
            this.f3655f = bVar;
            return this;
        }

        /* renamed from: g */
        public a m3053g(boolean z10) {
            this.f3653d = z10;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/v0$b.class
     */
    /* renamed from: androidx.leanback.widget.v0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/v0$b.class */
    public static final class b {

        /* renamed from: d */
        public static final b f3656d = new b();

        /* renamed from: a */
        public int f3657a = 0;

        /* renamed from: b */
        public float f3658b = -1.0f;

        /* renamed from: c */
        public float f3659c = -1.0f;

        /* renamed from: a */
        public final float m3054a() {
            return this.f3659c;
        }

        /* renamed from: b */
        public final float m3055b() {
            return this.f3658b;
        }

        /* renamed from: c */
        public final int m3056c() {
            return this.f3657a;
        }
    }

    /* renamed from: b */
    public static Object m3030b(View view) {
        return view.getTag(C9793f.f44997s);
    }

    /* renamed from: h */
    public static void m3031h(View view, int i10) {
        Drawable m2658a = C0520k.m2658a(view);
        if (m2658a instanceof ColorDrawable) {
            ((ColorDrawable) m2658a).setColor(i10);
        } else {
            C0520k.m2659b(view, new ColorDrawable(i10));
        }
    }

    /* renamed from: i */
    public static void m3032i(View view, float f10) {
        m3033k(m3030b(view), 3, f10);
    }

    /* renamed from: k */
    public static void m3033k(Object obj, int i10, float f10) {
        float f11;
        if (obj != null) {
            if (f10 < 0.0f) {
                f11 = 0.0f;
            } else {
                f11 = f10;
                if (f10 > 1.0f) {
                    f11 = 1.0f;
                }
            }
            if (i10 == 2) {
                C0498b1.m2567c(obj, f11);
            } else {
                if (i10 != 3) {
                    return;
                }
                C0539s0.m2991b(obj, f11);
            }
        }
    }

    /* renamed from: n */
    public static boolean m3034n() {
        return C0539s0.m2992c();
    }

    /* renamed from: o */
    public static boolean m3035o() {
        return C0520k.m2660c();
    }

    /* renamed from: p */
    public static boolean m3036p() {
        return C0525m0.m2910c();
    }

    /* renamed from: q */
    public static boolean m3037q() {
        return C0498b1.m2568d();
    }

    /* renamed from: a */
    public C0543u0 m3038a(Context context) {
        if (m3041e()) {
            return new C0543u0(context, this.f3642a, this.f3643b, this.f3648g, this.f3649h, this.f3647f);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m3039c() {
        return this.f3642a;
    }

    /* renamed from: d */
    public boolean m3040d() {
        return this.f3643b;
    }

    /* renamed from: e */
    public boolean m3041e() {
        return this.f3646e;
    }

    /* renamed from: f */
    public void m3042f(View view) {
        if (m3041e()) {
            return;
        }
        if (this.f3645d) {
            if (this.f3642a == 3) {
                view.setTag(C9793f.f44997s, C0539s0.m2990a(view, this.f3648g, this.f3649h, this.f3647f));
                return;
            } else if (!this.f3644c) {
                return;
            }
        } else if (!this.f3644c) {
            return;
        }
        C0525m0.m2909b(view, true, this.f3647f);
    }

    /* renamed from: g */
    public void m3043g(ViewGroup viewGroup) {
        if (this.f3642a == 2) {
            C0498b1.m2566b(viewGroup);
        }
    }

    /* renamed from: j */
    public void m3044j(View view, int i10) {
        if (m3041e()) {
            ((C0543u0) view).setOverlayColor(i10);
        } else {
            m3031h(view, i10);
        }
    }

    /* renamed from: l */
    public void m3045l(b bVar, Context context) {
        float m3055b;
        if (bVar.m3055b() < 0.0f) {
            Resources resources = context.getResources();
            this.f3649h = resources.getDimension(C9790c.f44938d);
            m3055b = resources.getDimension(C9790c.f44939e);
        } else {
            this.f3649h = bVar.m3054a();
            m3055b = bVar.m3055b();
        }
        this.f3648g = m3055b;
    }

    /* renamed from: m */
    public void m3046m(b bVar, Context context) {
        this.f3647f = bVar.m3056c() == 0 ? context.getResources().getDimensionPixelSize(C9790c.f44954t) : bVar.m3056c();
    }
}
