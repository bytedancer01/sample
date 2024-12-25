package org.apache.commons.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/SocketClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/SocketClient.class */
public abstract class SocketClient {
    private static final int DEFAULT_CONNECT_TIMEOUT = 0;
    public static final String NETASCII_EOL = "\r\n";
    private ProtocolCommandSupport __commandSupport;
    private Proxy connProxy;
    private static final SocketFactory __DEFAULT_SOCKET_FACTORY = SocketFactory.getDefault();
    private static final ServerSocketFactory __DEFAULT_SERVER_SOCKET_FACTORY = ServerSocketFactory.getDefault();
    public int connectTimeout = 0;
    private int receiveBufferSize = -1;
    private int sendBufferSize = -1;
    private Charset charset = Charset.defaultCharset();
    public Socket _socket_ = null;
    public String _hostname_ = null;
    public InputStream _input_ = null;
    public OutputStream _output_ = null;
    public int _timeout_ = 0;
    public int _defaultPort_ = 0;
    public SocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;
    public ServerSocketFactory _serverSocketFactory_ = __DEFAULT_SERVER_SOCKET_FACTORY;

    private void _connect(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket createSocket = this._socketFactory_.createSocket();
        this._socket_ = createSocket;
        int i12 = this.receiveBufferSize;
        if (i12 != -1) {
            createSocket.setReceiveBufferSize(i12);
        }
        int i13 = this.sendBufferSize;
        if (i13 != -1) {
            this._socket_.setSendBufferSize(i13);
        }
        if (inetAddress2 != null) {
            this._socket_.bind(new InetSocketAddress(inetAddress2, i11));
        }
        this._socket_.connect(new InetSocketAddress(inetAddress, i10), this.connectTimeout);
        _connectAction_();
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    private void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e10) {
            }
        }
    }

    public void _connectAction_() {
        this._socket_.setSoTimeout(this._timeout_);
        this._input_ = this._socket_.getInputStream();
        this._output_ = this._socket_.getOutputStream();
    }

    public void addProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().addProtocolCommandListener(protocolCommandListener);
    }

    public void connect(String str) {
        connect(str, this._defaultPort_);
    }

    public void connect(String str, int i10) {
        this._hostname_ = str;
        _connect(InetAddress.getByName(str), i10, null, -1);
    }

    public void connect(String str, int i10, InetAddress inetAddress, int i11) {
        this._hostname_ = str;
        _connect(InetAddress.getByName(str), i10, inetAddress, i11);
    }

    public void connect(InetAddress inetAddress) {
        this._hostname_ = null;
        connect(inetAddress, this._defaultPort_);
    }

    public void connect(InetAddress inetAddress, int i10) {
        this._hostname_ = null;
        _connect(inetAddress, i10, null, -1);
    }

    public void connect(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        this._hostname_ = null;
        _connect(inetAddress, i10, inetAddress2, i11);
    }

    public void createCommandSupport() {
        this.__commandSupport = new ProtocolCommandSupport(this);
    }

    public void disconnect() {
        closeQuietly(this._socket_);
        closeQuietly(this._input_);
        closeQuietly(this._output_);
        this._socket_ = null;
        this._hostname_ = null;
        this._input_ = null;
        this._output_ = null;
    }

    public void fireCommandSent(String str, String str2) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireCommandSent(str, str2);
        }
    }

    public void fireReplyReceived(int i10, String str) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireReplyReceived(i10, str);
        }
    }

    public Charset getCharset() {
        return this.charset;
    }

    @Deprecated
    public String getCharsetName() {
        return this.charset.name();
    }

    public ProtocolCommandSupport getCommandSupport() {
        return this.__commandSupport;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getDefaultPort() {
        return this._defaultPort_;
    }

    public int getDefaultTimeout() {
        return this._timeout_;
    }

    public boolean getKeepAlive() {
        return this._socket_.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this._socket_.getLocalAddress();
    }

    public int getLocalPort() {
        return this._socket_.getLocalPort();
    }

    public Proxy getProxy() {
        return this.connProxy;
    }

    public int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public InetAddress getRemoteAddress() {
        return this._socket_.getInetAddress();
    }

    public int getRemotePort() {
        return this._socket_.getPort();
    }

    public int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public ServerSocketFactory getServerSocketFactory() {
        return this._serverSocketFactory_;
    }

    public int getSoLinger() {
        return this._socket_.getSoLinger();
    }

    public int getSoTimeout() {
        return this._socket_.getSoTimeout();
    }

    public boolean getTcpNoDelay() {
        return this._socket_.getTcpNoDelay();
    }

    public boolean isAvailable() {
        if (!isConnected()) {
            return false;
        }
        try {
            if (this._socket_.getInetAddress() == null || this._socket_.getPort() == 0 || this._socket_.getRemoteSocketAddress() == null || this._socket_.isClosed() || this._socket_.isInputShutdown() || this._socket_.isOutputShutdown()) {
                return false;
            }
            this._socket_.getInputStream();
            this._socket_.getOutputStream();
            return true;
        } catch (IOException e10) {
            return false;
        }
    }

    public boolean isConnected() {
        Socket socket = this._socket_;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    public void removeProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().removeProtocolCommandListener(protocolCommandListener);
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public void setConnectTimeout(int i10) {
        this.connectTimeout = i10;
    }

    public void setDefaultPort(int i10) {
        this._defaultPort_ = i10;
    }

    public void setDefaultTimeout(int i10) {
        this._timeout_ = i10;
    }

    public void setKeepAlive(boolean z10) {
        this._socket_.setKeepAlive(z10);
    }

    public void setProxy(Proxy proxy) {
        setSocketFactory(new DefaultSocketFactory(proxy));
        this.connProxy = proxy;
    }

    public void setReceiveBufferSize(int i10) {
        this.receiveBufferSize = i10;
    }

    public void setSendBufferSize(int i10) {
        this.sendBufferSize = i10;
    }

    public void setServerSocketFactory(ServerSocketFactory serverSocketFactory) {
        ServerSocketFactory serverSocketFactory2 = serverSocketFactory;
        if (serverSocketFactory == null) {
            serverSocketFactory2 = __DEFAULT_SERVER_SOCKET_FACTORY;
        }
        this._serverSocketFactory_ = serverSocketFactory2;
    }

    public void setSoLinger(boolean z10, int i10) {
        this._socket_.setSoLinger(z10, i10);
    }

    public void setSoTimeout(int i10) {
        this._socket_.setSoTimeout(i10);
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        SocketFactory socketFactory2 = socketFactory;
        if (socketFactory == null) {
            socketFactory2 = __DEFAULT_SOCKET_FACTORY;
        }
        this._socketFactory_ = socketFactory2;
        this.connProxy = null;
    }

    public void setTcpNoDelay(boolean z10) {
        this._socket_.setTcpNoDelay(z10);
    }

    public boolean verifyRemote(Socket socket) {
        return socket.getInetAddress().equals(getRemoteAddress());
    }
}
