package org.apache.http.client;

import org.apache.http.conn.routing.HttpRoute;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/BackoffManager.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/BackoffManager.class */
public interface BackoffManager {
    void backOff(HttpRoute httpRoute);

    void probe(HttpRoute httpRoute);
}
