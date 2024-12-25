package p081ed;

import p081ed.AbstractC4716d;
import p081ed.C4715c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ed/a.class
 */
/* renamed from: ed.a */
/* loaded from: combined.jar:classes2.jar:ed/a.class */
public final class C4713a extends AbstractC4716d {

    /* renamed from: b */
    public final String f27737b;

    /* renamed from: c */
    public final C4715c.a f27738c;

    /* renamed from: d */
    public final String f27739d;

    /* renamed from: e */
    public final String f27740e;

    /* renamed from: f */
    public final long f27741f;

    /* renamed from: g */
    public final long f27742g;

    /* renamed from: h */
    public final String f27743h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ed/a$b.class
     */
    /* renamed from: ed.a$b */
    /* loaded from: combined.jar:classes2.jar:ed/a$b.class */
    public static final class b extends AbstractC4716d.a {

        /* renamed from: a */
        public String f27744a;

        /* renamed from: b */
        public C4715c.a f27745b;

        /* renamed from: c */
        public String f27746c;

        /* renamed from: d */
        public String f27747d;

        /* renamed from: e */
        public Long f27748e;

        /* renamed from: f */
        public Long f27749f;

        /* renamed from: g */
        public String f27750g;

        public b() {
        }

        public b(AbstractC4716d abstractC4716d) {
            this.f27744a = abstractC4716d.mo23693d();
            this.f27745b = abstractC4716d.mo23696g();
            this.f27746c = abstractC4716d.mo23691b();
            this.f27747d = abstractC4716d.mo23695f();
            this.f27748e = Long.valueOf(abstractC4716d.mo23692c());
            this.f27749f = Long.valueOf(abstractC4716d.mo23697h());
            this.f27750g = abstractC4716d.mo23694e();
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: a */
        public AbstractC4716d mo23699a() {
            String str = "";
            if (this.f27745b == null) {
                str = " registrationStatus";
            }
            String str2 = str;
            if (this.f27748e == null) {
                str2 = str + " expiresInSecs";
            }
            String str3 = str2;
            if (this.f27749f == null) {
                str3 = str2 + " tokenCreationEpochInSecs";
            }
            if (str3.isEmpty()) {
                return new C4713a(this.f27744a, this.f27745b, this.f27746c, this.f27747d, this.f27748e.longValue(), this.f27749f.longValue(), this.f27750g);
            }
            throw new IllegalStateException("Missing required properties:" + str3);
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: b */
        public AbstractC4716d.a mo23700b(String str) {
            this.f27746c = str;
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: c */
        public AbstractC4716d.a mo23701c(long j10) {
            this.f27748e = Long.valueOf(j10);
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: d */
        public AbstractC4716d.a mo23702d(String str) {
            this.f27744a = str;
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: e */
        public AbstractC4716d.a mo23703e(String str) {
            this.f27750g = str;
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: f */
        public AbstractC4716d.a mo23704f(String str) {
            this.f27747d = str;
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: g */
        public AbstractC4716d.a mo23705g(C4715c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f27745b = aVar;
            return this;
        }

        @Override // p081ed.AbstractC4716d.a
        /* renamed from: h */
        public AbstractC4716d.a mo23706h(long j10) {
            this.f27749f = Long.valueOf(j10);
            return this;
        }
    }

    public C4713a(String str, C4715c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f27737b = str;
        this.f27738c = aVar;
        this.f27739d = str2;
        this.f27740e = str3;
        this.f27741f = j10;
        this.f27742g = j11;
        this.f27743h = str4;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: b */
    public String mo23691b() {
        return this.f27739d;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: c */
    public long mo23692c() {
        return this.f27741f;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: d */
    public String mo23693d() {
        return this.f27737b;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: e */
    public String mo23694e() {
        return this.f27743h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4716d)) {
            return false;
        }
        AbstractC4716d abstractC4716d = (AbstractC4716d) obj;
        String str3 = this.f27737b;
        if (str3 != null ? str3.equals(abstractC4716d.mo23693d()) : abstractC4716d.mo23693d() == null) {
            if (this.f27738c.equals(abstractC4716d.mo23696g()) && ((str = this.f27739d) != null ? str.equals(abstractC4716d.mo23691b()) : abstractC4716d.mo23691b() == null) && ((str2 = this.f27740e) != null ? str2.equals(abstractC4716d.mo23695f()) : abstractC4716d.mo23695f() == null) && this.f27741f == abstractC4716d.mo23692c() && this.f27742g == abstractC4716d.mo23697h()) {
                String str4 = this.f27743h;
                String mo23694e = abstractC4716d.mo23694e();
                if (str4 != null) {
                }
            }
        }
        z10 = false;
        return z10;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: f */
    public String mo23695f() {
        return this.f27740e;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: g */
    public C4715c.a mo23696g() {
        return this.f27738c;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: h */
    public long mo23697h() {
        return this.f27742g;
    }

    public int hashCode() {
        String str = this.f27737b;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.f27738c.hashCode();
        String str2 = this.f27739d;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f27740e;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f27741f;
        int i11 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f27742g;
        int i12 = (int) (j11 ^ (j11 >>> 32));
        String str4 = this.f27743h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ i10;
    }

    @Override // p081ed.AbstractC4716d
    /* renamed from: n */
    public AbstractC4716d.a mo23698n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f27737b + ", registrationStatus=" + this.f27738c + ", authToken=" + this.f27739d + ", refreshToken=" + this.f27740e + ", expiresInSecs=" + this.f27741f + ", tokenCreationEpochInSecs=" + this.f27742g + ", fisError=" + this.f27743h + "}";
    }
}
