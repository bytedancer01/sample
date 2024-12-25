package org.apache.http.conn;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ClientConnectionOperator.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ClientConnectionOperator.class */
public interface ClientConnectionOperator {
    OperatedClientConnection createConnection();

    void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams);

    void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams);
}
