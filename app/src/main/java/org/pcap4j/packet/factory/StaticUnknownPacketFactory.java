package org.pcap4j.packet.factory;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/StaticUnknownPacketFactory.class */
public final class StaticUnknownPacketFactory implements PacketFactory<Packet, NamedNumber<?, ?>> {
    private static final StaticUnknownPacketFactory INSTANCE = new StaticUnknownPacketFactory();

    private StaticUnknownPacketFactory() {
    }

    public static StaticUnknownPacketFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass() {
        return UnknownPacket.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass(NamedNumber<?, ?> namedNumber) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i10, int i11) {
        return UnknownPacket.newPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i10, int i11, NamedNumber<?, ?> namedNumber) {
        return newInstance(bArr, i10, i11);
    }
}
