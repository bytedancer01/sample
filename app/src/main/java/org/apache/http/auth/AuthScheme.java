package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthScheme.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthScheme.class */
public interface AuthScheme {
    @Deprecated
    Header authenticate(Credentials credentials, HttpRequest httpRequest);

    String getParameter(String str);

    String getRealm();

    String getSchemeName();

    boolean isComplete();

    boolean isConnectionBased();

    void processChallenge(Header header);
}
