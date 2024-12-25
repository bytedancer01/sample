package org.minidns;

import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.CachedDnsQueryResult;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/DnsCache.class */
public abstract class DnsCache {
    public static final int DEFAULT_CACHE_SIZE = 512;

    public final CachedDnsQueryResult get(DnsMessage dnsMessage) {
        return getNormalized(dnsMessage.asNormalizedVersion());
    }

    public abstract CachedDnsQueryResult getNormalized(DnsMessage dnsMessage);

    public abstract void offer(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult, DnsName dnsName);

    public final void put(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
        putNormalized(dnsMessage.asNormalizedVersion(), dnsQueryResult);
    }

    public abstract void putNormalized(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult);
}
