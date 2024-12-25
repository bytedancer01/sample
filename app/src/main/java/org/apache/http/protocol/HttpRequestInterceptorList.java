package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpRequestInterceptorList.class */
public interface HttpRequestInterceptorList {
    void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor);

    void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i10);

    void clearRequestInterceptors();

    HttpRequestInterceptor getRequestInterceptor(int i10);

    int getRequestInterceptorCount();

    void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> cls);

    void setInterceptors(List<?> list);
}
