package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.DnsPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.TcpPort;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticTcpPortPacketFactory.class */
public final class StaticTcpPortPacketFactory extends AbstractStaticPacketFactory<TcpPort> {
    private static final StaticTcpPortPacketFactory INSTANCE = new StaticTcpPortPacketFactory();

    private StaticTcpPortPacketFactory() {
        this.instantiaters.put(TcpPort.DOMAIN, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpPortPacketFactory.1
            public final StaticTcpPortPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<DnsPacket> getTargetClass() {
                return DnsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return DnsPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticTcpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
