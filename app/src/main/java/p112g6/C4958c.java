package p112g6;

import p386wc.InterfaceC9562c;
import p386wc.InterfaceC9563d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g6/c.class
 */
/* renamed from: g6.c */
/* loaded from: combined.jar:classes1.jar:g6/c.class */
public final class C4958c {

    /* renamed from: c */
    public static final C4958c f28753c = new a().m24963a();

    /* renamed from: a */
    public final long f28754a;

    /* renamed from: b */
    public final b f28755b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g6/c$a.class
     */
    /* renamed from: g6.c$a */
    /* loaded from: combined.jar:classes1.jar:g6/c$a.class */
    public static final class a {

        /* renamed from: a */
        public long f28756a = 0;

        /* renamed from: b */
        public b f28757b = b.REASON_UNKNOWN;

        /* renamed from: a */
        public C4958c m24963a() {
            return new C4958c(this.f28756a, this.f28757b);
        }

        /* renamed from: b */
        public a m24964b(long j10) {
            this.f28756a = j10;
            return this;
        }

        /* renamed from: c */
        public a m24965c(b bVar) {
            this.f28757b = bVar;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g6/c$b.class
     */
    /* renamed from: g6.c$b */
    /* loaded from: combined.jar:classes1.jar:g6/c$b.class */
    public enum b implements InterfaceC9562c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // p386wc.InterfaceC9562c
        public int getNumber() {
            return this.number_;
        }
    }

    public C4958c(long j10, b bVar) {
        this.f28754a = j10;
        this.f28755b = bVar;
    }

    /* renamed from: c */
    public static a m24960c() {
        return new a();
    }

    @InterfaceC9563d(tag = 1)
    /* renamed from: a */
    public long m24961a() {
        return this.f28754a;
    }

    @InterfaceC9563d(tag = 3)
    /* renamed from: b */
    public b m24962b() {
        return this.f28755b;
    }
}
