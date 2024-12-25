package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataNs.class */
public final class DnsRDataNs implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5232680288519805322L;
    private final DnsDomainName nsDName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataNs$Builder.class */
    public static final class Builder {
        private DnsDomainName nsDName;

        public Builder() {
        }

        private Builder(DnsRDataNs dnsRDataNs) {
            this.nsDName = dnsRDataNs.nsDName;
        }

        public DnsRDataNs build() {
            return new DnsRDataNs(this);
        }

        public Builder nsDName(DnsDomainName dnsDomainName) {
            this.nsDName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataNs(Builder builder) {
        if (builder != null && builder.nsDName != null) {
            this.nsDName = builder.nsDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nsDName: " + builder.nsDName);
    }

    private DnsRDataNs(byte[] bArr, int i10, int i11) {
        this.nsDName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("NS RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  NSDNAME: ");
        DnsDomainName dnsDomainName = this.nsDName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataNs newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataNs(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataNs.class.isInstance(obj)) {
            return this.nsDName.equals(((DnsRDataNs) obj).nsDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getNsDName() {
        return this.nsDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.nsDName.getRawData();
    }

    public int hashCode() {
        return this.nsDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.nsDName.length();
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
