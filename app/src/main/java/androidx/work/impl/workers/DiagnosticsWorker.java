package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p071e2.AbstractC4582k;
import p089f2.C4759i;
import p223n2.C6627g;
import p223n2.C6636p;
import p223n2.InterfaceC6628h;
import p223n2.InterfaceC6631k;
import p223n2.InterfaceC6637q;
import p223n2.InterfaceC6640t;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/workers/DiagnosticsWorker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/workers/DiagnosticsWorker.class */
public class DiagnosticsWorker extends Worker {

    /* renamed from: h */
    public static final String f5301h = AbstractC4582k.m23128f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: s */
    public static String m4987s(C6636p c6636p, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c6636p.f34573a, c6636p.f34575c, num, c6636p.f34574b.name(), str, str2);
    }

    /* renamed from: t */
    public static String m4988t(InterfaceC6631k interfaceC6631k, InterfaceC6640t interfaceC6640t, InterfaceC6628h interfaceC6628h, List<C6636p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (C6636p c6636p : list) {
            Integer num = null;
            C6627g mo30577b = interfaceC6628h.mo30577b(c6636p.f34573a);
            if (mo30577b != null) {
                num = Integer.valueOf(mo30577b.f34551b);
            }
            sb2.append(m4987s(c6636p, TextUtils.join(",", interfaceC6631k.mo30582b(c6636p.f34573a)), num, TextUtils.join(",", interfaceC6640t.mo30616b(c6636p.f34573a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    /* renamed from: r */
    public ListenableWorker.AbstractC0753a mo4842r() {
        WorkDatabase m24119q = C4759i.m24111m(m4821a()).m24119q();
        InterfaceC6637q mo4891B = m24119q.mo4891B();
        InterfaceC6631k mo4896z = m24119q.mo4896z();
        InterfaceC6640t mo4892C = m24119q.mo4892C();
        InterfaceC6628h mo4895y = m24119q.mo4895y();
        List<C6636p> mo30594b = mo4891B.mo30594b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<C6636p> mo30609q = mo4891B.mo30609q();
        List<C6636p> mo30602j = mo4891B.mo30602j(200);
        if (mo30594b != null && !mo30594b.isEmpty()) {
            AbstractC4582k m23126c = AbstractC4582k.m23126c();
            String str = f5301h;
            m23126c.mo23131d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC4582k.m23126c().mo23131d(str, m4988t(mo4896z, mo4892C, mo4895y, mo30594b), new Throwable[0]);
        }
        if (mo30609q != null && !mo30609q.isEmpty()) {
            AbstractC4582k m23126c2 = AbstractC4582k.m23126c();
            String str2 = f5301h;
            m23126c2.mo23131d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC4582k.m23126c().mo23131d(str2, m4988t(mo4896z, mo4892C, mo4895y, mo30609q), new Throwable[0]);
        }
        if (mo30602j != null && !mo30602j.isEmpty()) {
            AbstractC4582k m23126c3 = AbstractC4582k.m23126c();
            String str3 = f5301h;
            m23126c3.mo23131d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC4582k.m23126c().mo23131d(str3, m4988t(mo4896z, mo4892C, mo4895y, mo30602j), new Throwable[0]);
        }
        return ListenableWorker.AbstractC0753a.m4835c();
    }
}
