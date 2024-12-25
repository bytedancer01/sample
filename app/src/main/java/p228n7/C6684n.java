package p228n7;

import android.util.Pair;
import java.util.Arrays;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/n.class
 */
/* renamed from: n7.n */
/* loaded from: combined.jar:classes2.jar:n7/n.class */
public final class C6684n implements InterfaceC6683m {

    /* renamed from: q */
    public static final double[] f34859q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f34860a;

    /* renamed from: b */
    public InterfaceC4337t f34861b;

    /* renamed from: c */
    public final C6681k0 f34862c;

    /* renamed from: d */
    public final C4361f0 f34863d;

    /* renamed from: e */
    public final C6691u f34864e;

    /* renamed from: f */
    public final boolean[] f34865f;

    /* renamed from: g */
    public final a f34866g;

    /* renamed from: h */
    public long f34867h;

    /* renamed from: i */
    public boolean f34868i;

    /* renamed from: j */
    public boolean f34869j;

    /* renamed from: k */
    public long f34870k;

    /* renamed from: l */
    public long f34871l;

    /* renamed from: m */
    public long f34872m;

    /* renamed from: n */
    public long f34873n;

    /* renamed from: o */
    public boolean f34874o;

    /* renamed from: p */
    public boolean f34875p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/n$a.class
     */
    /* renamed from: n7.n$a */
    /* loaded from: combined.jar:classes2.jar:n7/n$a.class */
    public static final class a {

        /* renamed from: e */
        public static final byte[] f34876e = {0, 0, 1};

        /* renamed from: a */
        public boolean f34877a;

        /* renamed from: b */
        public int f34878b;

        /* renamed from: c */
        public int f34879c;

        /* renamed from: d */
        public byte[] f34880d;

        public a(int i10) {
            this.f34880d = new byte[i10];
        }

        /* renamed from: a */
        public void m30774a(byte[] bArr, int i10, int i11) {
            if (this.f34877a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f34880d;
                int length = bArr2.length;
                int i13 = this.f34878b;
                if (length < i13 + i12) {
                    this.f34880d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f34880d, this.f34878b, i12);
                this.f34878b += i12;
            }
        }

        /* renamed from: b */
        public boolean m30775b(int i10, int i11) {
            if (this.f34877a) {
                int i12 = this.f34878b - i11;
                this.f34878b = i12;
                if (this.f34879c != 0 || i10 != 181) {
                    this.f34877a = false;
                    return true;
                }
                this.f34879c = i12;
            } else if (i10 == 179) {
                this.f34877a = true;
            }
            byte[] bArr = f34876e;
            m30774a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m30776c() {
            this.f34877a = false;
            this.f34878b = 0;
            this.f34879c = 0;
        }
    }

    public C6684n() {
        this(null);
    }

    public C6684n(C6681k0 c6681k0) {
        C4361f0 c4361f0;
        this.f34862c = c6681k0;
        this.f34865f = new boolean[4];
        this.f34866g = new a(128);
        if (c6681k0 != null) {
            this.f34864e = new C6691u(178, 128);
            c4361f0 = new C4361f0();
        } else {
            c4361f0 = null;
            this.f34864e = null;
        }
        this.f34863d = c4361f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<p267p6.C7629w0, java.lang.Long> m30773b(p228n7.C6684n.a r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6684n.m30773b(n7.n$a, java.lang.String):android.util.Pair");
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        int i10;
        C4349a.m21886i(this.f34861b);
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        byte[] m21988d = c4361f0.m21988d();
        this.f34867h += c4361f0.m21985a();
        this.f34861b.mo606e(c4361f0, c4361f0.m21985a());
        while (true) {
            int m21890c = C4350a0.m21890c(m21988d, m21989e, m21990f, this.f34865f);
            if (m21890c == m21990f) {
                break;
            }
            int i11 = m21890c + 3;
            int i12 = c4361f0.m21988d()[i11] & 255;
            int i13 = m21890c - m21989e;
            boolean z10 = false;
            if (!this.f34869j) {
                if (i13 > 0) {
                    this.f34866g.m30774a(m21988d, m21989e, m21890c);
                }
                if (this.f34866g.m30775b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<C7629w0, Long> m30773b = m30773b(this.f34866g, (String) C4349a.m21882e(this.f34860a));
                    this.f34861b.mo608f((C7629w0) m30773b.first);
                    this.f34870k = ((Long) m30773b.second).longValue();
                    this.f34869j = true;
                }
            }
            C6691u c6691u = this.f34864e;
            if (c6691u != null) {
                if (i13 > 0) {
                    c6691u.m30828a(m21988d, m21989e, m21890c);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f34864e.m30829b(i10)) {
                    C6691u c6691u2 = this.f34864e;
                    ((C4361f0) C4401z0.m22391j(this.f34863d)).m21981N(this.f34864e.f35025d, C4350a0.m21898k(c6691u2.f35025d, c6691u2.f35026e));
                    ((C6681k0) C4401z0.m22391j(this.f34862c)).m30770a(this.f34873n, this.f34863d);
                }
                if (i12 == 178 && c4361f0.m21988d()[m21890c + 2] == 1) {
                    this.f34864e.m30832e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = m21990f - m21890c;
                if (this.f34868i && this.f34875p && this.f34869j) {
                    this.f34861b.mo600b(this.f34873n, this.f34874o ? 1 : 0, ((int) (this.f34867h - this.f34872m)) - i14, i14, null);
                }
                boolean z11 = this.f34868i;
                if (!z11 || this.f34875p) {
                    this.f34872m = this.f34867h - i14;
                    long j10 = this.f34871l;
                    if (j10 == -9223372036854775807L) {
                        j10 = z11 ? this.f34873n + this.f34870k : 0L;
                    }
                    this.f34873n = j10;
                    this.f34874o = false;
                    this.f34871l = -9223372036854775807L;
                    this.f34868i = true;
                }
                if (i12 == 0) {
                    z10 = true;
                }
                this.f34875p = z10;
            } else if (i12 == 184) {
                this.f34874o = true;
            }
            m21989e = i11;
        }
        if (!this.f34869j) {
            this.f34866g.m30774a(m21988d, m21989e, m21990f);
        }
        C6691u c6691u3 = this.f34864e;
        if (c6691u3 != null) {
            c6691u3.m30828a(m21988d, m21989e, m21990f);
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        C4350a0.m21888a(this.f34865f);
        this.f34866g.m30776c();
        C6691u c6691u = this.f34864e;
        if (c6691u != null) {
            c6691u.m30831d();
        }
        this.f34867h = 0L;
        this.f34868i = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34860a = dVar.m30756b();
        this.f34861b = interfaceC4325h.mo479e(dVar.m30757c(), 2);
        C6681k0 c6681k0 = this.f34862c;
        if (c6681k0 != null) {
            c6681k0.m30771b(interfaceC4325h, dVar);
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34871l = j10;
    }
}
