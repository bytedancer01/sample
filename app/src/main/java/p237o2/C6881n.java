package p237o2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0770a;
import java.util.UUID;
import lc.InterfaceFutureC5838a;
import p071e2.AbstractC4582k;
import p071e2.C4576e;
import p071e2.C4591t;
import p071e2.InterfaceC4577f;
import p209m2.InterfaceC5918a;
import p223n2.InterfaceC6637q;
import p263p2.C7546c;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/n.class
 */
/* renamed from: o2.n */
/* loaded from: combined.jar:classes1.jar:o2/n.class */
public class C6881n implements InterfaceC4577f {

    /* renamed from: d */
    public static final String f35661d = AbstractC4582k.m23128f("WMFgUpdater");

    /* renamed from: a */
    public final InterfaceC7748a f35662a;

    /* renamed from: b */
    public final InterfaceC5918a f35663b;

    /* renamed from: c */
    public final InterfaceC6637q f35664c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/n$a.class
     */
    /* renamed from: o2.n$a */
    /* loaded from: combined.jar:classes1.jar:o2/n$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C7546c f35665b;

        /* renamed from: c */
        public final UUID f35666c;

        /* renamed from: d */
        public final C4576e f35667d;

        /* renamed from: e */
        public final Context f35668e;

        /* renamed from: f */
        public final C6881n f35669f;

        public a(C6881n c6881n, C7546c c7546c, UUID uuid, C4576e c4576e, Context context) {
            this.f35669f = c6881n;
            this.f35665b = c7546c;
            this.f35666c = uuid;
            this.f35667d = c4576e;
            this.f35668e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f35665b.isCancelled()) {
                    String uuid = this.f35666c.toString();
                    C4591t.a mo30598f = this.f35669f.f35664c.mo30598f(uuid);
                    if (mo30598f == null || mo30598f.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    this.f35669f.f35663b.mo24073b(uuid, this.f35667d);
                    this.f35668e.startService(C0770a.m4964a(this.f35668e, uuid, this.f35667d));
                }
                this.f35665b.mo32291p(null);
            } catch (Throwable th2) {
                this.f35665b.mo32292q(th2);
            }
        }
    }

    public C6881n(WorkDatabase workDatabase, InterfaceC5918a interfaceC5918a, InterfaceC7748a interfaceC7748a) {
        this.f35663b = interfaceC5918a;
        this.f35662a = interfaceC7748a;
        this.f35664c = workDatabase.mo4891B();
    }

    @Override // p071e2.InterfaceC4577f
    /* renamed from: a */
    public InterfaceFutureC5838a<Void> mo23116a(Context context, UUID uuid, C4576e c4576e) {
        C7546c m32302t = C7546c.m32302t();
        this.f35662a.mo33902b(new a(this, m32302t, uuid, c4576e, context));
        return m32302t;
    }
}
