package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ServiceC0582p;
import androidx.work.impl.foreground.C0770a;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/foreground/SystemForegroundService.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/SystemForegroundService.class */
public class SystemForegroundService extends ServiceC0582p implements C0770a.b {

    /* renamed from: g */
    public static final String f5257g = AbstractC4582k.m23128f("SystemFgService");

    /* renamed from: h */
    public static SystemForegroundService f5258h = null;

    /* renamed from: c */
    public Handler f5259c;

    /* renamed from: d */
    public boolean f5260d;

    /* renamed from: e */
    public C0770a f5261e;

    /* renamed from: f */
    public NotificationManager f5262f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/foreground/SystemForegroundService$a.class
     */
    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/SystemForegroundService$a.class */
    public class RunnableC0767a implements Runnable {

        /* renamed from: b */
        public final int f5263b;

        /* renamed from: c */
        public final Notification f5264c;

        /* renamed from: d */
        public final int f5265d;

        /* renamed from: e */
        public final SystemForegroundService f5266e;

        public RunnableC0767a(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
            this.f5266e = systemForegroundService;
            this.f5263b = i10;
            this.f5264c = notification;
            this.f5265d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5266e.startForeground(this.f5263b, this.f5264c, this.f5265d);
            } else {
                this.f5266e.startForeground(this.f5263b, this.f5264c);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/foreground/SystemForegroundService$b.class
     */
    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/SystemForegroundService$b.class */
    public class RunnableC0768b implements Runnable {

        /* renamed from: b */
        public final int f5267b;

        /* renamed from: c */
        public final Notification f5268c;

        /* renamed from: d */
        public final SystemForegroundService f5269d;

        public RunnableC0768b(SystemForegroundService systemForegroundService, int i10, Notification notification) {
            this.f5269d = systemForegroundService;
            this.f5267b = i10;
            this.f5268c = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5269d.f5262f.notify(this.f5267b, this.f5268c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/foreground/SystemForegroundService$c.class
     */
    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/SystemForegroundService$c.class */
    public class RunnableC0769c implements Runnable {

        /* renamed from: b */
        public final int f5270b;

        /* renamed from: c */
        public final SystemForegroundService f5271c;

        public RunnableC0769c(SystemForegroundService systemForegroundService, int i10) {
            this.f5271c = systemForegroundService;
            this.f5270b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5271c.f5262f.cancel(this.f5270b);
        }
    }

    @Override // androidx.work.impl.foreground.C0770a.b
    /* renamed from: a */
    public void mo4960a(int i10, Notification notification) {
        this.f5259c.post(new RunnableC0768b(this, i10, notification));
    }

    @Override // androidx.work.impl.foreground.C0770a.b
    /* renamed from: c */
    public void mo4961c(int i10, int i11, Notification notification) {
        this.f5259c.post(new RunnableC0767a(this, i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.C0770a.b
    /* renamed from: d */
    public void mo4962d(int i10) {
        this.f5259c.post(new RunnableC0769c(this, i10));
    }

    /* renamed from: e */
    public final void m4963e() {
        this.f5259c = new Handler(Looper.getMainLooper());
        this.f5262f = (NotificationManager) getApplicationContext().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        C0770a c0770a = new C0770a(getApplicationContext());
        this.f5261e = c0770a;
        c0770a.m4973m(this);
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public void onCreate() {
        super.onCreate();
        f5258h = this;
        m4963e();
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5261e.m4971k();
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5260d) {
            AbstractC4582k.m23126c().mo23131d(f5257g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5261e.m4971k();
            m4963e();
            this.f5260d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5261e.m4972l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.C0770a.b
    public void stop() {
        this.f5260d = true;
        AbstractC4582k.m23126c().mo23129a(f5257g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f5258h = null;
        stopSelf();
    }
}
