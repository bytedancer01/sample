package p026b8;

import p009a8.AbstractC0107m;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b8/j.class
 */
/* renamed from: b8.j */
/* loaded from: combined.jar:classes2.jar:b8/j.class */
public final class C0829j extends AbstractC0107m {

    /* renamed from: d */
    public final C0820a f5735d;

    public C0829j(AbstractC7574e2 abstractC7574e2, C0820a c0820a) {
        super(abstractC7574e2);
        C4349a.m21884g(abstractC7574e2.mo509i() == 1);
        C4349a.m21884g(abstractC7574e2.mo512p() == 1);
        this.f5735d = c0820a;
    }

    @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
    /* renamed from: g */
    public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
        this.f427c.mo404g(i10, bVar, z10);
        long j10 = bVar.f36712d;
        long j11 = j10;
        if (j10 == -9223372036854775807L) {
            j11 = this.f5735d.f5688d;
        }
        bVar.m32688t(bVar.f36709a, bVar.f36710b, bVar.f36711c, j11, bVar.m32683o(), this.f5735d, bVar.f36714f);
        return bVar;
    }
}
