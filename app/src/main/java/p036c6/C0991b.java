package p036c6;

import java.util.Map;
import p036c6.AbstractC0998i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/b.class
 */
/* renamed from: c6.b */
/* loaded from: combined.jar:classes1.jar:c6/b.class */
public final class C0991b extends AbstractC0998i {

    /* renamed from: a */
    public final String f6770a;

    /* renamed from: b */
    public final Integer f6771b;

    /* renamed from: c */
    public final C0997h f6772c;

    /* renamed from: d */
    public final long f6773d;

    /* renamed from: e */
    public final long f6774e;

    /* renamed from: f */
    public final Map<String, String> f6775f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/b$b.class
     */
    /* renamed from: c6.b$b */
    /* loaded from: combined.jar:classes1.jar:c6/b$b.class */
    public static final class b extends AbstractC0998i.a {

        /* renamed from: a */
        public String f6776a;

        /* renamed from: b */
        public Integer f6777b;

        /* renamed from: c */
        public C0997h f6778c;

        /* renamed from: d */
        public Long f6779d;

        /* renamed from: e */
        public Long f6780e;

        /* renamed from: f */
        public Map<String, String> f6781f;

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: d */
        public AbstractC0998i mo5908d() {
            String str = "";
            if (this.f6776a == null) {
                str = " transportName";
            }
            String str2 = str;
            if (this.f6778c == null) {
                str2 = str + " encodedPayload";
            }
            String str3 = str2;
            if (this.f6779d == null) {
                str3 = str2 + " eventMillis";
            }
            String str4 = str3;
            if (this.f6780e == null) {
                str4 = str3 + " uptimeMillis";
            }
            String str5 = str4;
            if (this.f6781f == null) {
                str5 = str4 + " autoMetadata";
            }
            if (str5.isEmpty()) {
                return new C0991b(this.f6776a, this.f6777b, this.f6778c, this.f6779d.longValue(), this.f6780e.longValue(), this.f6781f);
            }
            throw new IllegalStateException("Missing required properties:" + str5);
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: e */
        public Map<String, String> mo5909e() {
            Map<String, String> map = this.f6781f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: f */
        public AbstractC0998i.a mo5910f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f6781f = map;
            return this;
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: g */
        public AbstractC0998i.a mo5911g(Integer num) {
            this.f6777b = num;
            return this;
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: h */
        public AbstractC0998i.a mo5912h(C0997h c0997h) {
            if (c0997h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f6778c = c0997h;
            return this;
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: i */
        public AbstractC0998i.a mo5913i(long j10) {
            this.f6779d = Long.valueOf(j10);
            return this;
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: j */
        public AbstractC0998i.a mo5914j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6776a = str;
            return this;
        }

        @Override // p036c6.AbstractC0998i.a
        /* renamed from: k */
        public AbstractC0998i.a mo5915k(long j10) {
            this.f6780e = Long.valueOf(j10);
            return this;
        }
    }

    public C0991b(String str, Integer num, C0997h c0997h, long j10, long j11, Map<String, String> map) {
        this.f6770a = str;
        this.f6771b = num;
        this.f6772c = c0997h;
        this.f6773d = j10;
        this.f6774e = j11;
        this.f6775f = map;
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: c */
    public Map<String, String> mo5902c() {
        return this.f6775f;
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: d */
    public Integer mo5903d() {
        return this.f6771b;
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: e */
    public C0997h mo5904e() {
        return this.f6772c;
    }

    public boolean equals(Object obj) {
        Integer num;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0998i)) {
            return false;
        }
        AbstractC0998i abstractC0998i = (AbstractC0998i) obj;
        if (!this.f6770a.equals(abstractC0998i.mo5906j()) || ((num = this.f6771b) != null ? !num.equals(abstractC0998i.mo5903d()) : abstractC0998i.mo5903d() != null) || !this.f6772c.equals(abstractC0998i.mo5904e()) || this.f6773d != abstractC0998i.mo5905f() || this.f6774e != abstractC0998i.mo5907k() || !this.f6775f.equals(abstractC0998i.mo5902c())) {
            z10 = false;
        }
        return z10;
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: f */
    public long mo5905f() {
        return this.f6773d;
    }

    public int hashCode() {
        int hashCode = this.f6770a.hashCode();
        Integer num = this.f6771b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.f6772c.hashCode();
        long j10 = this.f6773d;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f6774e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i10) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f6775f.hashCode();
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: j */
    public String mo5906j() {
        return this.f6770a;
    }

    @Override // p036c6.AbstractC0998i
    /* renamed from: k */
    public long mo5907k() {
        return this.f6774e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f6770a + ", code=" + this.f6771b + ", encodedPayload=" + this.f6772c + ", eventMillis=" + this.f6773d + ", uptimeMillis=" + this.f6774e + ", autoMetadata=" + this.f6775f + "}";
    }
}
