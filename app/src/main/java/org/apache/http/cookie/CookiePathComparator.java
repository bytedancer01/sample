package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookiePathComparator.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookiePathComparator.class */
public class CookiePathComparator implements Serializable, Comparator<Cookie> {
    public static final CookiePathComparator INSTANCE = new CookiePathComparator();
    private static final long serialVersionUID = 7523645369616405818L;

    private String normalizePath(Cookie cookie) {
        String path = cookie.getPath();
        String str = path;
        if (path == null) {
            str = "/";
        }
        String str2 = str;
        if (!str.endsWith("/")) {
            str2 = str + '/';
        }
        return str2;
    }

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        String normalizePath = normalizePath(cookie);
        String normalizePath2 = normalizePath(cookie2);
        if (normalizePath.equals(normalizePath2)) {
            return 0;
        }
        if (normalizePath.startsWith(normalizePath2)) {
            return -1;
        }
        return normalizePath2.startsWith(normalizePath) ? 1 : 0;
    }
}
