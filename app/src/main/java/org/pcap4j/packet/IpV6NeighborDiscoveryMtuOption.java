package org.pcap4j.packet;

import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryMtuOption.class */
public final class IpV6NeighborDiscoveryMtuOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IPV6_NEIGHBOR_DISCOVERY_MTU_OPTION_SIZE = 8;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int MTU_OFFSET = 4;
    private static final int MTU_SIZE = 4;
    private static final int RESERVED_OFFSET = 2;
    private static final int RESERVED_SIZE = 2;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 4145831782727036195L;
    private final byte length;
    private final int mtu;
    private final short reserved;
    private final IpV6NeighborDiscoveryOptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryMtuOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryMtuOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private int mtu;
        private short reserved;

        public Builder() {
        }

        private Builder(IpV6NeighborDiscoveryMtuOption ipV6NeighborDiscoveryMtuOption) {
            this.length = ipV6NeighborDiscoveryMtuOption.length;
            this.reserved = ipV6NeighborDiscoveryMtuOption.reserved;
            this.mtu = ipV6NeighborDiscoveryMtuOption.mtu;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryMtuOption build() {
            return new IpV6NeighborDiscoveryMtuOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryMtuOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder mtu(int i10) {
            this.mtu = i10;
            return this;
        }

        public Builder reserved(short s10) {
            this.reserved = s10;
            return this;
        }
    }

    private IpV6NeighborDiscoveryMtuOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.MTU;
        if (builder != null) {
            this.reserved = builder.reserved;
            this.mtu = builder.mtu;
            this.length = builder.correctLengthAtBuild ? (byte) (length() / 8) : builder.length;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }

    private IpV6NeighborDiscoveryMtuOption(byte[] bArr, int i10, int i11) {
        this.type = IpV6NeighborDiscoveryOptionType.MTU;
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
        if (bArr[i10 + 0] == getType().value().byteValue()) {
            this.length = bArr[i10 + 1];
            int lengthAsInt = getLengthAsInt();
            if (lengthAsInt * 8 == 8) {
                this.reserved = ByteArrays.getShort(bArr, i10 + 2);
                this.mtu = ByteArrays.getInt(bArr, i10 + 4);
                return;
            } else {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Illegal value in the length field: ");
                sb3.append(lengthAsInt);
                throw new IllegalRawDataException(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder(100);
        sb4.append("The type must be: ");
        sb4.append(getType().valueAsString());
        sb4.append(" rawData: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public static IpV6NeighborDiscoveryMtuOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6NeighborDiscoveryMtuOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryMtuOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryMtuOption ipV6NeighborDiscoveryMtuOption = (IpV6NeighborDiscoveryMtuOption) obj;
        if (this.mtu != ipV6NeighborDiscoveryMtuOption.mtu || this.length != ipV6NeighborDiscoveryMtuOption.length || this.reserved != ipV6NeighborDiscoveryMtuOption.reserved) {
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

    public int getMtu() {
        return this.mtu;
    }

    public long getMtuAsLong() {
        return this.mtu & 4294967295L;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        System.arraycopy(ByteArrays.toByteArray(this.reserved), 0, bArr, 2, 2);
        System.arraycopy(ByteArrays.toByteArray(this.mtu), 0, bArr, 4, 4);
        return bArr;
    }

    public short getReserved() {
        return this.reserved;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.length) * 31) + this.reserved) * 31) + this.mtu;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return 8;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Reserved: " + ((int) this.reserved) + "] [MTU: " + getMtuAsLong() + "]";
    }
}
