package org.apache.http.conn;

import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ConnectionKeepAliveStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ConnectionKeepAliveStrategy.class */
public interface ConnectionKeepAliveStrategy {
    long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext);
}
