package org.pcap4j.packet;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RedirectPacket.class */
public final class IcmpV6RedirectPacket extends AbstractPacket {
    private static final long serialVersionUID = 3400190218684481961L;
    private final IcmpV6RedirectHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RedirectPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Inet6Address destinationAddress;
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private int reserved;
        private Inet6Address targetAddress;

        public Builder() {
        }

        private Builder(IcmpV6RedirectPacket icmpV6RedirectPacket) {
            this.reserved = icmpV6RedirectPacket.header.reserved;
            this.targetAddress = icmpV6RedirectPacket.header.targetAddress;
            this.destinationAddress = icmpV6RedirectPacket.header.destinationAddress;
            this.options = icmpV6RedirectPacket.header.options;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6RedirectPacket build() {
            return new IcmpV6RedirectPacket(this);
        }

        public Builder destinationAddress(Inet6Address inet6Address) {
            this.destinationAddress = inet6Address;
            return this;
        }

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder reserved(int i10) {
            this.reserved = i10;
            return this;
        }

        public Builder targetAddress(Inet6Address inet6Address) {
            this.targetAddress = inet6Address;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RedirectPacket$IcmpV6RedirectHeader.class */
    public static final class IcmpV6RedirectHeader extends AbstractPacket.AbstractHeader {
        private static final int DESTINATION_ADDRESS_OFFSET = 20;
        private static final int DESTINATION_ADDRESS_SIZE = 16;
        private static final int OPTIONS_OFFSET = 36;
        private static final int RESERVED_OFFSET = 0;
        private static final int RESERVED_SIZE = 4;
        private static final int TARGET_ADDRESS_OFFSET = 4;
        private static final int TARGET_ADDRESS_SIZE = 16;
        private static final long serialVersionUID = -649348640271386853L;
        private final Inet6Address destinationAddress;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final int reserved;
        private final Inet6Address targetAddress;

        private IcmpV6RedirectHeader(Builder builder) {
            this.reserved = builder.reserved;
            this.targetAddress = builder.targetAddress;
            this.destinationAddress = builder.destinationAddress;
            this.options = new ArrayList(builder.options);
        }

        private IcmpV6RedirectHeader(byte[] bArr, int i10, int i11) {
            int i12 = 36;
            if (i11 < 36) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The raw data must be more than ");
                sb2.append(35);
                sb2.append("bytes");
                sb2.append(" to build this header. raw data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.reserved = ByteArrays.getInt(bArr, i10 + 0);
            this.targetAddress = ByteArrays.getInet6Address(bArr, i10 + 4);
            this.destinationAddress = ByteArrays.getInet6Address(bArr, i10 + 20);
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
            sb2.append("[ICMPv6 Redirect Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append(this.reserved);
            sb2.append(property);
            sb2.append("  Target Address: ");
            sb2.append(this.targetAddress);
            sb2.append(property);
            sb2.append("  Destination Address: ");
            sb2.append(this.destinationAddress);
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
            return ((((((527 + this.reserved) * 31) + this.targetAddress.hashCode()) * 31) + this.destinationAddress.hashCode()) * 31) + this.options.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 36;
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
            if (!IcmpV6RedirectHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6RedirectHeader icmpV6RedirectHeader = (IcmpV6RedirectHeader) obj;
            if (!this.targetAddress.equals(icmpV6RedirectHeader.targetAddress) || !this.destinationAddress.equals(icmpV6RedirectHeader.destinationAddress) || this.reserved != icmpV6RedirectHeader.reserved || !this.options.equals(icmpV6RedirectHeader.options)) {
                z10 = false;
            }
            return z10;
        }

        public Inet6Address getDestinationAddress() {
            return this.destinationAddress;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            arrayList.add(ByteArrays.toByteArray(this.targetAddress));
            arrayList.add(ByteArrays.toByteArray(this.destinationAddress));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }

        public Inet6Address getTargetAddress() {
            return this.targetAddress;
        }
    }

    private IcmpV6RedirectPacket(Builder builder) {
        if (builder != null && builder.targetAddress != null && builder.destinationAddress != null && builder.options != null) {
            this.header = new IcmpV6RedirectHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.targetAddress: " + builder.targetAddress + " builder.destinationAddress: " + builder.destinationAddress + " builder.options: " + builder.options);
    }

    private IcmpV6RedirectPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6RedirectHeader(bArr, i10, i11);
    }

    public static IcmpV6RedirectPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6RedirectPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6RedirectHeader getHeader() {
        return this.header;
    }
}
