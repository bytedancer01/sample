package p197l6;

import p197l6.AbstractC5691e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/a.class
 */
/* renamed from: l6.a */
/* loaded from: combined.jar:classes1.jar:l6/a.class */
public final class C5683a extends AbstractC5691e {

    /* renamed from: b */
    public final long f32018b;

    /* renamed from: c */
    public final int f32019c;

    /* renamed from: d */
    public final int f32020d;

    /* renamed from: e */
    public final long f32021e;

    /* renamed from: f */
    public final int f32022f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/a$b.class
     */
    /* renamed from: l6.a$b */
    /* loaded from: combined.jar:classes1.jar:l6/a$b.class */
    public static final class b extends AbstractC5691e.a {

        /* renamed from: a */
        public Long f32023a;

        /* renamed from: b */
        public Integer f32024b;

        /* renamed from: c */
        public Integer f32025c;

        /* renamed from: d */
        public Long f32026d;

        /* renamed from: e */
        public Integer f32027e;

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: a */
        public AbstractC5691e mo27947a() {
            String str = "";
            if (this.f32023a == null) {
                str = " maxStorageSizeInBytes";
            }
            String str2 = str;
            if (this.f32024b == null) {
                str2 = str + " loadBatchSize";
            }
            String str3 = str2;
            if (this.f32025c == null) {
                str3 = str2 + " criticalSectionEnterTimeoutMs";
            }
            String str4 = str3;
            if (this.f32026d == null) {
                str4 = str3 + " eventCleanUpAge";
            }
            String str5 = str4;
            if (this.f32027e == null) {
                str5 = str4 + " maxBlobByteSizePerRow";
            }
            if (str5.isEmpty()) {
                return new C5683a(this.f32023a.longValue(), this.f32024b.intValue(), this.f32025c.intValue(), this.f32026d.longValue(), this.f32027e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str5);
        }

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: b */
        public AbstractC5691e.a mo27948b(int i10) {
            this.f32025c = Integer.valueOf(i10);
            return this;
        }

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: c */
        public AbstractC5691e.a mo27949c(long j10) {
            this.f32026d = Long.valueOf(j10);
            return this;
        }

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: d */
        public AbstractC5691e.a mo27950d(int i10) {
            this.f32024b = Integer.valueOf(i10);
            return this;
        }

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: e */
        public AbstractC5691e.a mo27951e(int i10) {
            this.f32027e = Integer.valueOf(i10);
            return this;
        }

        @Override // p197l6.AbstractC5691e.a
        /* renamed from: f */
        public AbstractC5691e.a mo27952f(long j10) {
            this.f32023a = Long.valueOf(j10);
            return this;
        }
    }

    public C5683a(long j10, int i10, int i11, long j11, int i12) {
        this.f32018b = j10;
        this.f32019c = i10;
        this.f32020d = i11;
        this.f32021e = j11;
        this.f32022f = i12;
    }

    @Override // p197l6.AbstractC5691e
    /* renamed from: b */
    public int mo27942b() {
        return this.f32020d;
    }

    @Override // p197l6.AbstractC5691e
    /* renamed from: c */
    public long mo27943c() {
        return this.f32021e;
    }

    @Override // p197l6.AbstractC5691e
    /* renamed from: d */
    public int mo27944d() {
        return this.f32019c;
    }

    @Override // p197l6.AbstractC5691e
    /* renamed from: e */
    public int mo27945e() {
        return this.f32022f;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5691e)) {
            return false;
        }
        AbstractC5691e abstractC5691e = (AbstractC5691e) obj;
        if (this.f32018b != abstractC5691e.mo27946f() || this.f32019c != abstractC5691e.mo27944d() || this.f32020d != abstractC5691e.mo27942b() || this.f32021e != abstractC5691e.mo27943c() || this.f32022f != abstractC5691e.mo27945e()) {
            z10 = false;
        }
        return z10;
    }

    @Override // p197l6.AbstractC5691e
    /* renamed from: f */
    public long mo27946f() {
        return this.f32018b;
    }

    public int hashCode() {
        long j10 = this.f32018b;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        int i11 = this.f32019c;
        int i12 = this.f32020d;
        long j11 = this.f32021e;
        return this.f32022f ^ ((((((((i10 ^ 1000003) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f32018b + ", loadBatchSize=" + this.f32019c + ", criticalSectionEnterTimeoutMs=" + this.f32020d + ", eventCleanUpAge=" + this.f32021e + ", maxBlobByteSizePerRow=" + this.f32022f + "}";
    }
}
