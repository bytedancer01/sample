package org.apache.http.auth;

import org.apache.http.ProtocolException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthenticationException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthenticationException.class */
public class AuthenticationException extends ProtocolException {
    private static final long serialVersionUID = -6794031905674764776L;

    public AuthenticationException() {
    }

    public AuthenticationException(String str) {
        super(str);
    }

    public AuthenticationException(String str, Throwable th2) {
        super(str, th2);
    }
}
