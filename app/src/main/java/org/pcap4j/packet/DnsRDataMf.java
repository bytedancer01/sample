package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMf.class */
public final class DnsRDataMf implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -3535653721390953465L;
    private final DnsDomainName maDName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMf$Builder.class */
    public static final class Builder {
        private DnsDomainName maDName;

        public Builder() {
        }

        private Builder(DnsRDataMf dnsRDataMf) {
            this.maDName = dnsRDataMf.maDName;
        }

        public DnsRDataMf build() {
            return new DnsRDataMf(this);
        }

        public Builder maDName(DnsDomainName dnsDomainName) {
            this.maDName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataMf(Builder builder) {
        if (builder != null && builder.maDName != null) {
            this.maDName = builder.maDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.maDName: " + builder.maDName);
    }

    private DnsRDataMf(byte[] bArr, int i10, int i11) {
        this.maDName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MF RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MADNAME: ");
        DnsDomainName dnsDomainName = this.maDName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMf newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMf(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMf.class.isInstance(obj)) {
            return this.maDName.equals(((DnsRDataMf) obj).maDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getMaDName() {
        return this.maDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.maDName.getRawData();
    }

    public int hashCode() {
        return this.maDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.maDName.length();
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
