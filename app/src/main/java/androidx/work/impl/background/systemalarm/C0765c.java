package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C0766d;
import java.util.Collections;
import java.util.List;
import p071e2.AbstractC4582k;
import p089f2.InterfaceC4752b;
import p158j2.C5282d;
import p158j2.InterfaceC5281c;
import p223n2.C6636p;
import p237o2.C6879l;
import p237o2.C6883p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/c.class
 */
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/c.class */
public class C0765c implements InterfaceC5281c, InterfaceC4752b, C6883p.b {

    /* renamed from: k */
    public static final String f5227k = AbstractC4582k.m23128f("DelayMetCommandHandler");

    /* renamed from: b */
    public final Context f5228b;

    /* renamed from: c */
    public final int f5229c;

    /* renamed from: d */
    public final String f5230d;

    /* renamed from: e */
    public final C0766d f5231e;

    /* renamed from: f */
    public final C5282d f5232f;

    /* renamed from: i */
    public PowerManager.WakeLock f5235i;

    /* renamed from: j */
    public boolean f5236j = false;

    /* renamed from: h */
    public int f5234h = 0;

    /* renamed from: g */
    public final Object f5233g = new Object();

    public C0765c(Context context, int i10, String str, C0766d c0766d) {
        this.f5228b = context;
        this.f5229c = i10;
        this.f5231e = c0766d;
        this.f5230d = str;
        this.f5232f = new C5282d(context, c0766d.m4951f(), this);
    }

    @Override // p237o2.C6883p.b
    /* renamed from: a */
    public void mo4941a(String str) {
        AbstractC4582k.m23126c().mo23129a(f5227k, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m4946g();
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: b */
    public void mo4942b(List<String> list) {
        m4946g();
    }

    /* renamed from: c */
    public final void m4943c() {
        synchronized (this.f5233g) {
            this.f5232f.m26370e();
            this.f5231e.m4953h().m31723c(this.f5230d);
            PowerManager.WakeLock wakeLock = this.f5235i;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC4582k.m23126c().mo23129a(f5227k, String.format("Releasing wakelock %s for WorkSpec %s", this.f5235i, this.f5230d), new Throwable[0]);
                this.f5235i.release();
            }
        }
    }

    /* renamed from: d */
    public void m4944d() {
        this.f5235i = C6879l.m31719b(this.f5228b, String.format("%s (%s)", this.f5230d, Integer.valueOf(this.f5229c)));
        AbstractC4582k m23126c = AbstractC4582k.m23126c();
        String str = f5227k;
        m23126c.mo23129a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f5235i, this.f5230d), new Throwable[0]);
        this.f5235i.acquire();
        C6636p mo30599g = this.f5231e.m4952g().m24119q().mo4891B().mo30599g(this.f5230d);
        if (mo30599g == null) {
            m4946g();
            return;
        }
        boolean m30588b = mo30599g.m30588b();
        this.f5236j = m30588b;
        if (m30588b) {
            this.f5232f.m26369d(Collections.singletonList(mo30599g));
        } else {
            AbstractC4582k.m23126c().mo23129a(str, String.format("No constraints for %s", this.f5230d), new Throwable[0]);
            mo4945f(Collections.singletonList(this.f5230d));
        }
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        AbstractC4582k.m23126c().mo23129a(f5227k, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        m4943c();
        if (z10) {
            Intent m4928f = C0763a.m4928f(this.f5228b, this.f5230d);
            C0766d c0766d = this.f5231e;
            c0766d.m4956k(new C0766d.b(c0766d, m4928f, this.f5229c));
        }
        if (this.f5236j) {
            Intent m4924a = C0763a.m4924a(this.f5228b);
            C0766d c0766d2 = this.f5231e;
            c0766d2.m4956k(new C0766d.b(c0766d2, m4924a, this.f5229c));
        }
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: f */
    public void mo4945f(List<String> list) {
        if (list.contains(this.f5230d)) {
            synchronized (this.f5233g) {
                if (this.f5234h == 0) {
                    this.f5234h = 1;
                    AbstractC4582k.m23126c().mo23129a(f5227k, String.format("onAllConstraintsMet for %s", this.f5230d), new Throwable[0]);
                    if (this.f5231e.m4950d().m24079j(this.f5230d)) {
                        this.f5231e.m4953h().m31722b(this.f5230d, 600000L, this);
                    } else {
                        m4943c();
                    }
                } else {
                    AbstractC4582k.m23126c().mo23129a(f5227k, String.format("Already started work for %s", this.f5230d), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m4946g() {
        synchronized (this.f5233g) {
            if (this.f5234h < 2) {
                this.f5234h = 2;
                AbstractC4582k m23126c = AbstractC4582k.m23126c();
                String str = f5227k;
                m23126c.mo23129a(str, String.format("Stopping work for WorkSpec %s", this.f5230d), new Throwable[0]);
                Intent m4929g = C0763a.m4929g(this.f5228b, this.f5230d);
                C0766d c0766d = this.f5231e;
                c0766d.m4956k(new C0766d.b(c0766d, m4929g, this.f5229c));
                if (this.f5231e.m4950d().m24076g(this.f5230d)) {
                    AbstractC4582k.m23126c().mo23129a(str, String.format("WorkSpec %s needs to be rescheduled", this.f5230d), new Throwable[0]);
                    Intent m4928f = C0763a.m4928f(this.f5228b, this.f5230d);
                    C0766d c0766d2 = this.f5231e;
                    c0766d2.m4956k(new C0766d.b(c0766d2, m4928f, this.f5229c));
                } else {
                    AbstractC4582k.m23126c().mo23129a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f5230d), new Throwable[0]);
                }
            } else {
                AbstractC4582k.m23126c().mo23129a(f5227k, String.format("Already stopped work for %s", this.f5230d), new Throwable[0]);
            }
        }
    }
}
