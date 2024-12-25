package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2DisconnectionReasonCode;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DisconnectPacket.class */
public final class Ssh2DisconnectPacket extends AbstractPacket {
    private static final long serialVersionUID = -1484749154591150073L;
    private final Ssh2DisconnectHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DisconnectPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2String description;
        private Ssh2String languageTag;
        private Ssh2DisconnectionReasonCode reasonCode;

        public Builder() {
        }

        private Builder(Ssh2DisconnectPacket ssh2DisconnectPacket) {
            this.reasonCode = ssh2DisconnectPacket.header.reasonCode;
            this.description = ssh2DisconnectPacket.header.description;
            this.languageTag = ssh2DisconnectPacket.header.languageTag;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2DisconnectPacket build() {
            return new Ssh2DisconnectPacket(this);
        }

        public Builder description(Ssh2String ssh2String) {
            this.description = ssh2String;
            return this;
        }

        public Builder languageTag(Ssh2String ssh2String) {
            this.languageTag = ssh2String;
            return this;
        }

        public Builder reasonCode(Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode) {
            this.reasonCode = ssh2DisconnectionReasonCode;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DisconnectPacket$Ssh2DisconnectHeader.class */
    public static final class Ssh2DisconnectHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 873479096967096846L;
        private final Ssh2String description;
        private final Ssh2String languageTag;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2DisconnectionReasonCode reasonCode;

        private Ssh2DisconnectHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_DISCONNECT;
            this.reasonCode = builder.reasonCode;
            this.description = builder.description;
            this.languageTag = builder.languageTag;
        }

        private Ssh2DisconnectHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_DISCONNECT;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 13) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 Disconnect header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                int i12 = i10 + 1;
                this.reasonCode = Ssh2DisconnectionReasonCode.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i12)));
                int i13 = i12 + 4;
                int i14 = (i11 - 1) - 4;
                Ssh2String ssh2String = new Ssh2String(bArr, i13, i14);
                this.description = ssh2String;
                this.languageTag = new Ssh2String(bArr, i13 + ssh2String.length(), i14 - ssh2String.length());
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 Disconnect message. data: ");
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
            sb2.append("[SSH2 Disconnect Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  reason code: ");
            sb2.append(this.reasonCode);
            sb2.append(property);
            sb2.append("  description: ");
            sb2.append(this.description);
            sb2.append(property);
            sb2.append("  language tag: ");
            sb2.append(this.languageTag);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.reasonCode.hashCode()) * 31) + this.description.hashCode()) * 31) + this.languageTag.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return getRawData().length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Ssh2DisconnectHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2DisconnectHeader ssh2DisconnectHeader = (Ssh2DisconnectHeader) obj;
            if (!this.reasonCode.equals(ssh2DisconnectHeader.reasonCode) || !this.description.equals(ssh2DisconnectHeader.description) || !this.languageTag.equals(ssh2DisconnectHeader.languageTag)) {
                z10 = false;
            }
            return z10;
        }

        public Ssh2String getDescription() {
            return this.description;
        }

        public Ssh2String getLanguageTag() {
            return this.languageTag;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(ByteArrays.toByteArray(this.reasonCode.value().intValue()));
            arrayList.add(this.description.getRawData());
            arrayList.add(this.languageTag.getRawData());
            return arrayList;
        }

        public Ssh2DisconnectionReasonCode getReasonCode() {
            return this.reasonCode;
        }
    }

    private Ssh2DisconnectPacket(Builder builder) {
        if (builder != null && builder.reasonCode != null && builder.description != null && builder.languageTag != null) {
            this.header = new Ssh2DisconnectHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.reasonCode: " + builder.reasonCode + " builder.description: " + builder.description + " builder.languageTag: " + builder.languageTag);
    }

    private Ssh2DisconnectPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2DisconnectHeader(bArr, i10, i11);
    }

    public static Ssh2DisconnectPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2DisconnectPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2DisconnectHeader getHeader() {
        return this.header;
    }
}
