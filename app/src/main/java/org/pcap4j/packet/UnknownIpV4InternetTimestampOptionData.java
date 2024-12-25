package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownIpV4InternetTimestampOptionData.class */
public final class UnknownIpV4InternetTimestampOptionData implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = 2799097946096468081L;
    private final byte[] rawData;

    private UnknownIpV4InternetTimestampOptionData(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static UnknownIpV4InternetTimestampOptionData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownIpV4InternetTimestampOptionData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownIpV4InternetTimestampOptionData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownIpV4InternetTimestampOptionData) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return "[data: " + ByteArrays.toHexString(this.rawData, "") + "]";
    }
}
