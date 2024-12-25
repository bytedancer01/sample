package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPppPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/HdlcPppPacket.class */
public class HdlcPppPacket extends AbstractPppPacket {
    private static final long serialVersionUID = -5976235177385846196L;
    private final HdlcPppHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/HdlcPppPacket$Builder.class */
    public static class Builder extends AbstractPppPacket.Builder {
        private byte address;
        private byte control;

        public Builder() {
            this.address = (byte) -1;
            this.control = (byte) 3;
        }

        private Builder(HdlcPppPacket hdlcPppPacket) {
            super(hdlcPppPacket);
            this.address = (byte) -1;
            this.control = (byte) 3;
            this.address = hdlcPppPacket.header.address;
            this.control = hdlcPppPacket.header.control;
        }

        public Builder address(byte b10) {
            this.address = b10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public HdlcPppPacket build() {
            return new HdlcPppPacket(this);
        }

        public Builder control(byte b10) {
            this.control = b10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public /* bridge */ /* synthetic */ Packet.Builder getPayloadBuilder() {
            return super.getPayloadBuilder();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder
        public Builder pad(byte[] bArr) {
            super.pad(bArr);
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder
        public Builder protocol(PppDllProtocol pppDllProtocol) {
            super.protocol(pppDllProtocol);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/HdlcPppPacket$HdlcPppHeader.class */
    public static class HdlcPppHeader extends AbstractPppPacket.AbstractPppHeader {
        private static final int ADDRESS_OFFSET = 0;
        private static final int ADDRESS_SIZE = 1;
        private static final int CONTROL_OFFSET = 1;
        private static final int CONTROL_SIZE = 1;
        private static final int HDLC_PPP_HEADER_SIZE = 4;
        private static final int PPP_HEADER_OFFSET = 2;
        private static final long serialVersionUID = -6084002362363168427L;
        private final byte address;
        private final byte control;

        private HdlcPppHeader(Builder builder) {
            super(builder);
            this.address = builder.address;
            this.control = builder.control;
        }

        private HdlcPppHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10 + 2, i11 - 2);
            if (i11 >= 4) {
                this.address = ByteArrays.getByte(bArr, i10 + 0);
                this.control = ByteArrays.getByte(bArr, i10 + 1);
                return;
            }
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The data is too short to build an HDLC PPP header(");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[HDLC-encapsulated PPP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Address: 0x");
            sb2.append(String.format("%02x", Byte.valueOf(this.address)));
            sb2.append(property);
            sb2.append("  Control: 0x");
            sb2.append(String.format("%02x", Byte.valueOf(this.control)));
            sb2.append(property);
            sb2.append("  Protocol: ");
            sb2.append(getProtocol());
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return (((super.calcHashCode() * 31) + this.address) * 31) + this.control;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            HdlcPppHeader hdlcPppHeader = (HdlcPppHeader) obj;
            boolean z10 = false;
            if (this.address == hdlcPppHeader.address) {
                z10 = false;
                if (this.control == hdlcPppHeader.control) {
                    z10 = true;
                }
            }
            return z10;
        }

        public byte getAddress() {
            return this.address;
        }

        public byte getControl() {
            return this.control;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader
        public /* bridge */ /* synthetic */ PppDllProtocol getProtocol() {
            return super.getProtocol();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.address));
            arrayList.add(ByteArrays.toByteArray(this.control));
            arrayList.add(ByteArrays.toByteArray(getProtocol().value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private HdlcPppPacket(Builder builder) {
        super(builder);
        this.header = new HdlcPppHeader(builder);
    }

    private HdlcPppPacket(byte[] bArr, int i10, int i11, HdlcPppHeader hdlcPppHeader) {
        super(bArr, i10, i11, hdlcPppHeader);
        this.header = hdlcPppHeader;
    }

    public static HdlcPppPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new HdlcPppPacket(bArr, i10, i11, new HdlcPppHeader(bArr, i10, i11));
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public HdlcPppHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPppPacket
    public /* bridge */ /* synthetic */ byte[] getPad() {
        return super.getPad();
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}
