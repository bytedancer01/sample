package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SnapPacket;
import org.pcap4j.packet.namednumber.LlcNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticLlcNumberPacketFactory.class */
public final class StaticLlcNumberPacketFactory extends AbstractStaticPacketFactory<LlcNumber> {
    private static final StaticLlcNumberPacketFactory INSTANCE = new StaticLlcNumberPacketFactory();

    private StaticLlcNumberPacketFactory() {
        this.instantiaters.put(LlcNumber.ARP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticLlcNumberPacketFactory.1
            public final StaticLlcNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<ArpPacket> getTargetClass() {
                return ArpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return ArpPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(LlcNumber.SNAP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticLlcNumberPacketFactory.2
            public final StaticLlcNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<SnapPacket> getTargetClass() {
                return SnapPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return SnapPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticLlcNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
