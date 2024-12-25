package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p256io.ChunkedInputStream;
import org.apache.http.impl.p256io.ChunkedOutputStream;
import org.apache.http.impl.p256io.ContentLengthInputStream;
import org.apache.http.impl.p256io.ContentLengthOutputStream;
import org.apache.http.impl.p256io.EmptyInputStream;
import org.apache.http.impl.p256io.HttpTransportMetricsImpl;
import org.apache.http.impl.p256io.IdentityInputStream;
import org.apache.http.impl.p256io.IdentityOutputStream;
import org.apache.http.impl.p256io.SessionInputBufferImpl;
import org.apache.http.impl.p256io.SessionOutputBufferImpl;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.NetUtils;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/BHttpConnectionBase.class */
public class BHttpConnectionBase implements HttpConnection, HttpInetConnection {
    private final HttpConnectionMetricsImpl connMetrics;
    private final SessionInputBufferImpl inbuffer;
    private final ContentLengthStrategy incomingContentStrategy;
    private final MessageConstraints messageConstraints;
    private final SessionOutputBufferImpl outbuffer;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final AtomicReference<Socket> socketHolder;

    public BHttpConnectionBase(int i10, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        Args.positive(i10, "Buffer size");
        HttpTransportMetricsImpl httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        this.inbuffer = new SessionInputBufferImpl(httpTransportMetricsImpl, i10, -1, messageConstraints != null ? messageConstraints : MessageConstraints.DEFAULT, charsetDecoder);
        this.outbuffer = new SessionOutputBufferImpl(httpTransportMetricsImpl2, i10, i11, charsetEncoder);
        this.messageConstraints = messageConstraints;
        this.connMetrics = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        this.incomingContentStrategy = contentLengthStrategy == null ? LaxContentLengthStrategy.INSTANCE : contentLengthStrategy;
        this.outgoingContentStrategy = contentLengthStrategy2 == null ? StrictContentLengthStrategy.INSTANCE : contentLengthStrategy2;
        this.socketHolder = new AtomicReference<>();
    }

