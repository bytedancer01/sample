package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryRedirectedHeaderOption.class */
public final class IpV6NeighborDiscoveryRedirectedHeaderOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IP_HEADER_OFFSET = 8;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int RESERVED_OFFSET = 2;
    private static final int RESERVED_SIZE = 6;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 8049779415539820332L;
    private final Packet ipPacket;
    private final byte length;
    private final byte[] reserved;
    private final IpV6NeighborDiscoveryOptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6NeighborDiscoveryRedirectedHeaderOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryRedirectedHeaderOption> {
        private boolean correctLengthAtBuild;
        private Packet ipPacket;
        private byte length;
        private byte[] reserved;

        public Builder() {
        }

        private Builder(IpV6NeighborDiscoveryRedirectedHeaderOption ipV6NeighborDiscoveryRedirectedHeaderOption) {
            this.length = ipV6NeighborDiscoveryRedirectedHeaderOption.length;
            this.reserved = ipV6NeighborDiscoveryRedirectedHeaderOption.reserved;
            this.ipPacket = ipV6NeighborDiscoveryRedirectedHeaderOption.ipPacket;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryRedirectedHeaderOption build() {
            return new IpV6NeighborDiscoveryRedirectedHeaderOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryRedirectedHeaderOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder ipPacket(Packet packet) {
            this.ipPacket = packet;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder reserved(byte[] bArr) {
            this.reserved = bArr;
            return this;
        }
    }

    private IpV6NeighborDiscoveryRedirectedHeaderOption(Builder builder) {
        byte b10;
        this.type = IpV6NeighborDiscoveryOptionType.REDIRECTED_HEADER;
        if (builder == null || builder.reserved == null || builder.ipPacket == null) {
            throw new NullPointerException("builder: " + builder + " builder.reserved: " + builder.reserved + " builder.ipPacket: " + builder.ipPacket);
        }
        if (builder.reserved.length != 6) {
            throw new IllegalArgumentException("Invalid reserved: " + ByteArrays.toHexString(builder.reserved, " "));
        }
        this.reserved = ByteArrays.clone(builder.reserved);
        Packet packet = builder.ipPacket;
        this.ipPacket = packet;
        if (!builder.correctLengthAtBuild) {
            b10 = builder.length;
        } else {
            if (length() % 8 != 0) {
                throw new IllegalArgumentException("ipPacket's length is invalid. ipPacket: " + ByteArrays.toHexString(packet.getRawData(), " "));
            }
            b10 = (byte) (length() / 8);
        }
        this.length = b10;
    }

    private IpV6NeighborDiscoveryRedirectedHeaderOption(byte[] bArr, int i10, int i11) {
        this.type = IpV6NeighborDiscoveryOptionType.REDIRECTED_HEADER;
        if (i11 < 48) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 47. rawData: ");
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
        int lengthAsInt = getLengthAsInt() * 8;
        if (i11 < lengthAsInt) {
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
        if (lengthAsInt < 8) {
            StringBuilder sb5 = new StringBuilder(100);
            sb5.append("The length field value must be equal or more than");
            sb5.append(1);
            sb5.append("but it is: ");
            sb5.append(getLengthAsInt());
            throw new IllegalRawDataException(sb5.toString());
        }
        this.reserved = ByteArrays.getSubArray(bArr, i10 + 2, 6);
        Packet packet = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i10 + 8, lengthAsInt - 8, EtherType.IPV6);
        if (packet instanceof IllegalPacket) {
            this.ipPacket = packet;
            return;
        }
        Packet packet2 = packet;
        if (packet.contains(IllegalPacket.class)) {
            Packet.Builder builder = packet.getBuilder();
            byte[] rawData = ((IllegalPacket) packet.get(IllegalPacket.class)).getRawData();
            builder.getOuterOf(IllegalPacket.Builder.class).payloadBuilder(((Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(rawData, 0, rawData.length)).getBuilder());
            for (Packet.Builder builder2 : builder) {
                if (builder2 instanceof LengthBuilder) {
                    ((LengthBuilder) builder2).correctLengthAtBuild2(false);
                }
                if (builder2 instanceof ChecksumBuilder) {
                    ((ChecksumBuilder) builder2).correctChecksumAtBuild(false);
                }
            }
            packet2 = builder.build();
        }
        this.ipPacket = packet2;
    }

    public static IpV6NeighborDiscoveryRedirectedHeaderOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6NeighborDiscoveryRedirectedHeaderOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryRedirectedHeaderOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryRedirectedHeaderOption ipV6NeighborDiscoveryRedirectedHeaderOption = (IpV6NeighborDiscoveryRedirectedHeaderOption) obj;
        if (this.length != ipV6NeighborDiscoveryRedirectedHeaderOption.length || !this.ipPacket.equals(ipV6NeighborDiscoveryRedirectedHeaderOption.ipPacket) || !Arrays.equals(this.reserved, ipV6NeighborDiscoveryRedirectedHeaderOption.reserved)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Packet getIpPacket() {
        return this.ipPacket;
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
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        System.arraycopy(this.reserved, 0, bArr, 2, 6);
        System.arraycopy(this.ipPacket.getRawData(), 0, bArr, 8, this.ipPacket.length());
        return bArr;
    }

    public byte[] getReserved() {
        return ByteArrays.clone(this.reserved);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((527 + this.length) * 31) + Arrays.hashCode(this.reserved)) * 31) + this.ipPacket.hashCode();
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.ipPacket.length() + 8;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Reserved: " + ByteArrays.toHexString(this.reserved, " ") + "] [IP header + data: {" + this.ipPacket + "}]";
    }
}
