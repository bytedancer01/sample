package org.apache.http.impl.p256io;

import org.apache.http.p257io.HttpTransportMetrics;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/HttpTransportMetricsImpl.class */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    @Override // org.apache.http.p257io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void incrementBytesTransferred(long j10) {
        this.bytesTransferred += j10;
    }

    @Override // org.apache.http.p257io.HttpTransportMetrics
    public void reset() {
        this.bytesTransferred = 0L;
    }

    public void setBytesTransferred(long j10) {
        this.bytesTransferred = j10;
    }
}
