package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtUnknownPacket.class */
public final class IpV6ExtUnknownPacket extends AbstractPacket {
    private static final long serialVersionUID = -7055290165058067091L;
    private final IpV6ExtUnknownHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtUnknownPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtUnknownPacket> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        public Builder(IpV6ExtUnknownPacket ipV6ExtUnknownPacket) {
            this.nextHeader = ipV6ExtUnknownPacket.header.nextHeader;
            this.hdrExtLen = ipV6ExtUnknownPacket.header.hdrExtLen;
            this.data = ipV6ExtUnknownPacket.header.data;
            this.payloadBuilder = ipV6ExtUnknownPacket.payload != null ? ipV6ExtUnknownPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtUnknownPacket build() {
            return new IpV6ExtUnknownPacket(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtUnknownPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
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
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtUnknownPacket$IpV6ExtUnknownHeader.class */
    public static final class IpV6ExtUnknownHeader extends AbstractPacket.AbstractHeader {
        private static final int DATA_OFFSET = 2;
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final long serialVersionUID = -4314577591889991355L;
        private final byte[] data;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;

        private IpV6ExtUnknownHeader(Builder builder) {
            if (builder.data.length < 6) {
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append("data length must be more than 5. data: ");
                sb2.append(ByteArrays.toHexString(builder.data, " "));
                throw new IllegalArgumentException(sb2.toString());
            }
            if ((builder.data.length + 2) % 8 != 0) {
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append("(builder.data.length + 2) % 8 must be 0. data: ");
                sb3.append(builder.data);
                throw new IllegalArgumentException(sb3.toString());
            }
            this.nextHeader = builder.nextHeader;
            byte[] clone = ByteArrays.clone(builder.data);
            this.data = clone;
            this.hdrExtLen = builder.correctLengthAtBuild ? (byte) (((clone.length + 2) / 8) - 1) : builder.hdrExtLen;
        }

        private IpV6ExtUnknownHeader(byte[] bArr, int i10, int i11) {
            if (i11 < 4) {
                StringBuilder sb2 = new StringBuilder(110);
                sb2.append("The data length of this header is must be more than 3. data: ");
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
                this.data = ByteArrays.getSubArray(bArr, i10 + 2, hdrExtLenAsInt - 2);
                return;
            }
            StringBuilder sb3 = new StringBuilder(110);
            sb3.append("The data is too short to build this header(");
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
            sb2.append("[IPv6 Unknown Extension Header (");
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
            sb2.append("  data: ");
            sb2.append(ByteArrays.toHexString(this.data, " "));
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.nextHeader.hashCode()) * 31) + this.hdrExtLen) * 31) + Arrays.hashCode(this.data);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length + 2;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtUnknownHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtUnknownHeader ipV6ExtUnknownHeader = (IpV6ExtUnknownHeader) obj;
            if (!this.nextHeader.equals(ipV6ExtUnknownHeader.nextHeader) || this.hdrExtLen != ipV6ExtUnknownHeader.hdrExtLen || !Arrays.equals(this.data, ipV6ExtUnknownHeader.data)) {
                z10 = false;
            }
            return z10;
        }

        public byte[] getData() {
            return ByteArrays.clone(this.data);
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
            arrayList.add(getData());
            return arrayList;
        }
    }

    private IpV6ExtUnknownPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.data != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtUnknownHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.data: " + builder.data);
    }

    private IpV6ExtUnknownPacket(byte[] bArr, int i10, int i11) {
        Object newInstance;
        Packet packet;
        IpV6ExtUnknownHeader ipV6ExtUnknownHeader = new IpV6ExtUnknownHeader(bArr, i10, i11);
        this.header = ipV6ExtUnknownHeader;
        int length = i11 - ipV6ExtUnknownHeader.length();
        if (length <= 0) {
            this.payload = null;
            return;
        }
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipV6ExtUnknownHeader.getNextHeader()).equals(factory.getTargetClass())) {
            Packet packet2 = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV6ExtUnknownHeader.length() + i10, length, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            packet = packet2;
            newInstance = packet2 instanceof IllegalPacket ? factory.newInstance(bArr, i10 + ipV6ExtUnknownHeader.length(), length) : newInstance;
            this.payload = packet;
        }
        newInstance = PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, i10 + ipV6ExtUnknownHeader.length(), length, ipV6ExtUnknownHeader.getNextHeader());
        packet = (Packet) newInstance;
        this.payload = packet;
    }

    public static IpV6ExtUnknownPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6ExtUnknownPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtUnknownHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
