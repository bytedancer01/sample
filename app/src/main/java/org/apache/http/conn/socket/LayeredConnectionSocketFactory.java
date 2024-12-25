package org.apache.http.conn.socket;

import java.net.Socket;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/socket/LayeredConnectionSocketFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/socket/LayeredConnectionSocketFactory.class */
public interface LayeredConnectionSocketFactory extends ConnectionSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i10, HttpContext httpContext);
}
