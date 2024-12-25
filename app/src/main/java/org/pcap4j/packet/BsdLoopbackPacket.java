package org.pcap4j.packet;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.ProtocolFamily;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/BsdLoopbackPacket.class */
public final class BsdLoopbackPacket extends AbstractPacket {
    private static final long serialVersionUID = 5348192606048946251L;
    private final BsdLoopbackHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/BsdLoopbackPacket$BsdLoopbackHeader.class */
    public static final class BsdLoopbackHeader extends AbstractPacket.AbstractHeader {
        private static final int BSD_LOOPBACK_HEADER_SIZE = 4;
        private static final int PROTOCOL_FAMILY_OFFSET = 0;
        private static final int PROTOCOL_FAMILY_SIZE = 4;
        private static final long serialVersionUID = -1053845855337317937L;
        private final ProtocolFamily protocolFamily;

        private BsdLoopbackHeader(Builder builder) {
            this.protocolFamily = builder.protocolFamily;
        }

        private BsdLoopbackHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.protocolFamily = ProtocolFamily.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i10 + 0, ByteOrder.nativeOrder())));
                return;
            }
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a BSD loopback header(");
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
            sb2.append("[BSD Loopback Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Protocol Family: ");
            sb2.append(this.protocolFamily);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.protocolFamily.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (BsdLoopbackHeader.class.isInstance(obj)) {
                return this.protocolFamily.equals(((BsdLoopbackHeader) obj).protocolFamily);
            }
            return false;
        }

        public ProtocolFamily getProtocolFamily() {
            return this.protocolFamily;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.protocolFamily.value().intValue(), ByteOrder.nativeOrder()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/BsdLoopbackPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Packet.Builder payloadBuilder;
        private ProtocolFamily protocolFamily;

        public Builder() {
        }

        private Builder(BsdLoopbackPacket bsdLoopbackPacket) {
            this.protocolFamily = bsdLoopbackPacket.header.protocolFamily;
            this.payloadBuilder = bsdLoopbackPacket.payload != null ? bsdLoopbackPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public BsdLoopbackPacket build() {
            return new BsdLoopbackPacket(this);
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

        public Builder protocolFamily(ProtocolFamily protocolFamily) {
            this.protocolFamily = protocolFamily;
            return this;
        }
    }

    private BsdLoopbackPacket(Builder builder) {
        if (builder != null && builder.protocolFamily != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new BsdLoopbackHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.packetType: " + builder.protocolFamily);
    }

    private BsdLoopbackPacket(byte[] bArr, int i10, int i11) {
        BsdLoopbackHeader bsdLoopbackHeader = new BsdLoopbackHeader(bArr, i10, i11);
        this.header = bsdLoopbackHeader;
        int length = i11 - bsdLoopbackHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, ProtocolFamily.class).newInstance(bArr, i10 + bsdLoopbackHeader.length(), length, bsdLoopbackHeader.getProtocolFamily());
        } else {
            this.payload = null;
        }
    }

    public static BsdLoopbackPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new BsdLoopbackPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public BsdLoopbackHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
