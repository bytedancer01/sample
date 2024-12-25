package org.minidns.cache;

import org.minidns.dnsmessage.Question;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Data;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/cache/FullLruCache.class */
public class FullLruCache extends ExtendedLruCache {
    public FullLruCache() {
        this(512);
    }

    public FullLruCache(int i10) {
        super(i10);
    }

    public FullLruCache(int i10, long j10) {
        super(i10, j10);
    }

    @Override // org.minidns.cache.ExtendedLruCache
    public boolean shouldGather(Record<? extends Data> record, Question question, DnsName dnsName) {
        return true;
    }
}
