package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.ProtocolFamily;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticProtocolFamilyPacketFactory.class */
public final class StaticProtocolFamilyPacketFactory extends AbstractStaticPacketFactory<ProtocolFamily> {
    private static final StaticProtocolFamilyPacketFactory INSTANCE = new StaticProtocolFamilyPacketFactory();

    private StaticProtocolFamilyPacketFactory() {
        this.instantiaters.put(ProtocolFamily.PF_INET, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticProtocolFamilyPacketFactory.1
            public final StaticProtocolFamilyPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV4Packet> getTargetClass() {
                return IpV4Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV4Packet.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(ProtocolFamily.PF_INET6, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticProtocolFamilyPacketFactory.2
            public final StaticProtocolFamilyPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6Packet> getTargetClass() {
                return IpV6Packet.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6Packet.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticProtocolFamilyPacketFactory getInstance() {
        return INSTANCE;
    }
}
