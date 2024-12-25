package p401x8;

import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/b.class
 */
/* renamed from: x8.b */
/* loaded from: combined.jar:classes2.jar:x8/b.class */
public final class C9681b implements InterfaceC6923e {

    /* renamed from: b */
    public final List<C6919a> f44176b;

    public C9681b(List<C6919a> list) {
        this.f44176b = Collections.unmodifiableList(list);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        return j10 >= 0 ? this.f44176b : Collections.emptyList();
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
