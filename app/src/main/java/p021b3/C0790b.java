package p021b3;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b3/b.class
 */
/* renamed from: b3.b */
/* loaded from: combined.jar:classes1.jar:b3/b.class */
public final class C0790b {

    /* renamed from: a */
    public static final a f5520a = new a(b.CACHE_ONLY);

    /* renamed from: b */
    public static final c f5521b = new c(b.NETWORK_ONLY, 0, null, false);

    /* renamed from: c */
    public static final a f5522c = new a(b.CACHE_FIRST);

    /* renamed from: d */
    public static final a f5523d = new a(b.NETWORK_FIRST);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b3/b$a.class
     */
    /* renamed from: b3.b$a */
    /* loaded from: combined.jar:classes1.jar:b3/b$a.class */
    public static final class a extends c {
        public a(b bVar) {
            super(bVar, 0L, null, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b3/b$b.class
     */
    /* renamed from: b3.b$b */
    /* loaded from: combined.jar:classes1.jar:b3/b$b.class */
    public enum b {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b3/b$c.class
     */
    /* renamed from: b3.b$c */
    /* loaded from: combined.jar:classes1.jar:b3/b$c.class */
    public static class c {

        /* renamed from: a */
        public final b f5524a;

        /* renamed from: b */
        public final long f5525b;

        /* renamed from: c */
        public final TimeUnit f5526c;

        /* renamed from: d */
        public final boolean f5527d;

        public c(b bVar, long j10, TimeUnit timeUnit, boolean z10) {
            this.f5524a = bVar;
            this.f5525b = j10;
            this.f5526c = timeUnit;
            this.f5527d = z10;
        }

        /* renamed from: a */
        public long m5088a() {
            TimeUnit timeUnit = this.f5526c;
            if (timeUnit == null) {
                return 0L;
            }
            return timeUnit.toMillis(this.f5525b);
        }
    }
}
