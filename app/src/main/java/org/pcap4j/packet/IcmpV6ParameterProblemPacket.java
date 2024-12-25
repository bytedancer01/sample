package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV6InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6ParameterProblemPacket.class */
public final class IcmpV6ParameterProblemPacket extends IcmpV6InvokingPacketPacket {
    private static final long serialVersionUID = -7613453030792043352L;
    private final IcmpV6ParameterProblemHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6ParameterProblemPacket$Builder.class */
    public static final class Builder extends IcmpV6InvokingPacketPacket.Builder {
        private int pointer;

        public Builder() {
        }

        private Builder(IcmpV6ParameterProblemPacket icmpV6ParameterProblemPacket) {
            super(icmpV6ParameterProblemPacket);
            this.pointer = icmpV6ParameterProblemPacket.getHeader().pointer;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6ParameterProblemPacket build() {
            return new IcmpV6ParameterProblemPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        public Builder pointer(int i10) {
            this.pointer = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6ParameterProblemPacket$IcmpV6ParameterProblemHeader.class */
    public static final class IcmpV6ParameterProblemHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV6_PARAMETER_PROBLEM_HEADER_SIZE = 4;
        private static final int POINTER_OFFSET = 0;
        private static final int POINTER_SIZE = 4;
        private static final long serialVersionUID = -3743068221589212767L;
        private final int pointer;

        private IcmpV6ParameterProblemHeader(Builder builder) {
            this.pointer = builder.pointer;
        }

        private IcmpV6ParameterProblemHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.pointer = ByteArrays.getInt(bArr, i10 + 0);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv6 Parameter Problem Header(");
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
            sb2.append("[ICMPv6 Parameter Problem Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Pointer: ");
            sb2.append(this.pointer);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.pointer;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IcmpV6ParameterProblemHeader.class.isInstance(obj)) {
                return false;
            }
            if (this.pointer != ((IcmpV6ParameterProblemHeader) obj).pointer) {
                z10 = false;
            }
            return z10;
        }

        public int getPointer() {
            return this.pointer;
        }

        public long getPointerAsLong() {
            return this.pointer & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.pointer));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV6ParameterProblemPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV6ParameterProblemHeader(builder);
    }

    private IcmpV6ParameterProblemPacket(IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader) {
        this.header = icmpV6ParameterProblemHeader;
    }

    private IcmpV6ParameterProblemPacket(IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV6ParameterProblemHeader;
    }

    public static IcmpV6ParameterProblemPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV6ParameterProblemHeader icmpV6ParameterProblemHeader = new IcmpV6ParameterProblemHeader(bArr, i10, i11);
        int length = i11 - icmpV6ParameterProblemHeader.length();
        return length > 0 ? new IcmpV6ParameterProblemPacket(icmpV6ParameterProblemHeader, bArr, i10 + icmpV6ParameterProblemHeader.length(), length) : new IcmpV6ParameterProblemPacket(icmpV6ParameterProblemHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6ParameterProblemHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV6InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
