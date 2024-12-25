package p305ra;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u6.class
 */
/* renamed from: ra.u6 */
/* loaded from: combined.jar:classes2.jar:ra/u6.class */
public final class C8366u6 {

    /* renamed from: a */
    public static final Charset f39298a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f39299b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f39300c;

    /* renamed from: d */
    public static final ByteBuffer f39301d;

    /* renamed from: e */
    public static final C8275o5 f39302e;

    static {
        byte[] bArr = new byte[0];
        f39300c = bArr;
        f39301d = ByteBuffer.wrap(bArr);
        C8260n5 c8260n5 = new C8260n5(bArr, 0, 0, false, null);
        try {
            c8260n5.m35646c(0);
            f39302e = c8260n5;
        } catch (C8396w6 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: a */
    public static <T> T m35902a(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: b */
    public static <T> T m35903b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static boolean m35904c(byte[] bArr) {
        return C8189i9.m35455a(bArr);
    }

    /* renamed from: d */
    public static String m35905d(byte[] bArr) {
        return new String(bArr, f39298a);
    }

    /* renamed from: e */
    public static int m35906e(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: f */
    public static int m35907f(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: g */
    public static int m35908g(byte[] bArr) {
        int length = bArr.length;
        int m35909h = m35909h(length, bArr, 0, length);
        int i10 = m35909h;
        if (m35909h == 0) {
            i10 = 1;
        }
        return i10;
    }

    /* renamed from: h */
    public static int m35909h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: i */
    public static Object m35910i(Object obj, Object obj2) {
        return ((InterfaceC8307q7) obj).mo35584b().mo35684y((InterfaceC8307q7) obj2).mo35451t();
    }
}
