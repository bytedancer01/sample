package ua;

import java.util.concurrent.Callable;
import p305ra.C8175ha;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t9.class
 */
/* renamed from: ua.t9 */
/* loaded from: combined.jar:classes2.jar:ua/t9.class */
public final class CallableC9078t9 implements Callable<String> {

    /* renamed from: a */
    public final C8959ja f41649a;

    /* renamed from: b */
    public final C9123x9 f41650b;

    public CallableC9078t9(C9123x9 c9123x9, C8959ja c8959ja) {
        this.f41650b = c9123x9;
        this.f41649a = c8959ja;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        C8175ha.m35418a();
        String str = null;
        if (!this.f41650b.m38360W().m37900w(null, C8988m3.f41327I0) || (this.f41650b.m38384m0(this.f41649a.f41228d).m37967h() && C8912g.m37956c(this.f41649a.f41249y).m37967h())) {
            str = this.f41650b.m38346C(this.f41649a).m37985O();
        } else {
            this.f41650b.mo37780c().m38416w().m38326a("Analytics storage consent denied. Returning null app instance id");
        }
        return str;
    }
}
