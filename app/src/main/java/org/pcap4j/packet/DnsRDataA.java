package org.pcap4j.packet;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataA.class */
public final class DnsRDataA implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 6539022022231148667L;
    private final Inet4Address address;
    private final boolean addressPlainText;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataA$Builder.class */
    public static final class Builder {
        private Inet4Address address;
        private boolean addressPlainText;

        public Builder() {
        }

        private Builder(DnsRDataA dnsRDataA) {
            this.address = dnsRDataA.address;
            this.addressPlainText = dnsRDataA.addressPlainText;
        }

        public Builder address(Inet4Address inet4Address) {
            this.address = inet4Address;
            return this;
        }

        public Builder addressPlainText(boolean z10) {
            this.addressPlainText = z10;
            return this;
        }

        public DnsRDataA build() {
            return new DnsRDataA(this);
        }
    }

    private DnsRDataA(Builder builder) {
        if (builder != null && builder.address != null) {
            this.address = builder.address;
            this.addressPlainText = builder.addressPlainText;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.address: " + builder.address);
    }

    private DnsRDataA(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a DnsRDataA (Min: ");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (i11 == 4) {
            this.address = ByteArrays.getInet4Address(bArr, i10);
            z10 = false;
        } else {
            String str = new String(ByteArrays.getSubArray(bArr, i10, i11));
            try {
                this.address = (Inet4Address) InetAddress.getByAddress(ByteArrays.parseInet4Address(str));
                z10 = true;
            } catch (IllegalArgumentException e10) {
                StringBuilder sb3 = new StringBuilder(200);
                sb3.append("Couldn't get an Inet4Address from ");
                sb3.append(str);
                sb3.append(". data: ");
                sb3.append(ByteArrays.toHexString(bArr, " "));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString(), e10);
            } catch (UnknownHostException e11) {
                throw new AssertionError("Never get here.");
            }
        }
        this.addressPlainText = z10;
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("A RDATA:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  ADDRESS: ");
        sb2.append(this.address.getHostAddress());
        sb2.append(" (");
        sb2.append(this.addressPlainText ? "text" : "encoded");
        sb2.append(")");
        sb2.append(property);
        return sb2.toString();
    }

    public static DnsRDataA newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataA(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsRDataA.class != obj.getClass()) {
            return false;
        }
        DnsRDataA dnsRDataA = (DnsRDataA) obj;
        if (this.addressPlainText != dnsRDataA.addressPlainText) {
            return false;
        }
        return this.address.equals(dnsRDataA.address);
    }

    public Inet4Address getAddress() {
        return this.address;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        return this.addressPlainText ? this.address.getHostAddress().getBytes() : this.address.getAddress();
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + (this.addressPlainText ? 1 : 0);
    }

    public boolean isAddressPlainText() {
        return this.addressPlainText;
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        if (this.addressPlainText) {
            return this.address.getHostAddress().length();
        }
        return 4;
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
