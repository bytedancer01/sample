package org.pcap4j.util;

import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.UdpPacket;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/Packets.class */
public final class Packets {
    private Packets() {
        throw new AssertionError();
    }

    public static boolean containsEthernetPacket(Packet packet) {
        return packet.contains(EthernetPacket.class);
    }

    public static boolean containsIpPacket(Packet packet) {
        return packet.contains(IpPacket.class);
    }

    public static boolean containsIpV4Packet(Packet packet) {
        return packet.contains(IpV4Packet.class);
    }

    public static boolean containsIpV6Packet(Packet packet) {
        return packet.contains(IpV6Packet.class);
    }

    public static boolean containsTcpPacket(Packet packet) {
        return packet.contains(TcpPacket.class);
    }

    public static boolean containsUdpPacket(Packet packet) {
        return packet.contains(UdpPacket.class);
    }
}
