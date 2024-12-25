package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticPppDllProtocolPacketFactory.class */
public final class StaticPppDllProtocolPacketFactory extends AbstractStaticPacketFactory<PppDllProtocol> {
    private static final StaticPppDllProtocolPacketFactory INSTANCE = new StaticPppDllProtocolPacketFactory();

    private StaticPppDllProtocolPacketFactory() {
        this.instantiaters.put(PppDllProtocol.IPV4, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticPppDllProtocolPacketFactory.1
            public final StaticPppDllProtocolPacketFactory this$0;

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
        this.instantiaters.put(PppDllProtocol.IPV6, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticPppDllProtocolPacketFactory.2
            public final StaticPppDllProtocolPacketFactory this$0;

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

    public static StaticPppDllProtocolPacketFactory getInstance() {
        return INSTANCE;
    }
}
