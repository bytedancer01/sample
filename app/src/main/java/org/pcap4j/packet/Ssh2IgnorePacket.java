package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2IgnorePacket.class */
public final class Ssh2IgnorePacket extends AbstractPacket {
    private static final long serialVersionUID = 2975421692356921479L;
    private final Ssh2IgnoreHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2IgnorePacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String data;

        public Builder() {
        }

        private Builder(Ssh2IgnorePacket ssh2IgnorePacket) {
            this.data = ssh2IgnorePacket.header.data;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2IgnorePacket build() {
            return new Ssh2IgnorePacket(this);
        }

        public Builder data(Ssh2String ssh2String) {
            this.data = ssh2String;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2IgnorePacket$Ssh2IgnoreHeader.class */
    public static final class Ssh2IgnoreHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 5835008308161430239L;
        private final Ssh2String data;
        private final Ssh2MessageNumber messageNumber;

        private Ssh2IgnoreHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_IGNORE;
            this.data = builder.data;
        }

        private Ssh2IgnoreHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_IGNORE;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 5) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 Ignore header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                this.data = new Ssh2String(bArr, i10 + 1, i11 - 1);
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 Ignore message. data: ");
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
            sb2.append("[SSH2 Ignore Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  data: ");
            sb2.append(this.data);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.data.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.data.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2IgnoreHeader.class.isInstance(obj)) {
                return this.data.equals(((Ssh2IgnoreHeader) obj).data);
            }
            return false;
        }

        public Ssh2String getData() {
            return this.data;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.data.getRawData());
            return arrayList;
        }
    }

    private Ssh2IgnorePacket(Builder builder) {
        if (builder != null && builder.data != null) {
            this.header = new Ssh2IgnoreHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.data: " + builder.data);
    }

    private Ssh2IgnorePacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2IgnoreHeader(bArr, i10, i11);
    }

    public static Ssh2IgnorePacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2IgnorePacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2IgnoreHeader getHeader() {
        return this.header;
    }
}
