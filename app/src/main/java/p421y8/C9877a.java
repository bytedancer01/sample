package p421y8;

import com.amazonaws.services.p045s3.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p009a8.C0134z0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0840f;
import p038c8.AbstractC1028n;
import p038c8.InterfaceC1029o;
import p059d9.C4392v;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p099fc.AbstractC4807f0;
import p099fc.AbstractC4834t;
import p099fc.C4844y;
import p099fc.InterfaceC4805e0;
import p267p6.AbstractC7574e2;
import p267p6.C7629w0;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/a.class
 */
/* renamed from: y8.a */
/* loaded from: combined.jar:classes2.jar:y8/a.class */
public class C9877a extends AbstractC9879c {

    /* renamed from: h */
    public final InterfaceC0840f f45348h;

    /* renamed from: i */
    public final long f45349i;

    /* renamed from: j */
    public final long f45350j;

    /* renamed from: k */
    public final long f45351k;

    /* renamed from: l */
    public final float f45352l;

    /* renamed from: m */
    public final float f45353m;

    /* renamed from: n */
    public final AbstractC4834t<a> f45354n;

    /* renamed from: o */
    public final InterfaceC4354c f45355o;

    /* renamed from: p */
    public float f45356p;

    /* renamed from: q */
    public int f45357q;

    /* renamed from: r */
    public int f45358r;

    /* renamed from: s */
    public long f45359s;

    /* renamed from: t */
    public AbstractC1028n f45360t;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/a$a.class
     */
    /* renamed from: y8.a$a */
    /* loaded from: combined.jar:classes2.jar:y8/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final long f45361a;

        /* renamed from: b */
        public final long f45362b;

