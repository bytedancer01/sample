package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6DestinationUnreachablePacket.class */
public final class IcmpV6DestinationUnreachablePacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = -7542312889671819449L;
    private final IcmpV6DestinationUnreachableHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6DestinationUnreachablePacket$Builder.class */
    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int unused;

        public Builder() {
        }

        private Builder(IcmpV6DestinationUnreachablePacket icmpV6DestinationUnreachablePacket) {
            super(icmpV6DestinationUnreachablePacket);
            this.unused = icmpV6DestinationUnreachablePacket.getHeader().unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6DestinationUnreachablePacket build() {
            return new IcmpV6DestinationUnreachablePacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        public Builder unused(int i10) {
            this.unused = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6DestinationUnreachablePacket$IcmpV6DestinationUnreachableHeader.class */
    public static final class IcmpV6DestinationUnreachableHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_DESTINATION_UNREACHABLE_HEADER_SIZE = 4;
        private static final int UNUSED_OFFSET = 0;
        private static final int UNUSED_SIZE = 4;
        private static final long serialVersionUID = -1783685027034916291L;
        private final int unused;

        private IcmpV6DestinationUnreachableHeader(Builder builder) {
            this.unused = builder.unused;
        }

        private IcmpV6DestinationUnreachableHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.unused = ByteArrays.getInt(bArr, i10 + 0);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv6 Destination Unreachable Header(");
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
            sb2.append("[ICMPv6 Destination Unreachable Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Unused: ");
            sb2.append(this.unused);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IcmpV6DestinationUnreachableHeader.class.isInstance(obj)) {
                return false;
            }
            if (this.unused != ((IcmpV6DestinationUnreachableHeader) obj).unused) {
                z10 = false;
            }
            return z10;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.unused));
            return arrayList;
        }

        public int getUnused() {
            return this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV6DestinationUnreachablePacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6DestinationUnreachableHeader(builder);
    }

    private IcmpV6DestinationUnreachablePacket(IcmpV6DestinationUnreachableHeader icmpV6DestinationUnreachableHeader) {
        this.header = icmpV6DestinationUnreachableHeader;
    }

    private IcmpV6DestinationUnreachablePacket(IcmpV6DestinationUnreachableHeader icmpV6DestinationUnreachableHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV6DestinationUnreachableHeader;
    }

    public static IcmpV6DestinationUnreachablePacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV6DestinationUnreachableHeader icmpV6DestinationUnreachableHeader = new IcmpV6DestinationUnreachableHeader(bArr, i10, i11);
        int length = i11 - icmpV6DestinationUnreachableHeader.length();
        return length > 0 ? new IcmpV6DestinationUnreachablePacket(icmpV6DestinationUnreachableHeader, bArr, i10 + icmpV6DestinationUnreachableHeader.length(), length) : new IcmpV6DestinationUnreachablePacket(icmpV6DestinationUnreachableHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6DestinationUnreachableHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
