package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ClientConnectionManager.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ClientConnectionManager.class */
public interface ClientConnectionManager {
    void closeExpiredConnections();

    void closeIdleConnections(long j10, TimeUnit timeUnit);

    SchemeRegistry getSchemeRegistry();

    void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit);

    ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj);

    void shutdown();
}
