package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DebugPacket.class */
public final class Ssh2DebugPacket extends AbstractPacket {
    private static final long serialVersionUID = 2146867728898738559L;
    private final Ssh2DebugHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DebugPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2Boolean alwaysDisplay;
        private Ssh2String languageTag;
        private Ssh2String message;

        public Builder() {
        }

        private Builder(Ssh2DebugPacket ssh2DebugPacket) {
            this.alwaysDisplay = ssh2DebugPacket.header.alwaysDisplay;
            this.message = ssh2DebugPacket.header.message;
            this.languageTag = ssh2DebugPacket.header.languageTag;
        }

        public Builder alwaysDisplay(Ssh2Boolean ssh2Boolean) {
            this.alwaysDisplay = ssh2Boolean;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2DebugPacket build() {
            return new Ssh2DebugPacket(this);
        }

        public Builder languageTag(Ssh2String ssh2String) {
            this.languageTag = ssh2String;
            return this;
        }

        public Builder message(Ssh2String ssh2String) {
            this.message = ssh2String;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2DebugPacket$Ssh2DebugHeader.class */
    public static final class Ssh2DebugHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = 873479096967096846L;
        private final Ssh2Boolean alwaysDisplay;
        private final Ssh2String languageTag;
        private final Ssh2String message;
        private final Ssh2MessageNumber messageNumber;

        private Ssh2DebugHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_DEBUG;
            this.alwaysDisplay = builder.alwaysDisplay;
            this.message = builder.message;
            this.languageTag = builder.languageTag;
        }

        private Ssh2DebugHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_DEBUG;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 10) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build an SSH2 Debug header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (!Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                StringBuilder sb3 = new StringBuilder(120);
                sb3.append("The data is not an SSH2 Debug message. data: ");
                sb3.append(new String(bArr));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            int i12 = i10 + 1;
            Ssh2Boolean ssh2Boolean = new Ssh2Boolean(bArr, i12);
            this.alwaysDisplay = ssh2Boolean;
            int length = i12 + ssh2Boolean.length();
            int length2 = (i11 - 1) - ssh2Boolean.length();
            Ssh2String ssh2String = new Ssh2String(bArr, length, length2);
            this.message = ssh2String;
            this.languageTag = new Ssh2String(bArr, length + ssh2String.length(), length2 - ssh2String.length());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 Debug Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  always_display: ");
            sb2.append(this.alwaysDisplay);
            sb2.append(property);
            sb2.append("  message: ");
            sb2.append(this.message);
            sb2.append(property);
            sb2.append("  language tag: ");
            sb2.append(this.languageTag);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.alwaysDisplay.hashCode()) * 31) + this.message.hashCode()) * 31) + this.languageTag.hashCode();
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
            if (!Ssh2DebugHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2DebugHeader ssh2DebugHeader = (Ssh2DebugHeader) obj;
            if (!this.message.equals(ssh2DebugHeader.message) || !this.languageTag.equals(ssh2DebugHeader.languageTag) || !this.alwaysDisplay.equals(ssh2DebugHeader.alwaysDisplay)) {
                z10 = false;
            }
            return z10;
        }

        public Ssh2Boolean getAlwaysDisplay() {
            return this.alwaysDisplay;
        }

        public Ssh2String getLanguageTag() {
            return this.languageTag;
        }

        public Ssh2String getMessage() {
            return this.message;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.alwaysDisplay.getRawData());
            arrayList.add(this.message.getRawData());
            arrayList.add(this.languageTag.getRawData());
            return arrayList;
        }
    }

    private Ssh2DebugPacket(Builder builder) {
        if (builder != null && builder.alwaysDisplay != null && builder.message != null && builder.languageTag != null) {
            this.header = new Ssh2DebugHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.alwaysDisplay: " + builder.alwaysDisplay + " builder.message: " + builder.message + " builder.languageTag: " + builder.languageTag);
    }

    private Ssh2DebugPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2DebugHeader(bArr, i10, i11);
    }

    public static Ssh2DebugPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2DebugPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2DebugHeader getHeader() {
        return this.header;
    }
}
