package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/HttpClientConnectionManager.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/HttpClientConnectionManager.class */
public interface HttpClientConnectionManager {
    void closeExpiredConnections();

    void closeIdleConnections(long j10, TimeUnit timeUnit);

    void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i10, HttpContext httpContext);

    void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j10, TimeUnit timeUnit);

    ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj);

    void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext);

    void shutdown();

    void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext);
}
