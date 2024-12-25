package ua;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k5.class
 */
/* renamed from: ua.k5 */
/* loaded from: combined.jar:classes2.jar:ua/k5.class */
public final class CallableC8966k5 implements Callable<List<C8852b>> {

    /* renamed from: a */
    public final String f41258a;

    /* renamed from: b */
    public final String f41259b;

    /* renamed from: c */
    public final String f41260c;

    /* renamed from: d */
    public final BinderC9097v5 f41261d;

    public CallableC8966k5(BinderC9097v5 binderC9097v5, String str, String str2, String str3) {
        this.f41261d = binderC9097v5;
        this.f41258a = str;
        this.f41259b = str2;
        this.f41260c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C8852b> call() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41261d.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41261d.f41698b;
        return c9123x92.m38363Z().m38069Y(this.f41258a, this.f41259b, this.f41260c);
    }
}
