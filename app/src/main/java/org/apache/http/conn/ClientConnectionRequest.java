package org.apache.http.conn;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ClientConnectionRequest.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ClientConnectionRequest.class */
public interface ClientConnectionRequest {
    void abortRequest();

    ManagedClientConnection getConnection(long j10, TimeUnit timeUnit);
}
