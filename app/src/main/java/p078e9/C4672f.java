package p078e9;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/f.class
 */
/* renamed from: e9.f */
/* loaded from: combined.jar:classes2.jar:e9/f.class */
public final class C4672f {

    /* renamed from: c */
    public boolean f27575c;

    /* renamed from: d */
    public boolean f27576d;

    /* renamed from: f */
    public int f27578f;

    /* renamed from: a */
    public a f27573a = new a();

    /* renamed from: b */
    public a f27574b = new a();

    /* renamed from: e */
    public long f27577e = -9223372036854775807L;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/f$a.class
     */
    /* renamed from: e9.f$a */
    /* loaded from: combined.jar:classes2.jar:e9/f$a.class */
    public static final class a {

        /* renamed from: a */
        public long f27579a;

        /* renamed from: b */
        public long f27580b;

        /* renamed from: c */
        public long f27581c;

        /* renamed from: d */
        public long f27582d;

        /* renamed from: e */
        public long f27583e;

        /* renamed from: f */
        public long f27584f;

        /* renamed from: g */
        public final boolean[] f27585g = new boolean[15];

        /* renamed from: h */
        public int f27586h;

        /* renamed from: c */
        public static int m23503c(long j10) {
            return (int) (j10 % 15);
        }

        /* renamed from: a */
        public long m23504a() {
            long j10 = this.f27583e;
            long j11 = 0;
            if (j10 != 0) {
                j11 = this.f27584f / j10;
            }
            return j11;
        }

        /* renamed from: b */
        public long m23505b() {
            return this.f27584f;
        }

        /* renamed from: d */
        public boolean m23506d() {
            long j10 = this.f27582d;
            if (j10 == 0) {
                return false;
            }
            return this.f27585g[m23503c(j10 - 1)];
        }

        /* renamed from: e */
        public boolean m23507e() {
            return this.f27582d > 15 && this.f27586h == 0;
        }

        /* renamed from: f */
        public void m23508f(long j10) {
            int i10;
            long j11 = this.f27582d;
            if (j11 == 0) {
                this.f27579a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f27579a;
                this.f27580b = j12;
                this.f27584f = j12;
                this.f27583e = 1L;
            } else {
                long j13 = j10 - this.f27581c;
                int m23503c = m23503c(j11);
                if (Math.abs(j13 - this.f27580b) <= 1000000) {
                    this.f27583e++;
                    this.f27584f += j13;
                    boolean[] zArr = this.f27585g;
                    if (zArr[m23503c]) {
                        zArr[m23503c] = false;
                        i10 = this.f27586h - 1;
                        this.f27586h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f27585g;
                    if (!zArr2[m23503c]) {
                        zArr2[m23503c] = true;
                        i10 = this.f27586h + 1;
                        this.f27586h = i10;
                    }
                }
            }
            this.f27582d++;
            this.f27581c = j10;
        }

        /* renamed from: g */
        public void m23509g() {
            this.f27582d = 0L;
            this.f27583e = 0L;
            this.f27584f = 0L;
            this.f27586h = 0;
            Arrays.fill(this.f27585g, false);
        }
    }

    /* renamed from: a */
    public long m23496a() {
        return m23500e() ? this.f27573a.m23504a() : -9223372036854775807L;
    }

    /* renamed from: b */
    public float m23497b() {
        return m23500e() ? (float) (1.0E9d / this.f27573a.m23504a()) : -1.0f;
    }

    /* renamed from: c */
    public int m23498c() {
        return this.f27578f;
    }

    /* renamed from: d */
    public long m23499d() {
        return m23500e() ? this.f27573a.m23505b() : -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m23500e() {
        return this.f27573a.m23507e();
    }

    /* renamed from: f */
    public void m23501f(long j10) {
        this.f27573a.m23508f(j10);
        int i10 = 0;
        if (this.f27573a.m23507e() && !this.f27576d) {
            this.f27575c = false;
        } else if (this.f27577e != -9223372036854775807L) {
            if (!this.f27575c || this.f27574b.m23506d()) {
                this.f27574b.m23509g();
                this.f27574b.m23508f(this.f27577e);
            }
            this.f27575c = true;
            this.f27574b.m23508f(j10);
        }
        if (this.f27575c && this.f27574b.m23507e()) {
            a aVar = this.f27573a;
            this.f27573a = this.f27574b;
            this.f27574b = aVar;
            this.f27575c = false;
            this.f27576d = false;
        }
        this.f27577e = j10;
        if (!this.f27573a.m23507e()) {
            i10 = this.f27578f + 1;
        }
        this.f27578f = i10;
    }

    /* renamed from: g */
    public void m23502g() {
        this.f27573a.m23509g();
        this.f27574b.m23509g();
        this.f27575c = false;
        this.f27577e = -9223372036854775807L;
        this.f27578f = 0;
    }
}
