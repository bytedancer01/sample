package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base32InputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base32InputStream.class */
public class Base32InputStream extends BaseNCodecInputStream {
    public Base32InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base32InputStream(InputStream inputStream, boolean z10) {
        super(inputStream, new Base32(false), z10);
    }

    public Base32InputStream(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new Base32(i10, bArr), z10);
    }
}
