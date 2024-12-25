package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base64.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base64.class */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    public static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public Base64(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base64(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Base64(int r7, byte[] r8, boolean r9) {
        /*
            r6 = this;
            r0 = r8
            if (r0 != 0) goto La
            r0 = 0
            r10 = r0
            goto Le
        La:
            r0 = r8
            int r0 = r0.length
            r10 = r0
        Le:
            r0 = r6
            r1 = 3
            r2 = 4
            r3 = r7
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            byte[] r1 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r0.decodeTable = r1
            r0 = r8
            if (r0 == 0) goto L7e
            r0 = r6
            r1 = r8
            boolean r0 = r0.containsAlphabetOrPad(r1)
            if (r0 != 0) goto L4f
            r0 = r7
            if (r0 <= 0) goto L7e
            r0 = r6
            r1 = r8
            int r1 = r1.length
            r2 = 4
            int r1 = r1 + r2
            r0.encodeSize = r1
            r0 = r8
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r11 = r0
            r0 = r6
            r1 = r11
            r0.lineSeparator = r1
            r0 = r8
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r8
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            goto L88
        L4f:
            r0 = r8
            java.lang.String r0 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r0)
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "lineSeparator must not contain base64 characters: ["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L7e:
            r0 = r6
            r1 = 4
            r0.encodeSize = r1
            r0 = r6
            r1 = 0
            r0.lineSeparator = r1
        L88:
            r0 = r6
            r1 = r6
            int r1 = r1.encodeSize
            r2 = 1
            int r1 = r1 - r2
            r0.decodeSize = r1
            r0 = r9
            if (r0 == 0) goto L9d
            byte[] r0 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
            r8 = r0
            goto La1
        L9d:
            byte[] r0 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            r8 = r0
        La1:
            r0 = r6
            r1 = r8
            r0.encodeTable = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.<init>(int, byte[], boolean):void");
    }

    public Base64(boolean z10) {
        this(76, CHUNK_SEPARATOR, z10);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10) {
        return encodeBase64(bArr, z10, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11) {
        return encodeBase64(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z10 ? new Base64(z11) : new Base64(0, CHUNK_SEPARATOR, z11);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i10) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i10);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0[r3] != (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isBase64(byte r3) {
        /*
            r0 = r3
            r1 = 61
            if (r0 == r1) goto L23
            r0 = r3
            if (r0 < 0) goto L1e
            byte[] r0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L1e
            r0 = r5
            r1 = r3
            r0 = r0[r1]
            r1 = -1
            if (r0 == r1) goto L1e
            goto L23
        L1e:
            r0 = 0
            r4 = r0
            goto L25
        L23:
            r0 = 1
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.isBase64(byte):boolean");
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isBase64(bArr[i10]) && !BaseNCodec.isWhiteSpace(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = bitLength / 8;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i11 - length, length);
        return bArr;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i10, int i11, BaseNCodec.Context context) {
        byte b10;
        if (context.eof) {
            return;
        }
        if (i11 < 0) {
            context.eof = true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            byte b11 = bArr[i10];
            if (b11 == this.pad) {
                context.eof = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i13 = (context.modulus + 1) % 4;
                    context.modulus = i13;
                    int i14 = (context.ibitWorkArea << 6) + b10;
                    context.ibitWorkArea = i14;
                    if (i13 == 0) {
                        int i15 = context.pos;
                        int i16 = i15 + 1;
                        ensureBufferSize[i15] = (byte) ((i14 >> 16) & 255);
                        int i17 = i16 + 1;
                        ensureBufferSize[i16] = (byte) ((i14 >> 8) & 255);
                        context.pos = i17 + 1;
                        ensureBufferSize[i17] = (byte) (i14 & 255);
                    }
                }
            }
            i12++;
            i10++;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i18 = context.modulus;
        if (i18 != 1) {
            if (i18 == 2) {
                int i19 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i19;
                int i20 = context.pos;
                context.pos = i20 + 1;
                ensureBufferSize2[i20] = (byte) (i19 & 255);
                return;
            }
            if (i18 != 3) {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
            int i21 = context.ibitWorkArea >> 2;
            context.ibitWorkArea = i21;
            int i22 = context.pos;
            int i23 = i22 + 1;
            ensureBufferSize2[i22] = (byte) ((i21 >> 8) & 255);
            context.pos = i23 + 1;
            ensureBufferSize2[i23] = (byte) (i21 & 255);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i10, int i11, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i13 = (context.modulus + 1) % 3;
                context.modulus = i13;
                byte b10 = bArr[i10];
                byte b11 = b10;
                if (b10 < 0) {
                    b11 = b10 + 256;
                }
                int i14 = (context.ibitWorkArea << 8) + b11;
                context.ibitWorkArea = i14;
                if (i13 == 0) {
                    int i15 = context.pos;
                    int i16 = i15 + 1;
                    byte[] bArr2 = this.encodeTable;
                    ensureBufferSize[i15] = bArr2[(i14 >> 18) & 63];
                    int i17 = i16 + 1;
                    ensureBufferSize[i16] = bArr2[(i14 >> 12) & 63];
                    int i18 = i17 + 1;
                    ensureBufferSize[i17] = bArr2[(i14 >> 6) & 63];
                    int i19 = i18 + 1;
                    context.pos = i19;
                    ensureBufferSize[i18] = bArr2[i14 & 63];
                    int i20 = context.currentLinePos + 4;
                    context.currentLinePos = i20;
                    int i21 = this.lineLength;
                    if (i21 > 0 && i21 <= i20) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, ensureBufferSize, i19, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i12++;
                i10++;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i22 = context.pos;
        int i23 = context.modulus;
        if (i23 != 0) {
            if (i23 == 1) {
                int i24 = i22 + 1;
                byte[] bArr4 = this.encodeTable;
                int i25 = context.ibitWorkArea;
                ensureBufferSize2[i22] = bArr4[(i25 >> 2) & 63];
                int i26 = i24 + 1;
                context.pos = i26;
                ensureBufferSize2[i24] = bArr4[(i25 << 4) & 63];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    int i27 = i26 + 1;
                    byte b12 = this.pad;
                    ensureBufferSize2[i26] = b12;
                    context.pos = i27 + 1;
                    ensureBufferSize2[i27] = b12;
                }
            } else {
                if (i23 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i28 = i22 + 1;
                byte[] bArr5 = this.encodeTable;
                int i29 = context.ibitWorkArea;
                ensureBufferSize2[i22] = bArr5[(i29 >> 10) & 63];
                int i30 = i28 + 1;
                ensureBufferSize2[i28] = bArr5[(i29 >> 4) & 63];
                int i31 = i30 + 1;
                context.pos = i31;
                ensureBufferSize2[i30] = bArr5[(i29 << 2) & 63];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i31 + 1;
                    ensureBufferSize2[i31] = this.pad;
                }
            }
        }
        int i32 = context.currentLinePos;
        int i33 = context.pos;
        int i34 = i32 + (i33 - i22);
        context.currentLinePos = i34;
        if (this.lineLength <= 0 || i34 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, ensureBufferSize2, i33, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b10) {
        boolean z10;
        if (b10 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b10 < bArr.length && bArr[b10] != -1) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }
}
