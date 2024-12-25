package org.apache.http.conn;

import javax.net.ssl.SSLSession;
import org.apache.http.HttpInetConnection;
import org.apache.http.conn.routing.HttpRoute;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/HttpRoutedConnection.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/HttpRoutedConnection.class */
public interface HttpRoutedConnection extends HttpInetConnection {
    HttpRoute getRoute();

    SSLSession getSSLSession();

    boolean isSecure();
}
