package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base64InputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base64InputStream.class */
public class Base64InputStream extends BaseNCodecInputStream {
    public Base64InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(InputStream inputStream, boolean z10) {
        super(inputStream, new Base64(false), z10);
    }

    public Base64InputStream(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new Base64(i10, bArr), z10);
    }
}
