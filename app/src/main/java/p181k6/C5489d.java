package p181k6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;
import p036c6.AbstractC1004o;
import p124h6.C5036a;
import p197l6.InterfaceC5689d;
import p241o6.C6913a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/d.class
 */
/* renamed from: k6.d */
/* loaded from: combined.jar:classes1.jar:k6/d.class */
public class C5489d implements InterfaceC5509x {

    /* renamed from: a */
    public final Context f31331a;

    /* renamed from: b */
    public final InterfaceC5689d f31332b;

    /* renamed from: c */
    public final AbstractC5491f f31333c;

    public C5489d(Context context, InterfaceC5689d interfaceC5689d, AbstractC5491f abstractC5491f) {
        this.f31331a = context;
        this.f31332b = interfaceC5689d;
        this.f31333c = abstractC5491f;
    }

    @Override // p181k6.InterfaceC5509x
    /* renamed from: a */
    public void mo27291a(AbstractC1004o abstractC1004o, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f31331a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f31331a.getSystemService("jobscheduler");
        int m27293c = m27293c(abstractC1004o);
        if (!z10 && m27294d(jobScheduler, m27293c, i10)) {
            C5036a.m25235a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC1004o);
            return;
        }
        long mo27967l0 = this.f31332b.mo27967l0(abstractC1004o);
        JobInfo.Builder m27300c = this.f31333c.m27300c(new JobInfo.Builder(m27293c, componentName), abstractC1004o.mo5929d(), mo27967l0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC1004o.mo5927b());
        persistableBundle.putInt(LogFactory.PRIORITY_KEY, C6913a.m31838a(abstractC1004o.mo5929d()));
        if (abstractC1004o.mo5928c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC1004o.mo5928c(), 0));
        }
        m27300c.setExtras(persistableBundle);
        C5036a.m25236b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC1004o, Integer.valueOf(m27293c), Long.valueOf(this.f31333c.m27301g(abstractC1004o.mo5929d(), mo27967l0, i10)), Long.valueOf(mo27967l0), Integer.valueOf(i10));
        jobScheduler.schedule(m27300c.build());
    }

    @Override // p181k6.InterfaceC5509x
    /* renamed from: b */
    public void mo27292b(AbstractC1004o abstractC1004o, int i10) {
        mo27291a(abstractC1004o, i10, false);
    }

    /* renamed from: c */
    public int m27293c(AbstractC1004o abstractC1004o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f31331a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC1004o.mo5927b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6913a.m31838a(abstractC1004o.mo5929d())).array());
        if (abstractC1004o.mo5928c() != null) {
            adler32.update(abstractC1004o.mo5928c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m27294d(JobScheduler jobScheduler, int i10, int i11) {
        boolean z10;
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                z10 = false;
                if (i12 >= i11) {
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
