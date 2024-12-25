package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/EthernetPacket.class */
public final class EthernetPacket extends AbstractPacket {
    private static final int MIN_ETHERNET_PAYLOAD_LENGTH = 46;
    private static final long serialVersionUID = 3461432646404254300L;
    private final EthernetHeader header;
    private final byte[] pad;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/EthernetPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private MacAddress dstAddr;
        private byte[] pad;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private MacAddress srcAddr;
        private EtherType type;

        public Builder() {
        }

        private Builder(EthernetPacket ethernetPacket) {
            this.dstAddr = ethernetPacket.header.dstAddr;
            this.srcAddr = ethernetPacket.header.srcAddr;
            this.type = ethernetPacket.header.type;
            this.payloadBuilder = ethernetPacket.payload != null ? ethernetPacket.payload.getBuilder() : null;
            this.pad = ethernetPacket.pad;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public EthernetPacket build() {
            return new EthernetPacket(this);
        }

        public Builder dstAddr(MacAddress macAddress) {
            this.dstAddr = macAddress;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z10) {
            this.paddingAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder srcAddr(MacAddress macAddress) {
            this.srcAddr = macAddress;
            return this;
        }

        public Builder type(EtherType etherType) {
            this.type = etherType;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/EthernetPacket$EthernetHeader.class */
    public static final class EthernetHeader extends AbstractPacket.AbstractHeader {
        private static final int DST_ADDR_OFFSET = 0;
        private static final int DST_ADDR_SIZE = 6;
        private static final int ETHERNET_HEADER_SIZE = 14;
        private static final int SRC_ADDR_OFFSET = 6;
        private static final int SRC_ADDR_SIZE = 6;
        private static final int TYPE_OFFSET = 12;
        private static final int TYPE_SIZE = 2;
        private static final long serialVersionUID = -8271269099161190389L;
        private final MacAddress dstAddr;
        private final MacAddress srcAddr;
        private final EtherType type;

        private EthernetHeader(Builder builder) {
            this.dstAddr = builder.dstAddr;
            this.srcAddr = builder.srcAddr;
            this.type = builder.type;
        }

        private EthernetHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 14) {
                this.dstAddr = ByteArrays.getMacAddress(bArr, i10 + 0);
                this.srcAddr = ByteArrays.getMacAddress(bArr, i10 + 6);
                this.type = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 12)));
                return;
            }
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The data is too short to build an Ethernet header(");
            sb2.append(14);
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
            sb2.append("[Ethernet Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Destination address: ");
            sb2.append(this.dstAddr);
            sb2.append(property);
            sb2.append("  Source address: ");
            sb2.append(this.srcAddr);
            sb2.append(property);
            sb2.append("  Type: ");
            sb2.append(this.type);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.dstAddr.hashCode()) * 31) + this.srcAddr.hashCode()) * 31) + this.type.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!EthernetHeader.class.isInstance(obj)) {
                return false;
            }
            EthernetHeader ethernetHeader = (EthernetHeader) obj;
            if (!this.dstAddr.equals(ethernetHeader.dstAddr) || !this.srcAddr.equals(ethernetHeader.srcAddr) || !this.type.equals(ethernetHeader.type)) {
                z10 = false;
            }
            return z10;
        }

        public MacAddress getDstAddr() {
            return this.dstAddr;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.type.value().shortValue()));
            return arrayList;
        }

        public MacAddress getSrcAddr() {
            return this.srcAddr;
        }

        public EtherType getType() {
            return this.type;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 14;
        }
    }

    private EthernetPacket(Builder builder) {
        if (builder == null || builder.dstAddr == null || builder.srcAddr == null || builder.type == null) {
            throw new NullPointerException("builder: " + builder + " builder.dstAddr: " + builder.dstAddr + " builder.srcAddr: " + builder.srcAddr + " builder.type: " + builder.type);
        }
        if (!builder.paddingAtBuild && builder.pad == null) {
            throw new NullPointerException("builder.pad must not be null if builder.paddingAtBuild is false");
        }
        Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.payload = build;
        this.header = new EthernetHeader(builder);
        int length = build != null ? build.length() : 0;
        if (!builder.paddingAtBuild) {
            byte[] bArr = new byte[builder.pad.length];
            this.pad = bArr;
            System.arraycopy(builder.pad, 0, bArr, 0, builder.pad.length);
        } else if (length < 46) {
            this.pad = new byte[46 - length];
        } else {
            this.pad = new byte[0];
        }
    }

    private EthernetPacket(byte[] bArr, int i10, int i11) {
        EthernetHeader ethernetHeader = new EthernetHeader(bArr, i10, i11);
        this.header = ethernetHeader;
        if ((ethernetHeader.getType().value().shortValue() & 65535) > 1500) {
            int length = i11 - ethernetHeader.length();
            if (length <= 0) {
                this.payload = null;
                this.pad = new byte[0];
                return;
            }
            int length2 = i10 + ethernetHeader.length();
            Packet packet = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, length2, length, ethernetHeader.getType());
            this.payload = packet;
            int length3 = length - packet.length();
            if (length3 > 0) {
                this.pad = ByteArrays.getSubArray(bArr, length2 + packet.length(), length3);
                return;
            } else {
                this.pad = new byte[0];
                return;
            }
        }
        short shortValue = ethernetHeader.getType().value().shortValue();
        int length4 = (i11 - ethernetHeader.length()) - shortValue;
        int length5 = i10 + ethernetHeader.length();
        if (length4 < 0) {
            throw new IllegalRawDataException("The value of the ether type (length) field seems to be wrong: " + ethernetHeader.getType().value());
        }
        if (shortValue > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, length5, shortValue, ethernetHeader.getType());
        } else {
            this.payload = null;
        }
        if (length4 > 0) {
            this.pad = ByteArrays.getSubArray(bArr, length5 + shortValue, length4);
        } else {
            this.pad = new byte[0];
        }
    }

    public static EthernetPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new EthernetPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] buildRawData = super.buildRawData();
        byte[] bArr = this.pad;
        if (bArr.length != 0) {
            System.arraycopy(bArr, 0, buildRawData, buildRawData.length - bArr.length, bArr.length);
        }
        return buildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.header.toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb2.append(packet.toString());
        }
        if (this.pad.length != 0) {
            String property = System.getProperty("line.separator");
            sb2.append("[Ethernet Pad (");
            sb2.append(this.pad.length);
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Hex stream: ");
            sb2.append(ByteArrays.toHexString(this.pad, " "));
            sb2.append(property);
        }
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return (super.calcHashCode() * 31) + Arrays.hashCode(this.pad);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        return super.calcLength() + this.pad.length;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Arrays.equals(this.pad, ((EthernetPacket) obj).pad);
        }
        return false;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public EthernetHeader getHeader() {
        return this.header;
    }

    public byte[] getPad() {
        byte[] bArr = this.pad;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
