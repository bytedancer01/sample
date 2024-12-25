package org.chromium.net;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/QuicException.class */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th2) {
        super(str, th2);
    }

    public abstract int getQuicDetailedErrorCode();
}
