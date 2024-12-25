package p009a8;

import android.os.Looper;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p009a8.C0118r0;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0846i;
import p057d7.C4336s;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p059d9.InterfaceC4362g;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8638f;
import p365v6.C9273n;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;
import p365v6.InterfaceC9292z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/r0.class
 */
/* renamed from: a8.r0 */
/* loaded from: combined.jar:classes2.jar:a8/r0.class */
public class C0118r0 implements InterfaceC4337t {

    /* renamed from: A */
    public boolean f505A;

    /* renamed from: B */
    public C7629w0 f506B;

    /* renamed from: C */
    public C7629w0 f507C;

    /* renamed from: D */
    public int f508D;

    /* renamed from: E */
    public boolean f509E;

    /* renamed from: F */
    public boolean f510F;

    /* renamed from: G */
    public long f511G;

    /* renamed from: H */
    public boolean f512H;

    /* renamed from: a */
    public final C0114p0 f513a;

    /* renamed from: d */
    public final InterfaceC9292z f516d;

    /* renamed from: e */
    public final InterfaceC9290x.a f517e;

    /* renamed from: f */
    public final Looper f518f;

    /* renamed from: g */
    public d f519g;

    /* renamed from: h */
    public C7629w0 f520h;

    /* renamed from: i */
    public InterfaceC9277p f521i;

    /* renamed from: q */
    public int f529q;

    /* renamed from: r */
    public int f530r;

    /* renamed from: s */
    public int f531s;

    /* renamed from: t */
    public int f532t;

    /* renamed from: x */
    public boolean f536x;

    /* renamed from: b */
    public final b f514b = new b();

    /* renamed from: j */
    public int f522j = 1000;

    /* renamed from: k */
    public int[] f523k = new int[1000];

    /* renamed from: l */
    public long[] f524l = new long[1000];

    /* renamed from: o */
    public long[] f527o = new long[1000];

    /* renamed from: n */
    public int[] f526n = new int[1000];

    /* renamed from: m */
    public int[] f525m = new int[1000];

    /* renamed from: p */
    public InterfaceC4337t.a[] f528p = new InterfaceC4337t.a[1000];

    /* renamed from: c */
    public final C0132y0<c> f515c = new C0132y0<>(new InterfaceC4362g() { // from class: a8.q0
        @Override // p059d9.InterfaceC4362g
        public final void accept(Object obj) {
            C0118r0.m569L((C0118r0.c) obj);
        }
    });

    /* renamed from: u */
    public long f533u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f534v = Long.MIN_VALUE;

    /* renamed from: w */
    public long f535w = Long.MIN_VALUE;

    /* renamed from: z */
    public boolean f538z = true;

    /* renamed from: y */
    public boolean f537y = true;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/r0$b.class
     */
    /* renamed from: a8.r0$b */
    /* loaded from: combined.jar:classes2.jar:a8/r0$b.class */
    public static final class b {

        /* renamed from: a */
        public int f539a;

        /* renamed from: b */
        public long f540b;

        /* renamed from: c */
        public InterfaceC4337t.a f541c;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/r0$c.class
     */
    /* renamed from: a8.r0$c */
    /* loaded from: combined.jar:classes2.jar:a8/r0$c.class */
    public static final class c {

        /* renamed from: a */
        public final C7629w0 f542a;

        /* renamed from: b */
        public final InterfaceC9292z.b f543b;

