package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.Packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/PacketInstantiater.class */
interface PacketInstantiater {
    Class<? extends Packet> getTargetClass();

    Packet newInstance(byte[] bArr, int i10, int i11);
}
