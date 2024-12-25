package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/ContextAwareAuthScheme.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/ContextAwareAuthScheme.class */
public interface ContextAwareAuthScheme extends AuthScheme {
    Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext);
}
