package org.pcap4j.packet;

import java.io.Serializable;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.IpV4InternetTimestampOption;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOptionTimestampsWithAddresses.class */
public final class IpV4InternetTimestampOptionTimestampsWithAddresses implements IpV4InternetTimestampOption.IpV4InternetTimestampOptionData {
    private static final long serialVersionUID = -331040457248187753L;
    private final List<TimestampWithAddress> timestampsWithAddresses;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOptionTimestampsWithAddresses$TimestampWithAddress.class */
    public static final class TimestampWithAddress implements Serializable {
        private static final long serialVersionUID = -1592713837380606740L;
        private final Inet4Address address;
        private final Integer timestamp;

        public TimestampWithAddress(Inet4Address inet4Address, Integer num) {
            if (inet4Address == null) {
                throw new NullPointerException("address may not be null");
            }
            this.address = inet4Address;
            this.timestamp = num;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!TimestampWithAddress.class.isInstance(obj)) {
                return false;
            }
            TimestampWithAddress timestampWithAddress = (TimestampWithAddress) obj;
            if (!this.timestamp.equals(timestampWithAddress.timestamp) || !this.address.equals(timestampWithAddress.address)) {
                z10 = false;
            }
            return z10;
        }

        public Inet4Address getAddress() {
            return this.address;
        }

        public Integer getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            Integer num = this.timestamp;
            return ((num != null ? 527 + num.hashCode() : 17) * 31) + this.address.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(");
            sb2.append(this.address);
            sb2.append(", ");
            if (this.timestamp != null) {
                sb2.append(r0.intValue() & 4294967295L);
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    public IpV4InternetTimestampOptionTimestampsWithAddresses(List<TimestampWithAddress> list) {
        if (list == null) {
            throw new NullPointerException("timestamps may not be null");
        }
        Iterator<TimestampWithAddress> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().timestamp == null && it.hasNext()) {
                throw new IllegalArgumentException("Every element of timestampsWithAddresses must not have null field except last element.");
            }
        }
        this.timestampsWithAddresses = new ArrayList(list);
    }

    private IpV4InternetTimestampOptionTimestampsWithAddresses(byte[] bArr, int i10, int i11) {
        if (i11 % 4 != 0) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The raw data length must be an integer multiple of 4 octets long. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.timestampsWithAddresses = new ArrayList();
        for (int i12 = 0; i12 < i11; i12 += 8) {
            Inet4Address inet4Address = ByteArrays.getInet4Address(bArr, i12 + i10);
            Integer num = null;
            int i13 = i12 + 4;
            if (i13 < i11) {
                num = Integer.valueOf(ByteArrays.getInt(bArr, i13 + i10));
            }
            this.timestampsWithAddresses.add(new TimestampWithAddress(inet4Address, num));
        }
    }

    public static IpV4InternetTimestampOptionTimestampsWithAddresses newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4InternetTimestampOptionTimestampsWithAddresses(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IpV4InternetTimestampOptionTimestampsWithAddresses.class.isInstance(obj)) {
            return Arrays.equals(((IpV4InternetTimestampOptionTimestampsWithAddresses) IpV4InternetTimestampOptionTimestampsWithAddresses.class.cast(obj)).getRawData(), getRawData());
        }
        return false;
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public byte[] getRawData() {
        int length = length();
        byte[] bArr = new byte[length];
        Iterator<TimestampWithAddress> it = this.timestampsWithAddresses.iterator();
        for (int i10 = 0; i10 < length; i10 += 8) {
            TimestampWithAddress next = it.next();
            System.arraycopy(ByteArrays.toByteArray(next.address), 0, bArr, i10, 4);
            if (next.timestamp != null) {
                System.arraycopy(ByteArrays.toByteArray(next.timestamp.intValue()), 0, bArr, i10 + 4, 4);
            }
        }
        return bArr;
    }

    public List<TimestampWithAddress> getTimestampWithAddress() {
        return new ArrayList(this.timestampsWithAddresses);
    }

    public int hashCode() {
        return Arrays.hashCode(getRawData());
    }

    @Override // org.pcap4j.packet.IpV4InternetTimestampOption.IpV4InternetTimestampOptionData
    public int length() {
        List<TimestampWithAddress> list = this.timestampsWithAddresses;
        return list.get(list.size() - 1).timestamp == null ? ((this.timestampsWithAddresses.size() * 4) * 2) - 4 : this.timestampsWithAddresses.size() * 4 * 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[(address, timestamp):");
        Iterator<TimestampWithAddress> it = this.timestampsWithAddresses.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
