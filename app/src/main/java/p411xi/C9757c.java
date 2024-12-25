package p411xi;

import com.journeyapps.barcodescanner.C2582b;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p430yi.C10023b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/c.class
 */
/* renamed from: xi.c */
/* loaded from: combined.jar:classes2.jar:xi/c.class */
public final class C9757c {
    /* renamed from: a */
    public static final boolean m41080a(@NotNull byte[] bArr, int i10, @NotNull byte[] bArr2, int i11, int i12) {
        C9367f.m39526e(bArr, "a");
        C9367f.m39526e(bArr2, C2582b.f15902o);
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m41081b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    /* renamed from: c */
    public static final int m41082c(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* renamed from: d */
    public static final short m41083d(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    @NotNull
    /* renamed from: e */
    public static final String m41084e(byte b10) {
        return new String(new char[]{C10023b.m42175f()[(b10 >> 4) & 15], C10023b.m42175f()[b10 & 15]});
    }

    @NotNull
    /* renamed from: f */
    public static final String m41085f(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {C10023b.m42175f()[(i10 >> 28) & 15], C10023b.m42175f()[(i10 >> 24) & 15], C10023b.m42175f()[(i10 >> 20) & 15], C10023b.m42175f()[(i10 >> 16) & 15], C10023b.m42175f()[(i10 >> 12) & 15], C10023b.m42175f()[(i10 >> 8) & 15], C10023b.m42175f()[(i10 >> 4) & 15], C10023b.m42175f()[i10 & 15]};
        int i11 = 0;
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return new String(cArr, i11, 8 - i11);
    }
}
