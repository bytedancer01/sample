package org.pcap4j.packet;

import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4InformationReplyPacket.class */
public final class IcmpV4InformationReplyPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = -9187969821832140340L;
    private final IcmpV4InformationReplyHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4InformationReplyPacket$Builder.class */
    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        public Builder() {
        }

        private Builder(IcmpV4InformationReplyPacket icmpV4InformationReplyPacket) {
            super(icmpV4InformationReplyPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4InformationReplyPacket build() {
            return new IcmpV4InformationReplyPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder identifier(short s10) {
            super.identifier(s10);
            return this;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder sequenceNumber(short s10) {
            super.sequenceNumber(s10);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4InformationReplyPacket$IcmpV4InformationReplyHeader.class */
    public static final class IcmpV4InformationReplyHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final long serialVersionUID = -2093444994122929555L;

        private IcmpV4InformationReplyHeader(Builder builder) {
            super(builder);
        }

        private IcmpV4InformationReplyHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv4 Information Reply Header";
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

    private IcmpV4InformationReplyPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4InformationReplyHeader(builder);
    }

    private IcmpV4InformationReplyPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV4InformationReplyHeader(bArr, i10, i11);
    }

    public static IcmpV4InformationReplyPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV4InformationReplyPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4InformationReplyHeader getHeader() {
        return this.header;
    }
}
