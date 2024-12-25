package p228n7;

import java.util.Arrays;
import java.util.Collections;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/o.class
 */
/* renamed from: n7.o */
/* loaded from: combined.jar:classes2.jar:n7/o.class */
public final class C6685o implements InterfaceC6683m {

    /* renamed from: l */
    public static final float[] f34881l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C6681k0 f34882a;

    /* renamed from: b */
    public final C4361f0 f34883b;

    /* renamed from: c */
    public final boolean[] f34884c = new boolean[4];

    /* renamed from: d */
    public final a f34885d = new a(128);

    /* renamed from: e */
    public final C6691u f34886e;

    /* renamed from: f */
    public b f34887f;

    /* renamed from: g */
    public long f34888g;

    /* renamed from: h */
    public String f34889h;

    /* renamed from: i */
    public InterfaceC4337t f34890i;

    /* renamed from: j */
    public boolean f34891j;

    /* renamed from: k */
    public long f34892k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/o$a.class
     */
    /* renamed from: n7.o$a */
    /* loaded from: combined.jar:classes2.jar:n7/o$a.class */
    public static final class a {

        /* renamed from: f */
        public static final byte[] f34893f = {0, 0, 1};

        /* renamed from: a */
        public boolean f34894a;

        /* renamed from: b */
        public int f34895b;

        /* renamed from: c */
        public int f34896c;

        /* renamed from: d */
        public int f34897d;

        /* renamed from: e */
        public byte[] f34898e;

        public a(int i10) {
            this.f34898e = new byte[i10];
        }

