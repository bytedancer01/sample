package org.apache.http.conn;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ConnectionReleaseTrigger.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ConnectionReleaseTrigger.class */
public interface ConnectionReleaseTrigger {
    void abortConnection();

    void releaseConnection();
}
