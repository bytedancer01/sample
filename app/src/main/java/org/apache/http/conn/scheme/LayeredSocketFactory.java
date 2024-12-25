package org.apache.http.conn.scheme;

import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/LayeredSocketFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/LayeredSocketFactory.class */
public interface LayeredSocketFactory extends SocketFactory {
    Socket createSocket(Socket socket, String str, int i10, boolean z10);
}
