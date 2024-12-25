package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpIdentifiablePacket.class */
abstract class IcmpIdentifiablePacket extends AbstractPacket {
    private static final long serialVersionUID = -424401780940103043L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpIdentifiablePacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private short identifier;
        private short sequenceNumber;

        public Builder() {
        }

        public Builder(IcmpIdentifiablePacket icmpIdentifiablePacket) {
            this.identifier = icmpIdentifiablePacket.getHeader().identifier;
            this.sequenceNumber = icmpIdentifiablePacket.getHeader().sequenceNumber;
        }

        public Builder identifier(short s10) {
            this.identifier = s10;
            return this;
        }

        public Builder sequenceNumber(short s10) {
            this.sequenceNumber = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpIdentifiablePacket$IcmpIdentifiableHeader.class */
    public static abstract class IcmpIdentifiableHeader extends AbstractPacket.AbstractHeader {
        public static final int ICMP_IDENTIFIABLE_HEADER_SIZE = 4;
        private static final int IDENTIFIER_OFFSET = 0;
        private static final int IDENTIFIER_SIZE = 2;
        private static final int SEQUENCE_NUMBER_OFFSET = 2;
        private static final int SEQUENCE_NUMBER_SIZE = 2;
        private static final long serialVersionUID = 8141956422232700L;
        private final short identifier;
        private final short sequenceNumber;

        public IcmpIdentifiableHeader(Builder builder) {
            this.identifier = builder.identifier;
            this.sequenceNumber = builder.sequenceNumber;
        }

        public IcmpIdentifiableHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.identifier = ByteArrays.getShort(bArr, i10 + 0);
                this.sequenceNumber = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ");
            sb2.append(getHeaderName());
            sb2.append("(");
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
            sb2.append("[");
            sb2.append(getHeaderName());
            sb2.append(" (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Identifier: ");
            sb2.append(getIdentifierAsInt());
            sb2.append(property);
            sb2.append("  SequenceNumber: ");
            sb2.append(getSequenceNumberAsInt());
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.identifier) * 31) + this.sequenceNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!getClass().isInstance(obj)) {
                return false;
            }
            IcmpIdentifiableHeader icmpIdentifiableHeader = (IcmpIdentifiableHeader) obj;
            if (this.identifier != icmpIdentifiableHeader.identifier || this.sequenceNumber != icmpIdentifiableHeader.sequenceNumber) {
                z10 = false;
            }
            return z10;
        }

        public abstract String getHeaderName();

        public short getIdentifier() {
            return this.identifier;
        }

        public int getIdentifierAsInt() {
            return this.identifier & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.identifier));
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            return arrayList;
        }

        public short getSequenceNumber() {
            return this.sequenceNumber;
        }

        public int getSequenceNumberAsInt() {
            return this.sequenceNumber & 65535;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    public IcmpIdentifiablePacket() {
    }

    public IcmpIdentifiablePacket(Builder builder) {
        if (builder != null) {
            return;
        }
        throw new NullPointerException("builder: " + builder);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract IcmpIdentifiableHeader getHeader();
}
