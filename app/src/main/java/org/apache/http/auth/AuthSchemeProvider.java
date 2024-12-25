package org.apache.http.auth;

import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthSchemeProvider.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthSchemeProvider.class */
public interface AuthSchemeProvider {
    AuthScheme create(HttpContext httpContext);
}
