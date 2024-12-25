package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.Ssh2KexInitPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticSsh2MessageNumberPacketFactory.class */
public final class StaticSsh2MessageNumberPacketFactory extends AbstractStaticPacketFactory<Ssh2MessageNumber> {
    private static final StaticSsh2MessageNumberPacketFactory INSTANCE = new StaticSsh2MessageNumberPacketFactory();

    private StaticSsh2MessageNumberPacketFactory() {
        this.instantiaters.put(Ssh2MessageNumber.SSH_MSG_KEXINIT, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticSsh2MessageNumberPacketFactory.1
            public final StaticSsh2MessageNumberPacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<Ssh2KexInitPacket> getTargetClass() {
                return Ssh2KexInitPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return Ssh2KexInitPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticSsh2MessageNumberPacketFactory getInstance() {
        return INSTANCE;
    }
}
