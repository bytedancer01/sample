package org.apache.commons.net.ftp;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPSSocketFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPSSocketFactory.class */
public class FTPSSocketFactory extends SocketFactory {
    private final SSLContext context;

    public FTPSSocketFactory(SSLContext sSLContext) {
        this.context = sSLContext;
    }

    @Deprecated
    public ServerSocket createServerSocket(int i10) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10));
    }

    @Deprecated
    public ServerSocket createServerSocket(int i10, int i11) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10, i11));
    }

    @Deprecated
    public ServerSocket createServerSocket(int i10, int i11, InetAddress inetAddress) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10, i11, inetAddress));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return this.context.getSocketFactory().createSocket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return this.context.getSocketFactory().createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return this.context.getSocketFactory().createSocket(str, i10, inetAddress, i11);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return this.context.getSocketFactory().createSocket(inetAddress, i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return this.context.getSocketFactory().createSocket(inetAddress, i10, inetAddress2, i11);
    }

    @Deprecated
    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }
}
