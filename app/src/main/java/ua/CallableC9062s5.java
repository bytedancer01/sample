package ua;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/s5.class
 */
/* renamed from: ua.s5 */
/* loaded from: combined.jar:classes2.jar:ua/s5.class */
public final class CallableC9062s5 implements Callable<List<C8875ca>> {

    /* renamed from: a */
    public final C8959ja f41611a;

    /* renamed from: b */
    public final BinderC9097v5 f41612b;

    public CallableC9062s5(BinderC9097v5 binderC9097v5, C8959ja c8959ja) {
        this.f41612b = binderC9097v5;
        this.f41611a = c8959ja;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C8875ca> call() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41612b.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41612b.f41698b;
        return c9123x92.m38363Z().m38064T(this.f41611a.f41228d);
    }
}
