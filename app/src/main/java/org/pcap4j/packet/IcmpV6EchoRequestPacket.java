package org.pcap4j.packet;

import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoRequestPacket.class */
public final class IcmpV6EchoRequestPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = 1447480467515593011L;
    private final IcmpV6EchoRequestHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoRequestPacket$Builder.class */
    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        private Builder(IcmpV6EchoRequestPacket icmpV6EchoRequestPacket) {
            super(icmpV6EchoRequestPacket);
            this.payloadBuilder = icmpV6EchoRequestPacket.payload != null ? icmpV6EchoRequestPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6EchoRequestPacket build() {
            return new IcmpV6EchoRequestPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder identifier(short s10) {
            super.identifier(s10);
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder sequenceNumber(short s10) {
            super.sequenceNumber(s10);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoRequestPacket$IcmpV6EchoRequestHeader.class */
    public static final class IcmpV6EchoRequestHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final long serialVersionUID = -6510139039546388892L;

        private IcmpV6EchoRequestHeader(Builder builder) {
            super(builder);
        }

        private IcmpV6EchoRequestHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv6 Echo Request Header";
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getIdentifier() {
            return super.getIdentifier();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getIdentifierAsInt() {
            return super.getIdentifierAsInt();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getSequenceNumber() {
            return super.getSequenceNumber();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getSequenceNumberAsInt() {
            return super.getSequenceNumberAsInt();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public /* bridge */ /* synthetic */ int length() {
            return super.length();
        }
    }

    private IcmpV6EchoRequestPacket(Builder builder) {
        super(builder);
        this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.header = new IcmpV6EchoRequestHeader(builder);
    }

    private IcmpV6EchoRequestPacket(byte[] bArr, int i10, int i11) {
        IcmpV6EchoRequestHeader icmpV6EchoRequestHeader = new IcmpV6EchoRequestHeader(bArr, i10, i11);
        this.header = icmpV6EchoRequestHeader;
        int length = i11 - icmpV6EchoRequestHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10 + icmpV6EchoRequestHeader.length(), length, NotApplicable.UNKNOWN);
        } else {
            this.payload = null;
        }
    }

    public static IcmpV6EchoRequestPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6EchoRequestPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6EchoRequestHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
