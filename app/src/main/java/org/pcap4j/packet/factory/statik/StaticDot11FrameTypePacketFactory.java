package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.Dot11ProbeRequestPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Dot11FrameType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticDot11FrameTypePacketFactory.class */
public final class StaticDot11FrameTypePacketFactory extends AbstractStaticPacketFactory<Dot11FrameType> {
    private static final StaticDot11FrameTypePacketFactory INSTANCE = new StaticDot11FrameTypePacketFactory();

    private StaticDot11FrameTypePacketFactory() {
        this.instantiaters.put(Dot11FrameType.PROBE_REQUEST, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDot11FrameTypePacketFactory.1
            public final StaticDot11FrameTypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Dot11ProbeRequestPacket> getTargetClass() {
                return Dot11ProbeRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return Dot11ProbeRequestPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticDot11FrameTypePacketFactory getInstance() {
        return INSTANCE;
    }
}
