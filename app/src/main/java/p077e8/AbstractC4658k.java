package p077e8;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p059d9.C4401z0;
import p150ic.C5216a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/k.class
 */
/* renamed from: e8.k */
/* loaded from: combined.jar:classes2.jar:e8/k.class */
public abstract class AbstractC4658k {

    /* renamed from: a */
    public final C4656i f27470a;

    /* renamed from: b */
    public final long f27471b;

    /* renamed from: c */
    public final long f27472c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/k$a.class
     */
    /* renamed from: e8.k$a */
    /* loaded from: combined.jar:classes2.jar:e8/k$a.class */
    public static abstract class a extends AbstractC4658k {

        /* renamed from: d */
        public final long f27473d;

        /* renamed from: e */
        public final long f27474e;

        /* renamed from: f */
        public final List<d> f27475f;

        /* renamed from: g */
        public final long f27476g;

        /* renamed from: h */
        public final long f27477h;

        /* renamed from: i */
        public final long f27478i;

        public a(C4656i c4656i, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(c4656i, j10, j11);
            this.f27473d = j12;
            this.f27474e = j13;
            this.f27475f = list;
            this.f27478i = j14;
            this.f27476g = j15;
            this.f27477h = j16;
        }

        /* renamed from: c */
        public long m23383c(long j10, long j11) {
            long mo23387g = mo23387g(j10);
            return mo23387g != -1 ? mo23387g : (int) (m23389i((j11 - this.f27477h) + this.f27478i, j10) - m23384d(j10, j11));
        }

        /* renamed from: d */
        public long m23384d(long j10, long j11) {
            if (mo23387g(j10) == -1) {
                long j12 = this.f27476g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(m23385e(), m23389i((j11 - this.f27477h) - j12, j10));
                }
            }
            return m23385e();
        }

        /* renamed from: e */
        public long m23385e() {
            return this.f27473d;
        }

        /* renamed from: f */
        public long m23386f(long j10, long j11) {
            if (this.f27475f != null) {
                return -9223372036854775807L;
            }
            long m23384d = m23384d(j10, j11) + m23383c(j10, j11);
            return (m23390j(m23384d) + m23388h(m23384d, j10)) - this.f27478i;
        }

        /* renamed from: g */
        public abstract long mo23387g(long j10);

        /* renamed from: h */
        public final long m23388h(long j10, long j11) {
            List<d> list = this.f27475f;
            if (list != null) {
                return (list.get((int) (j10 - this.f27473d)).f27484b * 1000000) / this.f27471b;
            }
            long mo23387g = mo23387g(j11);
            return (mo23387g == -1 || j10 != (m23385e() + mo23387g) - 1) ? (this.f27474e * 1000000) / this.f27471b : j11 - m23390j(j10);
        }

