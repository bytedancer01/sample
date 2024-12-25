package org.apache.http.conn;

import java.io.InputStream;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/BasicEofSensorWatcher.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/BasicEofSensorWatcher.class */
public class BasicEofSensorWatcher implements EofSensorWatcher {
    public final boolean attemptReuse;
    public final ManagedClientConnection managedConn;

    public BasicEofSensorWatcher(ManagedClientConnection managedClientConnection, boolean z10) {
        Args.notNull(managedClientConnection, "Connection");
        this.managedConn = managedClientConnection;
        this.attemptReuse = z10;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (this.attemptReuse) {
                inputStream.close();
                this.managedConn.markReusable();
            }
            this.managedConn.releaseConnection();
            return false;
        } catch (Throwable th2) {
            this.managedConn.releaseConnection();
            throw th2;
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        this.managedConn.abortConnection();
        return false;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        try {
            if (this.attemptReuse) {
                inputStream.close();
                this.managedConn.markReusable();
            }
            this.managedConn.releaseConnection();
            return false;
        } catch (Throwable th2) {
            this.managedConn.releaseConnection();
            throw th2;
        }
    }
}
