package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/PoolEntryRequest.class */
public interface PoolEntryRequest {
    void abortRequest();

    BasicPoolEntry getPoolEntry(long j10, TimeUnit timeUnit);
}
