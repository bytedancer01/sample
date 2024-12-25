package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.LinuxSllPacketType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.LinkLayerAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LinuxSllPacket.class */
public final class LinuxSllPacket extends AbstractPacket {
    private static final long serialVersionUID = -7743587634024281470L;
    private final LinuxSllHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LinuxSllPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] address;
        private short addressLength;
        private ArpHardwareType addressType;
        private LinuxSllPacketType packetType;
        private Packet.Builder payloadBuilder;
        private EtherType protocol;

        public Builder() {
        }

        private Builder(LinuxSllPacket linuxSllPacket) {
            this.packetType = linuxSllPacket.header.packetType;
            this.addressType = linuxSllPacket.header.addressType;
            this.addressLength = linuxSllPacket.header.addressLength;
            this.address = linuxSllPacket.header.addressField;
            this.protocol = linuxSllPacket.header.protocol;
            this.payloadBuilder = linuxSllPacket.payload != null ? linuxSllPacket.payload.getBuilder() : null;
        }

        public Builder address(byte[] bArr) {
            this.address = bArr;
            return this;
        }

        public Builder addressLength(short s10) {
            this.addressLength = s10;
            return this;
        }

        public Builder addressType(ArpHardwareType arpHardwareType) {
            this.addressType = arpHardwareType;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public LinuxSllPacket build() {
            return new LinuxSllPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder packetType(LinuxSllPacketType linuxSllPacketType) {
            this.packetType = linuxSllPacketType;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder protocol(EtherType etherType) {
            this.protocol = etherType;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LinuxSllPacket$LinuxSllHeader.class */
    public static final class LinuxSllHeader extends AbstractPacket.AbstractHeader {
        private static final int ADDR_OFFSET = 6;
        private static final int ADDR_SIZE = 8;
        private static final int HALEN_OFFSET = 4;
        private static final int HALEN_SIZE = 2;
        private static final int LINUX_SLL_HEADER_SIZE = 16;
        private static final int PHATYPE_OFFSET = 2;
        private static final int PHATYPE_SIZE = 2;
        private static final int PPKTTYPE_OFFSET = 0;
        private static final int PPKTTYPE_SIZE = 2;
        private static final int PROTOCOL_OFFSET = 14;
        private static final int PROTOCOL_SIZE = 2;
        private static final long serialVersionUID = -4946840737268934876L;
        private final LinkLayerAddress address;
        private final byte[] addressField;
        private final short addressLength;
        private final ArpHardwareType addressType;
        private final LinuxSllPacketType packetType;
        private final EtherType protocol;

        private LinuxSllHeader(Builder builder) {
            byte[] bArr = new byte[8];
            this.addressField = bArr;
            if (builder.address.length > 8) {
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append("address must not be longer than ");
                sb2.append(8);
                sb2.append(" but it is: ");
                sb2.append(ByteArrays.toHexString(builder.address, " "));
                throw new IllegalArgumentException(sb2.toString());
            }
            if ((builder.addressLength & 65535) > 8) {
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append("addressLength & 0xFFFF must not be longer than ");
                sb3.append(8);
                sb3.append(" but it is: ");
                sb3.append(builder.addressLength & 65535);
                throw new IllegalArgumentException(sb3.toString());
            }
            this.packetType = builder.packetType;
            this.addressType = builder.addressType;
            short s10 = builder.addressLength;
            this.addressLength = s10;
            System.arraycopy(builder.address, 0, bArr, 0, builder.address.length);
            this.protocol = builder.protocol;
            this.address = s10 == 0 ? null : ByteArrays.getLinkLayerAddress(bArr, 0, getAddressLengthAsInt());
        }

        private LinuxSllHeader(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[8];
            this.addressField = bArr2;
            if (i11 < 16) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build a Linux SLL header(");
                sb2.append(16);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.packetType = LinuxSllPacketType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
            this.addressType = ArpHardwareType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
            short s10 = ByteArrays.getShort(bArr, i10 + 4);
            this.addressLength = s10;
            if (getAddressLengthAsInt() <= 8) {
                int i12 = i10 + 6;
                System.arraycopy(bArr, i12, bArr2, 0, 8);
                this.address = s10 == 0 ? null : ByteArrays.getLinkLayerAddress(bArr, i12, getAddressLengthAsInt());
                this.protocol = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 14)));
                return;
            }
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("addressLength must not be longer than ");
            sb3.append(8);
            sb3.append(" but it is: ");
            sb3.append(getAddressLengthAsInt());
            throw new IllegalRawDataException(sb3.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[Linux SLL header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Packet Type: ");
            sb2.append(this.packetType);
            sb2.append(property);
            sb2.append("  Address Type: ");
            sb2.append(this.addressType);
            sb2.append(property);
            sb2.append("  Address Length: ");
            sb2.append(getAddressLengthAsInt());
            sb2.append(property);
            sb2.append("  Address: ");
            sb2.append(this.address);
            sb2.append(" (");
            sb2.append(ByteArrays.toHexString(this.addressField, " "));
            sb2.append(")");
            sb2.append(property);
            sb2.append("  Protocol: ");
            sb2.append(this.protocol);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((527 + this.packetType.hashCode()) * 31) + this.addressType.hashCode()) * 31) + this.addressLength) * 31) + Arrays.hashCode(this.addressField)) * 31) + this.protocol.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!LinuxSllHeader.class.isInstance(obj)) {
                return false;
            }
            LinuxSllHeader linuxSllHeader = (LinuxSllHeader) obj;
            if (!Arrays.equals(this.addressField, linuxSllHeader.addressField) || !this.packetType.equals(linuxSllHeader.packetType) || !this.protocol.equals(linuxSllHeader.protocol) || !this.addressType.equals(linuxSllHeader.addressType) || this.addressLength != linuxSllHeader.addressLength) {
                z10 = false;
            }
            return z10;
        }

        public LinkLayerAddress getAddress() {
            return this.address;
        }

        public byte[] getAddressField() {
            return ByteArrays.clone(this.addressField);
        }

        public short getAddressLength() {
            return this.addressLength;
        }

        public int getAddressLengthAsInt() {
            return this.addressLength & 65535;
        }

        public ArpHardwareType getAddressType() {
            return this.addressType;
        }

        public LinuxSllPacketType getPacketType() {
            return this.packetType;
        }

        public EtherType getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.packetType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.addressType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.addressLength));
            arrayList.add(this.addressField);
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 16;
        }
    }

    private LinuxSllPacket(Builder builder) {
        if (builder != null && builder.packetType != null && builder.addressType != null && builder.address != null && builder.protocol != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new LinuxSllHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.packetType: " + builder.packetType + " builder.addressType: " + builder.addressType + " builder.address: " + builder.address + " builder.protocol: " + builder.protocol);
    }

    private LinuxSllPacket(byte[] bArr, int i10, int i11) {
        LinuxSllHeader linuxSllHeader = new LinuxSllHeader(bArr, i10, i11);
        this.header = linuxSllHeader;
        int length = i11 - linuxSllHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i10 + linuxSllHeader.length(), length, linuxSllHeader.getProtocol());
        } else {
            this.payload = null;
        }
    }

    public static LinuxSllPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new LinuxSllPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public LinuxSllHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
