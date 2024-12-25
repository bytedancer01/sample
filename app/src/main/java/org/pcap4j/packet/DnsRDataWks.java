package org.pcap4j.packet;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataWks.class */
public final class DnsRDataWks implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 4550031993619542554L;
    private final Inet4Address address;
    private final byte[] bitMap;
    private final List<Integer> portNumbers;
    private final IpNumber protocol;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataWks$Builder.class */
    public static final class Builder {
        private Inet4Address address;
        private byte[] bitMap;
        private List<Integer> portNumbers;
        private IpNumber protocol;

        public Builder() {
            this.bitMap = null;
            this.portNumbers = null;
        }

        private Builder(DnsRDataWks dnsRDataWks) {
            this.bitMap = null;
            this.portNumbers = null;
            this.address = dnsRDataWks.address;
            this.protocol = dnsRDataWks.protocol;
            this.bitMap = dnsRDataWks.bitMap;
        }

        public Builder address(Inet4Address inet4Address) {
            this.address = inet4Address;
            return this;
        }

        public Builder bitMap(byte[] bArr) {
            this.bitMap = bArr;
            this.portNumbers = null;
            return this;
        }

        public DnsRDataWks build() {
            return new DnsRDataWks(this);
        }

        public Builder portNumbers(List<Integer> list) {
            this.portNumbers = list;
            this.bitMap = null;
            return this;
        }

        public Builder protocol(IpNumber ipNumber) {
            this.protocol = ipNumber;
            return this;
        }
    }

    private DnsRDataWks(Builder builder) {
        if (builder == null || builder.address == null || builder.protocol == null) {
            throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address + " builder.protocol: " + builder.protocol);
        }
        this.address = builder.address;
        this.protocol = builder.protocol;
        if (builder.bitMap != null) {
            if (builder.bitMap.length <= 8192) {
                byte[] clone = ByteArrays.clone(builder.bitMap);
                this.bitMap = clone;
                this.portNumbers = toPortNumbers(clone);
                return;
            } else {
                throw new IllegalArgumentException("Length of bitMap must be less than 8193. builder.bitMap.length: " + builder.bitMap.length);
            }
        }
        if (builder.portNumbers == null) {
            throw new NullPointerException("Both bitMap and portNumbers are null.");
        }
        ArrayList arrayList = new ArrayList(builder.portNumbers);
        this.portNumbers = arrayList;
        if (arrayList.size() == 0) {
            this.bitMap = new byte[0];
            return;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
        if (((-65536) & intValue) != 0) {
            throw new IllegalArgumentException("(port & 0xFFFF0000) must be zero. port: " + intValue);
        }
        this.bitMap = new byte[(intValue / 8) + 1];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            byte[] bArr = this.bitMap;
            int i10 = intValue2 / 8;
            bArr[i10] = (byte) ((128 >> (intValue2 % 8)) | bArr[i10]);
        }
    }

    private DnsRDataWks(byte[] bArr, int i10, int i11) {
        if (i11 < 5) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a DnsRDataWks (");
            sb2.append(5);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.address = ByteArrays.getInet4Address(bArr, i10);
        this.protocol = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 4)));
        if (5 < i11) {
            this.bitMap = ByteArrays.getSubArray(bArr, i10 + 5, i11 - 5);
        } else {
            this.bitMap = new byte[0];
        }
        byte[] bArr2 = this.bitMap;
        if (bArr2.length <= 8192) {
            this.portNumbers = toPortNumbers(bArr2);
            return;
        }
        throw new IllegalRawDataException("Length of bitMap must be less than 8193. bitMap.length: " + this.bitMap.length);
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("WKS RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  ADDRESS: ");
        sb2.append(this.address.getHostAddress());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  PROTOCOL: ");
        sb2.append(this.protocol);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  BIT MAP: 0x");
        sb2.append(ByteArrays.toHexString(this.bitMap, ""));
        sb2.append(property);
        sb2.append(str);
        sb2.append("  PORTS: ");
        Iterator<Integer> it = this.portNumbers.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataWks newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataWks(bArr, i10, i11);
    }

    private List<Integer> toPortNumbers(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (byte b10 : bArr) {
            for (int i11 = 7; i11 >= 0; i11--) {
                if (((b10 >> i11) & 1) != 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i10++;
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataWks.class != obj.getClass()) {
            return false;
        }
        DnsRDataWks dnsRDataWks = (DnsRDataWks) obj;
        return this.address.equals(dnsRDataWks.address) && Arrays.equals(this.bitMap, dnsRDataWks.bitMap) && this.protocol.equals(dnsRDataWks.protocol);
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    public byte[] getBitMap() {
        return ByteArrays.clone(this.bitMap);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public List<Integer> getPortNumbers() {
        return new ArrayList(this.portNumbers);
    }

    public IpNumber getProtocol() {
        return this.protocol;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        System.arraycopy(this.address.getAddress(), 0, bArr, 0, 4);
        System.arraycopy(ByteArrays.toByteArray(this.protocol.value().byteValue()), 0, bArr, 4, 1);
        byte[] bArr2 = this.bitMap;
        System.arraycopy(bArr2, 0, bArr, 5, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return ((((this.address.hashCode() + 31) * 31) + Arrays.hashCode(this.bitMap)) * 31) + this.protocol.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        return this.bitMap.length + 5;
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
