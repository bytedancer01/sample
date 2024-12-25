package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/net/BCodec.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/net/BCodec.class */
public class BCodec extends RFC1522Codec implements StringEncoder, StringDecoder {
    private final Charset charset;

    public BCodec() {
        this(Charsets.UTF_8);
    }

    public BCodec(String str) {
        this(Charset.forName(str));
    }

    public BCodec(Charset charset) {
        this.charset = charset;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.decodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        return encode(str, getCharset());
    }

    public String encode(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return encodeText(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    public String encode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return encodeText(str, charset);
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.charset.name();
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public String getEncoding() {
        return "B";
    }
}
