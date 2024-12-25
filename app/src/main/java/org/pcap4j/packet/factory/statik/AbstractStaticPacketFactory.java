package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/AbstractStaticPacketFactory.class */
public abstract class AbstractStaticPacketFactory<N extends NamedNumber<?, ?>> implements PacketFactory<Packet, N> {
    public final Map<N, PacketInstantiater> instantiaters = new HashMap();

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass() {
        return UnknownPacket.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends Packet> getTargetClass(N n10) {
        if (n10 == null) {
            throw new NullPointerException("number must not be null.");
        }
        PacketInstantiater packetInstantiater = this.instantiaters.get(n10);
        return packetInstantiater != null ? packetInstantiater.getTargetClass() : getTargetClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.pcap4j.packet.factory.PacketFactory
    public /* bridge */ /* synthetic */ Packet newInstance(byte[] bArr, int i10, int i11, NamedNumber namedNumber) {
        return newInstance(bArr, i10, i11, (int) namedNumber);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i10, int i11) {
        return UnknownPacket.newPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Packet newInstance(byte[] bArr, int i10, int i11, N n10) {
        if (bArr != null && n10 != null) {
            PacketInstantiater packetInstantiater = this.instantiaters.get(n10);
            if (packetInstantiater == null) {
                return newInstance(bArr, i10, i11);
            }
            try {
                return packetInstantiater.newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalPacket.newPacket(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(n10);
        throw new NullPointerException(sb2.toString());
    }
}
