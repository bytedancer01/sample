package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixSolicitationPacket.class */
public class IcmpV6MobilePrefixSolicitationPacket extends AbstractPacket {
    private static final long serialVersionUID = -6996114480884459960L;
    private final IcmpV6MobilePrefixSolicitationHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixSolicitationPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private short reserved;

        public Builder() {
        }

        private Builder(IcmpV6MobilePrefixSolicitationPacket icmpV6MobilePrefixSolicitationPacket) {
            this.identifier = icmpV6MobilePrefixSolicitationPacket.header.identifier;
            this.reserved = icmpV6MobilePrefixSolicitationPacket.header.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6MobilePrefixSolicitationPacket build() {
            return new IcmpV6MobilePrefixSolicitationPacket(this);
        }

        public Builder identifier(short s10) {
            this.identifier = s10;
            return this;
        }

        public Builder reserved(short s10) {
            this.reserved = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixSolicitationPacket$IcmpV6MobilePrefixSolicitationHeader.class */
    public static final class IcmpV6MobilePrefixSolicitationHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_MOBILE_PREFIX_SOLICITATION_HEADER_SIZE = 4;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int RESERVED_OFFSET = 2;
        private static final int RESERVED_SIZE = 2;
        private static final long serialVersionUID = -2991706817314703570L;
        private final short identifier;
        private final short reserved;

        private IcmpV6MobilePrefixSolicitationHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.reserved = builder.reserved;
        }

        private IcmpV6MobilePrefixSolicitationHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i10 + 0);
                this.reserved = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            throw new IllegalRawDataException("The data is too short to build an ICMPv6 Mobile Prefix Solicitation Header(4 bytes). data: " + ByteArrays.toHexString(bArr, " ") + ", offset: " + i10 + ", length: " + i11);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Mobile Prefix Solicitation Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Identifier: ");
            sb2.append(getIdentifierAsInt());
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append((int) this.reserved);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.identifier) * 31) + this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || !IcmpV6MobilePrefixSolicitationHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6MobilePrefixSolicitationHeader icmpV6MobilePrefixSolicitationHeader = (IcmpV6MobilePrefixSolicitationHeader) obj;
            if (this.identifier != icmpV6MobilePrefixSolicitationHeader.identifier || this.reserved != icmpV6MobilePrefixSolicitationHeader.reserved) {
                z10 = false;
            }
            return z10;
        }

        public short getIdentifier() {
            return this.identifier;
        }

        public int getIdentifierAsInt() {
            return this.identifier & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.identifier));
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV6MobilePrefixSolicitationPacket(Builder builder) {
        this.header = new IcmpV6MobilePrefixSolicitationHeader(builder);
    }

    private IcmpV6MobilePrefixSolicitationPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6MobilePrefixSolicitationHeader(bArr, i10, i11);
    }

    public static IcmpV6MobilePrefixSolicitationPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6MobilePrefixSolicitationPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6MobilePrefixSolicitationHeader getHeader() {
        return this.header;
    }
}
