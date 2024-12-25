package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalIpV4Option.class */
public final class IllegalIpV4Option implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -5887663161675479542L;
    private final byte[] rawData;
    private final IpV4OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalIpV4Option$Builder.class */
    public static final class Builder {
        private byte[] rawData;
        private IpV4OptionType type;

        public Builder() {
        }

        private Builder(IllegalIpV4Option illegalIpV4Option) {
            this.type = illegalIpV4Option.type;
            this.rawData = illegalIpV4Option.rawData;
        }

        public IllegalIpV4Option build() {
            return new IllegalIpV4Option(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder type(IpV4OptionType ipV4OptionType) {
            this.type = ipV4OptionType;
            return this;
        }
    }

    private IllegalIpV4Option(Builder builder) {
        if (builder != null && builder.type != null && builder.rawData != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.rawData: " + builder.rawData);
    }

    private IllegalIpV4Option(byte[] bArr, int i10, int i11) {
        this.type = IpV4OptionType.getInstance(Byte.valueOf(bArr[i10]));
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static IllegalIpV4Option newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalIpV4Option(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IllegalIpV4Option.class.isInstance(obj)) {
            return false;
        }
        IllegalIpV4Option illegalIpV4Option = (IllegalIpV4Option) obj;
        if (!this.type.equals(illegalIpV4Option.type) || !Arrays.equals(illegalIpV4Option.rawData, this.rawData)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((527 + this.type.hashCode()) * 31) + Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return "[option-type: " + this.type + "] [Illegal Raw Data: 0x" + ByteArrays.toHexString(this.rawData, "") + "]";
    }
}
