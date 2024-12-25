package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpUriRequest.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpUriRequest.class */
public interface HttpUriRequest extends HttpRequest {
    void abort();

    String getMethod();

    URI getURI();

    boolean isAborted();
}
