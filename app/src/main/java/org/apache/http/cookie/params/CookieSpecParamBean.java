package org.apache.http.cookie.params;

import java.util.Collection;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/cookie/params/CookieSpecParamBean.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/params/CookieSpecParamBean.class */
public class CookieSpecParamBean extends HttpAbstractParamBean {
    public CookieSpecParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setDatePatterns(Collection<String> collection) {
        this.params.setParameter(CookieSpecPNames.DATE_PATTERNS, collection);
    }

    public void setSingleHeader(boolean z10) {
        this.params.setBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, z10);
    }
}
