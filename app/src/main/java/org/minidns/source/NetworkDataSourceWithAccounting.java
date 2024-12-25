package org.minidns.source;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.minidns.AbstractDnsClient;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.StandardDnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/source/NetworkDataSourceWithAccounting.class */
public class NetworkDataSourceWithAccounting extends NetworkDataSource {
    private final AtomicInteger successfulQueries = new AtomicInteger();
    private final AtomicInteger responseSize = new AtomicInteger();
    private final AtomicInteger failedQueries = new AtomicInteger();
    private final AtomicInteger successfulUdpQueries = new AtomicInteger();
    private final AtomicInteger udpResponseSize = new AtomicInteger();
    private final AtomicInteger failedUdpQueries = new AtomicInteger();
    private final AtomicInteger successfulTcpQueries = new AtomicInteger();
    private final AtomicInteger tcpResponseSize = new AtomicInteger();
    private final AtomicInteger failedTcpQueries = new AtomicInteger();

    /* loaded from: combined.jar:classes3.jar:org/minidns/source/NetworkDataSourceWithAccounting$Stats.class */
    public static final class Stats {
        public final int averageResponseSize;
        public final int averageTcpResponseSize;
        public final int averageUdpResponseSize;
        public final int failedQueries;
        public final int failedTcpQueries;
        public final int failedUdpQueries;
        public final int responseSize;
        private String stringCache;
        public final int successfulQueries;
        public final int successfulTcpQueries;
        public final int successfulUdpQueries;
        public final int tcpResponseSize;
        public final int udpResponseSize;

        private Stats(NetworkDataSourceWithAccounting networkDataSourceWithAccounting) {
            int i10 = networkDataSourceWithAccounting.successfulQueries.get();
            this.successfulQueries = i10;
            int i11 = networkDataSourceWithAccounting.responseSize.get();
            this.responseSize = i11;
            this.failedQueries = networkDataSourceWithAccounting.failedQueries.get();
            int i12 = networkDataSourceWithAccounting.successfulUdpQueries.get();
            this.successfulUdpQueries = i12;
            int i13 = networkDataSourceWithAccounting.udpResponseSize.get();
            this.udpResponseSize = i13;
            this.failedUdpQueries = networkDataSourceWithAccounting.failedUdpQueries.get();
            int i14 = networkDataSourceWithAccounting.successfulTcpQueries.get();
            this.successfulTcpQueries = i14;
            int i15 = networkDataSourceWithAccounting.tcpResponseSize.get();
            this.tcpResponseSize = i15;
            this.failedTcpQueries = networkDataSourceWithAccounting.failedTcpQueries.get();
            this.averageResponseSize = i10 > 0 ? i11 / i10 : 0;
            this.averageUdpResponseSize = i12 > 0 ? i13 / i12 : 0;
            this.averageTcpResponseSize = i14 > 0 ? i15 / i14 : 0;
        }

        private static String toString(int i10) {
            return String.format(Locale.US, "%,09d", Integer.valueOf(i10));
        }

        public String toString() {
            String str = this.stringCache;
            if (str != null) {
                return str;
            }
            String str2 = "Stats\t# Successful\t# Failed\tResp. Size\tAvg. Resp. Size\nTotal\t" + toString(this.successfulQueries) + '\t' + toString(this.failedQueries) + '\t' + toString(this.responseSize) + '\t' + toString(this.averageResponseSize) + "\nUDP\t" + toString(this.successfulUdpQueries) + '\t' + toString(this.failedUdpQueries) + '\t' + toString(this.udpResponseSize) + '\t' + toString(this.averageUdpResponseSize) + "\nTCP\t" + toString(this.successfulTcpQueries) + '\t' + toString(this.failedTcpQueries) + '\t' + toString(this.tcpResponseSize) + '\t' + toString(this.averageTcpResponseSize) + '\n';
            this.stringCache = str2;
            return str2;
        }
    }

    public static NetworkDataSourceWithAccounting from(AbstractDnsClient abstractDnsClient) {
        DnsDataSource dataSource = abstractDnsClient.getDataSource();
        if (dataSource instanceof NetworkDataSourceWithAccounting) {
            return (NetworkDataSourceWithAccounting) dataSource;
        }
        return null;
    }

    public Stats getStats() {
        return new Stats();
    }

    @Override // org.minidns.source.NetworkDataSource, org.minidns.source.AbstractDnsDataSource, org.minidns.source.DnsDataSource
    public StandardDnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        try {
            StandardDnsQueryResult query = super.query(dnsMessage, inetAddress, i10);
            this.successfulQueries.incrementAndGet();
            this.responseSize.addAndGet(query.response.toArray().length);
            return query;
        } catch (IOException e10) {
            this.failedQueries.incrementAndGet();
            throw e10;
        }
    }

    @Override // org.minidns.source.NetworkDataSource
    public DnsMessage queryTcp(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        try {
            DnsMessage queryTcp = super.queryTcp(dnsMessage, inetAddress, i10);
            this.successfulTcpQueries.incrementAndGet();
            this.tcpResponseSize.addAndGet(queryTcp.toArray().length);
            return queryTcp;
        } catch (IOException e10) {
            this.failedTcpQueries.incrementAndGet();
            throw e10;
        }
    }

    @Override // org.minidns.source.NetworkDataSource
    public DnsMessage queryUdp(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        try {
            DnsMessage queryUdp = super.queryUdp(dnsMessage, inetAddress, i10);
            this.successfulUdpQueries.incrementAndGet();
            this.udpResponseSize.addAndGet(queryUdp.toArray().length);
            return queryUdp;
        } catch (IOException e10) {
            this.failedUdpQueries.incrementAndGet();
            throw e10;
        }
    }
}