        /* renamed from: i */
        public long m23389i(long j10, long j11) {
            long m23385e = m23385e();
            long mo23387g = mo23387g(j11);
            if (mo23387g == 0) {
                return m23385e;
            }
            if (this.f27475f == null) {
                long j12 = this.f27473d + (j10 / ((this.f27474e * 1000000) / this.f27471b));
                if (j12 < m23385e) {
                    j12 = m23385e;
                } else if (mo23387g != -1) {
                    j12 = Math.min(j12, (m23385e + mo23387g) - 1);
                }
                return j12;
            }
            long j13 = (mo23387g + m23385e) - 1;
            long j14 = m23385e;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long m23390j = m23390j(j15);
                if (m23390j < j10) {
                    j14 = j15 + 1;
                } else {
                    if (m23390j <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            if (j14 == m23385e) {
                j13 = j14;
            }
            return j13;
        }

        /* renamed from: j */
        public final long m23390j(long j10) {
            List<d> list = this.f27475f;
            return C4401z0.m22346Q0(list != null ? list.get((int) (j10 - this.f27473d)).f27483a - this.f27472c : (j10 - this.f27473d) * this.f27474e, 1000000L, this.f27471b);
        }

        /* renamed from: k */
        public abstract C4656i mo23391k(AbstractC4657j abstractC4657j, long j10);

        /* renamed from: l */
        public boolean mo23392l() {
            return this.f27475f != null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/k$b.class
     */
    /* renamed from: e8.k$b */
    /* loaded from: combined.jar:classes2.jar:e8/k$b.class */
    public static final class b extends a {

        /* renamed from: j */
        public final List<C4656i> f27479j;

        public b(C4656i c4656i, long j10, long j11, long j12, long j13, List<d> list, long j14, List<C4656i> list2, long j15, long j16) {
            super(c4656i, j10, j11, j12, j13, list, j14, j15, j16);
            this.f27479j = list2;
        }

        @Override // p077e8.AbstractC4658k.a
        /* renamed from: g */
        public long mo23387g(long j10) {
            return this.f27479j.size();
        }

        @Override // p077e8.AbstractC4658k.a
        /* renamed from: k */
        public C4656i mo23391k(AbstractC4657j abstractC4657j, long j10) {
            return this.f27479j.get((int) (j10 - this.f27473d));
        }

        @Override // p077e8.AbstractC4658k.a
        /* renamed from: l */
        public boolean mo23392l() {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/k$c.class
     */
    /* renamed from: e8.k$c */
    /* loaded from: combined.jar:classes2.jar:e8/k$c.class */
    public static final class c extends a {

        /* renamed from: j */
        public final C4661n f27480j;

        /* renamed from: k */
        public final C4661n f27481k;

        /* renamed from: l */
        public final long f27482l;

        public c(C4656i c4656i, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, C4661n c4661n, C4661n c4661n2, long j16, long j17) {
            super(c4656i, j10, j11, j12, j14, list, j15, j16, j17);
            this.f27480j = c4661n;
            this.f27481k = c4661n2;
            this.f27482l = j13;
        }

        @Override // p077e8.AbstractC4658k
        /* renamed from: a */
        public C4656i mo23381a(AbstractC4657j abstractC4657j) {
            C4661n c4661n = this.f27480j;
            if (c4661n == null) {
                return super.mo23381a(abstractC4657j);
            }
            C7629w0 c7629w0 = abstractC4657j.f27459b;
            return new C4656i(c4661n.m23396a(c7629w0.f37075b, 0L, c7629w0.f37082i, 0L), 0L, -1L);
        }

        @Override // p077e8.AbstractC4658k.a
        /* renamed from: g */
        public long mo23387g(long j10) {
            if (this.f27475f != null) {
                return r0.size();
            }
            long j11 = this.f27482l;
            if (j11 != -1) {
                return (j11 - this.f27473d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return C5216a.m26066a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f27471b)), BigInteger.valueOf(this.f27474e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p077e8.AbstractC4658k.a
        /* renamed from: k */
        public C4656i mo23391k(AbstractC4657j abstractC4657j, long j10) {
            List<d> list = this.f27475f;
            long j11 = list != null ? list.get((int) (j10 - this.f27473d)).f27483a : (j10 - this.f27473d) * this.f27474e;
            C4661n c4661n = this.f27481k;
            C7629w0 c7629w0 = abstractC4657j.f27459b;
            return new C4656i(c4661n.m23396a(c7629w0.f37075b, j10, c7629w0.f37082i, j11), 0L, -1L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/k$d.class
     */
    /* renamed from: e8.k$d */
    /* loaded from: combined.jar:classes2.jar:e8/k$d.class */
    public static final class d {

        /* renamed from: a */
        public final long f27483a;

        /* renamed from: b */
        public final long f27484b;

        public d(long j10, long j11) {
            this.f27483a = j10;
            this.f27484b = j11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f27483a != dVar.f27483a || this.f27484b != dVar.f27484b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (((int) this.f27483a) * 31) + ((int) this.f27484b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/k$e.class
     */
    /* renamed from: e8.k$e */
    /* loaded from: combined.jar:classes2.jar:e8/k$e.class */
    public static class e extends AbstractC4658k {

        /* renamed from: d */
        public final long f27485d;

        /* renamed from: e */
        public final long f27486e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(C4656i c4656i, long j10, long j11, long j12, long j13) {
            super(c4656i, j10, j11);
            this.f27485d = j12;
            this.f27486e = j13;
        }

        /* renamed from: c */
        public C4656i m23393c() {
            long j10 = this.f27486e;
            return j10 <= 0 ? null : new C4656i(null, this.f27485d, j10);
        }
    }

    public AbstractC4658k(C4656i c4656i, long j10, long j11) {
        this.f27470a = c4656i;
        this.f27471b = j10;
        this.f27472c = j11;
    }

    /* renamed from: a */
    public C4656i mo23381a(AbstractC4657j abstractC4657j) {
        return this.f27470a;
    }

    /* renamed from: b */
    public long m23382b() {
        return C4401z0.m22346Q0(this.f27472c, 1000000L, this.f27471b);
    }
}
