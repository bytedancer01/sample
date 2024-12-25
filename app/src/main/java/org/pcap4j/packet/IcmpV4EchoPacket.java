package org.pcap4j.packet;

import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4EchoPacket.class */
public final class IcmpV4EchoPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = -122451430580609855L;
    private final IcmpV4EchoHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4EchoPacket$Builder.class */
    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        private Builder(IcmpV4EchoPacket icmpV4EchoPacket) {
            super(icmpV4EchoPacket);
            this.payloadBuilder = icmpV4EchoPacket.payload != null ? icmpV4EchoPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4EchoPacket build() {
            return new IcmpV4EchoPacket(this);
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4EchoPacket$IcmpV4EchoHeader.class */
    public static final class IcmpV4EchoHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final long serialVersionUID = -1302478674628547524L;

        private IcmpV4EchoHeader(Builder builder) {
            super(builder);
        }

        private IcmpV4EchoHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv4 Echo Header";
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

    private IcmpV4EchoPacket(Builder builder) {
        super(builder);
        this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.header = new IcmpV4EchoHeader(builder);
    }

    private IcmpV4EchoPacket(byte[] bArr, int i10, int i11) {
        IcmpV4EchoHeader icmpV4EchoHeader = new IcmpV4EchoHeader(bArr, i10, i11);
        this.header = icmpV4EchoHeader;
        int length = i11 - icmpV4EchoHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10 + icmpV4EchoHeader.length(), length, NotApplicable.UNKNOWN);
        } else {
            this.payload = null;
        }
    }

    public static IcmpV4EchoPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV4EchoPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4EchoHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
