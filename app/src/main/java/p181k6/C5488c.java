package p181k6;

import java.util.Set;
import p181k6.AbstractC5491f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/c.class
 */
/* renamed from: k6.c */
/* loaded from: combined.jar:classes1.jar:k6/c.class */
public final class C5488c extends AbstractC5491f.b {

    /* renamed from: a */
    public final long f31325a;

    /* renamed from: b */
    public final long f31326b;

    /* renamed from: c */
    public final Set<AbstractC5491f.c> f31327c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k6/c$b.class
     */
    /* renamed from: k6.c$b */
    /* loaded from: combined.jar:classes1.jar:k6/c$b.class */
    public static final class b extends AbstractC5491f.b.a {

        /* renamed from: a */
        public Long f31328a;

        /* renamed from: b */
        public Long f31329b;

        /* renamed from: c */
        public Set<AbstractC5491f.c> f31330c;

        @Override // p181k6.AbstractC5491f.b.a
        /* renamed from: a */
        public AbstractC5491f.b mo27287a() {
            String str = "";
            if (this.f31328a == null) {
                str = " delta";
            }
            String str2 = str;
            if (this.f31329b == null) {
                str2 = str + " maxAllowedDelay";
            }
            String str3 = str2;
            if (this.f31330c == null) {
                str3 = str2 + " flags";
            }
            if (str3.isEmpty()) {
                return new C5488c(this.f31328a.longValue(), this.f31329b.longValue(), this.f31330c);
            }
            throw new IllegalStateException("Missing required properties:" + str3);
        }

        @Override // p181k6.AbstractC5491f.b.a
        /* renamed from: b */
        public AbstractC5491f.b.a mo27288b(long j10) {
            this.f31328a = Long.valueOf(j10);
            return this;
        }

        @Override // p181k6.AbstractC5491f.b.a
        /* renamed from: c */
        public AbstractC5491f.b.a mo27289c(Set<AbstractC5491f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f31330c = set;
            return this;
        }

        @Override // p181k6.AbstractC5491f.b.a
        /* renamed from: d */
        public AbstractC5491f.b.a mo27290d(long j10) {
            this.f31329b = Long.valueOf(j10);
            return this;
        }
    }

    public C5488c(long j10, long j11, Set<AbstractC5491f.c> set) {
        this.f31325a = j10;
        this.f31326b = j11;
        this.f31327c = set;
    }

    @Override // p181k6.AbstractC5491f.b
    /* renamed from: b */
    public long mo27284b() {
        return this.f31325a;
    }

    @Override // p181k6.AbstractC5491f.b
    /* renamed from: c */
    public Set<AbstractC5491f.c> mo27285c() {
        return this.f31327c;
    }

    @Override // p181k6.AbstractC5491f.b
    /* renamed from: d */
    public long mo27286d() {
        return this.f31326b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5491f.b)) {
            return false;
        }
        AbstractC5491f.b bVar = (AbstractC5491f.b) obj;
        if (this.f31325a != bVar.mo27284b() || this.f31326b != bVar.mo27286d() || !this.f31327c.equals(bVar.mo27285c())) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        long j10 = this.f31325a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f31326b;
        return this.f31327c.hashCode() ^ ((((i10 ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f31325a + ", maxAllowedDelay=" + this.f31326b + ", flags=" + this.f31327c + "}";
    }
}
