package org.apache.http.impl.execchain;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpClientConnectionManager;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/ConnectionHolder.class */
class ConnectionHolder implements ConnectionReleaseTrigger, Cancellable, Closeable {
    private final Log log;
    private final HttpClientConnection managedConn;
    private final HttpClientConnectionManager manager;
    private final AtomicBoolean released = new AtomicBoolean(false);
    private volatile boolean reusable;
    private volatile Object state;
    private volatile TimeUnit tunit;
    private volatile long validDuration;

    public ConnectionHolder(Log log, HttpClientConnectionManager httpClientConnectionManager, HttpClientConnection httpClientConnection) {
        this.log = log;
        this.manager = httpClientConnectionManager;
        this.managedConn = httpClientConnection;
    }

    private void releaseConnection(boolean z10) {
        HttpClientConnectionManager httpClientConnectionManager;
        HttpClientConnection httpClientConnection;
        Object obj;
        long j10;
        TimeUnit timeUnit;
        if (this.released.compareAndSet(false, true)) {
            synchronized (this.managedConn) {
                if (z10) {
                    httpClientConnectionManager = this.manager;
                    httpClientConnection = this.managedConn;
                    obj = this.state;
                    j10 = this.validDuration;
                    timeUnit = this.tunit;
                } else {
                    try {
                        try {
                            this.managedConn.close();
                            this.log.debug("Connection discarded");
                            this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                        } catch (IOException e10) {
                            if (this.log.isDebugEnabled()) {
                                this.log.debug(e10.getMessage(), e10);
                            }
                            httpClientConnectionManager = this.manager;
                            httpClientConnection = this.managedConn;
                            obj = null;
                            j10 = 0;
                            timeUnit = TimeUnit.MILLISECONDS;
                        }
                    } catch (Throwable th2) {
                        this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                        throw th2;
                    }
                }
                httpClientConnectionManager.releaseConnection(httpClientConnection, obj, j10, timeUnit);
            }
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        if (this.released.compareAndSet(false, true)) {
            synchronized (this.managedConn) {
                try {
                    try {
                        this.managedConn.shutdown();
                        this.log.debug("Connection discarded");
                        this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                    } finally {
                        this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                    }
                } catch (IOException e10) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug(e10.getMessage(), e10);
                    }
                }
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        boolean z10 = this.released.get();
        this.log.debug("Cancelling request execution");
        abortConnection();
        return !z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseConnection(false);
    }

    public boolean isReleased() {
        return this.released.get();
    }

    public boolean isReusable() {
        return this.reusable;
    }

    public void markNonReusable() {
        this.reusable = false;
    }

    public void markReusable() {
        this.reusable = true;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        releaseConnection(this.reusable);
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public void setValidFor(long j10, TimeUnit timeUnit) {
        synchronized (this.managedConn) {
            this.validDuration = j10;
            this.tunit = timeUnit;
        }
    }
}
