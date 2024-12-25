package org.apache.http.conn;

import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/EofSensorWatcher.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/EofSensorWatcher.class */
public interface EofSensorWatcher {
    boolean eofDetected(InputStream inputStream);

    boolean streamAbort(InputStream inputStream);

    boolean streamClosed(InputStream inputStream);
}
