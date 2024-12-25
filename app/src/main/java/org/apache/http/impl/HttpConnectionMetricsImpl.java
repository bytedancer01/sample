package org.apache.http.impl;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.p257io.HttpTransportMetrics;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/HttpConnectionMetricsImpl.class */
public class HttpConnectionMetricsImpl implements HttpConnectionMetrics {
    public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
    public static final String REQUEST_COUNT = "http.request-count";
    public static final String RESPONSE_COUNT = "http.response-count";
    public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
    private final HttpTransportMetrics inTransportMetric;
    private Map<String, Object> metricsCache;
    private final HttpTransportMetrics outTransportMetric;
    private long requestCount = 0;
    private long responseCount = 0;

    public HttpConnectionMetricsImpl(HttpTransportMetrics httpTransportMetrics, HttpTransportMetrics httpTransportMetrics2) {
        this.inTransportMetric = httpTransportMetrics;
        this.outTransportMetric = httpTransportMetrics2;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public Object getMetric(String str) {
        HttpTransportMetrics httpTransportMetrics;
        long j10;
        Map<String, Object> map = this.metricsCache;
        Object obj = map != null ? map.get(str) : null;
        Object obj2 = obj;
        if (obj == null) {
            if (REQUEST_COUNT.equals(str)) {
                j10 = this.requestCount;
            } else {
                if (!RESPONSE_COUNT.equals(str)) {
                    if (RECEIVED_BYTES_COUNT.equals(str)) {
                        httpTransportMetrics = this.inTransportMetric;
                        if (httpTransportMetrics == null) {
                            return null;
                        }
                    } else {
                        obj2 = obj;
                        if (SENT_BYTES_COUNT.equals(str)) {
                            httpTransportMetrics = this.outTransportMetric;
                            if (httpTransportMetrics == null) {
                                return null;
                            }
                        }
                    }
                    return Long.valueOf(httpTransportMetrics.getBytesTransferred());
                }
                j10 = this.responseCount;
            }
            obj2 = Long.valueOf(j10);
        }
        return obj2;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getReceivedBytesCount() {
        HttpTransportMetrics httpTransportMetrics = this.inTransportMetric;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getRequestCount() {
        return this.requestCount;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getResponseCount() {
        return this.responseCount;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public long getSentBytesCount() {
        HttpTransportMetrics httpTransportMetrics = this.outTransportMetric;
        if (httpTransportMetrics != null) {
            return httpTransportMetrics.getBytesTransferred();
        }
        return -1L;
    }

    public void incrementRequestCount() {
        this.requestCount++;
    }

    public void incrementResponseCount() {
        this.responseCount++;
    }

    @Override // org.apache.http.HttpConnectionMetrics
    public void reset() {
        HttpTransportMetrics httpTransportMetrics = this.outTransportMetric;
        if (httpTransportMetrics != null) {
            httpTransportMetrics.reset();
        }
        HttpTransportMetrics httpTransportMetrics2 = this.inTransportMetric;
        if (httpTransportMetrics2 != null) {
            httpTransportMetrics2.reset();
        }
        this.requestCount = 0L;
        this.responseCount = 0L;
        this.metricsCache = null;
    }

    public void setMetric(String str, Object obj) {
        if (this.metricsCache == null) {
            this.metricsCache = new HashMap();
        }
        this.metricsCache.put(str, obj);
    }
}
