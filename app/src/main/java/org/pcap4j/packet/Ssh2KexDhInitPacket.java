package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhInitPacket.class */
public final class Ssh2KexDhInitPacket extends AbstractPacket {
    private static final long serialVersionUID = -2349107611011582180L;
    private final Ssh2KexDhInitHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhInitPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {

        /* renamed from: e */
        private Ssh2MpInt f36258e;

        public Builder() {
        }

        private Builder(Ssh2KexDhInitPacket ssh2KexDhInitPacket) {
            this.f36258e = ssh2KexDhInitPacket.header.f36259e;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2KexDhInitPacket build() {
            return new Ssh2KexDhInitPacket(this);
        }

        /* renamed from: e */
        public Builder m32161e(Ssh2MpInt ssh2MpInt) {
            this.f36258e = ssh2MpInt;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexDhInitPacket$Ssh2KexDhInitHeader.class */
    public static final class Ssh2KexDhInitHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 4008432145902117221L;

        /* renamed from: e */
        private final Ssh2MpInt f36259e;
        private final Ssh2MessageNumber messageNumber;

        private Ssh2KexDhInitHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_INIT;
            this.f36259e = builder.f36258e;
        }

        private Ssh2KexDhInitHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_KEXDH_INIT;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 5) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 KEX DH init header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                this.f36259e = new Ssh2MpInt(bArr, i10 + 1, i11 - 1);
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 KEX DH init message. data: ");
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
            sb2.append("[SSH2 KEX DH init Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  e: ");
            sb2.append(this.f36259e);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.f36259e.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.f36259e.length() + 1;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (Ssh2KexDhInitHeader.class.isInstance(obj)) {
                return this.f36259e.equals(((Ssh2KexDhInitHeader) obj).f36259e);
            }
            return false;
        }

        public Ssh2MpInt getE() {
            return this.f36259e;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.f36259e.getRawData());
            return arrayList;
        }
    }

    private Ssh2KexDhInitPacket(Builder builder) {
        if (builder != null && builder.f36258e != null) {
            this.header = new Ssh2KexDhInitHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.e: " + builder.f36258e);
    }

    private Ssh2KexDhInitPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2KexDhInitHeader(bArr, i10, i11);
    }

    public static Ssh2KexDhInitPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2KexDhInitPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2KexDhInitHeader getHeader() {
        return this.header;
    }
}
