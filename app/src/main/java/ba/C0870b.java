package ba;

import ba.C0869a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p245oa.C6961h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ba/b.class
 */
/* renamed from: ba.b */
/* loaded from: combined.jar:classes2.jar:ba/b.class */
public final class C0870b implements C0869a.a {
    @Override // ba.C0869a.a
    /* renamed from: a */
    public final ScheduledExecutorService mo5436a() {
        C6961h.m31956a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
