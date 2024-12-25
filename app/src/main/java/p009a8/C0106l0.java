package p009a8;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p009a8.C0109n;
import p009a8.C0118r0;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0121t;
import p027b9.C0839e0;
import p027b9.C0849j0;
import p027b9.C0858p;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0854m;
import p057d7.C4334q;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4360f;
import p059d9.C4361f0;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.C7558a2;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8638f;
import p348u7.C8798b;
import p365v6.InterfaceC9290x;
import p365v6.InterfaceC9292z;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/l0.class
 */
/* renamed from: a8.l0 */
/* loaded from: combined.jar:classes2.jar:a8/l0.class */
public final class C0106l0 implements InterfaceC0121t, InterfaceC4325h, C0839e0.b<a>, C0839e0.f, C0118r0.d {

    /* renamed from: N */
    public static final Map<String, String> f364N = m453L();

    /* renamed from: O */
    public static final C7629w0 f365O = new C7629w0.b().m33208S("icy").m33220e0("application/x-icy").m33194E();

    /* renamed from: B */
    public boolean f367B;

    /* renamed from: D */
    public boolean f369D;

    /* renamed from: E */
    public boolean f370E;

    /* renamed from: F */
    public int f371F;

    /* renamed from: H */
    public long f373H;

    /* renamed from: J */
    public boolean f375J;

    /* renamed from: K */
    public int f376K;

    /* renamed from: L */
    public boolean f377L;

    /* renamed from: M */
    public boolean f378M;

    /* renamed from: b */
    public final Uri f379b;

    /* renamed from: c */
    public final InterfaceC0854m f380c;

    /* renamed from: d */
    public final InterfaceC9292z f381d;

    /* renamed from: e */
    public final InterfaceC0837d0 f382e;

    /* renamed from: f */
    public final InterfaceC0090d0.a f383f;

    /* renamed from: g */
    public final InterfaceC9290x.a f384g;

    /* renamed from: h */
    public final b f385h;

    /* renamed from: i */
    public final InterfaceC0832b f386i;

    /* renamed from: j */
    public final String f387j;

    /* renamed from: k */
    public final long f388k;

    /* renamed from: m */
    public final InterfaceC0098h0 f390m;

    /* renamed from: r */
    public InterfaceC0121t.a f395r;

    /* renamed from: s */
    public C8798b f396s;

    /* renamed from: v */
    public boolean f399v;

    /* renamed from: w */
    public boolean f400w;

    /* renamed from: x */
    public boolean f401x;

    /* renamed from: y */
    public e f402y;

    /* renamed from: z */
    public InterfaceC2348g f403z;

    /* renamed from: l */
    public final C0839e0 f389l = new C0839e0("ProgressiveMediaPeriod");

    /* renamed from: n */
    public final C4360f f391n = new C4360f();

    /* renamed from: o */
    public final Runnable f392o = new Runnable(this) { // from class: a8.i0

        /* renamed from: b */
        public final C0106l0 f349b;

        {
            this.f349b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f349b.m468T();
        }
    };

    /* renamed from: p */
    public final Runnable f393p = new Runnable(this) { // from class: a8.j0

        /* renamed from: b */
        public final C0106l0 f350b;

        {
            this.f350b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f350b.m454R();
        }
    };

    /* renamed from: q */
    public final Handler f394q = C4401z0.m22421y();

    /* renamed from: u */
    public d[] f398u = new d[0];

    /* renamed from: t */
    public C0118r0[] f397t = new C0118r0[0];

    /* renamed from: I */
    public long f374I = -9223372036854775807L;

    /* renamed from: G */
    public long f372G = -1;

    /* renamed from: A */
    public long f366A = -9223372036854775807L;

    /* renamed from: C */
    public int f368C = 1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/l0$a.class
     */
    /* renamed from: a8.l0$a */
    /* loaded from: combined.jar:classes2.jar:a8/l0$a.class */
    public final class a implements C0839e0.e, C0109n.a {

        /* renamed from: b */
        public final Uri f405b;

        /* renamed from: c */
        public final C0849j0 f406c;

        /* renamed from: d */
        public final InterfaceC0098h0 f407d;

