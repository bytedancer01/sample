package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterSolicitationPacket.class */
public final class IcmpV6RouterSolicitationPacket extends AbstractPacket {
    private static final long serialVersionUID = -8012525256314872386L;
    private final IcmpV6RouterSolicitationHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterSolicitationPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private int reserved;

        public Builder() {
        }

        private Builder(IcmpV6RouterSolicitationPacket icmpV6RouterSolicitationPacket) {
            this.reserved = icmpV6RouterSolicitationPacket.header.reserved;
            this.options = icmpV6RouterSolicitationPacket.header.options;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6RouterSolicitationPacket build() {
            return new IcmpV6RouterSolicitationPacket(this);
        }

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder reserved(int i10) {
            this.reserved = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterSolicitationPacket$IcmpV6RouterSolicitationHeader.class */
    public static final class IcmpV6RouterSolicitationHeader extends AbstractPacket.AbstractHeader {
        private static final int OPTIONS_OFFSET = 4;
        private static final int RESERVED_OFFSET = 0;
        private static final int RESERVED_SIZE = 4;
        private static final long serialVersionUID = -6091118158605916309L;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final int reserved;

        private IcmpV6RouterSolicitationHeader(Builder builder) {
            this.reserved = builder.reserved;
            this.options = new ArrayList(builder.options);
        }

        private IcmpV6RouterSolicitationHeader(byte[] bArr, int i10, int i11) {
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
                throw new IllegalRawDataException(sb2.toString());
            }
            this.reserved = ByteArrays.getInt(bArr, i10 + 0);
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
            sb2.append("[ICMPv6 Router Solicitation Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append(this.reserved);
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
            return ((527 + this.reserved) * 31) + this.options.hashCode();
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
            if (!IcmpV6RouterSolicitationHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6RouterSolicitationHeader icmpV6RouterSolicitationHeader = (IcmpV6RouterSolicitationHeader) obj;
            if (this.reserved != icmpV6RouterSolicitationHeader.reserved || !this.options.equals(icmpV6RouterSolicitationHeader.options)) {
                z10 = false;
            }
            return z10;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }
    }

    private IcmpV6RouterSolicitationPacket(Builder builder) {
        if (builder != null && builder.options != null) {
            this.header = new IcmpV6RouterSolicitationHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.options: " + builder.options);
    }

    private IcmpV6RouterSolicitationPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6RouterSolicitationHeader(bArr, i10, i11);
    }

    public static IcmpV6RouterSolicitationPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6RouterSolicitationPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6RouterSolicitationHeader getHeader() {
        return this.header;
    }
}
