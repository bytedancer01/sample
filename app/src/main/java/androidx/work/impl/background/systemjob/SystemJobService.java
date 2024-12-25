package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p071e2.AbstractC4582k;
import p089f2.C4759i;
import p089f2.InterfaceC4752b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemjob/SystemJobService.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemjob/SystemJobService.class */
public class SystemJobService extends JobService implements InterfaceC4752b {

    /* renamed from: d */
    public static final String f5253d = AbstractC4582k.m23128f("SystemJobService");

    /* renamed from: b */
    public C4759i f5254b;

    /* renamed from: c */
    public final Map<String, JobParameters> f5255c = new HashMap();

    /* renamed from: a */
    public static String m4959a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException e10) {
            return null;
        }
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        JobParameters remove;
        AbstractC4582k.m23126c().mo23129a(f5253d, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f5255c) {
            remove = this.f5255c.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C4759i m24111m = C4759i.m24111m(getApplicationContext());
            this.f5254b = m24111m;
            m24111m.m24117o().m24074c(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC4582k.m23126c().mo23133h(f5253d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C4759i c4759i = this.f5254b;
        if (c4759i != null) {
            c4759i.m24117o().m24078i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        Network network;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        if (this.f5254b == null) {
            AbstractC4582k.m23126c().mo23129a(f5253d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String m4959a = m4959a(jobParameters);
        if (TextUtils.isEmpty(m4959a)) {
            AbstractC4582k.m23126c().mo23130b(f5253d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5255c) {
            if (this.f5255c.containsKey(m4959a)) {
                AbstractC4582k.m23126c().mo23129a(f5253d, String.format("Job is already being executed by SystemJobService: %s", m4959a), new Throwable[0]);
                return false;
            }
            AbstractC4582k.m23126c().mo23129a(f5253d, String.format("onStartJob for %s", m4959a), new Throwable[0]);
            this.f5255c.put(m4959a, jobParameters);
            WorkerParameters.C0755a c0755a = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                WorkerParameters.C0755a c0755a2 = new WorkerParameters.C0755a();
                triggeredContentUris = jobParameters.getTriggeredContentUris();
                if (triggeredContentUris != null) {
                    triggeredContentUris2 = jobParameters.getTriggeredContentUris();
                    c0755a2.f5157b = Arrays.asList(triggeredContentUris2);
                }
                triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
                if (triggeredContentAuthorities != null) {
                    triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
                    c0755a2.f5156a = Arrays.asList(triggeredContentAuthorities2);
                }
                c0755a = c0755a2;
                if (i10 >= 28) {
                    network = jobParameters.getNetwork();
                    c0755a2.f5158c = network;
                    c0755a = c0755a2;
                }
            }
            this.f5254b.m24126x(m4959a, c0755a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5254b == null) {
            AbstractC4582k.m23126c().mo23129a(f5253d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String m4959a = m4959a(jobParameters);
        if (TextUtils.isEmpty(m4959a)) {
            AbstractC4582k.m23126c().mo23130b(f5253d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC4582k.m23126c().mo23129a(f5253d, String.format("onStopJob for %s", m4959a), new Throwable[0]);
        synchronized (this.f5255c) {
            this.f5255c.remove(m4959a);
        }
        this.f5254b.m24128z(m4959a);
        return !this.f5254b.m24117o().m24075f(m4959a);
    }
}
