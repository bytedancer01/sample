package org.pcap4j.packet;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV6ExtRoutingPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6RoutingSourceRouteData.class */
public final class IpV6RoutingSourceRouteData implements IpV6ExtRoutingPacket.IpV6RoutingData {
    private static final long serialVersionUID = -7972526977248222954L;
    private final List<Inet6Address> addresses;
    private final int reserved;

    public IpV6RoutingSourceRouteData(int i10, List<Inet6Address> list) {
        if (list == null) {
            throw new NullPointerException("addresses must not be null");
        }
        this.reserved = i10;
        this.addresses = new ArrayList(list);
    }

    private IpV6RoutingSourceRouteData(byte[] bArr, int i10, int i11) {
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
        if ((i11 - 4) % 16 == 0) {
            this.reserved = ByteArrays.getInt(bArr, i10);
            this.addresses = new ArrayList();
            for (int i12 = 4; i12 < i11; i12 += 16) {
                this.addresses.add(ByteArrays.getInet6Address(bArr, i12 + i10));
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("(length -4 ) % ");
        sb3.append(16);
        sb3.append(" must be 0. rawData: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static IpV6RoutingSourceRouteData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV6RoutingSourceRouteData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6RoutingSourceRouteData.class.isInstance(obj)) {
            return false;
        }
        IpV6RoutingSourceRouteData ipV6RoutingSourceRouteData = (IpV6RoutingSourceRouteData) obj;
        if (this.reserved != ipV6RoutingSourceRouteData.reserved || !this.addresses.equals(ipV6RoutingSourceRouteData.addresses)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        System.arraycopy(ByteArrays.toByteArray(this.reserved), 0, bArr, 0, 4);
        Iterator<Inet6Address> it = this.addresses.iterator();
        for (int i10 = 4; i10 < length; i10 += 16) {
            System.arraycopy(ByteArrays.toByteArray(it.next()), 0, bArr, i10, 16);
        }
        return bArr;
    }

    public int hashCode() {
        return ((527 + this.reserved) * 31) + this.addresses.hashCode();
    }

    @Override // org.pcap4j.packet.IpV6ExtRoutingPacket.IpV6RoutingData
    public int length() {
        return (this.addresses.size() * 16) + 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[reserved: ");
        sb2.append(this.reserved);
        sb2.append("] [addresses:");
        for (Inet6Address inet6Address : this.addresses) {
            sb2.append(" ");
            sb2.append(inet6Address);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
