package p009a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import p009a8.InterfaceC0121t;
import p059d9.C4349a;
import p267p6.C7558a2;
import p267p6.C7632x0;
import p332t6.C8638f;
import p420y7.C9858i0;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/f0.class
 */
/* renamed from: a8.f0 */
/* loaded from: combined.jar:classes2.jar:a8/f0.class */
public final class C0094f0 implements InterfaceC0121t, InterfaceC0121t.a {

    /* renamed from: b */
    public final InterfaceC0121t[] f310b;

    /* renamed from: d */
    public final InterfaceC0099i f312d;

    /* renamed from: f */
    public InterfaceC0121t.a f314f;

    /* renamed from: g */
    public C0083a1 f315g;

    /* renamed from: i */
    public InterfaceC0122t0 f317i;

    /* renamed from: e */
    public final ArrayList<InterfaceC0121t> f313e = new ArrayList<>();

    /* renamed from: c */
    public final IdentityHashMap<InterfaceC0120s0, Integer> f311c = new IdentityHashMap<>();

    /* renamed from: h */
    public InterfaceC0121t[] f316h = new InterfaceC0121t[0];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/f0$a.class
     */
    /* renamed from: a8.f0$a */
    /* loaded from: combined.jar:classes2.jar:a8/f0$a.class */
    public static final class a implements InterfaceC0121t, InterfaceC0121t.a {

        /* renamed from: b */
        public final InterfaceC0121t f318b;

        /* renamed from: c */
        public final long f319c;

        /* renamed from: d */
        public InterfaceC0121t.a f320d;

        public a(InterfaceC0121t interfaceC0121t, long j10) {
            this.f318b = interfaceC0121t;
            this.f319c = j10;
        }

        @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
        /* renamed from: b */
        public boolean mo335b() {
            return this.f318b.mo335b();
        }

        @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
        /* renamed from: c */
        public long mo336c() {
            long mo336c = this.f318b.mo336c();
            long j10 = Long.MIN_VALUE;
            if (mo336c != Long.MIN_VALUE) {
                j10 = this.f319c + mo336c;
            }
            return j10;
        }

