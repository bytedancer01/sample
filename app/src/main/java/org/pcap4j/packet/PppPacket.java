package org.pcap4j.packet;

import org.pcap4j.packet.AbstractPppPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PppPacket.class */
public class PppPacket extends AbstractPppPacket {
    private static final long serialVersionUID = 6735517864342242611L;
    private final PppHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PppPacket$Builder.class */
    public static class Builder extends AbstractPppPacket.Builder {
        public Builder() {
        }

        private Builder(PppPacket pppPacket) {
            super(pppPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public PppPacket build() {
            return new PppPacket(this);
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PppPacket$PppHeader.class */
    public static class PppHeader extends AbstractPppPacket.AbstractPppHeader {
        private static final long serialVersionUID = -8271596051012324861L;

        private PppHeader(Builder builder) {
            super(builder);
        }

        private PppHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
            if (i11 >= 2) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The data is too short to build an PPP header(");
            sb2.append(2);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader
        public /* bridge */ /* synthetic */ PppDllProtocol getProtocol() {
            return super.getProtocol();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public /* bridge */ /* synthetic */ int length() {
            return super.length();
        }
    }

    private PppPacket(Builder builder) {
        super(builder);
        this.header = new PppHeader(builder);
    }

    private PppPacket(byte[] bArr, int i10, int i11, PppHeader pppHeader) {
        super(bArr, i10, i11, pppHeader);
        this.header = pppHeader;
    }

    public static PppPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new PppPacket(bArr, i10, i11, new PppHeader(bArr, i10, i11));
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
    public PppHeader getHeader() {
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
