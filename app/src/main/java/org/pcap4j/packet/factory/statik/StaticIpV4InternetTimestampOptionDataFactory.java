package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV4InternetTimestampOptionData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.packet.IpV4InternetTimestampOptionAddressPrespecified;
import org.pcap4j.packet.IpV4InternetTimestampOptionTimestamps;
import org.pcap4j.packet.IpV4InternetTimestampOptionTimestampsWithAddresses;
import org.pcap4j.packet.UnknownIpV4InternetTimestampOptionData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV4InternetTimestampOptionFlag;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV4InternetTimestampOptionDataFactory.class */
public final class StaticIpV4InternetTimestampOptionDataFactory implements PacketFactory<IpV4InternetTimestampOption.IpV4InternetTimestampOptionData, IpV4InternetTimestampOptionFlag> {
    private static final StaticIpV4InternetTimestampOptionDataFactory INSTANCE = new StaticIpV4InternetTimestampOptionDataFactory();
    private final Map<IpV4InternetTimestampOptionFlag, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV4InternetTimestampOptionDataFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends IpV4InternetTimestampOption.IpV4InternetTimestampOptionData> getTargetClass();

        IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticIpV4InternetTimestampOptionDataFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(IpV4InternetTimestampOptionFlag.TIMESTAMPS_ONLY, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.1
            public final StaticIpV4InternetTimestampOptionDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public Class<IpV4InternetTimestampOptionTimestamps> getTargetClass() {
                return IpV4InternetTimestampOptionTimestamps.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11) {
                return IpV4InternetTimestampOptionTimestamps.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4InternetTimestampOptionFlag.EACH_TIMESTAMP_PRECEDED_WITH_ADDRESS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.2
            public final StaticIpV4InternetTimestampOptionDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public Class<IpV4InternetTimestampOptionTimestampsWithAddresses> getTargetClass() {
                return IpV4InternetTimestampOptionTimestampsWithAddresses.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11) {
                return IpV4InternetTimestampOptionTimestampsWithAddresses.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4InternetTimestampOptionFlag.ADDRESS_PRESPECIFIED, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.3
            public final StaticIpV4InternetTimestampOptionDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public Class<IpV4InternetTimestampOptionAddressPrespecified> getTargetClass() {
                return IpV4InternetTimestampOptionAddressPrespecified.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4InternetTimestampOptionDataFactory.Instantiater
            public IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11) {
                return IpV4InternetTimestampOptionAddressPrespecified.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticIpV4InternetTimestampOptionDataFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4InternetTimestampOption.IpV4InternetTimestampOptionData> getTargetClass() {
        return UnknownIpV4InternetTimestampOptionData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4InternetTimestampOption.IpV4InternetTimestampOptionData> getTargetClass(IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
        if (ipV4InternetTimestampOptionFlag == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV4InternetTimestampOptionFlag);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11) {
        return UnknownIpV4InternetTimestampOptionData.newInstance(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4InternetTimestampOption.IpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11, IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
        if (bArr != null && ipV4InternetTimestampOptionFlag != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV4InternetTimestampOptionFlag);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : UnknownIpV4InternetTimestampOptionData.newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalIpV4InternetTimestampOptionData.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(ipV4InternetTimestampOptionFlag);
        throw new NullPointerException(sb2.toString());
    }
}
