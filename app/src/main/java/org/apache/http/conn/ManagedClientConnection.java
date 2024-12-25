package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ManagedClientConnection.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ManagedClientConnection.class */
public interface ManagedClientConnection extends HttpClientConnection, HttpRoutedConnection, ManagedHttpClientConnection, ConnectionReleaseTrigger {
    @Override // org.apache.http.conn.HttpRoutedConnection
    HttpRoute getRoute();

    @Override // org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection
    SSLSession getSSLSession();

    Object getState();

    boolean isMarkedReusable();

    @Override // org.apache.http.conn.HttpRoutedConnection
    boolean isSecure();

    void layerProtocol(HttpContext httpContext, HttpParams httpParams);

    void markReusable();

    void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams);

    void setIdleDuration(long j10, TimeUnit timeUnit);

    void setState(Object obj);

    void tunnelProxy(HttpHost httpHost, boolean z10, HttpParams httpParams);

    void tunnelTarget(boolean z10, HttpParams httpParams);

    void unmarkReusable();
}
