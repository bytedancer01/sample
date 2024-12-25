package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpSelector.class */
public final class IpSelector extends AbstractPacket {
    private static final long serialVersionUID = -1;

    private IpSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i10, int i11) {
        Object newInstance;
        EtherType etherType;
        ByteArrays.validateBounds(bArr, i10, i11);
        int i12 = (bArr[i10] >> 4) & 15;
        PacketFactory factory = PacketFactories.getFactory(Packet.class, EtherType.class);
        if (i12 == IpVersion.IPV4.value().intValue()) {
            etherType = EtherType.IPV4;
        } else {
            if (i12 != IpVersion.IPV6.value().intValue()) {
                newInstance = PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10, i11, NotApplicable.UNKNOWN);
                return (Packet) newInstance;
            }
            etherType = EtherType.IPV6;
        }
        newInstance = factory.newInstance(bArr, i10, i11, etherType);
        return (Packet) newInstance;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
