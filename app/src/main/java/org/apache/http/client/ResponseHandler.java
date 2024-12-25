package org.apache.http.client;

import org.apache.http.HttpResponse;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/ResponseHandler.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/ResponseHandler.class */
public interface ResponseHandler<T> {
    T handleResponse(HttpResponse httpResponse);
}
