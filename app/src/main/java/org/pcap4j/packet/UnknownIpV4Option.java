package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV4Option.class */
public final class UnknownIpV4Option implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = 5843622351774970021L;
    private final byte[] data;
    private final byte length;
    private final IpV4OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV4Option$Builder.class */
    public static final class Builder implements LengthBuilder<UnknownIpV4Option> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte length;
        private IpV4OptionType type;

        public Builder() {
        }

        private Builder(UnknownIpV4Option unknownIpV4Option) {
            this.type = unknownIpV4Option.type;
            this.length = unknownIpV4Option.length;
            this.data = unknownIpV4Option.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV4Option build() {
            return new UnknownIpV4Option(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV4Option> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder type(IpV4OptionType ipV4OptionType) {
            this.type = ipV4OptionType;
            return this;
        }
    }

    private UnknownIpV4Option(Builder builder) {
        if (builder != null && builder.type != null && builder.data != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.data: " + builder.data);
    }

    private UnknownIpV4Option(byte[] bArr, int i10, int i11) {
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
        this.type = IpV4OptionType.getInstance(Byte.valueOf(bArr[i10]));
        this.length = bArr[i10 + 1];
        int lengthAsInt = getLengthAsInt();
        if (i11 >= lengthAsInt) {
            this.data = ByteArrays.getSubArray(bArr, i10 + 2, lengthAsInt - 2);
            return;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The raw data is too short to build this option (");
        sb3.append(lengthAsInt);
        sb3.append("). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static UnknownIpV4Option newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownIpV4Option(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV4Option.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV4Option unknownIpV4Option = (UnknownIpV4Option) obj;
        if (!this.type.equals(unknownIpV4Option.type) || this.length != unknownIpV4Option.length || !Arrays.equals(this.data, unknownIpV4Option.data)) {
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

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.type.hashCode()) * 31) + this.length) * 31) + Arrays.hashCode(this.data);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        return "[option-type: " + this.type + "] [option-length: " + getLengthAsInt() + " bytes] [option-data: 0x" + ByteArrays.toHexString(this.data, "") + "]";
    }
}
