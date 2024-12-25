package ma;

import org.apache.commons.net.nntp.NNTPReply;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/mj.class
 */
/* renamed from: ma.mj */
/* loaded from: combined.jar:classes2.jar:ma/mj.class */
public final class C6277mj {

    /* renamed from: a */
    public static final AbstractC6214jj f33896a;

    static {
        if (C6193ij.m29736C() && C6193ij.m29737D()) {
            int i10 = C6168hf.f33799a;
        }
        f33896a = new C6235kj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r0 > (-12)) goto L26;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ int m29855a(byte[] r4, int r5, int r6) {
        /*
            r0 = r6
            r1 = r5
            int r0 = r0 - r1
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L6b
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L4e
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L46
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 > r1) goto L73
            r0 = r7
            r1 = -65
            if (r0 > r1) goto L73
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L37
            goto L73
        L37:
            r0 = r7
            r1 = 8
            int r0 = r0 << r1
            r1 = r6
            r0 = r0 ^ r1
            r1 = r5
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L75
        L46:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L4e:
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 > r1) goto L73
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L61
            goto L73
        L61:
            r0 = r6
            r1 = r5
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L75
        L6b:
            r0 = r6
            r5 = r0
            r0 = r6
            r1 = -12
            if (r0 <= r1) goto L75
        L73:
            r0 = -1
            r5 = r0
        L75:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6277mj.m29855a(byte[], int, int):int");
    }

    /* renamed from: b */
    public static int m29856b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt;
        int length = charSequence.length();
        int i16 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i16 >= length || (i15 = i16 + i10) >= i12 || (charAt = charSequence.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) charAt;
            i16++;
        }
        if (i16 != length) {
            int i17 = i10 + i16;
            int i18 = i16;
            while (true) {
                i13 = i17;
                if (i18 >= length) {
                    break;
                }
                char charAt2 = charSequence.charAt(i18);
                if (charAt2 < 128 && i17 < i12) {
                    bArr[i17] = (byte) charAt2;
                    i17++;
                } else if (charAt2 < 2048 && i17 <= i12 - 2) {
                    int i19 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                    i17 = i19 + 1;
                    bArr[i19] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i17 <= i12 - 3) {
                    int i20 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> '\f') | NNTPReply.AUTHENTICATION_REQUIRED);
                    int i21 = i20 + 1;
                    bArr[i20] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i17 = i21 + 1;
                    bArr[i21] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if (i17 > i12 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i14 = i18 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i14)))) {
                            throw new C6256lj(i18, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                    }
                    int i22 = i18 + 1;
                    if (i22 == charSequence.length()) {
                        break;
                    }
                    char charAt3 = charSequence.charAt(i22);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i18 = i22;
                        break;
                    }
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    int i23 = i17 + 1;
                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((codePoint >>> 12) & 63) | 128);
                    int i25 = i24 + 1;
                    bArr[i24] = (byte) (((codePoint >>> 6) & 63) | 128);
                    i17 = i25 + 1;
                    bArr[i25] = (byte) ((codePoint & 63) | 128);
                    i18 = i22;
                }
                i18++;
            }
            throw new C6256lj(i18 - 1, length);
        }
        i13 = i10 + length;
        return i13;
    }

    /* renamed from: c */
    public static int m29857c(CharSequence charSequence) {
        int i10;
        int i11;
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            i10 = i13;
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                int i14 = 0;
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i14 += (127 - charAt2) >>> 31;
                        i11 = i12;
                    } else {
                        int i15 = i14 + 2;
                        i14 = i15;
                        i11 = i12;
                        if (charAt2 >= 55296) {
                            i14 = i15;
                            i11 = i12;
                            if (charAt2 > 57343) {
                                continue;
                            } else {
                                if (Character.codePointAt(charSequence, i12) < 65536) {
                                    throw new C6256lj(i12, length2);
                                }
                                i11 = i12 + 1;
                                i14 = i15;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12 = i11 + 1;
                }
                i10 = i13 + i14;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    /* renamed from: d */
    public static boolean m29858d(byte[] bArr) {
        return f33896a.m29790b(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static boolean m29859e(byte[] bArr, int i10, int i11) {
        return f33896a.m29790b(bArr, 0, i11);
    }
}
