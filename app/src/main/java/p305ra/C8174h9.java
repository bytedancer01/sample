package p305ra;

import org.apache.commons.net.nntp.NNTPReply;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h9.class
 */
/* renamed from: ra.h9 */
/* loaded from: combined.jar:classes2.jar:ra/h9.class */
public final class C8174h9 extends AbstractC8129e9 {
    /* renamed from: e */
    public static int m35417e(byte[] bArr, int i10, long j10, int i11) {
        int m35464j;
        int m35465k;
        int m35466l;
        if (i11 == 0) {
            m35464j = C8189i9.m35464j(i10);
            return m35464j;
        }
        if (i11 == 1) {
            m35465k = C8189i9.m35465k(i10, C8099c9.m35104A(bArr, j10));
            return m35465k;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        m35466l = C8189i9.m35466l(i10, C8099c9.m35104A(bArr, j10), C8099c9.m35104A(bArr, j10 + 1));
        return m35466l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        r9 = m35417e(r10, r9, r16, r11);
     */
    @Override // p305ra.AbstractC8129e9
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo35322b(int r9, byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8174h9.mo35322b(int, byte[], int, int):int");
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
            byte m35104A = C8099c9.m35104A(bArr, i16);
            if (!C8114d9.m35208a(m35104A)) {
                i12 = i15;
                i13 = i16;
                break;
            }
            i16++;
            cArr[i15] = (char) m35104A;
            i15++;
        }
        while (i13 < i14) {
            int i17 = i13 + 1;
            byte m35104A2 = C8099c9.m35104A(bArr, i13);
            if (C8114d9.m35208a(m35104A2)) {
                cArr[i12] = (char) m35104A2;
                int i18 = i12 + 1;
                while (true) {
                    int i19 = i18;
                    i12 = i19;
                    i13 = i17;
                    if (i17 < i14) {
                        byte m35104A3 = C8099c9.m35104A(bArr, i17);
                        if (!C8114d9.m35208a(m35104A3)) {
                            i12 = i19;
                            i13 = i17;
                            break;
                        }
                        i17++;
                        i18 = i19 + 1;
                        cArr[i19] = (char) m35104A3;
                    }
                }
            } else if (C8114d9.m35209b(m35104A2)) {
                if (i17 >= i14) {
                    throw C8396w6.m35991f();
                }
                C8114d9.m35210c(m35104A2, C8099c9.m35104A(bArr, i17), cArr, i12);
                i13 = i17 + 1;
                i12++;
            } else if (C8114d9.m35211d(m35104A2)) {
                if (i17 >= i14 - 1) {
                    throw C8396w6.m35991f();
                }
                int i20 = i17 + 1;
                C8114d9.m35212e(m35104A2, C8099c9.m35104A(bArr, i17), C8099c9.m35104A(bArr, i20), cArr, i12);
                i13 = i20 + 1;
                i12++;
            } else {
                if (i17 >= i14 - 2) {
                    throw C8396w6.m35991f();
                }
                int i21 = i17 + 1;
                int i22 = i21 + 1;
                C8114d9.m35213f(m35104A2, C8099c9.m35104A(bArr, i17), C8099c9.m35104A(bArr, i21), C8099c9.m35104A(bArr, i22), cArr, i12);
                i12 += 2;
                i13 = i22 + 1;
            }
        }
        return new String(cArr, 0, i12);
    }

    @Override // p305ra.AbstractC8129e9
    /* renamed from: d */
    public final int mo35324d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        int i12;
        char charAt;
        long j11 = i10;
        long j12 = i11 + j11;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt2);
            sb2.append(" at index ");
            sb2.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            C8099c9.m35105B(bArr, j11, (byte) charAt);
            i13++;
            j11 = 1 + j11;
        }
        if (i13 == length) {
            return (int) j11;
        }
        while (i13 < length) {
            char charAt3 = charSequence.charAt(i13);
            if (charAt3 < 128 && j11 < j12) {
                C8099c9.m35105B(bArr, j11, (byte) charAt3);
                j11 += j10;
                j10 = j10;
            } else if (charAt3 < 2048 && j11 <= (-2) + j12) {
                long j13 = j11 + j10;
                C8099c9.m35105B(bArr, j11, (byte) ((charAt3 >>> 6) | 960));
                C8099c9.m35105B(bArr, j13, (byte) ((charAt3 & '?') | 128));
                j11 = j13 + j10;
            } else {
                if ((charAt3 >= 55296 && charAt3 <= 57343) || j11 > (-3) + j12) {
                    if (j11 > (-4) + j12) {
                        if (charAt3 >= 55296 && charAt3 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i12)))) {
                            throw new C8159g9(i13, length);
                        }
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(charAt3);
                        sb3.append(" at index ");
                        sb3.append(j11);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    int i14 = i13 + 1;
                    if (i14 != length) {
                        char charAt4 = charSequence.charAt(i14);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j14 = j11 + 1;
                            C8099c9.m35105B(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                            long j15 = j14 + 1;
                            C8099c9.m35105B(bArr, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j16 = j15 + 1;
                            C8099c9.m35105B(bArr, j15, (byte) (((codePoint >>> 6) & 63) | 128));
                            j10 = 1;
                            j11 = j16 + 1;
                            C8099c9.m35105B(bArr, j16, (byte) ((codePoint & 63) | 128));
                            i13 = i14;
                        } else {
                            i13 = i14;
                        }
                    }
                    throw new C8159g9(i13 - 1, length);
                }
                long j17 = j11 + j10;
                C8099c9.m35105B(bArr, j11, (byte) ((charAt3 >>> '\f') | NNTPReply.AUTHENTICATION_REQUIRED));
                long j18 = j17 + j10;
                C8099c9.m35105B(bArr, j17, (byte) (((charAt3 >>> 6) & 63) | 128));
                C8099c9.m35105B(bArr, j18, (byte) ((charAt3 & '?') | 128));
                j11 = j18 + 1;
                j10 = 1;
            }
            i13++;
        }
        return (int) j11;
    }
}
