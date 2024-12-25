package org.minidns.util;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/Base32.class */
public final class Base32 {
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUV";
    private static final String PADDING = "======";

    private Base32() {
    }

    public static String encodeToString(byte[] bArr) {
        int length = ((int) (8.0d - ((bArr.length % 5) * 1.6d))) % 8;
        System.arraycopy(bArr, 0, new byte[bArr.length + length], 0, bArr.length);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10 += 5) {
            long j10 = ((r0[i10] & 255) << 32) + ((r0[i10 + 1] & 255) << 24) + ((r0[i10 + 2] & 255) << 16) + ((r0[i10 + 3] & 255) << 8) + (r0[i10 + 4] & 255);
            sb2.append(ALPHABET.charAt((int) ((j10 >> 35) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 30) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 25) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 20) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 15) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 10) & 31)));
            sb2.append(ALPHABET.charAt((int) ((j10 >> 5) & 31)));
            sb2.append(ALPHABET.charAt((int) (j10 & 31)));
        }
        return sb2.substring(0, sb2.length() - length) + PADDING.substring(0, length);
    }
}
