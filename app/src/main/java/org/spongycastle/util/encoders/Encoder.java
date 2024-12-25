package org.spongycastle.util.encoders;

import java.io.OutputStream;

/* loaded from: combined.jar:classes3.jar:org/spongycastle/util/encoders/Encoder.class */
public interface Encoder {
    int decode(String str, OutputStream outputStream);

    int decode(byte[] bArr, int i10, int i11, OutputStream outputStream);

    int encode(byte[] bArr, int i10, int i11, OutputStream outputStream);
}
