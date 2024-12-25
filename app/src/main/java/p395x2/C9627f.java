package p395x2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/f.class
 */
/* renamed from: x2.f */
/* loaded from: combined.jar:classes1.jar:x2/f.class */
public class C9627f implements InterfaceC9638q {

    /* renamed from: a */
    public final Executor f43967a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/f$a.class
     */
    /* renamed from: x2.f$a */
    /* loaded from: combined.jar:classes1.jar:x2/f$a.class */
    public class a implements Executor {

        /* renamed from: b */
        public final Handler f43968b;

        /* renamed from: c */
        public final C9627f f43969c;

        public a(C9627f c9627f, Handler handler) {
            this.f43969c = c9627f;
            this.f43968b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f43968b.post(runnable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/f$b.class
     */
    /* renamed from: x2.f$b */
    /* loaded from: combined.jar:classes1.jar:x2/f$b.class */
    public static class b implements Runnable {

        /* renamed from: b */
        public final AbstractC9635n f43970b;

        /* renamed from: c */
        public final C9637p f43971c;

        /* renamed from: d */
        public final Runnable f43972d;

        public b(AbstractC9635n abstractC9635n, C9637p c9637p, Runnable runnable) {
            this.f43970b = abstractC9635n;
            this.f43971c = c9637p;
            this.f43972d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43970b.m40533D()) {
                this.f43970b.m40552j("canceled-at-delivery");
                return;
            }
            if (this.f43971c.m40575b()) {
                this.f43970b.mo40550g(this.f43971c.f44014a);
            } else {
                this.f43970b.m40549f(this.f43971c.f44016c);
            }
            if (this.f43971c.f44017d) {
                this.f43970b.m40546b("intermediate-response");
            } else {
                this.f43970b.m40552j("done");
            }
            Runnable runnable = this.f43972d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C9627f(Handler handler) {
        this.f43967a = new a(this, handler);
    }

    @Override // p395x2.InterfaceC9638q
    /* renamed from: a */
    public void mo40515a(AbstractC9635n<?> abstractC9635n, C9637p<?> c9637p, Runnable runnable) {
        abstractC9635n.m40534E();
        abstractC9635n.m40546b("post-response");
        this.f43967a.execute(new b(abstractC9635n, c9637p, runnable));
    }

    @Override // p395x2.InterfaceC9638q
    /* renamed from: b */
    public void mo40516b(AbstractC9635n<?> abstractC9635n, C9642u c9642u) {
        abstractC9635n.m40546b("post-error");
        this.f43967a.execute(new b(abstractC9635n, C9637p.m40573a(c9642u), null));
    }

    @Override // p395x2.InterfaceC9638q
    /* renamed from: c */
    public void mo40517c(AbstractC9635n<?> abstractC9635n, C9637p<?> c9637p) {
        mo40515a(abstractC9635n, c9637p, null);
    }
}
