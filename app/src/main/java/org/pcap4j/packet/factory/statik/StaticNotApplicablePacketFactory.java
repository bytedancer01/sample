package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.CompressedPacket;
import org.pcap4j.packet.EncryptedPacket;
import org.pcap4j.packet.FragmentedPacket;
import org.pcap4j.packet.IpV6ExtUnknownPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.NotApplicable;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticNotApplicablePacketFactory.class */
public final class StaticNotApplicablePacketFactory extends AbstractStaticPacketFactory<NotApplicable> {
    private static final StaticNotApplicablePacketFactory INSTANCE = new StaticNotApplicablePacketFactory();

    private StaticNotApplicablePacketFactory() {
        this.instantiaters.put(NotApplicable.UNKNOWN, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.1
            public final StaticNotApplicablePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<UnknownPacket> getTargetClass() {
                return UnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return UnknownPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(NotApplicable.FRAGMENTED, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.2
            public final StaticNotApplicablePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<FragmentedPacket> getTargetClass() {
                return FragmentedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return FragmentedPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(NotApplicable.UNKNOWN_IP_V6_EXTENSION, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.3
            public final StaticNotApplicablePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IpV6ExtUnknownPacket> getTargetClass() {
                return IpV6ExtUnknownPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IpV6ExtUnknownPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(NotApplicable.COMPRESSED, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.4
            public final StaticNotApplicablePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<CompressedPacket> getTargetClass() {
                return CompressedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return CompressedPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(NotApplicable.ENCRYPTED, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticNotApplicablePacketFactory.5
            public final StaticNotApplicablePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<EncryptedPacket> getTargetClass() {
                return EncryptedPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return EncryptedPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticNotApplicablePacketFactory getInstance() {
        return INSTANCE;
    }
}
