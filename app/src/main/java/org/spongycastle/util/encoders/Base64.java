package org.spongycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: combined.jar:classes3.jar:org/spongycastle/util/encoders/Base64.class */
public class Base64 {
    private static final Encoder encoder = new Base64Encoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("exception decoding base64 string: " + e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("exception decoding base64 string: " + e10);
        }
    }

    public static int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        return encoder.encode(bArr, i10, i11, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((bArr.length + 2) / 3) * 4);
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("exception encoding base64 string: " + e10);
        }
    }
}
