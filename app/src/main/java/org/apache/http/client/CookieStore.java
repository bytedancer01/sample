package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/CookieStore.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/CookieStore.class */
public interface CookieStore {
    void addCookie(Cookie cookie);

    void clear();

    boolean clearExpired(Date date);

    List<Cookie> getCookies();
}
