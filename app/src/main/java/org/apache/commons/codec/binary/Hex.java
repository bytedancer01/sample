package org.apache.commons.codec.binary;

import java.nio.charset.Charset;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Hex.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Hex.class */
public class Hex implements BinaryEncoder, BinaryDecoder {
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    private final Charset charset;
    public static final Charset DEFAULT_CHARSET = Charsets.UTF_8;
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public Hex() {
        this.charset = DEFAULT_CHARSET;
    }

    public Hex(String str) {
        this(Charset.forName(str));
    }

    public Hex(Charset charset) {
        this.charset = charset;
    }

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new DecoderException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int digit = toDigit(cArr[i10], i10);
            int i12 = i10 + 1;
            int digit2 = toDigit(cArr[i12], i12);
            i10 = i12 + 1;
            bArr[i11] = (byte) (((digit << 4) | digit2) & 255);
            i11++;
        }
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z10) {
        return encodeHex(bArr, z10 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    public static int toDigit(char c10, int i10) {
        int digit = Character.digit(c10, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c10 + " at index " + i10);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        try {
            return decodeHex(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeHex(new String(bArr, getCharset()).toCharArray());
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        try {
            return encodeHex(obj instanceof String ? ((String) obj).getBytes(getCharset()) : (byte[]) obj);
        } catch (ClassCastException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeHexString(bArr).getBytes(getCharset());
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getCharsetName() {
        return this.charset.name();
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.charset + "]";
    }
}
