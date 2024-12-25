package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/DefaultHttpRequestRetryHandler.class */
public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    public static final DefaultHttpRequestRetryHandler INSTANCE = new DefaultHttpRequestRetryHandler();
    private final Set<Class<? extends IOException>> nonRetriableClasses;
    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }

    public DefaultHttpRequestRetryHandler(int i10, boolean z10) {
        this(i10, z10, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    public DefaultHttpRequestRetryHandler(int i10, boolean z10, Collection<Class<? extends IOException>> collection) {
        this.retryCount = i10;
        this.requestSentRetryEnabled = z10;
        this.nonRetriableClasses = new HashSet();
        Iterator<Class<? extends IOException>> it = collection.iterator();
        while (it.hasNext()) {
            this.nonRetriableClasses.add(it.next());
        }
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public boolean handleAsIdempotent(HttpRequest httpRequest) {
        return !(httpRequest instanceof HttpEntityEnclosingRequest);
    }

    public boolean isRequestSentRetryEnabled() {
        return this.requestSentRetryEnabled;
    }

    @Deprecated
    public boolean requestIsAborted(HttpRequest httpRequest) {
        HttpRequest httpRequest2 = httpRequest;
        if (httpRequest instanceof RequestWrapper) {
            httpRequest2 = ((RequestWrapper) httpRequest).getOriginal();
        }
        return (httpRequest2 instanceof HttpUriRequest) && ((HttpUriRequest) httpRequest2).isAborted();
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i10, HttpContext httpContext) {
        Args.notNull(iOException, "Exception parameter");
        Args.notNull(httpContext, "HTTP context");
        if (i10 > this.retryCount || this.nonRetriableClasses.contains(iOException.getClass())) {
            return false;
        }
        Iterator<Class<? extends IOException>> it = this.nonRetriableClasses.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(iOException)) {
                return false;
            }
        }
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        HttpRequest request = adapt.getRequest();
        if (requestIsAborted(request)) {
            return false;
        }
        return handleAsIdempotent(request) || !adapt.isRequestSent() || this.requestSentRetryEnabled;
    }
}
