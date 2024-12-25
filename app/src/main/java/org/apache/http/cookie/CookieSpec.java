package org.apache.http.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.Obsolete;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookieSpec.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieSpec.class */
public interface CookieSpec {
    List<Header> formatCookies(List<Cookie> list);

    @Obsolete
    int getVersion();

    @Obsolete
    Header getVersionHeader();

    boolean match(Cookie cookie, CookieOrigin cookieOrigin);

    List<Cookie> parse(Header header, CookieOrigin cookieOrigin);

    void validate(Cookie cookie, CookieOrigin cookieOrigin);
}
