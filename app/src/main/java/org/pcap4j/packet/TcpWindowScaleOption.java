package org.pcap4j.packet;

import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpWindowScaleOption.class */
public final class TcpWindowScaleOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -1755743386204601523L;
    private final TcpOptionKind kind;
    private final byte length;
    private final byte shiftCount;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpWindowScaleOption$Builder.class */
    public static final class Builder implements LengthBuilder<TcpWindowScaleOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte shiftCount;

        public Builder() {
        }

        private Builder(TcpWindowScaleOption tcpWindowScaleOption) {
            this.length = tcpWindowScaleOption.length;
            this.shiftCount = tcpWindowScaleOption.shiftCount;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpWindowScaleOption build() {
            return new TcpWindowScaleOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpWindowScaleOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder shiftCount(byte b10) {
            this.shiftCount = b10;
            return this;
        }
    }

    private TcpWindowScaleOption(Builder builder) {
        this.kind = TcpOptionKind.WINDOW_SCALE;
        if (builder != null) {
            this.shiftCount = builder.shiftCount;
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }

    private TcpWindowScaleOption(byte[] bArr, int i10, int i11) {
        TcpOptionKind tcpOptionKind = TcpOptionKind.WINDOW_SCALE;
        this.kind = tcpOptionKind;
        if (i11 < 3) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 2. rawData: ");
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
            if (b10 == 3) {
                this.shiftCount = bArr[i10 + 2];
                return;
            }
            throw new IllegalRawDataException("The value of length field must be 3 but: " + ((int) b10));
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

    public static TcpWindowScaleOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new TcpWindowScaleOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!TcpWindowScaleOption.class.isInstance(obj)) {
            return false;
        }
        TcpWindowScaleOption tcpWindowScaleOption = (TcpWindowScaleOption) obj;
        if (this.length != tcpWindowScaleOption.length || this.shiftCount != tcpWindowScaleOption.shiftCount) {
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.shiftCount;
        return bArr;
    }

    public byte getShiftCount() {
        return this.shiftCount;
    }

    public int getShiftCountAsInt() {
        return this.shiftCount & 255;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.shiftCount;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 3;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [Shift Count: " + getShiftCountAsInt() + "]";
    }
}
