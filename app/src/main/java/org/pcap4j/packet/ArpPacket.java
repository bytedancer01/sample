package org.pcap4j.packet;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.ArpOperation;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/ArpPacket.class */
public final class ArpPacket extends AbstractPacket {
    private static final long serialVersionUID = -7754807127571498700L;
    private final ArpHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/ArpPacket$ArpHeader.class */
    public static final class ArpHeader extends AbstractPacket.AbstractHeader {
        private static final int ARP_HEADER_SIZE = 28;
        private static final int DST_HARDWARE_ADDR_OFFSET = 18;
        private static final int DST_HARDWARE_ADDR_SIZE = 6;
        private static final int DST_PROTOCOL_ADDR_OFFSET = 24;
        private static final int DST_PROTOCOL_ADDR_SIZE = 4;
        private static final int HARDWARE_TYPE_OFFSET = 0;
        private static final int HARDWARE_TYPE_SIZE = 2;
        private static final int HW_ADDR_LENGTH_OFFSET = 4;
        private static final int HW_ADDR_LENGTH_SIZE = 1;
        private static final int OPERATION_OFFSET = 6;
        private static final int OPERATION_SIZE = 2;
        private static final int PROTOCOL_TYPE_OFFSET = 2;
        private static final int PROTOCOL_TYPE_SIZE = 2;
        private static final int PROTO_ADDR_LENGTH_OFFSET = 5;
        private static final int PROTO_ADDR_LENGTH_SIZE = 1;
        private static final int SRC_HARDWARE_ADDR_OFFSET = 8;
        private static final int SRC_HARDWARE_ADDR_SIZE = 6;
        private static final int SRC_PROTOCOL_ADDR_OFFSET = 14;
        private static final int SRC_PROTOCOL_ADDR_SIZE = 4;
        private static final long serialVersionUID = -6744946002881067732L;
        private final MacAddress dstHardwareAddr;
        private final InetAddress dstProtocolAddr;
        private final byte hardwareAddrLength;
        private final ArpHardwareType hardwareType;
        private final ArpOperation operation;
        private final byte protocolAddrLength;
        private final EtherType protocolType;
        private final MacAddress srcHardwareAddr;
        private final InetAddress srcProtocolAddr;

        private ArpHeader(Builder builder) {
            this.hardwareType = builder.hardwareType;
            this.protocolType = builder.protocolType;
            this.hardwareAddrLength = builder.hardwareAddrLength;
            this.protocolAddrLength = builder.protocolAddrLength;
            this.operation = builder.operation;
            this.srcHardwareAddr = builder.srcHardwareAddr;
            this.srcProtocolAddr = builder.srcProtocolAddr;
            this.dstHardwareAddr = builder.dstHardwareAddr;
            this.dstProtocolAddr = builder.dstProtocolAddr;
        }

