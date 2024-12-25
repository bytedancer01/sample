package p267p6;

import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/a2.class
 */
/* renamed from: p6.a2 */
/* loaded from: combined.jar:classes2.jar:p6/a2.class */
public final class C7558a2 {

    /* renamed from: c */
    public static final C7558a2 f36432c;

    /* renamed from: d */
    public static final C7558a2 f36433d;

    /* renamed from: e */
    public static final C7558a2 f36434e;

    /* renamed from: f */
    public static final C7558a2 f36435f;

    /* renamed from: g */
    public static final C7558a2 f36436g;

    /* renamed from: a */
    public final long f36437a;

    /* renamed from: b */
    public final long f36438b;

    static {
        C7558a2 c7558a2 = new C7558a2(0L, 0L);
        f36432c = c7558a2;
        f36433d = new C7558a2(Long.MAX_VALUE, Long.MAX_VALUE);
        f36434e = new C7558a2(Long.MAX_VALUE, 0L);
        f36435f = new C7558a2(0L, Long.MAX_VALUE);
        f36436g = c7558a2;
    }

    public C7558a2(long j10, long j11) {
        C4349a.m21878a(j10 >= 0);
        C4349a.m21878a(j11 >= 0);
        this.f36437a = j10;
        this.f36438b = j11;
    }

    /* renamed from: a */
    public long m32340a(long j10, long j11, long j12) {
        long j13 = this.f36437a;
        if (j13 == 0 && this.f36438b == 0) {
            return j10;
        }
        long m22364Z0 = C4401z0.m22364Z0(j10, j13, Long.MIN_VALUE);
        long m22368b = C4401z0.m22368b(j10, this.f36438b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = m22364Z0 <= j11 && j11 <= m22368b;
        if (m22364Z0 > j12 || j12 > m22368b) {
            z10 = false;
        }
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : m22364Z0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7558a2.class != obj.getClass()) {
            return false;
        }
        C7558a2 c7558a2 = (C7558a2) obj;
        if (this.f36437a != c7558a2.f36437a || this.f36438b != c7558a2.f36438b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (((int) this.f36437a) * 31) + ((int) this.f36438b);
    }
}
