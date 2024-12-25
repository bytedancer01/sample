package org.apache.http.auth;

import java.util.Queue;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthState.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthState.class */
public class AuthState {
    private Queue<AuthOption> authOptions;
    private AuthScheme authScheme;
    private AuthScope authScope;
    private Credentials credentials;
    private AuthProtocolState state = AuthProtocolState.UNCHALLENGED;

    public Queue<AuthOption> getAuthOptions() {
        return this.authOptions;
    }

    public AuthScheme getAuthScheme() {
        return this.authScheme;
    }

    @Deprecated
    public AuthScope getAuthScope() {
        return this.authScope;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public AuthProtocolState getState() {
        return this.state;
    }

    public boolean hasAuthOptions() {
        Queue<AuthOption> queue = this.authOptions;
        return (queue == null || queue.isEmpty()) ? false : true;
    }

    @Deprecated
    public void invalidate() {
        reset();
    }

    public boolean isConnectionBased() {
        AuthScheme authScheme = this.authScheme;
        return authScheme != null && authScheme.isConnectionBased();
    }

    @Deprecated
    public boolean isValid() {
        return this.authScheme != null;
    }

    public void reset() {
        this.state = AuthProtocolState.UNCHALLENGED;
        this.authOptions = null;
        this.authScheme = null;
        this.authScope = null;
        this.credentials = null;
    }

    @Deprecated
    public void setAuthScheme(AuthScheme authScheme) {
        if (authScheme == null) {
            reset();
        } else {
            this.authScheme = authScheme;
        }
    }

    @Deprecated
    public void setAuthScope(AuthScope authScope) {
        this.authScope = authScope;
    }

    @Deprecated
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public void setState(AuthProtocolState authProtocolState) {
        if (authProtocolState == null) {
            authProtocolState = AuthProtocolState.UNCHALLENGED;
        }
        this.state = authProtocolState;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state:");
        sb2.append(this.state);
        sb2.append(";");
        if (this.authScheme != null) {
            sb2.append("auth scheme:");
            sb2.append(this.authScheme.getSchemeName());
            sb2.append(";");
        }
        if (this.credentials != null) {
            sb2.append("credentials present");
        }
        return sb2.toString();
    }

    public void update(Queue<AuthOption> queue) {
        Args.notEmpty(queue, "Queue of auth options");
        this.authOptions = queue;
        this.authScheme = null;
        this.credentials = null;
    }

    public void update(AuthScheme authScheme, Credentials credentials) {
        Args.notNull(authScheme, "Auth scheme");
        Args.notNull(credentials, "Credentials");
        this.authScheme = authScheme;
        this.credentials = credentials;
        this.authOptions = null;
    }
}
