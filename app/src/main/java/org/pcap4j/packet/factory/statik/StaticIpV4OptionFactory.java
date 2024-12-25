package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalIpV4Option;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4EndOfOptionList;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.packet.IpV4LooseSourceRouteOption;
import org.pcap4j.packet.IpV4NoOperationOption;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4RecordRouteOption;
import org.pcap4j.packet.IpV4Rfc791SecurityOption;
import org.pcap4j.packet.IpV4StreamIdOption;
import org.pcap4j.packet.IpV4StrictSourceRouteOption;
import org.pcap4j.packet.UnknownIpV4Option;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpV4OptionType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV4OptionFactory.class */
public final class StaticIpV4OptionFactory implements PacketFactory<IpV4Packet.IpV4Option, IpV4OptionType> {
    private static final StaticIpV4OptionFactory INSTANCE = new StaticIpV4OptionFactory();
    private final Map<IpV4OptionType, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV4OptionFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends IpV4Packet.IpV4Option> getTargetClass();

        IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticIpV4OptionFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(IpV4OptionType.END_OF_OPTION_LIST, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.1
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4EndOfOptionList> getTargetClass() {
                return IpV4EndOfOptionList.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4EndOfOptionList.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.NO_OPERATION, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.2
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4NoOperationOption> getTargetClass() {
                return IpV4NoOperationOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4NoOperationOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.SECURITY, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.3
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4Rfc791SecurityOption> getTargetClass() {
                return IpV4Rfc791SecurityOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4Rfc791SecurityOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.LOOSE_SOURCE_ROUTING, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.4
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4LooseSourceRouteOption> getTargetClass() {
                return IpV4LooseSourceRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4LooseSourceRouteOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.INTERNET_TIMESTAMP, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.5
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4InternetTimestampOption> getTargetClass() {
                return IpV4InternetTimestampOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4InternetTimestampOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.RECORD_ROUTE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.6
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4RecordRouteOption> getTargetClass() {
                return IpV4RecordRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4RecordRouteOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.STREAM_ID, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.7
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4StreamIdOption> getTargetClass() {
                return IpV4StreamIdOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4StreamIdOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(IpV4OptionType.STRICT_SOURCE_ROUTING, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.8
            public final StaticIpV4OptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public Class<IpV4StrictSourceRouteOption> getTargetClass() {
                return IpV4StrictSourceRouteOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticIpV4OptionFactory.Instantiater
            public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
                return IpV4StrictSourceRouteOption.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticIpV4OptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4Packet.IpV4Option> getTargetClass() {
        return UnknownIpV4Option.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV4Packet.IpV4Option> getTargetClass(IpV4OptionType ipV4OptionType) {
        if (ipV4OptionType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(ipV4OptionType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11) {
        try {
            return UnknownIpV4Option.newInstance(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            return IllegalIpV4Option.newInstance(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV4Packet.IpV4Option newInstance(byte[] bArr, int i10, int i11, IpV4OptionType ipV4OptionType) {
        if (bArr != null && ipV4OptionType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(ipV4OptionType);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalIpV4Option.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(ipV4OptionType);
        throw new NullPointerException(sb2.toString());
    }
}
