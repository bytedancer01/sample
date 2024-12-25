package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/net/QuotedPrintableCodec.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/net/QuotedPrintableCodec.class */
public class QuotedPrintableCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {

    /* renamed from: CR */
    private static final byte f36119CR = 13;
    private static final byte ESCAPE_CHAR = 61;

    /* renamed from: LF */
    private static final byte f36120LF = 10;
    private static final BitSet PRINTABLE_CHARS = new BitSet(256);
    private static final int SAFE_LENGTH = 73;
    private static final byte SPACE = 32;
    private static final byte TAB = 9;
    private final Charset charset;
    private final boolean strict;

    static {
        for (int i10 = 33; i10 <= 60; i10++) {
            PRINTABLE_CHARS.set(i10);
        }
        for (int i11 = 62; i11 <= 126; i11++) {
            PRINTABLE_CHARS.set(i11);
        }
        BitSet bitSet = PRINTABLE_CHARS;
        bitSet.set(9);
        bitSet.set(32);
    }

    public QuotedPrintableCodec() {
        this(Charsets.UTF_8, false);
    }

    public QuotedPrintableCodec(String str) {
        this(Charset.forName(str), false);
    }

    public QuotedPrintableCodec(Charset charset) {
        this(charset, false);
    }

    public QuotedPrintableCodec(Charset charset, boolean z10) {
        this.charset = charset;
        this.strict = z10;
    }

    public QuotedPrintableCodec(boolean z10) {
        this(Charsets.UTF_8, z10);
    }

    public static final byte[] decodeQuotedPrintable(byte[] bArr) {
        int i10;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= bArr.length) {
                return byteArrayOutputStream.toByteArray();
            }
            byte b10 = bArr[i12];
            if (b10 == 61) {
                i10 = i12 + 1;
                byte b11 = bArr[i10];
                if (b11 == 13) {
                    continue;
                } else {
                    try {
                        i10++;
                        byteArrayOutputStream.write((char) ((Utils.digit16(b11) << 4) + Utils.digit16(bArr[i10])));
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new DecoderException("Invalid quoted-printable encoding", e10);
                    }
                }
            } else {
                i10 = i12;
                if (b10 != 13) {
                    i10 = i12;
                    if (b10 != 10) {
                        byteArrayOutputStream.write(b10);
                        i10 = i12;
                    }
                }
            }
            i11 = i10 + 1;
        }
    }

    private static int encodeByte(int i10, boolean z10, ByteArrayOutputStream byteArrayOutputStream) {
        if (z10) {
            return encodeQuotedPrintable(i10, byteArrayOutputStream);
        }
        byteArrayOutputStream.write(i10);
        return 1;
    }

    private static final int encodeQuotedPrintable(int i10, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char upperCase = Character.toUpperCase(Character.forDigit((i10 >> 4) & 15, 16));
        char upperCase2 = Character.toUpperCase(Character.forDigit(i10 & 15, 16));
        byteArrayOutputStream.write(upperCase);
        byteArrayOutputStream.write(upperCase2);
        return 3;
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr) {
        return encodeQuotedPrintable(bitSet, bArr, false);
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr, boolean z10) {
        int i10;
        if (bArr == null) {
            return null;
        }
        BitSet bitSet2 = bitSet;
        if (bitSet == null) {
            bitSet2 = PRINTABLE_CHARS;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z10) {
            int i11 = 1;
            for (int i12 = 0; i12 < bArr.length - 3; i12++) {
                int unsignedOctet = getUnsignedOctet(i12, bArr);
                if (i11 < 73) {
                    i10 = i11 + encodeByte(unsignedOctet, !bitSet2.get(unsignedOctet), byteArrayOutputStream);
                } else {
                    encodeByte(unsignedOctet, !bitSet2.get(unsignedOctet) || isWhitespace(unsignedOctet), byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    i10 = 1;
                }
                i11 = i10;
            }
            int unsignedOctet2 = getUnsignedOctet(bArr.length - 3, bArr);
            if (i11 + encodeByte(unsignedOctet2, !bitSet2.get(unsignedOctet2) || (isWhitespace(unsignedOctet2) && i11 > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            int length = bArr.length - 2;
            while (length < bArr.length) {
                int unsignedOctet3 = getUnsignedOctet(length, bArr);
                encodeByte(unsignedOctet3, !bitSet2.get(unsignedOctet3) || (length > bArr.length - 2 && isWhitespace(unsignedOctet3)), byteArrayOutputStream);
                length++;
            }
        } else {
            for (byte b10 : bArr) {
                int i13 = b10;
                if (b10 < 0) {
                    i13 = b10 + 256;
                }
                if (bitSet2.get(i13)) {
                    byteArrayOutputStream.write(i13);
                } else {
                    encodeQuotedPrintable(i13, byteArrayOutputStream);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    private static int getUnsignedOctet(int i10, byte[] bArr) {
        byte b10 = bArr[i10];
        byte b11 = b10;
        if (b10 < 0) {
            b11 = b10 + 256;
        }
        return b11;
    }

    private static boolean isWhitespace(int i10) {
        return i10 == 32 || i10 == 9;
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
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) {
        return decode(str, getCharset());
    }

    public String decode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    public String decode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), charset);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return decodeQuotedPrintable(bArr);
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
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return encode(str, getCharset());
    }

    public String encode(String str, String str2) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    public String encode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(charset)));
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeQuotedPrintable(PRINTABLE_CHARS, bArr, this.strict);
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.charset.name();
    }
}
