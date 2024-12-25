package p059d9;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/t0.class
 */
/* renamed from: d9.t0 */
/* loaded from: combined.jar:classes2.jar:d9/t0.class */
public final class C4389t0 {

    /* renamed from: a */
    public long f26652a;

    /* renamed from: b */
    public long f26653b;

    /* renamed from: c */
    public long f26654c;

    /* renamed from: d */
    public final ThreadLocal<Long> f26655d = new ThreadLocal<>();

    public C4389t0(long j10) {
        m22245g(j10);
    }

    /* renamed from: f */
    public static long m22237f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m22238i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m22239j(long j10) {
        return m22238i(j10) % IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    /* renamed from: a */
    public long m22240a(long j10) {
        synchronized (this) {
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            if (this.f26653b == -9223372036854775807L) {
                long j11 = this.f26652a;
                long j12 = j11;
                if (j11 == 9223372036854775806L) {
                    j12 = ((Long) C4349a.m21882e(this.f26655d.get())).longValue();
                }
                this.f26653b = j12 - j10;
                notifyAll();
            }
            this.f26654c = j10;
            return j10 + this.f26653b;
        }
    }

    /* renamed from: b */
    public long m22241b(long j10) {
        synchronized (this) {
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j11 = this.f26654c;
            long j12 = j10;
            if (j11 != -9223372036854775807L) {
                long m22238i = m22238i(j11);
                long j13 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + m22238i) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
                long j14 = ((j13 - 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j10;
                long j15 = j10 + (j13 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);
                j12 = j15;
                if (Math.abs(j14 - m22238i) < Math.abs(j15 - m22238i)) {
                    j12 = j14;
                }
            }
            return m22240a(m22237f(j12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0 == 9223372036854775806L) goto L9;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m22242c() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            long r0 = r0.f26652a     // Catch: java.lang.Throwable -> L21
            r8 = r0
            r0 = r8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
        L19:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r0
        L1d:
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            return r0
        L21:
            r10 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4389t0.m22242c():long");
    }

    /* renamed from: d */
    public long m22243d() {
        long m22242c;
        synchronized (this) {
            long j10 = this.f26654c;
            m22242c = j10 != -9223372036854775807L ? j10 + this.f26653b : m22242c();
        }
        return m22242c;
    }

    /* renamed from: e */
    public long m22244e() {
        long j10;
        synchronized (this) {
            j10 = this.f26653b;
        }
        return j10;
    }

    /* renamed from: g */
    public void m22245g(long j10) {
        synchronized (this) {
            this.f26652a = j10;
            this.f26653b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.f26654c = -9223372036854775807L;
        }
    }

    /* renamed from: h */
    public void m22246h(boolean z10, long j10) {
        synchronized (this) {
            C4349a.m21884g(this.f26652a == 9223372036854775806L);
            if (this.f26653b != -9223372036854775807L) {
                return;
            }
            if (z10) {
                this.f26655d.set(Long.valueOf(j10));
            } else {
                while (this.f26653b == -9223372036854775807L) {
                    wait();
                }
            }
        }
    }
}
