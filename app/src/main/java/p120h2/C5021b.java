package p120h2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C0763a;
import p071e2.AbstractC4582k;
import p089f2.InterfaceC4755e;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h2/b.class
 */
/* renamed from: h2.b */
/* loaded from: combined.jar:classes1.jar:h2/b.class */
public class C5021b implements InterfaceC4755e {

    /* renamed from: c */
    public static final String f29064c = AbstractC4582k.m23128f("SystemAlarmScheduler");

    /* renamed from: b */
    public final Context f29065b;

    public C5021b(Context context) {
        this.f29065b = context.getApplicationContext();
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: a */
    public void mo24085a(C6636p... c6636pArr) {
        for (C6636p c6636p : c6636pArr) {
            m25227b(c6636p);
        }
    }

    /* renamed from: b */
    public final void m25227b(C6636p c6636p) {
        AbstractC4582k.m23126c().mo23129a(f29064c, String.format("Scheduling work with workSpecId %s", c6636p.f34573a), new Throwable[0]);
        this.f29065b.startService(C0763a.m4928f(this.f29065b, c6636p.f34573a));
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: c */
    public void mo24086c(String str) {
        this.f29065b.startService(C0763a.m4929g(this.f29065b, str));
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: d */
    public boolean mo24087d() {
        return true;
    }
}
