package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IcmpV4DestinationUnreachablePacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IcmpV4EchoReplyPacket;
import org.pcap4j.packet.IcmpV4InformationReplyPacket;
import org.pcap4j.packet.IcmpV4InformationRequestPacket;
import org.pcap4j.packet.IcmpV4ParameterProblemPacket;
import org.pcap4j.packet.IcmpV4RedirectPacket;
import org.pcap4j.packet.IcmpV4SourceQuenchPacket;
import org.pcap4j.packet.IcmpV4TimeExceededPacket;
import org.pcap4j.packet.IcmpV4TimestampPacket;
import org.pcap4j.packet.IcmpV4TimestampReplyPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IcmpV4Type;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIcmpV4TypePacketFactory.class */
public final class StaticIcmpV4TypePacketFactory extends AbstractStaticPacketFactory<IcmpV4Type> {
    private static final StaticIcmpV4TypePacketFactory INSTANCE = new StaticIcmpV4TypePacketFactory();

    private StaticIcmpV4TypePacketFactory() {
        this.instantiaters.put(IcmpV4Type.ECHO_REPLY, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.1
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4EchoReplyPacket> getTargetClass() {
                return IcmpV4EchoReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4EchoReplyPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.DESTINATION_UNREACHABLE, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.2
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4DestinationUnreachablePacket> getTargetClass() {
                return IcmpV4DestinationUnreachablePacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4DestinationUnreachablePacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.SOURCE_QUENCH, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.3
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4SourceQuenchPacket> getTargetClass() {
                return IcmpV4SourceQuenchPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4SourceQuenchPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.REDIRECT, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.4
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4RedirectPacket> getTargetClass() {
                return IcmpV4RedirectPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4RedirectPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.ECHO, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.5
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4EchoPacket> getTargetClass() {
                return IcmpV4EchoPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4EchoPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIME_EXCEEDED, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.6
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimeExceededPacket> getTargetClass() {
                return IcmpV4TimeExceededPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4TimeExceededPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.PARAMETER_PROBLEM, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.7
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4ParameterProblemPacket> getTargetClass() {
                return IcmpV4ParameterProblemPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4ParameterProblemPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIMESTAMP, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.8
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimestampPacket> getTargetClass() {
                return IcmpV4TimestampPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4TimestampPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.TIMESTAMP_REPLY, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.9
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4TimestampReplyPacket> getTargetClass() {
                return IcmpV4TimestampReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4TimestampReplyPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.INFORMATION_REQUEST, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.10
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4InformationRequestPacket> getTargetClass() {
                return IcmpV4InformationRequestPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4InformationRequestPacket.newPacket(bArr, i10, i11);
            }
        });
        this.instantiaters.put(IcmpV4Type.INFORMATION_REPLY, new PacketInstantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticIcmpV4TypePacketFactory.11
            public final StaticIcmpV4TypePacketFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Class<IcmpV4InformationReplyPacket> getTargetClass() {
                return IcmpV4InformationReplyPacket.class;
            }

            @Override // org.pcap4j.packet.factory.statik.PacketInstantiater
            public Packet newInstance(byte[] bArr, int i10, int i11) {
                return IcmpV4InformationReplyPacket.newPacket(bArr, i10, i11);
            }
        });
    }

    public static StaticIcmpV4TypePacketFactory getInstance() {
        return INSTANCE;
    }
}
