package ua;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p422y9.C9935o;
import ua.InterfaceC9144z8;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/a9.class
 */
/* renamed from: ua.a9 */
/* loaded from: combined.jar:classes2.jar:ua/a9.class */
public final class C8850a9<T extends Context & InterfaceC9144z8> {

    /* renamed from: a */
    public final T f40904a;

    public C8850a9(T t10) {
        C9935o.m41850j(t10);
        this.f40904a = t10;
    }

    /* renamed from: a */
    public final void m37739a() {
        C8870c5 m37753h = C8870c5.m37753h(this.f40904a, null, null);
        C9128y3 mo37780c = m37753h.mo37780c();
        m37753h.mo37783f();
        mo37780c.m38416w().m38326a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void m37740b() {
        C8870c5 m37753h = C8870c5.m37753h(this.f40904a, null, null);
        C9128y3 mo37780c = m37753h.mo37780c();
        m37753h.mo37783f();
        mo37780c.m38416w().m38326a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: c */
    public final int m37741c(final Intent intent, int i10, final int i11) {
        C8870c5 m37753h = C8870c5.m37753h(this.f40904a, null, null);
        final C9128y3 mo37780c = m37753h.mo37780c();
        if (intent == null) {
            mo37780c.m38411r().m38326a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m37753h.mo37783f();
        mo37780c.m38416w().m38328c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        m37742d(new Runnable(this, i11, mo37780c, intent) { // from class: ua.w8

            /* renamed from: b */
            public final C8850a9 f41730b;

            /* renamed from: c */
            public final int f41731c;

            /* renamed from: d */
            public final C9128y3 f41732d;

            /* renamed from: e */
            public final Intent f41733e;

            {
                this.f41730b = this;
                this.f41731c = i11;
                this.f41732d = mo37780c;
                this.f41733e = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41730b.m37748j(this.f41731c, this.f41732d, this.f41733e);
            }
        });
        return 2;
    }

    /* renamed from: d */
    public final void m37742d(Runnable runnable) {
        C9123x9 m38338F = C9123x9.m38338F(this.f40904a);
        m38338F.mo37782e().m38436r(new RunnableC9133y8(this, m38338F, runnable));
    }

    /* renamed from: e */
    public final IBinder m37743e(Intent intent) {
        if (intent == null) {
            m37749k().m38408o().m38326a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC9097v5(C9123x9.m38338F(this.f40904a), null);
        }
        m37749k().m38411r().m38327b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: f */
    public final boolean m37744f(Intent intent) {
        if (intent == null) {
            m37749k().m38408o().m38326a("onUnbind called with null intent");
            return true;
        }
        m37749k().m38416w().m38327b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    /* renamed from: g */
    public final boolean m37745g(final JobParameters jobParameters) {
        C8870c5 m37753h = C8870c5.m37753h(this.f40904a, null, null);
        final C9128y3 mo37780c = m37753h.mo37780c();
        String string = jobParameters.getExtras().getString("action");
        m37753h.mo37783f();
        mo37780c.m38416w().m38327b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m37742d(new Runnable(this, mo37780c, jobParameters) { // from class: ua.x8

            /* renamed from: b */
            public final C8850a9 f41753b;

            /* renamed from: c */
            public final C9128y3 f41754c;

            /* renamed from: d */
            public final JobParameters f41755d;

            {
                this.f41753b = this;
                this.f41754c = mo37780c;
                this.f41755d = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41753b.m37747i(this.f41754c, this.f41755d);
            }
        });
        return true;
    }

    /* renamed from: h */
    public final void m37746h(Intent intent) {
        if (intent == null) {
            m37749k().m38408o().m38326a("onRebind called with null intent");
        } else {
            m37749k().m38416w().m38327b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void m37747i(C9128y3 c9128y3, JobParameters jobParameters) {
        c9128y3.m38416w().m38326a("AppMeasurementJobService processed last upload request.");
        this.f40904a.mo13189c(jobParameters, false);
    }

    /* renamed from: j */
    public final /* synthetic */ void m37748j(int i10, C9128y3 c9128y3, Intent intent) {
        if (this.f40904a.mo13187a(i10)) {
            c9128y3.m38416w().m38327b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            m37749k().m38416w().m38326a("Completed wakeful intent.");
            this.f40904a.mo13188b(intent);
        }
    }

    /* renamed from: k */
    public final C9128y3 m37749k() {
        return C8870c5.m37753h(this.f40904a, null, null).mo37780c();
    }
}
