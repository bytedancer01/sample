package p024b6;

import java.util.List;
import p024b6.AbstractC0815m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/g.class
 */
/* renamed from: b6.g */
/* loaded from: combined.jar:classes1.jar:b6/g.class */
public final class C0809g extends AbstractC0815m {

    /* renamed from: a */
    public final long f5660a;

    /* renamed from: b */
    public final long f5661b;

    /* renamed from: c */
    public final AbstractC0813k f5662c;

    /* renamed from: d */
    public final Integer f5663d;

    /* renamed from: e */
    public final String f5664e;

    /* renamed from: f */
    public final List<AbstractC0814l> f5665f;

    /* renamed from: g */
    public final EnumC0818p f5666g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/g$b.class
     */
    /* renamed from: b6.g$b */
    /* loaded from: combined.jar:classes1.jar:b6/g$b.class */
    public static final class b extends AbstractC0815m.a {

        /* renamed from: a */
        public Long f5667a;

        /* renamed from: b */
        public Long f5668b;

        /* renamed from: c */
        public AbstractC0813k f5669c;

        /* renamed from: d */
        public Integer f5670d;

        /* renamed from: e */
        public String f5671e;

        /* renamed from: f */
        public List<AbstractC0814l> f5672f;

        /* renamed from: g */
        public EnumC0818p f5673g;

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: a */
        public AbstractC0815m mo5195a() {
            String str = "";
            if (this.f5667a == null) {
                str = " requestTimeMs";
            }
            String str2 = str;
            if (this.f5668b == null) {
                str2 = str + " requestUptimeMs";
            }
            if (str2.isEmpty()) {
                return new C0809g(this.f5667a.longValue(), this.f5668b.longValue(), this.f5669c, this.f5670d, this.f5671e, this.f5672f, this.f5673g);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: b */
        public AbstractC0815m.a mo5196b(AbstractC0813k abstractC0813k) {
            this.f5669c = abstractC0813k;
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: c */
        public AbstractC0815m.a mo5197c(List<AbstractC0814l> list) {
            this.f5672f = list;
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: d */
        public AbstractC0815m.a mo5198d(Integer num) {
            this.f5670d = num;
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: e */
        public AbstractC0815m.a mo5199e(String str) {
            this.f5671e = str;
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: f */
        public AbstractC0815m.a mo5200f(EnumC0818p enumC0818p) {
            this.f5673g = enumC0818p;
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: g */
        public AbstractC0815m.a mo5201g(long j10) {
            this.f5667a = Long.valueOf(j10);
            return this;
        }

        @Override // p024b6.AbstractC0815m.a
        /* renamed from: h */
        public AbstractC0815m.a mo5202h(long j10) {
            this.f5668b = Long.valueOf(j10);
            return this;
        }
    }

    public C0809g(long j10, long j11, AbstractC0813k abstractC0813k, Integer num, String str, List<AbstractC0814l> list, EnumC0818p enumC0818p) {
        this.f5660a = j10;
        this.f5661b = j11;
        this.f5662c = abstractC0813k;
        this.f5663d = num;
        this.f5664e = str;
        this.f5665f = list;
        this.f5666g = enumC0818p;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: b */
    public AbstractC0813k mo5188b() {
        return this.f5662c;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: c */
    public List<AbstractC0814l> mo5189c() {
        return this.f5665f;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: d */
    public Integer mo5190d() {
        return this.f5663d;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: e */
    public String mo5191e() {
        return this.f5664e;
    }

    public boolean equals(Object obj) {
        AbstractC0813k abstractC0813k;
        Integer num;
        String str;
        List<AbstractC0814l> list;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0815m)) {
            return false;
        }
        AbstractC0815m abstractC0815m = (AbstractC0815m) obj;
        if (this.f5660a == abstractC0815m.mo5193g() && this.f5661b == abstractC0815m.mo5194h() && ((abstractC0813k = this.f5662c) != null ? abstractC0813k.equals(abstractC0815m.mo5188b()) : abstractC0815m.mo5188b() == null) && ((num = this.f5663d) != null ? num.equals(abstractC0815m.mo5190d()) : abstractC0815m.mo5190d() == null) && ((str = this.f5664e) != null ? str.equals(abstractC0815m.mo5191e()) : abstractC0815m.mo5191e() == null) && ((list = this.f5665f) != null ? list.equals(abstractC0815m.mo5189c()) : abstractC0815m.mo5189c() == null)) {
            EnumC0818p enumC0818p = this.f5666g;
            EnumC0818p mo5192f = abstractC0815m.mo5192f();
            if (enumC0818p != null) {
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: f */
    public EnumC0818p mo5192f() {
        return this.f5666g;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: g */
    public long mo5193g() {
        return this.f5660a;
    }

    @Override // p024b6.AbstractC0815m
    /* renamed from: h */
    public long mo5194h() {
        return this.f5661b;
    }

    public int hashCode() {
        long j10 = this.f5660a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f5661b;
        int i11 = (int) ((j11 >>> 32) ^ j11);
        AbstractC0813k abstractC0813k = this.f5662c;
        int i12 = 0;
        int hashCode = abstractC0813k == null ? 0 : abstractC0813k.hashCode();
        Integer num = this.f5663d;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.f5664e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        List<AbstractC0814l> list = this.f5665f;
        int hashCode4 = list == null ? 0 : list.hashCode();
        EnumC0818p enumC0818p = this.f5666g;
        if (enumC0818p != null) {
            i12 = enumC0818p.hashCode();
        }
        return ((((((((((((i10 ^ 1000003) * 1000003) ^ i11) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i12;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f5660a + ", requestUptimeMs=" + this.f5661b + ", clientInfo=" + this.f5662c + ", logSource=" + this.f5663d + ", logSourceName=" + this.f5664e + ", logEvents=" + this.f5665f + ", qosTier=" + this.f5666g + "}";
    }
}
