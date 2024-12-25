package org.pcap4j.core;

import java.net.Inet6Address;
import org.pcap4j.core.NativeMappings;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapIpV6Address.class */
public final class PcapIpV6Address extends AbstractPcapAddress {
    private PcapIpV6Address(NativeMappings.pcap_addr pcap_addrVar, short s10, String str) {
        super(pcap_addrVar, s10, str);
    }

    public static PcapIpV6Address newInstance(NativeMappings.pcap_addr pcap_addrVar, short s10, String str) {
        return new PcapIpV6Address(pcap_addrVar, s10, str);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet6Address getAddress() {
        return (Inet6Address) super.getAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet6Address getBroadcastAddress() {
        return (Inet6Address) super.getBroadcastAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet6Address getDestinationAddress() {
        return (Inet6Address) super.getDestinationAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet6Address getNetmask() {
        return (Inet6Address) super.getNetmask();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public Inet6Address ntoInetAddress(NativeMappings.sockaddr sockaddrVar) {
        return Inets.ntoInetAddress(new NativeMappings.sockaddr_in6(sockaddrVar.getPointer()).sin6_addr);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
