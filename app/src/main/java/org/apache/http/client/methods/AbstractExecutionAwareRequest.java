package org.apache.http.client.methods;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/AbstractExecutionAwareRequest.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/AbstractExecutionAwareRequest.class */
public abstract class AbstractExecutionAwareRequest extends AbstractHttpMessage implements HttpExecutionAware, AbortableHttpRequest, Cloneable, HttpRequest {
    private final AtomicBoolean aborted = new AtomicBoolean(false);
    private final AtomicReference<Cancellable> cancellableRef = new AtomicReference<>(null);

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    public void abort() {
        Cancellable andSet;
        if (!this.aborted.compareAndSet(false, true) || (andSet = this.cancellableRef.getAndSet(null)) == null) {
            return;
        }
        andSet.cancel();
    }

    public Object clone() {
        AbstractExecutionAwareRequest abstractExecutionAwareRequest = (AbstractExecutionAwareRequest) super.clone();
        abstractExecutionAwareRequest.headergroup = (HeaderGroup) CloneUtils.cloneObject(this.headergroup);
        abstractExecutionAwareRequest.params = (HttpParams) CloneUtils.cloneObject(this.params);
        return abstractExecutionAwareRequest;
    }

    public void completed() {
        this.cancellableRef.set(null);
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public boolean isAborted() {
        return this.aborted.get();
    }

    public void reset() {
        Cancellable andSet = this.cancellableRef.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        this.aborted.set(false);
    }

    @Override // org.apache.http.client.methods.HttpExecutionAware
    public void setCancellable(Cancellable cancellable) {
        if (this.aborted.get()) {
            return;
        }
        this.cancellableRef.set(cancellable);
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) {
        setCancellable(new Cancellable(this, clientConnectionRequest) { // from class: org.apache.http.client.methods.AbstractExecutionAwareRequest.1
            public final AbstractExecutionAwareRequest this$0;
            public final ClientConnectionRequest val$connRequest;

            {
                this.this$0 = this;
                this.val$connRequest = clientConnectionRequest;
            }

            @Override // org.apache.http.concurrent.Cancellable
            public boolean cancel() {
                this.val$connRequest.abortRequest();
                return true;
            }
        });
    }

    @Override // org.apache.http.client.methods.AbortableHttpRequest
    @Deprecated
    public void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) {
        setCancellable(new Cancellable(this, connectionReleaseTrigger) { // from class: org.apache.http.client.methods.AbstractExecutionAwareRequest.2
            public final AbstractExecutionAwareRequest this$0;
            public final ConnectionReleaseTrigger val$releaseTrigger;

            {
                this.this$0 = this;
                this.val$releaseTrigger = connectionReleaseTrigger;
            }

            @Override // org.apache.http.concurrent.Cancellable
            public boolean cancel() {
                try {
                    this.val$releaseTrigger.abortConnection();
                    return true;
                } catch (IOException e10) {
                    return false;
                }
            }
        });
    }
}
