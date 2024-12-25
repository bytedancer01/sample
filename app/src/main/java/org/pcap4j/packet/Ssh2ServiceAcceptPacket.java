package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2ServiceAcceptPacket.class */
public final class Ssh2ServiceAcceptPacket extends AbstractPacket {
    private static final long serialVersionUID = 6862963187041604290L;
    private final Ssh2ServiceAcceptHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2ServiceAcceptPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String serviceName;

        public Builder() {
        }

        private Builder(Ssh2ServiceAcceptPacket ssh2ServiceAcceptPacket) {
            this.serviceName = ssh2ServiceAcceptPacket.header.serviceName;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2ServiceAcceptPacket build() {
            return new Ssh2ServiceAcceptPacket(this);
        }

        public Builder serviceName(Ssh2String ssh2String) {
            this.serviceName = ssh2String;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2ServiceAcceptPacket$Ssh2ServiceAcceptHeader.class */
    public static final class Ssh2ServiceAcceptHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 8957656530972381650L;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2String serviceName;

        private Ssh2ServiceAcceptHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_SERVICE_ACCEPT;
            this.serviceName = builder.serviceName;
        }

        private Ssh2ServiceAcceptHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_SERVICE_ACCEPT;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 5) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 Service Accept header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                this.serviceName = new Ssh2String(bArr, i10 + 1, i11 - 1);
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 Service Accept message. data: ");
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
            sb2.append("[SSH2 Service Accept Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  service name: ");
            sb2.append(this.serviceName);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.serviceName.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.serviceName.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2ServiceAcceptHeader.class.isInstance(obj)) {
                return this.serviceName.equals(((Ssh2ServiceAcceptHeader) obj).serviceName);
            }
            return false;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.serviceName.getRawData());
            return arrayList;
        }

        public Ssh2String getServiceName() {
            return this.serviceName;
        }
    }

    private Ssh2ServiceAcceptPacket(Builder builder) {
        if (builder != null && builder.serviceName != null) {
            this.header = new Ssh2ServiceAcceptHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.serviceName: " + builder.serviceName);
    }

    private Ssh2ServiceAcceptPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2ServiceAcceptHeader(bArr, i10, i11);
    }

    public static Ssh2ServiceAcceptPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2ServiceAcceptPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2ServiceAcceptHeader getHeader() {
        return this.header;
    }
}
