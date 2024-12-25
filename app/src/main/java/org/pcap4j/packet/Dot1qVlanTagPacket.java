package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot1qVlanTagPacket.class */
public final class Dot1qVlanTagPacket extends AbstractPacket {
    private static final long serialVersionUID = 1522789079803339400L;
    private final Dot1qVlanTagHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot1qVlanTagPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private boolean cfi;
        private Packet.Builder payloadBuilder;
        private byte priority;
        private EtherType type;
        private short vid;

        public Builder() {
        }

        private Builder(Dot1qVlanTagPacket dot1qVlanTagPacket) {
            this.priority = dot1qVlanTagPacket.header.priority;
            this.cfi = dot1qVlanTagPacket.header.cfi;
            this.vid = dot1qVlanTagPacket.header.vid;
            this.type = dot1qVlanTagPacket.header.type;
            this.payloadBuilder = dot1qVlanTagPacket.payload != null ? dot1qVlanTagPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Dot1qVlanTagPacket build() {
            return new Dot1qVlanTagPacket(this);
        }

        public Builder cfi(boolean z10) {
            this.cfi = z10;
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

        public Builder priority(byte b10) {
            this.priority = b10;
            return this;
        }

        public Builder type(EtherType etherType) {
            this.type = etherType;
            return this;
        }

        public Builder vid(short s10) {
            this.vid = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot1qVlanTagPacket$Dot1qVlanTagHeader.class */
    public static final class Dot1qVlanTagHeader extends AbstractPacket.AbstractHeader {
        private static final int DOT1Q_TAG_HEADER_SIZE = 4;
        private static final int PRIORITY_AND_CFI_AND_VID_OFFSET = 0;
        private static final int PRIORITY_AND_CFI_AND_VID_SIZE = 2;
        private static final int TYPE_OFFSET = 2;
        private static final int TYPE_SIZE = 2;
        private static final long serialVersionUID = 7130569411806479522L;
        private final boolean cfi;
        private final byte priority;
        private final EtherType type;
        private final short vid;

        private Dot1qVlanTagHeader(Builder builder) {
            if ((builder.priority & 248) != 0) {
                throw new IllegalArgumentException("invalid priority: " + ((int) builder.priority));
            }
            if ((builder.vid & 61440) != 0) {
                throw new IllegalArgumentException("invalid vid: " + ((int) builder.vid));
            }
            this.priority = builder.priority;
            this.cfi = builder.cfi;
            this.vid = builder.vid;
            this.type = builder.type;
        }

        private Dot1qVlanTagHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                short s10 = ByteArrays.getShort(bArr, i10 + 0);
                this.priority = (byte) ((57344 & s10) >> 13);
                this.cfi = ((s10 & 4096) >> 12) != 1 ? false : true;
                this.vid = (short) (s10 & 4095);
                this.type = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
                return;
            }
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build an IEEE802.1Q Tag header(");
            sb2.append(4);
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
            sb2.append("[IEEE802.1Q Tag header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Priority: ");
            sb2.append((int) this.priority);
            sb2.append(property);
            sb2.append("  CFI: ");
            sb2.append(this.cfi ? 1 : 0);
            sb2.append(property);
            sb2.append("  VID: ");
            sb2.append(getVidAsInt());
            sb2.append(property);
            sb2.append("  Type: ");
            sb2.append(this.type);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((527 + this.priority) * 31) + (this.cfi ? 1231 : 1237)) * 31) + this.vid) * 31) + this.type.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Dot1qVlanTagHeader.class.isInstance(obj)) {
                return false;
            }
            Dot1qVlanTagHeader dot1qVlanTagHeader = (Dot1qVlanTagHeader) obj;
            if (this.vid != dot1qVlanTagHeader.vid || !this.type.equals(dot1qVlanTagHeader.type) || this.priority != dot1qVlanTagHeader.priority || this.cfi != dot1qVlanTagHeader.cfi) {
                z10 = false;
            }
            return z10;
        }

        public boolean getCfi() {
            return this.cfi;
        }

        public byte getPriority() {
            return this.priority;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((short) ((this.priority << 13) | ((this.cfi ? 1 : 0) << 12) | this.vid)));
            arrayList.add(ByteArrays.toByteArray(this.type.value().shortValue()));
            return arrayList;
        }

        public EtherType getType() {
            return this.type;
        }

        public short getVid() {
            return this.vid;
        }

        public int getVidAsInt() {
            return this.vid & 4095;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private Dot1qVlanTagPacket(Builder builder) {
        if (builder != null && builder.type != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new Dot1qVlanTagHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type);
    }

    private Dot1qVlanTagPacket(byte[] bArr, int i10, int i11) {
        Dot1qVlanTagHeader dot1qVlanTagHeader = new Dot1qVlanTagHeader(bArr, i10, i11);
        this.header = dot1qVlanTagHeader;
        int length = i11 - dot1qVlanTagHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i10 + dot1qVlanTagHeader.length(), length, dot1qVlanTagHeader.getType());
        } else {
            this.payload = null;
        }
    }

    public static Dot1qVlanTagPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot1qVlanTagPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Dot1qVlanTagHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
