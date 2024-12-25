package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMInfo.class */
public final class DnsRDataMInfo implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 3803968528398017544L;
    private final DnsDomainName eMailBx;
    private final DnsDomainName rMailBx;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMInfo$Builder.class */
    public static final class Builder {
        private DnsDomainName eMailBx;
        private DnsDomainName rMailBx;

        public Builder() {
        }

        private Builder(DnsRDataMInfo dnsRDataMInfo) {
            this.rMailBx = dnsRDataMInfo.rMailBx;
            this.eMailBx = dnsRDataMInfo.eMailBx;
        }

        public DnsRDataMInfo build() {
            return new DnsRDataMInfo(this);
        }

        public Builder eMailBx(DnsDomainName dnsDomainName) {
            this.eMailBx = dnsDomainName;
            return this;
        }

        public Builder rMailBx(DnsDomainName dnsDomainName) {
            this.rMailBx = dnsDomainName;
            return this;
        }
    }

    private DnsRDataMInfo(Builder builder) {
        if (builder != null && builder.rMailBx != null && builder.eMailBx != null) {
            this.rMailBx = builder.rMailBx;
            this.eMailBx = builder.eMailBx;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rMailBx: " + builder.rMailBx + " builder.eMailBx: " + builder.eMailBx);
    }

    private DnsRDataMInfo(byte[] bArr, int i10, int i11) {
        DnsDomainName newInstance = DnsDomainName.newInstance(bArr, i10, i11);
        this.rMailBx = newInstance;
        int length = newInstance.length();
        if (length != i11) {
            this.eMailBx = DnsDomainName.newInstance(bArr, i10 + length, i11 - length);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build eMailBx in DnsRDataMInfo. data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MINFO RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  RMAILBX: ");
        DnsDomainName dnsDomainName = this.rMailBx;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  EMAILBX: ");
        DnsDomainName dnsDomainName2 = this.eMailBx;
        sb2.append(bArr != null ? dnsDomainName2.toString(bArr) : dnsDomainName2.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMInfo newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMInfo(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataMInfo.class != obj.getClass()) {
            return false;
        }
        DnsRDataMInfo dnsRDataMInfo = (DnsRDataMInfo) obj;
        return this.rMailBx.equals(dnsRDataMInfo.rMailBx) && this.eMailBx.equals(dnsRDataMInfo.eMailBx);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getEMailBx() {
        return this.eMailBx;
    }

    public DnsDomainName getRMailBx() {
        return this.rMailBx;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.rMailBx.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length;
        byte[] rawData2 = this.eMailBx.getRawData();
        System.arraycopy(rawData2, 0, bArr, length + 0, rawData2.length);
        return bArr;
    }

    public int hashCode() {
        return ((this.rMailBx.hashCode() + 31) * 31) + this.eMailBx.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.rMailBx.length() + this.eMailBx.length();
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
