package org.apache.http.conn.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/socket/PlainConnectionSocketFactory.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/socket/PlainConnectionSocketFactory.class */
public class PlainConnectionSocketFactory implements ConnectionSocketFactory {
    public static final PlainConnectionSocketFactory INSTANCE = new PlainConnectionSocketFactory();

    public static PlainConnectionSocketFactory getSocketFactory() {
        return INSTANCE;
    }

    @Override // org.apache.http.conn.socket.ConnectionSocketFactory
    public Socket connectSocket(int i10, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        if (socket == null) {
            socket = createSocket(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i10);
            return socket;
        } catch (IOException e10) {
            try {
                socket.close();
            } catch (IOException e11) {
            }
            throw e10;
        }
    }

    @Override // org.apache.http.conn.socket.ConnectionSocketFactory
    public Socket createSocket(HttpContext httpContext) {
        return new Socket();
    }
}
