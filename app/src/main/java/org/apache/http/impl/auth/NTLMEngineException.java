package org.apache.http.impl.auth;

import org.apache.http.auth.AuthenticationException;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/NTLMEngineException.class */
public class NTLMEngineException extends AuthenticationException {
    private static final long serialVersionUID = 6027981323731768824L;

    public NTLMEngineException() {
    }

    public NTLMEngineException(String str) {
        super(str);
    }

    public NTLMEngineException(String str, Throwable th2) {
        super(str, th2);
    }
}
