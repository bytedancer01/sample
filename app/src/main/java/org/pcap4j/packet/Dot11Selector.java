package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.Dot11FrameType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11Selector.class */
public final class Dot11Selector extends AbstractPacket {
    private static final long serialVersionUID = -4770251478963995769L;

    private Dot11Selector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return (Packet) PacketFactories.getFactory(Packet.class, Dot11FrameType.class).newInstance(bArr, i10, i11, Dot11FrameControl.newInstance(bArr, i10, i11).getType());
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
