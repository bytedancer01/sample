package org.apache.http.conn.scheme;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/SchemeSocketFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/SchemeSocketFactory.class */
public interface SchemeSocketFactory {
    Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams);

    Socket createSocket(HttpParams httpParams);

    boolean isSecure(Socket socket);
}
