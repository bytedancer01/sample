package org.pcap4j.packet;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6NeighborAdvertisementPacket.class */
public final class IcmpV6NeighborAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = 2928161747361401145L;
    private final IcmpV6NeighborAdvertisementHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6NeighborAdvertisementPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean overrideFlag;
        private int reserved;
        private boolean routerFlag;
        private boolean solicitedFlag;
        private Inet6Address targetAddress;

        public Builder() {
        }

        private Builder(IcmpV6NeighborAdvertisementPacket icmpV6NeighborAdvertisementPacket) {
            this.routerFlag = icmpV6NeighborAdvertisementPacket.header.routerFlag;
            this.solicitedFlag = icmpV6NeighborAdvertisementPacket.header.solicitedFlag;
            this.overrideFlag = icmpV6NeighborAdvertisementPacket.header.overrideFlag;
            this.reserved = icmpV6NeighborAdvertisementPacket.header.reserved;
            this.targetAddress = icmpV6NeighborAdvertisementPacket.header.targetAddress;
            this.options = icmpV6NeighborAdvertisementPacket.header.options;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6NeighborAdvertisementPacket build() {
            return new IcmpV6NeighborAdvertisementPacket(this);
        }

        public Builder options(List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> list) {
            this.options = list;
            return this;
        }

        public Builder overrideFlag(boolean z10) {
            this.overrideFlag = z10;
            return this;
        }

        public Builder reserved(int i10) {
            this.reserved = i10;
            return this;
        }

        public Builder routerFlag(boolean z10) {
            this.routerFlag = z10;
            return this;
        }

        public Builder solicitedFlag(boolean z10) {
            this.solicitedFlag = z10;
            return this;
        }

        public Builder targetAddress(Inet6Address inet6Address) {
            this.targetAddress = inet6Address;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6NeighborAdvertisementPacket$IcmpV6NeighborAdvertisementHeader.class */
    public static final class IcmpV6NeighborAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int OPTIONS_OFFSET = 20;
        private static final int R_S_O_RESERVED_OFFSET = 0;
        private static final int R_S_O_RESERVED_SIZE = 4;
        private static final int TARGET_ADDRESS_OFFSET = 4;
        private static final int TARGET_ADDRESS_SIZE = 16;
        private static final long serialVersionUID = 2755611686067943647L;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean overrideFlag;
        private final int reserved;
        private final boolean routerFlag;
        private final boolean solicitedFlag;
        private final Inet6Address targetAddress;

        private IcmpV6NeighborAdvertisementHeader(Builder builder) {
            if ((builder.reserved & (-536870912)) != 0) {
                throw new IllegalArgumentException("Invalid reserved: " + builder.reserved);
            }
            this.routerFlag = builder.routerFlag;
            this.solicitedFlag = builder.solicitedFlag;
            this.overrideFlag = builder.overrideFlag;
            this.reserved = builder.reserved;
            this.targetAddress = builder.targetAddress;
            this.options = new ArrayList(builder.options);
        }

        private IcmpV6NeighborAdvertisementHeader(byte[] bArr, int i10, int i11) {
            int i12 = 20;
            if (i11 < 20) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The raw data must be more than ");
                sb2.append(19);
                sb2.append("bytes");
                sb2.append(" to build this header. raw data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            int i13 = ByteArrays.getInt(bArr, i10 + 0);
            this.routerFlag = (Integer.MIN_VALUE & i13) != 0;
            this.solicitedFlag = (1073741824 & i13) != 0;
            this.overrideFlag = (536870912 & i13) != 0;
            this.reserved = i13 & 536870911;
            this.targetAddress = ByteArrays.getInet6Address(bArr, i10 + 4);
            this.options = new ArrayList();
            while (i12 < i11) {
                int i14 = i12 + i10;
                try {
                    IcmpV6CommonPacket.IpV6NeighborDiscoveryOption ipV6NeighborDiscoveryOption = (IcmpV6CommonPacket.IpV6NeighborDiscoveryOption) PacketFactories.getFactory(IcmpV6CommonPacket.IpV6NeighborDiscoveryOption.class, IpV6NeighborDiscoveryOptionType.class).newInstance(bArr, i14, i11 - i12, IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i14])));
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
            sb2.append("[ICMPv6 Neighbor Advertisement Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Router flag: ");
            sb2.append(this.routerFlag);
            sb2.append(property);
            sb2.append("  Solicited flag: ");
            sb2.append(this.solicitedFlag);
            sb2.append(property);
            sb2.append("  Override flag: ");
            sb2.append(this.overrideFlag);
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append(this.reserved);
            sb2.append(property);
            sb2.append("  Target Address: ");
            sb2.append(this.targetAddress);
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
            int i10 = 1231;
            int i11 = this.routerFlag ? 1231 : 1237;
            int i12 = this.solicitedFlag ? 1231 : 1237;
            if (!this.overrideFlag) {
                i10 = 1237;
            }
            return ((((((((((527 + i11) * 31) + i12) * 31) + i10) * 31) + this.reserved) * 31) + this.targetAddress.hashCode()) * 31) + this.options.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 20;
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
            if (!IcmpV6NeighborAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6NeighborAdvertisementHeader icmpV6NeighborAdvertisementHeader = (IcmpV6NeighborAdvertisementHeader) obj;
            if (!this.targetAddress.equals(icmpV6NeighborAdvertisementHeader.targetAddress) || this.routerFlag != icmpV6NeighborAdvertisementHeader.routerFlag || this.solicitedFlag != icmpV6NeighborAdvertisementHeader.solicitedFlag || this.overrideFlag != icmpV6NeighborAdvertisementHeader.overrideFlag || this.reserved != icmpV6NeighborAdvertisementHeader.reserved || !this.options.equals(icmpV6NeighborAdvertisementHeader.options)) {
                z10 = false;
            }
            return z10;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOverrideFlag() {
            return this.overrideFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            int i10 = this.reserved & 536870911;
            int i11 = i10;
            if (this.routerFlag) {
                i11 = i10 | NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            }
            int i12 = i11;
            if (this.solicitedFlag) {
                i12 = i11 | NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
            }
            int i13 = i12;
            if (this.overrideFlag) {
                i13 = i12 | NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH;
            }
            arrayList.add(ByteArrays.toByteArray(i13));
            arrayList.add(ByteArrays.toByteArray(this.targetAddress));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }

        public boolean getRouterFlag() {
            return this.routerFlag;
        }

        public boolean getSolicitedFlag() {
            return this.solicitedFlag;
        }

        public Inet6Address getTargetAddress() {
            return this.targetAddress;
        }
    }

    private IcmpV6NeighborAdvertisementPacket(Builder builder) {
        if (builder != null && builder.targetAddress != null && builder.options != null) {
            this.header = new IcmpV6NeighborAdvertisementHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.targetAddress: " + builder.targetAddress + " builder.options: " + builder.options);
    }

    private IcmpV6NeighborAdvertisementPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6NeighborAdvertisementHeader(bArr, i10, i11);
    }

    public static IcmpV6NeighborAdvertisementPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6NeighborAdvertisementPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6NeighborAdvertisementHeader getHeader() {
        return this.header;
    }
}
