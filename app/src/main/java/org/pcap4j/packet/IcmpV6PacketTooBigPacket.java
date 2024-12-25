package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6PacketTooBigPacket.class */
public final class IcmpV6PacketTooBigPacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = -8558258364388627250L;
    private final IcmpV6PacketTooBigHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6PacketTooBigPacket$Builder.class */
    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int mtu;

        public Builder() {
        }

        private Builder(IcmpV6PacketTooBigPacket icmpV6PacketTooBigPacket) {
            super(icmpV6PacketTooBigPacket);
            this.mtu = icmpV6PacketTooBigPacket.getHeader().mtu;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6PacketTooBigPacket build() {
            return new IcmpV6PacketTooBigPacket(this);
        }

        public Builder mtu(int i10) {
            this.mtu = i10;
            return this;
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6PacketTooBigPacket$IcmpV6PacketTooBigHeader.class */
    public static final class IcmpV6PacketTooBigHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_PACKET_TOO_BIG_HEADER_SIZE = 4;
        private static final int MTU_OFFSET = 0;
        private static final int MTU_SIZE = 4;
        private static final long serialVersionUID = 8034982803428261280L;
        private final int mtu;

        private IcmpV6PacketTooBigHeader(Builder builder) {
            this.mtu = builder.mtu;
        }

        private IcmpV6PacketTooBigHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.mtu = ByteArrays.getInt(bArr, i10 + 0);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv6 Packet Too Big Header(");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Packet Too Big Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  MTU: ");
            sb2.append(this.mtu);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.mtu;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IcmpV6PacketTooBigHeader.class.isInstance(obj)) {
                return false;
            }
            if (this.mtu != ((IcmpV6PacketTooBigHeader) obj).mtu) {
                z10 = false;
            }
            return z10;
        }

        public int getMtu() {
            return this.mtu;
        }

        public long getMtuAsLong() {
            return this.mtu & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.mtu));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV6PacketTooBigPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6PacketTooBigHeader(builder);
    }

    private IcmpV6PacketTooBigPacket(IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader) {
        this.header = icmpV6PacketTooBigHeader;
    }

    private IcmpV6PacketTooBigPacket(IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV6PacketTooBigHeader;
    }

    public static IcmpV6PacketTooBigPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV6PacketTooBigHeader icmpV6PacketTooBigHeader = new IcmpV6PacketTooBigHeader(bArr, i10, i11);
        int length = i11 - icmpV6PacketTooBigHeader.length();
        return length > 0 ? new IcmpV6PacketTooBigPacket(icmpV6PacketTooBigHeader, bArr, i10 + icmpV6PacketTooBigHeader.length(), length) : new IcmpV6PacketTooBigPacket(icmpV6PacketTooBigHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6PacketTooBigHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
