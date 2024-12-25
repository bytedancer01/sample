package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpEntityEnclosingRequest.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpEntityEnclosingRequest.class */
public interface HttpEntityEnclosingRequest extends HttpRequest {
    boolean expectContinue();

    HttpEntity getEntity();

    void setEntity(HttpEntity httpEntity);
}
