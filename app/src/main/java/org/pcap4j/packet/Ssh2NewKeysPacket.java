package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2NewKeysPacket.class */
public final class Ssh2NewKeysPacket extends AbstractPacket {
    private static final Ssh2NewKeysPacket INSTANCE = new Ssh2NewKeysPacket();
    private static final long serialVersionUID = -4355029035065046101L;
    private final Ssh2NewKeysHeader header = Ssh2NewKeysHeader.getInstance();

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2NewKeysPacket$Ssh2NewKeysHeader.class */
    public static final class Ssh2NewKeysHeader extends AbstractPacket.AbstractHeader {
        private static final Ssh2NewKeysHeader INSTANCE = new Ssh2NewKeysHeader();
        private static final long serialVersionUID = -6964593795610286838L;
        private final Ssh2MessageNumber messageNumber = Ssh2MessageNumber.SSH_MSG_NEWKEYS;

        private Ssh2NewKeysHeader() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void checkRawData(byte[] bArr, int i10, int i11) {
            if (i11 < 1) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The data is too short to build an SSH2 New Keys header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(Ssh2MessageNumber.SSH_MSG_KEXINIT)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("The data is not an SSH2 New Keys message. data: ");
            sb3.append(new String(bArr));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Ssh2NewKeysHeader getInstance() {
            return INSTANCE;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 New Keys Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            return equals(obj);
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 1;
        }
    }

    private Ssh2NewKeysPacket() {
    }

    public static Ssh2NewKeysPacket getInstance() {
        return INSTANCE;
    }

    public static Ssh2NewKeysPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        Ssh2NewKeysHeader.checkRawData(bArr, i10, i11);
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return hashCode();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        return equals(obj);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2NewKeysHeader getHeader() {
        return this.header;
    }
}
