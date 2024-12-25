package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.StringUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/net/RFC1522Codec.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/net/RFC1522Codec.class */
abstract class RFC1522Codec {
    public static final String POSTFIX = "?=";
    public static final String PREFIX = "=?";
    public static final char SEP = '?';

    public String decodeText(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(PREFIX) || !str.endsWith(POSTFIX)) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int indexOf = str.indexOf(63, 2);
        if (indexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String substring = str.substring(2, indexOf);
        if (substring.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(63, i10);
        if (indexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String substring2 = str.substring(i10, indexOf2);
        if (getEncoding().equalsIgnoreCase(substring2)) {
            int i11 = indexOf2 + 1;
            return new String(doDecoding(StringUtils.getBytesUsAscii(str.substring(i11, str.indexOf(63, i11)))), substring);
        }
        throw new DecoderException("This codec cannot decode " + substring2 + " encoded content");
    }

    public abstract byte[] doDecoding(byte[] bArr);

    public abstract byte[] doEncoding(byte[] bArr);

    public String encodeText(String str, String str2) {
        if (str == null) {
            return null;
        }
        return encodeText(str, Charset.forName(str2));
    }

    public String encodeText(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return PREFIX + charset + '?' + getEncoding() + '?' + StringUtils.newStringUsAscii(doEncoding(str.getBytes(charset))) + POSTFIX;
    }

    public abstract String getEncoding();
}
