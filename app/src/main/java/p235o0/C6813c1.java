package p235o0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p087f0.C4739b;
import p221n0.C6611c;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/c1.class
 */
/* renamed from: o0.c1 */
/* loaded from: combined.jar:classes1.jar:o0/c1.class */
public class C6813c1 {

    /* renamed from: b */
    public static final C6813c1 f35509b;

    /* renamed from: a */
    public final l f35510a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$a.class
     */
    /* renamed from: o0.c1$a */
    /* loaded from: combined.jar:classes1.jar:o0/c1$a.class */
    public static class a {

        /* renamed from: a */
        public static Field f35511a;

        /* renamed from: b */
        public static Field f35512b;

        /* renamed from: c */
        public static Field f35513c;

        /* renamed from: d */
        public static boolean f35514d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f35511a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f35512b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f35513c = declaredField3;
                declaredField3.setAccessible(true);
                f35514d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        /* renamed from: a */
        public static C6813c1 m31411a(View view) {
            if (!f35514d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = f35511a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) f35512b.get(obj);
                Rect rect2 = (Rect) f35513c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                C6813c1 m31412a = new b().m31413b(C4739b.m23977c(rect)).m31414c(C4739b.m23977c(rect2)).m31412a();
                m31412a.m31408s(m31412a);
                m31412a.m31394d(view.getRootView());
                return m31412a;
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                return null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$b.class
     */
    /* renamed from: o0.c1$b */
    /* loaded from: combined.jar:classes1.jar:o0/c1$b.class */
    public static final class b {

        /* renamed from: a */
        public final f f35515a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f35515a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(C6813c1 c6813c1) {
            int i10 = Build.VERSION.SDK_INT;
            this.f35515a = i10 >= 30 ? new e(c6813c1) : i10 >= 29 ? new d(c6813c1) : new c(c6813c1);
        }

        /* renamed from: a */
        public C6813c1 m31412a() {
            return this.f35515a.mo31416b();
        }

        @Deprecated
        /* renamed from: b */
        public b m31413b(C4739b c4739b) {
            this.f35515a.mo31417d(c4739b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m31414c(C4739b c4739b) {
            this.f35515a.mo31418f(c4739b);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$c.class
     */
    /* renamed from: o0.c1$c */
    /* loaded from: combined.jar:classes1.jar:o0/c1$c.class */
    public static class c extends f {

        /* renamed from: e */
        public static Field f35516e;

        /* renamed from: f */
        public static boolean f35517f;

        /* renamed from: g */
        public static Constructor<WindowInsets> f35518g;

        /* renamed from: h */
        public static boolean f35519h;

        /* renamed from: c */
        public WindowInsets f35520c;

        /* renamed from: d */
        public C4739b f35521d;

        public c() {
            this.f35520c = m31415h();
        }

        public c(C6813c1 c6813c1) {
            super(c6813c1);
            this.f35520c = c6813c1.m31410u();
        }

        /* renamed from: h */
        private static WindowInsets m31415h() {
            if (!f35517f) {
                try {
                    f35516e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f35517f = true;
            }
            Field field = f35516e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f35519h) {
                try {
                    f35518g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f35519h = true;
            }
            Constructor<WindowInsets> constructor = f35518g;
            if (constructor == null) {
                return null;
            }
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                return null;
            }
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: b */
        public C6813c1 mo31416b() {
            m31422a();
            C6813c1 m31389v = C6813c1.m31389v(this.f35520c);
            m31389v.m31406q(this.f35524b);
            m31389v.m31409t(this.f35521d);
            return m31389v;
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: d */
        public void mo31417d(C4739b c4739b) {
            this.f35521d = c4739b;
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: f */
        public void mo31418f(C4739b c4739b) {
            WindowInsets windowInsets = this.f35520c;
            if (windowInsets != null) {
                this.f35520c = windowInsets.replaceSystemWindowInsets(c4739b.f27967a, c4739b.f27968b, c4739b.f27969c, c4739b.f27970d);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$d.class
     */
    /* renamed from: o0.c1$d */
    /* loaded from: combined.jar:classes1.jar:o0/c1$d.class */
    public static class d extends f {

        /* renamed from: c */
        public final WindowInsets$Builder f35522c;

        public d() {
            this.f35522c = new WindowInsets$Builder();
        }

        public d(C6813c1 c6813c1) {
            super(c6813c1);
            WindowInsets m31410u = c6813c1.m31410u();
            this.f35522c = m31410u != null ? new WindowInsets$Builder(m31410u) : new WindowInsets$Builder();
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: b */
        public C6813c1 mo31416b() {
            m31422a();
            C6813c1 m31389v = C6813c1.m31389v(this.f35522c.build());
            m31389v.m31406q(this.f35524b);
            return m31389v;
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: c */
        public void mo31419c(C4739b c4739b) {
            this.f35522c.setMandatorySystemGestureInsets(c4739b.m23979e());
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: d */
        public void mo31417d(C4739b c4739b) {
            this.f35522c.setStableInsets(c4739b.m23979e());
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: e */
        public void mo31420e(C4739b c4739b) {
            this.f35522c.setSystemGestureInsets(c4739b.m23979e());
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: f */
        public void mo31418f(C4739b c4739b) {
            this.f35522c.setSystemWindowInsets(c4739b.m23979e());
        }

        @Override // p235o0.C6813c1.f
        /* renamed from: g */
        public void mo31421g(C4739b c4739b) {
            this.f35522c.setTappableElementInsets(c4739b.m23979e());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$e.class
     */
    /* renamed from: o0.c1$e */
    /* loaded from: combined.jar:classes1.jar:o0/c1$e.class */
    public static class e extends d {
        public e() {
        }

        public e(C6813c1 c6813c1) {
            super(c6813c1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$f.class
     */
    /* renamed from: o0.c1$f */
    /* loaded from: combined.jar:classes1.jar:o0/c1$f.class */
    public static class f {

        /* renamed from: a */
        public final C6813c1 f35523a;

        /* renamed from: b */
        public C4739b[] f35524b;

        public f() {
            this(new C6813c1((C6813c1) null));
        }

        public f(C6813c1 c6813c1) {
            this.f35523a = c6813c1;
        }

        /* renamed from: a */
        public final void m31422a() {
            C4739b[] c4739bArr = this.f35524b;
            if (c4739bArr != null) {
                C4739b c4739b = c4739bArr[m.m31447a(1)];
                C4739b c4739b2 = this.f35524b[m.m31447a(2)];
                C4739b c4739b3 = c4739b2;
                if (c4739b2 == null) {
                    c4739b3 = this.f35523a.m31396f(2);
                }
                C4739b c4739b4 = c4739b;
                if (c4739b == null) {
                    c4739b4 = this.f35523a.m31396f(1);
                }
                mo31418f(C4739b.m23975a(c4739b4, c4739b3));
                C4739b c4739b5 = this.f35524b[m.m31447a(16)];
                if (c4739b5 != null) {
                    mo31420e(c4739b5);
                }
                C4739b c4739b6 = this.f35524b[m.m31447a(32)];
                if (c4739b6 != null) {
                    mo31419c(c4739b6);
                }
                C4739b c4739b7 = this.f35524b[m.m31447a(64)];
                if (c4739b7 != null) {
                    mo31421g(c4739b7);
                }
            }
        }

        /* renamed from: b */
        public C6813c1 mo31416b() {
            throw null;
        }

        /* renamed from: c */
        public void mo31419c(C4739b c4739b) {
        }

        /* renamed from: d */
        public void mo31417d(C4739b c4739b) {
            throw null;
        }

        /* renamed from: e */
        public void mo31420e(C4739b c4739b) {
        }

        /* renamed from: f */
        public void mo31418f(C4739b c4739b) {
            throw null;
        }

        /* renamed from: g */
        public void mo31421g(C4739b c4739b) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$g.class
     */
    /* renamed from: o0.c1$g */
    /* loaded from: combined.jar:classes1.jar:o0/c1$g.class */
    public static class g extends l {

        /* renamed from: h */
        public static boolean f35525h;

        /* renamed from: i */
        public static Method f35526i;

        /* renamed from: j */
        public static Class<?> f35527j;

        /* renamed from: k */
        public static Class<?> f35528k;

        /* renamed from: l */
        public static Field f35529l;

        /* renamed from: m */
        public static Field f35530m;

        /* renamed from: c */
        public final WindowInsets f35531c;

        /* renamed from: d */
        public C4739b[] f35532d;

        /* renamed from: e */
        public C4739b f35533e;

        /* renamed from: f */
        public C6813c1 f35534f;

        /* renamed from: g */
        public C4739b f35535g;

        public g(C6813c1 c6813c1, WindowInsets windowInsets) {
            super(c6813c1);
            this.f35533e = null;
            this.f35531c = windowInsets;
        }

        public g(C6813c1 c6813c1, g gVar) {
            this(c6813c1, new WindowInsets(gVar.f35531c));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C4739b m31423t(int i10, boolean z10) {
            C4739b c4739b = C4739b.f27966e;
            int i11 = 1;
            while (true) {
                int i12 = i11;
                if (i12 > 256) {
                    return c4739b;
                }
                if ((i10 & i12) != 0) {
                    c4739b = C4739b.m23975a(c4739b, m31436u(i12, z10));
                }
                i11 = i12 << 1;
            }
        }

        /* renamed from: v */
        private C4739b m31424v() {
            C6813c1 c6813c1 = this.f35534f;
            return c6813c1 != null ? c6813c1.m31398h() : C4739b.f27966e;
        }

        /* renamed from: w */
        private C4739b m31425w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f35525h) {
                m31426x();
            }
            Method method = f35526i;
            if (method == null || f35528k == null || f35529l == null) {
                return null;
            }
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f35529l.get(f35530m.get(invoke));
                C4739b c4739b = null;
                if (rect != null) {
                    c4739b = C4739b.m23977c(rect);
                }
                return c4739b;
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                return null;
            }
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m31426x() {
            try {
                f35526i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f35527j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f35528k = cls;
                f35529l = cls.getDeclaredField("mVisibleInsets");
                f35530m = f35527j.getDeclaredField("mAttachInfo");
                f35529l.setAccessible(true);
                f35530m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f35525h = true;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: d */
        public void mo31427d(View view) {
            C4739b m31425w = m31425w(view);
            C4739b c4739b = m31425w;
            if (m31425w == null) {
                c4739b = C4739b.f27966e;
            }
            mo31434q(c4739b);
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: e */
        public void mo31428e(C6813c1 c6813c1) {
            c6813c1.m31408s(this.f35534f);
            c6813c1.m31407r(this.f35535g);
        }

        @Override // p235o0.C6813c1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f35535g, ((g) obj).f35535g);
            }
            return false;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: g */
        public C4739b mo31429g(int i10) {
            return m31423t(i10, false);
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: k */
        public final C4739b mo31430k() {
            if (this.f35533e == null) {
                this.f35533e = C4739b.m23976b(this.f35531c.getSystemWindowInsetLeft(), this.f35531c.getSystemWindowInsetTop(), this.f35531c.getSystemWindowInsetRight(), this.f35531c.getSystemWindowInsetBottom());
            }
            return this.f35533e;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: m */
        public C6813c1 mo31431m(int i10, int i11, int i12, int i13) {
            b bVar = new b(C6813c1.m31389v(this.f35531c));
            bVar.m31414c(C6813c1.m31388n(mo31430k(), i10, i11, i12, i13));
            bVar.m31413b(C6813c1.m31388n(mo31439i(), i10, i11, i12, i13));
            return bVar.m31412a();
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: o */
        public boolean mo31432o() {
            return this.f35531c.isRound();
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: p */
        public void mo31433p(C4739b[] c4739bArr) {
            this.f35532d = c4739bArr;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: q */
        public void mo31434q(C4739b c4739b) {
            this.f35535g = c4739b;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: r */
        public void mo31435r(C6813c1 c6813c1) {
            this.f35534f = c6813c1;
        }

        /* renamed from: u */
        public C4739b m31436u(int i10, boolean z10) {
            int i11;
            if (i10 == 1) {
                return z10 ? C4739b.m23976b(0, Math.max(m31424v().f27968b, mo31430k().f27968b), 0, 0) : C4739b.m23976b(0, mo31430k().f27968b, 0, 0);
            }
            C4739b c4739b = null;
            if (i10 == 2) {
                if (z10) {
                    C4739b m31424v = m31424v();
                    C4739b mo31439i = mo31439i();
                    return C4739b.m23976b(Math.max(m31424v.f27967a, mo31439i.f27967a), 0, Math.max(m31424v.f27969c, mo31439i.f27969c), Math.max(m31424v.f27970d, mo31439i.f27970d));
                }
                C4739b mo31430k = mo31430k();
                C6813c1 c6813c1 = this.f35534f;
                if (c6813c1 != null) {
                    c4739b = c6813c1.m31398h();
                }
                int i12 = mo31430k.f27970d;
                int i13 = i12;
                if (c4739b != null) {
                    i13 = Math.min(i12, c4739b.f27970d);
                }
                return C4739b.m23976b(mo31430k.f27967a, 0, mo31430k.f27969c, i13);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return mo31445j();
                }
                if (i10 == 32) {
                    return mo31444h();
                }
                if (i10 == 64) {
                    return mo31446l();
                }
                if (i10 != 128) {
                    return C4739b.f27966e;
                }
                C6813c1 c6813c12 = this.f35534f;
                C6814d m31395e = c6813c12 != null ? c6813c12.m31395e() : mo31443f();
                return m31395e != null ? C4739b.m23976b(m31395e.m31451b(), m31395e.m31453d(), m31395e.m31452c(), m31395e.m31450a()) : C4739b.f27966e;
            }
            C4739b[] c4739bArr = this.f35532d;
            C4739b c4739b2 = null;
            if (c4739bArr != null) {
                c4739b2 = c4739bArr[m.m31447a(8)];
            }
            if (c4739b2 != null) {
                return c4739b2;
            }
            C4739b mo31430k2 = mo31430k();
            C4739b m31424v2 = m31424v();
            int i14 = mo31430k2.f27970d;
            if (i14 > m31424v2.f27970d) {
                return C4739b.m23976b(0, 0, 0, i14);
            }
            C4739b c4739b3 = this.f35535g;
            return (c4739b3 == null || c4739b3.equals(C4739b.f27966e) || (i11 = this.f35535g.f27970d) <= m31424v2.f27970d) ? C4739b.f27966e : C4739b.m23976b(0, 0, 0, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$h.class
     */
    /* renamed from: o0.c1$h */
    /* loaded from: combined.jar:classes1.jar:o0/c1$h.class */
    public static class h extends g {

        /* renamed from: n */
        public C4739b f35536n;

        public h(C6813c1 c6813c1, WindowInsets windowInsets) {
            super(c6813c1, windowInsets);
            this.f35536n = null;
        }

        public h(C6813c1 c6813c1, h hVar) {
            super(c6813c1, hVar);
            this.f35536n = null;
            this.f35536n = hVar.f35536n;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: b */
        public C6813c1 mo31437b() {
            return C6813c1.m31389v(this.f35531c.consumeStableInsets());
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: c */
        public C6813c1 mo31438c() {
            return C6813c1.m31389v(this.f35531c.consumeSystemWindowInsets());
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: i */
        public final C4739b mo31439i() {
            if (this.f35536n == null) {
                this.f35536n = C4739b.m23976b(this.f35531c.getStableInsetLeft(), this.f35531c.getStableInsetTop(), this.f35531c.getStableInsetRight(), this.f35531c.getStableInsetBottom());
            }
            return this.f35536n;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: n */
        public boolean mo31440n() {
            return this.f35531c.isConsumed();
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: s */
        public void mo31441s(C4739b c4739b) {
            this.f35536n = c4739b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$i.class
     */
    /* renamed from: o0.c1$i */
    /* loaded from: combined.jar:classes1.jar:o0/c1$i.class */
    public static class i extends h {
        public i(C6813c1 c6813c1, WindowInsets windowInsets) {
            super(c6813c1, windowInsets);
        }

        public i(C6813c1 c6813c1, i iVar) {
            super(c6813c1, iVar);
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: a */
        public C6813c1 mo31442a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f35531c.consumeDisplayCutout();
            return C6813c1.m31389v(consumeDisplayCutout);
        }

        @Override // p235o0.C6813c1.g, p235o0.C6813c1.l
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Objects.equals(this.f35531c, iVar.f35531c) || !Objects.equals(this.f35535g, iVar.f35535g)) {
                z10 = false;
            }
            return z10;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: f */
        public C6814d mo31443f() {
            DisplayCutout displayCutout;
            displayCutout = this.f35531c.getDisplayCutout();
            return C6814d.m31449e(displayCutout);
        }

        @Override // p235o0.C6813c1.l
        public int hashCode() {
            return this.f35531c.hashCode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$j.class
     */
    /* renamed from: o0.c1$j */
    /* loaded from: combined.jar:classes1.jar:o0/c1$j.class */
    public static class j extends i {

        /* renamed from: o */
        public C4739b f35537o;

        /* renamed from: p */
        public C4739b f35538p;

        /* renamed from: q */
        public C4739b f35539q;

        public j(C6813c1 c6813c1, WindowInsets windowInsets) {
            super(c6813c1, windowInsets);
            this.f35537o = null;
            this.f35538p = null;
            this.f35539q = null;
        }

        public j(C6813c1 c6813c1, j jVar) {
            super(c6813c1, jVar);
            this.f35537o = null;
            this.f35538p = null;
            this.f35539q = null;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: h */
        public C4739b mo31444h() {
            Insets mandatorySystemGestureInsets;
            if (this.f35538p == null) {
                mandatorySystemGestureInsets = this.f35531c.getMandatorySystemGestureInsets();
                this.f35538p = C4739b.m23978d(mandatorySystemGestureInsets);
            }
            return this.f35538p;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: j */
        public C4739b mo31445j() {
            Insets systemGestureInsets;
            if (this.f35537o == null) {
                systemGestureInsets = this.f35531c.getSystemGestureInsets();
                this.f35537o = C4739b.m23978d(systemGestureInsets);
            }
            return this.f35537o;
        }

        @Override // p235o0.C6813c1.l
        /* renamed from: l */
        public C4739b mo31446l() {
            Insets tappableElementInsets;
            if (this.f35539q == null) {
                tappableElementInsets = this.f35531c.getTappableElementInsets();
                this.f35539q = C4739b.m23978d(tappableElementInsets);
            }
            return this.f35539q;
        }

        @Override // p235o0.C6813c1.g, p235o0.C6813c1.l
        /* renamed from: m */
        public C6813c1 mo31431m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f35531c.inset(i10, i11, i12, i13);
            return C6813c1.m31389v(inset);
        }

        @Override // p235o0.C6813c1.h, p235o0.C6813c1.l
        /* renamed from: s */
        public void mo31441s(C4739b c4739b) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$k.class
     */
    /* renamed from: o0.c1$k */
    /* loaded from: combined.jar:classes1.jar:o0/c1$k.class */
    public static class k extends j {

        /* renamed from: r */
        public static final C6813c1 f35540r = C6813c1.m31389v(WindowInsets.CONSUMED);

        public k(C6813c1 c6813c1, WindowInsets windowInsets) {
            super(c6813c1, windowInsets);
        }

        public k(C6813c1 c6813c1, k kVar) {
            super(c6813c1, kVar);
        }

        @Override // p235o0.C6813c1.g, p235o0.C6813c1.l
        /* renamed from: d */
        public final void mo31427d(View view) {
        }

        @Override // p235o0.C6813c1.g, p235o0.C6813c1.l
        /* renamed from: g */
        public C4739b mo31429g(int i10) {
            Insets insets;
            insets = this.f35531c.getInsets(n.m31448a(i10));
            return C4739b.m23978d(insets);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$l.class
     */
    /* renamed from: o0.c1$l */
    /* loaded from: combined.jar:classes1.jar:o0/c1$l.class */
    public static class l {

        /* renamed from: b */
        public static final C6813c1 f35541b = new b().m31412a().m31391a().m31392b().m31393c();

        /* renamed from: a */
        public final C6813c1 f35542a;

        public l(C6813c1 c6813c1) {
            this.f35542a = c6813c1;
        }

        /* renamed from: a */
        public C6813c1 mo31442a() {
            return this.f35542a;
        }

        /* renamed from: b */
        public C6813c1 mo31437b() {
            return this.f35542a;
        }

        /* renamed from: c */
        public C6813c1 mo31438c() {
            return this.f35542a;
        }

        /* renamed from: d */
        public void mo31427d(View view) {
        }

        /* renamed from: e */
        public void mo31428e(C6813c1 c6813c1) {
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (mo31432o() != lVar.mo31432o() || mo31440n() != lVar.mo31440n() || !C6611c.m30516a(mo31430k(), lVar.mo31430k()) || !C6611c.m30516a(mo31439i(), lVar.mo31439i()) || !C6611c.m30516a(mo31443f(), lVar.mo31443f())) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public C6814d mo31443f() {
            return null;
        }

        /* renamed from: g */
        public C4739b mo31429g(int i10) {
            return C4739b.f27966e;
        }

        /* renamed from: h */
        public C4739b mo31444h() {
            return mo31430k();
        }

        public int hashCode() {
            return C6611c.m30517b(Boolean.valueOf(mo31432o()), Boolean.valueOf(mo31440n()), mo31430k(), mo31439i(), mo31443f());
        }

        /* renamed from: i */
        public C4739b mo31439i() {
            return C4739b.f27966e;
        }

        /* renamed from: j */
        public C4739b mo31445j() {
            return mo31430k();
        }

        /* renamed from: k */
        public C4739b mo31430k() {
            return C4739b.f27966e;
        }

        /* renamed from: l */
        public C4739b mo31446l() {
            return mo31430k();
        }

        /* renamed from: m */
        public C6813c1 mo31431m(int i10, int i11, int i12, int i13) {
            return f35541b;
        }

        /* renamed from: n */
        public boolean mo31440n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo31432o() {
            return false;
        }

        /* renamed from: p */
        public void mo31433p(C4739b[] c4739bArr) {
        }

        /* renamed from: q */
        public void mo31434q(C4739b c4739b) {
        }

        /* renamed from: r */
        public void mo31435r(C6813c1 c6813c1) {
        }

        /* renamed from: s */
        public void mo31441s(C4739b c4739b) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$m.class
     */
    /* renamed from: o0.c1$m */
    /* loaded from: combined.jar:classes1.jar:o0/c1$m.class */
    public static final class m {
        /* renamed from: a */
        public static int m31447a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/c1$n.class
     */
    /* renamed from: o0.c1$n */
    /* loaded from: combined.jar:classes1.jar:o0/c1$n.class */
    public static final class n {
        /* renamed from: a */
        public static int m31448a(int i10) {
            int statusBars;
            int i11 = 0;
            int i12 = 1;
            while (i12 <= 256) {
                int i13 = i11;
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets$Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets$Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets$Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets$Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets$Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets$Type.tappableElement();
                    } else if (i12 != 128) {
                        i13 = i11;
                    } else {
                        statusBars = WindowInsets$Type.displayCutout();
                    }
                    i13 = i11 | statusBars;
                }
                i12 <<= 1;
                i11 = i13;
            }
            return i11;
        }
    }

    static {
        f35509b = Build.VERSION.SDK_INT >= 30 ? k.f35540r : l.f35541b;
    }

    public C6813c1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f35510a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public C6813c1(C6813c1 c6813c1) {
        if (c6813c1 == null) {
            this.f35510a = new l(this);
            return;
        }
        l lVar = c6813c1.f35510a;
        int i10 = Build.VERSION.SDK_INT;
        this.f35510a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.mo31428e(this);
    }

    /* renamed from: n */
    public static C4739b m31388n(C4739b c4739b, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c4739b.f27967a - i10);
        int max2 = Math.max(0, c4739b.f27968b - i11);
        int max3 = Math.max(0, c4739b.f27969c - i12);
        int max4 = Math.max(0, c4739b.f27970d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? c4739b : C4739b.m23976b(max, max2, max3, max4);
    }

    /* renamed from: v */
    public static C6813c1 m31389v(WindowInsets windowInsets) {
        return m31390w(windowInsets, null);
    }

    /* renamed from: w */
    public static C6813c1 m31390w(WindowInsets windowInsets, View view) {
        C6813c1 c6813c1 = new C6813c1((WindowInsets) C6616h.m30527e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c6813c1.m31408s(C6824g0.m31487J(view));
            c6813c1.m31394d(view.getRootView());
        }
        return c6813c1;
    }

    @Deprecated
    /* renamed from: a */
    public C6813c1 m31391a() {
        return this.f35510a.mo31442a();
    }

    @Deprecated
    /* renamed from: b */
    public C6813c1 m31392b() {
        return this.f35510a.mo31437b();
    }

    @Deprecated
    /* renamed from: c */
    public C6813c1 m31393c() {
        return this.f35510a.mo31438c();
    }

    /* renamed from: d */
    public void m31394d(View view) {
        this.f35510a.mo31427d(view);
    }

    /* renamed from: e */
    public C6814d m31395e() {
        return this.f35510a.mo31443f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6813c1) {
            return C6611c.m30516a(this.f35510a, ((C6813c1) obj).f35510a);
        }
        return false;
    }

    /* renamed from: f */
    public C4739b m31396f(int i10) {
        return this.f35510a.mo31429g(i10);
    }

    @Deprecated
    /* renamed from: g */
    public C4739b m31397g() {
        return this.f35510a.mo31444h();
    }

    @Deprecated
    /* renamed from: h */
    public C4739b m31398h() {
        return this.f35510a.mo31439i();
    }

    public int hashCode() {
        l lVar = this.f35510a;
        return lVar == null ? 0 : lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m31399i() {
        return this.f35510a.mo31430k().f27970d;
    }

    @Deprecated
    /* renamed from: j */
    public int m31400j() {
        return this.f35510a.mo31430k().f27967a;
    }

    @Deprecated
    /* renamed from: k */
    public int m31401k() {
        return this.f35510a.mo31430k().f27969c;
    }

    @Deprecated
    /* renamed from: l */
    public int m31402l() {
        return this.f35510a.mo31430k().f27968b;
    }

    /* renamed from: m */
    public C6813c1 m31403m(int i10, int i11, int i12, int i13) {
        return this.f35510a.mo31431m(i10, i11, i12, i13);
    }

    /* renamed from: o */
    public boolean m31404o() {
        return this.f35510a.mo31440n();
    }

    @Deprecated
    /* renamed from: p */
    public C6813c1 m31405p(int i10, int i11, int i12, int i13) {
        return new b(this).m31414c(C4739b.m23976b(i10, i11, i12, i13)).m31412a();
    }

    /* renamed from: q */
    public void m31406q(C4739b[] c4739bArr) {
        this.f35510a.mo31433p(c4739bArr);
    }

    /* renamed from: r */
    public void m31407r(C4739b c4739b) {
        this.f35510a.mo31434q(c4739b);
    }

    /* renamed from: s */
    public void m31408s(C6813c1 c6813c1) {
        this.f35510a.mo31435r(c6813c1);
    }

    /* renamed from: t */
    public void m31409t(C4739b c4739b) {
        this.f35510a.mo31441s(c4739b);
    }

    /* renamed from: u */
    public WindowInsets m31410u() {
        l lVar = this.f35510a;
        return lVar instanceof g ? ((g) lVar).f35531c : null;
    }
}
