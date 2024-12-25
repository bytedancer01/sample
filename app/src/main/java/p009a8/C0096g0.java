package p009a8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p099fc.AbstractC4807f0;
import p099fc.InterfaceC4805e0;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/g0.class
 */
/* renamed from: a8.g0 */
/* loaded from: combined.jar:classes2.jar:a8/g0.class */
public final class C0096g0 extends AbstractC0095g<Integer> {

    /* renamed from: v */
    public static final C7561b1 f333v = new C7561b1.c().m32371v("MergingMediaSource").m32350a();

    /* renamed from: k */
    public final boolean f334k;

    /* renamed from: l */
    public final boolean f335l;

    /* renamed from: m */
    public final InterfaceC0127w[] f336m;

    /* renamed from: n */
    public final AbstractC7574e2[] f337n;

    /* renamed from: o */
    public final ArrayList<InterfaceC0127w> f338o;

    /* renamed from: p */
    public final InterfaceC0099i f339p;

    /* renamed from: q */
    public final Map<Object, Long> f340q;

    /* renamed from: r */
    public final InterfaceC4805e0<Object, C0089d> f341r;

    /* renamed from: s */
    public int f342s;

    /* renamed from: t */
    public long[][] f343t;

    /* renamed from: u */
    public b f344u;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/g0$a.class
     */
    /* renamed from: a8.g0$a */
    /* loaded from: combined.jar:classes2.jar:a8/g0$a.class */
    public static final class a extends AbstractC0107m {

        /* renamed from: d */
        public final long[] f345d;

        /* renamed from: e */
        public final long[] f346e;

