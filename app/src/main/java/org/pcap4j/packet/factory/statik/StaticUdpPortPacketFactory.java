package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.DnsPacket;
import org.pcap4j.packet.GtpSelector;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.UdpPort;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticUdpPortPacketFactory.class */
public final class StaticUdpPortPacketFactory extends AbstractStaticPacketFactory<UdpPort> {
    private static final StaticUdpPortPacketFactory INSTANCE = new StaticUdpPortPacketFactory();

    private StaticUdpPortPacketFactory() {
        this.instantiaters.put(UdpPort.GTP_C, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.1
            public final StaticUdpPortPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return GtpSelector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(UdpPort.GTP_U, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.2
            public final StaticUdpPortPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return GtpSelector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(UdpPort.GTP_PRIME, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.3
            public final StaticUdpPortPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<GtpSelector> getTargetClass() {
                return GtpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return GtpSelector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(UdpPort.DOMAIN, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory.4
            public final StaticUdpPortPacketFactory this$0;

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

    public static StaticUdpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
