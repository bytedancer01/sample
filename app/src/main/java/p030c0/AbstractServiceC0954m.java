package p030c0;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/m.class
 */
@Deprecated
/* renamed from: c0.m */
/* loaded from: combined.jar:classes1.jar:c0/m.class */
public abstract class AbstractServiceC0954m extends Service {

    /* renamed from: i */
    public static final Object f6584i = new Object();

    /* renamed from: j */
    public static final HashMap<ComponentName, h> f6585j = new HashMap<>();

    /* renamed from: b */
    public b f6586b;

    /* renamed from: c */
    public h f6587c;

    /* renamed from: d */
    public a f6588d;

    /* renamed from: e */
    public boolean f6589e = false;

    /* renamed from: f */
    public boolean f6590f = false;

    /* renamed from: g */
    public boolean f6591g = false;

    /* renamed from: h */
    public final ArrayList<d> f6592h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$a.class
     */
    /* renamed from: c0.m$a */
    /* loaded from: combined.jar:classes1.jar:c0/m$a.class */
    public final class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final AbstractServiceC0954m f6593a;

        public a(AbstractServiceC0954m abstractServiceC0954m) {
            this.f6593a = abstractServiceC0954m;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e m5684a = this.f6593a.m5684a();
                if (m5684a == null) {
                    return null;
                }
                this.f6593a.m5687e(m5684a.getIntent());
                m5684a.complete();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r32) {
            this.f6593a.m5689g();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            this.f6593a.m5689g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$b.class
     */
    /* renamed from: c0.m$b */
    /* loaded from: combined.jar:classes1.jar:c0/m$b.class */
    public interface b {
        IBinder compatGetBinder();

        e dequeueWork();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$c.class
     */
    /* renamed from: c0.m$c */
    /* loaded from: combined.jar:classes1.jar:c0/m$c.class */
    public static final class c extends h {

        /* renamed from: d */
        public final Context f6594d;

        /* renamed from: e */
        public final PowerManager.WakeLock f6595e;

        /* renamed from: f */
        public final PowerManager.WakeLock f6596f;

        /* renamed from: g */
        public boolean f6597g;

        /* renamed from: h */
        public boolean f6598h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f6594d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f6595e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f6596f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // p030c0.AbstractServiceC0954m.h
        /* renamed from: b */
        public void mo5693b() {
            synchronized (this) {
                if (this.f6598h) {
                    if (this.f6597g) {
                        this.f6595e.acquire(60000L);
                    }
                    this.f6598h = false;
                    this.f6596f.release();
                }
            }
        }

        @Override // p030c0.AbstractServiceC0954m.h
        /* renamed from: c */
        public void mo5694c() {
            synchronized (this) {
                if (!this.f6598h) {
                    this.f6598h = true;
                    this.f6596f.acquire(600000L);
                    this.f6595e.release();
                }
            }
        }

        @Override // p030c0.AbstractServiceC0954m.h
        /* renamed from: d */
        public void mo5695d() {
            synchronized (this) {
                this.f6597g = false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$d.class
     */
    /* renamed from: c0.m$d */
    /* loaded from: combined.jar:classes1.jar:c0/m$d.class */
    public final class d implements e {

        /* renamed from: a */
        public final Intent f6599a;

        /* renamed from: b */
        public final int f6600b;

        /* renamed from: c */
        public final AbstractServiceC0954m f6601c;

        public d(AbstractServiceC0954m abstractServiceC0954m, Intent intent, int i10) {
            this.f6601c = abstractServiceC0954m;
            this.f6599a = intent;
            this.f6600b = i10;
        }

        @Override // p030c0.AbstractServiceC0954m.e
        public void complete() {
            this.f6601c.stopSelf(this.f6600b);
        }

        @Override // p030c0.AbstractServiceC0954m.e
        public Intent getIntent() {
            return this.f6599a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$e.class
     */
    /* renamed from: c0.m$e */
    /* loaded from: combined.jar:classes1.jar:c0/m$e.class */
    public interface e {
        void complete();

        Intent getIntent();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$f.class
     */
    /* renamed from: c0.m$f */
    /* loaded from: combined.jar:classes1.jar:c0/m$f.class */
    public static final class f extends JobServiceEngine implements b {

        /* renamed from: a */
        public final AbstractServiceC0954m f6602a;

        /* renamed from: b */
        public final Object f6603b;

        /* renamed from: c */
        public JobParameters f6604c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c0/m$f$a.class
         */
        /* renamed from: c0.m$f$a */
        /* loaded from: combined.jar:classes1.jar:c0/m$f$a.class */
        public final class a implements e {

            /* renamed from: a */
            public final JobWorkItem f6605a;

            /* renamed from: b */
            public final f f6606b;

            public a(f fVar, JobWorkItem jobWorkItem) {
                this.f6606b = fVar;
                this.f6605a = jobWorkItem;
            }

            @Override // p030c0.AbstractServiceC0954m.e
            public void complete() {
                synchronized (this.f6606b.f6603b) {
                    JobParameters jobParameters = this.f6606b.f6604c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f6605a);
                    }
                }
            }

            @Override // p030c0.AbstractServiceC0954m.e
            public Intent getIntent() {
                return this.f6605a.getIntent();
            }
        }

        public f(AbstractServiceC0954m abstractServiceC0954m) {
            super(abstractServiceC0954m);
            this.f6603b = new Object();
            this.f6602a = abstractServiceC0954m;
        }

        @Override // p030c0.AbstractServiceC0954m.b
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // p030c0.AbstractServiceC0954m.b
        public e dequeueWork() {
            JobWorkItem dequeueWork;
            synchronized (this.f6603b) {
                JobParameters jobParameters = this.f6604c;
                if (jobParameters == null) {
                    return null;
                }
                dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.f6602a.getClassLoader());
                return new a(this, dequeueWork);
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f6604c = jobParameters;
            this.f6602a.m5686c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean m5685b = this.f6602a.m5685b();
            synchronized (this.f6603b) {
                this.f6604c = null;
            }
            return m5685b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$g.class
     */
    /* renamed from: c0.m$g */
    /* loaded from: combined.jar:classes1.jar:c0/m$g.class */
    public static final class g extends h {

        /* renamed from: d */
        public final JobInfo f6607d;

        /* renamed from: e */
        public final JobScheduler f6608e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            m5696a(i10);
            this.f6607d = new JobInfo.Builder(i10, this.f6609a).setOverrideDeadline(0L).build();
            this.f6608e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/m$h.class
     */
    /* renamed from: c0.m$h */
    /* loaded from: combined.jar:classes1.jar:c0/m$h.class */
    public static abstract class h {

        /* renamed from: a */
        public final ComponentName f6609a;

        /* renamed from: b */
        public boolean f6610b;

        /* renamed from: c */
        public int f6611c;

        public h(ComponentName componentName) {
            this.f6609a = componentName;
        }

        /* renamed from: a */
        public void m5696a(int i10) {
            if (!this.f6610b) {
                this.f6610b = true;
                this.f6611c = i10;
            } else {
                if (this.f6611c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f6611c);
            }
        }

        /* renamed from: b */
        public void mo5693b() {
        }

        /* renamed from: c */
        public void mo5694c() {
        }

        /* renamed from: d */
        public void mo5695d() {
        }
    }

    public AbstractServiceC0954m() {
        this.f6592h = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    /* renamed from: d */
    public static h m5683d(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f6585j;
        h hVar = hashMap.get(componentName);
        h hVar2 = hVar;
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                cVar = new c(context, componentName);
            } else {
                if (!z10) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new g(context, componentName, i10);
            }
            hashMap.put(componentName, cVar);
            hVar2 = cVar;
        }
        return hVar2;
    }

    /* renamed from: a */
    public e m5684a() {
        b bVar = this.f6586b;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f6592h) {
            if (this.f6592h.size() <= 0) {
                return null;
            }
            return this.f6592h.remove(0);
        }
    }

    /* renamed from: b */
    public boolean m5685b() {
        a aVar = this.f6588d;
        if (aVar != null) {
            aVar.cancel(this.f6589e);
        }
        this.f6590f = true;
        return m5688f();
    }

    /* renamed from: c */
    public void m5686c(boolean z10) {
        if (this.f6588d == null) {
            this.f6588d = new a(this);
            h hVar = this.f6587c;
            if (hVar != null && z10) {
                hVar.mo5694c();
            }
            this.f6588d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    public abstract void m5687e(Intent intent);

    /* renamed from: f */
    public boolean m5688f() {
        return true;
    }

    /* renamed from: g */
    public void m5689g() {
        ArrayList<d> arrayList = this.f6592h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f6588d = null;
                ArrayList<d> arrayList2 = this.f6592h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m5686c(false);
                } else if (!this.f6591g) {
                    this.f6587c.mo5693b();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f6586b;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6586b = new f(this);
            this.f6587c = null;
        } else {
            this.f6586b = null;
            this.f6587c = m5683d(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f6592h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f6591g = true;
                this.f6587c.mo5693b();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f6592h == null) {
            return 2;
        }
        this.f6587c.mo5695d();
        synchronized (this.f6592h) {
            ArrayList<d> arrayList = this.f6592h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(this, intent, i11));
            m5686c(true);
        }
        return 3;
    }
}