        @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
        /* renamed from: d */
        public boolean mo337d(long j10) {
            return this.f318b.mo337d(j10 - this.f319c);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: f */
        public long mo339f(long j10, C7558a2 c7558a2) {
            return this.f318b.mo339f(j10 - this.f319c, c7558a2) + this.f319c;
        }

        @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
        /* renamed from: g */
        public long mo340g() {
            long mo340g = this.f318b.mo340g();
            long j10 = Long.MIN_VALUE;
            if (mo340g != Long.MIN_VALUE) {
                j10 = this.f319c + mo340g;
            }
            return j10;
        }

        @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
        /* renamed from: h */
        public void mo341h(long j10) {
            this.f318b.mo341h(j10 - this.f319c);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: i */
        public List<C9858i0> mo342i(List<InterfaceC9884h> list) {
            return this.f318b.mo342i(list);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: j */
        public long mo343j(long j10) {
            return this.f318b.mo343j(j10 - this.f319c) + this.f319c;
        }

        @Override // p009a8.InterfaceC0121t.a
        /* renamed from: k */
        public void mo344k(InterfaceC0121t interfaceC0121t) {
            ((InterfaceC0121t.a) C4349a.m21882e(this.f320d)).mo344k(this);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: l */
        public void mo345l(InterfaceC0121t.a aVar, long j10) {
            this.f320d = aVar;
            this.f318b.mo345l(this, j10 - this.f319c);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: m */
        public long mo346m(InterfaceC9884h[] interfaceC9884hArr, boolean[] zArr, InterfaceC0120s0[] interfaceC0120s0Arr, boolean[] zArr2, long j10) {
            InterfaceC0120s0[] interfaceC0120s0Arr2 = new InterfaceC0120s0[interfaceC0120s0Arr.length];
            int i10 = 0;
            while (true) {
                InterfaceC0120s0 interfaceC0120s0 = null;
                if (i10 >= interfaceC0120s0Arr.length) {
                    break;
                }
                b bVar = (b) interfaceC0120s0Arr[i10];
                if (bVar != null) {
                    interfaceC0120s0 = bVar.m415b();
                }
                interfaceC0120s0Arr2[i10] = interfaceC0120s0;
                i10++;
            }
            long mo346m = this.f318b.mo346m(interfaceC9884hArr, zArr, interfaceC0120s0Arr2, zArr2, j10 - this.f319c);
            for (int i11 = 0; i11 < interfaceC0120s0Arr.length; i11++) {
                InterfaceC0120s0 interfaceC0120s02 = interfaceC0120s0Arr2[i11];
                if (interfaceC0120s02 == null) {
                    interfaceC0120s0Arr[i11] = null;
                } else {
                    InterfaceC0120s0 interfaceC0120s03 = interfaceC0120s0Arr[i11];
                    if (interfaceC0120s03 == null || ((b) interfaceC0120s03).m415b() != interfaceC0120s02) {
                        interfaceC0120s0Arr[i11] = new b(interfaceC0120s02, this.f319c);
                    }
                }
            }
            return mo346m + this.f319c;
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: n */
        public long mo347n() {
            long mo347n = this.f318b.mo347n();
            long j10 = -9223372036854775807L;
            if (mo347n != -9223372036854775807L) {
                j10 = this.f319c + mo347n;
            }
            return j10;
        }

        @Override // p009a8.InterfaceC0122t0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void mo334a(InterfaceC0121t interfaceC0121t) {
            ((InterfaceC0121t.a) C4349a.m21882e(this.f320d)).mo334a(this);
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: s */
        public void mo350s() {
            this.f318b.mo350s();
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: v */
        public C0083a1 mo352v() {
            return this.f318b.mo352v();
        }

        @Override // p009a8.InterfaceC0121t
        /* renamed from: w */
        public void mo353w(long j10, boolean z10) {
            this.f318b.mo353w(j10 - this.f319c, z10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/f0$b.class
     */
    /* renamed from: a8.f0$b */
    /* loaded from: combined.jar:classes2.jar:a8/f0$b.class */
    public static final class b implements InterfaceC0120s0 {

        /* renamed from: b */
        public final InterfaceC0120s0 f321b;

        /* renamed from: c */
        public final long f322c;

        public b(InterfaceC0120s0 interfaceC0120s0, long j10) {
            this.f321b = interfaceC0120s0;
            this.f322c = j10;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: a */
        public void mo354a() {
            this.f321b.mo354a();
        }

        /* renamed from: b */
        public InterfaceC0120s0 m415b() {
            return this.f321b;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: e */
        public boolean mo356e() {
            return this.f321b.mo356e();
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: p */
        public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
            int mo357p = this.f321b.mo357p(c7632x0, c8638f, i10);
            if (mo357p == -4) {
                c8638f.f40329e = Math.max(0L, c8638f.f40329e + this.f322c);
            }
            return mo357p;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: t */
        public int mo358t(long j10) {
            return this.f321b.mo358t(j10 - this.f322c);
        }
    }

    public C0094f0(InterfaceC0099i interfaceC0099i, long[] jArr, InterfaceC0121t... interfaceC0121tArr) {
        this.f312d = interfaceC0099i;
        this.f310b = interfaceC0121tArr;
        this.f317i = interfaceC0099i.mo437a(new InterfaceC0122t0[0]);
        for (int i10 = 0; i10 < interfaceC0121tArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f310b[i10] = new a(interfaceC0121tArr[i10], j10);
            }
        }
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f317i.mo335b();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        return this.f317i.mo336c();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        if (this.f313e.isEmpty()) {
            return this.f317i.mo337d(j10);
        }
        int size = this.f313e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f313e.get(i10).mo337d(j10);
        }
        return false;
    }

    /* renamed from: e */
    public InterfaceC0121t m411e(int i10) {
        InterfaceC0121t interfaceC0121t = this.f310b[i10];
        InterfaceC0121t interfaceC0121t2 = interfaceC0121t;
        if (interfaceC0121t instanceof a) {
            interfaceC0121t2 = ((a) interfaceC0121t).f318b;
        }
        return interfaceC0121t2;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: f */
    public long mo339f(long j10, C7558a2 c7558a2) {
        InterfaceC0121t[] interfaceC0121tArr = this.f316h;
        return (interfaceC0121tArr.length > 0 ? interfaceC0121tArr[0] : this.f310b[0]).mo339f(j10, c7558a2);
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        return this.f317i.mo340g();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
        this.f317i.mo341h(j10);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: i */
    public /* synthetic */ List mo342i(List list) {
        return C0119s.m628a(this, list);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: j */
    public long mo343j(long j10) {
        long mo343j = this.f316h[0].mo343j(j10);
        int i10 = 1;
        while (true) {
            InterfaceC0121t[] interfaceC0121tArr = this.f316h;
            if (i10 >= interfaceC0121tArr.length) {
                return mo343j;
            }
            if (interfaceC0121tArr[i10].mo343j(mo343j) != mo343j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // p009a8.InterfaceC0121t.a
    /* renamed from: k */
    public void mo344k(InterfaceC0121t interfaceC0121t) {
        this.f313e.remove(interfaceC0121t);
        if (this.f313e.isEmpty()) {
            int i10 = 0;
            for (InterfaceC0121t interfaceC0121t2 : this.f310b) {
                i10 += interfaceC0121t2.mo352v().f261b;
            }
            C0134z0[] c0134z0Arr = new C0134z0[i10];
            int i11 = 0;
            for (InterfaceC0121t interfaceC0121t3 : this.f310b) {
                C0083a1 mo352v = interfaceC0121t3.mo352v();
                int i12 = mo352v.f261b;
                int i13 = 0;
                while (i13 < i12) {
                    c0134z0Arr[i11] = mo352v.m323b(i13);
                    i13++;
                    i11++;
                }
            }
            this.f315g = new C0083a1(c0134z0Arr);
            ((InterfaceC0121t.a) C4349a.m21882e(this.f314f)).mo344k(this);
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: l */
    public void mo345l(InterfaceC0121t.a aVar, long j10) {
        this.f314f = aVar;
        Collections.addAll(this.f313e, this.f310b);
        for (InterfaceC0121t interfaceC0121t : this.f310b) {
            interfaceC0121t.mo345l(this, j10);
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: m */
    public long mo346m(InterfaceC9884h[] interfaceC9884hArr, boolean[] zArr, InterfaceC0120s0[] interfaceC0120s0Arr, boolean[] zArr2, long j10) {
        boolean z10;
        boolean z11;
        int[] iArr = new int[interfaceC9884hArr.length];
        int[] iArr2 = new int[interfaceC9884hArr.length];
        for (int i10 = 0; i10 < interfaceC9884hArr.length; i10++) {
            InterfaceC0120s0 interfaceC0120s0 = interfaceC0120s0Arr[i10];
            Integer num = interfaceC0120s0 == null ? null : this.f311c.get(interfaceC0120s0);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            InterfaceC9884h interfaceC9884h = interfaceC9884hArr[i10];
            if (interfaceC9884h != null) {
                C0134z0 mo41612l = interfaceC9884h.mo41612l();
                int i11 = 0;
                while (true) {
                    InterfaceC0121t[] interfaceC0121tArr = this.f310b;
                    if (i11 >= interfaceC0121tArr.length) {
                        break;
                    }
                    if (interfaceC0121tArr[i11].mo352v().m324c(mo41612l) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f311c.clear();
        int length = interfaceC9884hArr.length;
        InterfaceC0120s0[] interfaceC0120s0Arr2 = new InterfaceC0120s0[length];
        InterfaceC0120s0[] interfaceC0120s0Arr3 = new InterfaceC0120s0[interfaceC9884hArr.length];
        InterfaceC9884h[] interfaceC9884hArr2 = new InterfaceC9884h[interfaceC9884hArr.length];
        ArrayList arrayList = new ArrayList(this.f310b.length);
        int i12 = 0;
        while (i12 < this.f310b.length) {
            for (int i13 = 0; i13 < interfaceC9884hArr.length; i13++) {
                interfaceC0120s0Arr3[i13] = iArr[i13] == i12 ? interfaceC0120s0Arr[i13] : null;
                interfaceC9884hArr2[i13] = iArr2[i13] == i12 ? interfaceC9884hArr[i13] : null;
            }
            long mo346m = this.f310b[i12].mo346m(interfaceC9884hArr2, zArr, interfaceC0120s0Arr3, zArr2, j10);
            if (i12 == 0) {
                j10 = mo346m;
            } else if (mo346m != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i14 = 0;
            boolean z12 = false;
            while (true) {
                z10 = z12;
                if (i14 >= interfaceC9884hArr.length) {
                    break;
                }
                if (iArr2[i14] == i12) {
                    InterfaceC0120s0 interfaceC0120s02 = (InterfaceC0120s0) C4349a.m21882e(interfaceC0120s0Arr3[i14]);
                    interfaceC0120s0Arr2[i14] = interfaceC0120s0Arr3[i14];
                    this.f311c.put(interfaceC0120s02, Integer.valueOf(i12));
                    z11 = true;
                } else {
                    z11 = z10;
                    if (iArr[i14] == i12) {
                        C4349a.m21884g(interfaceC0120s0Arr3[i14] == null);
                        z11 = z10;
                    }
                }
                i14++;
                z12 = z11;
            }
            if (z10) {
                arrayList.add(this.f310b[i12]);
            }
            i12++;
        }
        System.arraycopy(interfaceC0120s0Arr2, 0, interfaceC0120s0Arr, 0, length);
        InterfaceC0121t[] interfaceC0121tArr2 = (InterfaceC0121t[]) arrayList.toArray(new InterfaceC0121t[0]);
        this.f316h = interfaceC0121tArr2;
        this.f317i = this.f312d.mo437a(interfaceC0121tArr2);
        return j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: n */
    public long mo347n() {
        InterfaceC0121t interfaceC0121t;
        InterfaceC0121t[] interfaceC0121tArr = this.f316h;
        int length = interfaceC0121tArr.length;
        long j10 = -9223372036854775807L;
        int i10 = 0;
        while (i10 < length) {
            InterfaceC0121t interfaceC0121t2 = interfaceC0121tArr[i10];
            long mo347n = interfaceC0121t2.mo347n();
            if (mo347n == -9223372036854775807L) {
                mo347n = j10;
                if (j10 == -9223372036854775807L) {
                    continue;
                } else {
                    if (interfaceC0121t2.mo343j(j10) != j10) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                    mo347n = j10;
                }
            } else if (j10 == -9223372036854775807L) {
                InterfaceC0121t[] interfaceC0121tArr2 = this.f316h;
                int length2 = interfaceC0121tArr2.length;
                for (int i11 = 0; i11 < length2 && (interfaceC0121t = interfaceC0121tArr2[i11]) != interfaceC0121t2; i11++) {
                    if (interfaceC0121t.mo343j(mo347n) != mo347n) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
            } else {
                if (mo347n != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
                mo347n = j10;
            }
            i10++;
            j10 = mo347n;
        }
        return j10;
    }

    @Override // p009a8.InterfaceC0122t0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo334a(InterfaceC0121t interfaceC0121t) {
        ((InterfaceC0121t.a) C4349a.m21882e(this.f314f)).mo334a(this);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: s */
    public void mo350s() {
        for (InterfaceC0121t interfaceC0121t : this.f310b) {
            interfaceC0121t.mo350s();
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: v */
    public C0083a1 mo352v() {
        return (C0083a1) C4349a.m21882e(this.f315g);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: w */
    public void mo353w(long j10, boolean z10) {
        for (InterfaceC0121t interfaceC0121t : this.f316h) {
            interfaceC0121t.mo353w(j10, z10);
        }
    }
}
