package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtHopByHopOptionsPacket.class */
public final class IpV6ExtHopByHopOptionsPacket extends IpV6ExtOptionsPacket {
    private static final long serialVersionUID = 4289988881526919621L;
    private final IpV6ExtHopByHopOptionsHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtHopByHopOptionsPacket$Builder.class */
    public static final class Builder extends IpV6ExtOptionsPacket.Builder {
        public Builder() {
        }

        private Builder(IpV6ExtHopByHopOptionsPacket ipV6ExtHopByHopOptionsPacket) {
            super(ipV6ExtHopByHopOptionsPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtHopByHopOptionsPacket build() {
            return new IpV6ExtHopByHopOptionsPacket(this);
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtHopByHopOptionsPacket$IpV6ExtHopByHopOptionsHeader.class */
    public static final class IpV6ExtHopByHopOptionsHeader extends IpV6ExtOptionsPacket.IpV6ExtOptionsHeader {
        private static final long serialVersionUID = -3903426584619413207L;

        private IpV6ExtHopByHopOptionsHeader(Builder builder) {
            super(builder);
        }

        private IpV6ExtHopByHopOptionsHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6ExtOptionsHeader
        public String getHeaderName() {
            return "IPv6 Hop-by-Hop Options Header";
        }
    }

    private IpV6ExtHopByHopOptionsPacket(Builder builder) {
        super(builder);
        this.header = new IpV6ExtHopByHopOptionsHeader(builder);
    }

    private IpV6ExtHopByHopOptionsPacket(IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader) {
        this.header = ipV6ExtHopByHopOptionsHeader;
    }

    private IpV6ExtHopByHopOptionsPacket(byte[] bArr, int i10, int i11, IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader) {
        super(bArr, i10, i11, ipV6ExtHopByHopOptionsHeader.getNextHeader());
        this.header = ipV6ExtHopByHopOptionsHeader;
    }

    public static IpV6ExtHopByHopOptionsPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader = new IpV6ExtHopByHopOptionsHeader(bArr, i10, i11);
        int length = i11 - ipV6ExtHopByHopOptionsHeader.length();
        return length > 0 ? new IpV6ExtHopByHopOptionsPacket(bArr, i10 + ipV6ExtHopByHopOptionsHeader.length(), length, ipV6ExtHopByHopOptionsHeader) : new IpV6ExtHopByHopOptionsPacket(ipV6ExtHopByHopOptionsHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtHopByHopOptionsHeader getHeader() {
        return this.header;
    }
}
