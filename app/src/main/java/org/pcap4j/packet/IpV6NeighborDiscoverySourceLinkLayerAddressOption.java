package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoverySourceLinkLayerAddressOption.class */
public final class IpV6NeighborDiscoverySourceLinkLayerAddressOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int LINK_LAYER_ADDRESS_OFFSET = 2;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 6088528399845741741L;
    private final byte length;
    private final byte[] linkLayerAddress;
    private final IpV6NeighborDiscoveryOptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoverySourceLinkLayerAddressOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoverySourceLinkLayerAddressOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte[] linkLayerAddress;

        public Builder() {
        }

        private Builder(IpV6NeighborDiscoverySourceLinkLayerAddressOption ipV6NeighborDiscoverySourceLinkLayerAddressOption) {
            this.length = ipV6NeighborDiscoverySourceLinkLayerAddressOption.length;
            this.linkLayerAddress = ipV6NeighborDiscoverySourceLinkLayerAddressOption.linkLayerAddress;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoverySourceLinkLayerAddressOption build() {
            return new IpV6NeighborDiscoverySourceLinkLayerAddressOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoverySourceLinkLayerAddressOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder linkLayerAddress(byte[] bArr) {
            this.linkLayerAddress = bArr;
            return this;
        }
    }

    private IpV6NeighborDiscoverySourceLinkLayerAddressOption(Builder builder) {
        byte b10;
        this.type = IpV6NeighborDiscoveryOptionType.SOURCE_LINK_LAYER_ADDRESS;
        if (builder == null || builder.linkLayerAddress == null) {
            throw new NullPointerException("builder: " + builder + " builder.linkLayerAddress: " + builder.linkLayerAddress);
        }
        byte[] bArr = new byte[builder.linkLayerAddress.length];
        this.linkLayerAddress = bArr;
        System.arraycopy(builder.linkLayerAddress, 0, bArr, 0, builder.linkLayerAddress.length);
        if (!builder.correctLengthAtBuild) {
            b10 = builder.length;
        } else {
            if (length() % 8 != 0) {
                throw new IllegalArgumentException("linkLayerAddress's length is invalid. linkLayerAddress: " + ByteArrays.toHexString(bArr, " "));
            }
            b10 = (byte) (length() / 8);
        }
        this.length = b10;
    }

    private IpV6NeighborDiscoverySourceLinkLayerAddressOption(byte[] bArr, int i10, int i11) {
        this.type = IpV6NeighborDiscoveryOptionType.SOURCE_LINK_LAYER_ADDRESS;
        if (i11 < 8) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 7. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (bArr[i10 + 0] != getType().value().byteValue()) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The type must be: ");
            sb3.append(getType().valueAsString());
            sb3.append(" rawData: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }
        byte b10 = bArr[i10 + 1];
        this.length = b10;
        int lengthAsInt = getLengthAsInt() * 8;
        if (i11 >= lengthAsInt) {
            if (b10 == 0) {
                throw new IllegalRawDataException("The length field value must not be zero.");
            }
            this.linkLayerAddress = ByteArrays.getSubArray(bArr, i10 + 2, lengthAsInt - 2);
            return;
        }
        StringBuilder sb4 = new StringBuilder(100);
        sb4.append("The raw data is too short to build this option. ");
        sb4.append(lengthAsInt);
        sb4.append(" bytes data is needed. data: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public static IpV6NeighborDiscoverySourceLinkLayerAddressOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6NeighborDiscoverySourceLinkLayerAddressOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoverySourceLinkLayerAddressOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoverySourceLinkLayerAddressOption ipV6NeighborDiscoverySourceLinkLayerAddressOption = (IpV6NeighborDiscoverySourceLinkLayerAddressOption) obj;
        if (this.length != ipV6NeighborDiscoverySourceLinkLayerAddressOption.length || !Arrays.equals(this.linkLayerAddress, ipV6NeighborDiscoverySourceLinkLayerAddressOption.linkLayerAddress)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public byte[] getLinkLayerAddress() {
        byte[] bArr = this.linkLayerAddress;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public MacAddress getLinkLayerAddressAsMacAddress() {
        return MacAddress.getByAddress(this.linkLayerAddress);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        byte[] bArr2 = this.linkLayerAddress;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + Arrays.hashCode(this.linkLayerAddress);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.linkLayerAddress.length + 2;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [linkLayerAddress: " + ByteArrays.toHexString(this.linkLayerAddress, " ") + "]";
    }
}
