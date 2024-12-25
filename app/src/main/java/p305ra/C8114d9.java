package p305ra;

import org.apache.commons.net.bsd.RCommandClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d9.class
 */
/* renamed from: ra.d9 */
/* loaded from: combined.jar:classes2.jar:ra/d9.class */
public final class C8114d9 {
    /* renamed from: a */
    public static /* synthetic */ boolean m35208a(byte b10) {
        return b10 >= 0;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m35209b(byte b10) {
        return b10 < -32;
    }

    /* renamed from: c */
    public static /* synthetic */ void m35210c(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || m35214g(b11)) {
            throw C8396w6.m35991f();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m35211d(byte b10) {
        return b10 < -16;
    }

    /* renamed from: e */
    public static /* synthetic */ void m35212e(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!m35214g(b11)) {
            byte b13 = b10;
            if (b10 == -32) {
                if (b11 >= -96) {
                    b13 = -32;
                }
            }
            byte b14 = b13;
            if (b13 == -19) {
                if (b11 < -96) {
                    b14 = -19;
                }
            }
            if (!m35214g(b12)) {
                cArr[i10] = (char) (((b14 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw C8396w6.m35991f();
    }

    /* renamed from: f */
    public static /* synthetic */ void m35213f(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (m35214g(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m35214g(b12) || m35214g(b13)) {
            throw C8396w6.m35991f();
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & RCommandClient.MAX_CLIENT_PORT) + 56320);
    }

    /* renamed from: g */
    public static boolean m35214g(byte b10) {
        return b10 > -65;
    }
}
