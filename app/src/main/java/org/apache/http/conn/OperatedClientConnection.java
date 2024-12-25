package org.apache.http.conn;

import java.net.Socket;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/OperatedClientConnection.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/OperatedClientConnection.class */
public interface OperatedClientConnection extends HttpClientConnection, HttpInetConnection {
    Socket getSocket();

    HttpHost getTargetHost();

    boolean isSecure();

    void openCompleted(boolean z10, HttpParams httpParams);

    void opening(Socket socket, HttpHost httpHost);

    void update(Socket socket, HttpHost httpHost, boolean z10, HttpParams httpParams);
}
