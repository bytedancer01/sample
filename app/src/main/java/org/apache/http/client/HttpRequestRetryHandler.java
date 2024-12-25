package org.apache.http.client;

import java.io.IOException;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/HttpRequestRetryHandler.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/HttpRequestRetryHandler.class */
public interface HttpRequestRetryHandler {
    boolean retryRequest(IOException iOException, int i10, HttpContext httpContext);
}
