package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimeExceededPacket.class */
public final class IcmpV4TimeExceededPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = -7403391242412189831L;
    private final IcmpV4TimeExceededHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimeExceededPacket$Builder.class */
    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private int unused;

        public Builder() {
        }

        private Builder(IcmpV4TimeExceededPacket icmpV4TimeExceededPacket) {
            super(icmpV4TimeExceededPacket);
            this.unused = icmpV4TimeExceededPacket.getHeader().unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4TimeExceededPacket build() {
            return new IcmpV4TimeExceededPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        public Builder unused(int i10) {
            this.unused = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimeExceededPacket$IcmpV4TimeExceededHeader.class */
    public static final class IcmpV4TimeExceededHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV4_TIME_EXCEEDED_HEADER_SIZE = 4;
        private static final int UNUSED_OFFSET = 0;
        private static final int UNUSED_SIZE = 4;
        private static final long serialVersionUID = -4958423484698708497L;
        private final int unused;

        private IcmpV4TimeExceededHeader(Builder builder) {
            this.unused = builder.unused;
        }

        private IcmpV4TimeExceededHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.unused = ByteArrays.getInt(bArr, i10 + 0);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv4 Time Exceeded Header(");
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
            sb2.append("[ICMPv4 Time Exceeded Header (");
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
            if (!IcmpV4TimeExceededHeader.class.isInstance(obj)) {
                return false;
            }
            if (this.unused != ((IcmpV4TimeExceededHeader) obj).unused) {
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

    private IcmpV4TimeExceededPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4TimeExceededHeader(builder);
    }

    private IcmpV4TimeExceededPacket(IcmpV4TimeExceededHeader icmpV4TimeExceededHeader) {
        this.header = icmpV4TimeExceededHeader;
    }

    private IcmpV4TimeExceededPacket(IcmpV4TimeExceededHeader icmpV4TimeExceededHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV4TimeExceededHeader;
    }

    public static IcmpV4TimeExceededPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV4TimeExceededHeader icmpV4TimeExceededHeader = new IcmpV4TimeExceededHeader(bArr, i10, i11);
        int length = i11 - icmpV4TimeExceededHeader.length();
        return length > 0 ? new IcmpV4TimeExceededPacket(icmpV4TimeExceededHeader, bArr, i10 + icmpV4TimeExceededHeader.length(), length) : new IcmpV4TimeExceededPacket(icmpV4TimeExceededHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4TimeExceededHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
