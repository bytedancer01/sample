package org.apache.http.conn.params;

import org.apache.http.conn.routing.HttpRoute;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/params/ConnPerRoute.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/params/ConnPerRoute.class */
public interface ConnPerRoute {
    int getMaxForRoute(HttpRoute httpRoute);
}
