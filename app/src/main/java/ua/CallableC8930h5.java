package ua;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h5.class
 */
/* renamed from: ua.h5 */
/* loaded from: combined.jar:classes2.jar:ua/h5.class */
public final class CallableC8930h5 implements Callable<List<C8875ca>> {

    /* renamed from: a */
    public final C8959ja f41153a;

    /* renamed from: b */
    public final String f41154b;

    /* renamed from: c */
    public final String f41155c;

    /* renamed from: d */
    public final BinderC9097v5 f41156d;

    public CallableC8930h5(BinderC9097v5 binderC9097v5, C8959ja c8959ja, String str, String str2) {
        this.f41156d = binderC9097v5;
        this.f41153a = c8959ja;
        this.f41154b = str;
        this.f41155c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C8875ca> call() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41156d.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41156d.f41698b;
        return c9123x92.m38363Z().m38065U(this.f41153a.f41228d, this.f41154b, this.f41155c);
    }
}
