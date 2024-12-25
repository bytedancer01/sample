package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/Base32OutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/Base32OutputStream.class */
public class Base32OutputStream extends BaseNCodecOutputStream {
    public Base32OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream, new Base32(false), z10);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new Base32(i10, bArr), z10);
    }
}
