package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/IdleConnectionHandler.class */
public class IdleConnectionHandler {
    private final Log log = LogFactory.getLog(getClass());
    private final Map<HttpConnection, TimeValues> connectionToTimes = new HashMap();

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/IdleConnectionHandler$TimeValues.class */
    public static class TimeValues {
        private final long timeAdded;
        private final long timeExpires;

        public TimeValues(long j10, long j11, TimeUnit timeUnit) {
            this.timeAdded = j10;
            this.timeExpires = j11 > 0 ? j10 + timeUnit.toMillis(j11) : Long.MAX_VALUE;
        }
    }

    public void add(HttpConnection httpConnection, long j10, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Adding connection at: " + currentTimeMillis);
        }
        this.connectionToTimes.put(httpConnection, new TimeValues(currentTimeMillis, j10, timeUnit));
    }

    public void closeExpiredConnections() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Checking for expired connections, now: " + currentTimeMillis);
        }
        for (Map.Entry<HttpConnection, TimeValues> entry : this.connectionToTimes.entrySet()) {
            HttpConnection key = entry.getKey();
            TimeValues value = entry.getValue();
            if (value.timeExpires <= currentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing connection, expired @: " + value.timeExpires);
                }
                try {
                    key.close();
                } catch (IOException e10) {
                    this.log.debug("I/O error closing connection", e10);
                }
            }
        }
    }

    public void closeIdleConnections(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - j10;
        if (this.log.isDebugEnabled()) {
            this.log.debug("Checking for connections, idle timeout: " + currentTimeMillis);
        }
        for (Map.Entry<HttpConnection, TimeValues> entry : this.connectionToTimes.entrySet()) {
            HttpConnection key = entry.getKey();
            long j11 = entry.getValue().timeAdded;
            if (j11 <= currentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing idle connection, connection time: " + j11);
                }
                try {
                    key.close();
                } catch (IOException e10) {
                    this.log.debug("I/O error closing connection", e10);
                }
            }
        }
    }

    public boolean remove(HttpConnection httpConnection) {
        TimeValues remove = this.connectionToTimes.remove(httpConnection);
        boolean z10 = true;
        if (remove == null) {
            this.log.warn("Removing a connection that never existed!");
            return true;
        }
        if (System.currentTimeMillis() > remove.timeExpires) {
            z10 = false;
        }
        return z10;
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }
}
