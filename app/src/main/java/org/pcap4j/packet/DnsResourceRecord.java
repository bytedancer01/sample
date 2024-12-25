package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.DnsClass;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsResourceRecord.class */
public final class DnsResourceRecord implements Serializable {
    private static final long serialVersionUID = 4951400991563055073L;
    private final DnsClass dataClass;
    private final DnsResourceRecordType dataType;
    private final DnsDomainName name;
    private final DnsRData rData;
    private final short rdLength;
    private final int ttl;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsResourceRecord$Builder.class */
    public static final class Builder implements LengthBuilder<DnsResourceRecord> {
        private boolean correctLengthAtBuild;
        private DnsClass dataClass;
        private DnsResourceRecordType dataType;
        private DnsDomainName name;
        private DnsRData rData;
        private short rdLength;
        private int ttl;

        public Builder() {
            this.correctLengthAtBuild = false;
        }

        private Builder(DnsResourceRecord dnsResourceRecord) {
            this.correctLengthAtBuild = false;
            this.name = dnsResourceRecord.name;
            this.dataType = dnsResourceRecord.dataType;
            this.dataClass = dnsResourceRecord.dataClass;
            this.ttl = dnsResourceRecord.ttl;
            this.rdLength = dnsResourceRecord.rdLength;
            this.rData = dnsResourceRecord.rData;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public DnsResourceRecord build() {
            return new DnsResourceRecord(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<DnsResourceRecord> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dataClass(DnsClass dnsClass) {
            this.dataClass = dnsClass;
            return this;
        }

        public Builder dataType(DnsResourceRecordType dnsResourceRecordType) {
            this.dataType = dnsResourceRecordType;
            return this;
        }

        public Builder name(DnsDomainName dnsDomainName) {
            this.name = dnsDomainName;
            return this;
        }

        public Builder rData(DnsRData dnsRData) {
            this.rData = dnsRData;
            return this;
        }

        public Builder rdLength(short s10) {
            this.rdLength = s10;
            return this;
        }

        public Builder ttl(int i10) {
            this.ttl = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsResourceRecord$DnsRData.class */
    public interface DnsRData extends Serializable {
        byte[] getRawData();

        int length();

        String toString(String str);

        String toString(String str, byte[] bArr);
    }

    private DnsResourceRecord(Builder builder) {
        short s10;
        if (builder == null || builder.name == null || builder.dataType == null || builder.dataClass == null) {
            throw new NullPointerException("builder" + builder + " builder.name: " + builder.name + " builder.dataType: " + builder.dataType + " builder.dataClass: " + builder.dataClass);
        }
        this.name = builder.name;
        this.dataType = builder.dataType;
        this.dataClass = builder.dataClass;
        this.ttl = builder.ttl;
        DnsRData dnsRData = builder.rData;
        this.rData = dnsRData;
        if (builder.correctLengthAtBuild) {
            int length = dnsRData == null ? 0 : dnsRData.length();
            if (((-65536) & length) != 0) {
                throw new IllegalArgumentException("(rData.length() & 0xFFFF0000) must be zero. rData: " + dnsRData);
            }
            s10 = (short) length;
        } else {
            s10 = builder.rdLength;
        }
        this.rdLength = s10;
    }

    private DnsResourceRecord(byte[] bArr, int i10, int i11) {
        DnsDomainName newInstance = DnsDomainName.newInstance(bArr, i10, i11);
        this.name = newInstance;
        int length = newInstance.length() + 0;
        if (i11 - length < 10) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build type, class, ttl, and rdlength of DnsResourceRecord. data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            sb2.append(", cursor: ");
            sb2.append(length);
            throw new IllegalRawDataException(sb2.toString());
        }
        DnsResourceRecordType dnsResourceRecordType = DnsResourceRecordType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + length)));
        this.dataType = dnsResourceRecordType;
        int i12 = length + 2;
        this.dataClass = DnsClass.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + i12)));
        int i13 = i12 + 2;
        this.ttl = ByteArrays.getInt(bArr, i10 + i13);
        int i14 = i13 + 4;
        this.rdLength = ByteArrays.getShort(bArr, i10 + i14);
        int i15 = i14 + 2;
        int rdLengthAsInt = getRdLengthAsInt();
        if (i11 - i15 >= rdLengthAsInt) {
            this.rData = rdLengthAsInt != 0 ? (DnsRData) PacketFactories.getFactory(DnsRData.class, DnsResourceRecordType.class).newInstance(bArr, i10 + i15, rdLengthAsInt, dnsResourceRecordType) : null;
            return;
        }
        StringBuilder sb3 = new StringBuilder(200);
        sb3.append("The data is too short to build rData of DnsResourceRecord (");
        sb3.append(rdLengthAsInt);
        sb3.append(" bytes). data: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        sb3.append(", cursor: ");
        sb3.append(i15);
        sb3.append(", dataType: ");
        sb3.append(dnsResourceRecordType);
        throw new IllegalRawDataException(sb3.toString());
    }

    private String convertToString(String str, byte[] bArr) {
        String dnsRData;
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("NAME: ");
        DnsDomainName dnsDomainName = this.name;
        String str2 = dnsDomainName;
        if (bArr != null) {
            str2 = dnsDomainName.toString(bArr);
        }
        sb2.append((Object) str2);
        sb2.append(property);
        sb2.append(str);
        sb2.append("TYPE: ");
        sb2.append(this.dataType);
        sb2.append(property);
        sb2.append(str);
        sb2.append("CLASS: ");
        sb2.append(this.dataClass);
        sb2.append(property);
        sb2.append(str);
        sb2.append("TTL: ");
        sb2.append(getTtlAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("RDLENGTH: ");
        sb2.append(getRdLengthAsInt());
        sb2.append(property);
        if (this.rData != null) {
            sb2.append(str);
            sb2.append("RDATA:");
            sb2.append(property);
            if (bArr != null) {
                dnsRData = this.rData.toString(str + "  ", bArr);
            } else {
                dnsRData = this.rData.toString(str + "  ");
            }
            sb2.append(dnsRData);
        }
        return sb2.toString();
    }

    public static DnsResourceRecord newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsResourceRecord(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsResourceRecord.class != obj.getClass()) {
            return false;
        }
        DnsResourceRecord dnsResourceRecord = (DnsResourceRecord) obj;
        if (this.ttl != dnsResourceRecord.ttl || this.rdLength != dnsResourceRecord.rdLength || !this.name.equals(dnsResourceRecord.name) || !this.dataType.equals(dnsResourceRecord.dataType) || !this.dataClass.equals(dnsResourceRecord.dataClass)) {
            return false;
        }
        DnsRData dnsRData = this.rData;
        DnsRData dnsRData2 = dnsResourceRecord.rData;
        if (dnsRData != null) {
            z10 = dnsRData.equals(dnsRData2);
        } else if (dnsRData2 != null) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsClass getDataClass() {
        return this.dataClass;
    }

    public DnsResourceRecordType getDataType() {
        return this.dataType;
    }

    public DnsDomainName getName() {
        return this.name;
    }

    public DnsRData getRData() {
        return this.rData;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.name.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length + 0;
        System.arraycopy(ByteArrays.toByteArray(this.dataType.value().shortValue()), 0, bArr, length, 2);
        int i10 = length + 2;
        System.arraycopy(ByteArrays.toByteArray(this.dataClass.value().shortValue()), 0, bArr, i10, 2);
        int i11 = i10 + 2;
        System.arraycopy(ByteArrays.toByteArray(this.ttl), 0, bArr, i11, 4);
        int i12 = i11 + 4;
        System.arraycopy(ByteArrays.toByteArray(this.rdLength), 0, bArr, i12, 2);
        DnsRData dnsRData = this.rData;
        if (dnsRData != null) {
            byte[] rawData2 = dnsRData.getRawData();
            System.arraycopy(rawData2, 0, bArr, i12 + 2, rawData2.length);
        }
        return bArr;
    }

    public short getRdLength() {
        return this.rdLength;
    }

    public int getRdLengthAsInt() {
        return this.rdLength & 65535;
    }

    public int getTtl() {
        return this.ttl;
    }

    public long getTtlAsLong() {
        return this.ttl & 4294967295L;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.dataType.hashCode();
        int hashCode3 = this.dataClass.hashCode();
        int i10 = this.ttl;
        short s10 = this.rdLength;
        DnsRData dnsRData = this.rData;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i10) * 31) + s10) * 31) + (dnsRData != null ? dnsRData.hashCode() : 0);
    }

    public int length() {
        DnsRData dnsRData = this.rData;
        return this.name.length() + 6 + 4 + (dnsRData == null ? 0 : dnsRData.length());
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
