package p057d7;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/m.class
 */
/* renamed from: d7.m */
/* loaded from: combined.jar:classes2.jar:d7/m.class */
public final class C4330m {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d7/m$a.class
     */
    /* renamed from: d7.m$a */
    /* loaded from: combined.jar:classes2.jar:d7/m$a.class */
    public static final class a {

        /* renamed from: a */
        public long f26485a;
    }

    /* renamed from: a */
    public static boolean m21826a(C4361f0 c4361f0, FlacStreamMetadata flacStreamMetadata, int i10) {
        int m21835j = m21835j(c4361f0, i10);
        return m21835j != -1 && m21835j <= flacStreamMetadata.maxBlockSizeSamples;
    }

    /* renamed from: b */
    public static boolean m21827b(C4361f0 c4361f0, int i10) {
        boolean z10 = true;
        if (c4361f0.m21971D() != C4401z0.m22417w(c4361f0.m21988d(), i10, c4361f0.m21989e() - 1, 0)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: c */
    public static boolean m21828c(C4361f0 c4361f0, FlacStreamMetadata flacStreamMetadata, boolean z10, a aVar) {
        try {
            long m21978K = c4361f0.m21978K();
            if (!z10) {
                m21978K *= flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f26485a = m21978K;
            return true;
        } catch (NumberFormatException e10) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m21829d(C4361f0 c4361f0, FlacStreamMetadata flacStreamMetadata, int i10, a aVar) {
        int m21989e = c4361f0.m21989e();
        long m21973F = c4361f0.m21973F();
        long j10 = m21973F >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((m21973F >> 12) & 15);
        int i12 = (int) ((m21973F >> 8) & 15);
        int i13 = (int) (15 & (m21973F >> 4));
        int i14 = (int) ((m21973F >> 1) & 7);
        boolean z11 = (m21973F & 1) == 1;
        boolean z12 = false;
        if (m21832g(i13, flacStreamMetadata)) {
            z12 = false;
            if (m21831f(i14, flacStreamMetadata)) {
                z12 = false;
                if (!z11) {
                    z12 = false;
                    if (m21828c(c4361f0, flacStreamMetadata, z10, aVar)) {
                        z12 = false;
                        if (m21826a(c4361f0, flacStreamMetadata, i11)) {
                            z12 = false;
                            if (m21830e(c4361f0, flacStreamMetadata, i12)) {
                                z12 = false;
                                if (m21827b(c4361f0, m21989e)) {
                                    z12 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z12;
    }

    /* renamed from: e */
    public static boolean m21830e(C4361f0 c4361f0, FlacStreamMetadata flacStreamMetadata, int i10) {
        int i11 = flacStreamMetadata.sampleRate;
        boolean z10 = true;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i10 == 12) {
            if (c4361f0.m21971D() * 1000 != i11) {
                z10 = false;
            }
            return z10;
        }
        if (i10 > 14) {
            return false;
        }
        int m21977J = c4361f0.m21977J();
        int i12 = m21977J;
        if (i10 == 14) {
            i12 = m21977J * 10;
        }
        return i12 == i11;
    }

    /* renamed from: f */
    public static boolean m21831f(int i10, FlacStreamMetadata flacStreamMetadata) {
        boolean z10 = true;
        if (i10 == 0) {
            return true;
        }
        if (i10 != flacStreamMetadata.bitsPerSampleLookupKey) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: g */
    public static boolean m21832g(int i10, FlacStreamMetadata flacStreamMetadata) {
        boolean z10 = false;
        if (i10 <= 7) {
            if (i10 == flacStreamMetadata.channels - 1) {
                z10 = true;
            }
            return z10;
        }
        boolean z11 = false;
        if (i10 <= 10) {
            z11 = false;
            if (flacStreamMetadata.channels == 2) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: h */
    public static boolean m21833h(InterfaceC4324g interfaceC4324g, FlacStreamMetadata flacStreamMetadata, int i10, a aVar) {
        long mo21804i = interfaceC4324g.mo21804i();
        byte[] bArr = new byte[2];
        interfaceC4324g.mo21811q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC4324g.mo21801f();
            interfaceC4324g.mo21805k((int) (mo21804i - interfaceC4324g.getPosition()));
            return false;
        }
        C4361f0 c4361f0 = new C4361f0(16);
        System.arraycopy(bArr, 0, c4361f0.m21988d(), 0, 2);
        c4361f0.m21982O(C4326i.m21821c(interfaceC4324g, c4361f0.m21988d(), 2, 14));
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21805k((int) (mo21804i - interfaceC4324g.getPosition()));
        return m21829d(c4361f0, flacStreamMetadata, i10, aVar);
    }

    /* renamed from: i */
    public static long m21834i(InterfaceC4324g interfaceC4324g, FlacStreamMetadata flacStreamMetadata) {
        interfaceC4324g.mo21801f();
        boolean z10 = true;
        interfaceC4324g.mo21805k(1);
        byte[] bArr = new byte[1];
        interfaceC4324g.mo21811q(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        interfaceC4324g.mo21805k(2);
        int i10 = z10 ? 7 : 6;
        C4361f0 c4361f0 = new C4361f0(i10);
        c4361f0.m21982O(C4326i.m21821c(interfaceC4324g, c4361f0.m21988d(), 0, i10));
        interfaceC4324g.mo21801f();
        a aVar = new a();
        if (m21828c(c4361f0, flacStreamMetadata, z10, aVar)) {
            return aVar.f26485a;
        }
        throw C7594k1.m32822a(null, null);
    }

    /* renamed from: j */
    public static int m21835j(C4361f0 c4361f0, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c4361f0.m21971D() + 1;
            case 7:
                return c4361f0.m21977J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
