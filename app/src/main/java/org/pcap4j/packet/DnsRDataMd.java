package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMd.class */
public final class DnsRDataMd implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 5794973800929226101L;
    private final DnsDomainName maDName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMd$Builder.class */
    public static final class Builder {
        private DnsDomainName maDName;

        public Builder() {
        }

        private Builder(DnsRDataMd dnsRDataMd) {
            this.maDName = dnsRDataMd.maDName;
        }

        public DnsRDataMd build() {
            return new DnsRDataMd(this);
        }

        public Builder maDName(DnsDomainName dnsDomainName) {
            this.maDName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataMd(Builder builder) {
        if (builder != null && builder.maDName != null) {
            this.maDName = builder.maDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.maDName: " + builder.maDName);
    }

    private DnsRDataMd(byte[] bArr, int i10, int i11) {
        this.maDName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MD RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MADNAME: ");
        DnsDomainName dnsDomainName = this.maDName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMd newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMd(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMd.class.isInstance(obj)) {
            return this.maDName.equals(((DnsRDataMd) obj).maDName);
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
