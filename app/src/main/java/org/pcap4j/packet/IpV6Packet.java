package org.pcap4j.packet;

import java.io.Serializable;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Packet.class */
public final class IpV6Packet extends AbstractPacket implements IpPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV6Packet.class);
    private static final long serialVersionUID = 1837307843939979665L;
    private final IpV6Header header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Packet$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6Packet> {
        private boolean correctLengthAtBuild;
        private Inet6Address dstAddr;
        private IpV6FlowLabel flowLabel;
        private byte hopLimit;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private short payloadLength;
        private Inet6Address srcAddr;
        private IpV6TrafficClass trafficClass;
        private IpVersion version;

        public Builder() {
        }

        public Builder(IpV6Packet ipV6Packet) {
            this.version = ipV6Packet.header.version;
            this.trafficClass = ipV6Packet.header.trafficClass;
            this.flowLabel = ipV6Packet.header.flowLabel;
            this.payloadLength = ipV6Packet.header.payloadLength;
            this.nextHeader = ipV6Packet.header.nextHeader;
            this.hopLimit = ipV6Packet.header.hopLimit;
            this.srcAddr = ipV6Packet.header.srcAddr;
            this.dstAddr = ipV6Packet.header.dstAddr;
            this.payloadBuilder = ipV6Packet.payload != null ? ipV6Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6Packet build() {
            return new IpV6Packet(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6Packet> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dstAddr(Inet6Address inet6Address) {
            this.dstAddr = inet6Address;
            return this;
        }

        public Builder flowLabel(IpV6FlowLabel ipV6FlowLabel) {
            this.flowLabel = ipV6FlowLabel;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hopLimit(byte b10) {
            this.hopLimit = b10;
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

        public Builder payloadLength(short s10) {
            this.payloadLength = s10;
            return this;
        }

        public Builder srcAddr(Inet6Address inet6Address) {
            this.srcAddr = inet6Address;
            return this;
        }

        public Builder trafficClass(IpV6TrafficClass ipV6TrafficClass) {
            this.trafficClass = ipV6TrafficClass;
            return this;
        }

        public Builder version(IpVersion ipVersion) {
            this.version = ipVersion;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Packet$IpV6FlowLabel.class */
    public interface IpV6FlowLabel extends Serializable {
        int value();
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Packet$IpV6Header.class */
    public static final class IpV6Header extends AbstractPacket.AbstractHeader implements IpPacket.IpHeader {
        private static final int DST_ADDR_OFFSET = 24;
        private static final int DST_ADDR_SIZE = 16;
        private static final int HOP_LIMIT_OFFSET = 7;
        private static final int HOP_LIMIT_SIZE = 1;
        private static final int IPV6_HEADER_SIZE = 40;
        private static final int NEXT_HEADER_OFFSET = 6;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int PAYLOAD_LENGTH_OFFSET = 4;
        private static final int PAYLOAD_LENGTH_SIZE = 2;
        private static final int SRC_ADDR_OFFSET = 8;
        private static final int SRC_ADDR_SIZE = 16;
        private static final int VERSION_AND_TRAFFIC_CLASS_AND_FLOW_LABEL_OFFSET = 0;
        private static final int VERSION_AND_TRAFFIC_CLASS_AND_FLOW_LABEL_SIZE = 4;
        private static final long serialVersionUID = 6587661877529988149L;
        private final Inet6Address dstAddr;
        private final IpV6FlowLabel flowLabel;
        private final byte hopLimit;
        private final IpNumber nextHeader;
        private final short payloadLength;
        private final Inet6Address srcAddr;
        private final IpV6TrafficClass trafficClass;
        private final IpVersion version;

        private IpV6Header(Builder builder, Packet packet) {
            this.version = builder.version;
            this.trafficClass = builder.trafficClass;
            this.flowLabel = builder.flowLabel;
            this.nextHeader = builder.nextHeader;
            this.hopLimit = builder.hopLimit;
            this.srcAddr = builder.srcAddr;
            this.dstAddr = builder.dstAddr;
            this.payloadLength = (!builder.correctLengthAtBuild || packet == null) ? builder.payloadLength : (short) packet.length();
        }

        private IpV6Header(byte[] bArr, int i10, int i11) {
            if (i11 < 40) {
                StringBuilder sb2 = new StringBuilder(110);
                sb2.append("The data is too short to build an IPv6 header(");
                sb2.append(40);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            int i12 = i10 + 0;
            int i13 = ByteArrays.getInt(bArr, i12);
            this.version = IpVersion.getInstance(Byte.valueOf((byte) (i13 >>> 28)));
            this.trafficClass = (IpV6TrafficClass) PacketFactories.getFactory(IpV6TrafficClass.class, NotApplicable.class).newInstance(new byte[]{(byte) ((i13 & 267386880) >> 20)}, 0, 1);
            this.flowLabel = (IpV6FlowLabel) PacketFactories.getFactory(IpV6FlowLabel.class, NotApplicable.class).newInstance(bArr, i12, 4);
            this.payloadLength = ByteArrays.getShort(bArr, i10 + 4);
            this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 6)));
            this.hopLimit = ByteArrays.getByte(bArr, i10 + 7);
            this.srcAddr = ByteArrays.getInet6Address(bArr, i10 + 8);
            this.dstAddr = ByteArrays.getInet6Address(bArr, i10 + 24);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[IPv6 Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Version: ");
            sb2.append(this.version);
            sb2.append(property);
            sb2.append("  Traffic Class: ");
            sb2.append(this.trafficClass);
            sb2.append(property);
            sb2.append("  Flow Label: ");
            sb2.append(this.flowLabel);
            sb2.append(property);
            sb2.append("  Payload length: ");
            sb2.append(getPayloadLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Next Header: ");
            sb2.append(this.nextHeader);
            sb2.append(property);
            sb2.append("  Hop Limit: ");
            sb2.append(getHopLimitAsInt());
            sb2.append(property);
            sb2.append("  Source address: ");
            sb2.append(this.srcAddr);
            sb2.append(property);
            sb2.append("  Destination address: ");
            sb2.append(this.dstAddr);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((((((((527 + this.version.hashCode()) * 31) + this.trafficClass.hashCode()) * 31) + this.flowLabel.hashCode()) * 31) + this.payloadLength) * 31) + this.nextHeader.hashCode()) * 31) + this.hopLimit) * 31) + this.srcAddr.hashCode()) * 31) + this.dstAddr.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IpV6Header.class.isInstance(obj)) {
                return false;
            }
            IpV6Header ipV6Header = (IpV6Header) obj;
            if (!this.srcAddr.equals(ipV6Header.srcAddr) || !this.dstAddr.equals(ipV6Header.dstAddr) || this.payloadLength != ipV6Header.payloadLength || this.hopLimit != ipV6Header.hopLimit || !this.nextHeader.equals(ipV6Header.nextHeader) || !this.trafficClass.equals(ipV6Header.trafficClass) || !this.flowLabel.equals(ipV6Header.flowLabel) || !this.version.equals(ipV6Header.version)) {
                z10 = false;
            }
            return z10;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet6Address getDstAddr() {
            return this.dstAddr;
        }

        public IpV6FlowLabel getFlowLabel() {
            return this.flowLabel;
        }

        public byte getHopLimit() {
            return this.hopLimit;
        }

        public int getHopLimitAsInt() {
            return this.hopLimit & 255;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        public short getPayloadLength() {
            return this.payloadLength;
        }

        public int getPayloadLengthAsInt() {
            return this.payloadLength & 65535;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpNumber getProtocol() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((this.version.value().byteValue() << 28) | ((this.trafficClass.value() & 255) << 20) | this.flowLabel.value()));
            arrayList.add(ByteArrays.toByteArray(this.payloadLength));
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hopLimit));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            return arrayList;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet6Address getSrcAddr() {
            return this.srcAddr;
        }

        public IpV6TrafficClass getTrafficClass() {
            return this.trafficClass;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpVersion getVersion() {
            return this.version;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 40;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Packet$IpV6TrafficClass.class */
    public interface IpV6TrafficClass extends Serializable {
        byte value();
    }

    private IpV6Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.trafficClass != null && builder.flowLabel != null && builder.nextHeader != null && builder.srcAddr != null && builder.dstAddr != null) {
            Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = build;
            this.header = new IpV6Header(builder, build);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.version: " + builder.version + " builder.trafficClass: " + builder.trafficClass + " builder.flowLabel: " + builder.flowLabel + " builder.nextHeader: " + builder.nextHeader + " builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
    }

    private IpV6Packet(byte[] bArr, int i10, int i11) {
        Object newInstance;
        Packet packet;
        IpV6Header ipV6Header = new IpV6Header(bArr, i10, i11);
        this.header = ipV6Header;
        int length = i11 - ipV6Header.length();
        if (ipV6Header.getPayloadLengthAsInt() == 0) {
            logger.debug("Total Length is 0. Assuming segmentation offload to be working.");
        } else {
            int payloadLengthAsInt = ipV6Header.getPayloadLengthAsInt();
            if (payloadLengthAsInt < 0) {
                throw new IllegalRawDataException("The value of payload length field seems to be wrong: " + ipV6Header.getPayloadLengthAsInt());
            }
            if (payloadLengthAsInt <= length) {
                length = payloadLengthAsInt;
            }
        }
        if (length == 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6Header.getNextHeader()).equals(factory.getTargetClass())) {
            Packet packet2 = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6Header.length() + i10, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            packet = packet2;
            newInstance = packet2 instanceof IllegalPacket ? factory.newInstance(bArr, i10 + ipV6Header.length(), length) : newInstance;
            this.payload = packet;
        }
        newInstance = factory.newInstance(bArr, i10 + ipV6Header.length(), length, ipV6Header.getNextHeader());
        packet = (Packet) newInstance;
        this.payload = packet;
    }

    public static IpV6Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6Packet(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6Header getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
