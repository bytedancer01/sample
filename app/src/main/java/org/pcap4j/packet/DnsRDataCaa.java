package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataCaa.class */
public final class DnsRDataCaa implements DnsResourceRecord.DnsRData {
    private static final int CAA_RR_MIN_LEN = 2;
    private static final long serialVersionUID = -1015182073420031158L;
    private final boolean critical;
    private final byte reservedFlags;
    private final String tag;
    private final String value;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataCaa$Builder.class */
    public static final class Builder {
        private boolean critical;
        private byte reservedFlags;
        private String tag;
        private String value;

        public Builder() {
        }

        private Builder(DnsRDataCaa dnsRDataCaa) {
            this.critical = dnsRDataCaa.critical;
            this.reservedFlags = dnsRDataCaa.reservedFlags;
            this.tag = dnsRDataCaa.tag;
            this.value = dnsRDataCaa.value;
        }

        public DnsRDataCaa build() {
            return new DnsRDataCaa(this);
        }

        public Builder critical(boolean z10) {
            this.critical = z10;
            return this;
        }

        public Builder reservedFlags(byte b10) {
            this.reservedFlags = b10;
            return this;
        }

        public Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    private DnsRDataCaa(Builder builder) {
        if (builder.tag == null || builder.value == null) {
            throw new NullPointerException(" builder.tag: " + builder.tag + " builder.value: " + builder.value);
        }
        if ((builder.reservedFlags & 128) != 0) {
            throw new IllegalArgumentException("(builder.reservedFlags & 0x80) must be zero. builder.reservedFlags: " + ((int) builder.reservedFlags));
        }
        if (builder.tag.getBytes().length > 255) {
            throw new IllegalArgumentException("builder.tag.getBytes().length must be less than 256. builder.tag: " + builder.tag);
        }
        this.critical = builder.critical;
        this.reservedFlags = builder.reservedFlags;
        this.tag = builder.tag;
        this.value = builder.value;
    }

    private DnsRDataCaa(byte[] bArr, int i10, int i11) {
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a DnsRDataCaa (Min: ");
            sb2.append(2);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        this.critical = (b10 & 128) != 0;
        this.reservedFlags = (byte) (b10 & Byte.MAX_VALUE);
        int i12 = bArr[i10 + 1] & 255;
        int i13 = 2 + i12;
        if (i11 >= i13) {
            this.tag = new String(bArr, i10 + 2, i12);
            this.value = new String(bArr, i10 + i13, i11 - i13);
            return;
        }
        StringBuilder sb3 = new StringBuilder(200);
        sb3.append("The data is too short to build a DnsRDataCaa (Tag Length: ");
        sb3.append(i12);
        sb3.append(" bytes). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    public static DnsRDataCaa newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataCaa(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataCaa.class != obj.getClass()) {
            return false;
        }
        DnsRDataCaa dnsRDataCaa = (DnsRDataCaa) obj;
        if (this.critical == dnsRDataCaa.critical && this.reservedFlags == dnsRDataCaa.reservedFlags && this.tag.equals(dnsRDataCaa.tag)) {
            return this.value.equals(dnsRDataCaa.value);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte b10 = this.reservedFlags;
        bArr[0] = b10;
        if (this.critical) {
            bArr[0] = (byte) (b10 | 128);
        }
        byte[] bytes = this.tag.getBytes();
        bArr[1] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        int length = bytes.length;
        byte[] bytes2 = this.value.getBytes();
        System.arraycopy(bytes2, 0, bArr, length + 2, bytes2.length);
        return bArr;
    }

    public byte getReservedFlags() {
        return this.reservedFlags;
    }

    public String getTag() {
        return this.tag;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((((this.critical ? 1 : 0) * 31) + this.reservedFlags) * 31) + this.tag.hashCode()) * 31) + this.value.hashCode();
    }

    public boolean isCritical() {
        return this.critical;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.tag.getBytes().length + 2 + this.value.getBytes().length;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        String property = System.getProperty("line.separator");
        return str + "CAA RDATA:" + property + str + "  Issuer Critical: " + this.critical + property + str + "  Reserved Flags: 0x" + ByteArrays.toHexString(this.reservedFlags, "") + property + str + "  Tag: " + this.tag + property + str + "  Value: " + this.value + property;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        return toString(str);
    }
}
