package org.pcap4j.packet;

import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataHInfo.class */
public final class DnsRDataHInfo implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = -4910328276617707827L;
    private final String cpu;

    /* renamed from: os */
    private final String f36242os;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataHInfo$Builder.class */
    public static final class Builder {
        private String cpu;

        /* renamed from: os */
        private String f36243os;

        public Builder() {
        }

        private Builder(DnsRDataHInfo dnsRDataHInfo) {
            this.cpu = dnsRDataHInfo.cpu;
            this.f36243os = dnsRDataHInfo.f36242os;
        }

        public DnsRDataHInfo build() {
            return new DnsRDataHInfo(this);
        }

        public Builder cpu(String str) {
            this.cpu = str;
            return this;
        }

        /* renamed from: os */
        public Builder m32159os(String str) {
            this.f36243os = str;
            return this;
        }
    }

    private DnsRDataHInfo(Builder builder) {
        if (builder == null || builder.cpu == null || builder.f36243os == null) {
            throw new NullPointerException("builder: " + builder + " builder.cpu: " + builder.cpu + " builder.os: " + builder.f36243os);
        }
        if (builder.cpu.getBytes().length > 255) {
            throw new IllegalArgumentException("Length of cpu must be less than 256. cpu: " + builder.cpu);
        }
        if (builder.f36243os.getBytes().length <= 255) {
            this.cpu = builder.cpu;
            this.f36242os = builder.f36243os;
        } else {
            throw new IllegalArgumentException("Length of os must be less than 256. os: " + builder.f36243os);
        }
    }

    private DnsRDataHInfo(byte[] bArr, int i10, int i11) {
        int i12 = bArr[i10] & 255;
        int i13 = i12 + 1;
        if (i13 > i11 - 1) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build cpu and os in DnsRDataHInfo. data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            sb2.append(", cursor: ");
            sb2.append(1);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.cpu = new String(bArr, i10 + 1, i12);
        int i14 = bArr[i10 + i13] & 255;
        int i15 = i13 + 1;
        if (i14 <= i11 - i15) {
            this.f36242os = new String(bArr, i10 + i15, i14);
            return;
        }
        StringBuilder sb3 = new StringBuilder(200);
        sb3.append("The data is too short to build os in DnsRDataHInfo (");
        sb3.append(i14);
        sb3.append(" bytes). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        sb3.append(", cursor: ");
        sb3.append(i15);
        throw new IllegalRawDataException(sb3.toString());
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("HINFO RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  CPU: ");
        sb2.append(this.cpu);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  OS: ");
        sb2.append(this.f36242os);
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataHInfo newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataHInfo(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataHInfo.class != obj.getClass()) {
            return false;
        }
        DnsRDataHInfo dnsRDataHInfo = (DnsRDataHInfo) obj;
        return this.cpu.equals(dnsRDataHInfo.cpu) && this.f36242os.equals(dnsRDataHInfo.f36242os);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getOs() {
        return this.f36242os;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] bytes = this.cpu.getBytes();
        bArr[0] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        int length = bytes.length + 1;
        byte[] bytes2 = this.f36242os.getBytes();
        bArr[length] = (byte) bytes2.length;
        System.arraycopy(bytes2, 0, bArr, length + 1, bytes2.length);
        return bArr;
    }

    public int hashCode() {
        return ((this.cpu.hashCode() + 31) * 31) + this.f36242os.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.cpu.getBytes().length + this.f36242os.getBytes().length + 2;
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
