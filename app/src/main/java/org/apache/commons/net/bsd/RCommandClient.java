package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import org.apache.commons.net.p255io.SocketInputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/bsd/RCommandClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/bsd/RCommandClient.class */
public class RCommandClient extends RExecClient {
    public static final int DEFAULT_PORT = 514;
    public static final int MAX_CLIENT_PORT = 1023;
    public static final int MIN_CLIENT_PORT = 512;

    public RCommandClient() {
        setDefaultPort(DEFAULT_PORT);
    }

    @Override // org.apache.commons.net.bsd.RExecClient
    public InputStream _createErrorStream() {
        ServerSocket serverSocket;
        int i10 = 1023;
        while (true) {
            if (i10 < 512) {
                serverSocket = null;
                break;
            }
            try {
                serverSocket = this._serverSocketFactory_.createServerSocket(i10, 1, getLocalAddress());
                break;
            } catch (SocketException e10) {
                i10--;
            }
        }
        if (serverSocket == null) {
            throw new BindException("All ports in use.");
        }
        this._output_.write(Integer.toString(serverSocket.getLocalPort()).getBytes("UTF-8"));
        this._output_.write(0);
        this._output_.flush();
        Socket accept = serverSocket.accept();
        serverSocket.close();
        if (!isRemoteVerificationEnabled() || verifyRemote(accept)) {
            return new SocketInputStream(accept, accept.getInputStream());
        }
        accept.close();
        throw new IOException("Security violation: unexpected connection attempt by " + accept.getInetAddress().getHostAddress());
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i10) {
        connect(InetAddress.getByName(str), i10, InetAddress.getLocalHost());
    }

    public void connect(String str, int i10, InetAddress inetAddress) {
        connect(InetAddress.getByName(str), i10, inetAddress);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i10, InetAddress inetAddress, int i11) {
        if (i11 >= 512 && i11 <= 1023) {
            super.connect(str, i10, inetAddress, i11);
            return;
        }
        throw new IllegalArgumentException("Invalid port number " + i11);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i10) {
        connect(inetAddress, i10, InetAddress.getLocalHost());
    }

    public void connect(InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        int i11 = 1023;
        while (i11 >= 512) {
            try {
                this._socket_ = this._socketFactory_.createSocket(inetAddress, i10, inetAddress2, i11);
                break;
            } catch (BindException | SocketException e10) {
                i11--;
            }
        }
        if (i11 < 512) {
            throw new BindException("All ports in use or insufficient permssion.");
        }
        _connectAction_();
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        if (i11 >= 512 && i11 <= 1023) {
            super.connect(inetAddress, i10, inetAddress2, i11);
            return;
        }
        throw new IllegalArgumentException("Invalid port number " + i11);
    }

    public void rcommand(String str, String str2, String str3) {
        rcommand(str, str2, str3, false);
    }

    public void rcommand(String str, String str2, String str3, boolean z10) {
        rexec(str, str2, str3, z10);
    }
}
