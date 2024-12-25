package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.C0761a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p089f2.C4758h;
import p223n2.InterfaceC6622b;
import p223n2.InterfaceC6625e;
import p223n2.InterfaceC6628h;
import p223n2.InterfaceC6631k;
import p223n2.InterfaceC6634n;
import p223n2.InterfaceC6637q;
import p223n2.InterfaceC6640t;
import p327t1.AbstractC8597e;
import p327t1.C8596d;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;
import p394x1.C9619c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/WorkDatabase.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/WorkDatabase.class */
public abstract class WorkDatabase extends AbstractC8597e {

    /* renamed from: l */
    public static final long f5189l = TimeUnit.DAYS.toMillis(1);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/WorkDatabase$a.class
     */
    /* renamed from: androidx.work.impl.WorkDatabase$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/WorkDatabase$a.class */
    public class C0758a implements InterfaceC9398c.c {

        /* renamed from: a */
        public final Context f5190a;

        public C0758a(Context context) {
            this.f5190a = context;
        }

        @Override // p375w1.InterfaceC9398c.c
        /* renamed from: a */
        public InterfaceC9398c mo4897a(InterfaceC9398c.b bVar) {
            InterfaceC9398c.b.a m39724a = InterfaceC9398c.b.m39724a(this.f5190a);
            m39724a.m39727c(bVar.f43094b).m39726b(bVar.f43095c).m39728d(true);
            return new C9619c().mo4897a(m39724a.m39725a());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/WorkDatabase$b.class
     */
    /* renamed from: androidx.work.impl.WorkDatabase$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/WorkDatabase$b.class */
    public class C0759b extends AbstractC8597e.b {
        @Override // p327t1.AbstractC8597e.b
        /* renamed from: c */
        public void mo4898c(InterfaceC9397b interfaceC9397b) {
            super.mo4898c(interfaceC9397b);
            interfaceC9397b.mo39711A();
            try {
                interfaceC9397b.mo39713F(WorkDatabase.m4889w());
                interfaceC9397b.mo39714O();
            } finally {
                interfaceC9397b.mo39717S();
            }
        }
    }

    /* renamed from: s */
    public static WorkDatabase m4886s(Context context, Executor executor, boolean z10) {
        AbstractC8597e.a m36892a;
        if (z10) {
            m36892a = C8596d.m36894c(context, WorkDatabase.class).m36913c();
        } else {
            m36892a = C8596d.m36892a(context, WorkDatabase.class, C4758h.m24106d());
            m36892a.m36916f(new C0758a(context));
        }
        return (WorkDatabase) m36892a.m36917g(executor).m36911a(m4887u()).m36912b(C0761a.f5199a).m36912b(new C0761a.h(context, 2, 3)).m36912b(C0761a.f5200b).m36912b(C0761a.f5201c).m36912b(new C0761a.h(context, 5, 6)).m36912b(C0761a.f5202d).m36912b(C0761a.f5203e).m36912b(C0761a.f5204f).m36912b(new C0761a.i(context)).m36912b(new C0761a.h(context, 10, 11)).m36912b(C0761a.f5205g).m36915e().m36914d();
    }

    /* renamed from: u */
    public static AbstractC8597e.b m4887u() {
        return new C0759b();
    }

    /* renamed from: v */
    public static long m4888v() {
        return System.currentTimeMillis() - f5189l;
    }

    /* renamed from: w */
    public static String m4889w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m4888v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: A */
    public abstract InterfaceC6634n mo4890A();

    /* renamed from: B */
    public abstract InterfaceC6637q mo4891B();

    /* renamed from: C */
    public abstract InterfaceC6640t mo4892C();

    /* renamed from: t */
    public abstract InterfaceC6622b mo4893t();

    /* renamed from: x */
    public abstract InterfaceC6625e mo4894x();

    /* renamed from: y */
    public abstract InterfaceC6628h mo4895y();

    /* renamed from: z */
    public abstract InterfaceC6631k mo4896z();
}
