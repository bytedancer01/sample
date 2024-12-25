package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixAdvertisementPacket.class */
public class IcmpV6MobilePrefixAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = 7088081805293115326L;
    private final IcmpV6MobilePrefixAdvertisementHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixAdvertisementPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private boolean managedAddressConfigurationFlag;
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean otherStatefulConfigurationFlag;
        private short reserved;

        public Builder() {
        }

        private Builder(IcmpV6MobilePrefixAdvertisementPacket icmpV6MobilePrefixAdvertisementPacket) {
            this.identifier = icmpV6MobilePrefixAdvertisementPacket.header.identifier;
            this.managedAddressConfigurationFlag = icmpV6MobilePrefixAdvertisementPacket.header.managedAddressConfigurationFlag;
            this.otherStatefulConfigurationFlag = icmpV6MobilePrefixAdvertisementPacket.header.otherStatefulConfigurationFlag;
            this.reserved = icmpV6MobilePrefixAdvertisementPacket.header.reserved;
            this.options = icmpV6MobilePrefixAdvertisementPacket.header.options;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6MobilePrefixAdvertisementPacket build() {
            return new IcmpV6MobilePrefixAdvertisementPacket(this);
        }

        public Builder identifier(short s10) {
            this.identifier = s10;
            return this;
        }

        public Builder managedAddressConfigurationFlag(boolean z10) {
            this.managedAddressConfigurationFlag = z10;
            return this;
        }

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder otherStatefulConfigurationFlag(boolean z10) {
            this.otherStatefulConfigurationFlag = z10;
            return this;
        }

        public Builder reserved(short s10) {
            this.reserved = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6MobilePrefixAdvertisementPacket$IcmpV6MobilePrefixAdvertisementHeader.class */
    public static final class IcmpV6MobilePrefixAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int M_O_RESERVED_OFFSET = 2;
        private static final int M_O_RESERVED_SIZE = 2;
        private static final int OPTIONS_OFFSET = 4;
        private static final long serialVersionUID = -7395581536162987036L;
        private final short identifier;
        private final boolean managedAddressConfigurationFlag;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean otherStatefulConfigurationFlag;
        private final short reserved;

        private IcmpV6MobilePrefixAdvertisementHeader(Builder builder) {
            if ((builder.reserved & 49152) != 0) {
                throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
            }
            this.identifier = builder.identifier;
            this.managedAddressConfigurationFlag = builder.managedAddressConfigurationFlag;
            this.otherStatefulConfigurationFlag = builder.otherStatefulConfigurationFlag;
            this.reserved = builder.reserved;
            if (builder.options != null) {
                this.options = new ArrayList(builder.options);
            } else {
                this.options = new ArrayList(0);
            }
        }

        private IcmpV6MobilePrefixAdvertisementHeader(byte[] bArr, int i10, int i11) {
            int i12 = 4;
            if (i11 < 4) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The raw data must be more than ");
                sb2.append(3);
                sb2.append("bytes");
                sb2.append(" to build this header. raw data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.identifier = ByteArrays.getShort(bArr, i10 + 0);
            short s10 = ByteArrays.getShort(bArr, i10 + 2);
            this.managedAddressConfigurationFlag = (32768 & s10) != 0;
            this.otherStatefulConfigurationFlag = (s10 & 16384) != 0;
            this.reserved = (short) (s10 & 16383);
            this.options = new ArrayList();
            while (i12 < i11) {
                int i13 = i12 + i10;
                try {
                    IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption = (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption) PacketFactories.getFactory(IcmpV6CommonPacket.IpV6NeighborDiscoveryOption.class, IpV6NeighborDiscoveryOptionType.class).newInstance(bArr, i13, i11 - i12, IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i13])));
                    this.options.add(ipV6NeighborDiscoveryOption);
                    i12 += ipV6NeighborDiscoveryOption.length();
                } catch (Exception e10) {
                    return;
                }
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Mobile Prefix Advertisement Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Identifier: ");
            sb2.append(getIdentifierAsInt());
            sb2.append(property);
            sb2.append("  ManagedAddressConfigurationFlag: ");
            sb2.append(this.managedAddressConfigurationFlag);
            sb2.append(property);
            sb2.append("  OtherStatefulConfigurationFlag: ");
            sb2.append(this.otherStatefulConfigurationFlag);
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append((int) this.reserved);
            sb2.append(property);
            for (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption : this.options) {
                sb2.append("  Option: ");
                sb2.append(ipV6NeighborDiscoveryOption);
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            short s10 = this.identifier;
            int i10 = 1231;
            int i11 = this.managedAddressConfigurationFlag ? 1231 : 1237;
            if (!this.otherStatefulConfigurationFlag) {
                i10 = 1237;
            }
            return ((((((((527 + s10) * 31) + i11) * 31) + i10) * 31) + this.reserved) * 31) + this.options.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 4;
                }
                i10 = i11 + it.next().length();
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || !IcmpV6MobilePrefixAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6MobilePrefixAdvertisementHeader icmpV6MobilePrefixAdvertisementHeader = (IcmpV6MobilePrefixAdvertisementHeader) obj;
            if (this.identifier != icmpV6MobilePrefixAdvertisementHeader.identifier || this.managedAddressConfigurationFlag != icmpV6MobilePrefixAdvertisementHeader.managedAddressConfigurationFlag || this.otherStatefulConfigurationFlag != icmpV6MobilePrefixAdvertisementHeader.otherStatefulConfigurationFlag || this.reserved != icmpV6MobilePrefixAdvertisementHeader.reserved || !this.options.equals(icmpV6MobilePrefixAdvertisementHeader.options)) {
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

        public boolean getManagedAddressConfigurationFlag() {
            return this.managedAddressConfigurationFlag;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOtherStatefulConfigurationFlag() {
            return this.otherStatefulConfigurationFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.identifier));
            short s10 = (short) (this.reserved & 16383);
            short s11 = s10;
            if (this.managedAddressConfigurationFlag) {
                s11 = (short) (s10 | 32768);
            }
            short s12 = s11;
            if (this.otherStatefulConfigurationFlag) {
                s12 = (short) (s11 | 16384);
            }
            arrayList.add(ByteArrays.toByteArray(s12));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public short getReserved() {
            return this.reserved;
        }
    }

    private IcmpV6MobilePrefixAdvertisementPacket(Builder builder) {
        this.header = new IcmpV6MobilePrefixAdvertisementHeader(builder);
    }

    private IcmpV6MobilePrefixAdvertisementPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6MobilePrefixAdvertisementHeader(bArr, i10, i11);
    }

    public static IcmpV6MobilePrefixAdvertisementPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6MobilePrefixAdvertisementPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6MobilePrefixAdvertisementHeader getHeader() {
        return this.header;
    }
}
