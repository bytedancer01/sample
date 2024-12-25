package ge;

import java.text.DecimalFormat;
import p444zd.C10197e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ge/b.class
 */
/* renamed from: ge.b */
/* loaded from: combined.jar:classes2.jar:ge/b.class */
public final class C5001b {

    /* renamed from: a */
    public static final String[] f29010a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "��\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "��\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    public static C10197e m25166a(byte[] bArr, int i10) {
        String m25173h;
        StringBuilder sb2;
        int i11;
        StringBuilder sb3 = new StringBuilder(IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
        if (i10 == 2 || i10 == 3) {
            int i12 = 0;
            if (i10 == 2) {
                m25173h = new DecimalFormat("0000000000".substring(0, m25172g(bArr))).format(m25171f(bArr));
            } else {
                m25173h = m25173h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(m25168c(bArr));
            String format2 = decimalFormat.format(m25174i(bArr));
            sb3.append(m25170e(bArr, 10, 84));
            if (sb3.toString().startsWith("[)>\u001e01\u001d")) {
                i12 = 9;
                sb2 = new StringBuilder();
            } else {
                sb2 = new StringBuilder();
            }
            sb2.append(m25173h);
            sb2.append((char) 29);
            sb2.append(format);
            sb2.append((char) 29);
            sb2.append(format2);
            sb2.append((char) 29);
            sb3.insert(i12, sb2.toString());
        } else {
            if (i10 == 4) {
                i11 = 93;
            } else if (i10 == 5) {
                i11 = 77;
            }
            sb3.append(m25170e(bArr, 1, i11));
        }
        return new C10197e(bArr, sb3.toString(), null, String.valueOf(i10));
    }

    /* renamed from: b */
    public static int m25167b(int i10, byte[] bArr) {
        int i11 = i10 - 1;
        return ((1 << (5 - (i11 % 6))) & bArr[i11 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static int m25168c(byte[] bArr) {
        return m25169d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    public static int m25169d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            i10 += m25167b(bArr2[i11], bArr) << ((bArr2.length - i11) - 1);
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public static String m25170e(byte[] bArr, int i10, int i11) {
        int i12;
        StringBuilder sb2 = new StringBuilder();
        int i13 = i10;
        int i14 = 0;
        int i15 = -1;
        int i16 = 0;
        while (true) {
            int i17 = i16;
            if (i13 >= i10 + i11) {
                while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
                    sb2.setLength(sb2.length() - 1);
                }
                return sb2.toString();
            }
            char charAt = f29010a[i14].charAt(bArr[i13]);
            int i18 = i14;
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i15 = 1;
                    i12 = i14;
                    i14 = charAt - 65520;
                    break;
                case 65525:
                    i15 = 2;
                    i12 = i14;
                    i14 = 0;
                    break;
                case 65526:
                    i15 = 3;
                    i12 = i14;
                    i14 = 0;
                    break;
                case 65527:
                    i18 = 0;
                    i15 = -1;
                    i14 = i18;
                    i12 = i17;
                    break;
                case 65528:
                    i18 = 1;
                    i15 = -1;
                    i14 = i18;
                    i12 = i17;
                    break;
                case 65529:
                    i15 = -1;
                    i14 = i18;
                    i12 = i17;
                    break;
                case 65530:
                default:
                    sb2.append(charAt);
                    i12 = i17;
                    break;
                case 65531:
                    int i19 = i13 + 1;
                    byte b10 = bArr[i19];
                    int i20 = i19 + 1;
                    byte b11 = bArr[i20];
                    int i21 = i20 + 1;
                    byte b12 = bArr[i21];
                    int i22 = i21 + 1;
                    byte b13 = bArr[i22];
                    i13 = i22 + 1;
                    sb2.append(new DecimalFormat("000000000").format((b10 << 24) + (b11 << 18) + (b12 << 12) + (b13 << 6) + bArr[i13]));
                    i12 = i17;
                    break;
            }
            if (i15 == 0) {
                i14 = i12;
            }
            i13++;
            i15--;
            i16 = i12;
        }
    }

    /* renamed from: f */
    public static int m25171f(byte[] bArr) {
        return m25169d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    public static int m25172g(byte[] bArr) {
        return m25169d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    public static String m25173h(byte[] bArr) {
        String[] strArr = f29010a;
        return String.valueOf(new char[]{strArr[0].charAt(m25169d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m25169d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m25169d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m25169d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m25169d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m25169d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    public static int m25174i(byte[] bArr) {
        return m25169d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
