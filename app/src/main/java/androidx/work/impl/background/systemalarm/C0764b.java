package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C0766d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4582k;
import p158j2.C5282d;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/b.class
 */
/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/b.class */
public class C0764b {

    /* renamed from: e */
    public static final String f5222e = AbstractC4582k.m23128f("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f5223a;

    /* renamed from: b */
    public final int f5224b;

    /* renamed from: c */
    public final C0766d f5225c;

    /* renamed from: d */
    public final C5282d f5226d;

    public C0764b(Context context, int i10, C0766d c0766d) {
        this.f5223a = context;
        this.f5224b = i10;
        this.f5225c = c0766d;
        this.f5226d = new C5282d(context, c0766d.m4951f(), null);
    }

    /* renamed from: a */
    public void m4940a() {
        List<C6636p> mo30595c = this.f5225c.m4952g().m24119q().mo4891B().mo30595c();
        ConstraintProxy.m4920a(this.f5223a, mo30595c);
        this.f5226d.m26369d(mo30595c);
        ArrayList arrayList = new ArrayList(mo30595c.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C6636p c6636p : mo30595c) {
            String str = c6636p.f34573a;
            if (currentTimeMillis >= c6636p.m30587a() && (!c6636p.m30588b() || this.f5226d.m26368c(str))) {
                arrayList.add(c6636p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C6636p) it.next()).f34573a;
            Intent m4925b = C0763a.m4925b(this.f5223a, str2);
            AbstractC4582k.m23126c().mo23129a(f5222e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C0766d c0766d = this.f5225c;
            c0766d.m4956k(new C0766d.b(c0766d, m4925b, this.f5224b));
        }
        this.f5226d.m26370e();
    }
}
