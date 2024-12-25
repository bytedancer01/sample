package org.apache.http.conn.socket;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/socket/ConnectionSocketFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/socket/ConnectionSocketFactory.class */
public interface ConnectionSocketFactory {
    Socket connectSocket(int i10, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext);

    Socket createSocket(HttpContext httpContext);
}
