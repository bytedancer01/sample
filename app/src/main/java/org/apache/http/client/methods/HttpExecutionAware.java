package org.apache.http.client.methods;

import org.apache.http.concurrent.Cancellable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpExecutionAware.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpExecutionAware.class */
public interface HttpExecutionAware {
    boolean isAborted();

    void setCancellable(Cancellable cancellable);
}
