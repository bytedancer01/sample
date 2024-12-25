package org.pcap4j.packet;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.SocketClient;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2VersionExchangePacket.class */
public final class Ssh2VersionExchangePacket extends AbstractPacket {
    private static final long serialVersionUID = 936170241296151065L;
    private final Ssh2VersionExchangeHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2VersionExchangePacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private String comments;
        private List<String> messages;
        private String protoVersion;
        private String softwareVersion;

        public Builder() {
        }

        private Builder(Ssh2VersionExchangePacket ssh2VersionExchangePacket) {
            this.messages = ssh2VersionExchangePacket.header.messages;
            this.protoVersion = ssh2VersionExchangePacket.header.protoVersion;
            this.softwareVersion = ssh2VersionExchangePacket.header.softwareVersion;
            this.comments = ssh2VersionExchangePacket.header.comments;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2VersionExchangePacket build() {
            return new Ssh2VersionExchangePacket(this);
        }

        public Builder comments(String str) {
            this.comments = str;
            return this;
        }

        public Builder messages(List<String> list) {
            this.messages = list;
            return this;
        }

        public Builder protoVersion(String str) {
            this.protoVersion = str;
            return this;
        }

        public Builder softwareVersion(String str) {
            this.softwareVersion = str;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2VersionExchangePacket$Ssh2VersionExchangeHeader.class */
    public static final class Ssh2VersionExchangeHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = -997040469918475251L;
        private final String comments;
        private final List<String> messages;
        private final String protoVersion;
        private final String softwareVersion;

        private Ssh2VersionExchangeHeader(Builder builder) {
            this.messages = builder.messages != null ? new ArrayList(builder.messages) : new ArrayList();
            this.protoVersion = builder.protoVersion;
            this.softwareVersion = builder.softwareVersion;
            this.comments = builder.comments;
            if (length() > 255) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The data is too long for an SSH version exchange header. data: ");
                sb2.append("builder.messages: [");
                Iterator<String> it = this.messages.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append("]");
                sb2.append(" builder.protoVersion: ");
                sb2.append(builder.protoVersion);
                sb2.append(" builder.softwareVersion: ");
                sb2.append(builder.softwareVersion);
                sb2.append(" builder.comments: ");
                sb2.append(builder.comments);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private Ssh2VersionExchangeHeader(byte[] bArr, int i10, int i11) {
            String str;
            if (i11 < 9) {
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The data is too short to build an SSH2 version exchange header. data: ");
                sb2.append(new String(bArr));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            try {
                String str2 = new String(bArr, i10, i11, "UTF-8");
                String[] split = str2.split(SocketClient.NETASCII_EOL, -1);
                this.messages = new ArrayList();
                int i12 = 0;
                while (true) {
                    if (i12 >= split.length) {
                        i12 = -1;
                        break;
                    } else {
                        if (split[i12].startsWith("SSH-")) {
                            break;
                        }
                        this.messages.add(split[i12]);
                        i12++;
                    }
                }
                if (i12 == -1) {
                    StringBuilder sb3 = new StringBuilder(120);
                    sb3.append("The data doesn't include the version string. data: ");
                    sb3.append(str2);
                    throw new IllegalRawDataException(sb3.toString());
                }
                if (split.length < i12 + 2) {
                    StringBuilder sb4 = new StringBuilder(120);
                    sb4.append("The version string must be terminated by CR LF. data: ");
                    sb4.append(str2);
                    throw new IllegalRawDataException(sb4.toString());
                }
                String substring = split[i12].substring(4);
                int indexOf = substring.indexOf("-");
                if (indexOf == -1) {
                    StringBuilder sb5 = new StringBuilder(120);
                    sb5.append("The data must start with SSH-protoversion-softwareversion. data: ");
                    sb5.append(substring);
                    throw new IllegalRawDataException(sb5.toString());
                }
                this.protoVersion = substring.substring(0, indexOf);
                String substring2 = substring.substring(indexOf + 1);
                int indexOf2 = substring2.indexOf(" ");
                if (indexOf2 != -1) {
                    this.softwareVersion = substring2.substring(0, indexOf2);
                    str = substring2.substring(indexOf2 + 1, substring2.length());
                } else {
                    this.softwareVersion = substring2.substring(0, substring2.length());
                    str = "";
                }
                this.comments = str;
                if (length() <= 255) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(120);
                sb6.append("The data is too long for an SSH version exchange header. data: ");
                sb6.append(new String(bArr));
                sb6.append(", offset: ");
                sb6.append(i10);
                sb6.append(", length: ");
                sb6.append(i11);
                throw new IllegalRawDataException(sb6.toString());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError("Never get here.");
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SSH2 Version Exchange Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            for (String str : getEntireMessage().split(SocketClient.NETASCII_EOL)) {
                sb2.append("  ");
                sb2.append(str);
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((527 + this.messages.hashCode()) * 31) + this.protoVersion.hashCode()) * 31) + this.softwareVersion.hashCode()) * 31) + this.comments.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return getEntireMessage().length();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Ssh2VersionExchangeHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2VersionExchangeHeader ssh2VersionExchangeHeader = (Ssh2VersionExchangeHeader) obj;
            if (!this.protoVersion.equals(ssh2VersionExchangeHeader.protoVersion) || !this.softwareVersion.equals(ssh2VersionExchangeHeader.softwareVersion) || !this.comments.equals(ssh2VersionExchangeHeader.comments) || !this.messages.equals(ssh2VersionExchangeHeader.messages)) {
                z10 = false;
            }
            return z10;
        }

        public String getComments() {
            return this.comments;
        }

        public String getEntireMessage() {
            StringBuilder sb2 = new StringBuilder(50);
            Iterator<String> it = this.messages.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(SocketClient.NETASCII_EOL);
            }
            sb2.append("SSH-");
            sb2.append(this.protoVersion);
            sb2.append("-");
            sb2.append(this.softwareVersion);
            if (this.comments.length() != 0) {
                sb2.append(" ");
                sb2.append(this.comments);
            }
            sb2.append(SocketClient.NETASCII_EOL);
            return sb2.toString();
        }

        public ArrayList<String> getMessages() {
            return new ArrayList<>(this.messages);
        }

        public String getProtoVersion() {
            return this.protoVersion;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(getEntireMessage().getBytes());
            return arrayList;
        }

        public String getSoftwareVersion() {
            return this.softwareVersion;
        }
    }

    private Ssh2VersionExchangePacket(Builder builder) {
        if (builder != null && builder.protoVersion != null && builder.softwareVersion != null && builder.comments != null) {
            this.header = new Ssh2VersionExchangeHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.protoVersion: " + builder.protoVersion + " builder.softwareVersion: " + builder.softwareVersion + " builder.comments: " + builder.comments);
    }

    private Ssh2VersionExchangePacket(byte[] bArr, int i10, int i11) {
        this.header = new Ssh2VersionExchangeHeader(bArr, i10, i11);
    }

    public static Ssh2VersionExchangePacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2VersionExchangePacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2VersionExchangeHeader getHeader() {
        return this.header;
    }
}
