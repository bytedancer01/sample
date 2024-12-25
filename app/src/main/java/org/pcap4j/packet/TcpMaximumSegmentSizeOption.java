package org.pcap4j.packet;

import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpMaximumSegmentSizeOption.class */
public final class TcpMaximumSegmentSizeOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = 7552907605220130850L;
    private final TcpOptionKind kind;
    private final byte length;
    private final short maxSegSize;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpMaximumSegmentSizeOption$Builder.class */
    public static final class Builder implements LengthBuilder<TcpMaximumSegmentSizeOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private short maxSegSize;

        public Builder() {
        }

        private Builder(TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption) {
            this.length = tcpMaximumSegmentSizeOption.length;
            this.maxSegSize = tcpMaximumSegmentSizeOption.maxSegSize;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpMaximumSegmentSizeOption build() {
            return new TcpMaximumSegmentSizeOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpMaximumSegmentSizeOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder maxSegSize(short s10) {
            this.maxSegSize = s10;
            return this;
        }
    }

    private TcpMaximumSegmentSizeOption(Builder builder) {
        this.kind = TcpOptionKind.MAXIMUM_SEGMENT_SIZE;
        if (builder != null) {
            this.maxSegSize = builder.maxSegSize;
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }

    private TcpMaximumSegmentSizeOption(byte[] bArr, int i10, int i11) {
        TcpOptionKind tcpOptionKind = TcpOptionKind.MAXIMUM_SEGMENT_SIZE;
        this.kind = tcpOptionKind;
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 3. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (bArr[i10] == tcpOptionKind.value().byteValue()) {
            byte b10 = bArr[i10 + 1];
            this.length = b10;
            if (b10 == 4) {
                this.maxSegSize = ByteArrays.getShort(bArr, i10 + 2);
                return;
            }
            throw new IllegalRawDataException("Invalid value of length field: " + ((int) b10));
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The kind must be: ");
        sb3.append(tcpOptionKind.valueAsString());
        sb3.append(" rawData: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static TcpMaximumSegmentSizeOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new TcpMaximumSegmentSizeOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!TcpMaximumSegmentSizeOption.class.isInstance(obj)) {
            return false;
        }
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = (TcpMaximumSegmentSizeOption) obj;
        if (this.length != tcpMaximumSegmentSizeOption.length || this.maxSegSize != tcpMaximumSegmentSizeOption.maxSegSize) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return this.kind;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public short getMaxSegSize() {
        return this.maxSegSize;
    }

    public int getMaxSegSizeAsInt() {
        return this.maxSegSize & 65535;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        short s10 = this.maxSegSize;
        bArr[2] = (byte) (s10 >> 8);
        bArr[3] = (byte) s10;
        return bArr;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.maxSegSize;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 4;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [Maximum Segment Size: " + getMaxSegSizeAsInt() + " bytes]";
    }
}
