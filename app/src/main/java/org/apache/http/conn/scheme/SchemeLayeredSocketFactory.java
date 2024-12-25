package org.apache.http.conn.scheme;

import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/SchemeLayeredSocketFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/SchemeLayeredSocketFactory.class */
public interface SchemeLayeredSocketFactory extends SchemeSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i10, HttpParams httpParams);
}
