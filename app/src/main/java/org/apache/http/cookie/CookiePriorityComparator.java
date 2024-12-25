package org.apache.http.cookie;

import java.util.Comparator;
import java.util.Date;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.impl.cookie.BasicClientCookie;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookiePriorityComparator.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookiePriorityComparator.class */
public class CookiePriorityComparator implements Comparator<Cookie> {
    public static final CookiePriorityComparator INSTANCE = new CookiePriorityComparator();

    private int getPathLength(Cookie cookie) {
        String path = cookie.getPath();
        return path != null ? path.length() : 1;
    }

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        int pathLength = getPathLength(cookie2) - getPathLength(cookie);
        if (pathLength == 0 && (cookie instanceof BasicClientCookie) && (cookie2 instanceof BasicClientCookie)) {
            Date creationDate = ((BasicClientCookie) cookie).getCreationDate();
            Date creationDate2 = ((BasicClientCookie) cookie2).getCreationDate();
            if (creationDate != null && creationDate2 != null) {
                return (int) (creationDate.getTime() - creationDate2.getTime());
            }
        }
        return pathLength;
    }
}
