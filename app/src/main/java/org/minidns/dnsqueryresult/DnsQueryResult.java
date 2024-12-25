package org.minidns.dnsqueryresult;

import org.minidns.dnsmessage.DnsMessage;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsqueryresult/DnsQueryResult.class */
public abstract class DnsQueryResult {
    public static final boolean $assertionsDisabled = false;
    public final DnsMessage query;
    public final QueryMethod queryMethod;
    public final DnsMessage response;

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsqueryresult/DnsQueryResult$QueryMethod.class */
    public enum QueryMethod {
        udp,
        tcp,
        asyncUdp,
        asyncTcp,
        cachedDirect,
        cachedSynthesized,
        testWorld
    }

    public DnsQueryResult(QueryMethod queryMethod, DnsMessage dnsMessage, DnsMessage dnsMessage2) {
        this.queryMethod = queryMethod;
        this.query = dnsMessage;
        this.response = dnsMessage2;
    }

    public String toString() {
        return this.response.toString();
    }

    public boolean wasSuccessful() {
        return this.response.responseCode == DnsMessage.RESPONSE_CODE.NO_ERROR;
    }
}
