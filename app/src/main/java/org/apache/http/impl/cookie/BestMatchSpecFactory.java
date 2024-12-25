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
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BestMatchSpecFactory.class */
public class BestMatchSpecFactory implements CookieSpecFactory, CookieSpecProvider {
    private final CookieSpec cookieSpec;

    public BestMatchSpecFactory() {
        this(null, false);
    }

    public BestMatchSpecFactory(String[] strArr, boolean z10) {
        this.cookieSpec = new BestMatchSpec(strArr, z10);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        return this.cookieSpec;
    }

    @Override // org.apache.http.cookie.CookieSpecFactory
    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams == null) {
            return new BestMatchSpec();
        }
        String[] strArr = null;
        Collection collection = (Collection) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS);
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new BestMatchSpec(strArr, httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false));
    }
}
