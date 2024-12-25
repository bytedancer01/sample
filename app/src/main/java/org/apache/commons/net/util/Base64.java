package org.apache.commons.net.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/Base64.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/Base64.class */
public class Base64 {
    public static final int CHUNK_SIZE = 76;
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int MASK_6BITS = 63;
    private static final int MASK_8BITS = 255;
    private static final byte PAD = 61;
    private byte[] buffer;
    private int currentLinePos;
    private final int decodeSize;
    private final int encodeSize;
    private final byte[] encodeTable;
    private boolean eof;
    private final int lineLength;
    private final byte[] lineSeparator;
    private int modulus;
    private int pos;
    private int readPos;

    /* renamed from: x */
    private int f36144x;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(false);
    }

    public Base64(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base64(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public Base64(int i10, byte[] bArr, boolean z10) {
        byte[] bArr2 = bArr;
        if (bArr == null) {
            bArr2 = EMPTY_BYTE_ARRAY;
            i10 = 0;
        }
        this.lineLength = i10 > 0 ? (i10 / 4) * 4 : 0;
        byte[] bArr3 = new byte[bArr2.length];
        this.lineSeparator = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        if (i10 > 0) {
            this.encodeSize = bArr2.length + 4;
        } else {
            this.encodeSize = 4;
        }
        this.decodeSize = this.encodeSize - 1;
        if (!containsBase64Byte(bArr2)) {
            this.encodeTable = z10 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
            return;
        }
        throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + newStringUtf8(bArr2) + "]");
    }

    public Base64(boolean z10) {
        this(76, CHUNK_SEPARATOR, z10);
    }

    private static boolean containsBase64Byte(byte[] bArr) {
        for (byte b10 : bArr) {
            if (isBase64(b10)) {
                return true;
            }
        }
        return false;
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
        long encodeLength = getEncodeLength(bArr, z10 ? 76 : 0, z10 ? CHUNK_SEPARATOR : EMPTY_BYTE_ARRAY);
        if (encodeLength <= i10) {
            return (z10 ? new Base64(z11) : new Base64(0, CHUNK_SEPARATOR, z11)).encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodeLength + ") than the specified maxium size of " + i10);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, true));
    }

    public static String encodeBase64String(byte[] bArr, boolean z10) {
        return newStringUtf8(encodeBase64(bArr, z10));
    }

    public static String encodeBase64StringUnChunked(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    private byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static long getEncodeLength(byte[] bArr, int i10, byte[] bArr2) {
        int i11 = (i10 / 4) * 4;
        long length = (bArr.length * 4) / 3;
        long j10 = length % 4;
        long j11 = length;
        if (j10 != 0) {
            j11 = length + (4 - j10);
        }
        long j12 = j11;
        if (i11 > 0) {
            long j13 = i11;
            boolean z10 = j11 % j13 == 0;
            long length2 = j11 + ((j11 / j13) * bArr2.length);
            j12 = length2;
            if (!z10) {
                j12 = length2 + bArr2.length;
            }
        }
        return j12;
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isBase64(bArr[i10]) && !isWhiteSpace(bArr[i10])) {
                return false;
            }
        }
        return true;
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
            byte[] r0 = org.apache.commons.net.util.Base64.DECODE_TABLE
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
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.util.Base64.isBase64(byte):boolean");
    }

    private static boolean isWhiteSpace(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private static String newStringUtf8(byte[] bArr) {
        try {
            return new String(bArr, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    private void resizeBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            this.buffer = new byte[8192];
            this.pos = 0;
            this.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.buffer = bArr2;
        }
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

    public int avail() {
        return this.buffer != null ? this.pos - this.readPos : 0;
    }

    public void decode(byte[] bArr, int i10, int i11) {
        int i12;
        byte b10;
        if (this.eof) {
            return;
        }
        if (i11 < 0) {
            this.eof = true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                break;
            }
            byte[] bArr2 = this.buffer;
            if (bArr2 == null || bArr2.length - this.pos < this.decodeSize) {
                resizeBuffer();
            }
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.eof = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr3 = DECODE_TABLE;
                if (b11 < bArr3.length && (b10 = bArr3[b11]) >= 0) {
                    int i14 = this.modulus + 1;
                    this.modulus = i14;
                    int i15 = i14 % 4;
                    this.modulus = i15;
                    int i16 = (this.f36144x << 6) + b10;
                    this.f36144x = i16;
                    if (i15 == 0) {
                        byte[] bArr4 = this.buffer;
                        int i17 = this.pos;
                        int i18 = i17 + 1;
                        bArr4[i17] = (byte) ((i16 >> 16) & 255);
                        int i19 = i18 + 1;
                        bArr4[i18] = (byte) ((i16 >> 8) & 255);
                        this.pos = i19 + 1;
                        bArr4[i19] = (byte) (i16 & 255);
                    }
                }
            }
            i13++;
            i10++;
        }
        if (!this.eof || (i12 = this.modulus) == 0) {
            return;
        }
        int i20 = this.f36144x << 6;
        this.f36144x = i20;
        if (i12 == 2) {
            int i21 = i20 << 6;
            this.f36144x = i21;
            byte[] bArr5 = this.buffer;
            int i22 = this.pos;
            this.pos = i22 + 1;
            bArr5[i22] = (byte) ((i21 >> 16) & 255);
            return;
        }
        if (i12 != 3) {
            return;
        }
        byte[] bArr6 = this.buffer;
        int i23 = this.pos;
        int i24 = i23 + 1;
        bArr6[i23] = (byte) ((i20 >> 16) & 255);
        this.pos = i24 + 1;
        bArr6[i24] = (byte) ((i20 >> 8) & 255);
    }

    public byte[] decode(String str) {
        return decode(getBytesUtf8(str));
    }

    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        setInitialBuffer(new byte[r0], 0, r0);
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        int i10 = this.pos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10);
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    public void encode(byte[] bArr, int i10, int i11) {
        int i12;
        if (this.eof) {
            return;
        }
        if (i11 >= 0) {
            int i13 = 0;
            while (i13 < i11) {
                byte[] bArr2 = this.buffer;
                if (bArr2 == null || bArr2.length - this.pos < this.encodeSize) {
                    resizeBuffer();
                }
                int i14 = this.modulus + 1;
                this.modulus = i14;
                int i15 = i14 % 3;
                this.modulus = i15;
                byte b10 = bArr[i10];
                byte b11 = b10;
                if (b10 < 0) {
                    b11 = b10 + 256;
                }
                int i16 = (this.f36144x << 8) + b11;
                this.f36144x = i16;
                if (i15 == 0) {
                    byte[] bArr3 = this.buffer;
                    int i17 = this.pos;
                    int i18 = i17 + 1;
                    byte[] bArr4 = this.encodeTable;
                    bArr3[i17] = bArr4[(i16 >> 18) & 63];
                    int i19 = i18 + 1;
                    bArr3[i18] = bArr4[(i16 >> 12) & 63];
                    int i20 = i19 + 1;
                    bArr3[i19] = bArr4[(i16 >> 6) & 63];
                    int i21 = i20 + 1;
                    this.pos = i21;
                    bArr3[i20] = bArr4[i16 & 63];
                    int i22 = this.currentLinePos + 4;
                    this.currentLinePos = i22;
                    int i23 = this.lineLength;
                    if (i23 > 0 && i23 <= i22) {
                        byte[] bArr5 = this.lineSeparator;
                        System.arraycopy(bArr5, 0, bArr3, i21, bArr5.length);
                        this.pos += this.lineSeparator.length;
                        this.currentLinePos = 0;
                    }
                }
                i13++;
                i10++;
            }
            return;
        }
        this.eof = true;
        byte[] bArr6 = this.buffer;
        if (bArr6 == null || bArr6.length - this.pos < this.encodeSize) {
            resizeBuffer();
        }
        int i24 = this.modulus;
        if (i24 == 1) {
            byte[] bArr7 = this.buffer;
            int i25 = this.pos;
            int i26 = i25 + 1;
            byte[] bArr8 = this.encodeTable;
            int i27 = this.f36144x;
            bArr7[i25] = bArr8[(i27 >> 2) & 63];
            int i28 = i26 + 1;
            this.pos = i28;
            bArr7[i26] = bArr8[(i27 << 4) & 63];
            if (bArr8 == STANDARD_ENCODE_TABLE) {
                int i29 = i28 + 1;
                bArr7[i28] = 61;
                this.pos = i29 + 1;
                bArr7[i29] = 61;
            }
        } else if (i24 == 2) {
            byte[] bArr9 = this.buffer;
            int i30 = this.pos;
            int i31 = i30 + 1;
            byte[] bArr10 = this.encodeTable;
            int i32 = this.f36144x;
            bArr9[i30] = bArr10[(i32 >> 10) & 63];
            int i33 = i31 + 1;
            bArr9[i31] = bArr10[(i32 >> 4) & 63];
            int i34 = i33 + 1;
            this.pos = i34;
            bArr9[i33] = bArr10[(i32 << 2) & 63];
            if (bArr10 == STANDARD_ENCODE_TABLE) {
                this.pos = i34 + 1;
                bArr9[i34] = 61;
            }
        }
        if (this.lineLength <= 0 || (i12 = this.pos) <= 0) {
            return;
        }
        byte[] bArr11 = this.lineSeparator;
        System.arraycopy(bArr11, 0, this.buffer, i12, bArr11.length);
        this.pos += this.lineSeparator.length;
    }

    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int encodeLength = (int) getEncodeLength(bArr, this.lineLength, this.lineSeparator);
        byte[] bArr2 = new byte[encodeLength];
        setInitialBuffer(bArr2, 0, encodeLength);
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        if (this.buffer != bArr2) {
            readResults(bArr2, 0, encodeLength);
        }
        byte[] bArr3 = bArr2;
        if (isUrlSafe()) {
            int i10 = this.pos;
            bArr3 = bArr2;
            if (i10 < encodeLength) {
                bArr3 = new byte[i10];
                System.arraycopy(bArr2, 0, bArr3, 0, i10);
            }
        }
        return bArr3;
    }

    public String encodeToString(byte[] bArr) {
        return newStringUtf8(encode(bArr));
    }

    public int getLineLength() {
        return this.lineLength;
    }

    public byte[] getLineSeparator() {
        return (byte[]) this.lineSeparator.clone();
    }

    public boolean hasData() {
        return this.buffer != null;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r0 >= r6.pos) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readResults(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = r6
            byte[] r0 = r0.buffer
            if (r0 == 0) goto L43
            r0 = r6
            int r0 = r0.avail()
            r1 = r9
            int r0 = java.lang.Math.min(r0, r1)
            r9 = r0
            r0 = r6
            byte[] r0 = r0.buffer
            r10 = r0
            r0 = r10
            r1 = r7
            if (r0 == r1) goto L3c
            r0 = r10
            r1 = r6
            int r1 = r1.readPos
            r2 = r7
            r3 = r8
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            int r0 = r0.readPos
            r1 = r9
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r1 = r8
            r0.readPos = r1
            r0 = r8
            r1 = r6
            int r1 = r1.pos
            if (r0 < r1) goto L41
        L3c:
            r0 = r6
            r1 = 0
            r0.buffer = r1
        L41:
            r0 = r9
            return r0
        L43:
            r0 = r6
            boolean r0 = r0.eof
            if (r0 == 0) goto L4f
            r0 = -1
            r8 = r0
            goto L51
        L4f:
            r0 = 0
            r8 = r0
        L51:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.util.Base64.readResults(byte[], int, int):int");
    }

    public void setInitialBuffer(byte[] bArr, int i10, int i11) {
        if (bArr == null || bArr.length != i11) {
            return;
        }
        this.buffer = bArr;
        this.pos = i10;
        this.readPos = i10;
    }
}
