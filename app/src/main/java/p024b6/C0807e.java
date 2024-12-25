package p024b6;

import p024b6.AbstractC0813k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/e.class
 */
/* renamed from: b6.e */
/* loaded from: combined.jar:classes1.jar:b6/e.class */
public final class C0807e extends AbstractC0813k {

    /* renamed from: a */
    public final AbstractC0813k.b f5642a;

    /* renamed from: b */
    public final AbstractC0803a f5643b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/e$b.class
     */
    /* renamed from: b6.e$b */
    /* loaded from: combined.jar:classes1.jar:b6/e$b.class */
    public static final class b extends AbstractC0813k.a {

        /* renamed from: a */
        public AbstractC0813k.b f5644a;

        /* renamed from: b */
        public AbstractC0803a f5645b;

        @Override // p024b6.AbstractC0813k.a
        /* renamed from: a */
        public AbstractC0813k mo5170a() {
            return new C0807e(this.f5644a, this.f5645b);
        }

        @Override // p024b6.AbstractC0813k.a
        /* renamed from: b */
        public AbstractC0813k.a mo5171b(AbstractC0803a abstractC0803a) {
            this.f5645b = abstractC0803a;
            return this;
        }

        @Override // p024b6.AbstractC0813k.a
        /* renamed from: c */
        public AbstractC0813k.a mo5172c(AbstractC0813k.b bVar) {
            this.f5644a = bVar;
            return this;
        }
    }

    public C0807e(AbstractC0813k.b bVar, AbstractC0803a abstractC0803a) {
        this.f5642a = bVar;
        this.f5643b = abstractC0803a;
    }

    @Override // p024b6.AbstractC0813k
    /* renamed from: b */
    public AbstractC0803a mo5168b() {
        return this.f5643b;
    }

    @Override // p024b6.AbstractC0813k
    /* renamed from: c */
    public AbstractC0813k.b mo5169c() {
        return this.f5642a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0813k)) {
            return false;
        }
        AbstractC0813k abstractC0813k = (AbstractC0813k) obj;
        AbstractC0813k.b bVar = this.f5642a;
        if (bVar != null ? bVar.equals(abstractC0813k.mo5169c()) : abstractC0813k.mo5169c() == null) {
            AbstractC0803a abstractC0803a = this.f5643b;
            AbstractC0803a mo5168b = abstractC0813k.mo5168b();
            if (abstractC0803a != null) {
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        AbstractC0813k.b bVar = this.f5642a;
        int i10 = 0;
        int hashCode = bVar == null ? 0 : bVar.hashCode();
        AbstractC0803a abstractC0803a = this.f5643b;
        if (abstractC0803a != null) {
            i10 = abstractC0803a.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f5642a + ", androidClientInfo=" + this.f5643b + "}";
    }
}
