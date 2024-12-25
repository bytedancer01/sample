package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalIpV6RoutingData.class */
public final class IllegalIpV6RoutingData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -6359533865311266265L;
    private final byte[] rawData;

    private IllegalIpV6RoutingData(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static IllegalIpV6RoutingData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalIpV6RoutingData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalIpV6RoutingData.class.isInstance(obj)) {
            return Arrays.equals(((IllegalIpV6RoutingData) obj).rawData, this.rawData);
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
        return "[illegal data: " + ByteArrays.toHexString(this.rawData, "") + "]";
    }
}
