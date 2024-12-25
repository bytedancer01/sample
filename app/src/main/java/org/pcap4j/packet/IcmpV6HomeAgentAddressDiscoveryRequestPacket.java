package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryRequestPacket.class */
public class IcmpV6HomeAgentAddressDiscoveryRequestPacket extends AbstractPacket {
    private static final long serialVersionUID = -4921942983336579680L;
    private final IcmpV6HomeAgentAddressDiscoveryRequestHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryRequestPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private short reserved;

        public Builder() {
        }

        private Builder(IcmpV6HomeAgentAddressDiscoveryRequestPacket icmpV6HomeAgentAddressDiscoveryRequestPacket) {
            this.identifier = icmpV6HomeAgentAddressDiscoveryRequestPacket.header.identifier;
            this.reserved = icmpV6HomeAgentAddressDiscoveryRequestPacket.header.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6HomeAgentAddressDiscoveryRequestPacket build() {
            return new IcmpV6HomeAgentAddressDiscoveryRequestPacket(this);
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryRequestPacket$IcmpV6HomeAgentAddressDiscoveryRequestHeader.class */
    public static final class IcmpV6HomeAgentAddressDiscoveryRequestHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_HOME_AGENT_ADDRESS_DISCOVERY_REQUEST_HEADER_SIZE = 4;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int RESERVED_OFFSET = 2;
        private static final int RESERVED_SIZE = 2;
        private static final long serialVersionUID = -1367204926945263009L;
        private final short identifier;
        private final short reserved;

        private IcmpV6HomeAgentAddressDiscoveryRequestHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.reserved = builder.reserved;
        }

        private IcmpV6HomeAgentAddressDiscoveryRequestHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i10 + 0);
                this.reserved = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            throw new IllegalRawDataException("The data is too short to build an ICMPv6 Home Agent Address Discovery Request Header(4 bytes). data: " + ByteArrays.toHexString(bArr, " ") + ", offset: " + i10 + ", length: " + i11);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Home Agent Address Discovery Request Header (");
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
            if (obj == null || !IcmpV6HomeAgentAddressDiscoveryRequestHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6HomeAgentAddressDiscoveryRequestHeader icmpV6HomeAgentAddressDiscoveryRequestHeader = (IcmpV6HomeAgentAddressDiscoveryRequestHeader) obj;
            if (this.identifier != icmpV6HomeAgentAddressDiscoveryRequestHeader.identifier || this.reserved != icmpV6HomeAgentAddressDiscoveryRequestHeader.reserved) {
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

    private IcmpV6HomeAgentAddressDiscoveryRequestPacket(Builder builder) {
        this.header = new IcmpV6HomeAgentAddressDiscoveryRequestHeader(builder);
    }

    private IcmpV6HomeAgentAddressDiscoveryRequestPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6HomeAgentAddressDiscoveryRequestHeader(bArr, i10, i11);
    }

    public static IcmpV6HomeAgentAddressDiscoveryRequestPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6HomeAgentAddressDiscoveryRequestPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6HomeAgentAddressDiscoveryRequestHeader getHeader() {
        return this.header;
    }
}
