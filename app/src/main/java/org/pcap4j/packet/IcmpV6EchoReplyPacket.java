package org.pcap4j.packet;

import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoReplyPacket.class */
public final class IcmpV6EchoReplyPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = -3713149118572340972L;
    private final IcmpV6EchoReplyHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoReplyPacket$Builder.class */
    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        private Builder(IcmpV6EchoReplyPacket icmpV6EchoReplyPacket) {
            super(icmpV6EchoReplyPacket);
            this.payloadBuilder = icmpV6EchoReplyPacket.payload != null ? icmpV6EchoReplyPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6EchoReplyPacket build() {
            return new IcmpV6EchoReplyPacket(this);
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6EchoReplyPacket$IcmpV6EchoReplyHeader.class */
    public static final class IcmpV6EchoReplyHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final long serialVersionUID = -5140524898291969262L;

        private IcmpV6EchoReplyHeader(Builder builder) {
            super(builder);
        }

        private IcmpV6EchoReplyHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv6 Echo Reply Header";
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

    private IcmpV6EchoReplyPacket(Builder builder) {
        super(builder);
        this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.header = new IcmpV6EchoReplyHeader(builder);
    }

    private IcmpV6EchoReplyPacket(byte[] bArr, int i10, int i11) {
        IcmpV6EchoReplyHeader icmpV6EchoReplyHeader = new IcmpV6EchoReplyHeader(bArr, i10, i11);
        this.header = icmpV6EchoReplyHeader;
        int length = i11 - icmpV6EchoReplyHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10 + icmpV6EchoReplyHeader.length(), length, NotApplicable.UNKNOWN);
        } else {
            this.payload = null;
        }
    }

    public static IcmpV6EchoReplyPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6EchoReplyPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6EchoReplyHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
