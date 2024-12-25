package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6PadNOption.class */
public final class IpV6PadNOption implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = 2182260121605325195L;
    private static final IpV6OptionType type = IpV6OptionType.getInstance((byte) 1);
    private final byte[] data;
    private final byte dataLen;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6PadNOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV6PadNOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte dataLen;

        public Builder() {
        }

        private Builder(IpV6PadNOption ipV6PadNOption) {
            this.dataLen = ipV6PadNOption.dataLen;
            this.data = ipV6PadNOption.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6PadNOption build() {
            return new IpV6PadNOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6PadNOption> correctLengthAtBuild2(boolean z10) {
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
    }

    private IpV6PadNOption(Builder builder) {
        if (builder != null && builder.data != null) {
            byte[] bArr = new byte[builder.data.length];
            this.data = bArr;
            System.arraycopy(builder.data, 0, bArr, 0, builder.data.length);
            this.dataLen = builder.correctLengthAtBuild ? (byte) bArr.length : builder.dataLen;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.data: " + builder.data);
    }

    private IpV6PadNOption(byte[] bArr, int i10, int i11) {
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
        byte b10 = bArr[i10];
        IpV6OptionType ipV6OptionType = type;
        if (b10 != ipV6OptionType.value().byteValue()) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The type must be: ");
            sb3.append(ipV6OptionType.valueAsString());
            sb3.append(" rawData: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }
        this.dataLen = bArr[i10 + 1];
        int dataLenAsInt = getDataLenAsInt();
        if (dataLenAsInt <= i11 - 2) {
            this.data = ByteArrays.getSubArray(bArr, i10 + 2, dataLenAsInt);
            return;
        }
        StringBuilder sb4 = new StringBuilder(100);
        sb4.append("rawData is too short. dataLen field: ");
        sb4.append(dataLenAsInt);
        sb4.append(", rawData: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public static IpV6PadNOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6PadNOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6PadNOption.class.isInstance(obj)) {
            return false;
        }
        IpV6PadNOption ipV6PadNOption = (IpV6PadNOption) obj;
        if (this.dataLen != ipV6PadNOption.dataLen || !Arrays.equals(this.data, ipV6PadNOption.data)) {
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
        bArr[0] = type.value().byteValue();
        bArr[1] = this.dataLen;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) * 31;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        return "[Option Type: " + type + "] [Option Data Len: " + getDataLenAsInt() + " bytes] [Option Data: 0x" + ByteArrays.toHexString(this.data, "") + "]";
    }
}
