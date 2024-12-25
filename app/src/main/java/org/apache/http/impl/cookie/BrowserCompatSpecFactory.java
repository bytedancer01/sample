package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.params.CookieSpecPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BrowserCompatSpecFactory.class */
public class BrowserCompatSpecFactory implements CookieSpecFactory, CookieSpecProvider {
    private final CookieSpec cookieSpec;
    private final SecurityLevel securityLevel;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BrowserCompatSpecFactory$SecurityLevel.class */
    public enum SecurityLevel {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public BrowserCompatSpecFactory() {
        this(null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpecFactory(String[] strArr) {
        this(null, SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpecFactory(String[] strArr, SecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
        this.cookieSpec = new BrowserCompatSpec(strArr, securityLevel);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        return this.cookieSpec;
    }

    @Override // org.apache.http.cookie.CookieSpecFactory
    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new BrowserCompatSpec(null, this.securityLevel);
        }
        Collection collection = (Collection) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS);
        String[] strArr = null;
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new BrowserCompatSpec(strArr, this.securityLevel);
    }
}
