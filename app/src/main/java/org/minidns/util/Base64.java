package org.minidns.util;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/Base64.class */
public final class Base64 {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final String PADDING = "==";

    private Base64() {
    }

    public static String encodeToString(byte[] bArr) {
        int length = (3 - (bArr.length % 3)) % 3;
        byte[] bArr2 = new byte[bArr.length + length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10 += 3) {
            int i11 = ((bArr2[i10] & 255) << 16) + ((bArr2[i10 + 1] & 255) << 8) + (bArr2[i10 + 2] & 255);
            sb2.append(ALPHABET.charAt((i11 >> 18) & 63));
            sb2.append(ALPHABET.charAt((i11 >> 12) & 63));
            sb2.append(ALPHABET.charAt((i11 >> 6) & 63));
            sb2.append(ALPHABET.charAt(i11 & 63));
        }
        return sb2.substring(0, sb2.length() - length) + PADDING.substring(0, length);
    }
}
