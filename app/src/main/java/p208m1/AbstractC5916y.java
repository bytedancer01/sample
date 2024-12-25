package p208m1;

import android.content.Context;
import java.lang.ref.WeakReference;
import p208m1.C5908q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/y.class
 */
/* renamed from: m1.y */
/* loaded from: combined.jar:classes1.jar:m1/y.class */
public abstract class AbstractC5916y {

    /* renamed from: a */
    public final Context f33257a;

    /* renamed from: b */
    public final Object f33258b;

    /* renamed from: c */
    public c f33259c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/y$a.class
     */
    /* renamed from: m1.y$a */
    /* loaded from: combined.jar:classes1.jar:m1/y$a.class */
    public static class a extends AbstractC5916y {

        /* renamed from: d */
        public final Object f33260d;

        /* renamed from: e */
        public final Object f33261e;

        /* renamed from: f */
        public final Object f33262f;

        /* renamed from: g */
        public boolean f33263g;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/y$a$a.class
         */
        /* renamed from: m1.y$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m1/y$a$a.class */
        public static final class C10320a implements C5908q.e {

            /* renamed from: b */
            public final WeakReference<a> f33264b;

            public C10320a(a aVar) {
                this.f33264b = new WeakReference<>(aVar);
            }

            @Override // p208m1.C5908q.e
            /* renamed from: a */
            public void mo29061a(Object obj, int i10) {
                c cVar;
                a aVar = this.f33264b.get();
                if (aVar == null || (cVar = aVar.f33259c) == null) {
                    return;
                }
                cVar.mo28955b(i10);
            }

            @Override // p208m1.C5908q.e
            /* renamed from: d */
            public void mo29062d(Object obj, int i10) {
                c cVar;
                a aVar = this.f33264b.get();
                if (aVar == null || (cVar = aVar.f33259c) == null) {
                    return;
                }
                cVar.mo28954a(i10);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object m29028e = C5908q.m29028e(context);
            this.f33260d = m29028e;
            Object m29025b = C5908q.m29025b(m29028e, "", false);
            this.f33261e = m29025b;
            this.f33262f = C5908q.m29026c(m29028e, m29025b);
        }

        @Override // p208m1.AbstractC5916y
        /* renamed from: c */
        public void mo29145c(b bVar) {
            C5908q.d.m29057e(this.f33262f, bVar.f33265a);
            C5908q.d.m29060h(this.f33262f, bVar.f33266b);
            C5908q.d.m29059g(this.f33262f, bVar.f33267c);
            C5908q.d.m29054b(this.f33262f, bVar.f33268d);
            C5908q.d.m29055c(this.f33262f, bVar.f33269e);
            if (this.f33263g) {
                return;
            }
            this.f33263g = true;
            C5908q.d.m29058f(this.f33262f, C5908q.m29027d(new C10320a(this)));
            C5908q.d.m29056d(this.f33262f, this.f33258b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/y$b.class
     */
    /* renamed from: m1.y$b */
    /* loaded from: combined.jar:classes1.jar:m1/y$b.class */
    public static final class b {

        /* renamed from: a */
        public int f33265a;

        /* renamed from: b */
        public int f33266b;

        /* renamed from: c */
        public int f33267c = 0;

        /* renamed from: d */
        public int f33268d = 3;

        /* renamed from: e */
        public int f33269e = 1;

        /* renamed from: f */
        public String f33270f;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/y$c.class
     */
    /* renamed from: m1.y$c */
    /* loaded from: combined.jar:classes1.jar:m1/y$c.class */
    public interface c {
        /* renamed from: a */
        void mo28954a(int i10);

        /* renamed from: b */
        void mo28955b(int i10);
    }

    public AbstractC5916y(Context context, Object obj) {
        this.f33257a = context;
        this.f33258b = obj;
    }

    /* renamed from: b */
    public static AbstractC5916y m29143b(Context context, Object obj) {
        return new a(context, obj);
    }

    /* renamed from: a */
    public Object m29144a() {
        return this.f33258b;
    }

    /* renamed from: c */
    public abstract void mo29145c(b bVar);

    /* renamed from: d */
    public void m29146d(c cVar) {
        this.f33259c = cVar;
    }
}
