package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/DatagramSocketClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/DatagramSocketClient.class */
public abstract class DatagramSocketClient {
    private static final DatagramSocketFactory __DEFAULT_SOCKET_FACTORY = new DefaultDatagramSocketFactory();
    private Charset charset = Charset.defaultCharset();
    public DatagramSocket _socket_ = null;
    public int _timeout_ = 0;
    public boolean _isOpen_ = false;
    public DatagramSocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;

    public void close() {
        DatagramSocket datagramSocket = this._socket_;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this._socket_ = null;
        this._isOpen_ = false;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getCharsetName() {
        return this.charset.name();
    }

    public int getDefaultTimeout() {
        return this._timeout_;
    }

    public InetAddress getLocalAddress() {
        return this._socket_.getLocalAddress();
    }

    public int getLocalPort() {
        return this._socket_.getLocalPort();
    }

    public int getSoTimeout() {
        return this._socket_.getSoTimeout();
    }

    public boolean isOpen() {
        return this._isOpen_;
    }

    public void open() {
        DatagramSocket createDatagramSocket = this._socketFactory_.createDatagramSocket();
        this._socket_ = createDatagramSocket;
        createDatagramSocket.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void open(int i10) {
        DatagramSocket createDatagramSocket = this._socketFactory_.createDatagramSocket(i10);
        this._socket_ = createDatagramSocket;
        createDatagramSocket.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void open(int i10, InetAddress inetAddress) {
        DatagramSocket createDatagramSocket = this._socketFactory_.createDatagramSocket(i10, inetAddress);
        this._socket_ = createDatagramSocket;
        createDatagramSocket.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public void setDatagramSocketFactory(DatagramSocketFactory datagramSocketFactory) {
        DatagramSocketFactory datagramSocketFactory2 = datagramSocketFactory;
        if (datagramSocketFactory == null) {
            datagramSocketFactory2 = __DEFAULT_SOCKET_FACTORY;
        }
        this._socketFactory_ = datagramSocketFactory2;
    }

    public void setDefaultTimeout(int i10) {
        this._timeout_ = i10;
    }

    public void setSoTimeout(int i10) {
        this._socket_.setSoTimeout(i10);
    }
}
