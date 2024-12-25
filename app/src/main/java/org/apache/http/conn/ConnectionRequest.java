package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.concurrent.Cancellable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ConnectionRequest.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ConnectionRequest.class */
public interface ConnectionRequest extends Cancellable {
    HttpClientConnection get(long j10, TimeUnit timeUnit);
}
