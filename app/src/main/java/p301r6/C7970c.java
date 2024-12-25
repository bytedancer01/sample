package p301r6;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p267p6.C7629w0;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/c.class
 */
/* renamed from: r6.c */
/* loaded from: combined.jar:classes2.jar:r6/c.class */
public final class C7970c {

    /* renamed from: a */
    public static final int[] f38495a = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, 1000, 960, 800, 800, NNTPReply.AUTHENTICATION_REQUIRED, 400, 400, 2048};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/c$b.class
     */
    /* renamed from: r6.c$b */
    /* loaded from: combined.jar:classes2.jar:r6/c$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f38496a;

        /* renamed from: b */
        public final int f38497b;

        /* renamed from: c */
        public final int f38498c;

        /* renamed from: d */
        public final int f38499d;

        /* renamed from: e */
        public final int f38500e;

        public b(int i10, int i11, int i12, int i13, int i14) {
            this.f38496a = i10;
            this.f38498c = i11;
            this.f38497b = i12;
            this.f38499d = i13;
            this.f38500e = i14;
        }
    }

    /* renamed from: a */
    public static void m34568a(int i10, C4361f0 c4361f0) {
        c4361f0.m21979L(7);
        byte[] m21988d = c4361f0.m21988d();
        m21988d[0] = -84;
        m21988d[1] = 64;
        m21988d[2] = -1;
        m21988d[3] = -1;
        m21988d[4] = (byte) ((i10 >> 16) & 255);
        m21988d[5] = (byte) ((i10 >> 8) & 255);
        m21988d[6] = (byte) (i10 & 255);
    }

    /* renamed from: b */
    public static C7629w0 m34569b(C4361f0 c4361f0, String str, String str2, C9273n c9273n) {
        c4361f0.m21984Q(1);
        return new C7629w0.b().m33208S(str).m33220e0("audio/ac4").m33197H(2).m33221f0(((c4361f0.m21971D() & 32) >> 5) == 1 ? 48000 : 44100).m33201L(c9273n).m33211V(str2).m33194E();
    }

    /* renamed from: c */
    public static int m34570c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m34571d(new C4359e0(bArr)).f38500e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if (r0 == 11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        if (r0 == 11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0105, code lost:
    
        if (r0 == 8) goto L57;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p301r6.C7970c.b m34571d(p059d9.C4359e0 r9) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7970c.m34571d(d9.e0):r6.c$b");
    }

    /* renamed from: e */
    public static int m34572e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        int i13 = i11;
        if (i10 == 44097) {
            i13 = i11 + 2;
        }
        return i12 + i13;
    }

    /* renamed from: f */
    public static int m34573f(C4359e0 c4359e0, int i10) {
        int i11 = 0;
        while (true) {
            int m21950h = i11 + c4359e0.m21950h(i10);
            if (!c4359e0.m21949g()) {
                return m21950h;
            }
            i11 = (m21950h + 1) << i10;
        }
    }
}
