package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.Dot1qVlanTagPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.EtherType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticEtherTypePacketFactory.class */
public final class StaticEtherTypePacketFactory extends AbstractStaticPacketFactory<EtherType> {
    private static final StaticEtherTypePacketFactory INSTANCE = new StaticEtherTypePacketFactory();

    private StaticEtherTypePacketFactory() {
        this.instantiaters.put(EtherType.IPV4, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.1
            public final StaticEtherTypePacketFactory this$0;

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
        this.instantiaters.put(EtherType.ARP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.2
            public final StaticEtherTypePacketFactory this$0;

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
        this.instantiaters.put(EtherType.DOT1Q_VLAN_TAGGED_FRAMES, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.3
            public final StaticEtherTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot1qVlanTagPacket> getTargetClass() {
                return Dot1qVlanTagPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return Dot1qVlanTagPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(EtherType.IPV6, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory.4
            public final StaticEtherTypePacketFactory this$0;

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

    public static StaticEtherTypePacketFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.statik.AbstractStaticPacketFactory, org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i10, int i11, EtherType etherType) {
        if (bArr == null || etherType == null) {
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("rawData: ");
            sb2.append(bArr);
            sb2.append(" number: ");
            sb2.append(etherType);
            throw new NullPointerException(sb2.toString());
        }
        PacketInstantiater packetInstantiater = this.instantiaters.get(etherType);
        if (packetInstantiater != null) {
            try {
                return packetInstantiater.newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalPacket.newPacket(bArr, i10, i11);
            }
        }
        if ((etherType.value().shortValue() & 65535) <= 1500) {
            try {
                return LlcPacket.newPacket(bArr, i10, i11);
            } catch (IllegalRawDataException e11) {
                IllegalPacket.newPacket(bArr, i10, i11);
            }
        }
        return newInstance(bArr, i10, i11);
    }
}