        public a(AbstractC7574e2 abstractC7574e2, Map<Object, Long> map) {
            super(abstractC7574e2);
            int mo512p = abstractC7574e2.mo512p();
            this.f346e = new long[abstractC7574e2.mo512p()];
            AbstractC7574e2.c cVar = new AbstractC7574e2.c();
            for (int i10 = 0; i10 < mo512p; i10++) {
                this.f346e[i10] = abstractC7574e2.m32666n(i10, cVar).f36733n;
            }
            int mo509i = abstractC7574e2.mo509i();
            this.f345d = new long[mo509i];
            AbstractC7574e2.b bVar = new AbstractC7574e2.b();
            for (int i11 = 0; i11 < mo509i; i11++) {
                abstractC7574e2.mo404g(i11, bVar, true);
                long longValue = ((Long) C4349a.m21882e(map.get(bVar.f36710b))).longValue();
                long[] jArr = this.f345d;
                longValue = longValue == Long.MIN_VALUE ? bVar.f36712d : longValue;
                jArr[i11] = longValue;
                long j10 = bVar.f36712d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f346e;
                    int i12 = bVar.f36711c;
                    jArr2[i12] = jArr2[i12] - (j10 - longValue);
                }
            }
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: g */
        public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
            super.mo404g(i10, bVar, z10);
            bVar.f36712d = this.f345d[i10];
            return bVar;
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: o */
        public AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
            long j11;
            super.mo405o(i10, cVar, j10);
            long j12 = this.f346e[i10];
            cVar.f36733n = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = cVar.f36732m;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    cVar.f36732m = j11;
                    return cVar;
                }
            }
            j11 = cVar.f36732m;
            cVar.f36732m = j11;
            return cVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/g0$b.class
     */
    /* renamed from: a8.g0$b */
    /* loaded from: combined.jar:classes2.jar:a8/g0$b.class */
    public static final class b extends IOException {

        /* renamed from: b */
        public final int f347b;

        public b(int i10) {
            this.f347b = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [long[], long[][]] */
    public C0096g0(boolean z10, boolean z11, InterfaceC0099i interfaceC0099i, InterfaceC0127w... interfaceC0127wArr) {
        this.f334k = z10;
        this.f335l = z11;
        this.f336m = interfaceC0127wArr;
        this.f339p = interfaceC0099i;
        this.f338o = new ArrayList<>(Arrays.asList(interfaceC0127wArr));
        this.f342s = -1;
        this.f337n = new AbstractC7574e2[interfaceC0127wArr.length];
        this.f343t = new long[0];
        this.f340q = new HashMap();
        this.f341r = AbstractC4807f0.m24381a().m24388a().mo24387e();
    }

    public C0096g0(boolean z10, boolean z11, InterfaceC0127w... interfaceC0127wArr) {
        this(z10, z11, new C0101j(), interfaceC0127wArr);
    }

    public C0096g0(boolean z10, InterfaceC0127w... interfaceC0127wArr) {
        this(z10, false, interfaceC0127wArr);
    }

    public C0096g0(InterfaceC0127w... interfaceC0127wArr) {
        this(false, interfaceC0127wArr);
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        super.mo303B(interfaceC0853l0);
        for (int i10 = 0; i10 < this.f336m.length; i10++) {
            m421K(Integer.valueOf(i10), this.f336m[i10]);
        }
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        super.mo305D();
        Arrays.fill(this.f337n, (Object) null);
        this.f342s = -1;
        this.f344u = null;
        this.f338o.clear();
        Collections.addAll(this.f338o, this.f336m);
    }

    /* renamed from: M */
    public final void m432M() {
        AbstractC7574e2.b bVar = new AbstractC7574e2.b();
        for (int i10 = 0; i10 < this.f342s; i10++) {
            long j10 = -this.f337n[0].m32663f(i10, bVar).m32683o();
            int i11 = 1;
            while (true) {
                AbstractC7574e2[] abstractC7574e2Arr = this.f337n;
                if (i11 < abstractC7574e2Arr.length) {
                    this.f343t[i10][i11] = j10 - (-abstractC7574e2Arr[i11].m32663f(i10, bVar).m32683o());
                    i11++;
                }
            }
        }
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC0127w.a mo418F(Integer num, InterfaceC0127w.a aVar) {
        if (num.intValue() != 0) {
            aVar = null;
        }
        return aVar;
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m417I(Integer num, InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
        if (this.f344u != null) {
            return;
        }
        if (this.f342s == -1) {
            this.f342s = abstractC7574e2.mo509i();
        } else if (abstractC7574e2.mo509i() != this.f342s) {
            this.f344u = new b(0);
            return;
        }
        if (this.f343t.length == 0) {
            this.f343t = new long[this.f342s][this.f337n.length];
        }
        this.f338o.remove(interfaceC0127w);
        this.f337n[num.intValue()] = abstractC7574e2;
        if (this.f338o.isEmpty()) {
            if (this.f334k) {
                m432M();
            }
            AbstractC7574e2 abstractC7574e22 = this.f337n[0];
            AbstractC7574e2 abstractC7574e23 = abstractC7574e22;
            if (this.f335l) {
                m435P();
                abstractC7574e23 = new a(abstractC7574e22, this.f340q);
            }
            m304C(abstractC7574e23);
        }
    }

    /* renamed from: P */
    public final void m435P() {
        AbstractC7574e2[] abstractC7574e2Arr;
        long j10;
        AbstractC7574e2.b bVar = new AbstractC7574e2.b();
        for (int i10 = 0; i10 < this.f342s; i10++) {
            long j11 = Long.MIN_VALUE;
            int i11 = 0;
            while (true) {
                abstractC7574e2Arr = this.f337n;
                if (i11 >= abstractC7574e2Arr.length) {
                    break;
                }
                long m32679k = abstractC7574e2Arr[i11].m32663f(i10, bVar).m32679k();
                if (m32679k == -9223372036854775807L) {
                    j10 = j11;
                } else {
                    long j12 = m32679k + this.f343t[i10][i11];
                    if (j11 != Long.MIN_VALUE) {
                        j10 = j11;
                        if (j12 >= j11) {
                        }
                    }
                    j10 = j12;
                }
                i11++;
                j11 = j10;
            }
            Object mo511m = abstractC7574e2Arr[0].mo511m(i10);
            this.f340q.put(mo511m, Long.valueOf(j11));
            Iterator<C0089d> it = this.f341r.get(mo511m).iterator();
            while (it.hasNext()) {
                it.next().m351t(0L, j11);
            }
        }
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        InterfaceC0127w[] interfaceC0127wArr = this.f336m;
        return interfaceC0127wArr.length > 0 ? interfaceC0127wArr[0].mo400d() : f333v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [a8.d] */
    @Override // p009a8.InterfaceC0127w
    /* renamed from: h */
    public InterfaceC0121t mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        int length = this.f336m.length;
        InterfaceC0121t[] interfaceC0121tArr = new InterfaceC0121t[length];
        int mo506b = this.f337n[0].mo506b(aVar.f544a);
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC0121tArr[i10] = this.f336m[i10].mo401h(aVar.m641c(this.f337n[i10].mo511m(mo506b)), interfaceC0832b, j10 - this.f343t[mo506b][i10]);
        }
        C0094f0 c0094f0 = new C0094f0(this.f339p, this.f343t[mo506b], interfaceC0121tArr);
        C0094f0 c0094f02 = c0094f0;
        if (this.f335l) {
            c0094f02 = new C0089d(c0094f0, true, 0L, ((Long) C4349a.m21882e(this.f340q.get(aVar.f544a))).longValue());
            this.f341r.put(aVar.f544a, c0094f02);
        }
        return c0094f02;
    }

    @Override // p009a8.AbstractC0095g, p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
        b bVar = this.f344u;
        if (bVar != null) {
            throw bVar;
        }
        super.mo402m();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        InterfaceC0121t interfaceC0121t2 = interfaceC0121t;
        if (this.f335l) {
            C0089d c0089d = (C0089d) interfaceC0121t;
            Iterator<Map.Entry<Object, C0089d>> it = this.f341r.mo24315a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C0089d> next = it.next();
                if (next.getValue().equals(c0089d)) {
                    this.f341r.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            interfaceC0121t2 = c0089d.f276b;
        }
        C0094f0 c0094f0 = (C0094f0) interfaceC0121t2;
        int i10 = 0;
        while (true) {
            InterfaceC0127w[] interfaceC0127wArr = this.f336m;
            if (i10 >= interfaceC0127wArr.length) {
                return;
            }
            interfaceC0127wArr[i10].mo403q(c0094f0.m411e(i10));
            i10++;
        }
    }
}
