package org.apache.http.auth.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/params/AuthParamBean.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/params/AuthParamBean.class */
public class AuthParamBean extends HttpAbstractParamBean {
    public AuthParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setCredentialCharset(String str) {
        AuthParams.setCredentialCharset(this.params, str);
    }
}
