package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalDnsRData.class */
public final class IllegalDnsRData implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -4966155227455233333L;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalDnsRData$Builder.class */
    public static final class Builder {
        private byte[] rawData;

        public Builder() {
        }

        private Builder(IllegalDnsRData illegalDnsRData) {
            this.rawData = illegalDnsRData.rawData;
        }

        public IllegalDnsRData build() {
            return new IllegalDnsRData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }
    }

    private IllegalDnsRData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }

    private IllegalDnsRData(byte[] bArr, int i10, int i11) {
        this.rawData = ByteArrays.getSubArray(bArr, i10, i11);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Illegal Data:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  data: ");
        sb2.append(ByteArrays.toHexString(this.rawData, ""));
        sb2.append(property);
        return sb2.toString();
    }

    public static IllegalDnsRData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalDnsRData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalDnsRData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((IllegalDnsRData) obj).rawData);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return ByteArrays.clone(this.rawData);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.rawData.length;
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
