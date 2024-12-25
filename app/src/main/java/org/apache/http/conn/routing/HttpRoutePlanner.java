package org.apache.http.conn.routing;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/routing/HttpRoutePlanner.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/HttpRoutePlanner.class */
public interface HttpRoutePlanner {
    HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext);
}
