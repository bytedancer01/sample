package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4ParameterProblemPacket.class */
public final class IcmpV4ParameterProblemPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = 5369176981310492220L;
    private final IcmpV4ParameterProblemHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4ParameterProblemPacket$Builder.class */
    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private byte pointer;
        private int unused;

        public Builder() {
        }

        private Builder(IcmpV4ParameterProblemPacket icmpV4ParameterProblemPacket) {
            super(icmpV4ParameterProblemPacket);
            this.pointer = icmpV4ParameterProblemPacket.header.pointer;
            this.unused = icmpV4ParameterProblemPacket.header.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4ParameterProblemPacket build() {
            return new IcmpV4ParameterProblemPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        public Builder pointer(byte b10) {
            this.pointer = b10;
            return this;
        }

        public Builder unused(int i10) {
            this.unused = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4ParameterProblemPacket$IcmpV4ParameterProblemHeader.class */
    public static final class IcmpV4ParameterProblemHeader extends AbstractPacket.AbstractHeader {
        private static final int ICMPV4_PARAMETER_PROBLEM_HEADER_SIZE = 4;
        private static final int POINTER_AND_UNUSED_OFFSET = 0;
        private static final int POINTER_AND_UNUSED_SIZE = 4;
        private static final long serialVersionUID = 7946304491624744071L;
        private final byte pointer;
        private final int unused;

        private IcmpV4ParameterProblemHeader(Builder builder) {
            if ((builder.unused & DefaultRenderer.BACKGROUND_COLOR) == 0) {
                this.pointer = builder.pointer;
                this.unused = builder.unused;
            } else {
                throw new IllegalArgumentException("Invalid unused: " + builder.unused);
            }
        }

        private IcmpV4ParameterProblemHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                int i12 = ByteArrays.getInt(bArr, i10 + 0);
                this.pointer = (byte) (i12 >>> 24);
                this.unused = i12 & 16777215;
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv4 Parameter Problem Header(");
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
            sb2.append("[ICMPv4 Parameter Problem Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Pointer: ");
            sb2.append(getPointerAsInt());
            sb2.append(property);
            sb2.append("  Unused: ");
            sb2.append(this.unused);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.pointer) * 31) + this.unused;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IcmpV4ParameterProblemHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader = (IcmpV4ParameterProblemHeader) obj;
            if (this.pointer != icmpV4ParameterProblemHeader.pointer || this.unused != icmpV4ParameterProblemHeader.unused) {
                z10 = false;
            }
            return z10;
        }

        public byte getPointer() {
            return this.pointer;
        }

        public int getPointerAsInt() {
            return this.pointer & 255;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((this.pointer << 24) | this.unused));
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

    private IcmpV4ParameterProblemPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4ParameterProblemHeader(builder);
    }

    private IcmpV4ParameterProblemPacket(IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader) {
        this.header = icmpV4ParameterProblemHeader;
    }

    private IcmpV4ParameterProblemPacket(IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV4ParameterProblemHeader;
    }

    public static IcmpV4ParameterProblemPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV4ParameterProblemHeader icmpV4ParameterProblemHeader = new IcmpV4ParameterProblemHeader(bArr, i10, i11);
        int length = i11 - icmpV4ParameterProblemHeader.length();
        return length > 0 ? new IcmpV4ParameterProblemPacket(icmpV4ParameterProblemHeader, bArr, i10 + icmpV4ParameterProblemHeader.length(), length) : new IcmpV4ParameterProblemPacket(icmpV4ParameterProblemHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4ParameterProblemHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
