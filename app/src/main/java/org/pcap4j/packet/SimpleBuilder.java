package org.pcap4j.packet;

import org.pcap4j.packet.AbstractPacket;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SimpleBuilder.class */
public final class SimpleBuilder extends AbstractPacket.AbstractBuilder {
    private Packet packet;

    public SimpleBuilder() {
    }

    public SimpleBuilder(Packet packet) {
        this.packet = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
    public Packet build() {
        return this.packet;
    }

    public SimpleBuilder packet(Packet packet) {
        this.packet = packet;
        return this;
    }
}
