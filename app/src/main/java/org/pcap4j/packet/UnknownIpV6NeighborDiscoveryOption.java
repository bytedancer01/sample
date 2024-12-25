package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV6NeighborDiscoveryOption.class */
public final class UnknownIpV6NeighborDiscoveryOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final long serialVersionUID = -5097068268518944469L;
    private final byte[] data;
    private final byte length;
    private final IpV6NeighborDiscoveryOptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV6NeighborDiscoveryOption$Builder.class */
    public static final class Builder implements LengthBuilder<UnknownIpV6NeighborDiscoveryOption> {
        private boolean correctLengthAtBuild;
        private byte[] data;
        private byte length;
        private IpV6NeighborDiscoveryOptionType type;

        public Builder() {
        }

        private Builder(UnknownIpV6NeighborDiscoveryOption unknownIpV6NeighborDiscoveryOption) {
            this.type = unknownIpV6NeighborDiscoveryOption.type;
            this.length = unknownIpV6NeighborDiscoveryOption.length;
            this.data = unknownIpV6NeighborDiscoveryOption.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownIpV6NeighborDiscoveryOption build() {
            return new UnknownIpV6NeighborDiscoveryOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownIpV6NeighborDiscoveryOption> correctLengthAtBuild2(boolean z10) {
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

        public Builder type(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
            this.type = ipV6NeighborDiscoveryOptionType;
            return this;
        }
    }

    private UnknownIpV6NeighborDiscoveryOption(Builder builder) {
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

    private UnknownIpV6NeighborDiscoveryOption(byte[] bArr, int i10, int i11) {
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
        this.type = IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i10]));
        byte b10 = bArr[i10 + 1];
        this.length = b10;
        if (i11 >= b10 * 8) {
            this.data = ByteArrays.getSubArray(bArr, i10 + 2, (b10 * 8) - 2);
            return;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The raw data is too short to build this option(");
        sb3.append(b10 * 8);
        sb3.append("). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static UnknownIpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownIpV6NeighborDiscoveryOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!UnknownIpV6NeighborDiscoveryOption.class.isInstance(obj)) {
            return false;
        }
        UnknownIpV6NeighborDiscoveryOption unknownIpV6NeighborDiscoveryOption = (UnknownIpV6NeighborDiscoveryOption) obj;
        if (!this.type.equals(unknownIpV6NeighborDiscoveryOption.type) || this.length != unknownIpV6NeighborDiscoveryOption.length || !Arrays.equals(this.data, unknownIpV6NeighborDiscoveryOption.data)) {
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

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.type.hashCode()) * 31) + this.length) * 31) + Arrays.hashCode(this.data);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.data.length + 2;
    }

    public String toString() {
        return "[Type: " + this.type + "] [Length: " + getLengthAsInt() + " bytes] [Data: 0x" + ByteArrays.toHexString(this.data, "") + "]";
    }
}
