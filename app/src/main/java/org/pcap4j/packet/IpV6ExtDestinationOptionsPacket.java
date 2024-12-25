package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtDestinationOptionsPacket.class */
public final class IpV6ExtDestinationOptionsPacket extends IpV6ExtOptionsPacket {
    private static final long serialVersionUID = -3293888276359687328L;
    private final IpV6ExtDestinationOptionsHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtDestinationOptionsPacket$Builder.class */
    public static final class Builder extends IpV6ExtOptionsPacket.Builder {
        public Builder() {
        }

        private Builder(IpV6ExtDestinationOptionsPacket ipV6ExtDestinationOptionsPacket) {
            super(ipV6ExtDestinationOptionsPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtDestinationOptionsPacket build() {
            return new IpV6ExtDestinationOptionsPacket(this);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder hdrExtLen(byte b10) {
            super.hdrExtLen(b10);
            return this;
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder nextHeader(IpNumber ipNumber) {
            super.nextHeader(ipNumber);
            return this;
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder options(List<IpV6ExtOptionsPacket.IpV6Option> list) {
            super.options(list);
            return this;
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public /* bridge */ /* synthetic */ IpV6ExtOptionsPacket.Builder options(List list) {
            return options((List<IpV6ExtOptionsPacket.IpV6Option>) list);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtDestinationOptionsPacket$IpV6ExtDestinationOptionsHeader.class */
    public static final class IpV6ExtDestinationOptionsHeader extends IpV6ExtOptionsPacket.IpV6ExtOptionsHeader {
        private static final long serialVersionUID = 4686702407537705400L;

        private IpV6ExtDestinationOptionsHeader(Builder builder) {
            super(builder);
        }

        private IpV6ExtDestinationOptionsHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6ExtOptionsHeader
        public String getHeaderName() {
            return "IPv6 Destination Options Header";
        }
    }

    private IpV6ExtDestinationOptionsPacket(Builder builder) {
        super(builder);
        this.header = new IpV6ExtDestinationOptionsHeader(builder);
    }

    private IpV6ExtDestinationOptionsPacket(IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader) {
        this.header = ipV6ExtDestinationOptionsHeader;
    }

    private IpV6ExtDestinationOptionsPacket(byte[] bArr, int i10, int i11, IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader) {
        super(bArr, i10, i11, ipV6ExtDestinationOptionsHeader.getNextHeader());
        this.header = ipV6ExtDestinationOptionsHeader;
    }

    public static IpV6ExtDestinationOptionsPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader = new IpV6ExtDestinationOptionsHeader(bArr, i10, i11);
        int length = i11 - ipV6ExtDestinationOptionsHeader.length();
        return length > 0 ? new IpV6ExtDestinationOptionsPacket(bArr, i10 + ipV6ExtDestinationOptionsHeader.length(), length, ipV6ExtDestinationOptionsHeader) : new IpV6ExtDestinationOptionsPacket(ipV6ExtDestinationOptionsHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtDestinationOptionsHeader getHeader() {
        return this.header;
    }
}
