package org.apache.http.auth;

import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthSchemeFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthSchemeFactory.class */
public interface AuthSchemeFactory {
    AuthScheme newInstance(HttpParams httpParams);
}
