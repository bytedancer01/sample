package p208m1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/f.class
 */
/* renamed from: m1.f */
/* loaded from: combined.jar:classes1.jar:m1/f.class */
public abstract class AbstractC5897f {

    /* renamed from: b */
    public final Context f33044b;

    /* renamed from: c */
    public final d f33045c;

    /* renamed from: d */
    public final c f33046d;

    /* renamed from: e */
    public a f33047e;

    /* renamed from: f */
    public C5896e f33048f;

    /* renamed from: g */
    public boolean f33049g;

    /* renamed from: h */
    public C5898g f33050h;

    /* renamed from: i */
    public boolean f33051i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/f$a.class
     */
    /* renamed from: m1.f$a */
    /* loaded from: combined.jar:classes1.jar:m1/f$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo28821a(AbstractC5897f abstractC5897f, C5898g c5898g);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/f$b.class
     */
    /* renamed from: m1.f$b */
    /* loaded from: combined.jar:classes1.jar:m1/f$b.class */
    public static abstract class b extends e {

        /* renamed from: a */
        public final Object f33052a = new Object();

        /* renamed from: b */
        public Executor f33053b;

        /* renamed from: c */
        public d f33054c;

        /* renamed from: d */
        public C5895d f33055d;

        /* renamed from: e */
        public Collection<c> f33056e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/f$b$a.class
         */
        /* renamed from: m1.f$b$a */
        /* loaded from: combined.jar:classes1.jar:m1/f$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final d f33057b;

            /* renamed from: c */
            public final C5895d f33058c;

            /* renamed from: d */
            public final Collection f33059d;

            /* renamed from: e */
            public final b f33060e;

