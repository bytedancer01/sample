package p443zc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import ca.C1052b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079ea.ThreadFactoryC4694b;
import p443zc.ServiceConnectionC10169c0;
import za.AbstractC10144i;
import za.C10146j;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/c0.class
 */
/* renamed from: zc.c0 */
/* loaded from: combined.jar:classes2.jar:zc/c0.class */
public class ServiceConnectionC10169c0 implements ServiceConnection {

    /* renamed from: b */
    public final Context f46609b;

    /* renamed from: c */
    public final Intent f46610c;

    /* renamed from: d */
    public final ScheduledExecutorService f46611d;

    /* renamed from: e */
    public final Queue<a> f46612e;

    /* renamed from: f */
    public BinderC10192z f46613f;

    /* renamed from: g */
    public boolean f46614g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zc/c0$a.class
     */
    /* renamed from: zc.c0$a */
    /* loaded from: combined.jar:classes2.jar:zc/c0$a.class */
    public static class a {

        /* renamed from: a */
        public final Intent f46615a;

        /* renamed from: b */
        public final C10146j<Void> f46616b = new C10146j<>();

        public a(Intent intent) {
            this.f46615a = intent;
        }

        /* renamed from: a */
        public void m42610a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(this) { // from class: zc.a0

                /* renamed from: b */
                public final ServiceConnectionC10169c0.a f46603b;

                {
                    this.f46603b = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f46603b.m42613d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m42612c().mo42553b(scheduledExecutorService, new InterfaceC10134d(schedule) { // from class: zc.b0

                /* renamed from: a */
                public final ScheduledFuture f46606a;

                {
                    this.f46606a = schedule;
                }

                @Override // za.InterfaceC10134d
                /* renamed from: a */
                public void mo26091a(AbstractC10144i abstractC10144i) {
                    this.f46606a.cancel(false);
                }
            });
        }

        /* renamed from: b */
        public void m42611b() {
            this.f46616b.m42582e(null);
        }

        /* renamed from: c */
        public AbstractC10144i<Void> m42612c() {
            return this.f46616b.m42578a();
        }

        /* renamed from: d */
        public final /* synthetic */ void m42613d() {
            String action = this.f46615a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb2.toString());
            m42611b();
        }
    }

    public ServiceConnectionC10169c0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC4694b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public ServiceConnectionC10169c0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f46612e = new ArrayDeque();
        this.f46614g = false;
        Context applicationContext = context.getApplicationContext();
        this.f46609b = applicationContext;
        this.f46610c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f46611d = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void m42605a() {
        while (!this.f46612e.isEmpty()) {
            this.f46612e.poll().m42611b();
        }
    }

    /* renamed from: b */
    public final void m42606b() {
        synchronized (this) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "flush queue called");
            }
            while (!this.f46612e.isEmpty()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "found intent to be delivered");
                }
                BinderC10192z binderC10192z = this.f46613f;
                if (binderC10192z == null || !binderC10192z.isBinderAlive()) {
                    m42608d();
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.f46613f.m42656b(this.f46612e.poll());
            }
        }
    }

    /* renamed from: c */
    public AbstractC10144i<Void> m42607c(Intent intent) {
        AbstractC10144i<Void> m42612c;
        synchronized (this) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            a aVar = new a(intent);
            aVar.m42610a(this.f46611d);
            this.f46612e.add(aVar);
            m42606b();
            m42612c = aVar.m42612c();
        }
        return m42612c;
    }

    /* renamed from: d */
    public final void m42608d() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            boolean z10 = this.f46614g;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z10);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        if (this.f46614g) {
            return;
        }
        this.f46614g = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", e10);
        }
        if (C1052b.m6223b().m6227a(this.f46609b, this.f46610c, this, 65)) {
            return;
        }
        Log.e("FirebaseInstanceId", "binding to the service failed");
        this.f46614g = false;
        m42605a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
                sb2.append("onServiceConnected: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            this.f46614g = false;
            if (iBinder instanceof BinderC10192z) {
                this.f46613f = (BinderC10192z) iBinder;
                m42606b();
                return;
            }
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e("FirebaseInstanceId", sb3.toString());
            m42605a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("onServiceDisconnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        m42606b();
    }
}
