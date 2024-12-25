package p174k;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k/a.class
 */
/* renamed from: k.a */
/* loaded from: combined.jar:classes1.jar:k/a.class */
public class C5436a extends AbstractC5439d {

    /* renamed from: c */
    public static volatile C5436a f31174c;

    /* renamed from: d */
    public static final Executor f31175d = new a();

    /* renamed from: e */
    public static final Executor f31176e = new b();

    /* renamed from: a */
    public AbstractC5439d f31177a;

    /* renamed from: b */
    public AbstractC5439d f31178b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k/a$a.class
     */
    /* renamed from: k.a$a */
    /* loaded from: combined.jar:classes1.jar:k/a$a.class */
    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C5436a.m27181e().mo27184c(runnable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k/a$b.class
     */
    /* renamed from: k.a$b */
    /* loaded from: combined.jar:classes1.jar:k/a$b.class */
    public static final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C5436a.m27181e().mo27182a(runnable);
        }
    }

    public C5436a() {
        C5438c c5438c = new C5438c();
        this.f31178b = c5438c;
        this.f31177a = c5438c;
    }

    /* renamed from: d */
    public static Executor m27180d() {
        return f31176e;
    }

    /* renamed from: e */
    public static C5436a m27181e() {
        if (f31174c != null) {
            return f31174c;
        }
        synchronized (C5436a.class) {
            try {
                if (f31174c == null) {
                    f31174c = new C5436a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f31174c;
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: a */
    public void mo27182a(Runnable runnable) {
        this.f31177a.mo27182a(runnable);
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: b */
    public boolean mo27183b() {
        return this.f31177a.mo27183b();
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: c */
    public void mo27184c(Runnable runnable) {
        this.f31177a.mo27184c(runnable);
    }
}
