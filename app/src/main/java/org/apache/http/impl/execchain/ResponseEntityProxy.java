package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorInputStream;
import org.apache.http.conn.EofSensorWatcher;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/ResponseEntityProxy.class */
class ResponseEntityProxy extends HttpEntityWrapper implements EofSensorWatcher {
    private final ConnectionHolder connHolder;

    public ResponseEntityProxy(HttpEntity httpEntity, ConnectionHolder connectionHolder) {
        super(httpEntity);
        this.connHolder = connectionHolder;
    }

    private void abortConnection() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            connectionHolder.abortConnection();
        }
    }

    private void cleanup() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            connectionHolder.close();
        }
    }

    public static void enchance(HttpResponse httpResponse, ConnectionHolder connectionHolder) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null || !entity.isStreaming() || connectionHolder == null) {
            return;
        }
        httpResponse.setEntity(new ResponseEntityProxy(entity, connectionHolder));
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    @Deprecated
    public void consumeContent() {
        releaseConnection();
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    abortConnection();
                    throw e10;
                } catch (RuntimeException e11) {
                    abortConnection();
                    throw e11;
                }
            }
            releaseConnection();
            cleanup();
            return false;
        } catch (Throwable th2) {
            cleanup();
            throw th2;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    public void releaseConnection() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            connectionHolder.releaseConnection();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        cleanup();
        return false;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        try {
            try {
                ConnectionHolder connectionHolder = this.connHolder;
                boolean z10 = (connectionHolder == null || connectionHolder.isReleased()) ? false : true;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (SocketException e10) {
                        if (z10) {
                            throw e10;
                        }
                    }
                }
                releaseConnection();
                cleanup();
                return false;
            } catch (IOException e11) {
                abortConnection();
                throw e11;
            } catch (RuntimeException e12) {
                abortConnection();
                throw e12;
            }
        } catch (Throwable th2) {
            cleanup();
            throw th2;
        }
    }

    public String toString() {
        return "ResponseEntityProxy{" + this.wrappedEntity + '}';
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                try {
                    try {
                        this.wrappedEntity.writeTo(outputStream);
                    } catch (RuntimeException e10) {
                        abortConnection();
                        throw e10;
                    }
                } catch (IOException e11) {
                    abortConnection();
                    throw e11;
                }
            }
            releaseConnection();
            cleanup();
        } catch (Throwable th2) {
            cleanup();
            throw th2;
        }
    }
}
