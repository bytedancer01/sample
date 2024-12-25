package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2UnimplementedPacket.class */
public final class Ssh2UnimplementedPacket extends AbstractPacket {
    private static final long serialVersionUID = -8439655903366307992L;
    private final Ssh2UnimplementedHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2UnimplementedPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private int sequenceNumber;

        public Builder() {
        }

        private Builder(Ssh2UnimplementedPacket ssh2UnimplementedPacket) {
            this.sequenceNumber = ssh2UnimplementedPacket.header.sequenceNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2UnimplementedPacket build() {
            return new Ssh2UnimplementedPacket(this);
        }

        public Builder sequenceNumber(int i10) {
            this.sequenceNumber = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2UnimplementedPacket$Ssh2UnimplementedHeader.class */
    public static final class Ssh2UnimplementedHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 1942311282988657234L;
        private final Ssh2MessageNumber messageNumber;
        private final int sequenceNumber;

        private Ssh2UnimplementedHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_UNIMPLEMENTED;
            this.sequenceNumber = builder.sequenceNumber;
        }

        private Ssh2UnimplementedHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_UNIMPLEMENTED;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 5) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 Unimplemented header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                this.sequenceNumber = ByteArrays.getInt(bArr, i10 + 1);
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 Unimplemented message. data: ");
            sb3.append(new String(bArr));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 Unimplemented Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  packet sequence number: ");
            sb2.append(getSequenceNumberAsLong());
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.sequenceNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Ssh2UnimplementedHeader.class.isInstance(obj)) {
                return false;
            }
            if (this.sequenceNumber != ((Ssh2UnimplementedHeader) obj).sequenceNumber) {
                z10 = false;
            }
            return z10;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            return arrayList;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public long getSequenceNumberAsLong() {
            return this.sequenceNumber & 4294967295L;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }
    }

    private Ssh2UnimplementedPacket(Builder builder) {
        if (builder != null) {
            this.header = new Ssh2UnimplementedHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder);
    }

    private Ssh2UnimplementedPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2UnimplementedHeader(bArr, i10, i11);
    }

    public static Ssh2UnimplementedPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2UnimplementedPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2UnimplementedHeader getHeader() {
        return this.header;
    }
}
