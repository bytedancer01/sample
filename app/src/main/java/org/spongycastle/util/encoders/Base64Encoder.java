package org.spongycastle.util.encoders;

import java.io.OutputStream;

/* loaded from: combined.jar:classes3.jar:org/spongycastle/util/encoders/Base64Encoder.class */
public class Base64Encoder implements Encoder {
    public final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public final byte[] decodingTable = new byte[128];
    public byte padding = 61;

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13) {
        char c14 = this.padding;
        if (c12 == c14) {
            byte[] bArr = this.decodingTable;
            outputStream.write((bArr[c10] << 2) | (bArr[c11] >> 4));
            return 1;
        }
        if (c13 == c14) {
            byte[] bArr2 = this.decodingTable;
            byte b10 = bArr2[c10];
            byte b11 = bArr2[c11];
            byte b12 = bArr2[c12];
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b13 = bArr3[c10];
        byte b14 = bArr3[c11];
        byte b15 = bArr3[c12];
        byte b16 = bArr3[c13];
        outputStream.write((b13 << 2) | (b14 >> 4));
        outputStream.write((b14 << 4) | (b15 >> 2));
        outputStream.write((b15 << 6) | b16);
        return 3;
    }

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(String str, int i10, int i11) {
        while (i10 < i11 && ignore(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    private int nextI(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && ignore((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i10 = length - 4;
        int i11 = 0;
        int nextI = nextI(str, 0, i10);
        while (true) {
            int i12 = nextI;
            if (i12 >= i10) {
                return i11 + decodeLastBlock(outputStream, str.charAt(i10), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
            }
            byte b10 = this.decodingTable[str.charAt(i12)];
            int nextI2 = nextI(str, i12 + 1, i10);
            byte b11 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, nextI2 + 1, i10);
            byte b12 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, nextI3 + 1, i10);
            byte b13 = this.decodingTable[str.charAt(nextI4)];
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i11 += 3;
            nextI = nextI(str, nextI4 + 1, i10);
        }
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        int i12 = i11 + i10;
        while (i12 > i10 && ignore((char) bArr[i12 - 1])) {
            i12--;
        }
        int i13 = i12 - 4;
        int nextI = nextI(bArr, i10, i13);
        int i14 = 0;
        while (nextI < i13) {
            byte b10 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, nextI + 1, i13);
            byte b11 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, nextI2 + 1, i13);
            byte b12 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, nextI3 + 1, i13);
            byte b13 = this.decodingTable[bArr[nextI4]];
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i14 += 3;
            nextI = nextI(bArr, nextI4 + 1, i13);
        }
        return i14 + decodeLastBlock(outputStream, (char) bArr[i13], (char) bArr[i12 - 3], (char) bArr[i12 - 2], (char) bArr[i12 - 1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012e  */
    @Override // org.spongycastle.util.encoders.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encode(byte[] r7, int r8, int r9, java.io.OutputStream r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.encoders.Base64Encoder.encode(byte[], int, int, java.io.OutputStream):int");
    }

    public void initialiseDecodingTable() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.encodingTable;
            if (i10 >= bArr.length) {
                return;
            }
            this.decodingTable[bArr[i10]] = (byte) i10;
            i10++;
        }
    }
}
