package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/net/Utils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/net/Utils.class */
class Utils {
    public static int digit16(byte b10) {
        int digit = Character.digit((char) b10, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b10));
    }
}
