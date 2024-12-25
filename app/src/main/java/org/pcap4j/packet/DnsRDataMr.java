package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMr.class */
public final class DnsRDataMr implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3960543085797464866L;
    private final DnsDomainName newName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMr$Builder.class */
    public static final class Builder {
        private DnsDomainName newName;

        public Builder() {
        }

        private Builder(DnsRDataMr dnsRDataMr) {
            this.newName = dnsRDataMr.newName;
        }

        public DnsRDataMr build() {
            return new DnsRDataMr(this);
        }

        public Builder newName(DnsDomainName dnsDomainName) {
            this.newName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataMr(Builder builder) {
        if (builder != null && builder.newName != null) {
            this.newName = builder.newName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.newName: " + builder.newName);
    }

    private DnsRDataMr(byte[] bArr, int i10, int i11) {
        this.newName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MR RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  NEWNAME: ");
        DnsDomainName dnsDomainName = this.newName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMr newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMr(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataMr.class.isInstance(obj)) {
            return this.newName.equals(((DnsRDataMr) obj).newName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getNewName() {
        return this.newName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.newName.getRawData();
    }

    public int hashCode() {
        return this.newName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.newName.length();
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
