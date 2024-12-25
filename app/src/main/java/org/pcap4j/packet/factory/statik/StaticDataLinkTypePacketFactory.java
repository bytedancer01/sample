package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.BsdLoopbackPacket;
import org.pcap4j.packet.Dot11Selector;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.HdlcPppPacket;
import org.pcap4j.packet.IpSelector;
import org.pcap4j.packet.LinuxSllPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.PppSelector;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.namednumber.DataLinkType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticDataLinkTypePacketFactory.class */
public final class StaticDataLinkTypePacketFactory extends AbstractStaticPacketFactory<DataLinkType> {
    private static final StaticDataLinkTypePacketFactory INSTANCE = new StaticDataLinkTypePacketFactory();

    private StaticDataLinkTypePacketFactory() {
        this.instantiaters.put(DataLinkType.EN10MB, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.1
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<EthernetPacket> getTargetClass() {
                return EthernetPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return EthernetPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.PPP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.2
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<PppSelector> getTargetClass() {
                return PppSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return PppSelector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.RAW, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.3
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpSelector> getTargetClass() {
                return IpSelector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpSelector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.PPP_SERIAL, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.4
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<HdlcPppPacket> getTargetClass() {
                return HdlcPppPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return HdlcPppPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.IEEE802_11, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.5
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot11Selector> getTargetClass() {
                return Dot11Selector.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return Dot11Selector.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.LINUX_SLL, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.6
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<LinuxSllPacket> getTargetClass() {
                return LinuxSllPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return LinuxSllPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.IEEE802_11_RADIO, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.7
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<RadiotapPacket> getTargetClass() {
                return RadiotapPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(DataLinkType.NULL, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory.8
            public final StaticDataLinkTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<BsdLoopbackPacket> getTargetClass() {
                return BsdLoopbackPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return BsdLoopbackPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticDataLinkTypePacketFactory getInstance() {
        return INSTANCE;
    }
}