        /* renamed from: a */
        public void m30778a(byte[] bArr, int i10, int i11) {
            if (this.f34894a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f34898e;
                int length = bArr2.length;
                int i13 = this.f34896c;
                if (length < i13 + i12) {
                    this.f34898e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f34898e, this.f34896c, i12);
                this.f34896c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            if (r6 != 181) goto L30;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m30779b(int r6, int r7) {
            /*
                r5 = this;
                r0 = r5
                int r0 = r0.f34895b
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L98
                r0 = 2
                r8 = r0
                r0 = r9
                r1 = 1
                if (r0 == r1) goto L79
                r0 = r9
                r1 = 2
                if (r0 == r1) goto L68
                r0 = 4
                r8 = r0
                r0 = r9
                r1 = 3
                if (r0 == r1) goto L4e
                r0 = r9
                r1 = 4
                if (r0 != r1) goto L46
                r0 = r6
                r1 = 179(0xb3, float:2.51E-43)
                if (r0 == r1) goto L35
                r0 = r6
                r1 = 181(0xb5, float:2.54E-43)
                if (r0 != r1) goto La9
            L35:
                r0 = r5
                r1 = r5
                int r1 = r1.f34896c
                r2 = r7
                int r1 = r1 - r2
                r0.f34896c = r1
                r0 = r5
                r1 = 0
                r0.f34894a = r1
                r0 = 1
                return r0
            L46:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r1.<init>()
                throw r0
            L4e:
                r0 = r6
                r1 = 240(0xf0, float:3.36E-43)
                r0 = r0 & r1
                r1 = 32
                if (r0 == r1) goto L5b
                goto L82
            L5b:
                r0 = r5
                r1 = r5
                int r1 = r1.f34896c
                r0.f34897d = r1
                r0 = r8
                r7 = r0
                goto L90
            L68:
                r0 = r6
                r1 = 31
                if (r0 <= r1) goto L71
                goto L82
            L71:
                r0 = r5
                r1 = 3
                r0.f34895b = r1
                goto La9
            L79:
                r0 = r8
                r7 = r0
                r0 = r6
                r1 = 181(0xb5, float:2.54E-43)
                if (r0 == r1) goto L90
            L82:
                java.lang.String r0 = "H263Reader"
                java.lang.String r1 = "Unexpected start code value"
                p059d9.C4392v.m22275i(r0, r1)
                r0 = r5
                r0.m30780c()
                goto La9
            L90:
                r0 = r5
                r1 = r7
                r0.f34895b = r1
                goto La9
            L98:
                r0 = r6
                r1 = 176(0xb0, float:2.47E-43)
                if (r0 != r1) goto La9
                r0 = r5
                r1 = 1
                r0.f34895b = r1
                r0 = r5
                r1 = 1
                r0.f34894a = r1
            La9:
                byte[] r0 = p228n7.C6685o.a.f34893f
                r10 = r0
                r0 = r5
                r1 = r10
                r2 = 0
                r3 = r10
                int r3 = r3.length
                r0.m30778a(r1, r2, r3)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p228n7.C6685o.a.m30779b(int, int):boolean");
        }

        /* renamed from: c */
        public void m30780c() {
            this.f34894a = false;
            this.f34896c = 0;
            this.f34895b = 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/o$b.class
     */
    /* renamed from: n7.o$b */
    /* loaded from: combined.jar:classes2.jar:n7/o$b.class */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC4337t f34899a;

        /* renamed from: b */
        public boolean f34900b;

        /* renamed from: c */
        public boolean f34901c;

        /* renamed from: d */
        public boolean f34902d;

        /* renamed from: e */
        public int f34903e;

        /* renamed from: f */
        public int f34904f;

        /* renamed from: g */
        public long f34905g;

        /* renamed from: h */
        public long f34906h;

        public b(InterfaceC4337t interfaceC4337t) {
            this.f34899a = interfaceC4337t;
        }

        /* renamed from: a */
        public void m30781a(byte[] bArr, int i10, int i11) {
            if (this.f34901c) {
                int i12 = this.f34904f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f34904f = i12 + (i11 - i10);
                } else {
                    this.f34902d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f34901c = false;
                }
            }
        }

        /* renamed from: b */
        public void m30782b(long j10, int i10, boolean z10) {
            if (this.f34903e == 182 && z10 && this.f34900b) {
                this.f34899a.mo600b(this.f34906h, this.f34902d ? 1 : 0, (int) (j10 - this.f34905g), i10, null);
            }
            if (this.f34903e != 179) {
                this.f34905g = j10;
            }
        }

        /* renamed from: c */
        public void m30783c(int i10, long j10) {
            this.f34903e = i10;
            this.f34902d = false;
            this.f34900b = i10 == 182 || i10 == 179;
            this.f34901c = i10 == 182;
            this.f34904f = 0;
            this.f34906h = j10;
        }

        /* renamed from: d */
        public void m30784d() {
            this.f34900b = false;
            this.f34901c = false;
            this.f34902d = false;
            this.f34903e = -1;
        }
    }

    public C6685o(C6681k0 c6681k0) {
        C4361f0 c4361f0;
        this.f34882a = c6681k0;
        if (c6681k0 != null) {
            this.f34886e = new C6691u(178, 128);
            c4361f0 = new C4361f0();
        } else {
            c4361f0 = null;
            this.f34886e = null;
        }
        this.f34883b = c4361f0;
    }

    /* renamed from: b */
    public static C7629w0 m30777b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f34898e, aVar.f34896c);
        C4359e0 c4359e0 = new C4359e0(copyOf);
        c4359e0.m21961s(i10);
        c4359e0.m21961s(4);
        c4359e0.m21959q();
        c4359e0.m21960r(8);
        if (c4359e0.m21949g()) {
            c4359e0.m21960r(4);
            c4359e0.m21960r(3);
        }
        int m21950h = c4359e0.m21950h(4);
        float f10 = 1.0f;
        if (m21950h == 15) {
            int m21950h2 = c4359e0.m21950h(8);
            int m21950h3 = c4359e0.m21950h(8);
            if (m21950h3 != 0) {
                f10 = m21950h2 / m21950h3;
            }
            C4392v.m22275i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f34881l;
            if (m21950h < fArr.length) {
                f10 = fArr[m21950h];
            }
            C4392v.m22275i("H263Reader", "Invalid aspect ratio");
        }
        if (c4359e0.m21949g()) {
            c4359e0.m21960r(2);
            c4359e0.m21960r(1);
            if (c4359e0.m21949g()) {
                c4359e0.m21960r(15);
                c4359e0.m21959q();
                c4359e0.m21960r(15);
                c4359e0.m21959q();
                c4359e0.m21960r(15);
                c4359e0.m21959q();
                c4359e0.m21960r(3);
                c4359e0.m21960r(11);
                c4359e0.m21959q();
                c4359e0.m21960r(15);
                c4359e0.m21959q();
            }
        }
        if (c4359e0.m21950h(2) != 0) {
            C4392v.m22275i("H263Reader", "Unhandled video object layer shape");
        }
        c4359e0.m21959q();
        int m21950h4 = c4359e0.m21950h(16);
        c4359e0.m21959q();
        if (c4359e0.m21949g()) {
            if (m21950h4 == 0) {
                C4392v.m22275i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = m21950h4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c4359e0.m21960r(i11);
            }
        }
        c4359e0.m21959q();
        int m21950h5 = c4359e0.m21950h(13);
        c4359e0.m21959q();
        int m21950h6 = c4359e0.m21950h(13);
        c4359e0.m21959q();
        c4359e0.m21959q();
        return new C7629w0.b().m33208S(str).m33220e0("video/mp4v-es").m33225j0(m21950h5).m33206Q(m21950h6).m33216a0(f10).m33209T(Collections.singletonList(copyOf)).m33194E();
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        int i10;
        C4349a.m21886i(this.f34887f);
        C4349a.m21886i(this.f34890i);
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        byte[] m21988d = c4361f0.m21988d();
        this.f34888g += c4361f0.m21985a();
        this.f34890i.mo606e(c4361f0, c4361f0.m21985a());
        while (true) {
            int m21890c = C4350a0.m21890c(m21988d, m21989e, m21990f, this.f34884c);
            if (m21890c == m21990f) {
                break;
            }
            int i11 = m21890c + 3;
            int i12 = c4361f0.m21988d()[i11] & 255;
            int i13 = m21890c - m21989e;
            if (!this.f34891j) {
                if (i13 > 0) {
                    this.f34885d.m30778a(m21988d, m21989e, m21890c);
                }
                if (this.f34885d.m30779b(i12, i13 < 0 ? -i13 : 0)) {
                    InterfaceC4337t interfaceC4337t = this.f34890i;
                    a aVar = this.f34885d;
                    interfaceC4337t.mo608f(m30777b(aVar, aVar.f34897d, (String) C4349a.m21882e(this.f34889h)));
                    this.f34891j = true;
                }
            }
            this.f34887f.m30781a(m21988d, m21989e, m21890c);
            C6691u c6691u = this.f34886e;
            if (c6691u != null) {
                if (i13 > 0) {
                    c6691u.m30828a(m21988d, m21989e, m21890c);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f34886e.m30829b(i10)) {
                    C6691u c6691u2 = this.f34886e;
                    ((C4361f0) C4401z0.m22391j(this.f34883b)).m21981N(this.f34886e.f35025d, C4350a0.m21898k(c6691u2.f35025d, c6691u2.f35026e));
                    ((C6681k0) C4401z0.m22391j(this.f34882a)).m30770a(this.f34892k, this.f34883b);
                }
                if (i12 == 178 && c4361f0.m21988d()[m21890c + 2] == 1) {
                    this.f34886e.m30832e(i12);
                }
            }
            int i14 = m21990f - m21890c;
            this.f34887f.m30782b(this.f34888g - i14, i14, this.f34891j);
            this.f34887f.m30783c(i12, this.f34892k);
            m21989e = i11;
        }
        if (!this.f34891j) {
            this.f34885d.m30778a(m21988d, m21989e, m21990f);
        }
        this.f34887f.m30781a(m21988d, m21989e, m21990f);
        C6691u c6691u3 = this.f34886e;
        if (c6691u3 != null) {
            c6691u3.m30828a(m21988d, m21989e, m21990f);
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        C4350a0.m21888a(this.f34884c);
        this.f34885d.m30780c();
        b bVar = this.f34887f;
        if (bVar != null) {
            bVar.m30784d();
        }
        C6691u c6691u = this.f34886e;
        if (c6691u != null) {
            c6691u.m30831d();
        }
        this.f34888g = 0L;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34889h = dVar.m30756b();
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 2);
        this.f34890i = mo479e;
        this.f34887f = new b(mo479e);
        C6681k0 c6681k0 = this.f34882a;
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
        this.f34892k = j10;
    }
}
