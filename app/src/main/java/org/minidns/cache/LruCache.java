package org.minidns.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import org.minidns.DnsCache;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.CachedDnsQueryResult;
import org.minidns.dnsqueryresult.DirectCachedDnsQueryResult;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/cache/LruCache.class */
public class LruCache extends DnsCache {
    public LinkedHashMap<DnsMessage, CachedDnsQueryResult> backend;
    public int capacity;
    public long expireCount;
    public long hitCount;
    public long maxTTL;
    public long missCount;

    public LruCache() {
        this(512);
    }

    public LruCache(int i10) {
        this(i10, Long.MAX_VALUE);
    }

    public LruCache(int i10, long j10) {
        this.missCount = 0L;
        this.expireCount = 0L;
        this.hitCount = 0L;
        this.capacity = i10;
        this.maxTTL = j10;
        this.backend = new LinkedHashMap<DnsMessage, CachedDnsQueryResult>(this, Math.min(((i10 + 3) / 4) + i10 + 2, 11), 0.75f, true, i10) { // from class: org.minidns.cache.LruCache.1
            public final LruCache this$0;
            public final int val$capacity;

            {
                this.this$0 = this;
                this.val$capacity = i10;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<DnsMessage, CachedDnsQueryResult> entry) {
                return size() > this.val$capacity;
            }
        };
    }

    public void clear() {
        synchronized (this) {
            this.backend.clear();
            this.missCount = 0L;
            this.hitCount = 0L;
            this.expireCount = 0L;
        }
    }

    public long getExpireCount() {
        return this.expireCount;
    }

    public long getHitCount() {
        return this.hitCount;
    }

    public long getMissCount() {
        return this.missCount;
    }

    @Override // org.minidns.DnsCache
    public CachedDnsQueryResult getNormalized(DnsMessage dnsMessage) {
        synchronized (this) {
            CachedDnsQueryResult cachedDnsQueryResult = this.backend.get(dnsMessage);
            if (cachedDnsQueryResult == null) {
                this.missCount++;
                return null;
            }
            DnsMessage dnsMessage2 = cachedDnsQueryResult.response;
            if (dnsMessage2.receiveTimestamp + (Math.min(dnsMessage2.getAnswersMinTtl(), this.maxTTL) * 1000) >= System.currentTimeMillis()) {
                this.hitCount++;
                return cachedDnsQueryResult;
            }
            this.missCount++;
            this.expireCount++;
            this.backend.remove(dnsMessage);
            return null;
        }
    }

    @Override // org.minidns.DnsCache
    public void offer(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult, DnsName dnsName) {
    }

    @Override // org.minidns.DnsCache
    public void putNormalized(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
        synchronized (this) {
            if (dnsQueryResult.response.receiveTimestamp <= 0) {
                return;
            }
            this.backend.put(dnsMessage, new DirectCachedDnsQueryResult(dnsMessage, dnsQueryResult));
        }
    }

    public String toString() {
        return "LRUCache{usage=" + this.backend.size() + "/" + this.capacity + ", hits=" + this.hitCount + ", misses=" + this.missCount + ", expires=" + this.expireCount + "}";
    }
}
