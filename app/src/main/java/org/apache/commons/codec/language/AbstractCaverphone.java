package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/AbstractCaverphone.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/AbstractCaverphone.class */
public abstract class AbstractCaverphone implements StringEncoder {
    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }

    public boolean isEncodeEqual(String str, String str2) {
        return encode(str).equals(encode(str2));
    }
}
