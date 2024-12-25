package org.apache.http.conn.ssl;

import java.net.Socket;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/PrivateKeyStrategy.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/PrivateKeyStrategy.class */
public interface PrivateKeyStrategy {
    String chooseAlias(Map<String, PrivateKeyDetails> map, Socket socket);
}
