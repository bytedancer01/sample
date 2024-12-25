package org.apache.http.cookie;

import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/CookieOrigin.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieOrigin.class */
public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String str, int i10, String str2, boolean z10) {
        Args.notBlank(str, "Host");
        Args.notNegative(i10, "Port");
        Args.notNull(str2, "Path");
        this.host = str.toLowerCase(Locale.ROOT);
        this.port = i10;
        if (TextUtils.isBlank(str2)) {
            this.path = "/";
        } else {
            this.path = str2;
        }
        this.secure = z10;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this.secure) {
            sb2.append("(secure)");
        }
        sb2.append(this.host);
        sb2.append(':');
        sb2.append(Integer.toString(this.port));
        sb2.append(this.path);
        sb2.append(']');
        return sb2.toString();
    }
}