    private int fillInputBuffer(int i10) {
        Socket socket = this.socketHolder.get();
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i10);
            return this.inbuffer.fillBuffer();
        } finally {
            socket.setSoTimeout(soTimeout);
        }
    }

    public boolean awaitInput(int i10) {
        if (this.inbuffer.hasBufferedData()) {
            return true;
        }
        fillInputBuffer(i10);
        return this.inbuffer.hasBufferedData();
    }

    public void bind(Socket socket) {
        Args.notNull(socket, "Socket");
        this.socketHolder.set(socket);
        this.inbuffer.bind(null);
        this.outbuffer.bind(null);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket andSet = this.socketHolder.getAndSet(null);
        if (andSet != null) {
            try {
                this.inbuffer.clear();
                this.outbuffer.flush();
                try {
                    try {
                        andSet.shutdownOutput();
                    } catch (IOException | UnsupportedOperationException e10) {
                    }
                } catch (IOException e11) {
                }
                andSet.shutdownInput();
            } finally {
                andSet.close();
            }
        }
    }

    public InputStream createInputStream(long j10, SessionInputBuffer sessionInputBuffer) {
        return j10 == -2 ? new ChunkedInputStream(sessionInputBuffer, this.messageConstraints) : j10 == -1 ? new IdentityInputStream(sessionInputBuffer) : j10 == 0 ? EmptyInputStream.INSTANCE : new ContentLengthInputStream(sessionInputBuffer, j10);
    }

    public OutputStream createOutputStream(long j10, SessionOutputBuffer sessionOutputBuffer) {
        return j10 == -2 ? new ChunkedOutputStream(2048, sessionOutputBuffer) : j10 == -1 ? new IdentityOutputStream(sessionOutputBuffer) : new ContentLengthOutputStream(sessionOutputBuffer, j10);
    }

    public void doFlush() {
        this.outbuffer.flush();
    }

    public void ensureOpen() {
        Socket socket = this.socketHolder.get();
        if (socket == null) {
            throw new ConnectionClosedException("Connection is closed");
        }
        if (!this.inbuffer.isBound()) {
            this.inbuffer.bind(getSocketInputStream(socket));
        }
        if (this.outbuffer.isBound()) {
            return;
        }
        this.outbuffer.bind(getSocketOutputStream(socket));
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        Socket socket = this.socketHolder.get();
        return socket != null ? socket.getLocalAddress() : null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        Socket socket = this.socketHolder.get();
        return socket != null ? socket.getLocalPort() : -1;
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.connMetrics;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        Socket socket = this.socketHolder.get();
        return socket != null ? socket.getInetAddress() : null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        Socket socket = this.socketHolder.get();
        return socket != null ? socket.getPort() : -1;
    }

    public SessionInputBuffer getSessionInputBuffer() {
        return this.inbuffer;
    }

    public SessionOutputBuffer getSessionOutputBuffer() {
        return this.outbuffer;
    }

    public Socket getSocket() {
        return this.socketHolder.get();
    }

    public InputStream getSocketInputStream(Socket socket) {
        return socket.getInputStream();
    }

    public OutputStream getSocketOutputStream(Socket socket) {
        return socket.getOutputStream();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        Socket socket = this.socketHolder.get();
        if (socket == null) {
            return -1;
        }
        try {
            return socket.getSoTimeout();
        } catch (SocketException e10) {
            return -1;
        }
    }

    public void incrementRequestCount() {
        this.connMetrics.incrementRequestCount();
    }

    public void incrementResponseCount() {
        this.connMetrics.incrementResponseCount();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.socketHolder.get() != null;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        boolean z10 = true;
        if (!isOpen()) {
            return true;
        }
        try {
            if (fillInputBuffer(1) >= 0) {
                z10 = false;
            }
        } catch (SocketTimeoutException e10) {
            return false;
        } catch (IOException e11) {
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.HttpEntity prepareInput(org.apache.http.HttpMessage r6) {
        /*
            r5 = this;
            org.apache.http.entity.BasicHttpEntity r0 = new org.apache.http.entity.BasicHttpEntity
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r5
            org.apache.http.entity.ContentLengthStrategy r0 = r0.incomingContentStrategy
            r1 = r6
            long r0 = r0.determineLength(r1)
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = r5
            org.apache.http.impl.io.SessionInputBufferImpl r2 = r2.inbuffer
            java.io.InputStream r0 = r0.createInputStream(r1, r2)
            r10 = r0
            r0 = r7
            r1 = -2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3f
            r0 = r9
            r1 = 1
            r0.setChunked(r1)
        L2d:
            r0 = r9
            r1 = -1
            r0.setContentLength(r1)
        L35:
            r0 = r9
            r1 = r10
            r0.setContent(r1)
            goto L59
        L3f:
            r0 = r9
            r1 = 0
            r0.setChunked(r1)
            r0 = r7
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            goto L2d
        L50:
            r0 = r9
            r1 = r7
            r0.setContentLength(r1)
            goto L35
        L59:
            r0 = r6
            java.lang.String r1 = "Content-Type"
            org.apache.http.Header r0 = r0.getFirstHeader(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L70
            r0 = r9
            r1 = r10
            r0.setContentType(r1)
        L70:
            r0 = r6
            java.lang.String r1 = "Content-Encoding"
            org.apache.http.Header r0 = r0.getFirstHeader(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L84
            r0 = r9
            r1 = r6
            r0.setContentEncoding(r1)
        L84:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.BHttpConnectionBase.prepareInput(org.apache.http.HttpMessage):org.apache.http.HttpEntity");
    }

    public OutputStream prepareOutput(HttpMessage httpMessage) {
        return createOutputStream(this.outgoingContentStrategy.determineLength(httpMessage), this.outbuffer);
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i10) {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(i10);
            } catch (SocketException e10) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        Socket andSet = this.socketHolder.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.setSoLinger(true, 0);
            } catch (IOException e10) {
            } catch (Throwable th2) {
                andSet.close();
                throw th2;
            }
            andSet.close();
        }
    }

    public String toString() {
        Socket socket = this.socketHolder.get();
        if (socket == null) {
            return "[Not bound]";
        }
        StringBuilder sb2 = new StringBuilder();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = socket.getLocalSocketAddress();
        if (remoteSocketAddress != null && localSocketAddress != null) {
            NetUtils.formatAddress(sb2, localSocketAddress);
            sb2.append("<->");
            NetUtils.formatAddress(sb2, remoteSocketAddress);
        }
        return sb2.toString();
    }
}
