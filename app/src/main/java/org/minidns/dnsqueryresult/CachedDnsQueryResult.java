package org.minidns.dnsqueryresult;

import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsqueryresult/CachedDnsQueryResult.class */
public abstract class CachedDnsQueryResult extends DnsQueryResult {
    public final DnsQueryResult cachedDnsQueryResult;

    public CachedDnsQueryResult(DnsMessage dnsMessage, DnsMessage dnsMessage2, DnsQueryResult dnsQueryResult) {
        super(DnsQueryResult.QueryMethod.cachedSynthesized, dnsMessage, dnsMessage2);
        this.cachedDnsQueryResult = dnsQueryResult;
    }

    public CachedDnsQueryResult(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
        super(DnsQueryResult.QueryMethod.cachedDirect, dnsMessage, dnsQueryResult.response);
        this.cachedDnsQueryResult = dnsQueryResult;
    }
}
