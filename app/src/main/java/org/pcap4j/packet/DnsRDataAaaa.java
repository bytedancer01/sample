package org.pcap4j.packet;

import java.net.Inet6Address;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataAaaa.class */
public final class DnsRDataAaaa implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 69151497541755310L;
    private final Inet6Address address;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataAaaa$Builder.class */
    public static final class Builder {
        private Inet6Address address;

        public Builder() {
        }

        private Builder(DnsRDataAaaa dnsRDataAaaa) {
            this.address = dnsRDataAaaa.address;
        }

        public Builder address(Inet6Address inet6Address) {
            this.address = inet6Address;
            return this;
        }

        public DnsRDataAaaa build() {
            return new DnsRDataAaaa(this);
        }
    }

    private DnsRDataAaaa(Builder builder) {
        if (builder != null && builder.address != null) {
            this.address = builder.address;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address);
    }

    private DnsRDataAaaa(byte[] bArr, int i10, int i11) {
        if (i11 >= 16) {
            this.address = ByteArrays.getInet6Address(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a DnsRDataAaaa (");
        sb2.append(16);
        sb2.append(" bytes). data: ");
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
        sb2.append("AAAA RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  ADDRESS: ");
        sb2.append(this.address.getHostAddress());
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataAaaa newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataAaaa(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (DnsRDataAaaa.class.isInstance(obj)) {
            return this.address.equals(((DnsRDataAaaa) obj).address);
        }
        return false;
    }

    public Inet6Address getAddress() {
        return this.address;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.address.getAddress();
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return 16;
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