            public a(b bVar, d dVar, C5895d c5895d, Collection collection) {
                this.f33060e = bVar;
                this.f33057b = dVar;
                this.f33058c = c5895d;
                this.f33059d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33057b.mo28837a(this.f33060e, this.f33058c, this.f33059d);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/f$b$b.class
         */
        /* renamed from: m1.f$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m1/f$b$b.class */
        public class RunnableC10316b implements Runnable {

            /* renamed from: b */
            public final d f33061b;

            /* renamed from: c */
            public final C5895d f33062c;

            /* renamed from: d */
            public final Collection f33063d;

            /* renamed from: e */
            public final b f33064e;

            public RunnableC10316b(b bVar, d dVar, C5895d c5895d, Collection collection) {
                this.f33064e = bVar;
                this.f33061b = dVar;
                this.f33062c = c5895d;
                this.f33063d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33061b.mo28837a(this.f33064e, this.f33062c, this.f33063d);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/f$b$c.class
         */
        /* renamed from: m1.f$b$c */
        /* loaded from: combined.jar:classes1.jar:m1/f$b$c.class */
        public static final class c {

            /* renamed from: a */
            public final C5895d f33065a;

            /* renamed from: b */
            public final int f33066b;

            /* renamed from: c */
            public final boolean f33067c;

            /* renamed from: d */
            public final boolean f33068d;

            /* renamed from: e */
            public final boolean f33069e;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:m1/f$b$c$a.class
             */
            /* renamed from: m1.f$b$c$a */
            /* loaded from: combined.jar:classes1.jar:m1/f$b$c$a.class */
            public static final class a {

                /* renamed from: a */
                public final C5895d f33070a;

                /* renamed from: b */
                public int f33071b = 1;

                /* renamed from: c */
                public boolean f33072c = false;

                /* renamed from: d */
                public boolean f33073d = false;

                /* renamed from: e */
                public boolean f33074e = false;

                public a(C5895d c5895d) {
                    if (c5895d == null) {
                        throw new NullPointerException("descriptor must not be null");
                    }
                    this.f33070a = c5895d;
                }

                /* renamed from: a */
                public c m28832a() {
                    return new c(this.f33070a, this.f33071b, this.f33072c, this.f33073d, this.f33074e);
                }

                /* renamed from: b */
                public a m28833b(boolean z10) {
                    this.f33073d = z10;
                    return this;
                }

                /* renamed from: c */
                public a m28834c(boolean z10) {
                    this.f33074e = z10;
                    return this;
                }

                /* renamed from: d */
                public a m28835d(boolean z10) {
                    this.f33072c = z10;
                    return this;
                }

                /* renamed from: e */
                public a m28836e(int i10) {
                    this.f33071b = i10;
                    return this;
                }
            }

            public c(C5895d c5895d, int i10, boolean z10, boolean z11, boolean z12) {
                this.f33065a = c5895d;
                this.f33066b = i10;
                this.f33067c = z10;
                this.f33068d = z11;
                this.f33069e = z12;
            }

            /* renamed from: a */
            public static c m28826a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(C5895d.m28762d(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            /* renamed from: b */
            public C5895d m28827b() {
                return this.f33065a;
            }

            /* renamed from: c */
            public int m28828c() {
                return this.f33066b;
            }

            /* renamed from: d */
            public boolean m28829d() {
                return this.f33068d;
            }

            /* renamed from: e */
            public boolean m28830e() {
                return this.f33069e;
            }

            /* renamed from: f */
            public boolean m28831f() {
                return this.f33067c;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/f$b$d.class
         */
        /* renamed from: m1.f$b$d */
        /* loaded from: combined.jar:classes1.jar:m1/f$b$d.class */
        public interface d {
            /* renamed from: a */
            void mo28837a(b bVar, C5895d c5895d, Collection<c> collection);
        }

        /* renamed from: j */
        public String mo28822j() {
            return null;
        }

        /* renamed from: k */
        public String mo28823k() {
            return null;
        }

        /* renamed from: l */
        public final void m28824l(C5895d c5895d, Collection<c> collection) {
            if (c5895d == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            if (collection == null) {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
            synchronized (this.f33052a) {
                Executor executor = this.f33053b;
                if (executor != null) {
                    executor.execute(new RunnableC10316b(this, this.f33054c, c5895d, collection));
                } else {
                    this.f33055d = c5895d;
                    this.f33056e = new ArrayList(collection);
                }
            }
        }

        /* renamed from: m */
        public abstract void mo28754m(String str);

        /* renamed from: n */
        public abstract void mo28755n(String str);

        /* renamed from: o */
        public abstract void mo28756o(List<String> list);

        /* renamed from: p */
        public void m28825p(Executor executor, d dVar) {
            synchronized (this.f33052a) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (dVar == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.f33053b = executor;
                this.f33054c = dVar;
                Collection<c> collection = this.f33056e;
                if (collection != null && !collection.isEmpty()) {
                    C5895d c5895d = this.f33055d;
                    Collection<c> collection2 = this.f33056e;
                    this.f33055d = null;
                    this.f33056e = null;
                    this.f33053b.execute(new a(this, dVar, c5895d, collection2));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/f$c.class
     */
    /* renamed from: m1.f$c */
    /* loaded from: combined.jar:classes1.jar:m1/f$c.class */
    public final class c extends Handler {

        /* renamed from: a */
        public final AbstractC5897f f33075a;

        public c(AbstractC5897f abstractC5897f) {
            this.f33075a = abstractC5897f;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f33075a.m28811l();
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f33075a.m28812m();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/f$d.class
     */
    /* renamed from: m1.f$d */
    /* loaded from: combined.jar:classes1.jar:m1/f$d.class */
    public static final class d {

        /* renamed from: a */
        public final ComponentName f33076a;

        public d(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f33076a = componentName;
        }

        /* renamed from: a */
        public ComponentName m28838a() {
            return this.f33076a;
        }

        /* renamed from: b */
        public String m28839b() {
            return this.f33076a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f33076a.flattenToShortString() + " }";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/f$e.class
     */
    /* renamed from: m1.f$e */
    /* loaded from: combined.jar:classes1.jar:m1/f$e.class */
    public static abstract class e {
        /* renamed from: d */
        public void mo28751d() {
        }

        /* renamed from: e */
        public void mo28840e() {
        }

        /* renamed from: f */
        public void mo28752f(int i10) {
        }

        @Deprecated
        /* renamed from: g */
        public void mo28841g() {
        }

        /* renamed from: h */
        public void mo28842h(int i10) {
            mo28841g();
        }

        /* renamed from: i */
        public void mo28753i(int i10) {
        }
    }

    public AbstractC5897f(Context context) {
        this(context, null);
    }

    public AbstractC5897f(Context context, d dVar) {
        this.f33046d = new c(this);
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f33044b = context;
        this.f33045c = dVar == null ? new d(new ComponentName(context, getClass())) : dVar;
    }

    /* renamed from: l */
    public void m28811l() {
        this.f33051i = false;
        a aVar = this.f33047e;
        if (aVar != null) {
            aVar.mo28821a(this, this.f33050h);
        }
    }

    /* renamed from: m */
    public void m28812m() {
        this.f33049g = false;
        mo28745u(this.f33048f);
    }

    /* renamed from: n */
    public final Context m28813n() {
        return this.f33044b;
    }

    /* renamed from: o */
    public final C5898g m28814o() {
        return this.f33050h;
    }

    /* renamed from: p */
    public final C5896e m28815p() {
        return this.f33048f;
    }

    /* renamed from: q */
    public final d m28816q() {
        return this.f33045c;
    }

    /* renamed from: r */
    public b mo28742r(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: s */
    public e mo28743s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* renamed from: t */
    public e mo28744t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return mo28743s(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    /* renamed from: u */
    public void mo28745u(C5896e c5896e) {
    }

    /* renamed from: v */
    public final void m28817v(a aVar) {
        C5901j.m28864d();
        this.f33047e = aVar;
    }

    /* renamed from: w */
    public final void m28818w(C5898g c5898g) {
        C5901j.m28864d();
        if (this.f33050h != c5898g) {
            this.f33050h = c5898g;
            if (this.f33051i) {
                return;
            }
            this.f33051i = true;
            this.f33046d.sendEmptyMessage(1);
        }
    }

    /* renamed from: x */
    public final void m28819x(C5896e c5896e) {
        C5901j.m28864d();
        if (C6611c.m30516a(this.f33048f, c5896e)) {
            return;
        }
        m28820y(c5896e);
    }

    /* renamed from: y */
    public final void m28820y(C5896e c5896e) {
        this.f33048f = c5896e;
        if (this.f33049g) {
            return;
        }
        this.f33049g = true;
        this.f33046d.sendEmptyMessage(2);
    }
}
