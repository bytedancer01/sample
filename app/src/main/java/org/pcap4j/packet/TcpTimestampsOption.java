package org.pcap4j.packet;

import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpTimestampsOption.class */
public final class TcpTimestampsOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -7134215148170658739L;
    private final TcpOptionKind kind;
    private final byte length;
    private final int tsEchoReply;
    private final int tsValue;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpTimestampsOption$Builder.class */
    public static final class Builder implements LengthBuilder<TcpTimestampsOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private int tsEchoReply;
        private int tsValue;

        public Builder() {
        }

        private Builder(TcpTimestampsOption tcpTimestampsOption) {
            this.length = tcpTimestampsOption.length;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpTimestampsOption build() {
            return new TcpTimestampsOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpTimestampsOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder tsEchoReply(int i10) {
            this.tsEchoReply = i10;
            return this;
        }

        public Builder tsValue(int i10) {
            this.tsValue = i10;
            return this;
        }
    }

    private TcpTimestampsOption(Builder builder) {
        this.kind = TcpOptionKind.TIMESTAMPS;
        if (builder != null) {
            this.tsValue = builder.tsValue;
            this.tsEchoReply = builder.tsEchoReply;
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }

    private TcpTimestampsOption(byte[] bArr, int i10, int i11) {
        TcpOptionKind tcpOptionKind = TcpOptionKind.TIMESTAMPS;
        this.kind = tcpOptionKind;
        if (i11 < 10) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 9. rawData: ");
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
            if (b10 == 10) {
                this.tsValue = ByteArrays.getInt(bArr, i10 + 2);
                this.tsEchoReply = ByteArrays.getInt(bArr, i10 + 6);
                return;
            } else {
                throw new IllegalRawDataException("The value of length field must be 10 but: " + ((int) b10));
            }
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

    public static TcpTimestampsOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new TcpTimestampsOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!TcpTimestampsOption.class.isInstance(obj)) {
            return false;
        }
        TcpTimestampsOption tcpTimestampsOption = (TcpTimestampsOption) obj;
        if (this.length != tcpTimestampsOption.length || this.tsValue != tcpTimestampsOption.tsValue || this.tsEchoReply != tcpTimestampsOption.tsEchoReply) {
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
        System.arraycopy(ByteArrays.toByteArray(this.tsValue), 0, bArr, 2, 4);
        System.arraycopy(ByteArrays.toByteArray(this.tsEchoReply), 0, bArr, 6, 4);
        return bArr;
    }

    public int getTsEchoReply() {
        return this.tsEchoReply;
    }

    public long getTsEchoReplyAsLong() {
        return this.tsEchoReply & 4294967295L;
    }

    public int getTsValue() {
        return this.tsValue;
    }

    public long getTsValueAsLong() {
        return this.tsValue & 4294967295L;
    }

    public int hashCode() {
        return ((((527 + this.length) * 31) + this.tsValue) * 31) + this.tsEchoReply;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 10;
    }

    public String toString() {
        return "[Kind: " + this.kind + "] [Length: " + getLengthAsInt() + " bytes] [TS Value: " + getTsValueAsLong() + "] [TS Echo Reply: " + getTsEchoReplyAsLong() + "]";
    }
}
