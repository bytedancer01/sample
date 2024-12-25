package org.apache.http.conn.scheme;

import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/LayeredSchemeSocketFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/LayeredSchemeSocketFactory.class */
public interface LayeredSchemeSocketFactory extends SchemeSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i10, boolean z10);
}
