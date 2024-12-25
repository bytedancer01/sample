package ua;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/i5.class
 */
/* renamed from: ua.i5 */
/* loaded from: combined.jar:classes2.jar:ua/i5.class */
public final class CallableC8942i5 implements Callable<List<C8875ca>> {

    /* renamed from: a */
    public final String f41178a;

    /* renamed from: b */
    public final String f41179b;

    /* renamed from: c */
    public final String f41180c;

    /* renamed from: d */
    public final BinderC9097v5 f41181d;

    public CallableC8942i5(BinderC9097v5 binderC9097v5, String str, String str2, String str3) {
        this.f41181d = binderC9097v5;
        this.f41178a = str;
        this.f41179b = str2;
        this.f41180c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C8875ca> call() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41181d.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41181d.f41698b;
        return c9123x92.m38363Z().m38065U(this.f41178a, this.f41179b, this.f41180c);
    }
}
