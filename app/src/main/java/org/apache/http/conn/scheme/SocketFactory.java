package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/SocketFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/SocketFactory.class */
public interface SocketFactory {
    Socket connectSocket(Socket socket, String str, int i10, InetAddress inetAddress, int i11, HttpParams httpParams);

    Socket createSocket();

    boolean isSecure(Socket socket);
}
