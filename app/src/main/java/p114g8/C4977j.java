package p114g8;

import android.net.Uri;
import ec.C4699b;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p038c8.AbstractC1028n;
import p057d7.C4320c;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4393v0;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p114g8.C4973f;
import p146i8.C5206g;
import p267p6.C7629w0;
import p283q7.C7839a;
import p365v6.C9273n;
import p366v7.C9300h;
import p366v7.C9304l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/j.class
 */
/* renamed from: g8.j */
/* loaded from: combined.jar:classes2.jar:g8/j.class */
public final class C4977j extends AbstractC1028n {

    /* renamed from: L */
    public static final AtomicInteger f28852L = new AtomicInteger();

    /* renamed from: A */
    public final boolean f28853A;

    /* renamed from: B */
    public final boolean f28854B;

    /* renamed from: C */
    public InterfaceC4978k f28855C;

    /* renamed from: D */
    public C4985r f28856D;

    /* renamed from: E */
    public int f28857E;

    /* renamed from: F */
    public boolean f28858F;

    /* renamed from: G */
    public volatile boolean f28859G;

    /* renamed from: H */
    public boolean f28860H;

    /* renamed from: I */
    public AbstractC4834t<Integer> f28861I;

    /* renamed from: J */
    public boolean f28862J;

    /* renamed from: K */
    public boolean f28863K;

    /* renamed from: k */
    public final int f28864k;

    /* renamed from: l */
    public final int f28865l;

    /* renamed from: m */
    public final Uri f28866m;

    /* renamed from: n */
    public final boolean f28867n;

    /* renamed from: o */
    public final int f28868o;

    /* renamed from: p */
    public final InterfaceC0854m f28869p;

    /* renamed from: q */
    public final C0858p f28870q;

    /* renamed from: r */
    public final InterfaceC4978k f28871r;

    /* renamed from: s */
    public final boolean f28872s;

    /* renamed from: t */
    public final boolean f28873t;

    /* renamed from: u */
    public final C4389t0 f28874u;

    /* renamed from: v */
    public final InterfaceC4975h f28875v;

    /* renamed from: w */
    public final List<C7629w0> f28876w;

    /* renamed from: x */
    public final C9273n f28877x;

    /* renamed from: y */
    public final C9300h f28878y;

    /* renamed from: z */
    public final C4361f0 f28879z;

    public C4977j(InterfaceC4975h interfaceC4975h, InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, boolean z10, InterfaceC0854m interfaceC0854m2, C0858p c0858p2, boolean z11, Uri uri, List<C7629w0> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, C4389t0 c4389t0, C9273n c9273n, InterfaceC4978k interfaceC4978k, C9300h c9300h, C4361f0 c4361f0, boolean z15) {
        super(interfaceC0854m, c0858p, c7629w0, i10, obj, j10, j11, j12);
        this.f28853A = z10;
        this.f28868o = i11;
        this.f28863K = z12;
        this.f28865l = i12;
        this.f28870q = c0858p2;
        this.f28869p = interfaceC0854m2;
        this.f28858F = c0858p2 != null;
        this.f28854B = z11;
        this.f28866m = uri;
        this.f28872s = z14;
        this.f28874u = c4389t0;
        this.f28873t = z13;
        this.f28875v = interfaceC4975h;
        this.f28876w = list;
        this.f28877x = c9273n;
        this.f28871r = interfaceC4978k;
        this.f28878y = c9300h;
        this.f28879z = c4361f0;
        this.f28867n = z15;
        this.f28861I = AbstractC4834t.m24539E();
        this.f28864k = f28852L.getAndIncrement();
    }

