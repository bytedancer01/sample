package org.pcap4j.packet;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOptionAddressPrespecified.class */
public final class IpV4InternetTimestampOptionAddressPrespecified implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = 3865517048348635723L;
    private final Inet4Address address;
    private final List<Integer> timestamps;

    public IpV4InternetTimestampOptionAddressPrespecified(Inet4Address inet4Address, List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("timestamps may not be null");
        }
        if (inet4Address == null && !list.isEmpty()) {
            throw new IllegalArgumentException("timestamps.size() must be 0 if address is null");
        }
        this.address = inet4Address;
        this.timestamps = new ArrayList(list);
    }

    private IpV4InternetTimestampOptionAddressPrespecified(byte[] bArr, int i10, int i11) {
        if (i11 % 4 == 0) {
            this.address = ByteArrays.getInet4Address(bArr, i10 + 0);
            this.timestamps = new ArrayList();
            for (int i12 = 4; i12 < i11; i12 += 4) {
                this.timestamps.add(Integer.valueOf(ByteArrays.getInt(bArr, i12 + i10)));
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("The raw data length must be an integer multiple of 4 octets long. rawData: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static IpV4InternetTimestampOptionAddressPrespecified newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4InternetTimestampOptionAddressPrespecified(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IpV4InternetTimestampOptionAddressPrespecified.class.isInstance(obj)) {
            return Arrays.equals(((IpV4InternetTimestampOptionAddressPrespecified) IpV4InternetTimestampOptionAddressPrespecified.class.cast(obj)).getRawData(), getRawData());
        }
        return false;
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        Iterator<Integer> it = this.timestamps.iterator();
        for (int i10 = 0; i10 < length; i10 += 4) {
            System.arraycopy(ByteArrays.toByteArray(it.next().intValue()), 0, bArr, 0, 4);
        }
        return bArr;
    }

    public List<Integer> getTimestamps() {
        return new ArrayList(this.timestamps);
    }

    public int hashCode() {
        return Arrays.hashCode(getRawData());
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        if (this.address == null) {
            return 0;
        }
        return (this.timestamps.size() * 4) + 4;
    }

    public String toString() {
        if (this.address == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[address: ");
        sb2.append(this.address);
        sb2.append("] [timestamps:");
        for (Integer num : this.timestamps) {
            sb2.append(" ");
            sb2.append(num.intValue() & 4294967295L);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
