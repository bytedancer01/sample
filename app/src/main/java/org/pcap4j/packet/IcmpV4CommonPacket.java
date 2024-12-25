package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IcmpV4Code;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4CommonPacket.class */
public final class IcmpV4CommonPacket extends AbstractPacket {
    private static final long serialVersionUID = 7643067752830062365L;
    private final IcmpV4CommonHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4CommonPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<IcmpV4CommonPacket> {
        private short checksum;
        private IcmpV4Code code;
        private boolean correctChecksumAtBuild;
        private Packet.Builder payloadBuilder;
        private IcmpV4Type type;

        public Builder() {
        }

        private Builder(IcmpV4CommonPacket icmpV4CommonPacket) {
            this.type = icmpV4CommonPacket.header.type;
            this.code = icmpV4CommonPacket.header.code;
            this.checksum = icmpV4CommonPacket.header.checksum;
            this.payloadBuilder = icmpV4CommonPacket.payload != null ? icmpV4CommonPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4CommonPacket build() {
            return new IcmpV4CommonPacket(this);
        }

        public Builder checksum(short s10) {
            this.checksum = s10;
            return this;
        }

        public Builder code(IcmpV4Code icmpV4Code) {
            this.code = icmpV4Code;
            return this;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<IcmpV4CommonPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
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

        public Builder type(IcmpV4Type icmpV4Type) {
            this.type = icmpV4Type;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4CommonPacket$IcmpV4CommonHeader.class */
    public static final class IcmpV4CommonHeader extends AbstractPacket.AbstractHeader {
        private static final int CHECKSUM_OFFSET = 2;
        private static final int CHECKSUM_SIZE = 2;
        private static final int CODE_OFFSET = 1;
        private static final int CODE_SIZE = 1;
        private static final int ICMPV4_COMMON_HEADER_SIZE = 4;
        private static final int TYPE_OFFSET = 0;
        private static final int TYPE_SIZE = 1;
        private static final long serialVersionUID = 504881105187659087L;
        private final short checksum;
        private final IcmpV4Code code;
        private final IcmpV4Type type;

        private IcmpV4CommonHeader(Builder builder, byte[] bArr) {
            this.type = builder.type;
            this.code = builder.code;
            this.checksum = builder.correctChecksumAtBuild ? PacketPropertiesLoader.getInstance().icmpV4CalcChecksum() ? calcChecksum(buildRawData(true), bArr) : (short) 0 : builder.checksum;
        }

        private IcmpV4CommonHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                IcmpV4Type icmpV4Type = IcmpV4Type.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 0)));
                this.type = icmpV4Type;
                this.code = IcmpV4Code.getInstance(icmpV4Type.value(), Byte.valueOf(ByteArrays.getByte(bArr, i10 + 1)));
                this.checksum = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv4 common header(");
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
        public short calcChecksum(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length + length();
            int i10 = length;
            if (length % 2 != 0) {
                i10 = length + 1;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
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
            sb2.append("[ICMPv4 Common Header (");
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
            if (!IcmpV4CommonHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV4CommonHeader icmpV4CommonHeader = (IcmpV4CommonHeader) obj;
            if (this.checksum != icmpV4CommonHeader.checksum || !this.type.equals(icmpV4CommonHeader.type) || !this.code.equals(icmpV4CommonHeader.code)) {
                z10 = false;
            }
            return z10;
        }

        public short getChecksum() {
            return this.checksum;
        }

        public IcmpV4Code getCode() {
            return this.code;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public IcmpV4Type getType() {
            return this.type;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV4CommonPacket(Builder builder) {
        if (builder != null && builder.type != null && builder.code != null) {
            Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = build;
            this.header = new IcmpV4CommonHeader(builder, build != null ? build.getRawData() : new byte[0]);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.code: " + builder.code);
    }

    private IcmpV4CommonPacket(byte[] bArr, int i10, int i11) {
        IcmpV4CommonHeader icmpV4CommonHeader = new IcmpV4CommonHeader(bArr, i10, i11);
        this.header = icmpV4CommonHeader;
        int length = i11 - icmpV4CommonHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, IcmpV4Type.class).newInstance(bArr, i10 + icmpV4CommonHeader.length(), length, icmpV4CommonHeader.getType());
        } else {
            this.payload = null;
        }
    }

    public static IcmpV4CommonPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV4CommonPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4CommonHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(boolean z10) {
        Packet packet = this.payload;
        byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
        IcmpV4CommonHeader icmpV4CommonHeader = this.header;
        if (icmpV4CommonHeader.calcChecksum(icmpV4CommonHeader.getRawData(), rawData) == 0) {
            return true;
        }
        return this.header.checksum == 0 && z10;
    }
}
