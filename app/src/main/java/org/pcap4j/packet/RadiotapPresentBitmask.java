package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.namednumber.RadiotapPresentBitNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPresentBitmask.class */
public final class RadiotapPresentBitmask implements Serializable {
    private static final long serialVersionUID = -4525947413002802922L;
    private final boolean anotherBitmapFollows;
    private final List<RadiotapPresentBitNumber> bitNumbers;
    private final String namespace;
    private final boolean radiotapNamespaceNext;
    private final boolean vendorNamespaceNext;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPresentBitmask$Builder.class */
    public static final class Builder {
        private boolean anotherBitmapFollows;
        private List<RadiotapPresentBitNumber> bitNumbers;
        private String namespace;
        private boolean radiotapNamespaceNext;
        private boolean vendorNamespaceNext;

        public Builder() {
        }

        private Builder(RadiotapPresentBitmask radiotapPresentBitmask) {
            this.namespace = radiotapPresentBitmask.namespace;
            this.bitNumbers = radiotapPresentBitmask.bitNumbers;
            this.radiotapNamespaceNext = radiotapPresentBitmask.radiotapNamespaceNext;
            this.vendorNamespaceNext = radiotapPresentBitmask.vendorNamespaceNext;
            this.anotherBitmapFollows = radiotapPresentBitmask.anotherBitmapFollows;
        }

        public Builder anotherBitmapFollows(boolean z10) {
            this.anotherBitmapFollows = z10;
            return this;
        }

        public Builder bitNumbers(List<RadiotapPresentBitNumber> list) {
            this.bitNumbers = list;
            return this;
        }

        public RadiotapPresentBitmask build() {
            return new RadiotapPresentBitmask(this);
        }

        public Builder namespace(String str) {
            this.namespace = str;
            return this;
        }

        public Builder radiotapNamespaceNext(boolean z10) {
            this.radiotapNamespaceNext = z10;
            return this;
        }

        public Builder vendorNamespaceNext(boolean z10) {
            this.vendorNamespaceNext = z10;
            return this;
        }
    }

    private RadiotapPresentBitmask(Builder builder) {
        if (builder == null || builder.namespace == null || builder.bitNumbers == null) {
            throw new NullPointerException("builder: " + builder + " builder.namespace: " + builder.namespace + " builder.bitNumbers: " + builder.bitNumbers);
        }
        if (builder.bitNumbers.size() > 29) {
            throw new IllegalArgumentException("bitNumbers.size() must be less than 30 but is: " + builder.bitNumbers.size());
        }
        this.namespace = builder.namespace;
        this.bitNumbers = new ArrayList(builder.bitNumbers);
        this.radiotapNamespaceNext = builder.radiotapNamespaceNext;
        this.vendorNamespaceNext = builder.vendorNamespaceNext;
        this.anotherBitmapFollows = builder.anotherBitmapFollows;
    }

    private RadiotapPresentBitmask(byte[] bArr, int i10, int i11, int i12, String str) {
        if (4 > i11) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapPresentBitmask (");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.namespace = str;
        this.bitNumbers = new ArrayList();
        int i13 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i13 < 4) {
            byte b10 = bArr[i10 + i13];
            int i14 = i12;
            int i15 = 0;
            while (i15 < 8) {
                boolean z13 = z10;
                boolean z14 = z11;
                boolean z15 = z12;
                if ((b10 & 1) != 0) {
                    switch (i14 % 32) {
                        case 29:
                            z13 = true;
                            z15 = z12;
                            z14 = z11;
                            break;
                        case 30:
                            z14 = true;
                            z13 = z10;
                            z15 = z12;
                            break;
                        case 31:
                            z15 = true;
                            z13 = z10;
                            z14 = z11;
                            break;
                        default:
                            this.bitNumbers.add(RadiotapPresentBitNumber.getInstance(Integer.valueOf(i14), str));
                            z13 = z10;
                            z14 = z11;
                            z15 = z12;
                            break;
                    }
                }
                i14++;
                b10 = (byte) (b10 >>> 1);
                i15++;
                z10 = z13;
                z11 = z14;
                z12 = z15;
            }
            i13++;
            i12 = i14;
        }
        this.radiotapNamespaceNext = z10;
        this.vendorNamespaceNext = z11;
        this.anotherBitmapFollows = z12;
    }

    public static RadiotapPresentBitmask newInstance(byte[] bArr, int i10, int i11, int i12) {
        return newInstance(bArr, i10, i11, i12, "");
    }

    public static RadiotapPresentBitmask newInstance(byte[] bArr, int i10, int i11, int i12, String str) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapPresentBitmask(bArr, i10, i11, i12, str);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapPresentBitmask.class.isInstance(obj)) {
            return false;
        }
        RadiotapPresentBitmask radiotapPresentBitmask = (RadiotapPresentBitmask) obj;
        if (!this.bitNumbers.equals(radiotapPresentBitmask.bitNumbers) || !this.namespace.equals(radiotapPresentBitmask.namespace) || this.radiotapNamespaceNext != radiotapPresentBitmask.radiotapNamespaceNext || this.vendorNamespaceNext != radiotapPresentBitmask.vendorNamespaceNext || this.anotherBitmapFollows != radiotapPresentBitmask.anotherBitmapFollows) {
            z10 = false;
        }
        return z10;
    }

    public ArrayList<RadiotapPresentBitNumber> getBitNumbers() {
        return new ArrayList<>(this.bitNumbers);
    }

    public byte[] getBitmask() {
        return getRawData();
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public String getNamespace() {
        return this.namespace;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        Iterator<RadiotapPresentBitNumber> it = this.bitNumbers.iterator();
        while (it.hasNext()) {
            int intValue = it.next().value().intValue() % 32;
            int i10 = intValue / 8;
            bArr[i10] = (byte) ((1 << (intValue % 8)) | bArr[i10]);
        }
        boolean z10 = this.radiotapNamespaceNext;
        if (z10) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.vendorNamespaceNext) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (z10) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.anotherBitmapFollows ? 1231 : 1237;
        int hashCode = this.namespace.hashCode();
        int hashCode2 = this.bitNumbers.hashCode();
        int i12 = this.radiotapNamespaceNext ? 1231 : 1237;
        if (!this.vendorNamespaceNext) {
            i10 = 1237;
        }
        return ((((((((i11 + 31) * 31) + hashCode) * 31) + hashCode2) * 31) + i12) * 31) + i10;
    }

    public boolean isAnotherBitmapFollows() {
        return this.anotherBitmapFollows;
    }

    public boolean isRadiotapNamespaceNext() {
        return this.radiotapNamespaceNext;
    }

    public boolean isVendorNamespaceNext() {
        return this.vendorNamespaceNext;
    }

    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Present Bitmask (");
        sb2.append(ByteArrays.toHexString(getRawData(), " "));
        sb2.append("):");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Present Fields: ");
        sb2.append(property);
        for (RadiotapPresentBitNumber radiotapPresentBitNumber : this.bitNumbers) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(radiotapPresentBitNumber);
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append("  Radiotap NS Next: ");
        sb2.append(this.radiotapNamespaceNext);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Vendor NS Next: ");
        sb2.append(this.vendorNamespaceNext);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Another Bitmap Follows: ");
        sb2.append(this.anotherBitmapFollows);
        sb2.append(property);
        return sb2.toString();
    }
}
