package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base64OutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base64OutputStream.class */
public class Base64OutputStream extends BaseNCodecOutputStream {
    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream, new Base64(false), z10);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new Base64(i10, bArr), z10);
    }
}
