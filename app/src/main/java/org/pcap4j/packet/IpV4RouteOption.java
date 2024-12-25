package org.pcap4j.packet;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4RouteOption.class */
abstract class IpV4RouteOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -2747065348720047861L;
    private final byte length;
    private final byte pointer;
    private final List<Inet4Address> routeData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4RouteOption$Builder.class */
    public static abstract class Builder<T extends IpV4RouteOption> implements LengthBuilder<T> {
        private boolean correctLengthAtBuild;
        private byte length;
        private byte pointer;
        private List<Inet4Address> routeData;

        public Builder() {
        }

        public Builder(IpV4RouteOption ipV4RouteOption) {
            this.length = ipV4RouteOption.length;
            this.pointer = ipV4RouteOption.pointer;
            this.routeData = ipV4RouteOption.routeData;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public abstract T build();

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public Builder<T> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder<T> length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder<T> pointer(byte b10) {
            this.pointer = b10;
            return this;
        }

        public Builder<T> routeData(List<Inet4Address> list) {
            this.routeData = list;
            return this;
        }
    }

    public IpV4RouteOption(Builder<? extends IpV4RouteOption> builder) {
        if (builder != null && ((Builder) builder).routeData != null) {
            this.pointer = ((Builder) builder).pointer;
            this.routeData = new ArrayList(((Builder) builder).routeData);
            this.length = ((Builder) builder).correctLengthAtBuild ? (byte) length() : ((Builder) builder).length;
        } else {
            throw new NullPointerException("builder: " + builder + " builder.routeData: " + ((Builder) builder).routeData);
        }
    }

    public IpV4RouteOption(byte[] bArr, int i10, int i11) {
        if (i11 < 3) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The raw data length must be more than 2. rawData: ");
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
        if (i11 < lengthAsInt) {
            StringBuilder sb4 = new StringBuilder(100);
            sb4.append("The raw data is too short to build this option(");
            sb4.append(lengthAsInt);
            sb4.append("). data: ");
            sb4.append(ByteArrays.toHexString(bArr, " "));
            sb4.append(", offset: ");
            sb4.append(i10);
            sb4.append(", length: ");
            sb4.append(i11);
            throw new IllegalRawDataException(sb4.toString());
        }
        if (lengthAsInt < 3) {
            StringBuilder sb5 = new StringBuilder(100);
            sb5.append("The length field value must be equal or more than 3 but it is: ");
            sb5.append(lengthAsInt);
            throw new IllegalRawDataException(sb5.toString());
        }
        if ((lengthAsInt - 3) % 4 != 0) {
            throw new IllegalRawDataException("Invalid length for this option: " + lengthAsInt);
        }
        this.pointer = bArr[i10 + 2];
        this.routeData = new ArrayList();
        for (int i12 = 3; i12 < lengthAsInt; i12 += 4) {
            this.routeData.add(ByteArrays.getInet4Address(bArr, i12 + i10));
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        IpV4RouteOption ipV4RouteOption = (IpV4RouteOption) obj;
        if (this.length != ipV4RouteOption.length || this.pointer != ipV4RouteOption.pointer || !this.routeData.equals(ipV4RouteOption.routeData)) {
            z10 = false;
        }
        return z10;
    }

    public abstract Builder<? extends IpV4RouteOption> getBuilder();

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public byte getPointer() {
        return this.pointer;
    }

    public int getPointerAsInt() {
        return this.pointer & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.pointer;
        Iterator<Inet4Address> it = this.routeData.iterator();
        int i10 = 3;
        while (it.hasNext()) {
            System.arraycopy(it.next().getAddress(), 0, bArr, i10, 4);
            i10 += 4;
        }
        return bArr;
    }

    public List<Inet4Address> getRouteData() {
        return new ArrayList(this.routeData);
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public abstract IpV4OptionType getType();

    public int hashCode() {
        return ((((527 + this.length) * 31) + this.pointer) * 31) + this.routeData.hashCode();
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return (this.routeData.size() * 4) + 3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[option-type: ");
        sb2.append(getType());
        sb2.append("] [option-length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes] [pointer: ");
        sb2.append(getPointerAsInt());
        sb2.append("] [route data:");
        for (Inet4Address inet4Address : this.routeData) {
            sb2.append(" ");
            sb2.append(inet4Address);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
