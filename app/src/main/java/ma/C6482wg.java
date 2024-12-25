package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/wg.class
 */
/* renamed from: ma.wg */
/* loaded from: combined.jar:classes2.jar:ma/wg.class */
public final class C6482wg {

    /* renamed from: a */
    public static final Charset f34130a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f34131b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f34132c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f34133d;

    /* renamed from: e */
    public static final ByteBuffer f34134e;

    /* renamed from: f */
    public static final C6481wf f34135f;

    static {
        byte[] bArr = new byte[0];
        f34133d = bArr;
        f34134e = ByteBuffer.wrap(bArr);
        int i10 = C6481wf.f34129a;
        C6441uf c6441uf = new C6441uf(bArr, 0, 0, false, null);
        try {
            c6441uf.m30068a(0);
            f34135f = c6441uf;
        } catch (C6502xg e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: a */
    public static int m30094a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m30095b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: c */
    public static Object m30096c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m30097d(byte[] bArr) {
        return new String(bArr, f34131b);
    }
}
