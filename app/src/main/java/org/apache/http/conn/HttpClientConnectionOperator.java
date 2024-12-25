package org.apache.http.conn;

import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/HttpClientConnectionOperator.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/HttpClientConnectionOperator.class */
public interface HttpClientConnectionOperator {
    void connect(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, InetSocketAddress inetSocketAddress, int i10, SocketConfig socketConfig, HttpContext httpContext);

    void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext);
}