    /* renamed from: i */
    public static InterfaceC0854m m25055i(InterfaceC0854m interfaceC0854m, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC0854m;
        }
        C4349a.m21882e(bArr2);
        return new C4968a(interfaceC0854m, bArr, bArr2);
    }

    /* renamed from: j */
    public static C4977j m25056j(InterfaceC4975h interfaceC4975h, InterfaceC0854m interfaceC0854m, C7629w0 c7629w0, long j10, C5206g c5206g, C4973f.e eVar, Uri uri, List<C7629w0> list, int i10, Object obj, boolean z10, C4988u c4988u, C4977j c4977j, byte[] bArr, byte[] bArr2, boolean z11) {
        InterfaceC0854m interfaceC0854m2;
        C0858p c0858p;
        boolean z12;
        C9300h c9300h;
        C4361f0 c4361f0;
        InterfaceC4978k interfaceC4978k;
        C5206g.e eVar2 = eVar.f28845a;
        C0858p m5383a = new C0858p.b().m5391i(C4393v0.m22281e(c5206g.f29831a, eVar2.f29815b)).m5390h(eVar2.f29823j).m5389g(eVar2.f29824k).m5384b(eVar.f28848d ? 8 : 0).m5383a();
        boolean z13 = bArr != null;
        InterfaceC0854m m25055i = m25055i(interfaceC0854m, bArr, z13 ? m25057l((String) C4349a.m21882e(eVar2.f29822i)) : null);
        C5206g.d dVar = eVar2.f29816c;
        if (dVar != null) {
            z12 = bArr2 != null;
            byte[] m25057l = z12 ? m25057l((String) C4349a.m21882e(dVar.f29822i)) : null;
            C0858p c0858p2 = new C0858p(C4393v0.m22281e(c5206g.f29831a, dVar.f29815b), dVar.f29823j, dVar.f29824k);
            interfaceC0854m2 = m25055i(interfaceC0854m, bArr2, m25057l);
            c0858p = c0858p2;
        } else {
            interfaceC0854m2 = null;
            c0858p = null;
            z12 = false;
        }
        long j11 = j10 + eVar2.f29819f;
        long j12 = eVar2.f29817d;
        int i11 = c5206g.f29795j + eVar2.f29818e;
        if (c4977j != null) {
            C0858p c0858p3 = c4977j.f28870q;
            boolean z14 = c0858p == c0858p3 || (c0858p != null && c0858p3 != null && c0858p.f5847a.equals(c0858p3.f5847a) && c0858p.f5853g == c4977j.f28870q.f5853g);
            boolean z15 = uri.equals(c4977j.f28866m) && c4977j.f28860H;
            C9300h c9300h2 = c4977j.f28878y;
            c4361f0 = c4977j.f28879z;
            interfaceC4978k = (z14 && z15 && !c4977j.f28862J && c4977j.f28865l == i11) ? c4977j.f28855C : null;
            c9300h = c9300h2;
        } else {
            c9300h = new C9300h();
            c4361f0 = new C4361f0(10);
            interfaceC4978k = null;
        }
        return new C4977j(interfaceC4975h, m25055i, m5383a, c7629w0, z13, interfaceC0854m2, c0858p, z12, uri, list, i10, obj, j11, j11 + j12, eVar.f28846b, eVar.f28847c, !eVar.f28848d, i11, eVar2.f29825l, z10, c4988u.m25146a(i11), eVar2.f29820g, interfaceC4978k, c9300h, c4361f0, z11);
    }

    /* renamed from: l */
    public static byte[] m25057l(String str) {
        String str2 = str;
        if (C4699b.m23638e(str).startsWith("0x")) {
            str2 = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str2, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: p */
    public static boolean m25058p(C4973f.e eVar, C5206g c5206g) {
        C5206g.e eVar2 = eVar.f28845a;
        if (eVar2 instanceof C5206g.b) {
            return ((C5206g.b) eVar2).f29808m || (eVar.f28847c == 0 && c5206g.f29833c);
        }
        return c5206g.f29833c;
    }

    /* renamed from: w */
    public static boolean m25059w(C4977j c4977j, Uri uri, C5206g c5206g, C4973f.e eVar, long j10) {
        boolean z10 = false;
        if (c4977j == null) {
            return false;
        }
        if (uri.equals(c4977j.f28866m) && c4977j.f28860H) {
            return false;
        }
        long j11 = eVar.f28845a.f29819f;
        if (!m25058p(eVar, c5206g) || j10 + j11 < c4977j.f6875h) {
            z10 = true;
        }
        return z10;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public void mo498a() {
        InterfaceC4978k interfaceC4978k;
        C4349a.m21882e(this.f28856D);
        if (this.f28855C == null && (interfaceC4978k = this.f28871r) != null && interfaceC4978k.mo25012d()) {
            this.f28855C = this.f28871r;
            this.f28858F = false;
        }
        m25066s();
        if (this.f28859G) {
            return;
        }
        if (!this.f28873t) {
            m25065r();
        }
        this.f28860H = !this.f28859G;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public void mo500c() {
        this.f28859G = true;
    }

    @Override // p038c8.AbstractC1028n
    /* renamed from: h */
    public boolean mo6046h() {
        return this.f28860H;
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    public final void m25060k(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10) {
        C0858p m5380e;
        long position;
        long j10;
        boolean z11 = false;
        if (z10) {
            if (this.f28857E != 0) {
                z11 = true;
            }
            m5380e = c0858p;
        } else {
            m5380e = c0858p.m5380e(this.f28857E);
            z11 = false;
        }
        try {
            C4320c m25068u = m25068u(interfaceC0854m, m5380e);
            if (z11) {
                m25068u.mo21809o(this.f28857E);
            }
            do {
                try {
                    try {
                        if (this.f28859G) {
                            break;
                        }
                    } catch (Throwable th2) {
                        this.f28857E = (int) (m25068u.getPosition() - c0858p.f5853g);
                        throw th2;
                    }
                } catch (EOFException e10) {
                    if ((this.f6871d.f37079f & 16384) == 0) {
                        throw e10;
                    }
                    this.f28855C.mo25010b();
                    position = m25068u.getPosition();
                    j10 = c0858p.f5853g;
                }
            } while (this.f28855C.mo25009a(m25068u));
            position = m25068u.getPosition();
            j10 = c0858p.f5853g;
            this.f28857E = (int) (position - j10);
        } finally {
            C4401z0.m22401o(interfaceC0854m);
        }
    }

    /* renamed from: m */
    public int m25061m(int i10) {
        C4349a.m21884g(!this.f28867n);
        if (i10 >= this.f28861I.size()) {
            return 0;
        }
        return this.f28861I.get(i10).intValue();
    }

    /* renamed from: n */
    public void m25062n(C4985r c4985r, AbstractC4834t<Integer> abstractC4834t) {
        this.f28856D = c4985r;
        this.f28861I = abstractC4834t;
    }

    /* renamed from: o */
    public void m25063o() {
        this.f28862J = true;
    }

    /* renamed from: q */
    public boolean m25064q() {
        return this.f28863K;
    }

    @RequiresNonNull({"output"})
    /* renamed from: r */
    public final void m25065r() {
        try {
            this.f28874u.m22246h(this.f28872s, this.f6874g);
            m25060k(this.f6876i, this.f6869b, this.f28853A);
        } catch (InterruptedException e10) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: s */
    public final void m25066s() {
        if (this.f28858F) {
            C4349a.m21882e(this.f28869p);
            C4349a.m21882e(this.f28870q);
            m25060k(this.f28869p, this.f28870q, this.f28854B);
            this.f28857E = 0;
            this.f28858F = false;
        }
    }

    /* renamed from: t */
    public final long m25067t(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21801f();
        try {
            this.f28879z.m21979L(10);
            interfaceC4324g.mo21811q(this.f28879z.m21988d(), 0, 10);
            if (this.f28879z.m21974G() != 4801587) {
                return -9223372036854775807L;
            }
            this.f28879z.m21984Q(3);
            int m21970C = this.f28879z.m21970C();
            int i10 = m21970C + 10;
            if (i10 > this.f28879z.m21986b()) {
                byte[] m21988d = this.f28879z.m21988d();
                this.f28879z.m21979L(i10);
                System.arraycopy(m21988d, 0, this.f28879z.m21988d(), 0, 10);
            }
            interfaceC4324g.mo21811q(this.f28879z.m21988d(), 10, m21970C);
            C7839a m39222e = this.f28878y.m39222e(this.f28879z.m21988d(), m21970C);
            if (m39222e == null) {
                return -9223372036854775807L;
            }
            int m34087k = m39222e.m34087k();
            for (int i11 = 0; i11 < m34087k; i11++) {
                C7839a.b m34086j = m39222e.m34086j(i11);
                if (m34086j instanceof C9304l) {
                    C9304l c9304l = (C9304l) m34086j;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(c9304l.f42436c)) {
                        System.arraycopy(c9304l.f42437d, 0, this.f28879z.m21988d(), 0, 8);
                        this.f28879z.m21983P(0);
                        this.f28879z.m21982O(8);
                        return this.f28879z.m22007w() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException e10) {
            return -9223372036854775807L;
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* renamed from: u */
    public final C4320c m25068u(InterfaceC0854m interfaceC0854m, C0858p c0858p) {
        C4985r c4985r;
        long j10;
        C4320c c4320c = new C4320c(interfaceC0854m, c0858p.f5853g, interfaceC0854m.mo521a(c0858p));
        if (this.f28855C == null) {
            long m25067t = m25067t(c4320c);
            c4320c.mo21801f();
            InterfaceC4978k interfaceC4978k = this.f28871r;
            InterfaceC4978k mo25014f = interfaceC4978k != null ? interfaceC4978k.mo25014f() : this.f28875v.mo25021a(c0858p.f5847a, this.f6871d, this.f28876w, this.f28874u, interfaceC0854m.mo523e(), c4320c);
            this.f28855C = mo25014f;
            if (mo25014f.mo25013e()) {
                c4985r = this.f28856D;
                j10 = m25067t != -9223372036854775807L ? this.f28874u.m22241b(m25067t) : this.f6874g;
            } else {
                c4985r = this.f28856D;
                j10 = 0;
            }
            c4985r.m25127o0(j10);
            this.f28856D.m25113a0();
            this.f28855C.mo25011c(this.f28856D);
        }
        this.f28856D.m25124l0(this.f28877x);
        return c4320c;
    }

    /* renamed from: v */
    public void m25069v() {
        this.f28863K = true;
    }
}
