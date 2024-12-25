package org.pcap4j.packet;

import java.io.Serializable;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IcmpV6Code;
import org.pcap4j.packet.namednumber.IcmpV6Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6CommonPacket.class */
public final class IcmpV6CommonPacket extends AbstractPacket {
    private static final long serialVersionUID = 7643067752830062365L;
    private final IcmpV6CommonHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6CommonPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<IcmpV6CommonPacket> {
        private short checksum;
        private IcmpV6Code code;
        private boolean correctChecksumAtBuild;
        private Inet6Address dstAddr;
        private Packet.Builder payloadBuilder;
        private Inet6Address srcAddr;
        private IcmpV6Type type;

        public Builder() {
        }

        private Builder(IcmpV6CommonPacket icmpV6CommonPacket) {
            this.type = icmpV6CommonPacket.header.type;
            this.code = icmpV6CommonPacket.header.code;
            this.checksum = icmpV6CommonPacket.header.checksum;
            this.payloadBuilder = icmpV6CommonPacket.payload != null ? icmpV6CommonPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV6CommonPacket build() {
            return new IcmpV6CommonPacket(this);
        }

        public Builder checksum(short s10) {
            this.checksum = s10;
            return this;
        }

        public Builder code(IcmpV6Code icmpV6Code) {
            this.code = icmpV6Code;
            return this;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<IcmpV6CommonPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        public Builder dstAddr(Inet6Address inet6Address) {
            this.dstAddr = inet6Address;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder srcAddr(Inet6Address inet6Address) {
            this.srcAddr = inet6Address;
            return this;
        }

        public Builder type(IcmpV6Type icmpV6Type) {
            this.type = icmpV6Type;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6CommonPacket$IcmpV6CommonHeader.class */
    public static final class IcmpV6CommonHeader extends AbstractPacket.AbstractHeader {
        private static final int CHECKSUM_OFFSET = 2;
        private static final int CHECKSUM_SIZE = 2;
        private static final int CODE_OFFSET = 1;
        private static final int CODE_SIZE = 1;
        private static final int ICMPV6_COMMON_HEADER_SIZE = 4;
        private static final int ICMPV6_PSEUDO_HEADER_SIZE = 40;
        private static final int TYPE_OFFSET = 0;
        private static final int TYPE_SIZE = 1;
        private static final long serialVersionUID = -7473322861606186L;
        private final short checksum;
        private final IcmpV6Code code;
        private final IcmpV6Type type;

        private IcmpV6CommonHeader(Builder builder, byte[] bArr) {
            this.type = builder.type;
            this.code = builder.code;
            this.checksum = builder.correctChecksumAtBuild ? PacketPropertiesLoader.getInstance().icmpV6CalcChecksum() ? calcChecksum(builder.srcAddr, builder.dstAddr, buildRawData(true), bArr) : (short) 0 : builder.checksum;
        }

        private IcmpV6CommonHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                IcmpV6Type icmpV6Type = IcmpV6Type.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 0)));
                this.type = icmpV6Type;
                this.code = IcmpV6Code.getInstance(icmpV6Type.value(), Byte.valueOf(ByteArrays.getByte(bArr, i10 + 1)));
                this.checksum = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv6 common header(");
            sb2.append(4);
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
        public short calcChecksum(Inet6Address inet6Address, Inet6Address inet6Address2, byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            int i10;
            int length = bArr2.length + length();
            if (length % 2 != 0) {
                i10 = length + 1;
                bArr3 = new byte[i10 + 40];
            } else {
                bArr3 = new byte[length + 40];
                i10 = length;
            }
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            System.arraycopy(inet6Address.getAddress(), 0, bArr3, i10, inet6Address.getAddress().length);
            int length2 = i10 + inet6Address.getAddress().length;
            System.arraycopy(inet6Address2.getAddress(), 0, bArr3, length2, inet6Address2.getAddress().length);
            int length3 = length2 + inet6Address2.getAddress().length + 3;
            bArr3[length3] = IpNumber.ICMPV6.value().byteValue();
            System.arraycopy(ByteArrays.toByteArray((short) length), 0, bArr3, length3 + 1, 2);
            return ByteArrays.calcChecksum(bArr3);
        }

        private List<byte[]> getRawFields(boolean z10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.type.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.code.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(z10 ? (short) 0 : this.checksum));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv6 Common Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Type: ");
            sb2.append(this.type);
            sb2.append(property);
            sb2.append("  Code: ");
            sb2.append(this.code);
            sb2.append(property);
            sb2.append("  Checksum: 0x");
            sb2.append(ByteArrays.toHexString(this.checksum, ""));
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.type.hashCode()) * 31) + this.code.hashCode()) * 31) + this.checksum;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!IcmpV6CommonHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV6CommonHeader icmpV6CommonHeader = (IcmpV6CommonHeader) obj;
            if (this.checksum != icmpV6CommonHeader.checksum || !this.type.equals(icmpV6CommonHeader.type) || !this.code.equals(icmpV6CommonHeader.code)) {
                z10 = false;
            }
            return z10;
        }

        public short getChecksum() {
            return this.checksum;
        }

        public IcmpV6Code getCode() {
            return this.code;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public IcmpV6Type getType() {
            return this.type;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV6CommonPacket$IpV6NeighborDiscoveryOption.class */
    public interface IpV6NeighborDiscoveryOption extends Serializable {
        byte[] getRawData();

        IpV6NeighborDiscoveryOptionType getType();

        int length();
    }

    private IcmpV6CommonPacket(Builder builder) {
        if (builder == null || builder.type == null || builder.code == null) {
            throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.code: " + builder.code);
        }
        if (!builder.correctChecksumAtBuild || (builder.srcAddr != null && builder.dstAddr != null)) {
            Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = build;
            this.header = new IcmpV6CommonHeader(builder, build.getRawData());
        } else {
            throw new NullPointerException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
        }
    }

    private IcmpV6CommonPacket(byte[] bArr, int i10, int i11) {
        IcmpV6CommonHeader icmpV6CommonHeader = new IcmpV6CommonHeader(bArr, i10, i11);
        this.header = icmpV6CommonHeader;
        int length = i11 - icmpV6CommonHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, IcmpV6Type.class).newInstance(bArr, i10 + icmpV6CommonHeader.length(), length, icmpV6CommonHeader.getType());
        } else {
            this.payload = null;
        }
    }

    public static IcmpV6CommonPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV6CommonPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV6CommonHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(Inet6Address inet6Address, Inet6Address inet6Address2, boolean z10) {
        if (inet6Address == null || inet6Address2 == null) {
            throw new NullPointerException("srcAddr: " + inet6Address + " dstAddr: " + inet6Address2);
        }
        if (inet6Address.getClass().isInstance(inet6Address2)) {
            Packet packet = this.payload;
            byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
            IcmpV6CommonHeader icmpV6CommonHeader = this.header;
            if (icmpV6CommonHeader.calcChecksum(inet6Address, inet6Address2, icmpV6CommonHeader.getRawData(), rawData) == 0) {
                return true;
            }
            return this.header.checksum == 0 && z10;
        }
        throw new IllegalArgumentException("srcAddr: " + inet6Address + " dstAddr: " + inet6Address2);
    }
}
