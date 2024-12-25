package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV6RoutingType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtRoutingPacket.class */
public final class IpV6ExtRoutingPacket extends AbstractPacket {
    private static final long serialVersionUID = -4408422883412551431L;
    private final IpV6ExtRoutingHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtRoutingPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtRoutingPacket> {
        private boolean correctLengthAtBuild;
        private IpV6RoutingData data;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private IpV6RoutingType routingType;
        private byte segmentsLeft;

        public Builder() {
        }

        public Builder(IpV6ExtRoutingPacket ipV6ExtRoutingPacket) {
            this.nextHeader = ipV6ExtRoutingPacket.header.nextHeader;
            this.hdrExtLen = ipV6ExtRoutingPacket.header.hdrExtLen;
            this.routingType = ipV6ExtRoutingPacket.header.routingType;
            this.segmentsLeft = ipV6ExtRoutingPacket.header.segmentsLeft;
            this.data = ipV6ExtRoutingPacket.header.data;
            this.payloadBuilder = ipV6ExtRoutingPacket.payload != null ? ipV6ExtRoutingPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtRoutingPacket build() {
            return new IpV6ExtRoutingPacket(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtRoutingPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(IpV6RoutingData ipV6RoutingData) {
            this.data = ipV6RoutingData;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hdrExtLen(byte b10) {
            this.hdrExtLen = b10;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder routingType(IpV6RoutingType ipV6RoutingType) {
            this.routingType = ipV6RoutingType;
            return this;
        }

        public Builder segmentsLeft(byte b10) {
            this.segmentsLeft = b10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtRoutingPacket$IpV6ExtRoutingHeader.class */
    public static final class IpV6ExtRoutingHeader extends AbstractPacket.AbstractHeader {
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int ROUTING_TYPE_OFFSET = 2;
        private static final int ROUTING_TYPE_SIZE = 1;
        private static final int SEGMENTS_LEFT_OFFSET = 3;
        private static final int SEGMENTS_LEFT_SIZE = 1;
        private static final int TYPE_SPECIFIC_DATA_OFFSET = 4;
        private static final long serialVersionUID = -72622140516174483L;
        private final IpV6RoutingData data;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;
        private final IpV6RoutingType routingType;
        private final byte segmentsLeft;

        private IpV6ExtRoutingHeader(Builder builder) {
            if (builder.data.length() < 4) {
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append("data length must be more than 3. data: ");
                sb2.append(builder.data);
                throw new IllegalArgumentException(sb2.toString());
            }
            if ((builder.data.length() + 4) % 8 != 0) {
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append("(builder.data.length() + 8 ) % 8 must be 0. data: ");
                sb3.append(builder.data);
                throw new IllegalArgumentException(sb3.toString());
            }
            this.nextHeader = builder.nextHeader;
            this.routingType = builder.routingType;
            this.segmentsLeft = builder.segmentsLeft;
            IpV6RoutingData ipV6RoutingData = builder.data;
            this.data = ipV6RoutingData;
            this.hdrExtLen = builder.correctLengthAtBuild ? (byte) (((ipV6RoutingData.length() + 4) / 8) - 1) : builder.hdrExtLen;
        }

        private IpV6ExtRoutingHeader(byte[] bArr, int i10, int i11) {
            if (i11 < 4) {
                StringBuilder sb2 = new StringBuilder(110);
                sb2.append("The data length of IPv6 routing header is must be more than 3. data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 0)));
            this.hdrExtLen = ByteArrays.getByte(bArr, i10 + 1);
            int hdrExtLenAsInt = (getHdrExtLenAsInt() + 1) * 8;
            if (i11 >= hdrExtLenAsInt) {
                IpV6RoutingType ipV6RoutingType = IpV6RoutingType.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 2)));
                this.routingType = ipV6RoutingType;
                this.segmentsLeft = ByteArrays.getByte(bArr, i10 + 3);
                this.data = (IpV6RoutingData) PacketFactories.getFactory(IpV6RoutingData.class, IpV6RoutingType.class).newInstance(bArr, i10 + 4, hdrExtLenAsInt - 4, ipV6RoutingType);
                return;
            }
            StringBuilder sb3 = new StringBuilder(110);
            sb3.append("The data is too short to build an IPv6 routing header(");
            sb3.append(hdrExtLenAsInt);
            sb3.append(" bytes). data: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[IPv6 Routing Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Next Header: ");
            sb2.append(this.nextHeader);
            sb2.append(property);
            sb2.append("  Hdr Ext Len: ");
            sb2.append(getHdrExtLenAsInt());
            sb2.append(" (");
            sb2.append((getHdrExtLenAsInt() + 1) * 8);
            sb2.append(" [bytes])");
            sb2.append(property);
            sb2.append("  Routing Type: ");
            sb2.append(this.routingType);
            sb2.append(property);
            sb2.append("  Segments Left: ");
            sb2.append(getSegmentsLeftAsInt());
            sb2.append(property);
            sb2.append("  type-specific data: ");
            sb2.append(this.data);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((527 + this.nextHeader.hashCode()) * 31) + this.hdrExtLen) * 31) + this.routingType.hashCode()) * 31) + this.segmentsLeft) * 31) + this.data.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length() + 4;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtRoutingHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtRoutingHeader ipV6ExtRoutingHeader = (IpV6ExtRoutingHeader) obj;
            if (!this.nextHeader.equals(ipV6ExtRoutingHeader.nextHeader) || !this.data.equals(ipV6ExtRoutingHeader.data) || !this.routingType.equals(ipV6ExtRoutingHeader.routingType) || this.segmentsLeft != ipV6ExtRoutingHeader.segmentsLeft || this.hdrExtLen != ipV6ExtRoutingHeader.hdrExtLen) {
                z10 = false;
            }
            return z10;
        }

        public IpV6RoutingData getData() {
            return this.data;
        }

        public byte getHdrExtLen() {
            return this.hdrExtLen;
        }

        public int getHdrExtLenAsInt() {
            return this.hdrExtLen & 255;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hdrExtLen));
            arrayList.add(ByteArrays.toByteArray(this.routingType.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.segmentsLeft));
            arrayList.add(this.data.getRawData());
            return arrayList;
        }

        public IpV6RoutingType getRoutingType() {
            return this.routingType;
        }

        public byte getSegmentsLeft() {
            return this.segmentsLeft;
        }

        public int getSegmentsLeftAsInt() {
            return this.segmentsLeft & 255;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtRoutingPacket$IpV6RoutingData.class */
    public interface IpV6RoutingData extends Serializable {
        byte[] getRawData();

        int length();
    }

    private IpV6ExtRoutingPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.data != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtRoutingHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.data: " + builder.data);
    }

    private IpV6ExtRoutingPacket(byte[] bArr, int i10, int i11) {
        Object newInstance;
        Packet packet;
        IpV6ExtRoutingHeader ipV6ExtRoutingHeader = new IpV6ExtRoutingHeader(bArr, i10, i11);
        this.header = ipV6ExtRoutingHeader;
        int length = i11 - ipV6ExtRoutingHeader.length();
        if (length <= 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6ExtRoutingHeader.getNextHeader()).equals(factory.getTargetClass())) {
            Packet packet2 = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6ExtRoutingHeader.length() + i10, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            packet = packet2;
            newInstance = packet2 instanceof IllegalPacket ? factory.newInstance(bArr, i10 + ipV6ExtRoutingHeader.length(), length) : newInstance;
            this.payload = packet;
        }
        newInstance = factory.newInstance(bArr, i10 + ipV6ExtRoutingHeader.length(), length, ipV6ExtRoutingHeader.getNextHeader());
        packet = (Packet) newInstance;
        this.payload = packet;
    }

    public static IpV6ExtRoutingPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6ExtRoutingPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtRoutingHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
