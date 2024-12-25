package org.apache.http.client.methods;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/AbortableHttpRequest.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/AbortableHttpRequest.class */
public interface AbortableHttpRequest {
    void abort();

    void setConnectionRequest(ClientConnectionRequest clientConnectionRequest);

    void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger);
}
