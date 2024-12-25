package p039c9;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p027b9.C0845h0;
import p027b9.C0851k0;
import p027b9.C0856n;
import p027b9.C0858p;
import p027b9.C0867y;
import p027b9.C0868z;
import p027b9.InterfaceC0850k;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p039c9.C1032b;
import p039c9.InterfaceC1031a;
import p059d9.C4349a;
import p059d9.C4365h0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/c.class
 */
/* renamed from: c9.c */
/* loaded from: combined.jar:classes2.jar:c9/c.class */
public final class C1033c implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC1031a f6938a;

    /* renamed from: b */
    public final InterfaceC0854m f6939b;

    /* renamed from: c */
    public final InterfaceC0854m f6940c;

    /* renamed from: d */
    public final InterfaceC0854m f6941d;

    /* renamed from: e */
    public final InterfaceC1039i f6942e;

    /* renamed from: f */
    public final b f6943f;

    /* renamed from: g */
    public final boolean f6944g;

    /* renamed from: h */
    public final boolean f6945h;

    /* renamed from: i */
    public final boolean f6946i;

    /* renamed from: j */
    public Uri f6947j;

    /* renamed from: k */
    public C0858p f6948k;

    /* renamed from: l */
    public C0858p f6949l;

    /* renamed from: m */
    public InterfaceC0854m f6950m;

    /* renamed from: n */
    public long f6951n;

    /* renamed from: o */
    public long f6952o;

    /* renamed from: p */
    public long f6953p;

    /* renamed from: q */
    public C1040j f6954q;

    /* renamed from: r */
    public boolean f6955r;

    /* renamed from: s */
    public boolean f6956s;

    /* renamed from: t */
    public long f6957t;

    /* renamed from: u */
    public long f6958u;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/c$b.class
     */
    /* renamed from: c9.c$b */
    /* loaded from: combined.jar:classes2.jar:c9/c$b.class */
    public interface b {
        /* renamed from: a */
        void m6085a(int i10);

        /* renamed from: b */
        void m6086b(long j10, long j11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/c$c.class
     */
    /* renamed from: c9.c$c */
    /* loaded from: combined.jar:classes2.jar:c9/c$c.class */
    public static final class c implements InterfaceC0854m.a {

        /* renamed from: a */
        public InterfaceC1031a f6959a;

        /* renamed from: c */
        public InterfaceC0850k.a f6961c;

        /* renamed from: e */
        public boolean f6963e;

        /* renamed from: f */
        public InterfaceC0854m.a f6964f;

        /* renamed from: g */
        public C4365h0 f6965g;

        /* renamed from: h */
        public int f6966h;

        /* renamed from: i */
        public int f6967i;

        /* renamed from: j */
        public b f6968j;

        /* renamed from: b */
        public InterfaceC0854m.a f6960b = new C0868z.a();

        /* renamed from: d */
        public InterfaceC1039i f6962d = InterfaceC1039i.f6974a;

        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1033c mo5296a() {
            InterfaceC0854m.a aVar = this.f6964f;
            return m6090e(aVar != null ? aVar.mo5296a() : null, this.f6967i, this.f6966h);
        }

        /* renamed from: c */
        public C1033c m6088c() {
            InterfaceC0854m.a aVar = this.f6964f;
            return m6090e(aVar != null ? aVar.mo5296a() : null, this.f6967i | 1, -1000);
        }

        /* renamed from: d */
        public C1033c m6089d() {
            return m6090e(null, this.f6967i | 1, -1000);
        }

        /* renamed from: e */
        public final C1033c m6090e(InterfaceC0854m interfaceC0854m, int i10, int i11) {
            InterfaceC0850k interfaceC0850k;
            InterfaceC1031a interfaceC1031a = (InterfaceC1031a) C4349a.m21882e(this.f6959a);
            if (this.f6963e || interfaceC0854m == null) {
                interfaceC0850k = null;
            } else {
                InterfaceC0850k.a aVar = this.f6961c;
                interfaceC0850k = aVar != null ? aVar.mo5368a() : new C1032b.b().m6070b(interfaceC1031a).mo5368a();
            }
            return new C1033c(interfaceC1031a, interfaceC0854m, this.f6960b.mo5296a(), interfaceC0850k, this.f6962d, i10, this.f6965g, i11, this.f6968j);
        }

        /* renamed from: f */
        public InterfaceC1031a m6091f() {
            return this.f6959a;
        }

        /* renamed from: g */
        public InterfaceC1039i m6092g() {
            return this.f6962d;
        }

        /* renamed from: h */
        public C4365h0 m6093h() {
            return this.f6965g;
        }

        /* renamed from: i */
        public c m6094i(InterfaceC1031a interfaceC1031a) {
            this.f6959a = interfaceC1031a;
            return this;
        }

        /* renamed from: j */
        public c m6095j(InterfaceC0850k.a aVar) {
            this.f6961c = aVar;
            this.f6963e = aVar == null;
            return this;
        }

        /* renamed from: k */
        public c m6096k(int i10) {
            this.f6967i = i10;
            return this;
        }

        /* renamed from: l */
        public c m6097l(InterfaceC0854m.a aVar) {
            this.f6964f = aVar;
            return this;
        }
    }

    public C1033c(InterfaceC1031a interfaceC1031a, InterfaceC0854m interfaceC0854m, InterfaceC0854m interfaceC0854m2, InterfaceC0850k interfaceC0850k, InterfaceC1039i interfaceC1039i, int i10, C4365h0 c4365h0, int i11, b bVar) {
        C0851k0 c0851k0;
        this.f6938a = interfaceC1031a;
        this.f6939b = interfaceC0854m2;
        this.f6942e = interfaceC1039i == null ? InterfaceC1039i.f6974a : interfaceC1039i;
        this.f6944g = (i10 & 1) != 0;
        this.f6945h = (i10 & 2) != 0;
        this.f6946i = (i10 & 4) != 0;
        if (interfaceC0854m != null) {
            InterfaceC0854m c0845h0 = c4365h0 != null ? new C0845h0(interfaceC0854m, c4365h0, i11) : interfaceC0854m;
            this.f6941d = c0845h0;
            c0851k0 = null;
            if (interfaceC0850k != null) {
                c0851k0 = new C0851k0(c0845h0, interfaceC0850k);
            }
        } else {
            this.f6941d = C0867y.f5943a;
            c0851k0 = null;
        }
        this.f6940c = c0851k0;
        this.f6943f = bVar;
    }

    /* renamed from: t */
    public static Uri m6071t(InterfaceC1031a interfaceC1031a, String str, Uri uri) {
        Uri m6178b = C1044n.m6178b(interfaceC1031a.mo6055b(str));
        if (m6178b != null) {
            uri = m6178b;
        }
        return uri;
    }

    /* renamed from: A */
    public final void m6072A(int i10) {
        b bVar = this.f6943f;
        if (bVar != null) {
            bVar.m6085a(i10);
        }
    }

    /* renamed from: B */
    public final void m6073B(C0858p c0858p, boolean z10) {
        C1040j mo6061h;
        long j10;
        C0858p m5383a;
        InterfaceC0854m interfaceC0854m;
        C1040j c1040j;
        String str = (String) C4401z0.m22391j(c0858p.f5855i);
        if (this.f6956s) {
            mo6061h = null;
        } else if (this.f6944g) {
            try {
                mo6061h = this.f6938a.mo6061h(str, this.f6952o, this.f6953p);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mo6061h = this.f6938a.mo6057d(str, this.f6952o, this.f6953p);
        }
        if (mo6061h == null) {
            InterfaceC0854m interfaceC0854m2 = this.f6941d;
            m5383a = c0858p.m5377a().m5390h(this.f6952o).m5389g(this.f6953p).m5383a();
            c1040j = mo6061h;
            interfaceC0854m = interfaceC0854m2;
        } else if (mo6061h.f6978e) {
            Uri fromFile = Uri.fromFile((File) C4401z0.m22391j(mo6061h.f6979f));
            long j11 = mo6061h.f6976c;
            long j12 = this.f6952o - j11;
            long j13 = mo6061h.f6977d - j12;
            long j14 = this.f6953p;
            long j15 = j13;
            if (j14 != -1) {
                j15 = Math.min(j13, j14);
            }
            m5383a = c0858p.m5377a().m5391i(fromFile).m5393k(j11).m5390h(j12).m5389g(j15).m5383a();
            c1040j = mo6061h;
            interfaceC0854m = this.f6939b;
        } else {
            if (mo6061h.m6113e()) {
                j10 = this.f6953p;
            } else {
                long j16 = mo6061h.f6977d;
                long j17 = this.f6953p;
                j10 = j16;
                if (j17 != -1) {
                    j10 = Math.min(j16, j17);
                }
            }
            m5383a = c0858p.m5377a().m5390h(this.f6952o).m5389g(j10).m5383a();
            InterfaceC0854m interfaceC0854m3 = this.f6940c;
            if (interfaceC0854m3 != null) {
                c1040j = mo6061h;
                interfaceC0854m = interfaceC0854m3;
            } else {
                InterfaceC0854m interfaceC0854m4 = this.f6941d;
                this.f6938a.mo6060g(mo6061h);
                interfaceC0854m = interfaceC0854m4;
                c1040j = null;
            }
        }
        this.f6958u = (this.f6956s || interfaceC0854m != this.f6941d) ? Long.MAX_VALUE : this.f6952o + 102400;
        if (z10) {
            C4349a.m21884g(m6080v());
            if (interfaceC0854m == this.f6941d) {
                return;
            }
            try {
                m6076h();
            } catch (Throwable th2) {
                if (((C1040j) C4401z0.m22391j(c1040j)).m6112d()) {
                    this.f6938a.mo6060g(c1040j);
                }
                throw th2;
            }
        }
        if (c1040j != null && c1040j.m6112d()) {
            this.f6954q = c1040j;
        }
        this.f6950m = interfaceC0854m;
        this.f6949l = m5383a;
        this.f6951n = 0L;
        long mo521a = interfaceC0854m.mo521a(m5383a);
        C1046p c1046p = new C1046p();
        if (m5383a.f5854h == -1 && mo521a != -1) {
            this.f6953p = mo521a;
            C1046p.m6181g(c1046p, this.f6952o + mo521a);
        }
        if (m6082x()) {
            this.f6947j = interfaceC0854m.getUri();
            Uri uri = null;
            if (!c0858p.f5847a.equals(r0)) {
                uri = this.f6947j;
            }
            C1046p.m6182h(c1046p, uri);
        }
        if (m6083y()) {
            this.f6938a.mo6064k(str, c1046p);
        }
    }

    /* renamed from: C */
    public final void m6074C(String str) {
        this.f6953p = 0L;
        if (m6083y()) {
            C1046p c1046p = new C1046p();
            C1046p.m6181g(c1046p, this.f6952o);
            this.f6938a.mo6064k(str, c1046p);
        }
    }

    /* renamed from: D */
    public final int m6075D(C0858p c0858p) {
        if (this.f6945h && this.f6955r) {
            return 0;
        }
        return (this.f6946i && c0858p.f5854h == -1) ? 1 : -1;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        try {
            String mo6109a = this.f6942e.mo6109a(c0858p);
            C0858p m5383a = c0858p.m5377a().m5388f(mo6109a).m5383a();
            this.f6948k = m5383a;
            this.f6947j = m6071t(this.f6938a, mo6109a, m5383a.f5847a);
            this.f6952o = c0858p.f5853g;
            int m6075D = m6075D(c0858p);
            boolean z10 = m6075D != -1;
            this.f6956s = z10;
            if (z10) {
                m6072A(m6075D);
            }
            if (this.f6956s) {
                this.f6953p = -1L;
            } else {
                long m6177a = C1044n.m6177a(this.f6938a.mo6055b(mo6109a));
                this.f6953p = m6177a;
                if (m6177a != -1) {
                    long j10 = m6177a - c0858p.f5853g;
                    this.f6953p = j10;
                    if (j10 < 0) {
                        throw new C0856n(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            long j11 = c0858p.f5854h;
            if (j11 != -1) {
                long j12 = this.f6953p;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f6953p = j11;
            }
            long j13 = this.f6953p;
            if (j13 > 0 || j13 == -1) {
                m6073B(m5383a, false);
            }
            long j14 = c0858p.f5854h;
            if (j14 == -1) {
                j14 = this.f6953p;
            }
            return j14;
        } catch (Throwable th2) {
            m6079u(th2);
            throw th2;
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f6939b.mo522c(interfaceC0853l0);
        this.f6941d.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f6948k = null;
        this.f6947j = null;
        this.f6952o = 0L;
        m6084z();
        try {
            m6076h();
        } catch (Throwable th2) {
            m6079u(th2);
            throw th2;
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        return m6082x() ? this.f6941d.mo523e() : Collections.emptyMap();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f6947j;
    }

    /* renamed from: h */
    public final void m6076h() {
        InterfaceC0854m interfaceC0854m = this.f6950m;
        if (interfaceC0854m == null) {
            return;
        }
        try {
            interfaceC0854m.close();
        } finally {
            this.f6949l = null;
            this.f6950m = null;
            C1040j c1040j = this.f6954q;
            if (c1040j != null) {
                this.f6938a.mo6060g(c1040j);
                this.f6954q = null;
            }
        }
    }

    /* renamed from: r */
    public InterfaceC1031a m6077r() {
        return this.f6938a;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        C0858p c0858p = (C0858p) C4349a.m21882e(this.f6948k);
        C0858p c0858p2 = (C0858p) C4349a.m21882e(this.f6949l);
        if (i11 == 0) {
            return 0;
        }
        if (this.f6953p == 0) {
            return -1;
        }
        try {
            if (this.f6952o >= this.f6958u) {
                m6073B(c0858p, true);
            }
            int read = ((InterfaceC0854m) C4349a.m21882e(this.f6950m)).read(bArr, i10, i11);
            if (read != -1) {
                if (m6081w()) {
                    this.f6957t += read;
                }
                long j10 = read;
                this.f6952o += j10;
                this.f6951n += j10;
                long j11 = this.f6953p;
                if (j11 != -1) {
                    this.f6953p = j11 - j10;
                }
            } else {
                if (m6082x()) {
                    long j12 = c0858p2.f5854h;
                    if (j12 == -1 || this.f6951n < j12) {
                        m6074C((String) C4401z0.m22391j(c0858p.f5855i));
                    }
                }
                long j13 = this.f6953p;
                if (j13 > 0 || j13 == -1) {
                    m6076h();
                    m6073B(c0858p, false);
                    return read(bArr, i10, i11);
                }
            }
            return read;
        } catch (Throwable th2) {
            m6079u(th2);
            throw th2;
        }
    }

    /* renamed from: s */
    public InterfaceC1039i m6078s() {
        return this.f6942e;
    }

    /* renamed from: u */
    public final void m6079u(Throwable th2) {
        if (m6081w() || (th2 instanceof InterfaceC1031a.a)) {
            this.f6955r = true;
        }
    }

    /* renamed from: v */
    public final boolean m6080v() {
        return this.f6950m == this.f6941d;
    }

    /* renamed from: w */
    public final boolean m6081w() {
        return this.f6950m == this.f6939b;
    }

    /* renamed from: x */
    public final boolean m6082x() {
        return !m6081w();
    }

    /* renamed from: y */
    public final boolean m6083y() {
        return this.f6950m == this.f6940c;
    }

    /* renamed from: z */
    public final void m6084z() {
        b bVar = this.f6943f;
        if (bVar == null || this.f6957t <= 0) {
            return;
        }
        bVar.m6086b(this.f6938a.mo6059f(), this.f6957t);
        this.f6957t = 0L;
    }
}
