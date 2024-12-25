package p126h8;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p027b9.C0843g0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p059d9.C4393v0;
import p146i8.AbstractC5207h;
import p146i8.C5205f;
import p146i8.C5206g;
import p146i8.C5208i;
import p267p6.C7561b1;
import p420y7.AbstractC9856h0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h8/a.class
 */
/* renamed from: h8.a */
/* loaded from: combined.jar:classes2.jar:h8/a.class */
public final class C5042a extends AbstractC9856h0<AbstractC5207h> {
    public C5042a(C7561b1 c7561b1, C0843g0.a<AbstractC5207h> aVar, C1033c.c cVar, Executor executor) {
        super(c7561b1, aVar, cVar, executor);
    }

    public C5042a(C7561b1 c7561b1, C1033c.c cVar, Executor executor) {
        this(c7561b1, new C5208i(), cVar, executor);
    }

    /* renamed from: l */
    public final void m25259l(List<Uri> list, List<C0858p> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list2.add(AbstractC9856h0.m41412f(list.get(i10)));
        }
    }

    /* renamed from: m */
    public final void m25260m(C5206g c5206g, C5206g.d dVar, HashSet<Uri> hashSet, ArrayList<AbstractC9856h0.c> arrayList) {
        String str = c5206g.f29831a;
        long j10 = c5206g.f29793h + dVar.f29819f;
        String str2 = dVar.f29821h;
        if (str2 != null) {
            Uri m22281e = C4393v0.m22281e(str, str2);
            if (hashSet.add(m22281e)) {
                arrayList.add(new AbstractC9856h0.c(j10, AbstractC9856h0.m41412f(m22281e)));
            }
        }
        arrayList.add(new AbstractC9856h0.c(j10, new C0858p(C4393v0.m22281e(str, dVar.f29815b), dVar.f29823j, dVar.f29824k)));
    }

    @Override // p420y7.AbstractC9856h0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<AbstractC9856h0.c> mo24179h(InterfaceC0854m interfaceC0854m, AbstractC5207h abstractC5207h, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (abstractC5207h instanceof C5205f) {
            m25259l(((C5205f) abstractC5207h).f29769d, arrayList);
        } else {
            arrayList.add(AbstractC9856h0.m41412f(Uri.parse(abstractC5207h.f29831a)));
        }
        ArrayList<AbstractC9856h0.c> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0858p c0858p = (C0858p) it.next();
            arrayList2.add(new AbstractC9856h0.c(0L, c0858p));
            try {
                C5206g c5206g = (C5206g) m41416g(interfaceC0854m, c0858p, z10);
                C5206g.d dVar = null;
                List<C5206g.d> list = c5206g.f29803r;
                int i10 = 0;
                while (i10 < list.size()) {
                    C5206g.d dVar2 = list.get(i10);
                    C5206g.d dVar3 = dVar2.f29816c;
                    C5206g.d dVar4 = dVar;
                    if (dVar3 != null) {
                        dVar4 = dVar;
                        if (dVar3 != dVar) {
                            m25260m(c5206g, dVar3, hashSet, arrayList2);
                            dVar4 = dVar3;
                        }
                    }
                    m25260m(c5206g, dVar2, hashSet, arrayList2);
                    i10++;
                    dVar = dVar4;
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }
}
