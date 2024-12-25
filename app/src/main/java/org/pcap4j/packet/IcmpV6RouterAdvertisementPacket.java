package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterAdvertisementPacket.class */
public final class IcmpV6RouterAdvertisementPacket extends AbstractPacket {
    private static final long serialVersionUID = -537286641023282344L;
    private final IcmpV6RouterAdvertisementHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterAdvertisementPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte curHopLimit;
        private boolean managedAddressConfigurationFlag;
        private List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private boolean otherConfigurationFlag;
        private int reachableTime;
        private byte reserved;
        private int retransTimer;
        private short routerLifetime;

        public Builder() {
        }

        private Builder(IcmpV6RouterAdvertisementPacket icmpV6RouterAdvertisementPacket) {
            this.curHopLimit = icmpV6RouterAdvertisementPacket.header.curHopLimit;
            this.managedAddressConfigurationFlag = icmpV6RouterAdvertisementPacket.header.managedAddressConfigurationFlag;
            this.otherConfigurationFlag = icmpV6RouterAdvertisementPacket.header.otherConfigurationFlag;
            this.reserved = icmpV6RouterAdvertisementPacket.header.reserved;
            this.routerLifetime = icmpV6RouterAdvertisementPacket.header.routerLifetime;
            this.reachableTime = icmpV6RouterAdvertisementPacket.header.reachableTime;
            this.retransTimer = icmpV6RouterAdvertisementPacket.header.retransTimer;
            this.options = icmpV6RouterAdvertisementPacket.header.options;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6RouterAdvertisementPacket build() {
            return new IcmpV6RouterAdvertisementPacket(this);
        }

        public Builder curHopLimit(byte b10) {
            this.curHopLimit = b10;
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

        public Builder otherConfigurationFlag(boolean z10) {
            this.otherConfigurationFlag = z10;
            return this;
        }

        public Builder reachableTime(int i10) {
            this.reachableTime = i10;
            return this;
        }

        public Builder reserved(byte b10) {
            this.reserved = b10;
            return this;
        }

        public Builder retransTimer(int i10) {
            this.retransTimer = i10;
            return this;
        }

        public Builder routerLifetime(short s10) {
            this.routerLifetime = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6RouterAdvertisementPacket$IcmpV6RouterAdvertisementHeader.class */
    public static final class IcmpV6RouterAdvertisementHeader extends AbstractPacket.AbstractHeader {
        private static final int CUR_HOP_LIMIT_OFFSET = 0;
        private static final int CUR_HOP_LIMIT_SIZE = 1;
        private static final int M_O_RESERVED_OFFSET = 1;
        private static final int M_O_RESERVED_SIZE = 1;
        private static final int OPTIONS_OFFSET = 12;
        private static final int REACHABLE_TIME_OFFSET = 4;
        private static final int REACHABLE_TIME_SIZE = 4;
        private static final int RETRANS_TIMER_OFFSET = 8;
        private static final int RETRANS_TIMER_SIZE = 4;
        private static final int ROUTER_LIFETIME_OFFSET = 2;
        private static final int ROUTER_LIFETIME_SIZE = 2;
        private static final long serialVersionUID = -3300835116087515662L;
        private final byte curHopLimit;
        private final boolean managedAddressConfigurationFlag;
        private final List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> options;
        private final boolean otherConfigurationFlag;
        private final int reachableTime;
        private final byte reserved;
        private final int retransTimer;
        private final short routerLifetime;

        private IcmpV6RouterAdvertisementHeader(Builder builder) {
            if ((builder.reserved & 192) != 0) {
                throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
            }
            this.curHopLimit = builder.curHopLimit;
            this.managedAddressConfigurationFlag = builder.managedAddressConfigurationFlag;
            this.otherConfigurationFlag = builder.otherConfigurationFlag;
            this.reserved = builder.reserved;
            this.routerLifetime = builder.routerLifetime;
            this.reachableTime = builder.reachableTime;
            this.retransTimer = builder.retransTimer;
            this.options = new ArrayList(builder.options);
        }

        private IcmpV6RouterAdvertisementHeader(byte[] bArr, int i10, int i11) {
            int i12 = 12;
            if (i11 < 12) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The raw data must be more than ");
                sb2.append(11);
                sb2.append("bytes");
                sb2.append(" to build this header. raw data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.curHopLimit = ByteArrays.getByte(bArr, i10 + 0);
            byte b10 = ByteArrays.getByte(bArr, i10 + 1);
            this.managedAddressConfigurationFlag = (b10 & 128) != 0;
            this.otherConfigurationFlag = (b10 & 64) != 0;
            this.reserved = (byte) (b10 & 63);
            this.routerLifetime = ByteArrays.getShort(bArr, i10 + 2);
            this.reachableTime = ByteArrays.getInt(bArr, i10 + 4);
            this.retransTimer = ByteArrays.getInt(bArr, i10 + 8);
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
            sb2.append("[ICMPv6 Router Advertisement Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Cur Hop Limit: ");
            sb2.append(getCurHopLimitAsInt());
            sb2.append(property);
            sb2.append("  Managed address configuration flag: ");
            sb2.append(this.managedAddressConfigurationFlag);
            sb2.append(property);
            sb2.append("  Other configuration flag: ");
            sb2.append(this.otherConfigurationFlag);
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append((int) this.reserved);
            sb2.append(property);
            sb2.append("  Router Lifetime: ");
            sb2.append(getRouterLifetimeAsInt());
            sb2.append(property);
            sb2.append("  Reachable Time: ");
            sb2.append(getReachableTimeAsLong());
            sb2.append(property);
            sb2.append("  Retrans Timer: ");
            sb2.append(getRetransTimerAsLong());
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
            byte b10 = this.curHopLimit;
            int i10 = 1231;
            int i11 = this.managedAddressConfigurationFlag ? 1231 : 1237;
            if (!this.otherConfigurationFlag) {
                i10 = 1237;
            }
            return ((((((((((((((527 + b10) * 31) + i11) * 31) + i10) * 31) + this.reserved) * 31) + this.routerLifetime) * 31) + this.reachableTime) * 31) + this.retransTimer) * 31) + this.options.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 12;
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
            if (!IcmpV6RouterAdvertisementHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6RouterAdvertisementHeader icmpV6RouterAdvertisementHeader = (IcmpV6RouterAdvertisementHeader) obj;
            if (this.routerLifetime != icmpV6RouterAdvertisementHeader.routerLifetime || this.reachableTime != icmpV6RouterAdvertisementHeader.reachableTime || this.retransTimer != icmpV6RouterAdvertisementHeader.retransTimer || this.curHopLimit != icmpV6RouterAdvertisementHeader.curHopLimit || this.managedAddressConfigurationFlag != icmpV6RouterAdvertisementHeader.managedAddressConfigurationFlag || this.otherConfigurationFlag != icmpV6RouterAdvertisementHeader.otherConfigurationFlag || this.reserved != icmpV6RouterAdvertisementHeader.reserved || !this.options.equals(icmpV6RouterAdvertisementHeader.options)) {
                z10 = false;
            }
            return z10;
        }

        public byte getCurHopLimit() {
            return this.curHopLimit;
        }

        public int getCurHopLimitAsInt() {
            return this.curHopLimit & 255;
        }

        public boolean getManagedAddressConfigurationFlag() {
            return this.managedAddressConfigurationFlag;
        }

        public List<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> getOptions() {
            return new ArrayList(this.options);
        }

        public boolean getOtherConfigurationFlag() {
            return this.otherConfigurationFlag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.curHopLimit));
            byte b10 = (byte) (this.reserved & 63);
            byte b11 = b10;
            if (this.managedAddressConfigurationFlag) {
                b11 = (byte) (b10 | 128);
            }
            byte b12 = b11;
            if (this.otherConfigurationFlag) {
                b12 = (byte) (b11 | 64);
            }
            arrayList.add(new byte[]{b12});
            arrayList.add(ByteArrays.toByteArray(this.routerLifetime));
            arrayList.add(ByteArrays.toByteArray(this.reachableTime));
            arrayList.add(ByteArrays.toByteArray(this.retransTimer));
            Iterator<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getReachableTime() {
            return this.reachableTime;
        }

        public long getReachableTimeAsLong() {
            return this.reachableTime & 4294967295L;
        }

        public int getReserved() {
            return this.reserved;
        }

        public int getRetransTimer() {
            return this.retransTimer;
        }

        public long getRetransTimerAsLong() {
            return this.retransTimer & 4294967295L;
        }

        public short getRouterLifetime() {
            return this.routerLifetime;
        }

        public int getRouterLifetimeAsInt() {
            return this.routerLifetime & 65535;
        }
    }

    private IcmpV6RouterAdvertisementPacket(Builder builder) {
        if (builder != null && builder.options != null) {
            this.header = new IcmpV6RouterAdvertisementHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.options: " + builder.options);
    }

    private IcmpV6RouterAdvertisementPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV6RouterAdvertisementHeader(bArr, i10, i11);
    }

    public static IcmpV6RouterAdvertisementPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6RouterAdvertisementPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6RouterAdvertisementHeader getHeader() {
        return this.header;
    }
}
