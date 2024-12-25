package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/HttpConnPool.class */
class HttpConnPool extends AbstractConnPool<HttpRoute, OperatedClientConnection, HttpPoolEntry> {
    private static final AtomicLong COUNTER = new AtomicLong();
    private final Log log;
    private final long timeToLive;
    private final TimeUnit tunit;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/HttpConnPool$InternalConnFactory.class */
    public static class InternalConnFactory implements ConnFactory<HttpRoute, OperatedClientConnection> {
        private final ClientConnectionOperator connOperator;

        public InternalConnFactory(ClientConnectionOperator clientConnectionOperator) {
            this.connOperator = clientConnectionOperator;
        }

        @Override // org.apache.http.pool.ConnFactory
        public OperatedClientConnection create(HttpRoute httpRoute) {
            return this.connOperator.createConnection();
        }
    }

    public HttpConnPool(Log log, ClientConnectionOperator clientConnectionOperator, int i10, int i11, long j10, TimeUnit timeUnit) {
        super(new InternalConnFactory(clientConnectionOperator), i10, i11);
        this.log = log;
        this.timeToLive = j10;
        this.tunit = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public HttpPoolEntry createEntry(HttpRoute httpRoute, OperatedClientConnection operatedClientConnection) {
        return new HttpPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, operatedClientConnection, this.timeToLive, this.tunit);
    }
}
