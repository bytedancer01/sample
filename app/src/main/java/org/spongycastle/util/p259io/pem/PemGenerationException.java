package org.spongycastle.util.p259io.pem;

import java.io.IOException;

/* loaded from: combined.jar:classes3.jar:org/spongycastle/util/io/pem/PemGenerationException.class */
public class PemGenerationException extends IOException {
    private Throwable cause;

    public PemGenerationException(String str) {
        super(str);
    }

    public PemGenerationException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
