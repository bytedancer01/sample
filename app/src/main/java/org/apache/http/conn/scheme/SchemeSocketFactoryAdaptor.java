package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/SchemeSocketFactoryAdaptor.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/SchemeSocketFactoryAdaptor.class */
class SchemeSocketFactoryAdaptor implements SchemeSocketFactory {
    private final SocketFactory factory;

    public SchemeSocketFactoryAdaptor(SocketFactory socketFactory) {
        this.factory = socketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        InetAddress inetAddress;
        int i10;
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i10 = inetSocketAddress2.getPort();
        } else {
            inetAddress = null;
            i10 = 0;
        }
        return this.factory.connectSocket(socket, hostName, port, inetAddress, i10, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return this.factory.createSocket();
    }

    public boolean equals(Object obj) {
        SocketFactory socketFactory;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SchemeSocketFactoryAdaptor) {
            socketFactory = this.factory;
            obj = ((SchemeSocketFactoryAdaptor) obj).factory;
        } else {
            socketFactory = this.factory;
        }
        return socketFactory.equals(obj);
    }

    public SocketFactory getFactory() {
        return this.factory;
    }

    public int hashCode() {
        return this.factory.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public boolean isSecure(Socket socket) {
        return this.factory.isSecure(socket);
    }
}
