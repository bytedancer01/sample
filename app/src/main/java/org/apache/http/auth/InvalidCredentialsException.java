package org.apache.http.auth;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/InvalidCredentialsException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/InvalidCredentialsException.class */
public class InvalidCredentialsException extends AuthenticationException {
    private static final long serialVersionUID = -4834003835215460648L;

    public InvalidCredentialsException() {
    }

    public InvalidCredentialsException(String str) {
        super(str);
    }

    public InvalidCredentialsException(String str, Throwable th2) {
        super(str, th2);
    }
}
