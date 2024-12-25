package org.apache.http.cookie;

import java.util.Date;
import org.apache.http.annotation.Obsolete;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/SetCookie.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/SetCookie.class */
public interface SetCookie extends Cookie {
    @Obsolete
    void setComment(String str);

    void setDomain(String str);

    void setExpiryDate(Date date);

    void setPath(String str);

    void setSecure(boolean z10);

    void setValue(String str);

    @Obsolete
    void setVersion(int i10);
}
