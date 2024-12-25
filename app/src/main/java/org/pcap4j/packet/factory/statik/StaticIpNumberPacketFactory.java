package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IpV6ExtDestinationOptionsPacket;
import org.pcap4j.packet.IpV6ExtFragmentPacket;
import org.pcap4j.packet.IpV6ExtHopByHopOptionsPacket;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.IpNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpNumberPacketFactory.class */
public final class StaticIpNumberPacketFactory extends AbstractStaticPacketFactory<IpNumber> {
    private static final StaticIpNumberPacketFactory INSTANCE = new StaticIpNumberPacketFactory();

    private StaticIpNumberPacketFactory() {
        this.instantiaters.put(IpNumber.UDP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.1
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UdpPacket> getTargetClass() {
                return UdpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return UdpPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.ICMPV4, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.2
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4CommonPacket> getTargetClass() {
                return IcmpV4CommonPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4CommonPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.ICMPV6, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.3
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV6CommonPacket> getTargetClass() {
                return IcmpV6CommonPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV6CommonPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.TCP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.4
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<TcpPacket> getTargetClass() {
                return TcpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return TcpPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_HOPOPT, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.5
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtHopByHopOptionsPacket> getTargetClass() {
                return IpV6ExtHopByHopOptionsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6ExtHopByHopOptionsPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_FRAG, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.6
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtFragmentPacket> getTargetClass() {
                return IpV6ExtFragmentPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6ExtFragmentPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_DST_OPTS, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.7
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtDestinationOptionsPacket> getTargetClass() {
                return IpV6ExtDestinationOptionsPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6ExtDestinationOptionsPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_ROUTE, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.8
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtRoutingPacket> getTargetClass() {
                return IpV6ExtRoutingPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6ExtRoutingPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.IPV6_NONXT, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.9
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UnknownPacket> getTargetClass() {
                return UnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return UnknownPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IpNumber.SCTP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory.10
            public final StaticIpNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<SctpPacket> getTargetClass() {
                return SctpPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return SctpPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticIpNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