        /* renamed from: e */
        public final InterfaceC4325h f408e;

        /* renamed from: f */
        public final C4360f f409f;

        /* renamed from: h */
        public volatile boolean f411h;

        /* renamed from: j */
        public long f413j;

        /* renamed from: m */
        public InterfaceC4337t f416m;

        /* renamed from: n */
        public boolean f417n;

        /* renamed from: o */
        public final C0106l0 f418o;

        /* renamed from: g */
        public final C4334q f410g = new C4334q();

        /* renamed from: i */
        public boolean f412i = true;

        /* renamed from: l */
        public long f415l = -1;

        /* renamed from: a */
        public final long f404a = C0111o.m525a();

        /* renamed from: k */
        public C0858p f414k = m501j(0);

        public a(C0106l0 c0106l0, Uri uri, InterfaceC0854m interfaceC0854m, InterfaceC0098h0 interfaceC0098h0, InterfaceC4325h interfaceC4325h, C4360f c4360f) {
            this.f418o = c0106l0;
            this.f405b = uri;
            this.f406c = new C0849j0(interfaceC0854m);
            this.f407d = interfaceC0098h0;
            this.f408e = interfaceC4325h;
            this.f409f = c4360f;
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // p027b9.C0839e0.e
        /* renamed from: a */
        public void mo498a() {
            /*
                Method dump skipped, instructions count: 586
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p009a8.C0106l0.a.mo498a():void");
        }

        @Override // p009a8.C0109n.a
        /* renamed from: b */
        public void mo499b(C4361f0 c4361f0) {
            long max = !this.f417n ? this.f413j : Math.max(this.f418o.m464N(), this.f413j);
            int m21985a = c4361f0.m21985a();
            InterfaceC4337t interfaceC4337t = (InterfaceC4337t) C4349a.m21882e(this.f416m);
            interfaceC4337t.mo606e(c4361f0, m21985a);
            interfaceC4337t.mo600b(max, 1, m21985a, 0, null);
            this.f417n = true;
        }

        @Override // p027b9.C0839e0.e
        /* renamed from: c */
        public void mo500c() {
            this.f411h = true;
        }

        /* renamed from: j */
        public final C0858p m501j(long j10) {
            return new C0858p.b().m5391i(this.f405b).m5390h(j10).m5388f(this.f418o.f387j).m5384b(6).m5387e(C0106l0.f364N).m5383a();
        }

        /* renamed from: k */
        public final void m502k(long j10, long j11) {
            this.f410g.f26491a = j10;
            this.f413j = j11;
            this.f412i = true;
            this.f417n = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/l0$b.class
     */
    /* renamed from: a8.l0$b */
    /* loaded from: combined.jar:classes2.jar:a8/l0$b.class */
    public interface b {
        /* renamed from: j */
        void mo503j(long j10, boolean z10, boolean z11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/l0$c.class
     */
    /* renamed from: a8.l0$c */
    /* loaded from: combined.jar:classes2.jar:a8/l0$c.class */
    public final class c implements InterfaceC0120s0 {

        /* renamed from: b */
        public final int f419b;

        /* renamed from: c */
        public final C0106l0 f420c;

        public c(C0106l0 c0106l0, int i10) {
            this.f420c = c0106l0;
            this.f419b = i10;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: a */
        public void mo354a() {
            this.f420c.m472X(this.f419b);
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: e */
        public boolean mo356e() {
            return this.f420c.m467Q(this.f419b);
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: p */
        public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
            return this.f420c.m477c0(this.f419b, c7632x0, c8638f, i10);
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: t */
        public int mo358t(long j10) {
            return this.f420c.m482g0(this.f419b, j10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/l0$d.class
     */
    /* renamed from: a8.l0$d */
    /* loaded from: combined.jar:classes2.jar:a8/l0$d.class */
    public static final class d {

        /* renamed from: a */
        public final int f421a;

        /* renamed from: b */
        public final boolean f422b;

        public d(int i10, boolean z10) {
            this.f421a = i10;
            this.f422b = z10;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f421a != dVar.f421a || this.f422b != dVar.f422b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (this.f421a * 31) + (this.f422b ? 1 : 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/l0$e.class
     */
    /* renamed from: a8.l0$e */
    /* loaded from: combined.jar:classes2.jar:a8/l0$e.class */
    public static final class e {

        /* renamed from: a */
        public final C0083a1 f423a;

        /* renamed from: b */
        public final boolean[] f424b;

        /* renamed from: c */
        public final boolean[] f425c;

        /* renamed from: d */
        public final boolean[] f426d;

        public e(C0083a1 c0083a1, boolean[] zArr) {
            this.f423a = c0083a1;
            this.f424b = zArr;
            int i10 = c0083a1.f261b;
            this.f425c = new boolean[i10];
            this.f426d = new boolean[i10];
        }
    }

    public C0106l0(Uri uri, InterfaceC0854m interfaceC0854m, InterfaceC0098h0 interfaceC0098h0, InterfaceC9292z interfaceC9292z, InterfaceC9290x.a aVar, InterfaceC0837d0 interfaceC0837d0, InterfaceC0090d0.a aVar2, b bVar, InterfaceC0832b interfaceC0832b, String str, int i10) {
        this.f379b = uri;
        this.f380c = interfaceC0854m;
        this.f381d = interfaceC9292z;
        this.f384g = aVar;
        this.f382e = interfaceC0837d0;
        this.f383f = aVar2;
        this.f385h = bVar;
        this.f386i = interfaceC0832b;
        this.f387j = str;
        this.f388k = i10;
        this.f390m = interfaceC0098h0;
    }

    /* renamed from: A */
    public static /* synthetic */ Handler m445A(C0106l0 c0106l0) {
        return c0106l0.f394q;
    }

    /* renamed from: E */
    public static /* synthetic */ C8798b m449E(C0106l0 c0106l0) {
        return c0106l0.f396s;
    }

    /* renamed from: F */
    public static /* synthetic */ C8798b m450F(C0106l0 c0106l0, C8798b c8798b) {
        c0106l0.f396s = c8798b;
        return c8798b;
    }

    /* renamed from: G */
    public static /* synthetic */ C7629w0 m451G() {
        return f365O;
    }

    /* renamed from: H */
    public static /* synthetic */ long m452H(C0106l0 c0106l0) {
        return c0106l0.f388k;
    }

    /* renamed from: L */
    public static Map<String, String> m453L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m454R() {
        if (this.f378M) {
            return;
        }
        ((InterfaceC0121t.a) C4349a.m21882e(this.f395r)).mo334a(this);
    }

    /* renamed from: z */
    public static /* synthetic */ Runnable m459z(C0106l0 c0106l0) {
        return c0106l0.f393p;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: I */
    public final void m460I() {
        C4349a.m21884g(this.f400w);
        C4349a.m21882e(this.f402y);
        C4349a.m21882e(this.f403z);
    }

    /* renamed from: J */
    public final boolean m461J(a aVar, int i10) {
        InterfaceC2348g interfaceC2348g;
        if (this.f372G != -1 || ((interfaceC2348g = this.f403z) != null && interfaceC2348g.mo12036i() != -9223372036854775807L)) {
            this.f376K = i10;
            return true;
        }
        if (this.f400w && !m484i0()) {
            this.f375J = true;
            return false;
        }
        this.f370E = this.f400w;
        this.f373H = 0L;
        this.f376K = 0;
        for (C0118r0 c0118r0 : this.f397t) {
            c0118r0.m593V();
        }
        aVar.m502k(0L, 0L);
        return true;
    }

    /* renamed from: K */
    public final void m462K(a aVar) {
        if (this.f372G == -1) {
            this.f372G = aVar.f415l;
        }
    }

    /* renamed from: M */
    public final int m463M() {
        int i10 = 0;
        for (C0118r0 c0118r0 : this.f397t) {
            i10 += c0118r0.m579G();
        }
        return i10;
    }

    /* renamed from: N */
    public final long m464N() {
        long j10 = Long.MIN_VALUE;
        for (C0118r0 c0118r0 : this.f397t) {
            j10 = Math.max(j10, c0118r0.m627z());
        }
        return j10;
    }

    /* renamed from: O */
    public InterfaceC4337t m465O() {
        return m476b0(new d(0, true));
    }

    /* renamed from: P */
    public final boolean m466P() {
        return this.f374I != -9223372036854775807L;
    }

    /* renamed from: Q */
    public boolean m467Q(int i10) {
        return !m484i0() && this.f397t[i10].m583K(this.f377L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r11.f398u[r12].f422b != false) goto L34;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m468T() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0106l0.m468T():void");
    }

    /* renamed from: U */
    public final void m469U(int i10) {
        m460I();
        e eVar = this.f402y;
        boolean[] zArr = eVar.f426d;
        if (zArr[i10]) {
            return;
        }
        C7629w0 m663b = eVar.f423a.m323b(i10).m663b(0);
        this.f383f.m385i(C4400z.m22304l(m663b.f37086m), m663b, 0, null, this.f373H);
        zArr[i10] = true;
    }

    /* renamed from: V */
    public final void m470V(int i10) {
        m460I();
        boolean[] zArr = this.f402y.f424b;
        if (this.f375J && zArr[i10]) {
            C0118r0 c0118r0 = this.f397t[i10];
            if (c0118r0.m583K(false)) {
                return;
            }
            this.f374I = 0L;
            this.f375J = false;
            this.f370E = true;
            this.f373H = 0L;
            this.f376K = 0;
            for (C0118r0 c0118r02 : this.f397t) {
                c0118r02.m593V();
            }
            ((InterfaceC0121t.a) C4349a.m21882e(this.f395r)).mo334a(this);
        }
    }

    /* renamed from: W */
    public void m471W() {
        this.f389l.m5325k(this.f382e.mo5311b(this.f368C));
    }

    /* renamed from: X */
    public void m472X(int i10) {
        this.f397t[i10].m585N();
        m471W();
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo485k(a aVar, long j10, long j11, boolean z10) {
        C0849j0 c0849j0 = aVar.f406c;
        C0111o c0111o = new C0111o(aVar.f404a, aVar.f414k, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, c0849j0.m5363h());
        this.f382e.mo5313d(aVar.f404a);
        this.f383f.m388r(c0111o, 1, -1, null, 0, null, aVar.f413j, this.f366A);
        if (z10) {
            return;
        }
        m462K(aVar);
        for (C0118r0 c0118r0 : this.f397t) {
            c0118r0.m593V();
        }
        if (this.f371F > 0) {
            ((InterfaceC0121t.a) C4349a.m21882e(this.f395r)).mo334a(this);
        }
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo489r(a aVar, long j10, long j11) {
        InterfaceC2348g interfaceC2348g;
        if (this.f366A == -9223372036854775807L && (interfaceC2348g = this.f403z) != null) {
            boolean mo12035g = interfaceC2348g.mo12035g();
            long m464N = m464N();
            long j12 = m464N == Long.MIN_VALUE ? 0L : m464N + 10000;
            this.f366A = j12;
            this.f385h.mo503j(j12, mo12035g, this.f367B);
        }
        C0849j0 c0849j0 = aVar.f406c;
        C0111o c0111o = new C0111o(aVar.f404a, aVar.f414k, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, c0849j0.m5363h());
        this.f382e.mo5313d(aVar.f404a);
        this.f383f.m391u(c0111o, 1, -1, null, 0, null, aVar.f413j, this.f366A);
        m462K(aVar);
        this.f377L = true;
        ((InterfaceC0121t.a) C4349a.m21882e(this.f395r)).mo334a(this);
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C0839e0.c mo486o(a aVar, long j10, long j11, IOException iOException, int i10) {
        C0839e0.c m5319h;
        m462K(aVar);
        C0849j0 c0849j0 = aVar.f406c;
        C0111o c0111o = new C0111o(aVar.f404a, aVar.f414k, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, c0849j0.m5363h());
        long mo5310a = this.f382e.mo5310a(new InterfaceC0837d0.c(c0111o, new C0117r(1, -1, null, 0, null, C7583h.m32761e(aVar.f413j), C7583h.m32761e(this.f366A)), iOException, i10));
        if (mo5310a == -9223372036854775807L) {
            m5319h = C0839e0.f5771g;
        } else {
            int m463M = m463M();
            m5319h = m461J(aVar, m463M) ? C0839e0.m5319h(m463M > this.f376K, mo5310a) : C0839e0.f5770f;
        }
        boolean z10 = !m5319h.m5331c();
        this.f383f.m393w(c0111o, 1, -1, null, 0, null, aVar.f413j, this.f366A, iOException, z10);
        if (z10) {
            this.f382e.mo5313d(aVar.f404a);
        }
        return m5319h;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f389l.m5324j() && this.f391n.m21966e();
    }

    /* renamed from: b0 */
    public final InterfaceC4337t m476b0(d dVar) {
        int length = this.f397t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f398u[i10])) {
                return this.f397t[i10];
            }
        }
        C0118r0 m571k = C0118r0.m571k(this.f386i, this.f394q.getLooper(), this.f381d, this.f384g);
        m571k.m605d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f398u, i11);
        dVarArr[length] = dVar;
        this.f398u = (d[]) C4401z0.m22393k(dVarArr);
        C0118r0[] c0118r0Arr = (C0118r0[]) Arrays.copyOf(this.f397t, i11);
        c0118r0Arr[length] = m571k;
        this.f397t = (C0118r0[]) C4401z0.m22393k(c0118r0Arr);
        return m571k;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        return this.f371F == 0 ? Long.MIN_VALUE : mo340g();
    }

    /* renamed from: c0 */
    public int m477c0(int i10, C7632x0 c7632x0, C8638f c8638f, int i11) {
        if (m484i0()) {
            return -3;
        }
        m469U(i10);
        int m590S = this.f397t[i10].m590S(c7632x0, c8638f, i11, this.f377L);
        if (m590S == -3) {
            m470V(i10);
        }
        return m590S;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        if (this.f377L || this.f389l.m5323i() || this.f375J) {
            return false;
        }
        if (this.f400w && this.f371F == 0) {
            return false;
        }
        boolean m21967f = this.f391n.m21967f();
        if (!this.f389l.m5324j()) {
            m483h0();
            m21967f = true;
        }
        return m21967f;
    }

    /* renamed from: d0 */
    public void m478d0() {
        if (this.f400w) {
            for (C0118r0 c0118r0 : this.f397t) {
                c0118r0.m589R();
            }
        }
        this.f389l.m5327m(this);
        this.f394q.removeCallbacksAndMessages(null);
        this.f395r = null;
        this.f378M = true;
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: e */
    public InterfaceC4337t mo479e(int i10, int i11) {
        return m476b0(new d(i10, false));
    }

    /* renamed from: e0 */
    public final boolean m480e0(boolean[] zArr, long j10) {
        int length = this.f397t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f397t[i10].m597Z(j10, false) && (zArr[i10] || !this.f401x)) {
                return false;
            }
        }
        return true;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: f */
    public long mo339f(long j10, C7558a2 c7558a2) {
        m460I();
        if (!this.f403z.mo12035g()) {
            return 0L;
        }
        InterfaceC2348g.a mo12034e = this.f403z.mo12034e(j10);
        return c7558a2.m32340a(j10, mo12034e.f13808a.f26493a, mo12034e.f13809b.f26493a);
    }

    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final void m455S(InterfaceC2348g interfaceC2348g) {
        this.f403z = this.f396s == null ? interfaceC2348g : new InterfaceC2348g.b(-9223372036854775807L);
        this.f366A = interfaceC2348g.mo12036i();
        int i10 = 1;
        boolean z10 = this.f372G == -1 && interfaceC2348g.mo12036i() == -9223372036854775807L;
        this.f367B = z10;
        if (z10) {
            i10 = 7;
        }
        this.f368C = i10;
        this.f385h.mo503j(this.f366A, interfaceC2348g.mo12035g(), this.f367B);
        if (this.f400w) {
            return;
        }
        m468T();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        long j10;
        m460I();
        boolean[] zArr = this.f402y.f424b;
        if (this.f377L) {
            return Long.MIN_VALUE;
        }
        if (m466P()) {
            return this.f374I;
        }
        if (this.f401x) {
            int length = this.f397t.length;
            int i10 = 0;
            long j11 = Long.MAX_VALUE;
            while (true) {
                long j12 = j11;
                j10 = j12;
                if (i10 >= length) {
                    break;
                }
                long j13 = j12;
                if (zArr[i10]) {
                    j13 = j12;
                    if (!this.f397t[i10].m582J()) {
                        j13 = Math.min(j12, this.f397t[i10].m627z());
                    }
                }
                i10++;
                j11 = j13;
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        long j14 = j10;
        if (j10 == Long.MAX_VALUE) {
            j14 = m464N();
        }
        long j15 = j14;
        if (j14 == Long.MIN_VALUE) {
            j15 = this.f373H;
        }
        return j15;
    }

    /* renamed from: g0 */
    public int m482g0(int i10, long j10) {
        if (m484i0()) {
            return 0;
        }
        m469U(i10);
        C0118r0 c0118r0 = this.f397t[i10];
        int m577E = c0118r0.m577E(j10, this.f377L);
        c0118r0.m607e0(m577E);
        if (m577E == 0) {
            m470V(i10);
        }
        return m577E;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
    }

    /* renamed from: h0 */
    public final void m483h0() {
        a aVar = new a(this, this.f379b, this.f380c, this.f390m, this, this.f391n);
        if (this.f400w) {
            C4349a.m21884g(m466P());
            long j10 = this.f366A;
            if (j10 != -9223372036854775807L && this.f374I > j10) {
                this.f377L = true;
                this.f374I = -9223372036854775807L;
                return;
            }
            aVar.m502k(((InterfaceC2348g) C4349a.m21882e(this.f403z)).mo12034e(this.f374I).f13808a.f26494b, this.f374I);
            for (C0118r0 c0118r0 : this.f397t) {
                c0118r0.m601b0(this.f374I);
            }
            this.f374I = -9223372036854775807L;
        }
        this.f376K = m463M();
        this.f383f.m377A(new C0111o(aVar.f404a, aVar.f414k, this.f389l.m5328n(aVar, this, this.f382e.mo5311b(this.f368C))), 1, -1, null, 0, null, aVar.f413j, this.f366A);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: i */
    public /* synthetic */ List mo342i(List list) {
        return C0119s.m628a(this, list);
    }

    /* renamed from: i0 */
    public final boolean m484i0() {
        return this.f370E || m466P();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: j */
    public long mo343j(long j10) {
        m460I();
        boolean[] zArr = this.f402y.f424b;
        if (!this.f403z.mo12035g()) {
            j10 = 0;
        }
        this.f370E = false;
        this.f373H = j10;
        if (m466P()) {
            this.f374I = j10;
            return j10;
        }
        if (this.f368C != 7 && m480e0(zArr, j10)) {
            return j10;
        }
        this.f375J = false;
        this.f374I = j10;
        this.f377L = false;
        if (this.f389l.m5324j()) {
            for (C0118r0 c0118r0 : this.f397t) {
                c0118r0.m619r();
            }
            this.f389l.m5321f();
        } else {
            this.f389l.m5322g();
            for (C0118r0 c0118r02 : this.f397t) {
                c0118r02.m593V();
            }
        }
        return j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: l */
    public void mo345l(InterfaceC0121t.a aVar, long j10) {
        this.f395r = aVar;
        this.f391n.m21967f();
        m483h0();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: m */
    public long mo346m(InterfaceC9884h[] interfaceC9884hArr, boolean[] zArr, InterfaceC0120s0[] interfaceC0120s0Arr, boolean[] zArr2, long j10) {
        boolean z10;
        long j11;
        m460I();
        e eVar = this.f402y;
        C0083a1 c0083a1 = eVar.f423a;
        boolean[] zArr3 = eVar.f425c;
        int i10 = this.f371F;
        for (int i11 = 0; i11 < interfaceC9884hArr.length; i11++) {
            InterfaceC0120s0 interfaceC0120s0 = interfaceC0120s0Arr[i11];
            if (interfaceC0120s0 != null && (interfaceC9884hArr[i11] == null || !zArr[i11])) {
                int i12 = ((c) interfaceC0120s0).f419b;
                C4349a.m21884g(zArr3[i12]);
                this.f371F--;
                zArr3[i12] = false;
                interfaceC0120s0Arr[i11] = null;
            }
        }
        boolean z11 = !this.f369D ? j10 == 0 : i10 != 0;
        int i13 = 0;
        while (true) {
            z10 = z11;
            if (i13 >= interfaceC9884hArr.length) {
                break;
            }
            z11 = z10;
            if (interfaceC0120s0Arr[i13] == null) {
                InterfaceC9884h interfaceC9884h = interfaceC9884hArr[i13];
                z11 = z10;
                if (interfaceC9884h != null) {
                    C4349a.m21884g(interfaceC9884h.length() == 1);
                    C4349a.m21884g(interfaceC9884h.mo41608f(0) == 0);
                    int m324c = c0083a1.m324c(interfaceC9884h.mo41612l());
                    C4349a.m21884g(!zArr3[m324c]);
                    this.f371F++;
                    zArr3[m324c] = true;
                    interfaceC0120s0Arr[i13] = new c(this, m324c);
                    zArr2[i13] = true;
                    z11 = z10;
                    if (!z10) {
                        C0118r0 c0118r0 = this.f397t[m324c];
                        z11 = (c0118r0.m597Z(j10, true) || c0118r0.m575C() == 0) ? false : true;
                    }
                }
            }
            i13++;
        }
        if (this.f371F == 0) {
            this.f375J = false;
            this.f370E = false;
            if (!this.f389l.m5324j()) {
                C0118r0[] c0118r0Arr = this.f397t;
                int length = c0118r0Arr.length;
                int i14 = 0;
                while (true) {
                    j11 = j10;
                    if (i14 >= length) {
                        break;
                    }
                    c0118r0Arr[i14].m593V();
                    i14++;
                }
            } else {
                for (C0118r0 c0118r02 : this.f397t) {
                    c0118r02.m619r();
                }
                this.f389l.m5321f();
                j11 = j10;
            }
        } else {
            j11 = j10;
            if (z10) {
                long mo343j = mo343j(j10);
                int i15 = 0;
                while (true) {
                    j11 = mo343j;
                    if (i15 >= interfaceC0120s0Arr.length) {
                        break;
                    }
                    if (interfaceC0120s0Arr[i15] != null) {
                        zArr2[i15] = true;
                    }
                    i15++;
                }
            }
        }
        this.f369D = true;
        return j11;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: n */
    public long mo347n() {
        if (!this.f370E) {
            return -9223372036854775807L;
        }
        if (!this.f377L && m463M() <= this.f376K) {
            return -9223372036854775807L;
        }
        this.f370E = false;
        return this.f373H;
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: p */
    public void mo487p(final InterfaceC2348g interfaceC2348g) {
        this.f394q.post(new Runnable(this, interfaceC2348g) { // from class: a8.k0

            /* renamed from: b */
            public final C0106l0 f362b;

            /* renamed from: c */
            public final InterfaceC2348g f363c;

            {
                this.f362b = this;
                this.f363c = interfaceC2348g;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f362b.m455S(this.f363c);
            }
        });
    }

    @Override // p027b9.C0839e0.f
    /* renamed from: q */
    public void mo488q() {
        for (C0118r0 c0118r0 : this.f397t) {
            c0118r0.m591T();
        }
        this.f390m.release();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: s */
    public void mo350s() {
        m471W();
        if (this.f377L && !this.f400w) {
            throw C7594k1.m32822a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p009a8.C0118r0.d
    /* renamed from: t */
    public void mo490t(C7629w0 c7629w0) {
        this.f394q.post(this.f392o);
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: u */
    public void mo491u() {
        this.f399v = true;
        this.f394q.post(this.f392o);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: v */
    public C0083a1 mo352v() {
        m460I();
        return this.f402y.f423a;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: w */
    public void mo353w(long j10, boolean z10) {
        m460I();
        if (m466P()) {
            return;
        }
        boolean[] zArr = this.f402y.f425c;
        int length = this.f397t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f397t[i10].m618q(j10, z10, zArr[i10]);
        }
    }
}
