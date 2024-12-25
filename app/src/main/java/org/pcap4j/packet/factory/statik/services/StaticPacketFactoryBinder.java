package org.pcap4j.packet.factory.statik.services;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.factory.PacketFactoryBinder;
import org.pcap4j.packet.factory.StaticUnknownPacketFactory;
import org.pcap4j.packet.factory.statik.StaticDataLinkTypePacketFactory;
import org.pcap4j.packet.factory.statik.StaticDnsRDataFactory;
import org.pcap4j.packet.factory.statik.StaticDot11FrameTypePacketFactory;
import org.pcap4j.packet.factory.statik.StaticEtherTypePacketFactory;
import org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory;
import org.pcap4j.packet.factory.statik.StaticIcmpV6TypePacketFactory;
import org.pcap4j.packet.factory.statik.StaticIpNumberPacketFactory;
import org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory;
import org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory;
import org.pcap4j.packet.factory.statik.StaticIpV4TosFactory;
import org.pcap4j.packet.factory.statik.StaticIpV6FlowLabelFactory;
import org.pcap4j.packet.factory.statik.StaticIpV6NeighborDiscoveryOptionFactory;
import org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory;
import org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory;
import org.pcap4j.packet.factory.statik.StaticIpV6TrafficClassFactory;
import org.pcap4j.packet.factory.statik.StaticLlcNumberPacketFactory;
import org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory;
import org.pcap4j.packet.factory.statik.StaticPppDllProtocolPacketFactory;
import org.pcap4j.packet.factory.statik.StaticProtocolFamilyPacketFactory;
import org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory;
import org.pcap4j.packet.factory.statik.StaticSctpChunkFactory;
import org.pcap4j.packet.factory.statik.StaticSctpPortPacketFactory;
import org.pcap4j.packet.factory.statik.StaticTcpOptionFactory;
import org.pcap4j.packet.factory.statik.StaticTcpPortPacketFactory;
import org.pcap4j.packet.factory.statik.StaticUdpPortPacketFactory;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.packet.namednumber.Dot11FrameType;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.packet.namednumber.IcmpV6Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.LlcNumber;
import org.pcap4j.packet.namednumber.NamedNumber;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.packet.namednumber.ProtocolFamily;
import org.pcap4j.packet.namednumber.SctpPort;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/services/StaticPacketFactoryBinder.class */
final class StaticPacketFactoryBinder implements PacketFactoryBinder {
    private static final PacketFactoryBinder INSTANCE = new StaticPacketFactoryBinder();
    private final Map<Class<? extends NamedNumber<?, ?>>, PacketFactory<?, ?>> packetFactories;
    private final Map<Class<?>, PacketFactory<?, ?>> packetpPieceFactories;

    private StaticPacketFactoryBinder() {
        HashMap hashMap = new HashMap();
        this.packetFactories = hashMap;
        HashMap hashMap2 = new HashMap();
        this.packetpPieceFactories = hashMap2;
        hashMap.put(DataLinkType.class, StaticDataLinkTypePacketFactory.getInstance());
        hashMap.put(EtherType.class, StaticEtherTypePacketFactory.getInstance());
        hashMap.put(LlcNumber.class, StaticLlcNumberPacketFactory.getInstance());
        hashMap.put(IcmpV4Type.class, StaticIcmpV4TypePacketFactory.getInstance());
        hashMap.put(IcmpV6Type.class, StaticIcmpV6TypePacketFactory.getInstance());
        hashMap.put(IpNumber.class, StaticIpNumberPacketFactory.getInstance());
        hashMap.put(TcpPort.class, StaticTcpPortPacketFactory.getInstance());
        hashMap.put(UdpPort.class, StaticUdpPortPacketFactory.getInstance());
        hashMap.put(SctpPort.class, StaticSctpPortPacketFactory.getInstance());
        hashMap.put(NotApplicable.class, StaticNotApplicablePacketFactory.getInstance());
        hashMap.put(PppDllProtocol.class, StaticPppDllProtocolPacketFactory.getInstance());
        hashMap.put(ProtocolFamily.class, StaticProtocolFamilyPacketFactory.getInstance());
        hashMap.put(Dot11FrameType.class, StaticDot11FrameTypePacketFactory.getInstance());
        hashMap2.put(IpV4Packet.IpV4Option.class, StaticIpV4OptionFactory.getInstance());
        hashMap2.put(IpV4InternetTimestampOption.class, StaticIpV4InternetTimestampOptionDataFactory.getInstance());
        hashMap2.put(TcpPacket.TcpOption.class, StaticTcpOptionFactory.getInstance());
        hashMap2.put(IpV6ExtOptionsPacket.IpV6Option.class, StaticIpV6OptionFactory.getInstance());
        hashMap2.put(IpV6ExtRoutingPacket.IpV6RoutingData.class, StaticIpV6RoutingDataFactory.getInstance());
        hashMap2.put(IcmpV6CommonPacket.IpV6NeighborDiscoveryOption.class, StaticIpV6NeighborDiscoveryOptionFactory.getInstance());
        hashMap2.put(IpV4Packet.IpV4Tos.class, StaticIpV4TosFactory.getInstance());
        hashMap2.put(IpV6Packet.IpV6TrafficClass.class, StaticIpV6TrafficClassFactory.getInstance());
        hashMap2.put(IpV6Packet.IpV6FlowLabel.class, StaticIpV6FlowLabelFactory.getInstance());
        hashMap2.put(RadiotapPacket.RadiotapData.class, StaticRadiotapDataFieldFactory.getInstance());
        hashMap2.put(SctpPacket.SctpChunk.class, StaticSctpChunkFactory.getInstance());
        hashMap2.put(DnsResourceRecord.DnsRData.class, StaticDnsRDataFactory.getInstance());
    }

    public static PacketFactoryBinder getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactoryBinder
    public <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getPacketFactory(Class<T> cls, Class<N> cls2) {
        if (!Packet.class.isAssignableFrom(cls)) {
            return (PacketFactory) this.packetpPieceFactories.get(cls);
        }
        PacketFactory<T, N> packetFactory = (PacketFactory) this.packetFactories.get(cls2);
        return packetFactory != null ? packetFactory : StaticUnknownPacketFactory.getInstance();
    }
}
