package p242o7;

import android.util.Pair;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o7/d.class
 */
/* renamed from: o7.d */
/* loaded from: combined.jar:classes2.jar:o7/d.class */
public final class C6917d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o7/d$a.class
     */
    /* renamed from: o7.d$a */
    /* loaded from: combined.jar:classes2.jar:o7/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f35787a;

        /* renamed from: b */
        public final long f35788b;

        public a(int i10, long j10) {
            this.f35787a = i10;
            this.f35788b = j10;
        }

        /* renamed from: a */
        public static a m31854a(InterfaceC4324g interfaceC4324g, C4361f0 c4361f0) {
            interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, 8);
            c4361f0.m21983P(0);
            return new a(c4361f0.m21998n(), c4361f0.m22004t());
        }
    }

    /* renamed from: a */
    public static C6916c m31852a(InterfaceC4324g interfaceC4324g) {
        a m31854a;
        byte[] bArr;
        C4349a.m21882e(interfaceC4324g);
        C4361f0 c4361f0 = new C4361f0(16);
        if (a.m31854a(interfaceC4324g, c4361f0).f35787a != 1380533830) {
            return null;
        }
        interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, 4);
        c4361f0.m21983P(0);
        int m21998n = c4361f0.m21998n();
        if (m21998n != 1463899717) {
            C4392v.m22270d("WavHeaderReader", "Unsupported RIFF format: " + m21998n);
            return null;
        }
        while (true) {
            m31854a = a.m31854a(interfaceC4324g, c4361f0);
            if (m31854a.f35787a == 1718449184) {
                break;
            }
            interfaceC4324g.mo21805k((int) m31854a.f35788b);
        }
        C4349a.m21884g(m31854a.f35788b >= 16);
        interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, 16);
        c4361f0.m21983P(0);
        int m22006v = c4361f0.m22006v();
        int m22006v2 = c4361f0.m22006v();
        int m22005u = c4361f0.m22005u();
        int m22005u2 = c4361f0.m22005u();
        int m22006v3 = c4361f0.m22006v();
        int m22006v4 = c4361f0.m22006v();
        int i10 = ((int) m31854a.f35788b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            interfaceC4324g.mo21811q(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = C4401z0.f26684f;
        }
        return new C6916c(m22006v, m22006v2, m22005u, m22005u2, m22006v3, m22006v4, bArr);
    }

    /* renamed from: b */
    public static Pair<Long, Long> m31853b(InterfaceC4324g interfaceC4324g) {
        C4349a.m21882e(interfaceC4324g);
        interfaceC4324g.mo21801f();
        C4361f0 c4361f0 = new C4361f0(8);
        while (true) {
            a m31854a = a.m31854a(interfaceC4324g, c4361f0);
            int i10 = m31854a.f35787a;
            if (i10 == 1684108385) {
                interfaceC4324g.mo21809o(8);
                long position = interfaceC4324g.getPosition();
                long j10 = m31854a.f35788b + position;
                long length = interfaceC4324g.getLength();
                long j11 = j10;
                if (length != -1) {
                    j11 = j10;
                    if (j10 > length) {
                        C4392v.m22275i("WavHeaderReader", "Data exceeds input length: " + j10 + ", " + length);
                        j11 = length;
                    }
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j11));
            }
            if (i10 != 1380533830 && i10 != 1718449184) {
                C4392v.m22275i("WavHeaderReader", "Ignoring unknown WAV chunk: " + m31854a.f35787a);
            }
            long j12 = m31854a.f35788b + 8;
            if (m31854a.f35787a == 1380533830) {
                j12 = 12;
            }
            if (j12 > 2147483647L) {
                throw C7594k1.m32826e("Chunk is too large (~2GB+) to skip; id: " + m31854a.f35787a);
            }
            interfaceC4324g.mo21809o((int) j12);
        }
    }
}
