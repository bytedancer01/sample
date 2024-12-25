package p024b6;

import p024b6.AbstractC0817o;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/i.class
 */
/* renamed from: b6.i */
/* loaded from: combined.jar:classes1.jar:b6/i.class */
public final class C0811i extends AbstractC0817o {

    /* renamed from: a */
    public final AbstractC0817o.c f5675a;

    /* renamed from: b */
    public final AbstractC0817o.b f5676b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/i$b.class
     */
    /* renamed from: b6.i$b */
    /* loaded from: combined.jar:classes1.jar:b6/i$b.class */
    public static final class b extends AbstractC0817o.a {

        /* renamed from: a */
        public AbstractC0817o.c f5677a;

        /* renamed from: b */
        public AbstractC0817o.b f5678b;

        @Override // p024b6.AbstractC0817o.a
        /* renamed from: a */
        public AbstractC0817o mo5206a() {
            return new C0811i(this.f5677a, this.f5678b);
        }

        @Override // p024b6.AbstractC0817o.a
        /* renamed from: b */
        public AbstractC0817o.a mo5207b(AbstractC0817o.b bVar) {
            this.f5678b = bVar;
            return this;
        }

        @Override // p024b6.AbstractC0817o.a
        /* renamed from: c */
        public AbstractC0817o.a mo5208c(AbstractC0817o.c cVar) {
            this.f5677a = cVar;
            return this;
        }
    }

    public C0811i(AbstractC0817o.c cVar, AbstractC0817o.b bVar) {
        this.f5675a = cVar;
        this.f5676b = bVar;
    }

    @Override // p024b6.AbstractC0817o
    /* renamed from: b */
    public AbstractC0817o.b mo5204b() {
        return this.f5676b;
    }

    @Override // p024b6.AbstractC0817o
    /* renamed from: c */
    public AbstractC0817o.c mo5205c() {
        return this.f5675a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0817o)) {
            return false;
        }
        AbstractC0817o abstractC0817o = (AbstractC0817o) obj;
        AbstractC0817o.c cVar = this.f5675a;
        if (cVar != null ? cVar.equals(abstractC0817o.mo5205c()) : abstractC0817o.mo5205c() == null) {
            AbstractC0817o.b bVar = this.f5676b;
            AbstractC0817o.b mo5204b = abstractC0817o.mo5204b();
            if (bVar != null) {
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        AbstractC0817o.c cVar = this.f5675a;
        int i10 = 0;
        int hashCode = cVar == null ? 0 : cVar.hashCode();
        AbstractC0817o.b bVar = this.f5676b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5675a + ", mobileSubtype=" + this.f5676b + "}";
    }
}
