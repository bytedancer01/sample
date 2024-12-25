package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4582k;
import p089f2.C4754d;
import p089f2.C4759i;
import p089f2.InterfaceC4752b;
import p237o2.C6879l;
import p237o2.C6883p;
import p237o2.ExecutorC6876i;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/d.class
 */
/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/d.class */
public class C0766d implements InterfaceC4752b {

    /* renamed from: l */
    public static final String f5237l = AbstractC4582k.m23128f("SystemAlarmDispatcher");

    /* renamed from: b */
    public final Context f5238b;

    /* renamed from: c */
    public final InterfaceC7748a f5239c;

    /* renamed from: d */
    public final C6883p f5240d;

    /* renamed from: e */
    public final C4754d f5241e;

    /* renamed from: f */
    public final C4759i f5242f;

    /* renamed from: g */
    public final C0763a f5243g;

    /* renamed from: h */
    public final Handler f5244h;

    /* renamed from: i */
    public final List<Intent> f5245i;

    /* renamed from: j */
    public Intent f5246j;

    /* renamed from: k */
    public c f5247k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/d$a.class
     */
    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0766d f5248b;

        public a(C0766d c0766d) {
            this.f5248b = c0766d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0766d c0766d;
            d dVar;
            synchronized (this.f5248b.f5245i) {
                C0766d c0766d2 = this.f5248b;
                c0766d2.f5246j = c0766d2.f5245i.get(0);
            }
            Intent intent = this.f5248b.f5246j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = this.f5248b.f5246j.getIntExtra("KEY_START_ID", 0);
                AbstractC4582k m23126c = AbstractC4582k.m23126c();
                String str = C0766d.f5237l;
                m23126c.mo23129a(str, String.format("Processing command %s, %s", this.f5248b.f5246j, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock m31719b = C6879l.m31719b(this.f5248b.f5238b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC4582k.m23126c().mo23129a(str, String.format("Acquiring operation wake lock (%s) %s", action, m31719b), new Throwable[0]);
                    m31719b.acquire();
                    C0766d c0766d3 = this.f5248b;
                    c0766d3.f5243g.m4939p(c0766d3.f5246j, intExtra, c0766d3);
                    AbstractC4582k.m23126c().mo23129a(str, String.format("Releasing operation wake lock (%s) %s", action, m31719b), new Throwable[0]);
                    m31719b.release();
                    c0766d = this.f5248b;
                    dVar = new d(c0766d);
                } catch (Throwable th2) {
                    try {
                        AbstractC4582k m23126c2 = AbstractC4582k.m23126c();
                        String str2 = C0766d.f5237l;
                        m23126c2.mo23130b(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC4582k.m23126c().mo23129a(str2, String.format("Releasing operation wake lock (%s) %s", action, m31719b), new Throwable[0]);
                        m31719b.release();
                        c0766d = this.f5248b;
                        dVar = new d(c0766d);
                    } catch (Throwable th3) {
                        AbstractC4582k.m23126c().mo23129a(C0766d.f5237l, String.format("Releasing operation wake lock (%s) %s", action, m31719b), new Throwable[0]);
                        m31719b.release();
                        C0766d c0766d4 = this.f5248b;
                        c0766d4.m4956k(new d(c0766d4));
                        throw th3;
                    }
                }
                c0766d.m4956k(dVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/d$b.class
     */
    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/d$b.class */
    public static class b implements Runnable {

        /* renamed from: b */
        public final C0766d f5249b;

        /* renamed from: c */
        public final Intent f5250c;

        /* renamed from: d */
        public final int f5251d;

        public b(C0766d c0766d, Intent intent, int i10) {
            this.f5249b = c0766d;
            this.f5250c = intent;
            this.f5251d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5249b.m4947a(this.f5250c, this.f5251d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/d$c.class
     */
    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/d$c.class */
    public interface c {
        /* renamed from: b */
        void mo4922b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/background/systemalarm/d$d.class
     */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/d$d.class */
    public static class d implements Runnable {

        /* renamed from: b */
        public final C0766d f5252b;

        public d(C0766d c0766d) {
            this.f5252b = c0766d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5252b.m4949c();
        }
    }

    public C0766d(Context context) {
        this(context, null, null);
    }

    public C0766d(Context context, C4754d c4754d, C4759i c4759i) {
        Context applicationContext = context.getApplicationContext();
        this.f5238b = applicationContext;
        this.f5243g = new C0763a(applicationContext);
        this.f5240d = new C6883p();
        c4759i = c4759i == null ? C4759i.m24111m(context) : c4759i;
        this.f5242f = c4759i;
        c4754d = c4754d == null ? c4759i.m24117o() : c4754d;
        this.f5241e = c4754d;
        this.f5239c = c4759i.m24120r();
        c4754d.m24074c(this);
        this.f5245i = new ArrayList();
        this.f5246j = null;
        this.f5244h = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean m4947a(Intent intent, int i10) {
        AbstractC4582k m23126c = AbstractC4582k.m23126c();
        String str = f5237l;
        m23126c.mo23129a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        m4948b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC4582k.m23126c().mo23133h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4954i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f5245i) {
            boolean z10 = false;
            if (!this.f5245i.isEmpty()) {
                z10 = true;
            }
            this.f5245i.add(intent);
            if (!z10) {
                m4957l();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m4948b() {
        if (this.f5244h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    public void m4949c() {
        AbstractC4582k m23126c = AbstractC4582k.m23126c();
        String str = f5237l;
        m23126c.mo23129a(str, "Checking if commands are complete.", new Throwable[0]);
        m4948b();
        synchronized (this.f5245i) {
            if (this.f5246j != null) {
                AbstractC4582k.m23126c().mo23129a(str, String.format("Removing command %s", this.f5246j), new Throwable[0]);
                if (!this.f5245i.remove(0).equals(this.f5246j)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f5246j = null;
            }
            ExecutorC6876i mo33903c = this.f5239c.mo33903c();
            if (!this.f5243g.m4938o() && this.f5245i.isEmpty() && !mo33903c.m31716a()) {
                AbstractC4582k.m23126c().mo23129a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f5247k;
                if (cVar != null) {
                    cVar.mo4922b();
                }
            } else if (!this.f5245i.isEmpty()) {
                m4957l();
            }
        }
    }

    /* renamed from: d */
    public C4754d m4950d() {
        return this.f5241e;
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        m4956k(new b(this, C0763a.m4926c(this.f5238b, str, z10), 0));
    }

    /* renamed from: f */
    public InterfaceC7748a m4951f() {
        return this.f5239c;
    }

    /* renamed from: g */
    public C4759i m4952g() {
        return this.f5242f;
    }

    /* renamed from: h */
    public C6883p m4953h() {
        return this.f5240d;
    }

    /* renamed from: i */
    public final boolean m4954i(String str) {
        m4948b();
        synchronized (this.f5245i) {
            Iterator<Intent> it = this.f5245i.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void m4955j() {
        AbstractC4582k.m23126c().mo23129a(f5237l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5241e.m24078i(this);
        this.f5240d.m31721a();
        this.f5247k = null;
    }

    /* renamed from: k */
    public void m4956k(Runnable runnable) {
        this.f5244h.post(runnable);
    }

    /* renamed from: l */
    public final void m4957l() {
        m4948b();
        PowerManager.WakeLock m31719b = C6879l.m31719b(this.f5238b, "ProcessCommand");
        try {
            m31719b.acquire();
            this.f5242f.m24120r().mo33902b(new a(this));
        } finally {
            m31719b.release();
        }
    }

    /* renamed from: m */
    public void m4958m(c cVar) {
        if (this.f5247k != null) {
            AbstractC4582k.m23126c().mo23130b(f5237l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f5247k = cVar;
        }
    }
}
