package p089f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C0756a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p071e2.AbstractC4582k;
import p071e2.AbstractC4592u;
import p071e2.AbstractC4593v;
import p071e2.C4584m;
import p071e2.C4588q;
import p071e2.EnumC4575d;
import p071e2.InterfaceC4585n;
import p108g2.C4934b;
import p140i2.C5164k;
import p237o2.AbstractRunnableC6868a;
import p237o2.C6873f;
import p237o2.RunnableC6877j;
import p237o2.RunnableC6878k;
import p278q2.C7749b;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/i.class
 */
/* renamed from: f2.i */
/* loaded from: combined.jar:classes1.jar:f2/i.class */
public class C4759i extends AbstractC4592u {

    /* renamed from: j */
    public static final String f28042j = AbstractC4582k.m23128f("WorkManagerImpl");

    /* renamed from: k */
    public static C4759i f28043k = null;

    /* renamed from: l */
    public static C4759i f28044l = null;

    /* renamed from: m */
    public static final Object f28045m = new Object();

    /* renamed from: a */
    public Context f28046a;

    /* renamed from: b */
    public C0756a f28047b;

    /* renamed from: c */
    public WorkDatabase f28048c;

    /* renamed from: d */
    public InterfaceC7748a f28049d;

    /* renamed from: e */
    public List<InterfaceC4755e> f28050e;

    /* renamed from: f */
    public C4754d f28051f;

    /* renamed from: g */
    public C6873f f28052g;

    /* renamed from: h */
    public boolean f28053h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f28054i;

    public C4759i(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a) {
        this(context, c0756a, interfaceC7748a, context.getResources().getBoolean(C4588q.f27228a));
    }

    public C4759i(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC4582k.m23127e(new AbstractC4582k.a(c0756a.m4858j()));
        List<InterfaceC4755e> m24113i = m24113i(applicationContext, c0756a, interfaceC7748a);
        m24121s(context, c0756a, interfaceC7748a, workDatabase, m24113i, new C4754d(context, c0756a, interfaceC7748a, workDatabase, m24113i));
    }

    public C4759i(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, boolean z10) {
        this(context, c0756a, interfaceC7748a, WorkDatabase.m4886s(context.getApplicationContext(), interfaceC7748a.mo33903c(), z10));
    }

    /* renamed from: g */
    public static void m24109g(Context context, C0756a c0756a) {
        synchronized (f28045m) {
            C4759i c4759i = f28043k;
            if (c4759i != null && f28044l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (c4759i == null) {
                Context applicationContext = context.getApplicationContext();
                if (f28044l == null) {
                    f28044l = new C4759i(applicationContext, c0756a, new C7749b(c0756a.m4860l()));
                }
                f28043k = f28044l;
            }
        }
    }

    @Deprecated
    /* renamed from: l */
    public static C4759i m24110l() {
        synchronized (f28045m) {
            C4759i c4759i = f28043k;
            if (c4759i != null) {
                return c4759i;
            }
            return f28044l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static C4759i m24111m(Context context) {
        C4759i c4759i;
        synchronized (f28045m) {
            C4759i m24110l = m24110l();
            c4759i = m24110l;
            if (m24110l == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C0756a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m24109g(applicationContext, ((C0756a.c) applicationContext).m4863a());
                c4759i = m24111m(applicationContext);
            }
        }
        return c4759i;
    }

    @Override // p071e2.AbstractC4592u
    /* renamed from: a */
    public InterfaceC4585n mo23144a(String str) {
        AbstractRunnableC6868a m31689d = AbstractRunnableC6868a.m31689d(str, this);
        this.f28049d.mo33902b(m31689d);
        return m31689d.m31691e();
    }

    @Override // p071e2.AbstractC4592u
    /* renamed from: c */
    public InterfaceC4585n mo23146c(List<? extends AbstractC4593v> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C4757g(this, list).m24093a();
    }

    @Override // p071e2.AbstractC4592u
    /* renamed from: e */
    public InterfaceC4585n mo23148e(String str, EnumC4575d enumC4575d, List<C4584m> list) {
        return new C4757g(this, str, enumC4575d, list).m24093a();
    }

    /* renamed from: h */
    public InterfaceC4585n m24112h(UUID uuid) {
        AbstractRunnableC6868a m31687b = AbstractRunnableC6868a.m31687b(uuid, this);
        this.f28049d.mo33902b(m31687b);
        return m31687b.m31691e();
    }

    /* renamed from: i */
    public List<InterfaceC4755e> m24113i(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a) {
        return Arrays.asList(C4756f.m24088a(context, this), new C4934b(context, c0756a, interfaceC7748a, this));
    }

    /* renamed from: j */
    public Context m24114j() {
        return this.f28046a;
    }

    /* renamed from: k */
    public C0756a m24115k() {
        return this.f28047b;
    }

    /* renamed from: n */
    public C6873f m24116n() {
        return this.f28052g;
    }

    /* renamed from: o */
    public C4754d m24117o() {
        return this.f28051f;
    }

    /* renamed from: p */
    public List<InterfaceC4755e> m24118p() {
        return this.f28050e;
    }

    /* renamed from: q */
    public WorkDatabase m24119q() {
        return this.f28048c;
    }

    /* renamed from: r */
    public InterfaceC7748a m24120r() {
        return this.f28049d;
    }

    /* renamed from: s */
    public final void m24121s(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, WorkDatabase workDatabase, List<InterfaceC4755e> list, C4754d c4754d) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        this.f28046a = applicationContext;
        this.f28047b = c0756a;
        this.f28049d = interfaceC7748a;
        this.f28048c = workDatabase;
        this.f28050e = list;
        this.f28051f = c4754d;
        this.f28052g = new C6873f(workDatabase);
        this.f28053h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        this.f28049d.mo33902b(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: t */
    public void m24122t() {
        synchronized (f28045m) {
            this.f28053h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f28054i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f28054i = null;
            }
        }
    }

    /* renamed from: u */
    public void m24123u() {
        if (Build.VERSION.SDK_INT >= 23) {
            C5164k.m25804b(m24114j());
        }
        m24119q().mo4891B().mo30603k();
        C4756f.m24089b(m24115k(), m24119q(), m24118p());
    }

    /* renamed from: v */
    public void m24124v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f28045m) {
            this.f28054i = pendingResult;
            if (this.f28053h) {
                pendingResult.finish();
                this.f28054i = null;
            }
        }
    }

    /* renamed from: w */
    public void m24125w(String str) {
        m24126x(str, null);
    }

    /* renamed from: x */
    public void m24126x(String str, WorkerParameters.C0755a c0755a) {
        this.f28049d.mo33902b(new RunnableC6877j(this, str, c0755a));
    }

    /* renamed from: y */
    public void m24127y(String str) {
        this.f28049d.mo33902b(new RunnableC6878k(this, str, true));
    }

    /* renamed from: z */
    public void m24128z(String str) {
        this.f28049d.mo33902b(new RunnableC6878k(this, str, false));
    }
}
