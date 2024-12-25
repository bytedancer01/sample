package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMg.class */
public final class DnsRDataMg implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 884121664381530886L;
    private final DnsDomainName mgMName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMg$Builder.class */
    public static final class Builder {
        private DnsDomainName mgMName;

        public Builder() {
        }

        private Builder(DnsRDataMg dnsRDataMg) {
            this.mgMName = dnsRDataMg.mgMName;
        }

        public DnsRDataMg build() {
            return new DnsRDataMg(this);
        }

        public Builder mgMName(DnsDomainName dnsDomainName) {
            this.mgMName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataMg(Builder builder) {
        if (builder != null && builder.mgMName != null) {
            this.mgMName = builder.mgMName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.mgMName: " + builder.mgMName);
    }

    private DnsRDataMg(byte[] bArr, int i10, int i11) {
        this.mgMName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MG RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MGMNAME: ");
        DnsDomainName dnsDomainName = this.mgMName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMg newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMg(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMg.class.isInstance(obj)) {
            return this.mgMName.equals(((DnsRDataMg) obj).mgMName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getMgMName() {
        return this.mgMName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.mgMName.getRawData();
    }

    public int hashCode() {
        return this.mgMName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.mgMName.length();
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
