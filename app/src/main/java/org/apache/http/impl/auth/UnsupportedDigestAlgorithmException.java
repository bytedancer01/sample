package org.apache.http.impl.auth;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/UnsupportedDigestAlgorithmException.class */
public class UnsupportedDigestAlgorithmException extends RuntimeException {
    private static final long serialVersionUID = 319558534317118022L;

    public UnsupportedDigestAlgorithmException() {
    }

    public UnsupportedDigestAlgorithmException(String str) {
        super(str);
    }

    public UnsupportedDigestAlgorithmException(String str, Throwable th2) {
        super(str, th2);
    }
}