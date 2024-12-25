package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtFragmentPacket.class */
public final class IpV6ExtFragmentPacket extends AbstractPacket {
    private static final long serialVersionUID = 8789423734186381406L;
    private final IpV6ExtFragmentHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtFragmentPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private short fragmentOffset;
        private int identification;

        /* renamed from: m */
        private boolean f36256m;
        private IpNumber nextHeader;
        private Packet.Builder payloadBuilder;
        private byte res;
        private byte reserved;

        public Builder() {
        }

        public Builder(IpV6ExtFragmentPacket ipV6ExtFragmentPacket) {
            this.nextHeader = ipV6ExtFragmentPacket.header.nextHeader;
            this.reserved = ipV6ExtFragmentPacket.header.reserved;
            this.fragmentOffset = ipV6ExtFragmentPacket.header.fragmentOffset;
            this.res = ipV6ExtFragmentPacket.header.res;
            this.f36256m = ipV6ExtFragmentPacket.header.f36257m;
            this.identification = ipV6ExtFragmentPacket.header.identification;
            this.payloadBuilder = ipV6ExtFragmentPacket.payload != null ? ipV6ExtFragmentPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtFragmentPacket build() {
            return new IpV6ExtFragmentPacket(this);
        }

        public Builder fragmentOffset(short s10) {
            this.fragmentOffset = s10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder identification(int i10) {
            this.identification = i10;
            return this;
        }

        /* renamed from: m */
        public Builder m32160m(boolean z10) {
            this.f36256m = z10;
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

        public Builder res(byte b10) {
            this.res = b10;
            return this;
        }

        public Builder reserved(byte b10) {
            this.reserved = b10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtFragmentPacket$IpV6ExtFragmentHeader.class */
    public static final class IpV6ExtFragmentHeader extends AbstractPacket.AbstractHeader {
        private static final int FFRAGMENT_OFFSET_AND_RES_AND_M_SIZE = 2;
        private static final int FRAGMENT_OFFSET_AND_RES_AND_M_OFFSET = 2;
        private static final int IDENTIFICATION_OFFSET = 4;
        private static final int IDENTIFICATION_SIZE = 4;
        private static final int IPV6_EXT_FRAGMENT_HEADER_SIZE = 8;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int RESERVED_OFFSET = 1;
        private static final int RESERVED_SIZE = 1;
        private static final long serialVersionUID = 3488980383672562461L;
        private final short fragmentOffset;
        private final int identification;

        /* renamed from: m */
        private final boolean f36257m;
        private final IpNumber nextHeader;
        private final byte res;
        private final byte reserved;

        private IpV6ExtFragmentHeader(Builder builder) {
            if ((builder.fragmentOffset & 57344) != 0) {
                throw new IllegalArgumentException("Invalid fragmentOffset: " + ((int) builder.fragmentOffset));
            }
            if ((builder.res & 65532) != 0) {
                throw new IllegalArgumentException("Invalid res: " + ((int) builder.res));
            }
            this.nextHeader = builder.nextHeader;
            this.reserved = builder.reserved;
            this.fragmentOffset = builder.fragmentOffset;
            this.res = builder.res;
            this.f36257m = builder.f36256m;
            this.identification = builder.identification;
        }

        private IpV6ExtFragmentHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 8) {
                this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 0)));
                this.reserved = ByteArrays.getByte(bArr, i10 + 1);
                short s10 = ByteArrays.getShort(bArr, i10 + 2);
                this.fragmentOffset = (short) ((65528 & s10) >> 3);
                boolean z10 = true;
                this.res = (byte) ((s10 & 6) >> 1);
                this.f36257m = (s10 & 1) != 1 ? false : z10;
                this.identification = ByteArrays.getInt(bArr, i10 + 4);
                return;
            }
            StringBuilder sb2 = new StringBuilder(110);
            sb2.append("The data is too short to build an IPv6 fragment header(");
            sb2.append(8);
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
            sb2.append("[IPv6 Fragment Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Next Header: ");
            sb2.append(this.nextHeader);
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append(ByteArrays.toHexString(this.reserved, " "));
            sb2.append(property);
            sb2.append("  Fragment Offset: ");
            sb2.append((int) this.fragmentOffset);
            sb2.append(property);
            sb2.append("  Res: ");
            sb2.append(ByteArrays.toHexString(this.res, " "));
            sb2.append(property);
            sb2.append("  M: ");
            sb2.append(this.f36257m);
            sb2.append(property);
            sb2.append("  Identification: ");
            sb2.append(this.identification);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int hashCode = this.nextHeader.hashCode();
            byte b10 = this.reserved;
            short s10 = this.fragmentOffset;
            return ((((((((((527 + hashCode) * 31) + b10) * 31) + s10) * 31) + this.res) * 31) + (this.f36257m ? 1231 : 1237)) * 31) + this.identification;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IpV6ExtFragmentHeader.class.isInstance(obj)) {
                return false;
            }
            IpV6ExtFragmentHeader ipV6ExtFragmentHeader = (IpV6ExtFragmentHeader) obj;
            if (this.fragmentOffset != ipV6ExtFragmentHeader.fragmentOffset || this.identification != ipV6ExtFragmentHeader.identification || !this.nextHeader.equals(ipV6ExtFragmentHeader.nextHeader) || this.f36257m != ipV6ExtFragmentHeader.f36257m || this.reserved != ipV6ExtFragmentHeader.reserved || this.res != ipV6ExtFragmentHeader.res) {
                z10 = false;
            }
            return z10;
        }

        public short getFragmentOffset() {
            return this.fragmentOffset;
        }

        public int getIdentification() {
            return this.identification;
        }

        public boolean getM() {
            return this.f36257m;
        }

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            arrayList.add(ByteArrays.toByteArray((short) ((this.fragmentOffset << 3) | (this.res << 1) | (this.f36257m ? 1 : 0))));
            arrayList.add(ByteArrays.toByteArray(this.identification));
            return arrayList;
        }

        public byte getRes() {
            return this.res;
        }

        public byte getReserved() {
            return this.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 8;
        }
    }

    private IpV6ExtFragmentPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new IpV6ExtFragmentHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader);
    }

    private IpV6ExtFragmentPacket(byte[] bArr, int i10, int i11) {
        IpV6ExtFragmentHeader ipV6ExtFragmentHeader = new IpV6ExtFragmentHeader(bArr, i10, i11);
        this.header = ipV6ExtFragmentHeader;
        int length = i11 - ipV6ExtFragmentHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10 + ipV6ExtFragmentHeader.length(), length, NotApplicable.FRAGMENTED);
        } else {
            this.payload = null;
        }
    }

    public static IpV6ExtFragmentPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6ExtFragmentPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtFragmentHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
