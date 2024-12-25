package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimestampPacket.class */
public final class IcmpV4TimestampPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = -122451430580609855L;
    private final IcmpV4TimestampHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimestampPacket$Builder.class */
    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        private int originateTimestamp;
        private int receiveTimestamp;
        private int transmitTimestamp;

        public Builder() {
        }

        private Builder(IcmpV4TimestampPacket icmpV4TimestampPacket) {
            super(icmpV4TimestampPacket);
            this.originateTimestamp = icmpV4TimestampPacket.header.originateTimestamp;
            this.receiveTimestamp = icmpV4TimestampPacket.header.receiveTimestamp;
            this.transmitTimestamp = icmpV4TimestampPacket.header.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4TimestampPacket build() {
            return new IcmpV4TimestampPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder identifier(short s10) {
            super.identifier(s10);
            return this;
        }

        public Builder originateTimestamp(int i10) {
            this.originateTimestamp = i10;
            return this;
        }

        public Builder receiveTimestamp(int i10) {
            this.receiveTimestamp = i10;
            return this;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder sequenceNumber(short s10) {
            super.sequenceNumber(s10);
            return this;
        }

        public Builder transmitTimestamp(int i10) {
            this.transmitTimestamp = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4TimestampPacket$IcmpV4TimestampHeader.class */
    public static final class IcmpV4TimestampHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final int ICMPV4_TIMESTAMP_HEADER_SIZE = 16;
        private static final int ORIGINATE_TIMESTAMP_OFFSET = 4;
        private static final int ORIGINATE_TIMESTAMP_SIZE = 4;
        private static final int RECEIVE_TIMESTAMP_OFFSET = 8;
        private static final int RECEIVE_TIMESTAMP_SIZE = 4;
        private static final int TRANSMIT_TIMESTAMP_OFFSET = 12;
        private static final int TRANSMIT_TIMESTAMP_SIZE = 4;
        private static final long serialVersionUID = -5997732668989705976L;
        private final int originateTimestamp;
        private final int receiveTimestamp;
        private final int transmitTimestamp;

        private IcmpV4TimestampHeader(Builder builder) {
            super(builder);
            this.originateTimestamp = builder.originateTimestamp;
            this.receiveTimestamp = builder.receiveTimestamp;
            this.transmitTimestamp = builder.transmitTimestamp;
        }

        private IcmpV4TimestampHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
            if (i11 >= 16) {
                this.originateTimestamp = ByteArrays.getInt(bArr, i10 + 4);
                this.receiveTimestamp = ByteArrays.getInt(bArr, i10 + 8);
                this.transmitTimestamp = ByteArrays.getInt(bArr, i10 + 12);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ");
            sb2.append(getHeaderName());
            sb2.append("(");
            sb2.append(16);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append(super.buildString());
            sb2.append("  Originate Timestamp: ");
            sb2.append(this.originateTimestamp);
            sb2.append(property);
            sb2.append("  Receive Timestamp: ");
            sb2.append(this.receiveTimestamp);
            sb2.append(property);
            sb2.append("  Transmit Timestamp: ");
            sb2.append(this.transmitTimestamp);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return (((((super.calcHashCode() * 31) + this.originateTimestamp) * 31) + this.receiveTimestamp) * 31) + this.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            IcmpV4TimestampHeader icmpV4TimestampHeader = (IcmpV4TimestampHeader) obj;
            boolean z10 = false;
            if (this.originateTimestamp == icmpV4TimestampHeader.originateTimestamp) {
                z10 = false;
                if (this.receiveTimestamp == icmpV4TimestampHeader.receiveTimestamp) {
                    z10 = false;
                    if (this.transmitTimestamp == icmpV4TimestampHeader.transmitTimestamp) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv4 Timestamp Header";
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getIdentifier() {
            return super.getIdentifier();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getIdentifierAsInt() {
            return super.getIdentifierAsInt();
        }

        public int getOriginateTimestamp() {
            return this.originateTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            List<byte[]> rawFields = super.getRawFields();
            rawFields.add(ByteArrays.toByteArray(this.originateTimestamp));
            rawFields.add(ByteArrays.toByteArray(this.receiveTimestamp));
            rawFields.add(ByteArrays.toByteArray(this.transmitTimestamp));
            return rawFields;
        }

        public int getReceiveTimestamp() {
            return this.receiveTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getSequenceNumber() {
            return super.getSequenceNumber();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getSequenceNumberAsInt() {
            return super.getSequenceNumberAsInt();
        }

        public int getTransmitTimestamp() {
            return this.transmitTimestamp;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 16;
        }
    }

    private IcmpV4TimestampPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4TimestampHeader(builder);
    }

    private IcmpV4TimestampPacket(byte[] bArr, int i10, int i11) {
        this.header = new IcmpV4TimestampHeader(bArr, i10, i11);
    }

    public static IcmpV4TimestampPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IcmpV4TimestampPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4TimestampHeader getHeader() {
        return this.header;
    }
}
