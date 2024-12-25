package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataCName.class */
public final class DnsRDataCName implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3515906031137985263L;
    private final DnsDomainName cName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataCName$Builder.class */
    public static final class Builder {
        private DnsDomainName cName;

        public Builder() {
        }

        private Builder(DnsRDataCName dnsRDataCName) {
            this.cName = dnsRDataCName.cName;
        }

        public DnsRDataCName build() {
            return new DnsRDataCName(this);
        }

        public Builder cName(DnsDomainName dnsDomainName) {
            this.cName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataCName(Builder builder) {
        if (builder != null && builder.cName != null) {
            this.cName = builder.cName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.cName: " + builder.cName);
    }

    private DnsRDataCName(byte[] bArr, int i10, int i11) {
        this.cName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("CNAME RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  CNAME: ");
        DnsDomainName dnsDomainName = this.cName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataCName newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataCName(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataCName.class.isInstance(obj)) {
            return this.cName.equals(((DnsRDataCName) obj).cName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getCName() {
        return this.cName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.cName.getRawData();
    }

    public int hashCode() {
        return this.cName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.cName.length();
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
