package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMx.class */
public final class DnsRDataMx implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -5914050306503756427L;
    private final DnsDomainName exchange;
    private final short preference;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataMx$Builder.class */
    public static final class Builder {
        private DnsDomainName exchange;
        private short preference;

        public Builder() {
        }

        private Builder(DnsRDataMx dnsRDataMx) {
            this.preference = dnsRDataMx.preference;
            this.exchange = dnsRDataMx.exchange;
        }

        public DnsRDataMx build() {
            return new DnsRDataMx(this);
        }

        public Builder exchange(DnsDomainName dnsDomainName) {
            this.exchange = dnsDomainName;
            return this;
        }

        public Builder preference(short s10) {
            this.preference = s10;
            return this;
        }
    }

    private DnsRDataMx(Builder builder) {
        if (builder != null && builder.exchange != null) {
            this.preference = builder.preference;
            this.exchange = builder.exchange;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.exchange: " + builder.exchange);
    }

    private DnsRDataMx(byte[] bArr, int i10, int i11) {
        if (i11 >= 3) {
            this.preference = ByteArrays.getShort(bArr, i10);
            this.exchange = DnsDomainName.newInstance(bArr, i10 + 2, i11 - 2);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a DnsRDataMx (");
        sb2.append(3);
        sb2.append(" bytes at least). data: ");
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
        sb2.append("MX RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  PREFERENCE: ");
        sb2.append((int) this.preference);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  EXCHANGE: ");
        DnsDomainName dnsDomainName = this.exchange;
        sb2.append(bArr != null ? dnsDomainName.toString(bArr) : dnsDomainName.toString());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataMx newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataMx(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataMx.class != obj.getClass()) {
            return false;
        }
        DnsRDataMx dnsRDataMx = (DnsRDataMx) obj;
        return this.exchange.equals(dnsRDataMx.exchange) && this.preference == dnsRDataMx.preference;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsDomainName getExchange() {
        return this.exchange;
    }

    public short getPreference() {
        return this.preference;
    }

    public int getPreferenceAsInt() {
        return this.preference;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] rawData = this.exchange.getRawData();
        byte[] bArr = new byte[rawData.length + 2];
        System.arraycopy(ByteArrays.toByteArray(this.preference), 0, bArr, 0, 2);
        System.arraycopy(rawData, 0, bArr, 2, rawData.length);
        return bArr;
    }

    public int hashCode() {
        return ((this.exchange.hashCode() + 31) * 31) + this.preference;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.exchange.length() + 2;
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
