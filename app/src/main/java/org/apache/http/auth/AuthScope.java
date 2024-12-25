package org.apache.http.auth;

import java.util.Locale;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthScope.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthScope.class */
public class AuthScope {
    public static final AuthScope ANY = new AuthScope(null, -1, null, null);
    public static final String ANY_HOST = null;
    public static final int ANY_PORT = -1;
    public static final String ANY_REALM = null;
    public static final String ANY_SCHEME = null;
    private final String host;
    private final HttpHost origin;
    private final int port;
    private final String realm;
    private final String scheme;

    public AuthScope(String str, int i10) {
        this(str, i10, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(String str, int i10, String str2) {
        this(str, i10, str2, ANY_SCHEME);
    }

    public AuthScope(String str, int i10, String str2, String str3) {
        this.host = str == null ? ANY_HOST : str.toLowerCase(Locale.ROOT);
        this.port = i10 < 0 ? -1 : i10;
        this.realm = str2 == null ? ANY_REALM : str2;
        this.scheme = str3 == null ? ANY_SCHEME : str3.toUpperCase(Locale.ROOT);
        this.origin = null;
    }

    public AuthScope(HttpHost httpHost) {
        this(httpHost, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(HttpHost httpHost, String str, String str2) {
        Args.notNull(httpHost, "Host");
        String hostName = httpHost.getHostName();
        Locale locale = Locale.ROOT;
        this.host = hostName.toLowerCase(locale);
        this.port = httpHost.getPort() < 0 ? -1 : httpHost.getPort();
        this.realm = str == null ? ANY_REALM : str;
        this.scheme = str2 == null ? ANY_SCHEME : str2.toUpperCase(locale);
        this.origin = httpHost;
    }

    public AuthScope(AuthScope authScope) {
        Args.notNull(authScope, "Scope");
        this.host = authScope.getHost();
        this.port = authScope.getPort();
        this.realm = authScope.getRealm();
        this.scheme = authScope.getScheme();
        this.origin = authScope.getOrigin();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthScope)) {
            return super.equals(obj);
        }
        AuthScope authScope = (AuthScope) obj;
        boolean z10 = false;
        if (LangUtils.equals(this.host, authScope.host)) {
            z10 = false;
            if (this.port == authScope.port) {
                z10 = false;
                if (LangUtils.equals(this.realm, authScope.realm)) {
                    z10 = false;
                    if (LangUtils.equals(this.scheme, authScope.scheme)) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public String getHost() {
        return this.host;
    }

    public HttpHost getOrigin() {
        return this.origin;
    }

    public int getPort() {
        return this.port;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.host), this.port), this.realm), this.scheme);
    }

    public int match(AuthScope authScope) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (LangUtils.equals(this.scheme, authScope.scheme)) {
            i10 = 1;
        } else {
            String str = this.scheme;
            String str2 = ANY_SCHEME;
            if (str != str2 && authScope.scheme != str2) {
                return -1;
            }
            i10 = 0;
        }
        if (LangUtils.equals(this.realm, authScope.realm)) {
            i11 = i10 + 2;
        } else {
            String str3 = this.realm;
            String str4 = ANY_REALM;
            i11 = i10;
            if (str3 != str4) {
                i11 = i10;
                if (authScope.realm != str4) {
                    return -1;
                }
            }
        }
        int i14 = this.port;
        int i15 = authScope.port;
        if (i14 == i15) {
            i12 = i11 + 4;
        } else {
            i12 = i11;
            if (i14 != -1) {
                i12 = i11;
                if (i15 != -1) {
                    return -1;
                }
            }
        }
        if (LangUtils.equals(this.host, authScope.host)) {
            i13 = i12 + 8;
        } else {
            String str5 = this.host;
            String str6 = ANY_HOST;
            i13 = i12;
            if (str5 != str6) {
                i13 = i12;
                if (authScope.host != str6) {
                    return -1;
                }
            }
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.scheme;
        if (str != null) {
            sb2.append(str.toUpperCase(Locale.ROOT));
            sb2.append(' ');
        }
        if (this.realm != null) {
            sb2.append('\'');
            sb2.append(this.realm);
            sb2.append('\'');
        } else {
            sb2.append("<any realm>");
        }
        if (this.host != null) {
            sb2.append('@');
            sb2.append(this.host);
            if (this.port >= 0) {
                sb2.append(':');
                sb2.append(this.port);
            }
        }
        return sb2.toString();
    }
}
