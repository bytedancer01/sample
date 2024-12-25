package p182k7;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import ec.InterfaceC4703f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4328k;
import p057d7.C4332o;
import p057d7.C4334q;
import p057d7.C4335r;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p182k7.AbstractC5510a;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p301r6.C7970c;
import p381w7.C9426b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/k.class
 */
/* renamed from: k7.k */
/* loaded from: combined.jar:classes2.jar:k7/k.class */
public final class C5520k implements InterfaceC4323f, InterfaceC2348g {

    /* renamed from: y */
    public static final InterfaceC4329l f31484y = new InterfaceC4329l() { // from class: k7.i
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m27455r;
            m27455r = C5520k.m27455r();
            return m27455r;
        }
    };

    /* renamed from: a */
    public final int f31485a;

    /* renamed from: b */
    public final C4361f0 f31486b;

    /* renamed from: c */
    public final C4361f0 f31487c;

    /* renamed from: d */
    public final C4361f0 f31488d;

    /* renamed from: e */
    public final C4361f0 f31489e;

    /* renamed from: f */
    public final ArrayDeque<AbstractC5510a.a> f31490f;

    /* renamed from: g */
    public final C5522m f31491g;

    /* renamed from: h */
    public final List<C7839a.b> f31492h;

    /* renamed from: i */
    public int f31493i;

    /* renamed from: j */
    public int f31494j;

    /* renamed from: k */
    public long f31495k;

    /* renamed from: l */
    public int f31496l;

    /* renamed from: m */
    public C4361f0 f31497m;

    /* renamed from: n */
    public int f31498n;

    /* renamed from: o */
    public int f31499o;

    /* renamed from: p */
    public int f31500p;

    /* renamed from: q */
    public int f31501q;

    /* renamed from: r */
    public InterfaceC4325h f31502r;

    /* renamed from: s */
    public a[] f31503s;

    /* renamed from: t */
    public long[][] f31504t;

    /* renamed from: u */
    public int f31505u;

    /* renamed from: v */
    public long f31506v;

    /* renamed from: w */
    public int f31507w;

    /* renamed from: x */
    public C9426b f31508x;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/k$a.class
     */
    /* renamed from: k7.k$a */
    /* loaded from: combined.jar:classes2.jar:k7/k$a.class */
    public static final class a {

        /* renamed from: a */
        public final C5524o f31509a;

        /* renamed from: b */
        public final C5527r f31510b;

        /* renamed from: c */
        public final InterfaceC4337t f31511c;

        /* renamed from: d */
        public int f31512d;

        public a(C5524o c5524o, C5527r c5527r, InterfaceC4337t interfaceC4337t) {
            this.f31509a = c5524o;
            this.f31510b = c5527r;
            this.f31511c = interfaceC4337t;
        }
    }

    public C5520k() {
        this(0);
    }

    public C5520k(int i10) {
        this.f31485a = i10;
        this.f31493i = (i10 & 4) != 0 ? 3 : 0;
        this.f31491g = new C5522m();
        this.f31492h = new ArrayList();
        this.f31489e = new C4361f0(16);
        this.f31490f = new ArrayDeque<>();
        this.f31486b = new C4361f0(C4350a0.f26520a);
        this.f31487c = new C4361f0(4);
        this.f31488d = new C4361f0();
        this.f31498n = -1;
    }

    /* renamed from: D */
    public static boolean m27447D(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* renamed from: E */
    public static boolean m27448E(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    /* renamed from: l */
    public static int m27451l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long[], long[][]] */
    /* renamed from: m */
    public static long[][] m27452m(a[] aVarArr) {
        ?? r02 = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r02[i10] = new long[aVarArr[i10].f31510b.f31561b];
            jArr[i10] = aVarArr[i10].f31510b.f31565f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            int i13 = 0;
            while (i13 < aVarArr.length) {
                long j12 = j11;
                int i14 = i12;
                if (!zArr[i13]) {
                    long j13 = jArr[i13];
                    j12 = j11;
                    i14 = i12;
                    if (j13 <= j11) {
                        i14 = i13;
                        j12 = j13;
                    }
                }
                i13++;
                j11 = j12;
                i12 = i14;
            }
            int i15 = iArr[i12];
            Object[] objArr = r02[i12];
            objArr[i15] = j10;
            C5527r c5527r = aVarArr[i12].f31510b;
            j10 += c5527r.f31563d[i15];
            int i16 = i15 + 1;
            iArr[i12] = i16;
            if (i16 < objArr.length) {
                jArr[i12] = c5527r.f31565f[i16];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return r02;
    }

    /* renamed from: o */
    public static int m27453o(C5527r c5527r, long j10) {
        int m27500a = c5527r.m27500a(j10);
        int i10 = m27500a;
        if (m27500a == -1) {
            i10 = c5527r.m27501b(j10);
        }
        return i10;
    }

    /* renamed from: q */
    public static /* synthetic */ C5524o m27454q(C5524o c5524o) {
        return c5524o;
    }

    /* renamed from: r */
    public static /* synthetic */ InterfaceC4323f[] m27455r() {
        return new InterfaceC4323f[]{new C5520k()};
    }

    /* renamed from: s */
    public static long m27456s(C5527r c5527r, long j10, long j11) {
        int m27453o = m27453o(c5527r, j10);
        return m27453o == -1 ? j11 : Math.min(c5527r.f31562c[m27453o], j11);
    }

    /* renamed from: w */
    public static int m27457w(C4361f0 c4361f0) {
        c4361f0.m21983P(8);
        int m27451l = m27451l(c4361f0.m21998n());
        if (m27451l != 0) {
            return m27451l;
        }
        c4361f0.m21984Q(4);
        while (c4361f0.m21985a() > 0) {
            int m27451l2 = m27451l(c4361f0.m21998n());
            if (m27451l2 != 0) {
                return m27451l2;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public final boolean m27458A(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        boolean z10;
        long j10 = this.f31495k - this.f31496l;
        long position = interfaceC4324g.getPosition();
        C4361f0 c4361f0 = this.f31497m;
        boolean z11 = true;
        if (c4361f0 != null) {
            interfaceC4324g.readFully(c4361f0.m21988d(), this.f31496l, (int) j10);
            if (this.f31494j == 1718909296) {
                this.f31507w = m27457w(c4361f0);
            } else if (!this.f31490f.isEmpty()) {
                this.f31490f.peek().m27344e(new AbstractC5510a.b(this.f31494j, c4361f0));
            }
        } else {
            if (j10 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                c4334q.f26491a = interfaceC4324g.getPosition() + j10;
                z10 = true;
                m27465u(position + j10);
                if (z10 || this.f31493i == 2) {
                    z11 = false;
                }
                return z11;
            }
            interfaceC4324g.mo21809o((int) j10);
        }
        z10 = false;
        m27465u(position + j10);
        if (z10) {
        }
        z11 = false;
        return z11;
    }

    /* renamed from: B */
    public final int m27459B(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int i10;
        long position = interfaceC4324g.getPosition();
        if (this.f31498n == -1) {
            int m27463p = m27463p(position);
            this.f31498n = m27463p;
            if (m27463p == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) C4401z0.m22391j(this.f31503s))[this.f31498n];
        InterfaceC4337t interfaceC4337t = aVar.f31511c;
        int i11 = aVar.f31512d;
        C5527r c5527r = aVar.f31510b;
        long j10 = c5527r.f31562c[i11];
        int i12 = c5527r.f31563d[i11];
        long j11 = (j10 - position) + this.f31499o;
        if (j11 < 0 || j11 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            c4334q.f26491a = j10;
            return 1;
        }
        long j12 = j11;
        int i13 = i12;
        if (aVar.f31509a.f31531g == 1) {
            j12 = j11 + 8;
            i13 = i12 - 8;
        }
        interfaceC4324g.mo21809o((int) j12);
        C5524o c5524o = aVar.f31509a;
        if (c5524o.f31534j == 0) {
            int i14 = i13;
            if ("audio/ac4".equals(c5524o.f31530f.f37086m)) {
                if (this.f31500p == 0) {
                    C7970c.m34568a(i13, this.f31488d);
                    interfaceC4337t.mo606e(this.f31488d, 7);
                    this.f31500p += 7;
                }
                i14 = i13 + 7;
            }
            while (true) {
                int i15 = this.f31500p;
                i10 = i14;
                if (i15 >= i14) {
                    break;
                }
                int mo604d = interfaceC4337t.mo604d(interfaceC4324g, i14 - i15, false);
                this.f31499o += mo604d;
                this.f31500p += mo604d;
                this.f31501q -= mo604d;
            }
        } else {
            byte[] m21988d = this.f31487c.m21988d();
            m21988d[0] = 0;
            m21988d[1] = 0;
            m21988d[2] = 0;
            int i16 = aVar.f31509a.f31534j;
            int i17 = 4 - i16;
            while (true) {
                i10 = i13;
                if (this.f31500p >= i13) {
                    break;
                }
                int i18 = this.f31501q;
                if (i18 == 0) {
                    interfaceC4324g.readFully(m21988d, i17, i16);
                    this.f31499o += i16;
                    this.f31487c.m21983P(0);
                    int m21998n = this.f31487c.m21998n();
                    if (m21998n < 0) {
                        throw C7594k1.m32822a("Invalid NAL length", null);
                    }
                    this.f31501q = m21998n;
                    this.f31486b.m21983P(0);
                    interfaceC4337t.mo606e(this.f31486b, 4);
                    this.f31500p += 4;
                    i13 += i17;
                } else {
                    int mo604d2 = interfaceC4337t.mo604d(interfaceC4324g, i18, false);
                    this.f31499o += mo604d2;
                    this.f31500p += mo604d2;
                    this.f31501q -= mo604d2;
                }
            }
        }
        C5527r c5527r2 = aVar.f31510b;
        interfaceC4337t.mo600b(c5527r2.f31565f[i11], c5527r2.f31566g[i11], i10, 0, null);
        aVar.f31512d++;
        this.f31498n = -1;
        this.f31499o = 0;
        this.f31500p = 0;
        this.f31501q = 0;
        return 0;
    }

    /* renamed from: C */
    public final int m27460C(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int m27483c = this.f31491g.m27483c(interfaceC4324g, c4334q, this.f31492h);
        if (m27483c == 1 && c4334q.f26491a == 0) {
            m27462n();
        }
        return m27483c;
    }

    @RequiresNonNull({"tracks"})
    /* renamed from: F */
    public final void m27461F(long j10) {
        for (a aVar : this.f31503s) {
            C5527r c5527r = aVar.f31510b;
            int m27500a = c5527r.m27500a(j10);
            int i10 = m27500a;
            if (m27500a == -1) {
                i10 = c5527r.m27501b(j10);
            }
            aVar.f31512d = i10;
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f31490f.clear();
        this.f31496l = 0;
        this.f31498n = -1;
        this.f31499o = 0;
        this.f31500p = 0;
        this.f31501q = 0;
        if (j10 != 0) {
            if (this.f31503s != null) {
                m27461F(j11);
            }
        } else if (this.f31493i != 3) {
            m27462n();
        } else {
            this.f31491g.m27486g();
            this.f31492h.clear();
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f31502r = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        return C5523n.m27490d(interfaceC4324g, (this.f31485a & 2) != 0);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int m27501b;
        if (((a[]) C4349a.m21882e(this.f31503s)).length == 0) {
            return new InterfaceC2348g.a(C4335r.f26492c);
        }
        int i10 = this.f31505u;
        if (i10 != -1) {
            C5527r c5527r = this.f31503s[i10].f31510b;
            int m27453o = m27453o(c5527r, j10);
            if (m27453o == -1) {
                return new InterfaceC2348g.a(C4335r.f26492c);
            }
            j13 = c5527r.f31565f[m27453o];
            long j17 = c5527r.f31562c[m27453o];
            if (j13 >= j10 || m27453o >= c5527r.f31561b - 1 || (m27501b = c5527r.m27501b(j10)) == -1 || m27501b == m27453o) {
                j15 = -1;
                j16 = -9223372036854775807L;
            } else {
                j16 = c5527r.f31565f[m27501b];
                j15 = c5527r.f31562c[m27501b];
            }
            j12 = j16;
            j14 = j15;
            j11 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
            j13 = j10;
            j14 = -1;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f31503s;
            if (i11 >= aVarArr.length) {
                break;
            }
            long j18 = j14;
            long j19 = j11;
            if (i11 != this.f31505u) {
                C5527r c5527r2 = aVarArr[i11].f31510b;
                j19 = m27456s(c5527r2, j13, j11);
                long j20 = j14;
                if (j12 != -9223372036854775807L) {
                    j20 = m27456s(c5527r2, j12, j14);
                }
                j18 = j20;
            }
            i11++;
            j14 = j18;
            j11 = j19;
        }
        C4335r c4335r = new C4335r(j13, j11);
        return j12 == -9223372036854775807L ? new InterfaceC2348g.a(c4335r) : new InterfaceC2348g.a(c4335r, new C4335r(j12, j14));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return true;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        while (true) {
            int i10 = this.f31493i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return m27459B(interfaceC4324g, c4334q);
                    }
                    if (i10 == 3) {
                        return m27460C(interfaceC4324g, c4334q);
                    }
                    throw new IllegalStateException();
                }
                if (m27458A(interfaceC4324g, c4334q)) {
                    return 1;
                }
            } else if (!m27469z(interfaceC4324g)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f31506v;
    }

    /* renamed from: n */
    public final void m27462n() {
        this.f31493i = 0;
        this.f31496l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r0 < r18) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m27463p(long r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5520k.m27463p(long):int");
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }

    /* renamed from: t */
    public final void m27464t(InterfaceC4324g interfaceC4324g) {
        this.f31488d.m21979L(8);
        interfaceC4324g.mo21811q(this.f31488d.m21988d(), 0, 8);
        C5511b.m27353d(this.f31488d);
        interfaceC4324g.mo21809o(this.f31488d.m21989e());
        interfaceC4324g.mo21801f();
    }

    /* renamed from: u */
    public final void m27465u(long j10) {
        while (!this.f31490f.isEmpty() && this.f31490f.peek().f31392b == j10) {
            AbstractC5510a.a pop = this.f31490f.pop();
            if (pop.f31391a == 1836019574) {
                m27467x(pop);
                this.f31490f.clear();
                this.f31493i = 2;
            } else if (!this.f31490f.isEmpty()) {
                this.f31490f.peek().m27343d(pop);
            }
        }
        if (this.f31493i != 2) {
            m27462n();
        }
    }

    /* renamed from: v */
    public final void m27466v() {
        if (this.f31507w != 2 || (this.f31485a & 2) == 0) {
            return;
        }
        InterfaceC4325h interfaceC4325h = (InterfaceC4325h) C4349a.m21882e(this.f31502r);
        interfaceC4325h.mo479e(0, 4).mo608f(new C7629w0.b().m33213X(this.f31508x == null ? null : new C7839a(this.f31508x)).m33194E());
        interfaceC4325h.mo491u();
        interfaceC4325h.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
    }

    /* renamed from: x */
    public final void m27467x(AbstractC5510a.a aVar) {
        C7839a c7839a;
        C7839a c7839a2;
        int i10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f31507w == 1;
        C4332o c4332o = new C4332o();
        AbstractC5510a.b m27346g = aVar.m27346g(1969517665);
        if (m27346g != null) {
            Pair<C7839a, C7839a> m27347A = C5511b.m27347A(m27346g);
            c7839a2 = (C7839a) m27347A.first;
            c7839a = (C7839a) m27347A.second;
            if (c7839a2 != null) {
                c4332o.m21838c(c7839a2);
            }
        } else {
            c7839a = null;
            c7839a2 = null;
        }
        AbstractC5510a.a m27345f = aVar.m27345f(1835365473);
        C7839a m27362m = m27345f != null ? C5511b.m27362m(m27345f) : null;
        List<C5527r> m27375z = C5511b.m27375z(aVar, c4332o, -9223372036854775807L, null, (this.f31485a & 1) != 0, z10, new InterfaceC4703f() { // from class: k7.j
            @Override // ec.InterfaceC4703f
            public final Object apply(Object obj) {
                C5524o m27454q;
                m27454q = C5520k.m27454q((C5524o) obj);
                return m27454q;
            }
        });
        InterfaceC4325h interfaceC4325h = (InterfaceC4325h) C4349a.m21882e(this.f31502r);
        int size = m27375z.size();
        int i11 = -1;
        long j10 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            C5527r c5527r = m27375z.get(i12);
            if (c5527r.f31561b != 0) {
                C5524o c5524o = c5527r.f31560a;
                long j11 = c5524o.f31529e;
                if (j11 == -9223372036854775807L) {
                    j11 = c5527r.f31567h;
                }
                j10 = Math.max(j10, j11);
                a aVar2 = new a(c5524o, c5527r, interfaceC4325h.mo479e(i12, c5524o.f31526b));
                int i13 = c5527r.f31564e;
                C7629w0.b m33157b = c5524o.f31530f.m33157b();
                m33157b.m33212W(i13 + 30);
                if (c5524o.f31526b == 2 && j11 > 0 && (i10 = c5527r.f31561b) > 1) {
                    m33157b.m33205P(i10 / (j11 / 1000000.0f));
                }
                C5517h.m27445k(c5524o.f31526b, c4332o, m33157b);
                C5517h.m27446l(c5524o.f31526b, c7839a2, m27362m, m33157b, c7839a, this.f31492h.isEmpty() ? null : new C7839a(this.f31492h));
                aVar2.f31511c.mo608f(m33157b.m33194E());
                if (c5524o.f31526b == 2 && i11 == -1) {
                    i11 = arrayList.size();
                }
                arrayList.add(aVar2);
            }
        }
        this.f31505u = i11;
        this.f31506v = j10;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f31503s = aVarArr;
        this.f31504t = m27452m(aVarArr);
        interfaceC4325h.mo491u();
        interfaceC4325h.mo487p(this);
    }

    /* renamed from: y */
    public final void m27468y(long j10) {
        if (this.f31494j == 1836086884) {
            int i10 = this.f31496l;
            this.f31508x = new C9426b(0L, j10, -9223372036854775807L, j10 + i10, this.f31495k - i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bc  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m27469z(p057d7.InterfaceC4324g r8) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5520k.m27469z(d7.g):boolean");
    }
}
