package p229n8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p027b9.C0843g0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p059d9.C4349a;
import p059d9.C4401z0;
import p215m8.C5933a;
import p215m8.C5934b;
import p267p6.C7561b1;
import p420y7.AbstractC9856h0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n8/a.class
 */
/* renamed from: n8.a */
/* loaded from: combined.jar:classes2.jar:n8/a.class */
public final class C6697a extends AbstractC9856h0<C5933a> {
    public C6697a(C7561b1 c7561b1, C0843g0.a<C5933a> aVar, C1033c.c cVar, Executor executor) {
        super(c7561b1, aVar, cVar, executor);
    }

    public C6697a(C7561b1 c7561b1, C1033c.c cVar, Executor executor) {
        this(c7561b1.m32346a().m32348B(C4401z0.m22319D(((C7561b1.g) C4349a.m21882e(c7561b1.f36449b)).f36504a)).m32350a(), new C5934b(), cVar, executor);
    }

    @Override // p420y7.AbstractC9856h0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<AbstractC9856h0.c> mo24179h(InterfaceC0854m interfaceC0854m, C5933a c5933a, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (C5933a.b bVar : c5933a.f33327f) {
            for (int i10 = 0; i10 < bVar.f33342j.length; i10++) {
                for (int i11 = 0; i11 < bVar.f33343k; i11++) {
                    arrayList.add(new AbstractC9856h0.c(bVar.m29191e(i11), new C0858p(bVar.m29187a(i10, i11))));
                }
            }
        }
        return arrayList;
    }
}
