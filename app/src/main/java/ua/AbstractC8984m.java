package ua;

import android.os.Handler;
import p305ra.HandlerC8369u9;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m.class
 */
/* renamed from: ua.m */
/* loaded from: combined.jar:classes2.jar:ua/m.class */
public abstract class AbstractC8984m {

    /* renamed from: d */
    public static volatile Handler f41303d;

    /* renamed from: a */
    public final InterfaceC9130y5 f41304a;

    /* renamed from: b */
    public final Runnable f41305b;

    /* renamed from: c */
    public volatile long f41306c;

    public AbstractC8984m(InterfaceC9130y5 interfaceC9130y5) {
        C9935o.m41850j(interfaceC9130y5);
        this.f41304a = interfaceC9130y5;
        this.f41305b = new RunnableC8972l(this, interfaceC9130y5);
    }

    /* renamed from: e */
    public static /* synthetic */ long m38120e(AbstractC8984m abstractC8984m, long j10) {
        abstractC8984m.f41306c = 0L;
        return 0L;
    }

    /* renamed from: a */
    public abstract void mo37809a();

    /* renamed from: b */
    public final void m38121b(long j10) {
        m38123d();
        if (j10 >= 0) {
            this.f41306c = this.f41304a.mo37778a().mo22432a();
            if (m38124f().postDelayed(this.f41305b, j10)) {
                return;
            }
            this.f41304a.mo37780c().m38408o().m38327b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    /* renamed from: c */
    public final boolean m38122c() {
        return this.f41306c != 0;
    }

    /* renamed from: d */
    public final void m38123d() {
        this.f41306c = 0L;
        m38124f().removeCallbacks(this.f41305b);
    }

    /* renamed from: f */
    public final Handler m38124f() {
        Handler handler;
        if (f41303d != null) {
            return f41303d;
        }
        synchronized (AbstractC8984m.class) {
            try {
                if (f41303d == null) {
                    f41303d = new HandlerC8369u9(this.f41304a.mo37779b().getMainLooper());
                }
                handler = f41303d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
