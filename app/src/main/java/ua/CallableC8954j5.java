package ua;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j5.class
 */
/* renamed from: ua.j5 */
/* loaded from: combined.jar:classes2.jar:ua/j5.class */
public final class CallableC8954j5 implements Callable<List<C8852b>> {

    /* renamed from: a */
    public final C8959ja f41212a;

    /* renamed from: b */
    public final String f41213b;

    /* renamed from: c */
    public final String f41214c;

    /* renamed from: d */
    public final BinderC9097v5 f41215d;

    public CallableC8954j5(BinderC9097v5 binderC9097v5, C8959ja c8959ja, String str, String str2) {
        this.f41215d = binderC9097v5;
        this.f41212a = c8959ja;
        this.f41213b = str;
        this.f41214c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C8852b> call() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41215d.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41215d.f41698b;
        return c9123x92.m38363Z().m38069Y(this.f41212a.f41228d, this.f41213b, this.f41214c);
    }
}
