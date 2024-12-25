package org.apache.http.conn;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ManagedHttpClientConnection.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ManagedHttpClientConnection.class */
public interface ManagedHttpClientConnection extends HttpClientConnection, HttpInetConnection {
    void bind(Socket socket);

    String getId();

    SSLSession getSSLSession();

    Socket getSocket();
}
