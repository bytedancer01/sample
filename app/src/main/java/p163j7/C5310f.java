package p163j7;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4322e;
import p057d7.C4328k;
import p057d7.C4332o;
import p057d7.C4333p;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p301r6.C7985j0;
import p366v7.C9300h;
import p366v7.C9303k;
import p366v7.C9305m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j7/f.class
 */
/* renamed from: j7.f */
/* loaded from: combined.jar:classes2.jar:j7/f.class */
public final class C5310f implements InterfaceC4323f {

    /* renamed from: u */
    public static final InterfaceC4329l f30479u = new InterfaceC4329l() { // from class: j7.d
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m26508o;
            m26508o = C5310f.m26508o();
            return m26508o;
        }
    };

    /* renamed from: v */
    public static final C9300h.a f30480v = new C9300h.a() { // from class: j7.e
        @Override // p366v7.C9300h.a
        /* renamed from: a */
        public final boolean mo26502a(int i10, int i11, int i12, int i13, int i14) {
            boolean m26509p;
            m26509p = C5310f.m26509p(i10, i11, i12, i13, i14);
            return m26509p;
        }
    };

    /* renamed from: a */
    public final int f30481a;

    /* renamed from: b */
    public final long f30482b;

    /* renamed from: c */
    public final C4361f0 f30483c;

    /* renamed from: d */
    public final C7985j0.a f30484d;

    /* renamed from: e */
    public final C4332o f30485e;

    /* renamed from: f */
    public final C4333p f30486f;

    /* renamed from: g */
    public final InterfaceC4337t f30487g;

    /* renamed from: h */
    public InterfaceC4325h f30488h;

    /* renamed from: i */
    public InterfaceC4337t f30489i;

    /* renamed from: j */
    public InterfaceC4337t f30490j;

    /* renamed from: k */
    public int f30491k;

    /* renamed from: l */
    public C7839a f30492l;

    /* renamed from: m */
    public long f30493m;

    /* renamed from: n */
    public long f30494n;

    /* renamed from: o */
    public long f30495o;

    /* renamed from: p */
    public int f30496p;

    /* renamed from: q */
    public InterfaceC5311g f30497q;

    /* renamed from: r */
    public boolean f30498r;

    /* renamed from: s */
    public boolean f30499s;

    /* renamed from: t */
    public long f30500t;

    public C5310f() {
        this(0);
    }

    public C5310f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C5310f(int i10, long j10) {
        this.f30481a = i10;
        this.f30482b = j10;
        this.f30483c = new C4361f0(10);
        this.f30484d = new C7985j0.a();
        this.f30485e = new C4332o();
        this.f30493m = -9223372036854775807L;
        this.f30486f = new C4333p();
        C4322e c4322e = new C4322e();
        this.f30487g = c4322e;
        this.f30490j = c4322e;
    }

    /* renamed from: l */
    public static long m26505l(C7839a c7839a) {
        if (c7839a == null) {
            return -9223372036854775807L;
        }
        int m34087k = c7839a.m34087k();
        for (int i10 = 0; i10 < m34087k; i10++) {
            C7839a.b m34086j = c7839a.m34086j(i10);
            if (m34086j instanceof C9305m) {
                C9305m c9305m = (C9305m) m34086j;
                if (c9305m.f42427b.equals("TLEN")) {
                    return C7583h.m32760d(Long.parseLong(c9305m.f42439d));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static int m26506m(C4361f0 c4361f0, int i10) {
        if (c4361f0.m21990f() >= i10 + 4) {
            c4361f0.m21983P(i10);
            int m21998n = c4361f0.m21998n();
            if (m21998n == 1483304551 || m21998n == 1231971951) {
                return m21998n;
            }
        }
        if (c4361f0.m21990f() < 40) {
            return 0;
        }
        c4361f0.m21983P(36);
        return c4361f0.m21998n() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: n */
    public static boolean m26507n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC4323f[] m26508o() {
        return new InterfaceC4323f[]{new C5310f()};
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m26509p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    /* renamed from: q */
    public static C5307c m26510q(C7839a c7839a, long j10) {
        if (c7839a == null) {
            return null;
        }
        int m34087k = c7839a.m34087k();
        for (int i10 = 0; i10 < m34087k; i10++) {
            C7839a.b m34086j = c7839a.m34086j(i10);
            if (m34086j instanceof C9303k) {
                return C5307c.m26500a(j10, (C9303k) m34086j, m26505l(c7839a));
            }
        }
        return null;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f30491k = 0;
        this.f30493m = -9223372036854775807L;
        this.f30494n = 0L;
        this.f30496p = 0;
        this.f30500t = j11;
        InterfaceC5311g interfaceC5311g = this.f30497q;
        if (!(interfaceC5311g instanceof C5306b) || ((C5306b) interfaceC5311g).m26497a(j11)) {
            return;
        }
        this.f30499s = true;
        this.f30490j = this.f30487g;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f30488h = interfaceC4325h;
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(0, 1);
        this.f30489i = mo479e;
        this.f30490j = mo479e;
        this.f30488h.mo491u();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        return m26520v(interfaceC4324g, true);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: f */
    public final void m26511f() {
        C4349a.m21886i(this.f30489i);
        C4401z0.m22391j(this.f30488h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        if ((r9.f30481a & 1) != 0) goto L30;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p163j7.InterfaceC5311g m26512g(p057d7.InterfaceC4324g r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            j7.g r0 = r0.m26516r(r1)
            r16 = r0
            r0 = r9
            q7.a r0 = r0.f30492l
            r1 = r10
            long r1 = r1.getPosition()
            j7.c r0 = m26510q(r0, r1)
            r15 = r0
            r0 = r9
            boolean r0 = r0.f30498r
            if (r0 == 0) goto L25
            j7.g$a r0 = new j7.g$a
            r1 = r0
            r1.<init>()
            return r0
        L25:
            r0 = r9
            int r0 = r0.f30481a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L82
            r0 = r15
            if (r0 == 0) goto L47
            r0 = r15
            long r0 = r0.mo12036i()
            r11 = r0
            r0 = r15
            long r0 = r0.mo26496f()
            r13 = r0
        L44:
            goto L6d
        L47:
            r0 = r16
            if (r0 == 0) goto L60
            r0 = r16
            long r0 = r0.mo12036i()
            r11 = r0
            r0 = r16
            long r0 = r0.mo26496f()
            r13 = r0
            goto L44
        L60:
            r0 = r9
            q7.a r0 = r0.f30492l
            long r0 = m26505l(r0)
            r11 = r0
            r0 = -1
            r13 = r0
        L6d:
            j7.b r0 = new j7.b
            r1 = r0
            r2 = r11
            r3 = r10
            long r3 = r3.getPosition()
            r4 = r13
            r1.<init>(r2, r3, r4)
            r15 = r0
            goto L99
        L82:
            r0 = r15
            if (r0 == 0) goto L8a
            goto L99
        L8a:
            r0 = r16
            if (r0 == 0) goto L96
            r0 = r16
            r15 = r0
            goto L99
        L96:
            r0 = 0
            r15 = r0
        L99:
            r0 = r15
            if (r0 == 0) goto Lb9
            r0 = r15
            r16 = r0
            r0 = r15
            boolean r0 = r0.mo12035g()
            if (r0 != 0) goto Lc0
            r0 = r15
            r16 = r0
            r0 = r9
            int r0 = r0.f30481a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lc0
        Lb9:
            r0 = r9
            r1 = r10
            j7.g r0 = r0.m26515k(r1)
            r16 = r0
        Lc0:
            r0 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j7.C5310f.m26512g(d7.g):j7.g");
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        m26511f();
        int m26518t = m26518t(interfaceC4324g);
        if (m26518t == -1 && (this.f30497q instanceof C5306b)) {
            long m26513i = m26513i(this.f30494n);
            if (this.f30497q.mo12036i() != m26513i) {
                ((C5306b) this.f30497q).m26499d(m26513i);
                this.f30488h.mo487p(this.f30497q);
            }
        }
        return m26518t;
    }

    /* renamed from: i */
    public final long m26513i(long j10) {
        return this.f30493m + ((j10 * 1000000) / this.f30484d.f38632d);
    }

    /* renamed from: j */
    public void m26514j() {
        this.f30498r = true;
    }

    /* renamed from: k */
    public final InterfaceC5311g m26515k(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21811q(this.f30483c.m21988d(), 0, 4);
        this.f30483c.m21983P(0);
        this.f30484d.m34729a(this.f30483c.m21998n());
        return new C5305a(interfaceC4324g.getLength(), interfaceC4324g.getPosition(), this.f30484d);
    }

    /* renamed from: r */
    public final InterfaceC5311g m26516r(InterfaceC4324g interfaceC4324g) {
        int i10;
        InterfaceC5311g interfaceC5311g;
        C4361f0 c4361f0 = new C4361f0(this.f30484d.f38631c);
        interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, this.f30484d.f38631c);
        C7985j0.a aVar = this.f30484d;
        int i11 = aVar.f38629a;
        int i12 = aVar.f38633e;
        if ((i11 & 1) != 0) {
            if (i12 != 1) {
                i10 = 36;
            }
            i10 = 21;
        } else {
            if (i12 == 1) {
                i10 = 13;
            }
            i10 = 21;
        }
        int m26506m = m26506m(c4361f0, i10);
        if (m26506m == 1483304551 || m26506m == 1231971951) {
            InterfaceC5311g m26522a = C5313i.m26522a(interfaceC4324g.getLength(), interfaceC4324g.getPosition(), this.f30484d, c4361f0);
            if (m26522a != null && !this.f30485e.m21836a()) {
                interfaceC4324g.mo21801f();
                interfaceC4324g.mo21805k(i10 + 141);
                interfaceC4324g.mo21811q(this.f30483c.m21988d(), 0, 3);
                this.f30483c.m21983P(0);
                this.f30485e.m21839d(this.f30483c.m21974G());
            }
            interfaceC4324g.mo21809o(this.f30484d.f38631c);
            interfaceC5311g = m26522a;
            if (m26522a != null) {
                interfaceC5311g = m26522a;
                if (!m26522a.mo12035g()) {
                    interfaceC5311g = m26522a;
                    if (m26506m == 1231971951) {
                        return m26515k(interfaceC4324g);
                    }
                }
            }
        } else if (m26506m == 1447187017) {
            interfaceC5311g = C5312h.m26521a(interfaceC4324g.getLength(), interfaceC4324g.getPosition(), this.f30484d, c4361f0);
            interfaceC4324g.mo21809o(this.f30484d.f38631c);
        } else {
            interfaceC5311g = null;
            interfaceC4324g.mo21801f();
        }
        return interfaceC5311g;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }

    /* renamed from: s */
    public final boolean m26517s(InterfaceC4324g interfaceC4324g) {
        InterfaceC5311g interfaceC5311g = this.f30497q;
        if (interfaceC5311g != null) {
            long mo26496f = interfaceC5311g.mo26496f();
            if (mo26496f != -1 && interfaceC4324g.mo21804i() > mo26496f - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4324g.mo21800d(this.f30483c.m21988d(), 0, 4, true);
        } catch (EOFException e10) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: t */
    public final int m26518t(InterfaceC4324g interfaceC4324g) {
        if (this.f30491k == 0) {
            try {
                m26520v(interfaceC4324g, false);
            } catch (EOFException e10) {
                return -1;
            }
        }
        if (this.f30497q == null) {
            InterfaceC5311g m26512g = m26512g(interfaceC4324g);
            this.f30497q = m26512g;
            this.f30488h.mo487p(m26512g);
            this.f30490j.mo608f(new C7629w0.b().m33220e0(this.f30484d.f38630b).m33212W(4096).m33197H(this.f30484d.f38633e).m33221f0(this.f30484d.f38632d).m33202M(this.f30485e.f26488a).m33203N(this.f30485e.f26489b).m33213X((this.f30481a & 4) != 0 ? null : this.f30492l).m33194E());
            this.f30495o = interfaceC4324g.getPosition();
        } else if (this.f30495o != 0) {
            long position = interfaceC4324g.getPosition();
            long j10 = this.f30495o;
            if (position < j10) {
                interfaceC4324g.mo21809o((int) (j10 - position));
            }
        }
        return m26519u(interfaceC4324g);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* renamed from: u */
    public final int m26519u(InterfaceC4324g interfaceC4324g) {
        if (this.f30496p == 0) {
            interfaceC4324g.mo21801f();
            if (m26517s(interfaceC4324g)) {
                return -1;
            }
            this.f30483c.m21983P(0);
            int m21998n = this.f30483c.m21998n();
            if (!m26507n(m21998n, this.f30491k) || C7985j0.m34725j(m21998n) == -1) {
                interfaceC4324g.mo21809o(1);
                this.f30491k = 0;
                return 0;
            }
            this.f30484d.m34729a(m21998n);
            if (this.f30493m == -9223372036854775807L) {
                this.f30493m = this.f30497q.mo26495b(interfaceC4324g.getPosition());
                if (this.f30482b != -9223372036854775807L) {
                    this.f30493m += this.f30482b - this.f30497q.mo26495b(0L);
                }
            }
            this.f30496p = this.f30484d.f38631c;
            InterfaceC5311g interfaceC5311g = this.f30497q;
            if (interfaceC5311g instanceof C5306b) {
                C5306b c5306b = (C5306b) interfaceC5311g;
                c5306b.m26498c(m26513i(this.f30494n + r0.f38635g), interfaceC4324g.getPosition() + this.f30484d.f38631c);
                if (this.f30499s && c5306b.m26497a(this.f30500t)) {
                    this.f30499s = false;
                    this.f30490j = this.f30489i;
                }
            }
        }
        int mo604d = this.f30490j.mo604d(interfaceC4324g, this.f30496p, true);
        if (mo604d == -1) {
            return -1;
        }
        int i10 = this.f30496p - mo604d;
        this.f30496p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f30490j.mo600b(m26513i(this.f30494n), 1, this.f30484d.f38631c, 0, null);
        this.f30494n += this.f30484d.f38635g;
        this.f30496p = 0;
        return 0;
    }

    /* renamed from: v */
    public final boolean m26520v(InterfaceC4324g interfaceC4324g, boolean z10) {
        int i10;
        int m34725j;
        int i11;
        int i12 = z10 ? 32768 : 131072;
        interfaceC4324g.mo21801f();
        if (interfaceC4324g.getPosition() == 0) {
            C7839a m21840a = this.f30486f.m21840a(interfaceC4324g, (this.f30481a & 4) == 0 ? null : f30480v);
            this.f30492l = m21840a;
            if (m21840a != null) {
                this.f30485e.m21838c(m21840a);
            }
            i10 = (int) interfaceC4324g.mo21804i();
            if (!z10) {
                interfaceC4324g.mo21809o(i10);
            }
        } else {
            i10 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (!m26517s(interfaceC4324g)) {
                this.f30483c.m21983P(0);
                int m21998n = this.f30483c.m21998n();
                if ((i13 == 0 || m26507n(m21998n, i13)) && (m34725j = C7985j0.m34725j(m21998n)) != -1) {
                    int i16 = i14 + 1;
                    if (i16 != 1) {
                        i11 = i13;
                        if (i16 == 4) {
                            break;
                        }
                    } else {
                        this.f30484d.m34729a(m21998n);
                        i11 = m21998n;
                    }
                    interfaceC4324g.mo21805k(m34725j - 4);
                    i13 = i11;
                    i14 = i16;
                } else {
                    int i17 = i15 + 1;
                    if (i15 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw C7594k1.m32822a("Searched too many bytes.", null);
                    }
                    if (z10) {
                        interfaceC4324g.mo21801f();
                        interfaceC4324g.mo21805k(i10 + i17);
                    } else {
                        interfaceC4324g.mo21809o(1);
                    }
                    i15 = i17;
                    i13 = 0;
                    i14 = 0;
                }
            } else if (i14 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            interfaceC4324g.mo21809o(i10 + i15);
        } else {
            interfaceC4324g.mo21801f();
        }
        this.f30491k = i13;
        return true;
    }
}
