package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV6RoutingData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.packet.IpV6RoutingSourceRouteData;
import org.pcap4j.packet.UnknownIpV6RoutingData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV6RoutingType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6RoutingDataFactory.class */
public final class StaticIpV6RoutingDataFactory implements PacketFactory<IpV6ExtRoutingPacket.IpV6RoutingData, IpV6RoutingType> {
    private static final StaticIpV6RoutingDataFactory INSTANCE = new StaticIpV6RoutingDataFactory();
    private final Map<IpV6RoutingType, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6RoutingDataFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass();

        IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticIpV6RoutingDataFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(IpV6RoutingType.SOURCE_ROUTE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.1
            public final StaticIpV6RoutingDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.Instantiater
            public Class<IpV6RoutingSourceRouteData> getTargetClass() {
                return IpV6RoutingSourceRouteData.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6RoutingDataFactory.Instantiater
            public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i10, int i11) {
                return IpV6RoutingSourceRouteData.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticIpV6RoutingDataFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass() {
        return UnknownIpV6RoutingData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtRoutingPacket.IpV6RoutingData> getTargetClass(IpV6RoutingType ipV6RoutingType) {
        if (ipV6RoutingType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV6RoutingType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i10, int i11) {
        try {
            return UnknownIpV6RoutingData.newInstance(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            return IllegalIpV6RoutingData.newInstance(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtRoutingPacket.IpV6RoutingData newInstance(byte[] bArr, int i10, int i11, IpV6RoutingType ipV6RoutingType) {
        if (bArr != null && ipV6RoutingType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV6RoutingType);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalIpV6RoutingData.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(ipV6RoutingType);
        throw new NullPointerException(sb2.toString());
    }
}
