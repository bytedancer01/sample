package ua;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import p305ra.C8319r4;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n9.class
 */
/* renamed from: ua.n9 */
/* loaded from: combined.jar:classes2.jar:ua/n9.class */
public final class C9006n9 extends AbstractC9030p9 {

    /* renamed from: d */
    public final AlarmManager f41457d;

    /* renamed from: e */
    public final AbstractC8984m f41458e;

    /* renamed from: f */
    public Integer f41459f;

    public C9006n9(C9123x9 c9123x9) {
        super(c9123x9);
        this.f41457d = (AlarmManager) this.f41723a.mo37779b().getSystemService("alarm");
        this.f41458e = new C8994m9(this, c9123x9.m38396w(), c9123x9);
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        this.f41457d.cancel(m38161q());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m38159o();
        return false;
    }

    /* renamed from: m */
    public final void m38157m(long j10) {
        m38183j();
        this.f41723a.mo37783f();
        Context mo37779b = this.f41723a.mo37779b();
        if (!C9073t4.m38236a(mo37779b)) {
            this.f41723a.mo37780c().m38415v().m38326a("Receiver not registered/enabled");
        }
        if (!C8899ea.m37818D(mo37779b, false)) {
            this.f41723a.mo37780c().m38415v().m38326a("Service not registered/enabled");
        }
        m38158n();
        this.f41723a.mo37780c().m38416w().m38327b("Scheduling upload, millis", Long.valueOf(j10));
        long mo22433b = this.f41723a.mo37778a().mo22433b();
        this.f41723a.m37797z();
        if (j10 < Math.max(0L, C8988m3.f41399y.m38108b(null).longValue()) && !this.f41458e.m38122c()) {
            this.f41458e.m38121b(j10);
        }
        this.f41723a.mo37783f();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f41457d;
            this.f41723a.m37797z();
            alarmManager.setInexactRepeating(2, mo22433b + j10, Math.max(C8988m3.f41389t.m38108b(null).longValue(), j10), m38161q());
        } else {
            Context mo37779b2 = this.f41723a.mo37779b();
            ComponentName componentName = new ComponentName(mo37779b2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int m38160p = m38160p();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C8319r4.m35761a(mo37779b2, new JobInfo.Builder(m38160p, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
        }
    }

    /* renamed from: n */
    public final void m38158n() {
        m38183j();
        this.f41723a.mo37780c().m38416w().m38326a("Unscheduling upload");
        this.f41457d.cancel(m38161q());
        this.f41458e.m38123d();
        if (Build.VERSION.SDK_INT >= 24) {
            m38159o();
        }
    }

    @TargetApi(24)
    /* renamed from: o */
    public final void m38159o() {
        ((JobScheduler) this.f41723a.mo37779b().getSystemService("jobscheduler")).cancel(m38160p());
    }

    /* renamed from: p */
    public final int m38160p() {
        if (this.f41459f == null) {
            String valueOf = String.valueOf(this.f41723a.mo37779b().getPackageName());
            this.f41459f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f41459f.intValue();
    }

    /* renamed from: q */
    public final PendingIntent m38161q() {
        Context mo37779b = this.f41723a.mo37779b();
        return PendingIntent.getBroadcast(mo37779b, 0, new Intent().setClassName(mo37779b, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }
}
