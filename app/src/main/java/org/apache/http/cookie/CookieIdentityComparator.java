package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookieIdentityComparator.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieIdentityComparator.class */
public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        String str;
        int compareTo = cookie.getName().compareTo(cookie2.getName());
        int i10 = compareTo;
        if (compareTo == 0) {
            String domain = cookie.getDomain();
            String str2 = "";
            if (domain == null) {
                str = "";
            } else {
                str = domain;
                if (domain.indexOf(46) == -1) {
                    str = domain + ".local";
                }
            }
            String domain2 = cookie2.getDomain();
            if (domain2 != null) {
                if (domain2.indexOf(46) == -1) {
                    str2 = domain2 + ".local";
                } else {
                    str2 = domain2;
                }
            }
            i10 = str.compareToIgnoreCase(str2);
        }
        int i11 = i10;
        if (i10 == 0) {
            String path = cookie.getPath();
            String str3 = path;
            if (path == null) {
                str3 = "/";
            }
            String path2 = cookie2.getPath();
            if (path2 == null) {
                path2 = "/";
            }
            i11 = str3.compareTo(path2);
        }
        return i11;
    }
}
