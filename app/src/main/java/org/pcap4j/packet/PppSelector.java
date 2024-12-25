package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PppSelector.class */
public final class PppSelector extends AbstractPacket {
    private static final long serialVersionUID = -1;

    private PppSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return bArr[i10] == -1 ? (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(bArr, i10, i11, DataLinkType.PPP_SERIAL) : PppPacket.newPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
