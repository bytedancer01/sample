package org.apache.http.cookie;

import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookieSpecProvider.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieSpecProvider.class */
public interface CookieSpecProvider {
    CookieSpec create(HttpContext httpContext);
}
