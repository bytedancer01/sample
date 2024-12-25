package p100fd;

import p100fd.AbstractC4851f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/b.class
 */
/* renamed from: fd.b */
/* loaded from: combined.jar:classes2.jar:fd/b.class */
public final class C4847b extends AbstractC4851f {

    /* renamed from: a */
    public final String f28461a;

    /* renamed from: b */
    public final long f28462b;

    /* renamed from: c */
    public final AbstractC4851f.b f28463c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/b$b.class
     */
    /* renamed from: fd.b$b */
    /* loaded from: combined.jar:classes2.jar:fd/b$b.class */
    public static final class b extends AbstractC4851f.a {

        /* renamed from: a */
        public String f28464a;

        /* renamed from: b */
        public Long f28465b;

        /* renamed from: c */
        public AbstractC4851f.b f28466c;

        @Override // p100fd.AbstractC4851f.a
        /* renamed from: a */
        public AbstractC4851f mo24635a() {
            String str = "";
            if (this.f28465b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C4847b(this.f28464a, this.f28465b.longValue(), this.f28466c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p100fd.AbstractC4851f.a
        /* renamed from: b */
        public AbstractC4851f.a mo24636b(AbstractC4851f.b bVar) {
            this.f28466c = bVar;
            return this;
        }

        @Override // p100fd.AbstractC4851f.a
        /* renamed from: c */
        public AbstractC4851f.a mo24637c(String str) {
            this.f28464a = str;
            return this;
        }

        @Override // p100fd.AbstractC4851f.a
        /* renamed from: d */
        public AbstractC4851f.a mo24638d(long j10) {
            this.f28465b = Long.valueOf(j10);
            return this;
        }
    }

    public C4847b(String str, long j10, AbstractC4851f.b bVar) {
        this.f28461a = str;
        this.f28462b = j10;
        this.f28463c = bVar;
    }

    @Override // p100fd.AbstractC4851f
    /* renamed from: b */
    public AbstractC4851f.b mo24632b() {
        return this.f28463c;
    }

    @Override // p100fd.AbstractC4851f
    /* renamed from: c */
    public String mo24633c() {
        return this.f28461a;
    }

    @Override // p100fd.AbstractC4851f
    /* renamed from: d */
    public long mo24634d() {
        return this.f28462b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4851f)) {
            return false;
        }
        AbstractC4851f abstractC4851f = (AbstractC4851f) obj;
        String str = this.f28461a;
        if (str != null ? str.equals(abstractC4851f.mo24633c()) : abstractC4851f.mo24633c() == null) {
            if (this.f28462b == abstractC4851f.mo24634d()) {
                AbstractC4851f.b bVar = this.f28463c;
                AbstractC4851f.b mo24632b = abstractC4851f.mo24632b();
                if (bVar != null) {
                }
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        String str = this.f28461a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f28462b;
        int i11 = (int) (j10 ^ (j10 >>> 32));
        AbstractC4851f.b bVar = this.f28463c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i11) * 1000003) ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f28461a + ", tokenExpirationTimestamp=" + this.f28462b + ", responseCode=" + this.f28463c + "}";
    }
}
