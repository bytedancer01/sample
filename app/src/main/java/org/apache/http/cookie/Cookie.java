package org.apache.http.cookie;

import java.util.Date;
import org.apache.http.annotation.Obsolete;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/Cookie.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/Cookie.class */
public interface Cookie {
    @Obsolete
    String getComment();

    @Obsolete
    String getCommentURL();

    String getDomain();

    Date getExpiryDate();

    String getName();

    String getPath();

    @Obsolete
    int[] getPorts();

    String getValue();

    @Obsolete
    int getVersion();

    boolean isExpired(Date date);

    boolean isPersistent();

    boolean isSecure();
}
