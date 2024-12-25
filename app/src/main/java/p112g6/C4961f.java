package p112g6;

import p386wc.InterfaceC9563d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g6/f.class
 */
/* renamed from: g6.f */
/* loaded from: combined.jar:classes1.jar:g6/f.class */
public final class C4961f {

    /* renamed from: c */
    public static final C4961f f28768c = new a().m24981a();

    /* renamed from: a */
    public final long f28769a;

    /* renamed from: b */
    public final long f28770b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g6/f$a.class
     */
    /* renamed from: g6.f$a */
    /* loaded from: combined.jar:classes1.jar:g6/f$a.class */
    public static final class a {

        /* renamed from: a */
        public long f28771a = 0;

        /* renamed from: b */
        public long f28772b = 0;

        /* renamed from: a */
        public C4961f m24981a() {
            return new C4961f(this.f28771a, this.f28772b);
        }

        /* renamed from: b */
        public a m24982b(long j10) {
            this.f28772b = j10;
            return this;
        }

        /* renamed from: c */
        public a m24983c(long j10) {
            this.f28771a = j10;
            return this;
        }
    }

    public C4961f(long j10, long j11) {
        this.f28769a = j10;
        this.f28770b = j11;
    }

    /* renamed from: c */
    public static a m24978c() {
        return new a();
    }

    @InterfaceC9563d(tag = 2)
    /* renamed from: a */
    public long m24979a() {
        return this.f28770b;
    }

    @InterfaceC9563d(tag = 1)
    /* renamed from: b */
    public long m24980b() {
        return this.f28769a;
    }
}
