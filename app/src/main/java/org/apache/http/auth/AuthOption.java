package org.apache.http.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthOption.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthOption.class */
public final class AuthOption {
    private final AuthScheme authScheme;
    private final Credentials creds;

    public AuthOption(AuthScheme authScheme, Credentials credentials) {
        Args.notNull(authScheme, "Auth scheme");
        Args.notNull(credentials, "User credentials");
        this.authScheme = authScheme;
        this.creds = credentials;
    }

    public AuthScheme getAuthScheme() {
        return this.authScheme;
    }

    public Credentials getCredentials() {
        return this.creds;
    }

    public String toString() {
        return this.authScheme.toString();
    }
}
