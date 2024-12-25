package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Port;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TransportPacket.class */
public interface TransportPacket extends Packet {

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TransportPacket$TransportHeader.class */
    public interface TransportHeader extends Packet.Header {
        Port getDstPort();

        Port getSrcPort();
    }

    @Override // org.pcap4j.packet.Packet
    TransportHeader getHeader();
}
