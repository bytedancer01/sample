package org.apache.http.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/BasicManagedEntity.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/BasicManagedEntity.class */
public class BasicManagedEntity extends HttpEntityWrapper implements ConnectionReleaseTrigger, EofSensorWatcher {
    public final boolean attemptReuse;
    public ManagedClientConnection managedConn;

    public BasicManagedEntity(HttpEntity httpEntity, ManagedClientConnection managedClientConnection, boolean z10) {
        super(httpEntity);
        Args.notNull(managedClientConnection, "Connection");
        this.managedConn = managedClientConnection;
        this.attemptReuse = z10;
    }

    private void ensureConsumed() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection == null) {
            return;
        }
        try {
            if (this.attemptReuse) {
                EntityUtils.consume(this.wrappedEntity);
                this.managedConn.markReusable();
            } else {
                managedClientConnection.unmarkReusable();
            }
        } finally {
            releaseManagedConnection();
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.abortConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    @Deprecated
    public void consumeContent() {
        ensureConsumed();
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            ManagedClientConnection managedClientConnection = this.managedConn;
            if (managedClientConnection != null) {
                if (this.attemptReuse) {
                    inputStream.close();
                    this.managedConn.markReusable();
                } else {
                    managedClientConnection.unmarkReusable();
                }
            }
            releaseManagedConnection();
            return false;
        } catch (Throwable th2) {
            releaseManagedConnection();
            throw th2;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        ensureConsumed();
    }

    public void releaseManagedConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.releaseConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection == null) {
            return false;
        }
        managedClientConnection.abortConnection();
        return false;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        try {
            ManagedClientConnection managedClientConnection = this.managedConn;
            if (managedClientConnection != null) {
                if (this.attemptReuse) {
                    boolean isOpen = managedClientConnection.isOpen();
                    try {
                        inputStream.close();
                        this.managedConn.markReusable();
                    } catch (SocketException e10) {
                        if (isOpen) {
                            throw e10;
                        }
                    }
                } else {
                    managedClientConnection.unmarkReusable();
                }
            }
            releaseManagedConnection();
            return false;
        } catch (Throwable th2) {
            releaseManagedConnection();
            throw th2;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        ensureConsumed();
    }
}
