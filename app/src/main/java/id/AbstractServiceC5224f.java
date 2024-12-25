package id;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import p443zc.BinderC10192z;
import p443zc.C10190x;
import za.AbstractC10144i;
import za.C10146j;
import za.C10148l;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/f.class
 */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: id.f */
/* loaded from: combined.jar:classes2.jar:id/f.class */
public abstract class AbstractServiceC5224f extends Service {

    /* renamed from: c */
    public Binder f29922c;

    /* renamed from: e */
    public int f29924e;

    /* renamed from: b */
    public final ExecutorService f29921b = C5225g.m26101c();

    /* renamed from: d */
    public final Object f29923d = new Object();

    /* renamed from: f */
    public int f29925f = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:id/f$a.class
     */
    /* renamed from: id.f$a */
    /* loaded from: combined.jar:classes2.jar:id/f$a.class */
    public class a implements BinderC10192z.a {

        /* renamed from: a */
        public final AbstractServiceC5224f f29926a;

        public a(AbstractServiceC5224f abstractServiceC5224f) {
            this.f29926a = abstractServiceC5224f;
        }

        @Override // p443zc.BinderC10192z.a
        /* renamed from: a */
        public AbstractC10144i<Void> mo26098a(Intent intent) {
            return this.f29926a.m26096h(intent);
        }
    }

    /* renamed from: b */
    public final void m26093b(Intent intent) {
        if (intent != null) {
            C10190x.m42651b(intent);
        }
        synchronized (this.f29923d) {
            int i10 = this.f29925f - 1;
            this.f29925f = i10;
            if (i10 == 0) {
                m26097i(this.f29924e);
            }
        }
    }

    /* renamed from: c */
    public Intent mo14307c(Intent intent) {
        return intent;
    }

    /* renamed from: d */
    public abstract void mo14308d(Intent intent);

    /* renamed from: e */
    public boolean mo14309e(Intent intent) {
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void m26094f(Intent intent, AbstractC10144i abstractC10144i) {
        m26093b(intent);
    }

    /* renamed from: g */
    public final /* synthetic */ void m26095g(Intent intent, C10146j c10146j) {
        try {
            mo14308d(intent);
        } finally {
            c10146j.m42580c(false);
        }
    }

    /* renamed from: h */
    public final AbstractC10144i<Void> m26096h(final Intent intent) {
        if (mo14309e(intent)) {
            return C10148l.m42587e(null);
        }
        final C10146j c10146j = new C10146j();
        this.f29921b.execute(new Runnable(this, intent, c10146j) { // from class: id.c

            /* renamed from: b */
            public final AbstractServiceC5224f f29915b;

            /* renamed from: c */
            public final Intent f29916c;

            /* renamed from: d */
            public final C10146j f29917d;

            {
                this.f29915b = this;
                this.f29916c = intent;
                this.f29917d = c10146j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f29915b.m26095g(this.f29916c, this.f29917d);
            }
        });
        return c10146j.m42578a();
    }

    /* renamed from: i */
    public boolean m26097i(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f29922c == null) {
                this.f29922c = new BinderC10192z(new a(this));
            }
            binder = this.f29922c;
        }
        return binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f29921b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f29923d) {
            this.f29924e = i11;
            this.f29925f++;
        }
        Intent mo14307c = mo14307c(intent);
        if (mo14307c == null) {
            m26093b(intent);
            return 2;
        }
        AbstractC10144i<Void> m26096h = m26096h(mo14307c);
        if (m26096h.mo42566o()) {
            m26093b(intent);
            return 2;
        }
        m26096h.mo42553b(ExecutorC5222d.f29918b, new InterfaceC10134d(this, intent) { // from class: id.e

            /* renamed from: a */
            public final AbstractServiceC5224f f29919a;

            /* renamed from: b */
            public final Intent f29920b;

            {
                this.f29919a = this;
                this.f29920b = intent;
            }

            @Override // za.InterfaceC10134d
            /* renamed from: a */
            public void mo26091a(AbstractC10144i abstractC10144i) {
                this.f29919a.m26094f(this.f29920b, abstractC10144i);
            }
        });
        return 3;
    }
}
