package org.minidns.dnsqueryresult;

import java.net.InetAddress;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsqueryresult/StandardDnsQueryResult.class */
public class StandardDnsQueryResult extends DnsQueryResult {
    public final int port;
    public final InetAddress serverAddress;

    public StandardDnsQueryResult(InetAddress inetAddress, int i10, DnsQueryResult.QueryMethod queryMethod, DnsMessage dnsMessage, DnsMessage dnsMessage2) {
        super(queryMethod, dnsMessage, dnsMessage2);
        this.serverAddress = inetAddress;
        this.port = i10;
    }
}
