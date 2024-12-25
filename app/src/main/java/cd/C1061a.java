package cd;

import cd.AbstractC1072l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/a.class
 */
/* renamed from: cd.a */
/* loaded from: combined.jar:classes2.jar:cd/a.class */
public final class C1061a extends AbstractC1072l {

    /* renamed from: a */
    public final String f7069a;

    /* renamed from: b */
    public final long f7070b;

    /* renamed from: c */
    public final long f7071c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cd/a$b.class
     */
    /* renamed from: cd.a$b */
    /* loaded from: combined.jar:classes2.jar:cd/a$b.class */
    public static final class b extends AbstractC1072l.a {

        /* renamed from: a */
        public String f7072a;

        /* renamed from: b */
        public Long f7073b;

        /* renamed from: c */
        public Long f7074c;

        @Override // cd.AbstractC1072l.a
        /* renamed from: a */
        public AbstractC1072l mo6271a() {
            String str = "";
            if (this.f7072a == null) {
                str = " token";
            }
            String str2 = str;
            if (this.f7073b == null) {
                str2 = str + " tokenExpirationTimestamp";
            }
            String str3 = str2;
            if (this.f7074c == null) {
                str3 = str2 + " tokenCreationTimestamp";
            }
            if (str3.isEmpty()) {
                return new C1061a(this.f7072a, this.f7073b.longValue(), this.f7074c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str3);
        }

        @Override // cd.AbstractC1072l.a
        /* renamed from: b */
        public AbstractC1072l.a mo6272b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f7072a = str;
            return this;
        }

        @Override // cd.AbstractC1072l.a
        /* renamed from: c */
        public AbstractC1072l.a mo6273c(long j10) {
            this.f7074c = Long.valueOf(j10);
            return this;
        }

        @Override // cd.AbstractC1072l.a
        /* renamed from: d */
        public AbstractC1072l.a mo6274d(long j10) {
            this.f7073b = Long.valueOf(j10);
            return this;
        }
    }

    public C1061a(String str, long j10, long j11) {
        this.f7069a = str;
        this.f7070b = j10;
        this.f7071c = j11;
    }

    @Override // cd.AbstractC1072l
    /* renamed from: b */
    public String mo6268b() {
        return this.f7069a;
    }

    @Override // cd.AbstractC1072l
    /* renamed from: c */
    public long mo6269c() {
        return this.f7071c;
    }

    @Override // cd.AbstractC1072l
    /* renamed from: d */
    public long mo6270d() {
        return this.f7070b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1072l)) {
            return false;
        }
        AbstractC1072l abstractC1072l = (AbstractC1072l) obj;
        if (!this.f7069a.equals(abstractC1072l.mo6268b()) || this.f7070b != abstractC1072l.mo6270d() || this.f7071c != abstractC1072l.mo6269c()) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f7069a.hashCode();
        long j10 = this.f7070b;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f7071c;
        return ((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f7069a + ", tokenExpirationTimestamp=" + this.f7070b + ", tokenCreationTimestamp=" + this.f7071c + "}";
    }
}
