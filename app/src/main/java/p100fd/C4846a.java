package p100fd;

import p100fd.AbstractC4849d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/a.class
 */
/* renamed from: fd.a */
/* loaded from: combined.jar:classes2.jar:fd/a.class */
public final class C4846a extends AbstractC4849d {

    /* renamed from: a */
    public final String f28451a;

    /* renamed from: b */
    public final String f28452b;

    /* renamed from: c */
    public final String f28453c;

    /* renamed from: d */
    public final AbstractC4851f f28454d;

    /* renamed from: e */
    public final AbstractC4849d.b f28455e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/a$b.class
     */
    /* renamed from: fd.a$b */
    /* loaded from: combined.jar:classes2.jar:fd/a$b.class */
    public static final class b extends AbstractC4849d.a {

        /* renamed from: a */
        public String f28456a;

        /* renamed from: b */
        public String f28457b;

        /* renamed from: c */
        public String f28458c;

        /* renamed from: d */
        public AbstractC4851f f28459d;

        /* renamed from: e */
        public AbstractC4849d.b f28460e;

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: a */
        public AbstractC4849d mo24626a() {
            return new C4846a(this.f28456a, this.f28457b, this.f28458c, this.f28459d, this.f28460e);
        }

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: b */
        public AbstractC4849d.a mo24627b(AbstractC4851f abstractC4851f) {
            this.f28459d = abstractC4851f;
            return this;
        }

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: c */
        public AbstractC4849d.a mo24628c(String str) {
            this.f28457b = str;
            return this;
        }

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: d */
        public AbstractC4849d.a mo24629d(String str) {
            this.f28458c = str;
            return this;
        }

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: e */
        public AbstractC4849d.a mo24630e(AbstractC4849d.b bVar) {
            this.f28460e = bVar;
            return this;
        }

        @Override // p100fd.AbstractC4849d.a
        /* renamed from: f */
        public AbstractC4849d.a mo24631f(String str) {
            this.f28456a = str;
            return this;
        }
    }

    public C4846a(String str, String str2, String str3, AbstractC4851f abstractC4851f, AbstractC4849d.b bVar) {
        this.f28451a = str;
        this.f28452b = str2;
        this.f28453c = str3;
        this.f28454d = abstractC4851f;
        this.f28455e = bVar;
    }

    @Override // p100fd.AbstractC4849d
    /* renamed from: b */
    public AbstractC4851f mo24621b() {
        return this.f28454d;
    }

    @Override // p100fd.AbstractC4849d
    /* renamed from: c */
    public String mo24622c() {
        return this.f28452b;
    }

    @Override // p100fd.AbstractC4849d
    /* renamed from: d */
    public String mo24623d() {
        return this.f28453c;
    }

    @Override // p100fd.AbstractC4849d
    /* renamed from: e */
    public AbstractC4849d.b mo24624e() {
        return this.f28455e;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4849d)) {
            return false;
        }
        AbstractC4849d abstractC4849d = (AbstractC4849d) obj;
        String str = this.f28451a;
        if (str != null ? str.equals(abstractC4849d.mo24625f()) : abstractC4849d.mo24625f() == null) {
            String str2 = this.f28452b;
            if (str2 != null ? str2.equals(abstractC4849d.mo24622c()) : abstractC4849d.mo24622c() == null) {
                String str3 = this.f28453c;
                if (str3 != null ? str3.equals(abstractC4849d.mo24623d()) : abstractC4849d.mo24623d() == null) {
                    AbstractC4851f abstractC4851f = this.f28454d;
                    if (abstractC4851f != null ? abstractC4851f.equals(abstractC4849d.mo24621b()) : abstractC4849d.mo24621b() == null) {
                        AbstractC4849d.b bVar = this.f28455e;
                        AbstractC4849d.b mo24624e = abstractC4849d.mo24624e();
                        if (bVar != null) {
                        }
                    }
                }
            }
        }
        z10 = false;
        return z10;
    }

    @Override // p100fd.AbstractC4849d
    /* renamed from: f */
    public String mo24625f() {
        return this.f28451a;
    }

    public int hashCode() {
        String str = this.f28451a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f28452b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f28453c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        AbstractC4851f abstractC4851f = this.f28454d;
        int hashCode4 = abstractC4851f == null ? 0 : abstractC4851f.hashCode();
        AbstractC4849d.b bVar = this.f28455e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f28451a + ", fid=" + this.f28452b + ", refreshToken=" + this.f28453c + ", authToken=" + this.f28454d + ", responseCode=" + this.f28455e + "}";
    }
}
