package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalTcpOption.class */
public final class IllegalTcpOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = 4128600756828920489L;
    private final TcpOptionKind kind;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalTcpOption$Builder.class */
    public static final class Builder {
        private TcpOptionKind kind;
        private byte[] rawData;

        public Builder() {
        }

        private Builder(IllegalTcpOption illegalTcpOption) {
            this.kind = illegalTcpOption.kind;
            this.rawData = illegalTcpOption.rawData;
        }

        public IllegalTcpOption build() {
            return new IllegalTcpOption(this);
        }

        public Builder kind(TcpOptionKind tcpOptionKind) {
            this.kind = tcpOptionKind;
            return this;
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }
    }

    private IllegalTcpOption(Builder builder) {
        if (builder != null && builder.kind != null && builder.rawData != null) {
            this.kind = builder.kind;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.kind: " + builder.kind + " builder.rawData: " + builder.rawData);
    }

    private IllegalTcpOption(byte[] bArr, int i10, int i11) {
        this.kind = TcpOptionKind.getInstance(Byte.valueOf(bArr[i10]));
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static IllegalTcpOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalTcpOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IllegalTcpOption.class.isInstance(obj)) {
            return false;
        }
        IllegalTcpOption illegalTcpOption = (IllegalTcpOption) obj;
        if (!this.kind.equals(illegalTcpOption.kind) || !Arrays.equals(illegalTcpOption.rawData, this.rawData)) {
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public int hashCode() {
        return ((527 + this.kind.hashCode()) * 31) + Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Illegal Raw Data: 0x" + ByteArrays.toHexString(this.rawData, "") + "]";
    }
}
