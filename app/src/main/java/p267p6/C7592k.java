package p267p6;

import android.os.SystemClock;
import p059d9.C4401z0;
import p168jc.C5355d;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/k.class
 */
/* renamed from: p6.k */
/* loaded from: combined.jar:classes2.jar:p6/k.class */
public final class C7592k implements InterfaceC7638z0 {

    /* renamed from: a */
    public final float f36812a;

    /* renamed from: b */
    public final float f36813b;

    /* renamed from: c */
    public final long f36814c;

    /* renamed from: d */
    public final float f36815d;

    /* renamed from: e */
    public final long f36816e;

    /* renamed from: f */
    public final long f36817f;

    /* renamed from: g */
    public final float f36818g;

    /* renamed from: h */
    public long f36819h;

    /* renamed from: i */
    public long f36820i;

    /* renamed from: j */
    public long f36821j;

    /* renamed from: k */
    public long f36822k;

    /* renamed from: l */
    public long f36823l;

    /* renamed from: m */
    public long f36824m;

    /* renamed from: n */
    public float f36825n;

    /* renamed from: o */
    public float f36826o;

    /* renamed from: p */
    public float f36827p;

    /* renamed from: q */
    public long f36828q;

    /* renamed from: r */
    public long f36829r;

    /* renamed from: s */
    public long f36830s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/k$b.class
     */
    /* renamed from: p6.k$b */
    /* loaded from: combined.jar:classes2.jar:p6/k$b.class */
    public static final class b {

        /* renamed from: a */
        public float f36831a = 0.97f;

        /* renamed from: b */
        public float f36832b = 1.03f;

        /* renamed from: c */
        public long f36833c = 1000;

        /* renamed from: d */
        public float f36834d = 1.0E-7f;

        /* renamed from: e */
        public long f36835e = C7583h.m32760d(20);

        /* renamed from: f */
        public long f36836f = C7583h.m32760d(500);

        /* renamed from: g */
        public float f36837g = 0.999f;

        /* renamed from: a */
        public C7592k m32821a() {
            return new C7592k(this.f36831a, this.f36832b, this.f36833c, this.f36834d, this.f36835e, this.f36836f, this.f36837g);
        }
    }

    public C7592k(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f36812a = f10;
        this.f36813b = f11;
        this.f36814c = j10;
        this.f36815d = f12;
        this.f36816e = j11;
        this.f36817f = j12;
        this.f36818g = f13;
        this.f36819h = -9223372036854775807L;
        this.f36820i = -9223372036854775807L;
        this.f36822k = -9223372036854775807L;
        this.f36823l = -9223372036854775807L;
        this.f36826o = f10;
        this.f36825n = f11;
        this.f36827p = 1.0f;
        this.f36828q = -9223372036854775807L;
        this.f36821j = -9223372036854775807L;
        this.f36824m = -9223372036854775807L;
        this.f36829r = -9223372036854775807L;
        this.f36830s = -9223372036854775807L;
    }

    /* renamed from: h */
    public static long m32812h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    @Override // p267p6.InterfaceC7638z0
    /* renamed from: a */
    public void mo32813a(C7561b1.f fVar) {
        this.f36819h = C7583h.m32760d(fVar.f36499a);
        this.f36822k = C7583h.m32760d(fVar.f36500b);
        this.f36823l = C7583h.m32760d(fVar.f36501c);
        float f10 = fVar.f36502d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f36812a;
        }
        this.f36826o = f10;
        float f11 = fVar.f36503e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f36813b;
        }
        this.f36825n = f11;
        m32819g();
    }

    @Override // p267p6.InterfaceC7638z0
    /* renamed from: b */
    public float mo32814b(long j10, long j11) {
        if (this.f36819h == -9223372036854775807L) {
            return 1.0f;
        }
        m32820i(j10, j11);
        if (this.f36828q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f36828q < this.f36814c) {
            return this.f36827p;
        }
        this.f36828q = SystemClock.elapsedRealtime();
        m32818f(j10);
        long j12 = j10 - this.f36824m;
        if (Math.abs(j12) < this.f36816e) {
            this.f36827p = 1.0f;
        } else {
            this.f36827p = C4401z0.m22407r((this.f36815d * j12) + 1.0f, this.f36826o, this.f36825n);
        }
        return this.f36827p;
    }

    @Override // p267p6.InterfaceC7638z0
    /* renamed from: c */
    public long mo32815c() {
        return this.f36824m;
    }

    @Override // p267p6.InterfaceC7638z0
    /* renamed from: d */
    public void mo32816d() {
        long j10 = this.f36824m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f36817f;
        this.f36824m = j11;
        long j12 = this.f36823l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f36824m = j12;
        }
        this.f36828q = -9223372036854775807L;
    }

    @Override // p267p6.InterfaceC7638z0
    /* renamed from: e */
    public void mo32817e(long j10) {
        this.f36820i = j10;
        m32819g();
    }

    /* renamed from: f */
    public final void m32818f(long j10) {
        long j11 = this.f36829r + (this.f36830s * 3);
        if (this.f36824m > j11) {
            float m32760d = C7583h.m32760d(this.f36814c);
            this.f36824m = C5355d.m26650c(j11, this.f36821j, this.f36824m - (((long) ((this.f36827p - 1.0f) * m32760d)) + ((long) ((this.f36825n - 1.0f) * m32760d))));
            return;
        }
        long m22411t = C4401z0.m22411t(j10 - ((long) (Math.max(0.0f, this.f36827p - 1.0f) / this.f36815d)), this.f36824m, j11);
        this.f36824m = m22411t;
        long j12 = this.f36823l;
        if (j12 == -9223372036854775807L || m22411t <= j12) {
            return;
        }
        this.f36824m = j12;
    }

    /* renamed from: g */
    public final void m32819g() {
        long j10;
        long j11 = this.f36819h;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f36820i;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            long j13 = this.f36822k;
            long j14 = j11;
            if (j13 != -9223372036854775807L) {
                j14 = j11;
                if (j11 < j13) {
                    j14 = j13;
                }
            }
            long j15 = this.f36823l;
            j10 = j14;
            if (j15 != -9223372036854775807L) {
                j10 = j14;
                if (j14 > j15) {
                    j10 = j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f36821j == j10) {
            return;
        }
        this.f36821j = j10;
        this.f36824m = j10;
        this.f36829r = -9223372036854775807L;
        this.f36830s = -9223372036854775807L;
        this.f36828q = -9223372036854775807L;
    }

    /* renamed from: i */
    public final void m32820i(long j10, long j11) {
        long m32812h;
        long j12 = j10 - j11;
        long j13 = this.f36829r;
        if (j13 == -9223372036854775807L) {
            this.f36829r = j12;
            m32812h = 0;
        } else {
            long max = Math.max(j12, m32812h(j13, j12, this.f36818g));
            this.f36829r = max;
            m32812h = m32812h(this.f36830s, Math.abs(j12 - max), this.f36818g);
        }
        this.f36830s = m32812h;
    }
}
