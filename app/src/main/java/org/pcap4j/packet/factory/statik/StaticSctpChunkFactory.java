package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IllegalSctpChunk;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.UnknownSctpChunk;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.SctpChunkType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticSctpChunkFactory.class */
public final class StaticSctpChunkFactory implements PacketFactory<SctpPacket.SctpChunk, SctpChunkType> {
    private static final StaticSctpChunkFactory INSTANCE = new StaticSctpChunkFactory();
    private final Map<SctpChunkType, Instantiater> instantiaters = new HashMap();

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticSctpChunkFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends SctpPacket.SctpChunk> getTargetClass();

        SctpPacket.SctpChunk newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticSctpChunkFactory() {
    }

    public static StaticSctpChunkFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends SctpPacket.SctpChunk> getTargetClass() {
        return UnknownSctpChunk.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends SctpPacket.SctpChunk> getTargetClass(SctpChunkType sctpChunkType) {
        if (sctpChunkType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(sctpChunkType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public SctpPacket.SctpChunk newInstance(byte[] bArr, int i10, int i11) {
        try {
            return UnknownSctpChunk.newInstance(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            return IllegalSctpChunk.newInstance(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public SctpPacket.SctpChunk newInstance(byte[] bArr, int i10, int i11, SctpChunkType sctpChunkType) {
        if (bArr != null && sctpChunkType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(sctpChunkType);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalSctpChunk.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(sctpChunkType);
        throw new NullPointerException(sb2.toString());
    }
}
