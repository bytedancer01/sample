package p334t8;

import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t8/d.class
 */
/* renamed from: t8.d */
/* loaded from: combined.jar:classes2.jar:t8/d.class */
public final class C8645d implements InterfaceC6923e {

    /* renamed from: b */
    public final List<List<C6919a>> f40390b;

    /* renamed from: c */
    public final List<Long> f40391c;

    public C8645d(List<List<C6919a>> list, List<Long> list2) {
        this.f40390b = list;
        this.f40391c = list2;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        int m22374d = C4401z0.m22374d(this.f40391c, Long.valueOf(j10), false, false);
        if (m22374d >= this.f40391c.size()) {
            m22374d = -1;
        }
        return m22374d;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        int m22383g = C4401z0.m22383g(this.f40391c, Long.valueOf(j10), true, false);
        return m22383g == -1 ? Collections.emptyList() : this.f40390b.get(m22383g);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        C4349a.m21878a(i10 >= 0);
        C4349a.m21878a(i10 < this.f40391c.size());
        return this.f40391c.get(i10).longValue();
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return this.f40391c.size();
    }
}
