package org.apache.commons.codec.digest;

import com.amazonaws.services.p045s3.internal.Constants;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/digest/HmacAlgorithms.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/digest/HmacAlgorithms.class */
public enum HmacAlgorithms {
    HMAC_MD5("HmacMD5"),
    HMAC_SHA_1(Constants.HMAC_SHA1_ALGORITHM),
    HMAC_SHA_256("HmacSHA256"),
    HMAC_SHA_384("HmacSHA384"),
    HMAC_SHA_512("HmacSHA512");

    private final String algorithm;

    HmacAlgorithms(String str) {
        this.algorithm = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.algorithm;
    }
}
