package org.apache.http;

import java.net.Socket;
import org.apache.http.HttpConnection;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpConnectionFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpConnectionFactory.class */
public interface HttpConnectionFactory<T extends HttpConnection> {
    T createConnection(Socket socket);
}
