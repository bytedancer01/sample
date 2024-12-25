package org.apache.http.cookie;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookieAttributeHandler.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieAttributeHandler.class */
public interface CookieAttributeHandler {
    boolean match(Cookie cookie, CookieOrigin cookieOrigin);

    void parse(SetCookie setCookie, String str);

    void validate(Cookie cookie, CookieOrigin cookieOrigin);
}
