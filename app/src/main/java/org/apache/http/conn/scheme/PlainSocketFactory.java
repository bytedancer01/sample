package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/PlainSocketFactory.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/PlainSocketFactory.class */
public class PlainSocketFactory implements SocketFactory, SchemeSocketFactory {
    private final HostNameResolver nameResolver;

    public PlainSocketFactory() {
        this.nameResolver = null;
    }

    @Deprecated
    public PlainSocketFactory(HostNameResolver hostNameResolver) {
        this.nameResolver = hostNameResolver;
    }

    public static PlainSocketFactory getSocketFactory() {
        return new PlainSocketFactory();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    @Deprecated
    public Socket connectSocket(Socket socket, String str, int i10, InetAddress inetAddress, int i11, HttpParams httpParams) {
        InetSocketAddress inetSocketAddress;
        if (inetAddress != null || i11 > 0) {
            if (i11 <= 0) {
                i11 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i11);
        } else {
            inetSocketAddress = null;
        }
        HostNameResolver hostNameResolver = this.nameResolver;
        return connectSocket(socket, new InetSocketAddress(hostNameResolver != null ? hostNameResolver.resolve(str) : InetAddress.getByName(str), i10), inetSocketAddress, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        Args.notNull(inetSocketAddress, "Remote address");
        Args.notNull(httpParams, "HTTP parameters");
        Socket socket2 = socket;
        if (socket == null) {
            socket2 = createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket2.setReuseAddress(HttpConnectionParams.getSoReuseaddr(httpParams));
            socket2.bind(inetSocketAddress2);
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        try {
            socket2.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
            socket2.connect(inetSocketAddress, connectionTimeout);
            return socket2;
        } catch (SocketTimeoutException e10) {
            throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        return false;
    }
}
