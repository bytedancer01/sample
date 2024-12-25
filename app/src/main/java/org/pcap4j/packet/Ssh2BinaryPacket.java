package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.Ssh2MessageNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2BinaryPacket.class */
public final class Ssh2BinaryPacket extends AbstractPacket {
    private static final long serialVersionUID = 6484755289384336675L;
    private final Ssh2BinaryHeader header;
    private final byte[] mac;
    private final Packet payload;
    private final byte[] randomPadding;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2BinaryPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<Ssh2BinaryPacket> {
        private int cipherBlockSize;
        private boolean correctLengthAtBuild;
        private byte[] mac;
        private int packetLength;
        private boolean paddingAtBuild;
        private byte paddingLength;
        private Packet.Builder payloadBuilder;
        private byte[] randomPadding;

        public Builder() {
            this.cipherBlockSize = 0;
        }

        private Builder(Ssh2BinaryPacket ssh2BinaryPacket) {
            this.cipherBlockSize = 0;
            this.packetLength = ssh2BinaryPacket.header.packetLength;
            this.paddingLength = ssh2BinaryPacket.header.paddingLength;
            this.payloadBuilder = ssh2BinaryPacket.payload != null ? ssh2BinaryPacket.payload.getBuilder() : null;
            this.randomPadding = ssh2BinaryPacket.randomPadding;
            this.mac = ssh2BinaryPacket.mac;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2BinaryPacket build() {
            return new Ssh2BinaryPacket(this);
        }

        public Builder cipherBlockSize(int i10) {
            this.cipherBlockSize = i10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Ssh2BinaryPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder mac(byte[] bArr) {
            this.mac = bArr;
            return this;
        }

        public Builder packetLength(int i10) {
            this.packetLength = i10;
            return this;
        }

        public Builder paddingAtBuild(boolean z10) {
            this.paddingAtBuild = z10;
            return this;
        }

        public Builder paddingLength(byte b10) {
            this.paddingLength = b10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder randomPadding(byte[] bArr) {
            this.randomPadding = bArr;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2BinaryPacket$Ssh2BinaryHeader.class */
    public static final class Ssh2BinaryHeader extends AbstractPacket.AbstractHeader {
        private static final int PACKET_LENGTH_OFFSET = 0;
        private static final int PACKET_LENGTH_SIZE = 4;
        private static final int PADDING_LENGTH_OFFSET = 4;
        private static final int PADDING_LENGTH_SIZE = 1;
        private static final int SSH2_BINARY_HEADER_SIZE = 5;
        private static final long serialVersionUID = -7927092563030949527L;
        private final int packetLength;
        private final byte paddingLength;

        private Ssh2BinaryHeader(Builder builder, int i10, byte b10) {
            if (builder.correctLengthAtBuild) {
                this.packetLength = i10;
                this.paddingLength = b10;
            } else {
                this.packetLength = builder.packetLength;
                this.paddingLength = builder.paddingLength;
            }
            if (this.packetLength >= 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("The packet length which is longer than 2147483647 is not supported. packet length: ");
            sb2.append(builder.packetLength & 4294967295L);
            throw new IllegalArgumentException(sb2.toString());
        }

        private Ssh2BinaryHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 5) {
                int i12 = ByteArrays.getInt(bArr, i10 + 0);
                this.packetLength = i12;
                this.paddingLength = ByteArrays.getByte(bArr, i10 + 4);
                if (i12 >= 0) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder(120);
                sb2.append("The packet length which is longer than 2147483647 is not supported. packet length: ");
                sb2.append(getPacketLengthAsLong());
                throw new IllegalRawDataException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The data is too short to build an SSH2 Binary header(");
            sb3.append(5);
            sb3.append(" bytes). data: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
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
            sb2.append("[SSH2 Binary Packet Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  packet_length: ");
            sb2.append(this.packetLength);
            sb2.append(property);
            sb2.append("  padding_length: ");
            sb2.append((int) this.paddingLength);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((527 + this.packetLength) * 31) + this.paddingLength;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Ssh2BinaryHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2BinaryHeader ssh2BinaryHeader = (Ssh2BinaryHeader) obj;
            if (this.packetLength != ssh2BinaryHeader.packetLength || this.paddingLength != ssh2BinaryHeader.paddingLength) {
                z10 = false;
            }
            return z10;
        }

        public int getPacketLength() {
            return this.packetLength;
        }

        public long getPacketLengthAsLong() {
            return this.packetLength & 4294967295L;
        }

        public byte getPaddingLength() {
            return this.paddingLength;
        }

        public int getPaddingLengthAsInt() {
            return this.paddingLength & 255;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.packetLength));
            arrayList.add(ByteArrays.toByteArray(this.paddingLength));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 5;
        }
    }

    private Ssh2BinaryPacket(Builder builder) {
        if (builder == null || builder.randomPadding == null || builder.mac == null) {
            throw new NullPointerException("builder: " + builder + " builder.randomPadding: " + builder.randomPadding + " builder.mac: " + builder.mac);
        }
        if (!builder.paddingAtBuild && builder.randomPadding == null) {
            throw new NullPointerException("builder.randomPadding must not be null if builder.paddingAtBuild is false");
        }
        Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.payload = build;
        int length = build != null ? build.length() : 0;
        if (builder.paddingAtBuild) {
            this.randomPadding = new byte[length % (builder.cipherBlockSize > 8 ? builder.cipherBlockSize : 8)];
        } else {
            byte[] bArr = new byte[builder.randomPadding.length];
            this.randomPadding = bArr;
            System.arraycopy(builder.randomPadding, 0, bArr, 0, builder.randomPadding.length);
        }
        this.header = new Ssh2BinaryHeader(builder, length, (byte) this.randomPadding.length);
        byte[] bArr2 = new byte[builder.mac.length];
        this.mac = bArr2;
        System.arraycopy(builder.mac, 0, bArr2, 0, builder.mac.length);
    }

    private Ssh2BinaryPacket(byte[] bArr, int i10, int i11) {
        Ssh2BinaryHeader ssh2BinaryHeader = new Ssh2BinaryHeader(bArr, i10, i11);
        this.header = ssh2BinaryHeader;
        int packetLength = (ssh2BinaryHeader.getPacketLength() - ssh2BinaryHeader.getPaddingLengthAsInt()) - 1;
        if (packetLength < 0 || packetLength > i11 - 5) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("rawData is too short. rawData length: ");
            sb2.append(i11);
            sb2.append(", header.getPacketLength(): ");
            sb2.append(ssh2BinaryHeader.getPacketLength());
            sb2.append(", header.getPaddingLengthAsInt(): ");
            sb2.append(ssh2BinaryHeader.getPaddingLengthAsInt());
            throw new IllegalRawDataException(sb2.toString());
        }
        int i12 = i10 + 5;
        if (packetLength > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, Ssh2MessageNumber.class).newInstance(bArr, i12, packetLength, Ssh2MessageNumber.getInstance(Byte.valueOf(bArr[i12])));
        } else {
            this.payload = null;
        }
        int i13 = i12 + packetLength;
        try {
            byte[] subArray = ByteArrays.getSubArray(bArr, i13, ssh2BinaryHeader.getPaddingLength());
            this.randomPadding = subArray;
            this.mac = ByteArrays.getSubArray(bArr, i13 + subArray.length);
        } catch (Exception e10) {
            throw new IllegalRawDataException(e10);
        }
    }

    public static Ssh2BinaryPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Ssh2BinaryPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] buildRawData = super.buildRawData();
        byte[] bArr = this.randomPadding;
        if (bArr.length != 0) {
            System.arraycopy(bArr, 0, buildRawData, (buildRawData.length - bArr.length) - this.mac.length, bArr.length);
        }
        byte[] bArr2 = this.mac;
        if (bArr2.length != 0) {
            System.arraycopy(bArr2, 0, buildRawData, buildRawData.length - bArr2.length, bArr2.length);
        }
        return buildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.header.toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb2.append(packet.toString());
        }
        if (this.randomPadding.length != 0) {
            String property = System.getProperty("line.separator");
            sb2.append("[random padding (");
            sb2.append(this.randomPadding.length);
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Hex stream: ");
            sb2.append(ByteArrays.toHexString(this.randomPadding, " "));
            sb2.append(property);
        }
        if (this.mac.length != 0) {
            String property2 = System.getProperty("line.separator");
            sb2.append("[mac (");
            sb2.append(this.mac.length);
            sb2.append(" bytes)]");
            sb2.append(property2);
            sb2.append("  Hex stream: ");
            sb2.append(ByteArrays.toHexString(this.mac, " "));
            sb2.append(property2);
        }
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return (((super.calcHashCode() * 31) + Arrays.hashCode(this.randomPadding)) * 31) + Arrays.hashCode(this.mac);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        return super.calcLength() + this.randomPadding.length + this.mac.length;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        boolean z10 = false;
        if (super.equals(obj)) {
            Ssh2BinaryPacket ssh2BinaryPacket = (Ssh2BinaryPacket) obj;
            z10 = false;
            if (Arrays.equals(this.randomPadding, ssh2BinaryPacket.randomPadding)) {
                z10 = false;
                if (Arrays.equals(this.mac, ssh2BinaryPacket.mac)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2BinaryHeader getHeader() {
        return this.header;
    }

    public byte[] getMac() {
        byte[] bArr = this.mac;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public byte[] getRandomPadding() {
        byte[] bArr = this.randomPadding;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
