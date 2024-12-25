package org.pcap4j.packet;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryReplyPacket.class */
public class IcmpV6HomeAgentAddressDiscoveryReplyPacket extends AbstractPacket {
    private static final long serialVersionUID = 8080366373921919970L;
    private final IcmpV6HomeAgentAddressDiscoveryReplyHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryReplyPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<Inet6Address> homeAgentAddresses;
        private short identifier;
        private short reserved;

        public Builder() {
        }

        private Builder(IcmpV6HomeAgentAddressDiscoveryReplyPacket icmpV6HomeAgentAddressDiscoveryReplyPacket) {
            this.identifier = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.identifier;
            this.reserved = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.reserved;
            this.homeAgentAddresses = icmpV6HomeAgentAddressDiscoveryReplyPacket.header.homeAgentAddresses;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6HomeAgentAddressDiscoveryReplyPacket build() {
            return new IcmpV6HomeAgentAddressDiscoveryReplyPacket(this);
        }

        public Builder homeAgentAddresses(List<Inet6Address> list) {
            this.homeAgentAddresses = list;
            return this;
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6HomeAgentAddressDiscoveryReplyPacket$IcmpV6HomeAgentAddressDiscoveryReplyHeader.class */
    public static final class IcmpV6HomeAgentAddressDiscoveryReplyHeader extends AbstractPacket.AbstractHeader {
        private static final int HOME_AGENT_ADDRESSES_OFFSET = 4;
        private static final int HOME_AGENT_ADDRESSES_SIZE = 16;
        private static final int ICMPV6_HOME_AGENT_ADDRESS_DISCOVERY_REPLY_HEADER_MIN_SIZE = 20;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int RESERVED_OFFSET = 2;
        private static final int RESERVED_SIZE = 2;
        private static final long serialVersionUID = 7184228144196703852L;
        private final List<Inet6Address> homeAgentAddresses;
        private final short identifier;
        private final short reserved;

        private IcmpV6HomeAgentAddressDiscoveryReplyHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.reserved = builder.reserved;
            if (builder.homeAgentAddresses != null) {
                this.homeAgentAddresses = new ArrayList(builder.homeAgentAddresses);
            } else {
                this.homeAgentAddresses = new ArrayList(0);
            }
        }

        private IcmpV6HomeAgentAddressDiscoveryReplyHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 20) {
                this.identifier = ByteArrays.getShort(bArr, i10 + 0);
                this.reserved = ByteArrays.getShort(bArr, i10 + 2);
                this.homeAgentAddresses = new ArrayList();
                for (int i12 = 4; i12 < i11; i12 += 16) {
                    this.homeAgentAddresses.add(ByteArrays.getInet6Address(bArr, i12 + i10));
                }
                return;
            }
            throw new IllegalRawDataException("The data is too short to build an ICMPv6 Home Agent Address Discovery Reply Header(20 bytes). data: " + ByteArrays.toHexString(bArr, " ") + ", offset: " + i10 + ", length: " + i11);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Home Agent Address Discovery Reply Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Identifier: ");
            sb2.append(getIdentifierAsInt());
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append((int) this.reserved);
            sb2.append(property);
            for (Inet6Address inet6Address : this.homeAgentAddresses) {
                sb2.append("  HomeAgentAddress: ");
                sb2.append(inet6Address);
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.identifier) * 31) + this.reserved) * 31) + this.homeAgentAddresses.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return (this.homeAgentAddresses.size() * 16) + 4;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || !IcmpV6HomeAgentAddressDiscoveryReplyHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6HomeAgentAddressDiscoveryReplyHeader icmpV6HomeAgentAddressDiscoveryReplyHeader = (IcmpV6HomeAgentAddressDiscoveryReplyHeader) obj;
            if (this.identifier != icmpV6HomeAgentAddressDiscoveryReplyHeader.identifier || this.reserved != icmpV6HomeAgentAddressDiscoveryReplyHeader.reserved || !this.homeAgentAddresses.equals(icmpV6HomeAgentAddressDiscoveryReplyHeader.homeAgentAddresses)) {
                z10 = false;
            }
            return z10;
        }

        public List<Inet6Address> getHomeAgentAddresses() {
            return new ArrayList(this.homeAgentAddresses);
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
            Iterator<Inet6Address> it = this.homeAgentAddresses.iterator();
            while (it.hasNext()) {
                arrayList.add(ByteArrays.toByteArray(it.next()));
            }
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }
    }

    private IcmpV6HomeAgentAddressDiscoveryReplyPacket(Builder builder) {
        this.header = new IcmpV6HomeAgentAddressDiscoveryReplyHeader(builder);
    }

    private IcmpV6HomeAgentAddressDiscoveryReplyPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6HomeAgentAddressDiscoveryReplyHeader(bArr, i10, i11);
    }

    public static IcmpV6HomeAgentAddressDiscoveryReplyPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6HomeAgentAddressDiscoveryReplyPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6HomeAgentAddressDiscoveryReplyHeader getHeader() {
        return this.header;
    }
}
