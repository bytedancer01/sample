package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/AbstractPooledConnAdapter.class */
public abstract class AbstractPooledConnAdapter extends AbstractClientConnAdapter {
    public volatile AbstractPoolEntry poolEntry;

    public AbstractPooledConnAdapter(ClientConnectionManager clientConnectionManager, AbstractPoolEntry abstractPoolEntry) {
        super(clientConnectionManager, abstractPoolEntry.connection);
        this.poolEntry = abstractPoolEntry;
    }

    @Deprecated
    public final void assertAttached() {
        if (this.poolEntry == null) {
            throw new ConnectionShutdownException();
        }
    }

    public void assertValid(AbstractPoolEntry abstractPoolEntry) {
        if (isReleased() || abstractPoolEntry == null) {
            throw new ConnectionShutdownException();
        }
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractPoolEntry poolEntry = getPoolEntry();
        if (poolEntry != null) {
            poolEntry.shutdownEntry();
        }
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        if (wrappedConnection != null) {
            wrappedConnection.close();
        }
    }

    @Override // org.apache.http.impl.conn.AbstractClientConnAdapter
    public void detach() {
        synchronized (this) {
            this.poolEntry = null;
            super.detach();
        }
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Deprecated
    public AbstractPoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public HttpRoute getRoute() {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        return poolEntry.tracker == null ? null : poolEntry.tracker.toRoute();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public Object getState() {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        return poolEntry.getState();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        poolEntry.layerProtocol(httpContext, httpParams);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        poolEntry.open(httpRoute, httpContext, httpParams);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setState(Object obj) {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        poolEntry.setState(obj);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        AbstractPoolEntry poolEntry = getPoolEntry();
        if (poolEntry != null) {
            poolEntry.shutdownEntry();
        }
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        if (wrappedConnection != null) {
            wrappedConnection.shutdown();
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void tunnelProxy(HttpHost httpHost, boolean z10, HttpParams httpParams) {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        poolEntry.tunnelProxy(httpHost, z10, httpParams);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void tunnelTarget(boolean z10, HttpParams httpParams) {
        AbstractPoolEntry poolEntry = getPoolEntry();
        assertValid(poolEntry);
        poolEntry.tunnelTarget(z10, httpParams);
    }
}
