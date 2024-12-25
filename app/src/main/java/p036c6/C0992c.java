package p036c6;

import p036c6.AbstractC1003n;
import p437z5.AbstractC10055c;
import p437z5.C10054b;
import p437z5.InterfaceC10057e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/c.class
 */
/* renamed from: c6.c */
/* loaded from: combined.jar:classes1.jar:c6/c.class */
public final class C0992c extends AbstractC1003n {

    /* renamed from: a */
    public final AbstractC1004o f6782a;

    /* renamed from: b */
    public final String f6783b;

    /* renamed from: c */
    public final AbstractC10055c<?> f6784c;

    /* renamed from: d */
    public final InterfaceC10057e<?, byte[]> f6785d;

    /* renamed from: e */
    public final C10054b f6786e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/c$b.class
     */
    /* renamed from: c6.c$b */
    /* loaded from: combined.jar:classes1.jar:c6/c$b.class */
    public static final class b extends AbstractC1003n.a {

        /* renamed from: a */
        public AbstractC1004o f6787a;

        /* renamed from: b */
        public String f6788b;

        /* renamed from: c */
        public AbstractC10055c<?> f6789c;

        /* renamed from: d */
        public InterfaceC10057e<?, byte[]> f6790d;

        /* renamed from: e */
        public C10054b f6791e;

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: a */
        public AbstractC1003n mo5921a() {
            String str = "";
            if (this.f6787a == null) {
                str = " transportContext";
            }
            String str2 = str;
            if (this.f6788b == null) {
                str2 = str + " transportName";
            }
            String str3 = str2;
            if (this.f6789c == null) {
                str3 = str2 + " event";
            }
            String str4 = str3;
            if (this.f6790d == null) {
                str4 = str3 + " transformer";
            }
            String str5 = str4;
            if (this.f6791e == null) {
                str5 = str4 + " encoding";
            }
            if (str5.isEmpty()) {
                return new C0992c(this.f6787a, this.f6788b, this.f6789c, this.f6790d, this.f6791e);
            }
            throw new IllegalStateException("Missing required properties:" + str5);
        }

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: b */
        public AbstractC1003n.a mo5922b(C10054b c10054b) {
            if (c10054b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f6791e = c10054b;
            return this;
        }

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: c */
        public AbstractC1003n.a mo5923c(AbstractC10055c<?> abstractC10055c) {
            if (abstractC10055c == null) {
                throw new NullPointerException("Null event");
            }
            this.f6789c = abstractC10055c;
            return this;
        }

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: d */
        public AbstractC1003n.a mo5924d(InterfaceC10057e<?, byte[]> interfaceC10057e) {
            if (interfaceC10057e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f6790d = interfaceC10057e;
            return this;
        }

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: e */
        public AbstractC1003n.a mo5925e(AbstractC1004o abstractC1004o) {
            if (abstractC1004o == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f6787a = abstractC1004o;
            return this;
        }

        @Override // p036c6.AbstractC1003n.a
        /* renamed from: f */
        public AbstractC1003n.a mo5926f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6788b = str;
            return this;
        }
    }

    public C0992c(AbstractC1004o abstractC1004o, String str, AbstractC10055c<?> abstractC10055c, InterfaceC10057e<?, byte[]> interfaceC10057e, C10054b c10054b) {
        this.f6782a = abstractC1004o;
        this.f6783b = str;
        this.f6784c = abstractC10055c;
        this.f6785d = interfaceC10057e;
        this.f6786e = c10054b;
    }

    @Override // p036c6.AbstractC1003n
    /* renamed from: b */
    public C10054b mo5916b() {
        return this.f6786e;
    }

    @Override // p036c6.AbstractC1003n
    /* renamed from: c */
    public AbstractC10055c<?> mo5917c() {
        return this.f6784c;
    }

    @Override // p036c6.AbstractC1003n
    /* renamed from: e */
    public InterfaceC10057e<?, byte[]> mo5918e() {
        return this.f6785d;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1003n)) {
            return false;
        }
        AbstractC1003n abstractC1003n = (AbstractC1003n) obj;
        if (!this.f6782a.equals(abstractC1003n.mo5919f()) || !this.f6783b.equals(abstractC1003n.mo5920g()) || !this.f6784c.equals(abstractC1003n.mo5917c()) || !this.f6785d.equals(abstractC1003n.mo5918e()) || !this.f6786e.equals(abstractC1003n.mo5916b())) {
            z10 = false;
        }
        return z10;
    }

    @Override // p036c6.AbstractC1003n
    /* renamed from: f */
    public AbstractC1004o mo5919f() {
        return this.f6782a;
    }

    @Override // p036c6.AbstractC1003n
    /* renamed from: g */
    public String mo5920g() {
        return this.f6783b;
    }

    public int hashCode() {
        return ((((((((this.f6782a.hashCode() ^ 1000003) * 1000003) ^ this.f6783b.hashCode()) * 1000003) ^ this.f6784c.hashCode()) * 1000003) ^ this.f6785d.hashCode()) * 1000003) ^ this.f6786e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f6782a + ", transportName=" + this.f6783b + ", event=" + this.f6784c + ", transformer=" + this.f6785d + ", encoding=" + this.f6786e + "}";
    }
}
