package org.apache.commons.codec.binary;

import org.apache.commons.codec.binary.BaseNCodec;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base32.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base32.class */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final int MASK_5BITS = 31;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    public Base32(byte b10) {
        this(false, b10);
    }

    public Base32(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base32(int i10, byte[] bArr) {
        this(i10, bArr, false, (byte) 61);
    }

    public Base32(int i10, byte[] bArr, boolean z10) {
        this(i10, bArr, z10, (byte) 61);
    }

    public Base32(int i10, byte[] bArr, boolean z10, byte b10) {
        super(5, 8, i10, bArr == null ? 0 : bArr.length, b10);
        if (z10) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i10 <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                throw new IllegalArgumentException("lineLength " + i10 + " > 0, but lineSeparator is null");
            }
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            this.encodeSize = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.decodeSize = this.encodeSize - 1;
        if (isInAlphabet(b10) || BaseNCodec.isWhiteSpace(b10)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    public Base32(boolean z10) {
        this(0, null, z10, (byte) 61);
    }

    public Base32(boolean z10, byte b10) {
        this(0, null, z10, b10);
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
            byte b11 = bArr[i10];
            if (b11 == this.pad) {
                context.eof = true;
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            if (b11 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i13 = (context.modulus + 1) % 8;
                    context.modulus = i13;
                    context.lbitWorkArea = (context.lbitWorkArea << 5) + b10;
                    if (i13 == 0) {
                        int i14 = context.pos;
                        int i15 = i14 + 1;
                        ensureBufferSize[i14] = (byte) ((r0 >> 32) & 255);
                        int i16 = i15 + 1;
                        ensureBufferSize[i15] = (byte) ((r0 >> 24) & 255);
                        int i17 = i16 + 1;
                        ensureBufferSize[i16] = (byte) ((r0 >> 16) & 255);
                        int i18 = i17 + 1;
                        ensureBufferSize[i17] = (byte) ((r0 >> 8) & 255);
                        context.pos = i18 + 1;
                        ensureBufferSize[i18] = (byte) (r0 & 255);
                    }
                }
            }
            i12++;
            i10++;
        }
        if (!context.eof || context.modulus < 2) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        switch (context.modulus) {
            case 2:
                int i19 = context.pos;
                context.pos = i19 + 1;
                ensureBufferSize2[i19] = (byte) ((context.lbitWorkArea >> 2) & 255);
                return;
            case 3:
                int i20 = context.pos;
                context.pos = i20 + 1;
                ensureBufferSize2[i20] = (byte) ((context.lbitWorkArea >> 7) & 255);
                return;
            case 4:
                context.lbitWorkArea = context.lbitWorkArea >> 4;
                int i21 = context.pos;
                int i22 = i21 + 1;
                ensureBufferSize2[i21] = (byte) ((r0 >> 8) & 255);
                context.pos = i22 + 1;
                ensureBufferSize2[i22] = (byte) (r0 & 255);
                return;
            case 5:
                context.lbitWorkArea = context.lbitWorkArea >> 1;
                int i23 = context.pos;
                int i24 = i23 + 1;
                ensureBufferSize2[i23] = (byte) ((r0 >> 16) & 255);
                int i25 = i24 + 1;
                ensureBufferSize2[i24] = (byte) ((r0 >> 8) & 255);
                context.pos = i25 + 1;
                ensureBufferSize2[i25] = (byte) (r0 & 255);
                return;
            case 6:
                context.lbitWorkArea = context.lbitWorkArea >> 6;
                int i26 = context.pos;
                int i27 = i26 + 1;
                ensureBufferSize2[i26] = (byte) ((r0 >> 16) & 255);
                int i28 = i27 + 1;
                ensureBufferSize2[i27] = (byte) ((r0 >> 8) & 255);
                context.pos = i28 + 1;
                ensureBufferSize2[i28] = (byte) (r0 & 255);
                return;
            case 7:
                context.lbitWorkArea = context.lbitWorkArea >> 3;
                int i29 = context.pos;
                int i30 = i29 + 1;
                ensureBufferSize2[i29] = (byte) ((r0 >> 24) & 255);
                int i31 = i30 + 1;
                ensureBufferSize2[i30] = (byte) ((r0 >> 16) & 255);
                int i32 = i31 + 1;
                ensureBufferSize2[i31] = (byte) ((r0 >> 8) & 255);
                context.pos = i32 + 1;
                ensureBufferSize2[i32] = (byte) (r0 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i10, int i11, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i11 >= 0) {
            int i12 = i10;
            int i13 = 0;
            while (i13 < i11) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i14 = (context.modulus + 1) % 5;
                context.modulus = i14;
                int i15 = i12 + 1;
                byte b10 = bArr[i12];
                byte b11 = b10;
                if (b10 < 0) {
                    b11 = b10 + 256;
                }
                long j10 = (context.lbitWorkArea << 8) + b11;
                context.lbitWorkArea = j10;
                if (i14 == 0) {
                    int i16 = context.pos;
                    int i17 = i16 + 1;
                    byte[] bArr2 = this.encodeTable;
                    ensureBufferSize[i16] = bArr2[((int) (j10 >> 35)) & 31];
                    int i18 = i17 + 1;
                    ensureBufferSize[i17] = bArr2[((int) (j10 >> 30)) & 31];
                    int i19 = i18 + 1;
                    ensureBufferSize[i18] = bArr2[((int) (j10 >> 25)) & 31];
                    int i20 = i19 + 1;
                    ensureBufferSize[i19] = bArr2[((int) (j10 >> 20)) & 31];
                    int i21 = i20 + 1;
                    ensureBufferSize[i20] = bArr2[((int) (j10 >> 15)) & 31];
                    int i22 = i21 + 1;
                    ensureBufferSize[i21] = bArr2[((int) (j10 >> 10)) & 31];
                    int i23 = i22 + 1;
                    ensureBufferSize[i22] = bArr2[((int) (j10 >> 5)) & 31];
                    int i24 = i23 + 1;
                    context.pos = i24;
                    ensureBufferSize[i23] = bArr2[((int) j10) & 31];
                    int i25 = context.currentLinePos + 8;
                    context.currentLinePos = i25;
                    int i26 = this.lineLength;
                    if (i26 > 0 && i26 <= i25) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, ensureBufferSize, i24, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i13++;
                i12 = i15;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i27 = context.pos;
        int i28 = context.modulus;
        if (i28 != 0) {
            if (i28 == 1) {
                int i29 = i27 + 1;
                byte[] bArr4 = this.encodeTable;
                long j11 = context.lbitWorkArea;
                ensureBufferSize2[i27] = bArr4[((int) (j11 >> 3)) & 31];
                int i30 = i29 + 1;
                ensureBufferSize2[i29] = bArr4[((int) (j11 << 2)) & 31];
                int i31 = i30 + 1;
                byte b12 = this.pad;
                ensureBufferSize2[i30] = b12;
                int i32 = i31 + 1;
                ensureBufferSize2[i31] = b12;
                int i33 = i32 + 1;
                ensureBufferSize2[i32] = b12;
                int i34 = i33 + 1;
                ensureBufferSize2[i33] = b12;
                int i35 = i34 + 1;
                ensureBufferSize2[i34] = b12;
                context.pos = i35 + 1;
                ensureBufferSize2[i35] = b12;
            } else if (i28 == 2) {
                int i36 = i27 + 1;
                byte[] bArr5 = this.encodeTable;
                long j12 = context.lbitWorkArea;
                ensureBufferSize2[i27] = bArr5[((int) (j12 >> 11)) & 31];
                int i37 = i36 + 1;
                ensureBufferSize2[i36] = bArr5[((int) (j12 >> 6)) & 31];
                int i38 = i37 + 1;
                ensureBufferSize2[i37] = bArr5[((int) (j12 >> 1)) & 31];
                int i39 = i38 + 1;
                ensureBufferSize2[i38] = bArr5[((int) (j12 << 4)) & 31];
                int i40 = i39 + 1;
                byte b13 = this.pad;
                ensureBufferSize2[i39] = b13;
                int i41 = i40 + 1;
                ensureBufferSize2[i40] = b13;
                int i42 = i41 + 1;
                ensureBufferSize2[i41] = b13;
                context.pos = i42 + 1;
                ensureBufferSize2[i42] = b13;
            } else if (i28 == 3) {
                int i43 = i27 + 1;
                byte[] bArr6 = this.encodeTable;
                long j13 = context.lbitWorkArea;
                ensureBufferSize2[i27] = bArr6[((int) (j13 >> 19)) & 31];
                int i44 = i43 + 1;
                ensureBufferSize2[i43] = bArr6[((int) (j13 >> 14)) & 31];
                int i45 = i44 + 1;
                ensureBufferSize2[i44] = bArr6[((int) (j13 >> 9)) & 31];
                int i46 = i45 + 1;
                ensureBufferSize2[i45] = bArr6[((int) (j13 >> 4)) & 31];
                int i47 = i46 + 1;
                ensureBufferSize2[i46] = bArr6[((int) (j13 << 1)) & 31];
                int i48 = i47 + 1;
                byte b14 = this.pad;
                ensureBufferSize2[i47] = b14;
                int i49 = i48 + 1;
                ensureBufferSize2[i48] = b14;
                context.pos = i49 + 1;
                ensureBufferSize2[i49] = b14;
            } else {
                if (i28 != 4) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i50 = i27 + 1;
                byte[] bArr7 = this.encodeTable;
                long j14 = context.lbitWorkArea;
                ensureBufferSize2[i27] = bArr7[((int) (j14 >> 27)) & 31];
                int i51 = i50 + 1;
                ensureBufferSize2[i50] = bArr7[((int) (j14 >> 22)) & 31];
                int i52 = i51 + 1;
                ensureBufferSize2[i51] = bArr7[((int) (j14 >> 17)) & 31];
                int i53 = i52 + 1;
                ensureBufferSize2[i52] = bArr7[((int) (j14 >> 12)) & 31];
                int i54 = i53 + 1;
                ensureBufferSize2[i53] = bArr7[((int) (j14 >> 7)) & 31];
                int i55 = i54 + 1;
                ensureBufferSize2[i54] = bArr7[((int) (j14 >> 2)) & 31];
                int i56 = i55 + 1;
                ensureBufferSize2[i55] = bArr7[((int) (j14 << 3)) & 31];
                context.pos = i56 + 1;
                ensureBufferSize2[i56] = this.pad;
            }
        }
        int i57 = context.currentLinePos;
        int i58 = context.pos;
        int i59 = i57 + (i58 - i27);
        context.currentLinePos = i59;
        if (this.lineLength <= 0 || i59 <= 0) {
            return;
        }
        byte[] bArr8 = this.lineSeparator;
        System.arraycopy(bArr8, 0, ensureBufferSize2, i58, bArr8.length);
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
}
