package org.minidns.util;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/Hex.class */
public class Hex {
    public static StringBuilder from(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X ", Byte.valueOf(b10)));
        }
        return sb2;
    }
}
