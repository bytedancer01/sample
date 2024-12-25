package org.pcap4j.util;

import org.pcap4j.packet.Packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/IcmpV4Helper.class */
public final class IcmpV4Helper {
    private IcmpV4Helper() {
        throw new AssertionError();
    }

    public static Packet makePacketForInvokingPacketField(Packet packet) {
        if (packet != null && packet.getHeader() != null && packet.getPayload() != null) {
            return IcmpV6Helper.makePacketForInvokingPacketField(packet, packet.getHeader().length() + 8);
        }
        throw new NullPointerException("packet: " + packet + " packet.getHeader(): " + packet.getHeader() + " packet.getPayload(): " + packet.getPayload());
    }
}
