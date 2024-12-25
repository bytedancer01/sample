package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownTcpOption.class */
public final class UnknownTcpOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -893085251311518110L;
    private final byte[] data;
    private final TcpOptionKind kind;
    private final byte length;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownTcpOption$Builder.class */
    public static final class Builder implements LengthBuilder<UnknownTcpOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private TcpOptionKind kind;
        private byte length;

        public Builder() {
        }

        private Builder(UnknownTcpOption unknownTcpOption) {
            this.kind = unknownTcpOption.kind;
            this.length = unknownTcpOption.length;
            this.data = unknownTcpOption.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownTcpOption build() {
            return new UnknownTcpOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownTcpOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder kind(TcpOptionKind tcpOptionKind) {
            this.kind = tcpOptionKind;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }
    }

    private UnknownTcpOption(Builder builder) {
        if (builder != null && builder.kind != null && builder.data != null) {
            this.kind = builder.kind;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.kind: " + builder.kind + " builder.data: " + builder.data);
    }

    private UnknownTcpOption(byte[] bArr, int i10, int i11) {
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The raw data length must be more than 1. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.kind = TcpOptionKind.getInstance(Byte.valueOf(bArr[i10]));
        byte b10 = bArr[i10 + 1];
        this.length = b10;
        if (i11 >= b10) {
            if (b10 > 2) {
                this.data = ByteArrays.getSubArray(bArr, i10 + 2, b10 - 2);
                return;
            } else {
                this.data = new byte[0];
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The raw data is too short to build this option(");
        sb3.append((int) b10);
        sb3.append("). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static UnknownTcpOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownTcpOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!UnknownTcpOption.class.isInstance(obj)) {
            return false;
        }
        UnknownTcpOption unknownTcpOption = (UnknownTcpOption) obj;
        if (!this.kind.equals(unknownTcpOption.kind) || this.length != unknownTcpOption.length || !Arrays.equals(this.data, unknownTcpOption.data)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getData() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return ((((527 + this.kind.hashCode()) * 31) + this.length) * 31) + Arrays.hashCode(this.data);
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [Data: 0x" + ByteArrays.toHexString(this.data, "") + "]";
    }
}
