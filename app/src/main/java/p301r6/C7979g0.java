package p301r6;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p059d9.C4359e0;
import p267p6.C7629w0;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/g0.class
 */
/* renamed from: r6.g0 */
/* loaded from: combined.jar:classes2.jar:r6/g0.class */
public final class C7979g0 {

    /* renamed from: a */
    public static final int[] f38597a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f38598b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f38599c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34684a(byte[] r4) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7979g0.m34684a(byte[]):int");
    }

    /* renamed from: b */
    public static C4359e0 m34685b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C4359e0(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m34686c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        C4359e0 c4359e0 = new C4359e0(copyOf);
        if (copyOf[0] == 31) {
            C4359e0 c4359e02 = new C4359e0(copyOf);
            while (c4359e02.m21944b() >= 16) {
                c4359e02.m21960r(2);
                c4359e0.m21948f(c4359e02.m21950h(14), 14);
            }
        }
        c4359e0.m21956n(copyOf);
        return c4359e0;
    }

    /* renamed from: c */
    public static boolean m34686c(byte[] bArr) {
        boolean z10 = false;
        byte b10 = bArr[0];
        if (b10 == -2 || b10 == -1) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: d */
    public static boolean m34687d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    /* renamed from: e */
    public static int m34688e(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 != -2) {
            if (b10 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                i13 = position + 7;
            } else if (b10 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                i11 = position + 5;
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                i13 = position + 6;
            }
            i12 = byteBuffer.get(i13) & 60;
            return (((i12 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        i11 = position + 4;
        i12 = byteBuffer.get(i11) & 252;
        return (((i12 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: f */
    public static int m34689f(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: g */
    public static C7629w0 m34690g(byte[] bArr, String str, String str2, C9273n c9273n) {
        C4359e0 m34685b = m34685b(bArr);
        m34685b.m21960r(60);
        int i10 = f38597a[m34685b.m21950h(6)];
        int i11 = f38598b[m34685b.m21950h(4)];
        int m21950h = m34685b.m21950h(5);
        int[] iArr = f38599c;
        int i12 = m21950h >= iArr.length ? -1 : (iArr[m21950h] * 1000) / 2;
        m34685b.m21960r(10);
        return new C7629w0.b().m33208S(str).m33220e0("audio/vnd.dts").m33196G(i12).m33197H(i10 + (m34685b.m21950h(2) > 0 ? 1 : 0)).m33221f0(i11).m33201L(c9273n).m33211V(str2).m33194E();
    }
}
