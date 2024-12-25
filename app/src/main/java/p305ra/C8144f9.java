package p305ra;

import org.apache.commons.net.nntp.NNTPReply;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f9.class
 */
/* renamed from: ra.f9 */
/* loaded from: combined.jar:classes2.jar:ra/f9.class */
public final class C8144f9 extends AbstractC8129e9 {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r5 = p305ra.C8189i9.m35462h(r6, r0, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    @Override // p305ra.AbstractC8129e9
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo35322b(int r5, byte[] r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8144f9.mo35322b(int, byte[], int, int):int");
    }

    @Override // p305ra.AbstractC8129e9
    /* renamed from: c */
    public final String mo35323c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i14 = i10 + i11;
        char[] cArr = new char[i11];
        int i15 = 0;
        int i16 = i10;
        while (true) {
            i12 = i15;
            i13 = i16;
            if (i16 >= i14) {
                break;
            }
            byte b10 = bArr[i16];
            if (!C8114d9.m35208a(b10)) {
                i12 = i15;
                i13 = i16;
                break;
            }
            i16++;
            cArr[i15] = (char) b10;
            i15++;
        }
        while (i13 < i14) {
            int i17 = i13 + 1;
            byte b11 = bArr[i13];
            if (C8114d9.m35208a(b11)) {
                cArr[i12] = (char) b11;
                int i18 = i12 + 1;
                while (true) {
                    int i19 = i18;
                    i12 = i19;
                    i13 = i17;
                    if (i17 < i14) {
                        byte b12 = bArr[i17];
                        if (!C8114d9.m35208a(b12)) {
                            i12 = i19;
                            i13 = i17;
                            break;
                        }
                        i17++;
                        i18 = i19 + 1;
                        cArr[i19] = (char) b12;
                    }
                }
            } else if (C8114d9.m35209b(b11)) {
                if (i17 >= i14) {
                    throw C8396w6.m35991f();
                }
                C8114d9.m35210c(b11, bArr[i17], cArr, i12);
                i13 = i17 + 1;
                i12++;
            } else if (C8114d9.m35211d(b11)) {
                if (i17 >= i14 - 1) {
                    throw C8396w6.m35991f();
                }
                int i20 = i17 + 1;
                C8114d9.m35212e(b11, bArr[i17], bArr[i20], cArr, i12);
                i13 = i20 + 1;
                i12++;
            } else {
                if (i17 >= i14 - 2) {
                    throw C8396w6.m35991f();
                }
                int i21 = i17 + 1;
                int i22 = i21 + 1;
                C8114d9.m35213f(b11, bArr[i17], bArr[i21], bArr[i22], cArr, i12);
                i12 += 2;
                i13 = i22 + 1;
            }
        }
        return new String(cArr, 0, i12);
    }

    @Override // p305ra.AbstractC8129e9
    /* renamed from: d */
    public final int mo35324d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        int i18 = i16;
        while (i18 < length) {
            char charAt2 = charSequence.charAt(i18);
            if (charAt2 < 128 && i17 < i15) {
                i12 = i17 + 1;
                bArr[i17] = (byte) charAt2;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i19 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i12 = i19 + 1;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i17 > i15 - 3) {
                    if (i17 > i15 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i13 = i18 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                            throw new C8159g9(i18, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(charAt2);
                        sb2.append(" at index ");
                        sb2.append(i17);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i20 = i18 + 1;
                    if (i20 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i20);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i21 = i17 + 1;
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            int i22 = i21 + 1;
                            bArr[i21] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                            bArr[i23] = (byte) ((codePoint & 63) | 128);
                            i18 = i20;
                            i12 = i23 + 1;
                        } else {
                            i18 = i20;
                        }
                    }
                    throw new C8159g9(i18 - 1, length);
                }
                int i24 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> '\f') | NNTPReply.AUTHENTICATION_REQUIRED);
                int i25 = i24 + 1;
                bArr[i24] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i12 = i25 + 1;
                bArr[i25] = (byte) ((charAt2 & '?') | 128);
            }
            i18++;
            i17 = i12;
        }
        return i17;
    }
}
