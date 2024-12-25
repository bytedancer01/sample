package p228n7;

import com.google.android.exoplayer2.extractor.AbstractC2342a;
import p057d7.InterfaceC4324g;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/x.class
 */
/* renamed from: n7.x */
/* loaded from: combined.jar:classes2.jar:n7/x.class */
public final class C6694x extends AbstractC2342a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/x$b.class
     */
    /* renamed from: n7.x$b */
    /* loaded from: combined.jar:classes2.jar:n7/x$b.class */
    public static final class b implements AbstractC2342a.f {

        /* renamed from: a */
        public final C4389t0 f35042a;

        /* renamed from: b */
        public final C4361f0 f35043b;

        public b(C4389t0 c4389t0) {
            this.f35042a = c4389t0;
            this.f35043b = new C4361f0();
        }

        /* renamed from: d */
        public static void m30840d(C4361f0 c4361f0) {
            int m30839k;
            int m21990f = c4361f0.m21990f();
            if (c4361f0.m21985a() < 10) {
                c4361f0.m21983P(m21990f);
                return;
            }
            c4361f0.m21984Q(9);
            int m21971D = c4361f0.m21971D() & 7;
            if (c4361f0.m21985a() < m21971D) {
                c4361f0.m21983P(m21990f);
                return;
            }
            c4361f0.m21984Q(m21971D);
            if (c4361f0.m21985a() < 4) {
                c4361f0.m21983P(m21990f);
                return;
            }
            if (C6694x.m30839k(c4361f0.m21988d(), c4361f0.m21989e()) == 443) {
                c4361f0.m21984Q(4);
                int m21977J = c4361f0.m21977J();
                if (c4361f0.m21985a() < m21977J) {
                    c4361f0.m21983P(m21990f);
                    return;
                }
                c4361f0.m21984Q(m21977J);
            }
            while (c4361f0.m21985a() >= 4 && (m30839k = C6694x.m30839k(c4361f0.m21988d(), c4361f0.m21989e())) != 442 && m30839k != 441 && (m30839k >>> 8) == 1) {
                c4361f0.m21984Q(4);
                if (c4361f0.m21985a() < 2) {
                    c4361f0.m21983P(m21990f);
                    return;
                }
                c4361f0.m21983P(Math.min(c4361f0.m21990f(), c4361f0.m21989e() + c4361f0.m21977J()));
            }
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: a */
        public AbstractC2342a.e mo12013a(InterfaceC4324g interfaceC4324g, long j10) {
            long position = interfaceC4324g.getPosition();
            int min = (int) Math.min(20000L, interfaceC4324g.getLength() - position);
            this.f35043b.m21979L(min);
            interfaceC4324g.mo21811q(this.f35043b.m21988d(), 0, min);
            return m30841c(this.f35043b, j10, position);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: b */
        public void mo12014b() {
            this.f35043b.m21980M(C4401z0.f26684f);
        }

        /* renamed from: c */
        public final AbstractC2342a.e m30841c(C4361f0 c4361f0, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (c4361f0.m21985a() >= 4) {
                if (C6694x.m30839k(c4361f0.m21988d(), c4361f0.m21989e()) != 442) {
                    c4361f0.m21984Q(1);
                } else {
                    c4361f0.m21984Q(4);
                    long m30843l = C6695y.m30843l(c4361f0);
                    int i12 = i11;
                    long j13 = j12;
                    if (m30843l != -9223372036854775807L) {
                        j13 = this.f35042a.m22241b(m30843l);
                        if (j13 > j10) {
                            return j12 == -9223372036854775807L ? AbstractC2342a.e.m12091d(j13, j11) : AbstractC2342a.e.m12092e(j11 + i11);
                        }
                        if (100000 + j13 > j10) {
                            return AbstractC2342a.e.m12092e(j11 + c4361f0.m21989e());
                        }
                        i12 = c4361f0.m21989e();
                    }
                    m30840d(c4361f0);
                    i10 = c4361f0.m21989e();
                    i11 = i12;
                    j12 = j13;
                }
            }
            return j12 != -9223372036854775807L ? AbstractC2342a.e.m12093f(j12, j11 + i10) : AbstractC2342a.e.f13785d;
        }
    }

    public C6694x(C4389t0 c4389t0, long j10, long j11) {
        super(new AbstractC2342a.b(), new b(c4389t0), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* renamed from: k */
    public static int m30839k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
