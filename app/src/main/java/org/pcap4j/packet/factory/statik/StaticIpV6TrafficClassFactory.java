package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleTrafficClass;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6TrafficClassFactory.class */
public final class StaticIpV6TrafficClassFactory implements PacketFactory<IpV6Packet.IpV6TrafficClass, NotApplicable> {
    private static final StaticIpV6TrafficClassFactory INSTANCE = new StaticIpV6TrafficClassFactory();

    public static StaticIpV6TrafficClassFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6Packet.IpV6TrafficClass> getTargetClass() {
        return IpV6SimpleTrafficClass.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public Class<? extends IpV6Packet.IpV6TrafficClass> getTargetClass(NotApplicable notApplicable) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6Packet.IpV6TrafficClass newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return IpV6SimpleTrafficClass.newInstance(bArr[i10]);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public IpV6Packet.IpV6TrafficClass newInstance(byte[] bArr, int i10, int i11, NotApplicable notApplicable) {
        return newInstance(bArr, i10, i11);
    }
}
