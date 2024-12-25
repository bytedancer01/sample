package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11VendorSpecificElement.class */
public final class Dot11VendorSpecificElement extends Dot11InformationElement {
    private static final long serialVersionUID = 2095272309443428672L;
    private final byte[] information;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11VendorSpecificElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private byte[] information;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.VENDOR_SPECIFIC.value()));
        }

        private Builder(Dot11VendorSpecificElement dot11VendorSpecificElement) {
            super(dot11VendorSpecificElement);
            this.information = dot11VendorSpecificElement.information;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.information == null) {
                throw new NullPointerException("information is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.information.length);
            }
            return new Dot11VendorSpecificElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder information(byte[] bArr) {
            this.information = bArr;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }
    }

    private Dot11VendorSpecificElement(Builder builder) {
        super(builder);
        if (builder.information.length <= 255) {
            this.information = ByteArrays.clone(builder.information);
            return;
        }
        throw new IllegalArgumentException("Too long information: " + builder.information);
    }

    private Dot11VendorSpecificElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.VENDOR_SPECIFIC);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt == 0) {
            this.information = new byte[0];
        } else {
            this.information = ByteArrays.getSubArray(bArr, i10 + 2, lengthAsInt);
        }
    }

    public static Dot11VendorSpecificElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11VendorSpecificElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && Arrays.equals(this.information, ((Dot11VendorSpecificElement) obj).information);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getInformation() {
        return ByteArrays.clone(this.information);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte[] bArr2 = this.information;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.information);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.information.length + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Vendor Specific:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Element ID: ");
        sb2.append(getElementId());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Information: 0x");
        sb2.append(ByteArrays.toHexString(this.information, ""));
        sb2.append(property);
        return sb2.toString();
    }
}
