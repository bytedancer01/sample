package p009a8;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0121t;
import p027b9.C0839e0;
import p027b9.C0849j0;
import p027b9.C0858p;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.C7558a2;
import p267p6.C7583h;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8638f;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/w0.class
 */
/* renamed from: a8.w0 */
/* loaded from: combined.jar:classes2.jar:a8/w0.class */
public final class C0128w0 implements InterfaceC0121t, C0839e0.b<c> {

    /* renamed from: b */
    public final C0858p f567b;

    /* renamed from: c */
    public final InterfaceC0854m.a f568c;

    /* renamed from: d */
    public final InterfaceC0853l0 f569d;

    /* renamed from: e */
    public final InterfaceC0837d0 f570e;

    /* renamed from: f */
    public final InterfaceC0090d0.a f571f;

    /* renamed from: g */
    public final C0083a1 f572g;

    /* renamed from: i */
    public final long f574i;

    /* renamed from: k */
    public final C7629w0 f576k;

    /* renamed from: l */
    public final boolean f577l;

    /* renamed from: m */
    public boolean f578m;

    /* renamed from: n */
    public byte[] f579n;

    /* renamed from: o */
    public int f580o;

    /* renamed from: h */
    public final ArrayList<b> f573h = new ArrayList<>();

    /* renamed from: j */
    public final C0839e0 f575j = new C0839e0("SingleSampleMediaPeriod");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/w0$b.class
     */
    /* renamed from: a8.w0$b */
    /* loaded from: combined.jar:classes2.jar:a8/w0$b.class */
    public final class b implements InterfaceC0120s0 {

        /* renamed from: b */
        public int f581b;

        /* renamed from: c */
        public boolean f582c;

        /* renamed from: d */
        public final C0128w0 f583d;

