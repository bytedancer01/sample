package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV6Option.class */
public final class UnknownIpV6Option implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = -2090004757469984967L;
    private final byte[] data;
    private final byte dataLen;
    private final IpV6OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV6Option$Builder.class */
    public static final class Builder implements LengthBuilder<UnknownIpV6Option> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte dataLen;
        private IpV6OptionType type;

        public Builder() {
        }

        private Builder(UnknownIpV6Option unknownIpV6Option) {
            this.type = unknownIpV6Option.type;
            this.dataLen = unknownIpV6Option.dataLen;
            this.data = unknownIpV6Option.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV6Option build() {
            return new UnknownIpV6Option(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV6Option> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder dataLen(byte b10) {
            this.dataLen = b10;
            return this;
        }

        public Builder type(IpV6OptionType ipV6OptionType) {
            this.type = ipV6OptionType;
            return this;
        }
    }

    private UnknownIpV6Option(Builder builder) {
        if (builder != null && builder.type != null && builder.data != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            this.dataLen = builder.correctLengthAtBuild ? (byte) bArr.length : builder.dataLen;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.data: " + builder.data);
    }

    private UnknownIpV6Option(byte[] bArr, int i10, int i11) {
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
        this.type = IpV6OptionType.getInstance(Byte.valueOf(bArr[i10]));
        byte b10 = bArr[i10 + 1];
        this.dataLen = b10;
        if (i11 - 2 >= b10) {
            this.data = ByteArrays.getSubArray(bArr, i10 + 2, b10);
            return;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The raw data is too short to build this option(");
        sb3.append(b10 + 2);
        sb3.append("). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static UnknownIpV6Option newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownIpV6Option(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV6Option.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV6Option unknownIpV6Option = (UnknownIpV6Option) obj;
        if (!this.type.equals(unknownIpV6Option.type) || this.dataLen != unknownIpV6Option.dataLen || !Arrays.equals(this.data, unknownIpV6Option.data)) {
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

    public byte getDataLen() {
        return this.dataLen;
    }

    public int getDataLenAsInt() {
        return this.dataLen & 255;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.dataLen;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.type.hashCode()) * 31) + this.dataLen) * 31) + Arrays.hashCode(this.data);
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        return "[Option Type: " + this.type + "] [Option Data Len: " + getDataLenAsInt() + " bytes] [Option Data: 0x" + ByteArrays.toHexString(this.data, "") + "]";
    }
}
