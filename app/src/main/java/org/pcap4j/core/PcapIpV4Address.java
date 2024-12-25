package org.pcap4j.core;

import java.net.Inet4Address;
import org.pcap4j.core.NativeMappings;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapIpV4Address.class */
public final class PcapIpV4Address extends AbstractPcapAddress {
    private PcapIpV4Address(NativeMappings.pcap_addr pcap_addrVar, short s10, String str) {
        super(pcap_addrVar, s10, str);
    }

    public static PcapIpV4Address newInstance(NativeMappings.pcap_addr pcap_addrVar, short s10, String str) {
        return new PcapIpV4Address(pcap_addrVar, s10, str);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getAddress() {
        return (Inet4Address) super.getAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getBroadcastAddress() {
        return (Inet4Address) super.getBroadcastAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getDestinationAddress() {
        return (Inet4Address) super.getDestinationAddress();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress, org.pcap4j.core.PcapAddress
    public Inet4Address getNetmask() {
        return (Inet4Address) super.getNetmask();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public Inet4Address ntoInetAddress(NativeMappings.sockaddr sockaddrVar) {
        return Inets.ntoInetAddress(new NativeMappings.sockaddr_in(sockaddrVar.getPointer()).sin_addr);
    }

    @Override // org.pcap4j.core.AbstractPcapAddress
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