        private ArpHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 28) {
                this.hardwareType = ArpHardwareType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
                this.protocolType = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
                this.hardwareAddrLength = ByteArrays.getByte(bArr, i10 + 4);
                this.protocolAddrLength = ByteArrays.getByte(bArr, i10 + 5);
                this.operation = ArpOperation.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 6)));
                this.srcHardwareAddr = ByteArrays.getMacAddress(bArr, i10 + 8);
                this.srcProtocolAddr = ByteArrays.getInet4Address(bArr, i10 + 14);
                this.dstHardwareAddr = ByteArrays.getMacAddress(bArr, i10 + 18);
                this.dstProtocolAddr = ByteArrays.getInet4Address(bArr, i10 + 24);
                return;
            }
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build an ARP header(");
            sb2.append(28);
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
            sb2.append("[ARP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Hardware type: ");
            sb2.append(this.hardwareType);
            sb2.append(property);
            sb2.append("  Protocol type: ");
            sb2.append(this.protocolType);
            sb2.append(property);
            sb2.append("  Hardware address length: ");
            sb2.append(getHardwareAddrLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Protocol address length: ");
            sb2.append(getProtocolAddrLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Operation: ");
            sb2.append(this.operation);
            sb2.append(property);
            sb2.append("  Source hardware address: ");
            sb2.append(this.srcHardwareAddr);
            sb2.append(property);
            sb2.append("  Source protocol address: ");
            sb2.append(this.srcProtocolAddr);
            sb2.append(property);
            sb2.append("  Destination hardware address: ");
            sb2.append(this.dstHardwareAddr);
            sb2.append(property);
            sb2.append("  Destination protocol address: ");
            sb2.append(this.dstProtocolAddr);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((((((((((527 + this.hardwareType.hashCode()) * 31) + this.protocolType.hashCode()) * 31) + this.hardwareAddrLength) * 31) + this.protocolAddrLength) * 31) + this.operation.hashCode()) * 31) + this.srcHardwareAddr.hashCode()) * 31) + this.srcProtocolAddr.hashCode()) * 31) + this.dstHardwareAddr.hashCode()) * 31) + this.dstProtocolAddr.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!ArpHeader.class.isInstance(obj)) {
                return false;
            }
            ArpHeader arpHeader = (ArpHeader) obj;
            if (!this.operation.equals(arpHeader.getOperation()) || !this.srcHardwareAddr.equals(arpHeader.srcHardwareAddr) || !this.srcProtocolAddr.equals(arpHeader.srcProtocolAddr) || !this.dstHardwareAddr.equals(arpHeader.dstHardwareAddr) || !this.dstProtocolAddr.equals(arpHeader.dstProtocolAddr) || !this.hardwareType.equals(arpHeader.hardwareType) || !this.protocolType.equals(arpHeader.protocolType) || this.hardwareAddrLength != arpHeader.hardwareAddrLength || this.protocolAddrLength != arpHeader.protocolAddrLength) {
                z10 = false;
            }
            return z10;
        }

        public MacAddress getDstHardwareAddr() {
            return this.dstHardwareAddr;
        }

        public InetAddress getDstProtocolAddr() {
            return this.dstProtocolAddr;
        }

        public byte getHardwareAddrLength() {
            return this.hardwareAddrLength;
        }

        public int getHardwareAddrLengthAsInt() {
            return this.hardwareAddrLength & 255;
        }

        public ArpHardwareType getHardwareType() {
            return this.hardwareType;
        }

        public ArpOperation getOperation() {
            return this.operation;
        }

        public byte getProtocolAddrLength() {
            return this.protocolAddrLength;
        }

        public int getProtocolAddrLengthAsInt() {
            return this.protocolAddrLength & 255;
        }

        public EtherType getProtocolType() {
            return this.protocolType;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.hardwareType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.protocolType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.hardwareAddrLength));
            arrayList.add(ByteArrays.toByteArray(this.protocolAddrLength));
            arrayList.add(ByteArrays.toByteArray(this.operation.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.srcHardwareAddr));
            arrayList.add(ByteArrays.toByteArray(this.srcProtocolAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstHardwareAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstProtocolAddr));
            return arrayList;
        }

        public MacAddress getSrcHardwareAddr() {
            return this.srcHardwareAddr;
        }

        public InetAddress getSrcProtocolAddr() {
            return this.srcProtocolAddr;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 28;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/ArpPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private MacAddress dstHardwareAddr;
        private InetAddress dstProtocolAddr;
        private byte hardwareAddrLength;
        private ArpHardwareType hardwareType;
        private ArpOperation operation;
        private byte protocolAddrLength;
        private EtherType protocolType;
        private MacAddress srcHardwareAddr;
        private InetAddress srcProtocolAddr;

        public Builder() {
        }

        private Builder(ArpPacket arpPacket) {
            this.hardwareType = arpPacket.header.hardwareType;
            this.protocolType = arpPacket.header.protocolType;
            this.hardwareAddrLength = arpPacket.header.hardwareAddrLength;
            this.protocolAddrLength = arpPacket.header.protocolAddrLength;
            this.operation = arpPacket.header.operation;
            this.srcHardwareAddr = arpPacket.header.srcHardwareAddr;
            this.srcProtocolAddr = arpPacket.header.srcProtocolAddr;
            this.dstHardwareAddr = arpPacket.header.dstHardwareAddr;
            this.dstProtocolAddr = arpPacket.header.dstProtocolAddr;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public ArpPacket build() {
            return new ArpPacket(this);
        }

        public Builder dstHardwareAddr(MacAddress macAddress) {
            this.dstHardwareAddr = macAddress;
            return this;
        }

        public Builder dstProtocolAddr(InetAddress inetAddress) {
            this.dstProtocolAddr = inetAddress;
            return this;
        }

        public Builder hardwareAddrLength(byte b10) {
            this.hardwareAddrLength = b10;
            return this;
        }

        public Builder hardwareType(ArpHardwareType arpHardwareType) {
            this.hardwareType = arpHardwareType;
            return this;
        }

        public Builder operation(ArpOperation arpOperation) {
            this.operation = arpOperation;
            return this;
        }

        public Builder protocolAddrLength(byte b10) {
            this.protocolAddrLength = b10;
            return this;
        }

        public Builder protocolType(EtherType etherType) {
            this.protocolType = etherType;
            return this;
        }

        public Builder srcHardwareAddr(MacAddress macAddress) {
            this.srcHardwareAddr = macAddress;
            return this;
        }

        public Builder srcProtocolAddr(InetAddress inetAddress) {
            this.srcProtocolAddr = inetAddress;
            return this;
        }
    }

    private ArpPacket(Builder builder) {
        if (builder != null && builder.hardwareType != null && builder.protocolType != null && builder.operation != null && builder.srcHardwareAddr != null && builder.srcProtocolAddr != null && builder.dstHardwareAddr != null && builder.dstProtocolAddr != null) {
            this.header = new ArpHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.hardwareType: " + builder.hardwareType + " builder.protocolType: " + builder.protocolType + " builder.operation: " + builder.operation + " builder.srcHardwareAddr: " + builder.srcHardwareAddr + " builder.srcProtocolAddr: " + builder.srcProtocolAddr + " builder.dstHardwareAddr: " + builder.dstHardwareAddr + " builder.dstProtocolAddr: " + builder.dstProtocolAddr);
    }

    private ArpPacket(byte[] bArr, int i10, int i11) {
        this.header = new ArpHeader(bArr, i10, i11);
    }

    public static ArpPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new ArpPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public ArpHeader getHeader() {
        return this.header;
    }
}
