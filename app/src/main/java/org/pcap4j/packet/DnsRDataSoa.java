package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataSoa.class */
public final class DnsRDataSoa implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5916011849950625284L;
    private final int expire;
    private final DnsDomainName mName;
    private final int minimum;
    private final DnsDomainName rName;
    private final int refresh;
    private final int retry;
    private final int serial;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataSoa$Builder.class */
    public static final class Builder {
        private int expire;
        private DnsDomainName mName;
        private int minimum;
        private DnsDomainName rName;
        private int refresh;
        private int retry;
        private int serial;

        public Builder() {
        }

        private Builder(DnsRDataSoa dnsRDataSoa) {
            this.mName = dnsRDataSoa.mName;
            this.rName = dnsRDataSoa.rName;
            this.serial = dnsRDataSoa.serial;
            this.refresh = dnsRDataSoa.refresh;
            this.retry = dnsRDataSoa.retry;
            this.expire = dnsRDataSoa.expire;
            this.minimum = dnsRDataSoa.minimum;
        }

        public DnsRDataSoa build() {
            return new DnsRDataSoa(this);
        }

        public Builder expire(int i10) {
            this.expire = i10;
            return this;
        }

        public Builder mName(DnsDomainName dnsDomainName) {
            this.mName = dnsDomainName;
            return this;
        }

        public Builder minimum(int i10) {
            this.minimum = i10;
            return this;
        }

        public Builder rName(DnsDomainName dnsDomainName) {
            this.rName = dnsDomainName;
            return this;
        }

        public Builder refresh(int i10) {
            this.refresh = i10;
            return this;
        }

        public Builder retry(int i10) {
            this.retry = i10;
            return this;
        }

        public Builder serial(int i10) {
            this.serial = i10;
            return this;
        }
    }

    private DnsRDataSoa(Builder builder) {
        if (builder == null || builder.mName == null || builder.rName == null) {
            throw new NullPointerException("builder: " + builder + " builder.mName: " + builder.mName + " builder.rName: " + builder.rName);
        }
        this.mName = builder.mName;
        this.rName = builder.rName;
        this.serial = builder.serial;
        this.refresh = builder.refresh;
        this.retry = builder.retry;
        this.expire = builder.expire;
        this.minimum = builder.minimum;
    }

    private DnsRDataSoa(byte[] bArr, int i10, int i11) {
        DnsDomainName newInstance = DnsDomainName.newInstance(bArr, i10, i11);
        this.mName = newInstance;
        int length = newInstance.length() + 0;
        if (length == i11) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build rName in DnsRDataSoa. data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            sb2.append(", cursor: ");
            sb2.append(length);
            throw new IllegalRawDataException(sb2.toString());
        }
        DnsDomainName newInstance2 = DnsDomainName.newInstance(bArr, i10 + length, i11 - length);
        this.rName = newInstance2;
        int length2 = length + newInstance2.length();
        if (length2 + 20 <= i11) {
            this.serial = ByteArrays.getInt(bArr, i10 + length2);
            int i12 = length2 + 4;
            this.refresh = ByteArrays.getInt(bArr, i10 + i12);
            int i13 = i12 + 4;
            this.retry = ByteArrays.getInt(bArr, i10 + i13);
            int i14 = i13 + 4;
            this.expire = ByteArrays.getInt(bArr, i10 + i14);
            this.minimum = ByteArrays.getInt(bArr, i10 + i14 + 4);
            return;
        }
        StringBuilder sb3 = new StringBuilder(200);
        sb3.append("The data is too short to build serial, refresh, retry, expire, and minimumin DnsRDataSoa. data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        sb3.append(", cursor: ");
        sb3.append(length2);
        throw new IllegalRawDataException(sb3.toString());
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("SOA RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MNAME: ");
        DnsDomainName dnsDomainName = this.mName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  RNAME: ");
        sb2.append(bArr != null ? this.rName.toString(bArr) : this.rName.toString());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  SERIAL: ");
        sb2.append(getSerialAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  REFRESH: ");
        sb2.append(getRefreshAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  RETRY: ");
        sb2.append(getRetryAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  EXPIRE: ");
        sb2.append(getExpireAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MINIMUM: ");
        sb2.append(getMinimumAsLong());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataSoa newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataSoa(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataSoa.class != obj.getClass()) {
            return false;
        }
        DnsRDataSoa dnsRDataSoa = (DnsRDataSoa) obj;
        return this.expire == dnsRDataSoa.expire && this.mName.equals(dnsRDataSoa.mName) && this.minimum == dnsRDataSoa.minimum && this.rName.equals(dnsRDataSoa.rName) && this.refresh == dnsRDataSoa.refresh && this.retry == dnsRDataSoa.retry && this.serial == dnsRDataSoa.serial;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public int getExpire() {
        return this.expire;
    }

    public long getExpireAsLong() {
        return this.expire & 4294967295L;
    }

    public DnsDomainName getMName() {
        return this.mName;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public long getMinimumAsLong() {
        return this.minimum & 4294967295L;
    }

    public DnsDomainName getRName() {
        return this.rName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] rawData = this.mName.getRawData();
        byte[] rawData2 = this.rName.getRawData();
        byte[] bArr = new byte[rawData.length + rawData2.length + 20];
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length + 0;
        System.arraycopy(rawData2, 0, bArr, length, rawData2.length);
        int length2 = length + rawData2.length;
        System.arraycopy(ByteArrays.toByteArray(this.serial), 0, bArr, length2, 4);
        int i10 = length2 + 4;
        System.arraycopy(ByteArrays.toByteArray(this.refresh), 0, bArr, i10, 4);
        int i11 = i10 + 4;
        System.arraycopy(ByteArrays.toByteArray(this.retry), 0, bArr, i11, 4);
        int i12 = i11 + 4;
        System.arraycopy(ByteArrays.toByteArray(this.expire), 0, bArr, i12, 4);
        System.arraycopy(ByteArrays.toByteArray(this.minimum), 0, bArr, i12 + 4, 4);
        return bArr;
    }

    public int getRefresh() {
        return this.refresh;
    }

    public long getRefreshAsLong() {
        return this.refresh & 4294967295L;
    }

    public int getRetry() {
        return this.retry;
    }

    public long getRetryAsLong() {
        return this.retry & 4294967295L;
    }

    public int getSerial() {
        return this.serial;
    }

    public long getSerialAsLong() {
        return this.serial & 4294967295L;
    }

    public int hashCode() {
        return ((((((((((((this.expire + 31) * 31) + this.mName.hashCode()) * 31) + this.minimum) * 31) + this.rName.hashCode()) * 31) + this.refresh) * 31) + this.retry) * 31) + this.serial;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.mName.length() + this.rName.length() + 20;
    }

    public String toString() {
        return convertToString("", null);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        return convertToString(str, null);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }
}
