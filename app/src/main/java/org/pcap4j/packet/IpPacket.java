package org.pcap4j.packet;

import java.net.InetAddress;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpPacket.class */
public interface IpPacket extends Packet {

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpPacket$IpHeader.class */
    public interface IpHeader extends Packet.Header {
        InetAddress getDstAddr();

        IpNumber getProtocol();

        InetAddress getSrcAddr();

        IpVersion getVersion();
    }

    @Override // org.pcap4j.packet.Packet
    IpHeader getHeader();
}
