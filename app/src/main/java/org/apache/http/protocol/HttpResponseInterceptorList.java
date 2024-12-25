package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpResponseInterceptorList.class */
public interface HttpResponseInterceptorList {
    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor);

    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i10);

    void clearResponseInterceptors();

    HttpResponseInterceptor getResponseInterceptor(int i10);

    int getResponseInterceptorCount();

    void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls);

    void setInterceptors(List<?> list);
}
