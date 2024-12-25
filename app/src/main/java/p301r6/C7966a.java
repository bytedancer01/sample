package p301r6;

import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4359e0;
import p059d9.C4392v;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/a.class
 */
/* renamed from: r6.a */
/* loaded from: combined.jar:classes2.jar:r6/a.class */
public final class C7966a {

    /* renamed from: a */
    public static final int[] f38454a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f38455b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/a$b.class
     */
    /* renamed from: r6.a$b */
    /* loaded from: combined.jar:classes2.jar:r6/a$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f38456a;

        /* renamed from: b */
        public final int f38457b;

        /* renamed from: c */
        public final String f38458c;

        public b(int i10, int i11, String str) {
            this.f38456a = i10;
            this.f38457b = i11;
            this.f38458c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m34523a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int[] iArr = f38454a;
            if (i12 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i12]) {
                i13 = i12;
            }
            i12++;
        }
        int i14 = -1;
        int i15 = 0;
        while (true) {
            int[] iArr2 = f38455b;
            if (i15 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i15]) {
                i14 = i15;
            }
            i15++;
        }
        if (i10 != -1 && i14 != -1) {
            return m34524b(2, i13, i14);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    /* renamed from: b */
    public static byte[] m34524b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & TelnetCommand.f36139EL) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    /* renamed from: c */
    public static int m34525c(C4359e0 c4359e0) {
        int m21950h = c4359e0.m21950h(5);
        int i10 = m21950h;
        if (m21950h == 31) {
            i10 = c4359e0.m21950h(6) + 32;
        }
        return i10;
    }

    /* renamed from: d */
    public static int m34526d(int i10) {
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 != 42) {
            return i10 != 22 ? i10 != 23 ? 0 : 15 : NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
        }
        return 16;
    }

    /* renamed from: e */
    public static int m34527e(C4359e0 c4359e0) {
        int i10;
        int m21950h = c4359e0.m21950h(4);
        if (m21950h == 15) {
            i10 = c4359e0.m21950h(24);
        } else {
            if (m21950h >= 13) {
                throw C7594k1.m32822a(null, null);
            }
            i10 = f38454a[m21950h];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r0 == 29) goto L6;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p301r6.C7966a.b m34528f(p059d9.C4359e0 r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7966a.m34528f(d9.e0, boolean):r6.a$b");
    }

    /* renamed from: g */
    public static b m34529g(byte[] bArr) {
        return m34528f(new C4359e0(bArr), false);
    }

    /* renamed from: h */
    public static void m34530h(C4359e0 c4359e0, int i10, int i11) {
        if (c4359e0.m21949g()) {
            C4392v.m22275i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c4359e0.m21949g()) {
            c4359e0.m21960r(14);
        }
        boolean m21949g = c4359e0.m21949g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c4359e0.m21960r(3);
        }
        if (m21949g) {
            if (i10 == 22) {
                c4359e0.m21960r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c4359e0.m21960r(3);
            }
            c4359e0.m21960r(1);
        }
    }
}
