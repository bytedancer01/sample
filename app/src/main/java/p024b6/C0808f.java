package p024b6;

import java.util.Arrays;
import p024b6.AbstractC0814l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/f.class
 */
/* renamed from: b6.f */
/* loaded from: combined.jar:classes1.jar:b6/f.class */
public final class C0808f extends AbstractC0814l {

    /* renamed from: a */
    public final long f5646a;

    /* renamed from: b */
    public final Integer f5647b;

    /* renamed from: c */
    public final long f5648c;

    /* renamed from: d */
    public final byte[] f5649d;

    /* renamed from: e */
    public final String f5650e;

    /* renamed from: f */
    public final long f5651f;

    /* renamed from: g */
    public final AbstractC0817o f5652g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/f$b.class
     */
    /* renamed from: b6.f$b */
    /* loaded from: combined.jar:classes1.jar:b6/f$b.class */
    public static final class b extends AbstractC0814l.a {

        /* renamed from: a */
        public Long f5653a;

        /* renamed from: b */
        public Integer f5654b;

        /* renamed from: c */
        public Long f5655c;

        /* renamed from: d */
        public byte[] f5656d;

        /* renamed from: e */
        public String f5657e;

        /* renamed from: f */
        public Long f5658f;

        /* renamed from: g */
        public AbstractC0817o f5659g;

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: a */
        public AbstractC0814l mo5180a() {
            String str = "";
            if (this.f5653a == null) {
                str = " eventTimeMs";
            }
            String str2 = str;
            if (this.f5655c == null) {
                str2 = str + " eventUptimeMs";
            }
            String str3 = str2;
            if (this.f5658f == null) {
                str3 = str2 + " timezoneOffsetSeconds";
            }
            if (str3.isEmpty()) {
                return new C0808f(this.f5653a.longValue(), this.f5654b, this.f5655c.longValue(), this.f5656d, this.f5657e, this.f5658f.longValue(), this.f5659g);
            }
            throw new IllegalStateException("Missing required properties:" + str3);
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: b */
        public AbstractC0814l.a mo5181b(Integer num) {
            this.f5654b = num;
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: c */
        public AbstractC0814l.a mo5182c(long j10) {
            this.f5653a = Long.valueOf(j10);
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: d */
        public AbstractC0814l.a mo5183d(long j10) {
            this.f5655c = Long.valueOf(j10);
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: e */
        public AbstractC0814l.a mo5184e(AbstractC0817o abstractC0817o) {
            this.f5659g = abstractC0817o;
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: f */
        public AbstractC0814l.a mo5185f(byte[] bArr) {
            this.f5656d = bArr;
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: g */
        public AbstractC0814l.a mo5186g(String str) {
            this.f5657e = str;
            return this;
        }

        @Override // p024b6.AbstractC0814l.a
        /* renamed from: h */
        public AbstractC0814l.a mo5187h(long j10) {
            this.f5658f = Long.valueOf(j10);
            return this;
        }
    }

    public C0808f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC0817o abstractC0817o) {
        this.f5646a = j10;
        this.f5647b = num;
        this.f5648c = j11;
        this.f5649d = bArr;
        this.f5650e = str;
        this.f5651f = j12;
        this.f5652g = abstractC0817o;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: b */
    public Integer mo5173b() {
        return this.f5647b;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: c */
    public long mo5174c() {
        return this.f5646a;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: d */
    public long mo5175d() {
        return this.f5648c;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: e */
    public AbstractC0817o mo5176e() {
        return this.f5652g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0814l)) {
            return false;
        }
        AbstractC0814l abstractC0814l = (AbstractC0814l) obj;
        if (this.f5646a == abstractC0814l.mo5174c() && ((num = this.f5647b) != null ? num.equals(abstractC0814l.mo5173b()) : abstractC0814l.mo5173b() == null) && this.f5648c == abstractC0814l.mo5175d()) {
            if (Arrays.equals(this.f5649d, abstractC0814l instanceof C0808f ? ((C0808f) abstractC0814l).f5649d : abstractC0814l.mo5177f()) && ((str = this.f5650e) != null ? str.equals(abstractC0814l.mo5178g()) : abstractC0814l.mo5178g() == null) && this.f5651f == abstractC0814l.mo5179h()) {
                AbstractC0817o abstractC0817o = this.f5652g;
                AbstractC0817o mo5176e = abstractC0814l.mo5176e();
                if (abstractC0817o != null) {
                }
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: f */
    public byte[] mo5177f() {
        return this.f5649d;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: g */
    public String mo5178g() {
        return this.f5650e;
    }

    @Override // p024b6.AbstractC0814l
    /* renamed from: h */
    public long mo5179h() {
        return this.f5651f;
    }

    public int hashCode() {
        long j10 = this.f5646a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        Integer num = this.f5647b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f5648c;
        int i12 = (int) (j11 ^ (j11 >>> 32));
        int hashCode2 = Arrays.hashCode(this.f5649d);
        String str = this.f5650e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f5651f;
        int i13 = (int) ((j12 >>> 32) ^ j12);
        AbstractC0817o abstractC0817o = this.f5652g;
        if (abstractC0817o != null) {
            i11 = abstractC0817o.hashCode();
        }
        return ((((((((((((i10 ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i12) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i13) * 1000003) ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f5646a + ", eventCode=" + this.f5647b + ", eventUptimeMs=" + this.f5648c + ", sourceExtension=" + Arrays.toString(this.f5649d) + ", sourceExtensionJsonProto3=" + this.f5650e + ", timezoneOffsetSeconds=" + this.f5651f + ", networkConnectionInfo=" + this.f5652g + "}";
    }
}
