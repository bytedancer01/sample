package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV6RoutingData.class */
public final class UnknownIpV6RoutingData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -6359533865311266265L;
    private final byte[] rawData;

    private UnknownIpV6RoutingData(byte[] bArr, int i10, int i11) {
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("rawData length must be more than 3. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if ((i11 + 4) % 8 == 0) {
            byte[] bArr2 = new byte[i11];
            this.rawData = bArr2;
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("(length + 4) % 8 must be 0. rawData: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static UnknownIpV6RoutingData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownIpV6RoutingData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownIpV6RoutingData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownIpV6RoutingData) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return "[data: " + ByteArrays.toHexString(this.rawData, " ") + "]";
    }
}
