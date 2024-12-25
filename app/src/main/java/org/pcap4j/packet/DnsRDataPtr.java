package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataPtr.class */
public final class DnsRDataPtr implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3845617703457911405L;
    private final DnsDomainName ptrDName;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataPtr$Builder.class */
    public static final class Builder {
        private DnsDomainName ptrDName;

        public Builder() {
        }

        private Builder(DnsRDataPtr dnsRDataPtr) {
            this.ptrDName = dnsRDataPtr.ptrDName;
        }

        public DnsRDataPtr build() {
            return new DnsRDataPtr(this);
        }

        public Builder ptrDName(DnsDomainName dnsDomainName) {
            this.ptrDName = dnsDomainName;
            return this;
        }
    }

    private DnsRDataPtr(Builder builder) {
        if (builder != null && builder.ptrDName != null) {
            this.ptrDName = builder.ptrDName;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.ptrDName: " + builder.ptrDName);
    }

    private DnsRDataPtr(byte[] bArr, int i10, int i11) {
        this.ptrDName = DnsDomainName.newInstance(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("PTR RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  PTRDNAME: ");
        DnsDomainName dnsDomainName = this.ptrDName;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataPtr newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataPtr(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataPtr.class.isInstance(obj)) {
            return this.ptrDName.equals(((DnsRDataPtr) obj).ptrDName);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getPtrDName() {
        return this.ptrDName;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.ptrDName.getRawData();
    }

    public int hashCode() {
        return this.ptrDName.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.ptrDName.length();
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
