package p269p8;

import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p8/f.class
 */
/* renamed from: p8.f */
/* loaded from: combined.jar:classes2.jar:p8/f.class */
public final class C7669f implements InterfaceC6923e {

    /* renamed from: b */
    public final List<C6919a> f37404b;

    public C7669f(List<C6919a> list) {
        this.f37404b = list;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        return j10 >= 0 ? this.f37404b : Collections.emptyList();
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        C4349a.m21878a(i10 == 0);
        return 0L;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return 1;
    }
}
