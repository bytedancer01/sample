package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOptionTimestamps.class */
public final class IpV4InternetTimestampOptionTimestamps implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = -2067863811913941432L;
    private final List<Integer> timestamps;

    public IpV4InternetTimestampOptionTimestamps(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("timestamps may not be null");
        }
        this.timestamps = new ArrayList(list);
    }

    private IpV4InternetTimestampOptionTimestamps(byte[] bArr, int i10, int i11) {
        if (i11 % 4 == 0) {
            this.timestamps = new ArrayList();
            for (int i12 = 0; i12 < i11; i12 += 4) {
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

    public static IpV4InternetTimestampOptionTimestamps newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4InternetTimestampOptionTimestamps(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IpV4InternetTimestampOptionTimestamps.class.isInstance(obj)) {
            return Arrays.equals(((IpV4InternetTimestampOptionTimestamps) IpV4InternetTimestampOptionTimestamps.class.cast(obj)).getRawData(), getRawData());
        }
        return false;
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
        return this.timestamps.size() * 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[timestamps:");
        for (Integer num : this.timestamps) {
            sb2.append(" ");
            sb2.append(num.intValue() & 4294967295L);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
