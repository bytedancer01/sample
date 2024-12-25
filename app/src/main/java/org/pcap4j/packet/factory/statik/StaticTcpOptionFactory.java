package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IllegalTcpOption;
import org.pcap4j.packet.TcpEndOfOptionList;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackOption;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpTimestampsOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UnknownTcpOption;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.TcpOptionKind;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticTcpOptionFactory.class */
public final class StaticTcpOptionFactory implements PacketFactory<TcpPacket.TcpOption, TcpOptionKind> {
    private static final StaticTcpOptionFactory INSTANCE = new StaticTcpOptionFactory();
    private final Map<TcpOptionKind, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticTcpOptionFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends TcpPacket.TcpOption> getTargetClass();

        TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticTcpOptionFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(TcpOptionKind.END_OF_OPTION_LIST, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.1
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpEndOfOptionList> getTargetClass() {
                return TcpEndOfOptionList.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpEndOfOptionList.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.NO_OPERATION, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.2
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpNoOperationOption> getTargetClass() {
                return TcpNoOperationOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpNoOperationOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.MAXIMUM_SEGMENT_SIZE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.3
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpMaximumSegmentSizeOption> getTargetClass() {
                return TcpMaximumSegmentSizeOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpMaximumSegmentSizeOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.WINDOW_SCALE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.4
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpWindowScaleOption> getTargetClass() {
                return TcpWindowScaleOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpWindowScaleOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.SACK_PERMITTED, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.5
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpSackPermittedOption> getTargetClass() {
                return TcpSackPermittedOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpSackPermittedOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.SACK, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.6
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpSackOption> getTargetClass() {
                return TcpSackOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpSackOption.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(TcpOptionKind.TIMESTAMPS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.7
            public final StaticTcpOptionFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public Class<TcpTimestampsOption> getTargetClass() {
                return TcpTimestampsOption.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticTcpOptionFactory.Instantiater
            public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
                return TcpTimestampsOption.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticTcpOptionFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends TcpPacket.TcpOption> getTargetClass() {
        return UnknownTcpOption.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends TcpPacket.TcpOption> getTargetClass(TcpOptionKind tcpOptionKind) {
        if (tcpOptionKind == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(tcpOptionKind);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11) {
        try {
            return UnknownTcpOption.newInstance(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            return IllegalTcpOption.newInstance(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public TcpPacket.TcpOption newInstance(byte[] bArr, int i10, int i11, TcpOptionKind tcpOptionKind) {
        if (bArr != null && tcpOptionKind != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(tcpOptionKind);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalTcpOption.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(tcpOptionKind);
        throw new NullPointerException(sb2.toString());
    }
}
