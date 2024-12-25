package p436z4;

import java.util.Arrays;
import org.apache.commons.net.telnet.TelnetCommand;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z4/a.class
 */
/* renamed from: z4.a */
/* loaded from: combined.jar:classes1.jar:z4/a.class */
public final class C10050a {

    /* renamed from: a */
    public static final char[] f46114a;

    /* renamed from: b */
    public static final byte[] f46115b;

    /* renamed from: c */
    public static final int[] f46116c;

    /* renamed from: d */
    public static final int[] f46117d;

    /* renamed from: e */
    public static final int[] f46118e;

    /* renamed from: f */
    public static final int[] f46119f;

    /* renamed from: g */
    public static final int[] f46120g;

    /* renamed from: h */
    public static final int[] f46121h;

    /* renamed from: i */
    public static final int[] f46122i;

    /* renamed from: j */
    public static final int[] f46123j;

    static {
        int i10;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f46114a = charArray;
        int length = charArray.length;
        f46115b = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            f46115b[i11] = (byte) f46114a[i11];
        }
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f46116c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i13 = 128; i13 < 256; i13++) {
            iArr2[i13] = (i13 & 224) == 192 ? 2 : (i13 & 240) == 224 ? 3 : (i13 & TelnetCommand.f36139EL) == 240 ? 4 : -1;
        }
        f46117d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i14 = 33; i14 < 256; i14++) {
            if (Character.isJavaIdentifierPart((char) i14)) {
                iArr3[i14] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f46118e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f46119f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f46117d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f46120g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f46121h = iArr7;
        int[] iArr8 = new int[128];
        for (int i15 = 0; i15 < 32; i15++) {
            iArr8[i15] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f46122i = iArr8;
        int[] iArr9 = new int[128];
        f46123j = iArr9;
        Arrays.fill(iArr9, -1);
        int i16 = 0;
        while (true) {
            if (i16 >= 10) {
                break;
            }
            f46123j[i16 + 48] = i16;
            i16++;
        }
        for (i10 = 0; i10 < 6; i10++) {
            int[] iArr10 = f46123j;
            int i17 = i10 + 10;
            iArr10[i10 + 97] = i17;
            iArr10[i10 + 65] = i17;
        }
    }

    /* renamed from: a */
    public static void m42263a(StringBuilder sb2, String str) {
        int[] iArr = f46122i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            char c10 = charAt;
            if (charAt < length) {
                if (iArr[charAt] == 0) {
                    c10 = charAt;
                } else {
                    sb2.append('\\');
                    int i11 = iArr[charAt];
                    if (i11 < 0) {
                        sb2.append('u');
                        sb2.append('0');
                        sb2.append('0');
                        char[] cArr = f46114a;
                        sb2.append(cArr[charAt >> 4]);
                        c10 = cArr[charAt & 15];
                    } else {
                        c10 = (char) i11;
                    }
                }
            }
            sb2.append(c10);
        }
    }
}
