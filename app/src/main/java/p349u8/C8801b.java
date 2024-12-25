package p349u8;

import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u8/b.class
 */
/* renamed from: u8.b */
/* loaded from: combined.jar:classes2.jar:u8/b.class */
public final class C8801b implements InterfaceC6923e {

    /* renamed from: b */
    public final C6919a[] f40813b;

    /* renamed from: c */
    public final long[] f40814c;

    public C8801b(C6919a[] c6919aArr, long[] jArr) {
        this.f40813b = c6919aArr;
        this.f40814c = jArr;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        int m22377e = C4401z0.m22377e(this.f40814c, j10, false, false);
        if (m22377e >= this.f40814c.length) {
            m22377e = -1;
        }
        return m22377e;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        C6919a c6919a;
        int m22389i = C4401z0.m22389i(this.f40814c, j10, true, false);
        return (m22389i == -1 || (c6919a = this.f40813b[m22389i]) == C6919a.f35794r) ? Collections.emptyList() : Collections.singletonList(c6919a);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        C4349a.m21878a(i10 >= 0);
        C4349a.m21878a(i10 < this.f40814c.length);
        return this.f40814c[i10];
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return this.f40814c.length;
    }
}
