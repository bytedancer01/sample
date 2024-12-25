package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/net/URLCodec.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/net/URLCodec.class */
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    public static final byte ESCAPE_CHAR = 37;
    public static final int RADIX = 16;
    public static final BitSet WWW_FORM_URL = new BitSet(256);

    @Deprecated
    public String charset;

    static {
        for (int i10 = 97; i10 <= 122; i10++) {
            WWW_FORM_URL.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            WWW_FORM_URL.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            WWW_FORM_URL.set(i12);
        }
        BitSet bitSet = WWW_FORM_URL;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }

    public URLCodec() {
        this("UTF-8");
    }

    public URLCodec(String str) {
        this.charset = str;
    }

    public static final byte[] decodeUrl(byte[] bArr) {
        byte b10;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b11 = bArr[i10];
            if (b11 == 43) {
                b10 = 32;
            } else {
                b10 = b11;
                if (b11 == 37) {
                    int i11 = i10 + 1;
                    try {
                        int digit16 = Utils.digit16(bArr[i11]);
                        i10 = i11 + 1;
                        byteArrayOutputStream.write((char) ((digit16 << 4) + Utils.digit16(bArr[i10])));
                        i10++;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new DecoderException("Invalid URL encoding: ", e10);
                    }
                }
            }
            byteArrayOutputStream.write(b10);
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeUrl(BitSet bitSet, byte[] bArr) {
        int upperCase;
        if (bArr == null) {
            return null;
        }
        BitSet bitSet2 = bitSet;
        if (bitSet == null) {
            bitSet2 = WWW_FORM_URL;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b10 : bArr) {
            int i10 = b10;
            if (b10 < 0) {
                i10 = b10 + 256;
            }
            if (bitSet2.get(i10)) {
                upperCase = i10;
                if (i10 == 32) {
                    upperCase = 43;
                }
            } else {
                byteArrayOutputStream.write(37);
                char upperCase2 = Character.toUpperCase(Character.forDigit((i10 >> 4) & 15, 16));
                upperCase = Character.toUpperCase(Character.forDigit(i10 & 15, 16));
                byteArrayOutputStream.write(upperCase2);
            }
            byteArrayOutputStream.write(upperCase);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    public String decode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeUrl(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    public String encode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeUrl(WWW_FORM_URL, bArr);
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    @Deprecated
    public String getEncoding() {
        return this.charset;
    }
}
