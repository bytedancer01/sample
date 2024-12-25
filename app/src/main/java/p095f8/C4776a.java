package p095f8;

import com.google.android.exoplayer2.extractor.C2343b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p027b9.C0843g0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p058d8.C4346h;
import p058d8.C4347i;
import p058d8.InterfaceC4345g;
import p059d9.AbstractRunnableFutureC4371k0;
import p077e8.AbstractC4657j;
import p077e8.C4648a;
import p077e8.C4650c;
import p077e8.C4651d;
import p077e8.C4654g;
import p077e8.C4656i;
import p267p6.C7561b1;
import p267p6.C7583h;
import p420y7.AbstractC9856h0;
import p420y7.C9855h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f8/a.class
 */
/* renamed from: f8.a */
/* loaded from: combined.jar:classes2.jar:f8/a.class */
public final class C4776a extends AbstractC9856h0<C4650c> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f8/a$a.class
     */
    /* renamed from: f8.a$a */
    /* loaded from: combined.jar:classes2.jar:f8/a$a.class */
    public class a extends AbstractRunnableFutureC4371k0<C2343b, IOException> {

        /* renamed from: i */
        public final InterfaceC0854m f28138i;

        /* renamed from: j */
        public final int f28139j;

        /* renamed from: k */
        public final AbstractC4657j f28140k;

        /* renamed from: l */
        public final C4776a f28141l;

        public a(C4776a c4776a, InterfaceC0854m interfaceC0854m, int i10, AbstractC4657j abstractC4657j) {
            this.f28141l = c4776a;
            this.f28138i = interfaceC0854m;
            this.f28139j = i10;
            this.f28140k = abstractC4657j;
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2343b mo22057e() {
            return C4346h.m21870b(this.f28138i, this.f28139j, this.f28140k);
        }
    }

    public C4776a(C7561b1 c7561b1, C0843g0.a<C4650c> aVar, C1033c.c cVar, Executor executor) {
        super(c7561b1, aVar, cVar, executor);
    }

    public C4776a(C7561b1 c7561b1, C1033c.c cVar, Executor executor) {
        this(c7561b1, new C4651d(), cVar, executor);
    }

    /* renamed from: l */
    public static void m24178l(long j10, String str, C4656i c4656i, ArrayList<AbstractC9856h0.c> arrayList) {
        arrayList.add(new AbstractC9856h0.c(j10, new C0858p(c4656i.m23373b(str), c4656i.f27454a, c4656i.f27455b)));
    }

    /* renamed from: m */
    public final void m24180m(InterfaceC0854m interfaceC0854m, C4648a c4648a, long j10, long j11, boolean z10, ArrayList<AbstractC9856h0.c> arrayList) {
        InterfaceC4345g m24181n;
        for (int i10 = 0; i10 < c4648a.f27403c.size(); i10++) {
            AbstractC4657j abstractC4657j = c4648a.f27403c.get(i10);
            try {
                m24181n = m24181n(interfaceC0854m, c4648a.f27402b, abstractC4657j, z10);
            } catch (IOException e10) {
                e = e10;
            }
            if (m24181n != null) {
                long mo21865h = m24181n.mo21865h(j11);
                if (mo21865h == -1) {
                    throw new C9855h("Unbounded segment index");
                }
                String str = abstractC4657j.f27460c.get(0).f27407a;
                C4656i m23380n = abstractC4657j.m23380n();
                if (m23380n != null) {
                    m24178l(j10, str, m23380n, arrayList);
                }
                C4656i mo23379m = abstractC4657j.mo23379m();
                if (mo23379m != null) {
                    m24178l(j10, str, mo23379m, arrayList);
                }
                long mo21867j = m24181n.mo21867j();
                long j12 = mo21867j;
                while (true) {
                    long j13 = j12;
                    if (j13 <= (mo21867j + mo21865h) - 1) {
                        m24178l(j10 + m24181n.mo21859b(j13), str, m24181n.mo21863f(j13), arrayList);
                        j12 = j13 + 1;
                    }
                }
            } else {
                try {
                    throw new C9855h("Missing segment index");
                } catch (IOException e11) {
                    e = e11;
                    if (!z10) {
                        throw e;
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final InterfaceC4345g m24181n(InterfaceC0854m interfaceC0854m, int i10, AbstractC4657j abstractC4657j, boolean z10) {
        InterfaceC4345g mo23378l = abstractC4657j.mo23378l();
        if (mo23378l != null) {
            return mo23378l;
        }
        C2343b c2343b = (C2343b) m41415e(new a(this, interfaceC0854m, i10, abstractC4657j), z10);
        return c2343b == null ? null : new C4347i(c2343b, abstractC4657j.f27461d);
    }

    @Override // p420y7.AbstractC9856h0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public List<AbstractC9856h0.c> mo24179h(InterfaceC0854m interfaceC0854m, C4650c c4650c, boolean z10) {
        ArrayList<AbstractC9856h0.c> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < c4650c.m23299e(); i10++) {
            C4654g m23298d = c4650c.m23298d(i10);
            long m32760d = C7583h.m32760d(m23298d.f27445b);
            long m23301g = c4650c.m23301g(i10);
            List<C4648a> list = m23298d.f27446c;
            for (int i11 = 0; i11 < list.size(); i11++) {
                m24180m(interfaceC0854m, list.get(i11), m32760d, m23301g, z10, arrayList);
            }
        }
        return arrayList;
    }
}