        public a(long j10, long j11) {
            this.f45361a = j10;
            this.f45362b = j11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f45361a != aVar.f45361a || this.f45362b != aVar.f45362b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (((int) this.f45361a) * 31) + ((int) this.f45362b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/a$b.class
     */
    /* renamed from: y8.a$b */
    /* loaded from: combined.jar:classes2.jar:y8/a$b.class */
    public static class b implements InterfaceC9884h.b {

        /* renamed from: a */
        public final int f45363a;

        /* renamed from: b */
        public final int f45364b;

        /* renamed from: c */
        public final int f45365c;

        /* renamed from: d */
        public final float f45366d;

        /* renamed from: e */
        public final float f45367e;

        /* renamed from: f */
        public final InterfaceC4354c f45368f;

        public b() {
            this(Constants.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.7f, 0.75f, InterfaceC4354c.f26546a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, InterfaceC4354c interfaceC4354c) {
            this.f45363a = i10;
            this.f45364b = i11;
            this.f45365c = i12;
            this.f45366d = f10;
            this.f45367e = f11;
            this.f45368f = interfaceC4354c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p421y8.InterfaceC9884h.b
        /* renamed from: a */
        public final InterfaceC9884h[] mo41461a(InterfaceC9884h.a[] aVarArr, InterfaceC0840f interfaceC0840f, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e2) {
            AbstractC4834t m41589z = C9877a.m41589z(aVarArr);
            InterfaceC9884h[] interfaceC9884hArr = new InterfaceC9884h[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                InterfaceC9884h.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f45446b;
                    if (iArr.length != 0) {
                        interfaceC9884hArr[i10] = iArr.length == 1 ? new C9885i(aVar2.f45445a, iArr[0], aVar2.f45447c) : m41601b(aVar2.f45445a, iArr, aVar2.f45447c, interfaceC0840f, (AbstractC4834t) m41589z.get(i10));
                    }
                }
            }
            return interfaceC9884hArr;
        }

        /* renamed from: b */
        public C9877a m41601b(C0134z0 c0134z0, int[] iArr, int i10, InterfaceC0840f interfaceC0840f, AbstractC4834t<a> abstractC4834t) {
            return new C9877a(c0134z0, iArr, i10, interfaceC0840f, this.f45363a, this.f45364b, this.f45365c, this.f45366d, this.f45367e, abstractC4834t, this.f45368f);
        }
    }

    public C9877a(C0134z0 c0134z0, int[] iArr, int i10, InterfaceC0840f interfaceC0840f, long j10, long j11, long j12, float f10, float f11, List<a> list, InterfaceC4354c interfaceC4354c) {
        super(c0134z0, iArr, i10);
        long j13 = j12;
        if (j12 < j10) {
            C4392v.m22275i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        }
        this.f45348h = interfaceC0840f;
        this.f45349i = j10 * 1000;
        this.f45350j = j11 * 1000;
        this.f45351k = j13 * 1000;
        this.f45352l = f10;
        this.f45353m = f11;
        this.f45354n = AbstractC4834t.m24538A(list);
        this.f45355o = interfaceC4354c;
        this.f45356p = 1.0f;
        this.f45358r = 0;
        this.f45359s = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long[], long[][]] */
    /* renamed from: E */
    public static long[][] m41585E(InterfaceC9884h.a[] aVarArr) {
        ?? r02 = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            InterfaceC9884h.a aVar = aVarArr[i10];
            if (aVar == null) {
                r02[i10] = new long[0];
            } else {
                r02[i10] = new long[aVar.f45446b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= aVar.f45446b.length) {
                        break;
                    }
                    r02[i10][i11] = aVar.f45445a.m663b(r0[i11]).f37082i;
                    i11++;
                }
                Arrays.sort(r02[i10]);
            }
        }
        return r02;
    }

    /* renamed from: F */
    public static AbstractC4834t<Integer> m41586F(long[][] jArr) {
        InterfaceC4805e0 mo24387e = AbstractC4807f0.m24383c().m24388a().mo24387e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    mo24387e.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC4834t.m24538A(mo24387e.values());
    }

    /* renamed from: w */
    public static void m41588w(List<AbstractC4834t.a<a>> list, long[] jArr) {
        int i10;
        long j10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= jArr.length) {
                break;
            }
            j10 += jArr[i11];
            i11++;
        }
        for (i10 = 0; i10 < list.size(); i10++) {
            AbstractC4834t.a<a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.m24554d(new a(j10, jArr[i10]));
            }
        }
    }

    /* renamed from: z */
    public static AbstractC4834t<AbstractC4834t<a>> m41589z(InterfaceC9884h.a[] aVarArr) {
        AbstractC4834t.a aVar;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9884h.a aVar2 : aVarArr) {
            if (aVar2 == null || aVar2.f45446b.length <= 1) {
                aVar = null;
            } else {
                aVar = AbstractC4834t.m24548x();
                aVar.m24554d(new a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] m41585E = m41585E(aVarArr);
        int[] iArr = new int[m41585E.length];
        long[] jArr = new long[m41585E.length];
        for (int i10 = 0; i10 < m41585E.length; i10++) {
            long[] jArr2 = m41585E[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m41588w(arrayList, jArr);
        AbstractC4834t<Integer> m41586F = m41586F(m41585E);
        for (int i11 = 0; i11 < m41586F.size(); i11++) {
            int intValue = m41586F.get(i11).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = m41585E[intValue][i12];
            m41588w(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        m41588w(arrayList, jArr);
        AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC4834t.a aVar3 = (AbstractC4834t.a) arrayList.get(i14);
            m24548x.m24554d(aVar3 == null ? AbstractC4834t.m24539E() : aVar3.m24555e());
        }
        return m24548x.m24555e();
    }

    /* renamed from: A */
    public final long m41590A(long j10) {
        long m41594G = m41594G(j10);
        if (this.f45354n.isEmpty()) {
            return m41594G;
        }
        int i10 = 1;
        while (i10 < this.f45354n.size() - 1 && this.f45354n.get(i10).f45361a < m41594G) {
            i10++;
        }
        a aVar = this.f45354n.get(i10 - 1);
        a aVar2 = this.f45354n.get(i10);
        long j11 = aVar.f45361a;
        float f10 = (m41594G - j11) / (aVar2.f45361a - j11);
        return aVar.f45362b + ((long) (f10 * (aVar2.f45362b - r0)));
    }

    /* renamed from: B */
    public final long m41591B(List<? extends AbstractC1028n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC1028n abstractC1028n = (AbstractC1028n) C4844y.m24603c(list);
        long j10 = abstractC1028n.f6874g;
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            long j12 = abstractC1028n.f6875h;
            j11 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                j11 = j12 - j10;
            }
        }
        return j11;
    }

    /* renamed from: C */
    public long m41592C() {
        return this.f45351k;
    }

    /* renamed from: D */
    public final long m41593D(InterfaceC1029o[] interfaceC1029oArr, List<? extends AbstractC1028n> list) {
        int i10 = this.f45357q;
        if (i10 < interfaceC1029oArr.length && interfaceC1029oArr[i10].next()) {
            InterfaceC1029o interfaceC1029o = interfaceC1029oArr[this.f45357q];
            return interfaceC1029o.mo6053b() - interfaceC1029o.mo6052a();
        }
        for (InterfaceC1029o interfaceC1029o2 : interfaceC1029oArr) {
            if (interfaceC1029o2.next()) {
                return interfaceC1029o2.mo6053b() - interfaceC1029o2.mo6052a();
            }
        }
        return m41591B(list);
    }

    /* renamed from: G */
    public final long m41594G(long j10) {
        long mo5342e = (long) (this.f45348h.mo5342e() * this.f45352l);
        long mo5339b = this.f45348h.mo5339b();
        if (mo5339b == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (mo5342e / this.f45356p);
        }
        float f10 = j10;
        return (long) ((mo5342e * Math.max((f10 / this.f45356p) - mo5339b, 0.0f)) / f10);
    }

    /* renamed from: H */
    public final long m41595H(long j10) {
        return (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) != 0 && (j10 > this.f45349i ? 1 : (j10 == this.f45349i ? 0 : -1)) <= 0 ? (long) (j10 * this.f45353m) : this.f45349i;
    }

    /* renamed from: I */
    public boolean m41596I(long j10, List<? extends AbstractC1028n> list) {
        long j11 = this.f45359s;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((AbstractC1028n) C4844y.m24603c(list)).equals(this.f45360t));
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: a */
    public int mo25051a() {
        return this.f45357q;
    }

    @Override // p421y8.AbstractC9879c, p421y8.InterfaceC9884h
    public void disable() {
        this.f45360t = null;
    }

    @Override // p421y8.AbstractC9879c, p421y8.InterfaceC9884h
    public void enable() {
        this.f45359s = -9223372036854775807L;
        this.f45360t = null;
    }

    @Override // p421y8.AbstractC9879c, p421y8.InterfaceC9884h
    /* renamed from: g */
    public void mo41597g(float f10) {
        this.f45356p = f10;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: h */
    public Object mo25052h() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        if (r10 >= r7.f45350j) goto L24;
     */
    @Override // p421y8.InterfaceC9884h
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo25053n(long r8, long r10, long r12, java.util.List<? extends p038c8.AbstractC1028n> r14, p038c8.InterfaceC1029o[] r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p421y8.C9877a.mo25053n(long, long, long, java.util.List, c8.o[]):void");
    }

    @Override // p421y8.AbstractC9879c, p421y8.InterfaceC9884h
    /* renamed from: o */
    public int mo41598o(long j10, List<? extends AbstractC1028n> list) {
        int i10;
        int i11;
        long mo21913b = this.f45355o.mo21913b();
        if (!m41596I(mo21913b, list)) {
            return list.size();
        }
        this.f45359s = mo21913b;
        this.f45360t = list.isEmpty() ? null : (AbstractC1028n) C4844y.m24603c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m22378e0 = C4401z0.m22378e0(list.get(size - 1).f6874g - j10, this.f45356p);
        long m41592C = m41592C();
        if (m22378e0 < m41592C) {
            return size;
        }
        C7629w0 mo41607e = mo41607e(m41600y(mo21913b, m41591B(list)));
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC1028n abstractC1028n = list.get(i12);
            C7629w0 c7629w0 = abstractC1028n.f6871d;
            if (C4401z0.m22378e0(abstractC1028n.f6874g - j10, this.f45356p) >= m41592C && c7629w0.f37082i < mo41607e.f37082i && (i10 = c7629w0.f37092s) != -1 && i10 < 720 && (i11 = c7629w0.f37091r) != -1 && i11 < 1280 && i10 < mo41607e.f37092s) {
                return i12;
            }
        }
        return size;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: r */
    public int mo25054r() {
        return this.f45358r;
    }

    /* renamed from: x */
    public boolean m41599x(C7629w0 c7629w0, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    /* renamed from: y */
    public final int m41600y(long j10, long j11) {
        long m41590A = m41590A(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f45370b; i11++) {
            if (j10 == Long.MIN_VALUE || !mo41605c(i11, j10)) {
                C7629w0 mo41607e = mo41607e(i11);
                if (m41599x(mo41607e, mo41607e.f37082i, m41590A)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
