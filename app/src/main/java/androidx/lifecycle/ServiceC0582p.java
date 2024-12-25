package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/p.class
 */
/* renamed from: androidx.lifecycle.p */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/p.class */
public class ServiceC0582p extends Service implements InterfaceC0579m {

    /* renamed from: b */
    public final C0561a0 f3776b = new C0561a0(this);

    @Override // androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        return this.f3776b.m3118a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f3776b.m3119b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3776b.m3120c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3776b.m3121d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f3776b.m3122e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
