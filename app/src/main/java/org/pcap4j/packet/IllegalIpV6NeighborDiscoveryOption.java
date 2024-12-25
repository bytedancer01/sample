package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalIpV6NeighborDiscoveryOption.class */
public final class IllegalIpV6NeighborDiscoveryOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final long serialVersionUID = 2715909582897939970L;
    private final byte[] rawData;
    private final IpV6NeighborDiscoveryOptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalIpV6NeighborDiscoveryOption$Builder.class */
    public static final class Builder {
        private byte[] rawData;
        private IpV6NeighborDiscoveryOptionType type;

        public Builder() {
        }

        private Builder(IllegalIpV6NeighborDiscoveryOption illegalIpV6NeighborDiscoveryOption) {
            this.type = illegalIpV6NeighborDiscoveryOption.type;
            this.rawData = illegalIpV6NeighborDiscoveryOption.rawData;
        }

        public IllegalIpV6NeighborDiscoveryOption build() {
            return new IllegalIpV6NeighborDiscoveryOption(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }

        public Builder type(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
            this.type = ipV6NeighborDiscoveryOptionType;
            return this;
        }
    }

    private IllegalIpV6NeighborDiscoveryOption(Builder builder) {
        if (builder != null && builder.type != null && builder.rawData != null) {
            this.type = builder.type;
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.rawData: " + builder.rawData);
    }

    private IllegalIpV6NeighborDiscoveryOption(byte[] bArr, int i10, int i11) {
        this.type = IpV6NeighborDiscoveryOptionType.getInstance(Byte.valueOf(bArr[i10]));
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static IllegalIpV6NeighborDiscoveryOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalIpV6NeighborDiscoveryOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IllegalIpV6NeighborDiscoveryOption.class.isInstance(obj)) {
            return false;
        }
        IllegalIpV6NeighborDiscoveryOption illegalIpV6NeighborDiscoveryOption = (IllegalIpV6NeighborDiscoveryOption) obj;
        if (!this.type.equals(illegalIpV6NeighborDiscoveryOption.type) || !Arrays.equals(illegalIpV6NeighborDiscoveryOption.rawData, this.rawData)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((527 + this.type.hashCode()) * 31) + Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return "[Type: " + this.type + "] [Illegal Raw Data: 0x" + ByteArrays.toHexString(this.rawData, "") + "]";
    }
}
