package org.minidns.source;

import java.io.IOException;
import java.net.InetAddress;
import org.minidns.MiniDnsFuture;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/source/DnsDataSource.class */
public interface DnsDataSource {

    /* loaded from: combined.jar:classes3.jar:org/minidns/source/DnsDataSource$OnResponseCallback.class */
    public interface OnResponseCallback {
        void onResponse(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult);
    }

    int getTimeout();

    int getUdpPayloadSize();

    DnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i10);

    MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage dnsMessage, InetAddress inetAddress, int i10, OnResponseCallback onResponseCallback);

    void setTimeout(int i10);
}