        public c(C7629w0 c7629w0, InterfaceC9292z.b bVar) {
            this.f542a = c7629w0;
            this.f543b = bVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/r0$d.class
     */
    /* renamed from: a8.r0$d */
    /* loaded from: combined.jar:classes2.jar:a8/r0$d.class */
    public interface d {
        /* renamed from: t */
        void mo490t(C7629w0 c7629w0);
    }

    public C0118r0(InterfaceC0832b interfaceC0832b, Looper looper, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar) {
        this.f518f = looper;
        this.f516d = interfaceC9292z;
        this.f517e = aVar;
        this.f513a = new C0114p0(interfaceC0832b);
    }

    /* renamed from: L */
    public static /* synthetic */ void m569L(c cVar) {
        cVar.f543b.release();
    }

    /* renamed from: k */
    public static C0118r0 m571k(InterfaceC0832b interfaceC0832b, Looper looper, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar) {
        return new C0118r0(interfaceC0832b, (Looper) C4349a.m21882e(looper), (InterfaceC9292z) C4349a.m21882e(interfaceC9292z), (InterfaceC9290x.a) C4349a.m21882e(aVar));
    }

    /* renamed from: l */
    public static C0118r0 m572l(InterfaceC0832b interfaceC0832b) {
        return new C0118r0(interfaceC0832b, null, null, null);
    }

    /* renamed from: A */
    public final long m573A() {
        long max;
        synchronized (this) {
            max = Math.max(this.f534v, m574B(this.f532t));
        }
        return max;
    }

    /* renamed from: B */
    public final long m574B(int i10) {
        long j10;
        long j11 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int m576D = m576D(i10 - 1);
        int i11 = 0;
        while (true) {
            j10 = j11;
            if (i11 >= i10) {
                break;
            }
            j11 = Math.max(j11, this.f527o[m576D]);
            if ((this.f526n[m576D] & 1) != 0) {
                j10 = j11;
                break;
            }
            int i12 = m576D - 1;
            m576D = i12;
            if (i12 == -1) {
                m576D = this.f522j - 1;
            }
            i11++;
        }
        return j10;
    }

    /* renamed from: C */
    public final int m575C() {
        return this.f530r + this.f532t;
    }

    /* renamed from: D */
    public final int m576D(int i10) {
        int i11 = this.f531s + i10;
        int i12 = this.f522j;
        if (i11 >= i12) {
            i11 -= i12;
        }
        return i11;
    }

    /* renamed from: E */
    public final int m577E(long j10, boolean z10) {
        synchronized (this) {
            int m576D = m576D(this.f532t);
            if (m580H() && j10 >= this.f527o[m576D]) {
                if (j10 > this.f535w && z10) {
                    return this.f529q - this.f532t;
                }
                int m623v = m623v(m576D, this.f529q - this.f532t, j10, true);
                if (m623v == -1) {
                    return 0;
                }
                return m623v;
            }
            return 0;
        }
    }

    /* renamed from: F */
    public final C7629w0 m578F() {
        C7629w0 c7629w0;
        synchronized (this) {
            c7629w0 = this.f538z ? null : this.f507C;
        }
        return c7629w0;
    }

    /* renamed from: G */
    public final int m579G() {
        return this.f530r + this.f529q;
    }

    /* renamed from: H */
    public final boolean m580H() {
        return this.f532t != this.f529q;
    }

    /* renamed from: I */
    public final void m581I() {
        this.f505A = true;
    }

    /* renamed from: J */
    public final boolean m582J() {
        boolean z10;
        synchronized (this) {
            z10 = this.f536x;
        }
        return z10;
    }

    /* renamed from: K */
    public boolean m583K(boolean z10) {
        synchronized (this) {
            if (m580H()) {
                if (this.f515c.m657e(m575C()).f542a != this.f520h) {
                    return true;
                }
                return m584M(m576D(this.f532t));
            }
            boolean z11 = true;
            if (!z10) {
                z11 = true;
                if (!this.f536x) {
                    C7629w0 c7629w0 = this.f507C;
                    z11 = (c7629w0 == null || c7629w0 == this.f520h) ? false : true;
                }
            }
            return z11;
        }
    }

    /* renamed from: M */
    public final boolean m584M(int i10) {
        InterfaceC9277p interfaceC9277p = this.f521i;
        return interfaceC9277p == null || interfaceC9277p.getState() == 4 || ((this.f526n[i10] & NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH) == 0 && this.f521i.mo39025c());
    }

    /* renamed from: N */
    public void m585N() {
        InterfaceC9277p interfaceC9277p = this.f521i;
        if (interfaceC9277p != null && interfaceC9277p.getState() == 1) {
            throw ((InterfaceC9277p.a) C4349a.m21882e(this.f521i.getError()));
        }
    }

    /* renamed from: O */
    public final void m586O(C7629w0 c7629w0, C7632x0 c7632x0) {
        C7629w0 c7629w02 = this.f520h;
        boolean z10 = c7629w02 == null;
        C9273n c9273n = z10 ? null : c7629w02.f37089p;
        this.f520h = c7629w0;
        C9273n c9273n2 = c7629w0.f37089p;
        InterfaceC9292z interfaceC9292z = this.f516d;
        c7632x0.f37132b = interfaceC9292z != null ? c7629w0.m33158c(interfaceC9292z.mo39088a(c7629w0)) : c7629w0;
        c7632x0.f37131a = this.f521i;
        if (this.f516d == null) {
            return;
        }
        if (z10 || !C4401z0.m22371c(c9273n, c9273n2)) {
            InterfaceC9277p interfaceC9277p = this.f521i;
            InterfaceC9277p mo39090c = this.f516d.mo39090c((Looper) C4349a.m21882e(this.f518f), this.f517e, c7629w0);
            this.f521i = mo39090c;
            c7632x0.f37131a = mo39090c;
            if (interfaceC9277p != null) {
                interfaceC9277p.mo39028f(this.f517e);
            }
        }
    }

    /* renamed from: P */
    public final int m587P(C7632x0 c7632x0, C8638f c8638f, boolean z10, boolean z11, b bVar) {
        synchronized (this) {
            c8638f.f40328d = false;
            if (!m580H()) {
                if (!z11 && !this.f536x) {
                    C7629w0 c7629w0 = this.f507C;
                    if (c7629w0 == null || (!z10 && c7629w0 == this.f520h)) {
                        return -3;
                    }
                    m586O((C7629w0) C4349a.m21882e(c7629w0), c7632x0);
                    return -5;
                }
                c8638f.setFlags(4);
                return -4;
            }
            C7629w0 c7629w02 = this.f515c.m657e(m575C()).f542a;
            if (!z10 && c7629w02 == this.f520h) {
                int m576D = m576D(this.f532t);
                if (!m584M(m576D)) {
                    c8638f.f40328d = true;
                    return -3;
                }
                c8638f.setFlags(this.f526n[m576D]);
                long j10 = this.f527o[m576D];
                c8638f.f40329e = j10;
                if (j10 < this.f533u) {
                    c8638f.addFlag(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
                }
                bVar.f539a = this.f525m[m576D];
                bVar.f540b = this.f524l[m576D];
                bVar.f541c = this.f528p[m576D];
                return -4;
            }
            m586O(c7629w02, c7632x0);
            return -5;
        }
    }

    /* renamed from: Q */
    public final int m588Q() {
        int i10;
        synchronized (this) {
            i10 = m580H() ? this.f523k[m576D(this.f532t)] : this.f508D;
        }
        return i10;
    }

    /* renamed from: R */
    public void m589R() {
        m619r();
        m592U();
    }

    /* renamed from: S */
    public int m590S(C7632x0 c7632x0, C8638f c8638f, int i10, boolean z10) {
        boolean z11 = false;
        int m587P = m587P(c7632x0, c8638f, (i10 & 2) != 0, z10, this.f514b);
        if (m587P == -4 && !c8638f.isEndOfStream()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                C0114p0 c0114p0 = this.f513a;
                b bVar = this.f514b;
                if (z11) {
                    c0114p0.m547f(c8638f, bVar);
                } else {
                    c0114p0.m550m(c8638f, bVar);
                }
            }
            if (!z11) {
                this.f532t++;
            }
        }
        return m587P;
    }

    /* renamed from: T */
    public void m591T() {
        m594W(true);
        m592U();
    }

    /* renamed from: U */
    public final void m592U() {
        InterfaceC9277p interfaceC9277p = this.f521i;
        if (interfaceC9277p != null) {
            interfaceC9277p.mo39028f(this.f517e);
            this.f521i = null;
            this.f520h = null;
        }
    }

    /* renamed from: V */
    public final void m593V() {
        m594W(false);
    }

    /* renamed from: W */
    public void m594W(boolean z10) {
        this.f513a.m551n();
        this.f529q = 0;
        this.f530r = 0;
        this.f531s = 0;
        this.f532t = 0;
        this.f537y = true;
        this.f533u = Long.MIN_VALUE;
        this.f534v = Long.MIN_VALUE;
        this.f535w = Long.MIN_VALUE;
        this.f536x = false;
        this.f515c.m654b();
        if (z10) {
            this.f506B = null;
            this.f507C = null;
            this.f538z = true;
        }
    }

    /* renamed from: X */
    public final void m595X() {
        synchronized (this) {
            this.f532t = 0;
            this.f513a.m552o();
        }
    }

    /* renamed from: Y */
    public final boolean m596Y(int i10) {
        boolean z10;
        synchronized (this) {
            m595X();
            int i11 = this.f530r;
            if (i10 >= i11 && i10 <= this.f529q + i11) {
                this.f533u = Long.MIN_VALUE;
                this.f532t = i10 - i11;
                z10 = true;
            }
            z10 = false;
        }
        return z10;
    }

    /* renamed from: Z */
    public final boolean m597Z(long j10, boolean z10) {
        synchronized (this) {
            m595X();
            int m576D = m576D(this.f532t);
            if (!m580H() || j10 < this.f527o[m576D] || (j10 > this.f535w && !z10)) {
                return false;
            }
            int m623v = m623v(m576D, this.f529q - this.f532t, j10, true);
            if (m623v == -1) {
                return false;
            }
            this.f533u = j10;
            this.f532t += m623v;
            return true;
        }
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: a */
    public final void mo598a(C4361f0 c4361f0, int i10, int i11) {
        this.f513a.m554q(c4361f0, i10);
    }

    /* renamed from: a0 */
    public final void m599a0(long j10) {
        if (this.f511G != j10) {
            this.f511G = j10;
            m581I();
        }
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: b */
    public void mo600b(long j10, int i10, int i11, int i12, InterfaceC4337t.a aVar) {
        if (this.f505A) {
            mo608f((C7629w0) C4349a.m21886i(this.f506B));
        }
        int i13 = i10 & 1;
        boolean z10 = i13 != 0;
        if (this.f537y) {
            if (!z10) {
                return;
            } else {
                this.f537y = false;
            }
        }
        long j11 = this.f511G + j10;
        if (this.f509E) {
            if (j11 < this.f533u) {
                return;
            }
            if (i13 == 0) {
                if (!this.f510F) {
                    C4392v.m22275i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f507C);
                    this.f510F = true;
                }
                i10 |= 1;
            }
        }
        if (this.f512H) {
            if (!z10 || !m611h(j11)) {
                return;
            } else {
                this.f512H = false;
            }
        }
        m612i(j11, i10, (this.f513a.m546e() - i11) - i12, i11, aVar);
    }

    /* renamed from: b0 */
    public final void m601b0(long j10) {
        this.f533u = j10;
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: c */
    public final int mo602c(InterfaceC0846i interfaceC0846i, int i10, boolean z10, int i11) {
        return this.f513a.m553p(interfaceC0846i, i10, z10);
    }

    /* renamed from: c0 */
    public final boolean m603c0(C7629w0 c7629w0) {
        synchronized (this) {
            this.f538z = false;
            if (C4401z0.m22371c(c7629w0, this.f507C)) {
                return false;
            }
            C7629w0 c7629w02 = c7629w0;
            if (!this.f515c.m659g()) {
                c7629w02 = c7629w0;
                if (this.f515c.m658f().f542a.equals(c7629w0)) {
                    c7629w02 = this.f515c.m658f().f542a;
                }
            }
            this.f507C = c7629w02;
            C7629w0 c7629w03 = this.f507C;
            this.f509E = C4400z.m22293a(c7629w03.f37086m, c7629w03.f37083j);
            this.f510F = false;
            return true;
        }
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: d */
    public /* synthetic */ int mo604d(InterfaceC0846i interfaceC0846i, int i10, boolean z10) {
        return C4336s.m21841a(this, interfaceC0846i, i10, z10);
    }

    /* renamed from: d0 */
    public final void m605d0(d dVar) {
        this.f519g = dVar;
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: e */
    public /* synthetic */ void mo606e(C4361f0 c4361f0, int i10) {
        C4336s.m21842b(this, c4361f0, i10);
    }

    /* renamed from: e0 */
    public final void m607e0(int i10) {
        boolean z10;
        synchronized (this) {
            if (i10 >= 0) {
                if (this.f532t + i10 <= this.f529q) {
                    z10 = true;
                    C4349a.m21878a(z10);
                    this.f532t += i10;
                }
            }
            z10 = false;
            C4349a.m21878a(z10);
            this.f532t += i10;
        }
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: f */
    public final void mo608f(C7629w0 c7629w0) {
        C7629w0 mo624w = mo624w(c7629w0);
        this.f505A = false;
        this.f506B = c7629w0;
        boolean m603c0 = m603c0(mo624w);
        d dVar = this.f519g;
        if (dVar == null || !m603c0) {
            return;
        }
        dVar.mo490t(mo624w);
    }

    /* renamed from: f0 */
    public final void m609f0(int i10) {
        this.f508D = i10;
    }

    /* renamed from: g0 */
    public final void m610g0() {
        this.f512H = true;
    }

    /* renamed from: h */
    public final boolean m611h(long j10) {
        synchronized (this) {
            boolean z10 = true;
            if (this.f529q == 0) {
                if (j10 <= this.f534v) {
                    z10 = false;
                }
                return z10;
            }
            if (m573A() >= j10) {
                return false;
            }
            m621t(this.f530r + m613j(j10));
            return true;
        }
    }

    /* renamed from: i */
    public final void m612i(long j10, int i10, long j11, int i11, InterfaceC4337t.a aVar) {
        synchronized (this) {
            int i12 = this.f529q;
            if (i12 > 0) {
                int m576D = m576D(i12 - 1);
                C4349a.m21878a(this.f524l[m576D] + ((long) this.f525m[m576D]) <= j11);
            }
            this.f536x = (536870912 & i10) != 0;
            this.f535w = Math.max(this.f535w, j10);
            int m576D2 = m576D(this.f529q);
            this.f527o[m576D2] = j10;
            this.f524l[m576D2] = j11;
            this.f525m[m576D2] = i11;
            this.f526n[m576D2] = i10;
            this.f528p[m576D2] = aVar;
            this.f523k[m576D2] = this.f508D;
            if (this.f515c.m659g() || !this.f515c.m658f().f542a.equals(this.f507C)) {
                InterfaceC9292z interfaceC9292z = this.f516d;
                this.f515c.m653a(m579G(), new c((C7629w0) C4349a.m21882e(this.f507C), interfaceC9292z != null ? interfaceC9292z.mo39089b((Looper) C4349a.m21882e(this.f518f), this.f517e, this.f507C) : InterfaceC9292z.b.f42398a));
            }
            int i13 = this.f529q + 1;
            this.f529q = i13;
            int i14 = this.f522j;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                InterfaceC4337t.a[] aVarArr = new InterfaceC4337t.a[i15];
                int i16 = this.f531s;
                int i17 = i14 - i16;
                System.arraycopy(this.f524l, i16, jArr, 0, i17);
                System.arraycopy(this.f527o, this.f531s, jArr2, 0, i17);
                System.arraycopy(this.f526n, this.f531s, iArr2, 0, i17);
                System.arraycopy(this.f525m, this.f531s, iArr3, 0, i17);
                System.arraycopy(this.f528p, this.f531s, aVarArr, 0, i17);
                System.arraycopy(this.f523k, this.f531s, iArr, 0, i17);
                int i18 = this.f531s;
                System.arraycopy(this.f524l, 0, jArr, i17, i18);
                System.arraycopy(this.f527o, 0, jArr2, i17, i18);
                System.arraycopy(this.f526n, 0, iArr2, i17, i18);
                System.arraycopy(this.f525m, 0, iArr3, i17, i18);
                System.arraycopy(this.f528p, 0, aVarArr, i17, i18);
                System.arraycopy(this.f523k, 0, iArr, i17, i18);
                this.f524l = jArr;
                this.f527o = jArr2;
                this.f526n = iArr2;
                this.f525m = iArr3;
                this.f528p = aVarArr;
                this.f523k = iArr;
                this.f531s = 0;
                this.f522j = i15;
            }
        }
    }

    /* renamed from: j */
    public final int m613j(long j10) {
        int i10 = this.f529q;
        int m576D = m576D(i10 - 1);
        while (i10 > this.f532t && this.f527o[m576D] >= j10) {
            int i11 = i10 - 1;
            int i12 = m576D - 1;
            i10 = i11;
            m576D = i12;
            if (i12 == -1) {
                m576D = this.f522j - 1;
                i10 = i11;
            }
        }
        return i10;
    }

    /* renamed from: m */
    public final long m614m(long j10, boolean z10, boolean z11) {
        synchronized (this) {
            int i10 = this.f529q;
            if (i10 != 0) {
                long[] jArr = this.f527o;
                int i11 = this.f531s;
                if (j10 >= jArr[i11]) {
                    int i12 = i10;
                    if (z11) {
                        int i13 = this.f532t;
                        i12 = i10;
                        if (i13 != i10) {
                            i12 = i13 + 1;
                        }
                    }
                    int m623v = m623v(i11, i12, j10, z10);
                    if (m623v == -1) {
                        return -1L;
                    }
                    return m617p(m623v);
                }
            }
            return -1L;
        }
    }

    /* renamed from: n */
    public final long m615n() {
        synchronized (this) {
            int i10 = this.f529q;
            if (i10 == 0) {
                return -1L;
            }
            return m617p(i10);
        }
    }

    /* renamed from: o */
    public long m616o() {
        synchronized (this) {
            int i10 = this.f532t;
            if (i10 == 0) {
                return -1L;
            }
            return m617p(i10);
        }
    }

    /* renamed from: p */
    public final long m617p(int i10) {
        this.f534v = Math.max(this.f534v, m574B(i10));
        this.f529q -= i10;
        int i11 = this.f530r + i10;
        this.f530r = i11;
        int i12 = this.f531s + i10;
        this.f531s = i12;
        int i13 = this.f522j;
        if (i12 >= i13) {
            this.f531s = i12 - i13;
        }
        int i14 = this.f532t - i10;
        this.f532t = i14;
        if (i14 < 0) {
            this.f532t = 0;
        }
        this.f515c.m656d(i11);
        if (this.f529q != 0) {
            return this.f524l[this.f531s];
        }
        int i15 = this.f531s;
        int i16 = i15;
        if (i15 == 0) {
            i16 = this.f522j;
        }
        return this.f524l[i16 - 1] + this.f525m[r7];
    }

    /* renamed from: q */
    public final void m618q(long j10, boolean z10, boolean z11) {
        this.f513a.m544b(m614m(j10, z10, z11));
    }

    /* renamed from: r */
    public final void m619r() {
        this.f513a.m544b(m615n());
    }

    /* renamed from: s */
    public final void m620s() {
        this.f513a.m544b(m616o());
    }

    /* renamed from: t */
    public final long m621t(int i10) {
        int m579G = m579G() - i10;
        C4349a.m21878a(m579G >= 0 && m579G <= this.f529q - this.f532t);
        int i11 = this.f529q - m579G;
        this.f529q = i11;
        this.f535w = Math.max(this.f534v, m574B(i11));
        boolean z10 = false;
        if (m579G == 0) {
            z10 = false;
            if (this.f536x) {
                z10 = true;
            }
        }
        this.f536x = z10;
        this.f515c.m655c(i10);
        int i12 = this.f529q;
        if (i12 == 0) {
            return 0L;
        }
        return this.f524l[m576D(i12 - 1)] + this.f525m[r0];
    }

    /* renamed from: u */
    public final void m622u(int i10) {
        this.f513a.m545c(m621t(i10));
    }

    /* renamed from: v */
    public final int m623v(int i10, int i11, long j10, boolean z10) {
        int i12;
        int i13 = -1;
        int i14 = i10;
        int i15 = 0;
        while (true) {
            i12 = i13;
            if (i15 >= i11) {
                break;
            }
            long j11 = this.f527o[i14];
            i12 = i13;
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f526n[i14] & 1) != 0) {
                if (j11 == j10) {
                    i12 = i15;
                    break;
                }
                i13 = i15;
            }
            int i16 = i14 + 1;
            i14 = i16;
            if (i16 == this.f522j) {
                i14 = 0;
            }
            i15++;
        }
        return i12;
    }

    /* renamed from: w */
    public C7629w0 mo624w(C7629w0 c7629w0) {
        C7629w0 c7629w02 = c7629w0;
        if (this.f511G != 0) {
            c7629w02 = c7629w0;
            if (c7629w0.f37090q != Long.MAX_VALUE) {
                c7629w02 = c7629w0.m33157b().m33224i0(c7629w0.f37090q + this.f511G).m33194E();
            }
        }
        return c7629w02;
    }

    /* renamed from: x */
    public final int m625x() {
        return this.f530r;
    }

    /* renamed from: y */
    public final long m626y() {
        long j10;
        synchronized (this) {
            j10 = this.f529q == 0 ? Long.MIN_VALUE : this.f527o[this.f531s];
        }
        return j10;
    }

    /* renamed from: z */
    public final long m627z() {
        long j10;
        synchronized (this) {
            j10 = this.f535w;
        }
        return j10;
    }
}
