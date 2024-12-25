package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV6Option;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.IpV6Pad1Option;
import org.pcap4j.packet.IpV6PadNOption;
import org.pcap4j.packet.UnknownIpV6Option;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV6OptionType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6OptionFactory.class */
public final class StaticIpV6OptionFactory implements PacketFactory<IpV6ExtOptionsPacket.IpV6Option, IpV6OptionType> {
    private static final StaticIpV6OptionFactory INSTANCE = new StaticIpV6OptionFactory();
    private final Map<IpV6OptionType, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6OptionFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass();

        IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticIpV6OptionFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(IpV6OptionType.PAD1, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.1
            public final StaticIpV6OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public Class<IpV6Pad1Option> getTargetClass() {
                return IpV6Pad1Option.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV6Pad1Option.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV6OptionType.PADN, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.2
            public final StaticIpV6OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public Class<IpV6PadNOption> getTargetClass() {
                return IpV6PadNOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV6OptionFactory.Instantiater
            public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV6PadNOption.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticIpV6OptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass() {
        return UnknownIpV6Option.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6ExtOptionsPacket.IpV6Option> getTargetClass(IpV6OptionType ipV6OptionType) {
        if (ipV6OptionType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV6OptionType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i10, int i11) {
        try {
            return UnknownIpV6Option.newInstance(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            return IllegalIpV6Option.newInstance(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6ExtOptionsPacket.IpV6Option newInstance(byte[] bArr, int i10, int i11, IpV6OptionType ipV6OptionType) {
        if (bArr != null && ipV6OptionType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV6OptionType);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalIpV6Option.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(ipV6OptionType);
        throw new NullPointerException(sb2.toString());
    }
}
