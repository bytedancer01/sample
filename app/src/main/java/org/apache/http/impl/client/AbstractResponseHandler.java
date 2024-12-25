package org.apache.http.impl.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/AbstractResponseHandler.class */
public abstract class AbstractResponseHandler<T> implements ResponseHandler<T> {
    public abstract T handleEntity(HttpEntity httpEntity);

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        HttpEntity entity = httpResponse.getEntity();
        if (statusLine.getStatusCode() < 300) {
            return entity == null ? null : handleEntity(entity);
        }
        EntityUtils.consume(entity);
        throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
    }
}
