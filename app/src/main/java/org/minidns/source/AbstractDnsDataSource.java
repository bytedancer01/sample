package org.minidns.source;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTP;
import org.minidns.DnsCache;
import org.minidns.MiniDnsFuture;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;
import org.minidns.source.DnsDataSource;

/* loaded from: combined.jar:classes3.jar:org/minidns/source/AbstractDnsDataSource.class */
public abstract class AbstractDnsDataSource implements DnsDataSource {
    private DnsCache cache;
    public int udpPayloadSize = 1024;
    public int timeout = TFTP.DEFAULT_TIMEOUT;
    private QueryMode queryMode = QueryMode.dontCare;

    /* loaded from: combined.jar:classes3.jar:org/minidns/source/AbstractDnsDataSource$QueryMode.class */
    public enum QueryMode {
        dontCare,
        udpTcp,
        tcp
    }

    public final void cacheResult(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
        DnsCache dnsCache = this.cache;
        if (dnsCache == null) {
            return;
        }
        dnsCache.put(dnsMessage, dnsQueryResult);
    }

    public QueryMode getQueryMode() {
        return this.queryMode;
    }

    @Override // org.minidns.source.DnsDataSource
    public int getTimeout() {
        return this.timeout;
    }

    @Override // org.minidns.source.DnsDataSource
    public int getUdpPayloadSize() {
        return this.udpPayloadSize;
    }

    @Override // org.minidns.source.DnsDataSource
    public abstract DnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i10);

    @Override // org.minidns.source.DnsDataSource
    public MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage dnsMessage, InetAddress inetAddress, int i10, DnsDataSource.OnResponseCallback onResponseCallback) {
        MiniDnsFuture.InternalMiniDnsFuture internalMiniDnsFuture = new MiniDnsFuture.InternalMiniDnsFuture();
        try {
            internalMiniDnsFuture.setResult(query(dnsMessage, inetAddress, i10));
            return internalMiniDnsFuture;
        } catch (IOException e10) {
            internalMiniDnsFuture.setException(e10);
            return internalMiniDnsFuture;
        }
    }

    public void setQueryMode(QueryMode queryMode) {
        if (queryMode == null) {
            throw new IllegalArgumentException();
        }
        this.queryMode = queryMode;
    }

    @Override // org.minidns.source.DnsDataSource
    public void setTimeout(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Timeout must be greater than zero");
        }
        this.timeout = i10;
    }

    public void setUdpPayloadSize(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("UDP payload size must be greater than zero");
        }
        this.udpPayloadSize = i10;
    }
}
