package org.pcap4j.packet;

import java.net.Inet6Address;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryPrefixInformationOption.class */
public final class IpV6NeighborDiscoveryPrefixInformationOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IPV6_NEIGHBOR_DISCOVERY_PREFIX_INFORMATION_OPTION_SIZE = 32;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int L_A_RESERVED1_OFFSET = 3;
    private static final int L_A_RESERVED1_SIZE = 1;
    private static final int PREFERRED_LIFETIME_OFFSET = 8;
    private static final int PREFERRED_LIFETIME_SIZE = 4;
    private static final int PREFIX_LENGTH_OFFSET = 2;
    private static final int PREFIX_LENGTH_SIZE = 1;
    private static final int PREFIX_OFFSET = 16;
    private static final int PREFIX_SIZE = 16;
    private static final int RESERVED2_OFFSET = 12;
    private static final int RESERVED2_SIZE = 4;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final int VALID_LIFETIME_OFFSET = 4;
    private static final int VALID_LIFETIME_SIZE = 4;
    private static final long serialVersionUID = -1397830548673996516L;
    private final boolean addressConfigurationFlag;
    private final byte length;
    private final boolean onLinkFlag;
    private final int preferredLifetime;
    private final Inet6Address prefix;
    private final byte prefixLength;
    private final byte reserved1;
    private final int reserved2;
    private final IpV6NeighborDiscoveryOptionType type;
    private final int validLifetime;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryPrefixInformationOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryPrefixInformationOption> {
        private boolean addressConfigurationFlag;
        private boolean correctLengthAtBuild;
        private byte length;
        private boolean onLinkFlag;
        private int preferredLifetime;
        private Inet6Address prefix;
        private byte prefixLength;
        private byte reserved1;
        private int reserved2;
        private int validLifetime;

        public Builder() {
        }

        private Builder(IpV6NeighborDiscoveryPrefixInformationOption ipV6NeighborDiscoveryPrefixInformationOption) {
            this.length = ipV6NeighborDiscoveryPrefixInformationOption.length;
            this.prefixLength = ipV6NeighborDiscoveryPrefixInformationOption.prefixLength;
            this.onLinkFlag = ipV6NeighborDiscoveryPrefixInformationOption.onLinkFlag;
            this.addressConfigurationFlag = ipV6NeighborDiscoveryPrefixInformationOption.addressConfigurationFlag;
            this.reserved1 = ipV6NeighborDiscoveryPrefixInformationOption.reserved1;
            this.validLifetime = ipV6NeighborDiscoveryPrefixInformationOption.validLifetime;
            this.preferredLifetime = ipV6NeighborDiscoveryPrefixInformationOption.preferredLifetime;
            this.reserved2 = ipV6NeighborDiscoveryPrefixInformationOption.reserved2;
            this.prefix = ipV6NeighborDiscoveryPrefixInformationOption.prefix;
        }

        public Builder addressConfigurationFlag(boolean z10) {
            this.addressConfigurationFlag = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryPrefixInformationOption build() {
            return new IpV6NeighborDiscoveryPrefixInformationOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryPrefixInformationOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder onLinkFlag(boolean z10) {
            this.onLinkFlag = z10;
            return this;
        }

        public Builder preferredLifetime(int i10) {
            this.preferredLifetime = i10;
            return this;
        }

        public Builder prefix(Inet6Address inet6Address) {
            this.prefix = inet6Address;
            return this;
        }

        public Builder prefixLength(byte b10) {
            this.prefixLength = b10;
            return this;
        }

        public Builder reserved1(byte b10) {
            this.reserved1 = b10;
            return this;
        }

        public Builder reserved2(int i10) {
            this.reserved2 = i10;
            return this;
        }

        public Builder validLifetime(int i10) {
            this.validLifetime = i10;
            return this;
        }
    }

    private IpV6NeighborDiscoveryPrefixInformationOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.PREFIX_INFORMATION;
        if (builder == null || builder.prefix == null) {
            throw new NullPointerException("builder: " + builder + " builder.prefix: " + builder.prefix);
        }
        if ((builder.reserved1 & 192) != 0) {
            throw new IllegalArgumentException("Invalid reserved1: " + ((int) builder.reserved1));
        }
        this.prefixLength = builder.prefixLength;
        this.onLinkFlag = builder.onLinkFlag;
        this.addressConfigurationFlag = builder.addressConfigurationFlag;
        this.reserved1 = builder.reserved1;
        this.validLifetime = builder.validLifetime;
        this.preferredLifetime = builder.preferredLifetime;
        this.reserved2 = builder.reserved2;
        this.prefix = builder.prefix;
        this.length = builder.correctLengthAtBuild ? (byte) (length() / 8) : builder.length;
    }

    private IpV6NeighborDiscoveryPrefixInformationOption(byte[] bArr, int i10, int i11) {
        this.type = IpV6NeighborDiscoveryOptionType.PREFIX_INFORMATION;
        if (i11 < 32) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 31. rawData: ");
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
        this.length = bArr[i10 + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt * 8 != 32) {
            throw new IllegalRawDataException("Invalid value of length field: " + lengthAsInt);
        }
        this.prefixLength = ByteArrays.getByte(bArr, i10 + 2);
        byte b10 = ByteArrays.getByte(bArr, i10 + 3);
        this.onLinkFlag = (b10 & 128) != 0;
        this.addressConfigurationFlag = (b10 & 64) != 0;
        this.reserved1 = (byte) (b10 & 63);
        this.validLifetime = ByteArrays.getInt(bArr, i10 + 4);
        this.preferredLifetime = ByteArrays.getInt(bArr, i10 + 8);
        this.reserved2 = ByteArrays.getInt(bArr, i10 + 12);
        this.prefix = ByteArrays.getInet6Address(bArr, i10 + 16);
    }

    public static IpV6NeighborDiscoveryPrefixInformationOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6NeighborDiscoveryPrefixInformationOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryPrefixInformationOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryPrefixInformationOption ipV6NeighborDiscoveryPrefixInformationOption = (IpV6NeighborDiscoveryPrefixInformationOption) obj;
        if (!this.prefix.equals(ipV6NeighborDiscoveryPrefixInformationOption.prefix) || this.prefixLength != ipV6NeighborDiscoveryPrefixInformationOption.prefixLength || this.validLifetime != ipV6NeighborDiscoveryPrefixInformationOption.validLifetime || this.preferredLifetime != ipV6NeighborDiscoveryPrefixInformationOption.preferredLifetime || this.onLinkFlag != ipV6NeighborDiscoveryPrefixInformationOption.onLinkFlag || this.addressConfigurationFlag != ipV6NeighborDiscoveryPrefixInformationOption.addressConfigurationFlag || this.reserved1 != ipV6NeighborDiscoveryPrefixInformationOption.reserved1 || this.reserved2 != ipV6NeighborDiscoveryPrefixInformationOption.reserved2 || this.length != ipV6NeighborDiscoveryPrefixInformationOption.length) {
            z10 = false;
        }
        return z10;
    }

    public boolean getAddressConfigurationFlag() {
        return this.addressConfigurationFlag;
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

    public boolean getOnLinkFlag() {
        return this.onLinkFlag;
    }

    public int getPreferredLifetime() {
        return this.preferredLifetime;
    }

    public long getPreferredLifetimeAsLong() {
        return this.preferredLifetime & 4294967295L;
    }

    public Inet6Address getPrefix() {
        return this.prefix;
    }

    public byte getPrefixLength() {
        return this.prefixLength;
    }

    public int getPrefixLengthAsInt() {
        return this.prefixLength & 255;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.prefixLength;
        byte b10 = (byte) (this.reserved1 & 63);
        bArr[3] = b10;
        if (this.onLinkFlag) {
            bArr[3] = (byte) (b10 | 128);
        }
        if (this.addressConfigurationFlag) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        System.arraycopy(ByteArrays.toByteArray(this.validLifetime), 0, bArr, 4, 4);
        System.arraycopy(ByteArrays.toByteArray(this.preferredLifetime), 0, bArr, 8, 4);
        System.arraycopy(ByteArrays.toByteArray(this.reserved2), 0, bArr, 12, 4);
        System.arraycopy(ByteArrays.toByteArray(this.prefix), 0, bArr, 16, 16);
        return bArr;
    }

    public byte getReserved1() {
        return this.reserved1;
    }

    public int getReserved2() {
        return this.reserved2;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int getValidLifetime() {
        return this.validLifetime;
    }

    public long getValidLifetimeAsLong() {
        return this.validLifetime & 4294967295L;
    }

    public int hashCode() {
        byte b10 = this.length;
        byte b11 = this.prefixLength;
        int i10 = 1231;
        int i11 = this.onLinkFlag ? 1231 : 1237;
        if (!this.addressConfigurationFlag) {
            i10 = 1237;
        }
        return ((((((((((((((((527 + b10) * 31) + b11) * 31) + i11) * 31) + i10) * 31) + this.reserved1) * 31) + this.validLifetime) * 31) + this.preferredLifetime) * 31) + this.reserved2) * 31) + this.prefix.hashCode();
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return 32;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Prefix Length: " + getPrefixLengthAsInt() + "] [on-link flag: " + getOnLinkFlag() + "] [address-configuration flag: " + getAddressConfigurationFlag() + "] [Reserved1: " + ((int) getReserved1()) + "] [Valid Lifetime: " + getValidLifetimeAsLong() + "] [Preferred Lifetime: " + getPreferredLifetimeAsLong() + "] [Reserved2: " + getReserved2() + "] [Prefix: " + getPrefix() + "]";
    }
}
