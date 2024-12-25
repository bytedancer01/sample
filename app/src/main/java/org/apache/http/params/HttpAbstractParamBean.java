package org.apache.http.params;

import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/params/HttpAbstractParamBean.class */
public abstract class HttpAbstractParamBean {
    public final HttpParams params;

    public HttpAbstractParamBean(HttpParams httpParams) {
        this.params = (HttpParams) Args.notNull(httpParams, "HTTP parameters");
    }
}
