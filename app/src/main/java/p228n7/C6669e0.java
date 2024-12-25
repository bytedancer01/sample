package p228n7;

import com.google.android.exoplayer2.extractor.AbstractC2342a;
import p057d7.InterfaceC4324g;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/e0.class
 */
/* renamed from: n7.e0 */
/* loaded from: combined.jar:classes2.jar:n7/e0.class */
public final class C6669e0 extends AbstractC2342a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/e0$a.class
     */
    /* renamed from: n7.e0$a */
    /* loaded from: combined.jar:classes2.jar:n7/e0$a.class */
    public static final class a implements AbstractC2342a.f {

        /* renamed from: a */
        public final C4389t0 f34738a;

        /* renamed from: b */
        public final C4361f0 f34739b = new C4361f0();

        /* renamed from: c */
        public final int f34740c;

        /* renamed from: d */
        public final int f34741d;

        public a(int i10, C4389t0 c4389t0, int i11) {
            this.f34740c = i10;
            this.f34738a = c4389t0;
            this.f34741d = i11;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: a */
        public AbstractC2342a.e mo12013a(InterfaceC4324g interfaceC4324g, long j10) {
            long position = interfaceC4324g.getPosition();
            int min = (int) Math.min(this.f34741d, interfaceC4324g.getLength() - position);
            this.f34739b.m21979L(min);
            interfaceC4324g.mo21811q(this.f34739b.m21988d(), 0, min);
            return m30692c(this.f34739b, j10, position);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC2342a.f
        /* renamed from: b */
        public void mo12014b() {
            this.f34739b.m21980M(C4401z0.f26684f);
        }

        /* renamed from: c */
        public final AbstractC2342a.e m30692c(C4361f0 c4361f0, long j10, long j11) {
            long j12;
            int m30763a;
            int m30763a2;
            int m21990f = c4361f0.m21990f();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (true) {
                j12 = j15;
                if (c4361f0.m21985a() < 188 || (m30763a2 = (m30763a = C6679j0.m30763a(c4361f0.m21988d(), c4361f0.m21989e(), m21990f)) + 188) > m21990f) {
                    break;
                }
                long m30765c = C6679j0.m30765c(c4361f0, m30763a, this.f34740c);
                long j16 = j14;
                long j17 = j12;
                if (m30765c != -9223372036854775807L) {
                    j17 = this.f34738a.m22241b(m30765c);
                    if (j17 > j10) {
                        return j12 == -9223372036854775807L ? AbstractC2342a.e.m12091d(j17, j11) : AbstractC2342a.e.m12092e(j11 + j14);
                    }
                    if (100000 + j17 > j10) {
                        return AbstractC2342a.e.m12092e(j11 + m30763a);
                    }
                    j16 = m30763a;
                }
                c4361f0.m21983P(m30763a2);
                j13 = m30763a2;
                j14 = j16;
                j15 = j17;
            }
            return j12 != -9223372036854775807L ? AbstractC2342a.e.m12093f(j12, j11 + j13) : AbstractC2342a.e.f13785d;
        }
    }

    public C6669e0(C4389t0 c4389t0, long j10, long j11, int i10, int i11) {
        super(new AbstractC2342a.b(), new a(i10, c4389t0, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
