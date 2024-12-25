package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0756a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p071e2.AbstractC4582k;
import p071e2.C4591t;
import p071e2.InterfaceC4578g;
import p089f2.C4756f;
import p089f2.C4758h;
import p089f2.C4759i;
import p140i2.C5164k;
import p175k0.C5440a;
import p223n2.C6636p;
import p223n2.InterfaceC6634n;
import p223n2.InterfaceC6637q;
import p237o2.C6875h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/utils/ForceStopRunnable.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/utils/ForceStopRunnable.class */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final String f5286e = AbstractC4582k.m23128f("ForceStopRunnable");

    /* renamed from: f */
    public static final long f5287f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    public final Context f5288b;

    /* renamed from: c */
    public final C4759i f5289c;

    /* renamed from: d */
    public int f5290d = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver.class */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f5291a = AbstractC4582k.m23128f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC4582k.m23126c().mo23132g(f5291a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m4976g(context);
        }
    }

    public ForceStopRunnable(Context context, C4759i c4759i) {
        this.f5288b = context.getApplicationContext();
        this.f5289c = c4759i;
    }

    /* renamed from: c */
    public static Intent m4974c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m4975d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, m4974c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static void m4976g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent m4975d = m4975d(context, C5440a.m27189c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = f5287f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + j10, m4975d);
        }
    }

    /* renamed from: a */
    public boolean m4977a() {
        boolean m25809i = Build.VERSION.SDK_INT >= 23 ? C5164k.m25809i(this.f5288b, this.f5289c) : false;
        WorkDatabase m24119q = this.f5289c.m24119q();
        InterfaceC6637q mo4891B = m24119q.mo4891B();
        InterfaceC6634n mo4890A = m24119q.mo4890A();
        m24119q.m36898c();
        try {
            List<C6636p> mo30609q = mo4891B.mo30609q();
            boolean z10 = (mo30609q == null || mo30609q.isEmpty()) ? false : true;
            if (z10) {
                for (C6636p c6636p : mo30609q) {
                    mo4891B.mo30604l(C4591t.a.ENQUEUED, c6636p.f34573a);
                    mo4891B.mo30605m(c6636p.f34573a, -1L);
                }
            }
            mo4890A.mo30585b();
            m24119q.m36910r();
            m24119q.m36900g();
            return z10 || m25809i;
        } catch (Throwable th2) {
            m24119q.m36900g();
            throw th2;
        }
    }

    /* renamed from: b */
    public void m4978b() {
        boolean m4977a = m4977a();
        if (m4981h()) {
            AbstractC4582k.m23126c().mo23129a(f5286e, "Rescheduling Workers.", new Throwable[0]);
            this.f5289c.m24123u();
            this.f5289c.m24116n().m31712c(false);
        } else if (m4979e()) {
            AbstractC4582k.m23126c().mo23129a(f5286e, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f5289c.m24123u();
        } else if (m4977a) {
            AbstractC4582k.m23126c().mo23129a(f5286e, "Found unfinished work, scheduling it.", new Throwable[0]);
            C4756f.m24089b(this.f5289c.m24115k(), this.f5289c.m24119q(), this.f5289c.m24118p());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean m4979e() {
        List historicalProcessExitReasons;
        try {
            PendingIntent m4975d = m4975d(this.f5288b, C5440a.m27189c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT < 30) {
                if (m4975d != null) {
                    return false;
                }
                m4976g(this.f5288b);
                return true;
            }
            if (m4975d != null) {
                m4975d.cancel();
            }
            historicalProcessExitReasons = ((ActivityManager) this.f5288b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                return false;
            }
            for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                if (((ApplicationExitInfo) historicalProcessExitReasons.get(i10)).getReason() == 10) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC4582k.m23126c().mo23133h(f5286e, "Ignoring exception", e10);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m4980f() {
        C0756a m24115k = this.f5289c.m24115k();
        if (TextUtils.isEmpty(m24115k.m4851c())) {
            AbstractC4582k.m23126c().mo23129a(f5286e, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean m31715b = C6875h.m31715b(this.f5288b, m24115k);
        AbstractC4582k.m23126c().mo23129a(f5286e, String.format("Is default app process = %s", Boolean.valueOf(m31715b)), new Throwable[0]);
        return m31715b;
    }

    /* renamed from: h */
    public boolean m4981h() {
        return this.f5289c.m24116n().m31711a();
    }

    /* renamed from: i */
    public void m4982i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException e10) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (m4980f()) {
                while (true) {
                    C4758h.m24107e(this.f5288b);
                    AbstractC4582k.m23126c().mo23129a(f5286e, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        m4978b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f5290d + 1;
                        this.f5290d = i10;
                        if (i10 >= 3) {
                            AbstractC4582k m23126c = AbstractC4582k.m23126c();
                            String str = f5286e;
                            m23126c.mo23130b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            InterfaceC4578g m4852d = this.f5289c.m24115k().m4852d();
                            if (m4852d == null) {
                                throw illegalStateException;
                            }
                            AbstractC4582k.m23126c().mo23129a(str, "Routing exception to the specified exception handler", illegalStateException);
                            m4852d.m23117a(illegalStateException);
                        } else {
                            AbstractC4582k.m23126c().mo23129a(f5286e, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                            m4982i(this.f5290d * 300);
                        }
                    }
                    AbstractC4582k.m23126c().mo23129a(f5286e, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    m4982i(this.f5290d * 300);
                }
            }
        } finally {
            this.f5289c.m24122t();
        }
    }
}
