package org.apache.http;

import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpInetConnection.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpInetConnection.class */
public interface HttpInetConnection extends HttpConnection {
    InetAddress getLocalAddress();

    int getLocalPort();

    InetAddress getRemoteAddress();

    int getRemotePort();
}
