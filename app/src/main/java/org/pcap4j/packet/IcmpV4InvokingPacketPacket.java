package org.pcap4j.packet;

import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.NotApplicable;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4InvokingPacketPacket.class */
abstract class IcmpV4InvokingPacketPacket extends AbstractPacket {
    private static final long serialVersionUID = -739710899445035385L;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4InvokingPacketPacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private Packet payload;

        public Builder() {
        }

        public Builder(IcmpV4InvokingPacketPacket icmpV4InvokingPacketPacket) {
            this.payload = icmpV4InvokingPacketPacket.payload;
        }

        public Builder payload(Packet packet) {
            this.payload = packet;
            return this;
        }
    }

    public IcmpV4InvokingPacketPacket() {
        this.payload = null;
    }

    public IcmpV4InvokingPacketPacket(Builder builder) {
        if (builder != null) {
            this.payload = builder.payload;
            return;
        }
        throw new NullPointerException("builder: " + builder);
    }

    public IcmpV4InvokingPacketPacket(byte[] bArr, int i10, int i11) {
        Packet packet;
        Packet packet2 = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i10, i11, EtherType.IPV4);
        if (packet2 instanceof IllegalPacket) {
            packet = packet2;
        } else {
            packet = packet2;
            if (packet2.contains(IllegalPacket.class)) {
                Packet.Builder builder = packet2.getBuilder();
                byte[] rawData = ((IllegalPacket) packet2.get(IllegalPacket.class)).getRawData();
                builder.getOuterOf(IllegalPacket.Builder.class).payloadBuilder(((Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(rawData, 0, rawData.length, NotApplicable.UNKNOWN)).getBuilder());
                for (Packet.Builder builder2 : builder) {
                    if (builder2 instanceof LengthBuilder) {
                        ((LengthBuilder) builder2).correctLengthAtBuild2(false);
                    }
                    if (builder2 instanceof ChecksumBuilder) {
                        ((ChecksumBuilder) builder2).correctChecksumAtBuild(false);
                    }
                }
                packet = builder.build();
            }
        }
        this.payload = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
