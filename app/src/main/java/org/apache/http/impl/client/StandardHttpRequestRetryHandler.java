package org.apache.http.impl.client;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/StandardHttpRequestRetryHandler.class */
public class StandardHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler {
    private final Map<String, Boolean> idempotentMethods;

    public StandardHttpRequestRetryHandler() {
        this(3, false);
    }

    public StandardHttpRequestRetryHandler(int i10, boolean z10) {
        super(i10, z10);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.idempotentMethods = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put(HttpGet.METHOD_NAME, bool);
        concurrentHashMap.put(HttpHead.METHOD_NAME, bool);
        concurrentHashMap.put(HttpPut.METHOD_NAME, bool);
        concurrentHashMap.put(HttpDelete.METHOD_NAME, bool);
        concurrentHashMap.put(HttpOptions.METHOD_NAME, bool);
        concurrentHashMap.put(HttpTrace.METHOD_NAME, bool);
    }

    @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler
    public boolean handleAsIdempotent(HttpRequest httpRequest) {
        Boolean bool = this.idempotentMethods.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ROOT));
        return bool != null && bool.booleanValue();
    }
}
