package org.pcap4j.packet;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UdpPacket.class */
public final class UdpPacket extends AbstractPacket implements TransportPacket {
    private static final long serialVersionUID = 4638029542367352625L;
    private final UdpHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UdpPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<UdpPacket>, ChecksumBuilder<UdpPacket> {
        private short checksum;
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private InetAddress dstAddr;
        private UdpPort dstPort;
        private short length;
        private Packet.Builder payloadBuilder;
        private InetAddress srcAddr;
        private UdpPort srcPort;

        public Builder() {
        }

        public Builder(UdpPacket udpPacket) {
            this.srcPort = udpPacket.header.srcPort;
            this.dstPort = udpPacket.header.dstPort;
            this.length = udpPacket.header.length;
            this.checksum = udpPacket.header.checksum;
            this.payloadBuilder = udpPacket.payload != null ? udpPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public UdpPacket build() {
            return new UdpPacket(this);
        }

        public Builder checksum(short s10) {
            this.checksum = s10;
            return this;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<UdpPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UdpPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dstAddr(InetAddress inetAddress) {
            this.dstAddr = inetAddress;
            return this;
        }

        public Builder dstPort(UdpPort udpPort) {
            this.dstPort = udpPort;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder length(short s10) {
            this.length = s10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder srcAddr(InetAddress inetAddress) {
            this.srcAddr = inetAddress;
            return this;
        }

        public Builder srcPort(UdpPort udpPort) {
            this.srcPort = udpPort;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UdpPacket$UdpHeader.class */
    public static final class UdpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int CHECKSUM_OFFSET = 6;
        private static final int CHECKSUM_SIZE = 2;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int IPV4_PSEUDO_HEADER_SIZE = 12;
        private static final int IPV6_PSEUDO_HEADER_SIZE = 40;
        private static final int LENGTH_OFFSET = 4;
        private static final int LENGTH_SIZE = 2;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int UCP_HEADER_SIZE = 8;
        private static final long serialVersionUID = -1746545325551976324L;
        private final short checksum;
        private final UdpPort dstPort;
        private final short length;
        private final UdpPort srcPort;

        private UdpHeader(Builder builder, byte[] bArr) {
            this.srcPort = builder.srcPort;
            this.dstPort = builder.dstPort;
            this.length = builder.correctLengthAtBuild ? (short) (bArr.length + length()) : builder.length;
            this.checksum = builder.correctChecksumAtBuild ? (((builder.srcAddr instanceof Inet4Address) && PacketPropertiesLoader.getInstance().udpV4CalcChecksum()) || ((builder.srcAddr instanceof Inet6Address) && PacketPropertiesLoader.getInstance().udpV6CalcChecksum())) ? calcChecksum(builder.srcAddr, builder.dstAddr, buildRawData(true), bArr) : (short) 0 : builder.checksum;
        }

        private UdpHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 8) {
                this.srcPort = UdpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
                this.dstPort = UdpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
                this.length = ByteArrays.getShort(bArr, i10 + 4);
                this.checksum = ByteArrays.getShort(bArr, i10 + 6);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build a UDP header(");
            sb2.append(8);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        private byte[] buildRawData(boolean z10) {
            return ByteArrays.concatenate(getRawFields(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short calcChecksum(InetAddress inetAddress, InetAddress inetAddress2, byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            int i10;
            int length = bArr2.length + length();
            boolean z10 = inetAddress instanceof Inet4Address;
            int i11 = z10 ? 12 : 40;
            if (length % 2 != 0) {
                int i12 = length + 1;
                bArr3 = new byte[i11 + i12];
                i10 = i12;
            } else {
                bArr3 = new byte[i11 + length];
                i10 = length;
            }
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            System.arraycopy(inetAddress.getAddress(), 0, bArr3, i10, inetAddress.getAddress().length);
            int length2 = i10 + inetAddress.getAddress().length;
            System.arraycopy(inetAddress2.getAddress(), 0, bArr3, length2, inetAddress2.getAddress().length);
            int length3 = length2 + inetAddress2.getAddress().length;
            int i13 = z10 ? length3 + 1 : length3 + 3;
            bArr3[i13] = IpNumber.UDP.value().byteValue();
            System.arraycopy(ByteArrays.toByteArray((short) length), 0, bArr3, i13 + 1, 2);
            return ByteArrays.calcChecksum(bArr3);
        }

        private List<byte[]> getRawFields(boolean z10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.length));
            arrayList.add(ByteArrays.toByteArray(z10 ? (short) 0 : this.checksum));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[UDP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Source port: ");
            sb2.append(getSrcPort());
            sb2.append(property);
            sb2.append("  Destination port: ");
            sb2.append(getDstPort());
            sb2.append(property);
            sb2.append("  Length: ");
            sb2.append(getLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Checksum: 0x");
            sb2.append(ByteArrays.toHexString(this.checksum, ""));
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((527 + this.srcPort.hashCode()) * 31) + this.dstPort.hashCode()) * 31) + this.length) * 31) + this.checksum;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!UdpHeader.class.isInstance(obj)) {
                return false;
            }
            UdpHeader udpHeader = (UdpHeader) obj;
            if (this.checksum != udpHeader.checksum || this.length != udpHeader.length || !this.srcPort.equals(udpHeader.srcPort) || !this.dstPort.equals(udpHeader.dstPort)) {
                z10 = false;
            }
            return z10;
        }

        public short getChecksum() {
            return this.checksum;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public UdpPort getDstPort() {
            return this.dstPort;
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return this.length & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public UdpPort getSrcPort() {
            return this.srcPort;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 8;
        }
    }

    private UdpPacket(Builder builder) {
        if (builder == null || builder.srcPort == null || builder.dstPort == null) {
            throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
        }
        if (builder.correctChecksumAtBuild) {
            if (builder.srcAddr == null || builder.dstAddr == null) {
                throw new NullPointerException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
            }
            if (!builder.srcAddr.getClass().isInstance(builder.dstAddr)) {
                throw new IllegalArgumentException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
            }
        }
        Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.payload = build;
        this.header = new UdpHeader(builder, build != null ? build.getRawData() : new byte[0]);
    }

    private UdpPacket(byte[] bArr, int i10, int i11) {
        UdpHeader udpHeader = new UdpHeader(bArr, i10, i11);
        this.header = udpHeader;
        int lengthAsInt = udpHeader.getLengthAsInt() - udpHeader.length();
        if (lengthAsInt < 0) {
            throw new IllegalRawDataException("The value of length field seems to be wrong: " + udpHeader.getLengthAsInt());
        }
        int length = lengthAsInt > i11 - udpHeader.length() ? i11 - udpHeader.length() : lengthAsInt;
        if (length == 0) {
            this.payload = null;
        } else {
            PacketFactory factory = PacketFactories.getFactory(Packet.class, UdpPort.class);
            this.payload = (Packet) factory.newInstance(bArr, i10 + udpHeader.length(), length, factory.getTargetClass(udpHeader.getDstPort()).equals(factory.getTargetClass()) ? udpHeader.getSrcPort() : udpHeader.getDstPort());
        }
    }

    public static UdpPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UdpPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public UdpHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(InetAddress inetAddress, InetAddress inetAddress2, boolean z10) {
        if (inetAddress == null || inetAddress2 == null) {
            throw new NullPointerException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        if (inetAddress.getClass().isInstance(inetAddress2)) {
            Packet packet = this.payload;
            byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
            UdpHeader udpHeader = this.header;
            if (udpHeader.calcChecksum(inetAddress, inetAddress2, udpHeader.getRawData(), rawData) == 0) {
                return true;
            }
            return this.header.checksum == 0 && z10;
        }
        throw new IllegalArgumentException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
    }
}
