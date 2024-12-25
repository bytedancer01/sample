package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.ServiceC0582p;
import androidx.work.impl.background.systemalarm.C0766d;
import p071e2.AbstractC4582k;
import p237o2.C6879l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/SystemAlarmService.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/SystemAlarmService.class */
public class SystemAlarmService extends ServiceC0582p implements C0766d.c {

    /* renamed from: e */
    public static final String f5215e = AbstractC4582k.m23128f("SystemAlarmService");

    /* renamed from: c */
    public C0766d f5216c;

    /* renamed from: d */
    public boolean f5217d;

    @Override // androidx.work.impl.background.systemalarm.C0766d.c
    /* renamed from: b */
    public void mo4922b() {
        this.f5217d = true;
        AbstractC4582k.m23126c().mo23129a(f5215e, "All commands completed in dispatcher", new Throwable[0]);
        C6879l.m31718a();
        stopSelf();
    }

    /* renamed from: e */
    public final void m4923e() {
        C0766d c0766d = new C0766d(this);
        this.f5216c = c0766d;
        c0766d.m4958m(this);
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public void onCreate() {
        super.onCreate();
        m4923e();
        this.f5217d = false;
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5217d = true;
        this.f5216c.m4955j();
    }

    @Override // androidx.lifecycle.ServiceC0582p, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5217d) {
            AbstractC4582k.m23126c().mo23131d(f5215e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5216c.m4955j();
            m4923e();
            this.f5217d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5216c.m4947a(intent, i11);
        return 3;
    }
}
