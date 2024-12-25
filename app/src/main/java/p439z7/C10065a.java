package p439z7;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z7/a.class
 */
/* renamed from: z7.a */
/* loaded from: combined.jar:classes2.jar:z7/a.class */
public final class C10065a implements InterfaceC10071g {

    /* renamed from: d */
    public static final int f46220d;

    /* renamed from: a */
    public final int f46221a;

    /* renamed from: b */
    public final ComponentName f46222b;

    /* renamed from: c */
    public final JobScheduler f46223c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z7/a$a.class
     */
    /* renamed from: z7.a$a */
    /* loaded from: combined.jar:classes2.jar:z7/a$a.class */
    public static final class a extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int m42366j = new C10067c(extras.getInt("requirements")).m42366j(this);
            if (m42366j == 0) {
                C4401z0.m22362Y0(this, new Intent((String) C4349a.m21882e(extras.getString("service_action"))).setPackage((String) C4349a.m21882e(extras.getString("service_package"))));
                return false;
            }
            C4392v.m22275i("PlatformScheduler", "Requirements not met: " + m42366j);
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f46220d = (C4401z0.f26679a >= 26 ? 16 : 0) | 15;
    }

    public C10065a(Context context, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f46221a = i10;
        this.f46222b = new ComponentName(applicationContext, (Class<?>) a.class);
        this.f46223c = (JobScheduler) C4349a.m21882e((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    /* renamed from: c */
    public static JobInfo m42359c(int i10, ComponentName componentName, C10067c c10067c, String str, String str2) {
        C10067c m42364b = c10067c.m42364b(f46220d);
        if (!m42364b.equals(c10067c)) {
            C4392v.m22275i("PlatformScheduler", "Ignoring unsupported requirements: " + (m42364b.m42367k() ^ c10067c.m42367k()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i10, componentName);
        if (c10067c.m42375w()) {
            builder.setRequiredNetworkType(2);
        } else if (c10067c.m42372r()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(c10067c.m42371o());
        builder.setRequiresCharging(c10067c.m42368l());
        if (C4401z0.f26679a >= 26 && c10067c.m42374u()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", str);
        persistableBundle.putString("service_package", str2);
        persistableBundle.putInt("requirements", c10067c.m42367k());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // p439z7.InterfaceC10071g
    /* renamed from: a */
    public C10067c mo42360a(C10067c c10067c) {
        return c10067c.m42364b(f46220d);
    }

    @Override // p439z7.InterfaceC10071g
    /* renamed from: b */
    public boolean mo42361b(C10067c c10067c, String str, String str2) {
        boolean z10 = true;
        if (this.f46223c.schedule(m42359c(this.f46221a, this.f46222b, c10067c, str2, str)) != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // p439z7.InterfaceC10071g
    public boolean cancel() {
        this.f46223c.cancel(this.f46221a);
        return true;
    }
}
