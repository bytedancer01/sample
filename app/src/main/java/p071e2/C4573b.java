package p071e2;

import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/b.class
 */
/* renamed from: e2.b */
/* loaded from: combined.jar:classes1.jar:e2/b.class */
public final class C4573b {

    /* renamed from: i */
    public static final C4573b f27195i = new a().m23106a();

    /* renamed from: a */
    public EnumC4583l f27196a;

    /* renamed from: b */
    public boolean f27197b;

    /* renamed from: c */
    public boolean f27198c;

    /* renamed from: d */
    public boolean f27199d;

    /* renamed from: e */
    public boolean f27200e;

    /* renamed from: f */
    public long f27201f;

    /* renamed from: g */
    public long f27202g;

    /* renamed from: h */
    public C4574c f27203h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/b$a.class
     */
    /* renamed from: e2.b$a */
    /* loaded from: combined.jar:classes1.jar:e2/b$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f27204a = false;

        /* renamed from: b */
        public boolean f27205b = false;

        /* renamed from: c */
        public EnumC4583l f27206c = EnumC4583l.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f27207d = false;

        /* renamed from: e */
        public boolean f27208e = false;

        /* renamed from: f */
        public long f27209f = -1;

        /* renamed from: g */
        public long f27210g = -1;

        /* renamed from: h */
        public C4574c f27211h = new C4574c();

        /* renamed from: a */
        public C4573b m23106a() {
            return new C4573b(this);
        }

        /* renamed from: b */
        public a m23107b(EnumC4583l enumC4583l) {
            this.f27206c = enumC4583l;
            return this;
        }
    }

    public C4573b() {
        this.f27196a = EnumC4583l.NOT_REQUIRED;
        this.f27201f = -1L;
        this.f27202g = -1L;
        this.f27203h = new C4574c();
    }

    public C4573b(a aVar) {
        this.f27196a = EnumC4583l.NOT_REQUIRED;
        this.f27201f = -1L;
        this.f27202g = -1L;
        this.f27203h = new C4574c();
        this.f27197b = aVar.f27204a;
        int i10 = Build.VERSION.SDK_INT;
        this.f27198c = i10 >= 23 && aVar.f27205b;
        this.f27196a = aVar.f27206c;
        this.f27199d = aVar.f27207d;
        this.f27200e = aVar.f27208e;
        if (i10 >= 24) {
            this.f27203h = aVar.f27211h;
            this.f27201f = aVar.f27209f;
            this.f27202g = aVar.f27210g;
        }
    }

    public C4573b(C4573b c4573b) {
        this.f27196a = EnumC4583l.NOT_REQUIRED;
        this.f27201f = -1L;
        this.f27202g = -1L;
        this.f27203h = new C4574c();
        this.f27197b = c4573b.f27197b;
        this.f27198c = c4573b.f27198c;
        this.f27196a = c4573b.f27196a;
        this.f27199d = c4573b.f27199d;
        this.f27200e = c4573b.f27200e;
        this.f27203h = c4573b.f27203h;
    }

    /* renamed from: a */
    public C4574c m23089a() {
        return this.f27203h;
    }

    /* renamed from: b */
    public EnumC4583l m23090b() {
        return this.f27196a;
    }

    /* renamed from: c */
    public long m23091c() {
        return this.f27201f;
    }

    /* renamed from: d */
    public long m23092d() {
        return this.f27202g;
    }

    /* renamed from: e */
    public boolean m23093e() {
        return this.f27203h.m23110c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4573b.class != obj.getClass()) {
            return false;
        }
        C4573b c4573b = (C4573b) obj;
        if (this.f27197b == c4573b.f27197b && this.f27198c == c4573b.f27198c && this.f27199d == c4573b.f27199d && this.f27200e == c4573b.f27200e && this.f27201f == c4573b.f27201f && this.f27202g == c4573b.f27202g && this.f27196a == c4573b.f27196a) {
            return this.f27203h.equals(c4573b.f27203h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m23094f() {
        return this.f27199d;
    }

    /* renamed from: g */
    public boolean m23095g() {
        return this.f27197b;
    }

    /* renamed from: h */
    public boolean m23096h() {
        return this.f27198c;
    }

    public int hashCode() {
        int hashCode = this.f27196a.hashCode();
        boolean z10 = this.f27197b;
        boolean z11 = this.f27198c;
        boolean z12 = this.f27199d;
        boolean z13 = this.f27200e;
        long j10 = this.f27201f;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f27202g;
        return (((((((((((((hashCode * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z13 ? 1 : 0)) * 31) + i10) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f27203h.hashCode();
    }

    /* renamed from: i */
    public boolean m23097i() {
        return this.f27200e;
    }

    /* renamed from: j */
    public void m23098j(C4574c c4574c) {
        this.f27203h = c4574c;
    }

    /* renamed from: k */
    public void m23099k(EnumC4583l enumC4583l) {
        this.f27196a = enumC4583l;
    }

    /* renamed from: l */
    public void m23100l(boolean z10) {
        this.f27199d = z10;
    }

    /* renamed from: m */
    public void m23101m(boolean z10) {
        this.f27197b = z10;
    }

    /* renamed from: n */
    public void m23102n(boolean z10) {
        this.f27198c = z10;
    }

    /* renamed from: o */
    public void m23103o(boolean z10) {
        this.f27200e = z10;
    }

    /* renamed from: p */
    public void m23104p(long j10) {
        this.f27201f = j10;
    }

    /* renamed from: q */
    public void m23105q(long j10) {
        this.f27202g = j10;
    }
}
