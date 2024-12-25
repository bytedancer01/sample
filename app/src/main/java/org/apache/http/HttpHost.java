package org.apache.http;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpHost.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpHost.class */
public final class HttpHost implements Cloneable, Serializable {
    public static final String DEFAULT_SCHEME_NAME = "http";
    private static final long serialVersionUID = -7529410654042457626L;
    public final InetAddress address;
    public final String hostname;
    public final String lcHostname;
    public final int port;
    public final String schemeName;

    public HttpHost(String str) {
        this(str, -1, (String) null);
    }

    public HttpHost(String str, int i10) {
        this(str, i10, (String) null);
    }

    public HttpHost(String str, int i10, String str2) {
        this.hostname = (String) Args.containsNoBlanks(str, "Host name");
        Locale locale = Locale.ROOT;
        this.lcHostname = str.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : DEFAULT_SCHEME_NAME;
        this.port = i10;
        this.address = null;
    }

    public HttpHost(InetAddress inetAddress) {
        this(inetAddress, -1, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i10) {
        this(inetAddress, i10, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i10, String str) {
        this((InetAddress) Args.notNull(inetAddress, "Inet address"), inetAddress.getHostName(), i10, str);
    }

    public HttpHost(InetAddress inetAddress, String str, int i10, String str2) {
        this.address = (InetAddress) Args.notNull(inetAddress, "Inet address");
        String str3 = (String) Args.notNull(str, "Hostname");
        this.hostname = str3;
        Locale locale = Locale.ROOT;
        this.lcHostname = str3.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : DEFAULT_SCHEME_NAME;
        this.port = i10;
    }

    public HttpHost(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        this.hostname = httpHost.hostname;
        this.lcHostname = httpHost.lcHostname;
        this.schemeName = httpHost.schemeName;
        this.port = httpHost.port;
        this.address = httpHost.address;
    }

    public static HttpHost create(String str) {
        String str2;
        Args.containsNoBlanks(str, "HTTP Host");
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 3);
        } else {
            str2 = null;
        }
        int i10 = -1;
        int lastIndexOf = str.lastIndexOf(":");
        String str3 = str;
        if (lastIndexOf > 0) {
            try {
                i10 = Integer.parseInt(str.substring(lastIndexOf + 1));
                str3 = str.substring(0, lastIndexOf);
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Invalid HTTP host: " + str);
            }
        }
        return new HttpHost(str3, i10, str2);
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHost)) {
            return false;
        }
        HttpHost httpHost = (HttpHost) obj;
        if (this.lcHostname.equals(httpHost.lcHostname) && this.port == httpHost.port && this.schemeName.equals(httpHost.schemeName)) {
            InetAddress inetAddress = this.address;
            InetAddress inetAddress2 = httpHost.address;
            if (inetAddress != null) {
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public String getHostName() {
        return this.hostname;
    }

    public int getPort() {
        return this.port;
    }

    public String getSchemeName() {
        return this.schemeName;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.lcHostname), this.port), this.schemeName);
        InetAddress inetAddress = this.address;
        int i10 = hashCode;
        if (inetAddress != null) {
            i10 = LangUtils.hashCode(hashCode, inetAddress);
        }
        return i10;
    }

    public String toHostString() {
        if (this.port == -1) {
            return this.hostname;
        }
        StringBuilder sb2 = new StringBuilder(this.hostname.length() + 6);
        sb2.append(this.hostname);
        sb2.append(":");
        sb2.append(Integer.toString(this.port));
        return sb2.toString();
    }

    public String toString() {
        return toURI();
    }

    public String toURI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.schemeName);
        sb2.append("://");
        sb2.append(this.hostname);
        if (this.port != -1) {
            sb2.append(':');
            sb2.append(Integer.toString(this.port));
        }
        return sb2.toString();
    }
}
