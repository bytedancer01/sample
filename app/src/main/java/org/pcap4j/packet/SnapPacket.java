package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.Oui;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SnapPacket.class */
public final class SnapPacket extends AbstractPacket {
    private static final long serialVersionUID = 2957315717350800697L;
    private final SnapHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SnapPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Oui oui;
        private Packet.Builder payloadBuilder;
        private EtherType protocolId;

        public Builder() {
        }

        private Builder(SnapPacket snapPacket) {
            this.oui = snapPacket.header.oui;
            this.protocolId = snapPacket.header.protocolId;
            this.payloadBuilder = snapPacket.payload != null ? snapPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public SnapPacket build() {
            return new SnapPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder oui(Oui oui) {
            this.oui = oui;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder protocolId(EtherType etherType) {
            this.protocolId = etherType;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SnapPacket$SnapHeader.class */
    public static final class SnapHeader extends AbstractPacket.AbstractHeader {
        private static final int OUI_OFFSET = 0;
        private static final int OUI_SIZE = 3;
        private static final int PROTOCOL_ID_OFFSET = 3;
        private static final int PROTOCOL_ID_SIZE = 2;
        private static final int SNAP_HEADER_SIZE = 5;
        private static final long serialVersionUID = 8525438913079396866L;
        private final Oui oui;
        private final EtherType protocolId;

        private SnapHeader(Builder builder) {
            this.oui = builder.oui;
            this.protocolId = builder.protocolId;
        }

        private SnapHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 5) {
                this.oui = Oui.getInstance(ByteArrays.getSubArray(bArr, i10 + 0, 3));
                this.protocolId = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 3)));
                return;
            }
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a SNAP header(");
            sb2.append(5);
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
            sb2.append("[Subnetwork Access Protocol header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  OUI: ");
            sb2.append(this.oui);
            sb2.append(property);
            sb2.append("  Protocol ID: ");
            sb2.append(this.protocolId);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.oui.hashCode()) * 31) + this.protocolId.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!SnapHeader.class.isInstance(obj)) {
                return false;
            }
            SnapHeader snapHeader = (SnapHeader) obj;
            if (!this.oui.equals(snapHeader.oui) || !this.protocolId.equals(snapHeader.protocolId)) {
                z10 = false;
            }
            return z10;
        }

        public Oui getOui() {
            return this.oui;
        }

        public EtherType getProtocolId() {
            return this.protocolId;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.oui.valueAsByteArray());
            arrayList.add(ByteArrays.toByteArray(this.protocolId.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }
    }

    private SnapPacket(Builder builder) {
        if (builder != null && builder.oui != null && builder.protocolId != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new SnapHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.oui: " + builder.oui + " builder.protocolId: " + builder.protocolId);
    }

    private SnapPacket(byte[] bArr, int i10, int i11) {
        SnapHeader snapHeader = new SnapHeader(bArr, i10, i11);
        this.header = snapHeader;
        int length = i11 - snapHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i10 + snapHeader.length(), length, snapHeader.getProtocolId());
        } else {
            this.payload = null;
        }
    }

    public static SnapPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new SnapPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public SnapHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
