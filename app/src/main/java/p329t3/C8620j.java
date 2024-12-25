package p329t3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import p073e4.InterfaceC4617l;
import p239o4.C6895d;
import p239o4.C6904m;
import p239o4.InterfaceC6894c;
import p239o4.InterfaceC6898g;
import p239o4.InterfaceC6899h;
import p239o4.InterfaceC6903l;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/j.class
 */
/* renamed from: t3.j */
/* loaded from: combined.jar:classes1.jar:t3/j.class */
public class C8620j implements InterfaceC6899h {

    /* renamed from: a */
    public final Context f40261a;

    /* renamed from: b */
    public final InterfaceC6898g f40262b;

    /* renamed from: c */
    public final InterfaceC6903l f40263c;

    /* renamed from: d */
    public final C6904m f40264d;

    /* renamed from: e */
    public final C8617g f40265e;

    /* renamed from: f */
    public final d f40266f;

    /* renamed from: g */
    public b f40267g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/j$a.class
     */
    /* renamed from: t3.j$a */
    /* loaded from: combined.jar:classes1.jar:t3/j$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final InterfaceC6898g f40268b;

        /* renamed from: c */
        public final C8620j f40269c;

        public a(C8620j c8620j, InterfaceC6898g interfaceC6898g) {
            this.f40269c = c8620j;
            this.f40268b = interfaceC6898g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40268b.mo31798a(this.f40269c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/j$b.class
     */
    /* renamed from: t3.j$b */
    /* loaded from: combined.jar:classes1.jar:t3/j$b.class */
    public interface b {
        /* renamed from: a */
        <T> void m37036a(C8615e<T, ?, ?, ?> c8615e);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/j$c.class
     */
    /* renamed from: t3.j$c */
    /* loaded from: combined.jar:classes1.jar:t3/j$c.class */
    public final class c<A, T> {

        /* renamed from: a */
        public final InterfaceC4617l<A, T> f40270a;

        /* renamed from: b */
        public final Class<T> f40271b;

        /* renamed from: c */
        public final C8620j f40272c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:t3/j$c$a.class
         */
        /* renamed from: t3.j$c$a */
        /* loaded from: combined.jar:classes1.jar:t3/j$c$a.class */
        public final class a {

            /* renamed from: a */
            public final A f40273a;

            /* renamed from: b */
            public final Class<A> f40274b;

            /* renamed from: c */
            public final boolean f40275c = true;

            /* renamed from: d */
            public final c f40276d;

            public a(c cVar, A a10) {
                this.f40276d = cVar;
                this.f40273a = a10;
                this.f40274b = C8620j.m37027p(a10);
            }

            /* renamed from: a */
            public <Z> C8616f<A, T, Z> m37040a(Class<Z> cls) {
                C8616f<A, T, Z> c8616f = (C8616f) this.f40276d.f40272c.f40266f.m37041a(new C8616f(this.f40276d.f40272c.f40261a, this.f40276d.f40272c.f40265e, this.f40274b, this.f40276d.f40270a, this.f40276d.f40271b, cls, this.f40276d.f40272c.f40264d, this.f40276d.f40272c.f40262b, this.f40276d.f40272c.f40266f));
                if (this.f40275c) {
                    c8616f.m36994m(this.f40273a);
                }
                return c8616f;
            }
        }

        public c(C8620j c8620j, InterfaceC4617l<A, T> interfaceC4617l, Class<T> cls) {
            this.f40272c = c8620j;
            this.f40270a = interfaceC4617l;
            this.f40271b = cls;
        }

        /* renamed from: c */
        public c<A, T>.a m37039c(A a10) {
            return new a(this, a10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/j$d.class
     */
    /* renamed from: t3.j$d */
    /* loaded from: combined.jar:classes1.jar:t3/j$d.class */
    public class d {

        /* renamed from: a */
        public final C8620j f40277a;

        public d(C8620j c8620j) {
            this.f40277a = c8620j;
        }

        /* renamed from: a */
        public <A, X extends C8615e<A, ?, ?, ?>> X m37041a(X x10) {
            if (this.f40277a.f40267g != null) {
                this.f40277a.f40267g.m37036a(x10);
            }
            return x10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t3/j$e.class
     */
    /* renamed from: t3.j$e */
    /* loaded from: combined.jar:classes1.jar:t3/j$e.class */
    public static class e implements InterfaceC6894c.a {

        /* renamed from: a */
        public final C6904m f40278a;

        public e(C6904m c6904m) {
            this.f40278a = c6904m;
        }

        @Override // p239o4.InterfaceC6894c.a
        public void onConnectivityChanged(boolean z10) {
            if (z10) {
                this.f40278a.m31829d();
            }
        }
    }

    public C8620j(Context context, InterfaceC6898g interfaceC6898g, InterfaceC6903l interfaceC6903l) {
        this(context, interfaceC6898g, interfaceC6903l, new C6904m(), new C6895d());
    }

    public C8620j(Context context, InterfaceC6898g interfaceC6898g, InterfaceC6903l interfaceC6903l, C6904m c6904m, C6895d c6895d) {
        this.f40261a = context.getApplicationContext();
        this.f40262b = interfaceC6898g;
        this.f40263c = interfaceC6903l;
        this.f40264d = c6904m;
        this.f40265e = C8617g.m37002i(context);
        this.f40266f = new d(this);
        InterfaceC6894c m31802a = c6895d.m31802a(context, new e(c6904m));
        if (C9242h.m38970h()) {
            new Handler(Looper.getMainLooper()).post(new a(this, interfaceC6898g));
        } else {
            interfaceC6898g.mo31798a(this);
        }
        interfaceC6898g.mo31798a(m31802a);
    }

    /* renamed from: p */
    public static <T> Class<T> m37027p(T t10) {
        return (Class<T>) (t10 != null ? t10.getClass() : null);
    }

    /* renamed from: o */
    public C8614d<String> m37028o() {
        return m37030r(String.class);
    }

    @Override // p239o4.InterfaceC6899h
    public void onDestroy() {
        this.f40264d.m31826a();
    }

    @Override // p239o4.InterfaceC6899h
    public void onStart() {
        m37034v();
    }

    @Override // p239o4.InterfaceC6899h
    public void onStop() {
        m37033u();
    }

    /* renamed from: q */
    public C8614d<String> m37029q(String str) {
        return (C8614d) m37028o().m36979F(str);
    }

    /* renamed from: r */
    public final <T> C8614d<T> m37030r(Class<T> cls) {
        InterfaceC4617l m37000e = C8617g.m37000e(cls, this.f40261a);
        InterfaceC4617l m36998b = C8617g.m36998b(cls, this.f40261a);
        if (cls == null || m37000e != null || m36998b != null) {
            d dVar = this.f40266f;
            return (C8614d) dVar.m37041a(new C8614d(cls, m37000e, m36998b, this.f40261a, this.f40265e, this.f40264d, this.f40262b, dVar));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    /* renamed from: s */
    public void m37031s() {
        this.f40265e.m37008h();
    }

    /* renamed from: t */
    public void m37032t(int i10) {
        this.f40265e.m37018t(i10);
    }

    /* renamed from: u */
    public void m37033u() {
        C9242h.m38963a();
        this.f40264d.m31827b();
    }

    /* renamed from: v */
    public void m37034v() {
        C9242h.m38963a();
        this.f40264d.m31830e();
    }

    /* renamed from: w */
    public <A, T> c<A, T> m37035w(InterfaceC4617l<A, T> interfaceC4617l, Class<T> cls) {
        return new c<>(this, interfaceC4617l, cls);
    }
}
