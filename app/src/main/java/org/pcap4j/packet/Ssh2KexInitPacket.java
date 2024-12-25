package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexInitPacket.class */
public final class Ssh2KexInitPacket extends AbstractPacket {
    private static final long serialVersionUID = -2424080361918022468L;
    private final Ssh2KexInitHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexInitPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private Ssh2NameList compressionAlgorithmsClientToServer;
        private Ssh2NameList compressionAlgorithmsServerToClient;
        private byte[] cookie;
        private Ssh2NameList encryptionAlgorithmsClientToServer;
        private Ssh2NameList encryptionAlgorithmsServerToClient;
        private Ssh2Boolean firstKexPacketFollows;
        private Ssh2NameList kexAlgorithms;
        private Ssh2NameList languagesClientToServer;
        private Ssh2NameList languagesServerToClient;
        private Ssh2NameList macAlgorithmsClientToServer;
        private Ssh2NameList macAlgorithmsServerToClient;
        private int reserved;
        private Ssh2NameList serverHostKeyAlgorithms;

        public Builder() {
        }

        private Builder(Ssh2KexInitPacket ssh2KexInitPacket) {
            this.cookie = ssh2KexInitPacket.header.cookie;
            this.kexAlgorithms = ssh2KexInitPacket.header.kexAlgorithms;
            this.serverHostKeyAlgorithms = ssh2KexInitPacket.header.serverHostKeyAlgorithms;
            this.encryptionAlgorithmsClientToServer = ssh2KexInitPacket.header.encryptionAlgorithmsClientToServer;
            this.encryptionAlgorithmsServerToClient = ssh2KexInitPacket.header.encryptionAlgorithmsServerToClient;
            this.macAlgorithmsClientToServer = ssh2KexInitPacket.header.macAlgorithmsClientToServer;
            this.macAlgorithmsServerToClient = ssh2KexInitPacket.header.macAlgorithmsServerToClient;
            this.compressionAlgorithmsClientToServer = ssh2KexInitPacket.header.compressionAlgorithmsClientToServer;
            this.compressionAlgorithmsServerToClient = ssh2KexInitPacket.header.compressionAlgorithmsServerToClient;
            this.languagesClientToServer = ssh2KexInitPacket.header.languagesClientToServer;
            this.languagesServerToClient = ssh2KexInitPacket.header.languagesServerToClient;
            this.firstKexPacketFollows = ssh2KexInitPacket.header.firstKexPacketFollows;
            this.reserved = ssh2KexInitPacket.header.reserved;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2KexInitPacket build() {
            return new Ssh2KexInitPacket(this);
        }

        public Builder compressionAlgorithmsClientToServer(Ssh2NameList ssh2NameList) {
            this.compressionAlgorithmsClientToServer = ssh2NameList;
            return this;
        }

        public Builder compressionAlgorithmsServerToClient(Ssh2NameList ssh2NameList) {
            this.compressionAlgorithmsServerToClient = ssh2NameList;
            return this;
        }

        public Builder cookie(byte[] bArr) {
            this.cookie = bArr;
            return this;
        }

        public Builder encryptionAlgorithmsClientToServer(Ssh2NameList ssh2NameList) {
            this.encryptionAlgorithmsClientToServer = ssh2NameList;
            return this;
        }

        public Builder encryptionAlgorithmsServerToClient(Ssh2NameList ssh2NameList) {
            this.encryptionAlgorithmsServerToClient = ssh2NameList;
            return this;
        }

        public Builder firstKexPacketFollows(Ssh2Boolean ssh2Boolean) {
            this.firstKexPacketFollows = ssh2Boolean;
            return this;
        }

        public Builder kexAlgorithms(Ssh2NameList ssh2NameList) {
            this.kexAlgorithms = ssh2NameList;
            return this;
        }

        public Builder languagesClientToServer(Ssh2NameList ssh2NameList) {
            this.languagesClientToServer = ssh2NameList;
            return this;
        }

        public Builder languagesServerToClient(Ssh2NameList ssh2NameList) {
            this.languagesServerToClient = ssh2NameList;
            return this;
        }

        public Builder macAlgorithmsClientToServer(Ssh2NameList ssh2NameList) {
            this.macAlgorithmsClientToServer = ssh2NameList;
            return this;
        }

        public Builder macAlgorithmsServerToClient(Ssh2NameList ssh2NameList) {
            this.macAlgorithmsServerToClient = ssh2NameList;
            return this;
        }

        public Builder reserved(int i10) {
            this.reserved = i10;
            return this;
        }

        public Builder serverHostKeyAlgorithms(Ssh2NameList ssh2NameList) {
            this.serverHostKeyAlgorithms = ssh2NameList;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2KexInitPacket$Ssh2KexInitHeader.class */
    public static final class Ssh2KexInitHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = -2780304573850816908L;
        private final Ssh2NameList compressionAlgorithmsClientToServer;
        private final Ssh2NameList compressionAlgorithmsServerToClient;
        private final byte[] cookie;
        private final Ssh2NameList encryptionAlgorithmsClientToServer;
        private final Ssh2NameList encryptionAlgorithmsServerToClient;
        private final Ssh2Boolean firstKexPacketFollows;
        private final Ssh2NameList kexAlgorithms;
        private final Ssh2NameList languagesClientToServer;
        private final Ssh2NameList languagesServerToClient;
        private final Ssh2NameList macAlgorithmsClientToServer;
        private final Ssh2NameList macAlgorithmsServerToClient;
        private final Ssh2MessageNumber messageNumber;
        private final int reserved;
        private final Ssh2NameList serverHostKeyAlgorithms;

        private Ssh2KexInitHeader(Builder builder) {
            this.messageNumber = Ssh2MessageNumber.SSH_MSG_KEXINIT;
            byte[] clone = ByteArrays.clone(builder.cookie);
            this.cookie = clone;
            if (clone.length != 16) {
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append("cookie length must be 16. builder.cookie: ");
                sb2.append(ByteArrays.toHexString(builder.cookie, " "));
                throw new IllegalArgumentException(sb2.toString());
            }
            this.kexAlgorithms = builder.kexAlgorithms;
            this.serverHostKeyAlgorithms = builder.serverHostKeyAlgorithms;
            this.encryptionAlgorithmsClientToServer = builder.encryptionAlgorithmsClientToServer;
            this.encryptionAlgorithmsServerToClient = builder.encryptionAlgorithmsServerToClient;
            this.macAlgorithmsClientToServer = builder.macAlgorithmsClientToServer;
            this.macAlgorithmsServerToClient = builder.macAlgorithmsServerToClient;
            this.compressionAlgorithmsClientToServer = builder.compressionAlgorithmsClientToServer;
            this.compressionAlgorithmsServerToClient = builder.compressionAlgorithmsServerToClient;
            this.languagesClientToServer = builder.languagesClientToServer;
            this.languagesServerToClient = builder.languagesServerToClient;
            this.firstKexPacketFollows = builder.firstKexPacketFollows;
            this.reserved = builder.reserved;
        }

        private Ssh2KexInitHeader(byte[] bArr, int i10, int i11) {
            Ssh2MessageNumber ssh2MessageNumber = Ssh2MessageNumber.SSH_MSG_KEXINIT;
            this.messageNumber = ssh2MessageNumber;
            if (i11 < 62) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The data is too short to build an SSH2 KEX init header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            if (!Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i10])).equals(ssh2MessageNumber)) {
                StringBuilder sb3 = new StringBuilder(120);
                sb3.append("The data is not an SSH2 KEX init message. data: ");
                sb3.append(new String(bArr));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            int i12 = i10 + 1;
            byte[] subArray = ByteArrays.getSubArray(bArr, i12, 16);
            this.cookie = subArray;
            int length = i12 + subArray.length;
            int length2 = (i11 - 1) - subArray.length;
            Ssh2NameList ssh2NameList = new Ssh2NameList(bArr, length, length2);
            this.kexAlgorithms = ssh2NameList;
            int length3 = length + ssh2NameList.length();
            int length4 = length2 - ssh2NameList.length();
            Ssh2NameList ssh2NameList2 = new Ssh2NameList(bArr, length3, length4);
            this.serverHostKeyAlgorithms = ssh2NameList2;
            int length5 = length3 + ssh2NameList2.length();
            int length6 = length4 - ssh2NameList2.length();
            Ssh2NameList ssh2NameList3 = new Ssh2NameList(bArr, length5, length6);
            this.encryptionAlgorithmsClientToServer = ssh2NameList3;
            int length7 = length5 + ssh2NameList3.length();
            int length8 = length6 - ssh2NameList3.length();
            this.encryptionAlgorithmsServerToClient = new Ssh2NameList(bArr, length7, length8);
            int length9 = length7 + ssh2NameList3.length();
            int length10 = length8 - ssh2NameList3.length();
            Ssh2NameList ssh2NameList4 = new Ssh2NameList(bArr, length9, length10);
            this.macAlgorithmsClientToServer = ssh2NameList4;
            int length11 = length9 + ssh2NameList4.length();
            int length12 = length10 - ssh2NameList4.length();
            Ssh2NameList ssh2NameList5 = new Ssh2NameList(bArr, length11, length12);
            this.macAlgorithmsServerToClient = ssh2NameList5;
            int length13 = length11 + ssh2NameList5.length();
            int length14 = length12 - ssh2NameList5.length();
            Ssh2NameList ssh2NameList6 = new Ssh2NameList(bArr, length13, length14);
            this.compressionAlgorithmsClientToServer = ssh2NameList6;
            int length15 = length13 + ssh2NameList6.length();
            int length16 = length14 - ssh2NameList6.length();
            Ssh2NameList ssh2NameList7 = new Ssh2NameList(bArr, length15, length16);
            this.compressionAlgorithmsServerToClient = ssh2NameList7;
            int length17 = length15 + ssh2NameList7.length();
            int length18 = length16 - ssh2NameList7.length();
            Ssh2NameList ssh2NameList8 = new Ssh2NameList(bArr, length17, length18);
            this.languagesClientToServer = ssh2NameList8;
            int length19 = length17 + ssh2NameList8.length();
            int length20 = length18 - ssh2NameList8.length();
            Ssh2NameList ssh2NameList9 = new Ssh2NameList(bArr, length19, length20);
            this.languagesServerToClient = ssh2NameList9;
            int length21 = length19 + ssh2NameList9.length();
            if (length20 - ssh2NameList9.length() >= 5) {
                this.firstKexPacketFollows = new Ssh2Boolean(bArr[length21]);
                this.reserved = ByteArrays.getInt(bArr, length21 + 1);
                return;
            }
            StringBuilder sb4 = new StringBuilder(120);
            sb4.append("The data is too short to build an SSH2 KEX init header. data: ");
            sb4.append(new String(bArr));
            sb4.append(", offset: ");
            sb4.append(i10);
            sb4.append(", length: ");
            sb4.append(i11);
            throw new IllegalRawDataException(sb4.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 KEX init Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Message Number: ");
            sb2.append(this.messageNumber);
            sb2.append(property);
            sb2.append("  cookie: ");
            sb2.append(ByteArrays.toHexString(this.cookie, " "));
            sb2.append(property);
            sb2.append("  kex_algorithms: ");
            sb2.append(this.kexAlgorithms);
            sb2.append(property);
            sb2.append("  server_host_key_algorithms: ");
            sb2.append(this.serverHostKeyAlgorithms);
            sb2.append(property);
            sb2.append("  encryption_algorithms_client_to_server: ");
            sb2.append(this.encryptionAlgorithmsClientToServer);
            sb2.append(property);
            sb2.append("  encryption_algorithms_server_to_client: ");
            sb2.append(this.encryptionAlgorithmsServerToClient);
            sb2.append(property);
            sb2.append("  mac_algorithms_client_to_server: ");
            sb2.append(this.macAlgorithmsClientToServer);
            sb2.append(property);
            sb2.append("  mac_algorithms_server_to_client: ");
            sb2.append(this.macAlgorithmsServerToClient);
            sb2.append(property);
            sb2.append("  compression_algorithms_client_to_server: ");
            sb2.append(this.compressionAlgorithmsClientToServer);
            sb2.append(property);
            sb2.append("  compression_algorithms_server_to_client: ");
            sb2.append(this.compressionAlgorithmsServerToClient);
            sb2.append(property);
            sb2.append("  languages_client_to_server: ");
            sb2.append(this.languagesClientToServer);
            sb2.append(property);
            sb2.append("  languages_server_to_client: ");
            sb2.append(this.languagesServerToClient);
            sb2.append(property);
            sb2.append("  first_kex_packet_follows: ");
            sb2.append(this.firstKexPacketFollows);
            sb2.append(property);
            sb2.append("  reserved: ");
            sb2.append(ByteArrays.toHexString(this.reserved, " "));
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((((((((((((((((((527 + Arrays.hashCode(this.cookie)) * 31) + this.kexAlgorithms.hashCode()) * 31) + this.serverHostKeyAlgorithms.hashCode()) * 31) + this.encryptionAlgorithmsClientToServer.hashCode()) * 31) + this.encryptionAlgorithmsServerToClient.hashCode()) * 31) + this.macAlgorithmsClientToServer.hashCode()) * 31) + this.macAlgorithmsServerToClient.hashCode()) * 31) + this.compressionAlgorithmsClientToServer.hashCode()) * 31) + this.compressionAlgorithmsServerToClient.hashCode()) * 31) + this.languagesClientToServer.hashCode()) * 31) + this.languagesServerToClient.hashCode()) * 31) + this.firstKexPacketFollows.hashCode()) * 31) + this.reserved;
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
            if (!Ssh2KexInitHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2KexInitHeader ssh2KexInitHeader = (Ssh2KexInitHeader) obj;
            if (!Arrays.equals(this.cookie, ssh2KexInitHeader.cookie) || !this.kexAlgorithms.equals(ssh2KexInitHeader.kexAlgorithms) || !this.serverHostKeyAlgorithms.equals(ssh2KexInitHeader.serverHostKeyAlgorithms) || !this.encryptionAlgorithmsClientToServer.equals(ssh2KexInitHeader.encryptionAlgorithmsClientToServer) || !this.encryptionAlgorithmsServerToClient.equals(ssh2KexInitHeader.encryptionAlgorithmsServerToClient) || !this.macAlgorithmsClientToServer.equals(ssh2KexInitHeader.macAlgorithmsClientToServer) || !this.macAlgorithmsServerToClient.equals(ssh2KexInitHeader.macAlgorithmsServerToClient) || !this.compressionAlgorithmsClientToServer.equals(ssh2KexInitHeader.compressionAlgorithmsClientToServer) || !this.compressionAlgorithmsServerToClient.equals(ssh2KexInitHeader.compressionAlgorithmsServerToClient) || !this.languagesClientToServer.equals(ssh2KexInitHeader.languagesClientToServer) || !this.languagesServerToClient.equals(ssh2KexInitHeader.languagesServerToClient) || !this.firstKexPacketFollows.equals(ssh2KexInitHeader.firstKexPacketFollows) || this.reserved != ssh2KexInitHeader.reserved) {
                z10 = false;
            }
            return z10;
        }

        public Ssh2NameList getCompressionAlgorithmsClientToServer() {
            return this.compressionAlgorithmsClientToServer;
        }

        public Ssh2NameList getCompressionAlgorithmsServerToClient() {
            return this.compressionAlgorithmsServerToClient;
        }

        public byte[] getCookie() {
            return ByteArrays.clone(this.cookie);
        }

        public Ssh2NameList getEncryptionAlgorithmsClientToServer() {
            return this.encryptionAlgorithmsClientToServer;
        }

        public Ssh2NameList getEncryptionAlgorithmsServerToClient() {
            return this.encryptionAlgorithmsServerToClient;
        }

        public Ssh2Boolean getFirstKexPacketFollows() {
            return this.firstKexPacketFollows;
        }

        public Ssh2NameList getKexAlgorithms() {
            return this.kexAlgorithms;
        }

        public Ssh2NameList getLanguagesClientToServer() {
            return this.languagesClientToServer;
        }

        public Ssh2NameList getLanguagesServerToClient() {
            return this.languagesServerToClient;
        }

        public Ssh2NameList getMacAlgorithmsClientToServer() {
            return this.macAlgorithmsClientToServer;
        }

        public Ssh2NameList getMacAlgorithmsServerToClient() {
            return this.macAlgorithmsServerToClient;
        }

        public Ssh2MessageNumber getMessageNumber() {
            return this.messageNumber;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new byte[]{this.messageNumber.value().byteValue()});
            arrayList.add(this.cookie);
            arrayList.add(this.kexAlgorithms.getRawData());
            arrayList.add(this.serverHostKeyAlgorithms.getRawData());
            arrayList.add(this.encryptionAlgorithmsClientToServer.getRawData());
            arrayList.add(this.encryptionAlgorithmsServerToClient.getRawData());
            arrayList.add(this.macAlgorithmsClientToServer.getRawData());
            arrayList.add(this.macAlgorithmsServerToClient.getRawData());
            arrayList.add(this.compressionAlgorithmsClientToServer.getRawData());
            arrayList.add(this.compressionAlgorithmsServerToClient.getRawData());
            arrayList.add(this.languagesClientToServer.getRawData());
            arrayList.add(this.languagesServerToClient.getRawData());
            arrayList.add(this.firstKexPacketFollows.getRawData());
            arrayList.add(ByteArrays.toByteArray(this.reserved));
            return arrayList;
        }

        public int getReserved() {
            return this.reserved;
        }

        public Ssh2NameList getServerHostKeyAlgorithms() {
            return this.serverHostKeyAlgorithms;
        }
    }

    private Ssh2KexInitPacket(Builder builder) {
        if (builder != null && builder.cookie != null && builder.kexAlgorithms != null && builder.serverHostKeyAlgorithms != null && builder.encryptionAlgorithmsClientToServer != null && builder.encryptionAlgorithmsServerToClient != null && builder.macAlgorithmsClientToServer != null && builder.macAlgorithmsServerToClient != null && builder.compressionAlgorithmsClientToServer != null && builder.compressionAlgorithmsServerToClient != null && builder.languagesClientToServer != null && builder.languagesServerToClient != null && builder.firstKexPacketFollows != null) {
            this.header = new Ssh2KexInitHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.cookie: " + builder.cookie + " builder.kexAlgorithms: " + builder.kexAlgorithms + " builder.serverHostKeyAlgorithms: " + builder.serverHostKeyAlgorithms + " builder.encryptionAlgorithmsClientToServer: " + builder.encryptionAlgorithmsClientToServer + " builder.encryptionAlgorithmsServerToClient: " + builder.encryptionAlgorithmsServerToClient + " builder.macAlgorithmsClientToServer: " + builder.macAlgorithmsClientToServer + " builder.macAlgorithmsServerToClient: " + builder.macAlgorithmsServerToClient + " builder.compressionAlgorithmsClientToServer: " + builder.compressionAlgorithmsClientToServer + " builder.compressionAlgorithmsServerToClient: " + builder.compressionAlgorithmsServerToClient + " builder.languagesClientToServer: " + builder.languagesClientToServer + " builder.languagesServerToClient: " + builder.languagesServerToClient + " builder.firstKexPacketFollows: " + builder.firstKexPacketFollows);
    }

    private Ssh2KexInitPacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2KexInitHeader(bArr, i10, i11);
    }

    public static Ssh2KexInitPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2KexInitPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2KexInitHeader getHeader() {
        return this.header;
    }
}
