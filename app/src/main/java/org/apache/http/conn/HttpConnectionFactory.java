package org.apache.http.conn;

import org.apache.http.HttpConnection;
import org.apache.http.config.ConnectionConfig;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/HttpConnectionFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/HttpConnectionFactory.class */
public interface HttpConnectionFactory<T, C extends HttpConnection> {
    C create(T t10, ConnectionConfig connectionConfig);
}
