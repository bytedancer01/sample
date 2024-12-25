package org.apache.commons.net.ftp;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPSServerSocketFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPSServerSocketFactory.class */
public class FTPSServerSocketFactory extends ServerSocketFactory {
    private final SSLContext context;

    public FTPSServerSocketFactory(SSLContext sSLContext) {
        this.context = sSLContext;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() {
        return init(this.context.getServerSocketFactory().createServerSocket());
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i10) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i10, int i11) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10, i11));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i10, int i11, InetAddress inetAddress) {
        return init(this.context.getServerSocketFactory().createServerSocket(i10, i11, inetAddress));
    }

    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }
}