        public b(C0128w0 c0128w0) {
            this.f583d = c0128w0;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: a */
        public void mo354a() {
            C0128w0 c0128w0 = this.f583d;
            if (c0128w0.f577l) {
                return;
            }
            c0128w0.f575j.mo5320a();
        }

        /* renamed from: b */
        public final void m647b() {
            if (this.f582c) {
                return;
            }
            this.f583d.f571f.m385i(C4400z.m22304l(this.f583d.f576k.f37086m), this.f583d.f576k, 0, null, 0L);
            this.f582c = true;
        }

        /* renamed from: c */
        public void m648c() {
            if (this.f581b == 2) {
                this.f581b = 1;
            }
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: e */
        public boolean mo356e() {
            return this.f583d.f578m;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: p */
        public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
            m647b();
            C0128w0 c0128w0 = this.f583d;
            boolean z10 = c0128w0.f578m;
            if (z10 && c0128w0.f579n == null) {
                this.f581b = 2;
            }
            int i11 = this.f581b;
            if (i11 == 2) {
                c8638f.addFlag(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c7632x0.f37132b = c0128w0.f576k;
                this.f581b = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            C4349a.m21882e(c0128w0.f579n);
            c8638f.addFlag(1);
            c8638f.f40329e = 0L;
            if ((i10 & 4) == 0) {
                c8638f.m37081f(this.f583d.f580o);
                ByteBuffer byteBuffer = c8638f.f40327c;
                C0128w0 c0128w02 = this.f583d;
                byteBuffer.put(c0128w02.f579n, 0, c0128w02.f580o);
            }
            if ((i10 & 1) != 0) {
                return -4;
            }
            this.f581b = 2;
            return -4;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: t */
        public int mo358t(long j10) {
            m647b();
            if (j10 <= 0 || this.f581b == 2) {
                return 0;
            }
            this.f581b = 2;
            return 1;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/w0$c.class
     */
    /* renamed from: a8.w0$c */
    /* loaded from: combined.jar:classes2.jar:a8/w0$c.class */
    public static final class c implements C0839e0.e {

        /* renamed from: a */
        public final long f584a = C0111o.m525a();

        /* renamed from: b */
        public final C0858p f585b;

        /* renamed from: c */
        public final C0849j0 f586c;

        /* renamed from: d */
        public byte[] f587d;

        public c(C0858p c0858p, InterfaceC0854m interfaceC0854m) {
            this.f585b = c0858p;
            this.f586c = new C0849j0(interfaceC0854m);
        }

        @Override // p027b9.C0839e0.e
        /* renamed from: a */
        public void mo498a() {
            this.f586c.m5366t();
            try {
                this.f586c.mo521a(this.f585b);
                int i10 = 0;
                while (i10 != -1) {
                    int m5363h = (int) this.f586c.m5363h();
                    byte[] bArr = this.f587d;
                    if (bArr == null) {
                        this.f587d = new byte[1024];
                    } else if (m5363h == bArr.length) {
                        this.f587d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C0849j0 c0849j0 = this.f586c;
                    byte[] bArr2 = this.f587d;
                    i10 = c0849j0.read(bArr2, m5363h, bArr2.length - m5363h);
                }
            } finally {
                C4401z0.m22401o(this.f586c);
            }
        }

        @Override // p027b9.C0839e0.e
        /* renamed from: c */
        public void mo500c() {
        }
    }

    public C0128w0(C0858p c0858p, InterfaceC0854m.a aVar, InterfaceC0853l0 interfaceC0853l0, C7629w0 c7629w0, long j10, InterfaceC0837d0 interfaceC0837d0, InterfaceC0090d0.a aVar2, boolean z10) {
        this.f567b = c0858p;
        this.f568c = aVar;
        this.f569d = interfaceC0853l0;
        this.f576k = c7629w0;
        this.f574i = j10;
        this.f570e = interfaceC0837d0;
        this.f571f = aVar2;
        this.f577l = z10;
        this.f572g = new C0083a1(new C0134z0(c7629w0));
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f575j.m5324j();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        return (this.f578m || this.f575j.m5324j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        if (this.f578m || this.f575j.m5324j() || this.f575j.m5323i()) {
            return false;
        }
        InterfaceC0854m mo5296a = this.f568c.mo5296a();
        InterfaceC0853l0 interfaceC0853l0 = this.f569d;
        if (interfaceC0853l0 != null) {
            mo5296a.mo522c(interfaceC0853l0);
        }
        c cVar = new c(this.f567b, mo5296a);
        this.f571f.m377A(new C0111o(cVar.f584a, this.f567b, this.f575j.m5328n(cVar, this, this.f570e.mo5311b(1))), 1, -1, this.f576k, 0, null, 0L, this.f574i);
        return true;
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo485k(c cVar, long j10, long j11, boolean z10) {
        C0849j0 c0849j0 = cVar.f586c;
        C0111o c0111o = new C0111o(cVar.f584a, cVar.f585b, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, c0849j0.m5363h());
        this.f570e.mo5313d(cVar.f584a);
        this.f571f.m388r(c0111o, 1, -1, null, 0, null, 0L, this.f574i);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: f */
    public long mo339f(long j10, C7558a2 c7558a2) {
        return j10;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        return this.f578m ? Long.MIN_VALUE : 0L;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: i */
    public /* synthetic */ List mo342i(List list) {
        return C0119s.m628a(this, list);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: j */
    public long mo343j(long j10) {
        for (int i10 = 0; i10 < this.f573h.size(); i10++) {
            this.f573h.get(i10).m648c();
        }
        return j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: l */
    public void mo345l(InterfaceC0121t.a aVar, long j10) {
        aVar.mo344k(this);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: m */
    public long mo346m(InterfaceC9884h[] interfaceC9884hArr, boolean[] zArr, InterfaceC0120s0[] interfaceC0120s0Arr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < interfaceC9884hArr.length; i10++) {
            InterfaceC0120s0 interfaceC0120s0 = interfaceC0120s0Arr[i10];
            if (interfaceC0120s0 != null && (interfaceC9884hArr[i10] == null || !zArr[i10])) {
                this.f573h.remove(interfaceC0120s0);
                interfaceC0120s0Arr[i10] = null;
            }
            if (interfaceC0120s0Arr[i10] == null && interfaceC9884hArr[i10] != null) {
                b bVar = new b();
                this.f573h.add(bVar);
                interfaceC0120s0Arr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: n */
    public long mo347n() {
        return -9223372036854775807L;
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo489r(c cVar, long j10, long j11) {
        this.f580o = (int) cVar.f586c.m5363h();
        this.f579n = (byte[]) C4349a.m21882e(cVar.f587d);
        this.f578m = true;
        C0849j0 c0849j0 = cVar.f586c;
        C0111o c0111o = new C0111o(cVar.f584a, cVar.f585b, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, this.f580o);
        this.f570e.mo5313d(cVar.f584a);
        this.f571f.m391u(c0111o, 1, -1, this.f576k, 0, null, 0L, this.f574i);
    }

    @Override // p027b9.C0839e0.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0839e0.c mo486o(c cVar, long j10, long j11, IOException iOException, int i10) {
        C0839e0.c m5319h;
        C0849j0 c0849j0 = cVar.f586c;
        C0111o c0111o = new C0111o(cVar.f584a, cVar.f585b, c0849j0.m5364r(), c0849j0.m5365s(), j10, j11, c0849j0.m5363h());
        long mo5310a = this.f570e.mo5310a(new InterfaceC0837d0.c(c0111o, new C0117r(1, -1, this.f576k, 0, null, 0L, C7583h.m32761e(this.f574i)), iOException, i10));
        boolean z10 = mo5310a == -9223372036854775807L || i10 >= this.f570e.mo5311b(1);
        if (this.f577l && z10) {
            C4392v.m22276j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f578m = true;
            m5319h = C0839e0.f5770f;
        } else {
            m5319h = mo5310a != -9223372036854775807L ? C0839e0.m5319h(false, mo5310a) : C0839e0.f5771g;
        }
        boolean z11 = !m5319h.m5331c();
        this.f571f.m393w(c0111o, 1, -1, this.f576k, 0, null, 0L, this.f574i, iOException, z11);
        if (z11) {
            this.f570e.mo5313d(cVar.f584a);
        }
        return m5319h;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: s */
    public void mo350s() {
    }

    /* renamed from: t */
    public void m646t() {
        this.f575j.m5326l();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: v */
    public C0083a1 mo352v() {
        return this.f572g;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: w */
    public void mo353w(long j10, boolean z10) {
    }
}
