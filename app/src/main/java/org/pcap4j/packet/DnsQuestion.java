package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.packet.namednumber.DnsClass;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsQuestion.class */
public final class DnsQuestion implements Serializable {
    private static final long serialVersionUID = -709060058515052575L;
    private final DnsClass qClass;
    private final DnsDomainName qName;
    private final DnsResourceRecordType qType;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsQuestion$Builder.class */
    public static final class Builder {
        private DnsClass qClass;
        private DnsDomainName qName;
        private DnsResourceRecordType qType;

        public Builder() {
        }

        private Builder(DnsQuestion dnsQuestion) {
            this.qName = dnsQuestion.qName;
            this.qType = dnsQuestion.qType;
            this.qClass = dnsQuestion.qClass;
        }

        public DnsQuestion build() {
            return new DnsQuestion(this);
        }

        public Builder qClass(DnsClass dnsClass) {
            this.qClass = dnsClass;
            return this;
        }

        public Builder qName(DnsDomainName dnsDomainName) {
            this.qName = dnsDomainName;
            return this;
        }

        public Builder qType(DnsResourceRecordType dnsResourceRecordType) {
            this.qType = dnsResourceRecordType;
            return this;
        }
    }

    private DnsQuestion(Builder builder) {
        if (builder != null && builder.qName != null && builder.qType != null && builder.qClass != null) {
            this.qName = builder.qName;
            this.qType = builder.qType;
            this.qClass = builder.qClass;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.qName: " + builder.qName + " builder.qType: " + builder.qType + " builder.qClass: " + builder.qClass);
    }

    private DnsQuestion(byte[] bArr, int i10, int i11) {
        DnsDomainName newInstance = DnsDomainName.newInstance(bArr, i10, i11);
        this.qName = newInstance;
        int length = newInstance.length() + 0;
        if (i11 - length >= 4) {
            this.qType = DnsResourceRecordType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + length)));
            this.qClass = DnsClass.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + length + 2)));
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build qType an qClass of DnsQuestion. data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        sb2.append(", cursor: ");
        sb2.append(length);
        throw new IllegalRawDataException(sb2.toString());
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("QNAME: ");
        sb2.append(bArr != null ? this.qName.toString(bArr) : this.qName);
        sb2.append(property);
        sb2.append(str);
        sb2.append("QTYPE: ");
        sb2.append(this.qType);
        sb2.append(property);
        sb2.append(str);
        sb2.append("QCLASS: ");
        sb2.append(this.qClass);
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsQuestion newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsQuestion(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsQuestion.class != obj.getClass()) {
            return false;
        }
        DnsQuestion dnsQuestion = (DnsQuestion) obj;
        return this.qClass.equals(dnsQuestion.qClass) && this.qName.equals(dnsQuestion.qName) && this.qType.equals(dnsQuestion.qType);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsClass getQClass() {
        return this.qClass;
    }

    public DnsDomainName getQName() {
        return this.qName;
    }

    public DnsResourceRecordType getQType() {
        return this.qType;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.qName.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length + 0;
        System.arraycopy(ByteArrays.toByteArray(this.qType.value().shortValue()), 0, bArr, length, 2);
        System.arraycopy(ByteArrays.toByteArray(this.qClass.value().shortValue()), 0, bArr, length + 2, 2);
        return bArr;
    }

    public int hashCode() {
        return ((((this.qClass.hashCode() + 31) * 31) + this.qName.hashCode()) * 31) + this.qType.hashCode();
    }

    public int length() {
        return this.qName.length() + 4;
    }

    public String toString() {
        return convertToString("", null);
    }

    public String toString(String str) {
        return convertToString(str, null);
    }

    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }
}
