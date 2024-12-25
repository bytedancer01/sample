package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhReplyPacket.class */
public final class Ssh2KexDhReplyPacket extends AbstractPacket {
    private static final long serialVersionUID = 6507040765944406940L;
    private final Ssh2KexDhReplyHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhReplyPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {

        /* renamed from: f */
        private Ssh2MpInt f36260f;
        private Ssh2String k_s;
        private Ssh2String signatureOfH;

        public Builder() {
        }

        private Builder(Ssh2KexDhReplyPacket ssh2KexDhReplyPacket) {
            this.k_s = ssh2KexDhReplyPacket.header.k_s;
            this.f36260f = ssh2KexDhReplyPacket.header.f36261f;
            this.signatureOfH = ssh2KexDhReplyPacket.header.signatureOfH;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2KexDhReplyPacket build() {
            return new Ssh2KexDhReplyPacket(this);
        }

        /* renamed from: f */
        public Builder m32162f(Ssh2MpInt ssh2MpInt) {
            this.f36260f = ssh2MpInt;
            return this;
        }

        public Builder k_s(Ssh2String ssh2String) {
            this.k_s = ssh2String;
            return this;
        }

        public Builder signatureOfH(Ssh2String ssh2String) {
            this.signatureOfH = ssh2String;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhReplyPacket$Ssh2KexDhReplyHeader.class */
    public static final class Ssh2KexDhReplyHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 4008432145902117221L;

        /* renamed from: f */
        private final Ssh2MpInt f36261f;
        private final Ssh2String k_s;
        private final Ssh2MessageNumber messageNumber;
        private final Ssh2String signatureOfH;

        private Ssh2KexDhReplyHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_REPLY;
            this.k_s = builder.k_s;
            this.f36261f = builder.f36260f;
            this.signatureOfH = builder.signatureOfH;
        }

        private Ssh2KexDhReplyHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_REPLY;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 13) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 KEX DH reply header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (!Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                StringBuilder sb3 = new StringBuilder(120);
                sb3.append("The data is not an SSH2 KEX DH reply message. data: ");
                sb3.append(new String(bArr));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            int i12 = i10 + 1;
            int i13 = i11 - 1;
            Ssh2String ssh2String = new Ssh2String(bArr, i12, i13);
            this.k_s = ssh2String;
            int length = i12 + ssh2String.length();
            int length2 = i13 - ssh2String.length();
            Ssh2MpInt ssh2MpInt = new Ssh2MpInt(bArr, length, length2);
            this.f36261f = ssh2MpInt;
            this.signatureOfH = new Ssh2String(bArr, length + ssh2MpInt.length(), length2 - ssh2MpInt.length());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 KEX DH reply Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  K_S: ");
            sb2.append(this.k_s);
            sb2.append(property);
            sb2.append("  f: ");
            sb2.append(this.f36261f);
            sb2.append(property);
            sb2.append("  signature of H: ");
            sb2.append(this.signatureOfH);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.k_s.hashCode()) * 31) + this.f36261f.hashCode()) * 31) + this.signatureOfH.hashCode();
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
            if (!Ssh2KexDhReplyHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2KexDhReplyHeader ssh2KexDhReplyHeader = (Ssh2KexDhReplyHeader) obj;
            if (!this.k_s.equals(ssh2KexDhReplyHeader.k_s) || !this.f36261f.equals(ssh2KexDhReplyHeader.f36261f) || !this.signatureOfH.equals(ssh2KexDhReplyHeader.signatureOfH)) {
                z10 = false;
            }
            return z10;
        }

        public Ssh2MpInt getF() {
            return this.f36261f;
        }

        public Ssh2String getK_s() {
            return this.k_s;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.k_s.getRawData());
            arrayList.add(this.f36261f.getRawData());
            arrayList.add(this.signatureOfH.getRawData());
            return arrayList;
        }

        public Ssh2String getSignatureOfH() {
            return this.signatureOfH;
        }
    }

    private Ssh2KexDhReplyPacket(Builder builder) {
        if (builder != null && builder.k_s != null && builder.f36260f != null && builder.signatureOfH != null) {
            this.header = new Ssh2KexDhReplyHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.k_s: " + builder.k_s + " builder.f: " + builder.f36260f + " builder.signatureOfH: " + builder.signatureOfH);
    }

    private Ssh2KexDhReplyPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2KexDhReplyHeader(bArr, i10, i11);
    }

    public static Ssh2KexDhReplyPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2KexDhReplyPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2KexDhReplyHeader getHeader() {
        return this.header;
    }
}
