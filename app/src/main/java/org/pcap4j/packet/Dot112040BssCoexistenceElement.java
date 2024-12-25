package org.pcap4j.packet;

import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot112040BssCoexistenceElement.class */
public final class Dot112040BssCoexistenceElement extends Dot11InformationElement {
    private static final long serialVersionUID = 8883468584264617141L;
    private final boolean bit5;
    private final boolean bit6;
    private final boolean bit7;
    private final boolean fortyMhzIntolerant;
    private final boolean informationRequested;
    private final boolean obssScanningExemptionGranted;
    private final boolean obssScanningExemptionRequested;
    private final boolean twentyMhzBssWidthRequested;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot112040BssCoexistenceElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private boolean bit5;
        private boolean bit6;
        private boolean bit7;
        private boolean fortyMhzIntolerant;
        private boolean informationRequested;
        private boolean obssScanningExemptionGranted;
        private boolean obssScanningExemptionRequested;
        private boolean twentyMhzBssWidthRequested;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE.value()));
        }

        private Builder(Dot112040BssCoexistenceElement dot112040BssCoexistenceElement) {
            super(dot112040BssCoexistenceElement);
            this.informationRequested = dot112040BssCoexistenceElement.informationRequested;
            this.fortyMhzIntolerant = dot112040BssCoexistenceElement.fortyMhzIntolerant;
            this.twentyMhzBssWidthRequested = dot112040BssCoexistenceElement.twentyMhzBssWidthRequested;
            this.obssScanningExemptionRequested = dot112040BssCoexistenceElement.obssScanningExemptionRequested;
            this.obssScanningExemptionGranted = dot112040BssCoexistenceElement.obssScanningExemptionGranted;
            this.bit5 = dot112040BssCoexistenceElement.bit5;
            this.bit6 = dot112040BssCoexistenceElement.bit6;
            this.bit7 = dot112040BssCoexistenceElement.bit7;
        }

        public Builder bit5(boolean z10) {
            this.bit5 = z10;
            return this;
        }

        public Builder bit6(boolean z10) {
            this.bit6 = z10;
            return this;
        }

        public Builder bit7(boolean z10) {
            this.bit7 = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 1);
            }
            return new Dot112040BssCoexistenceElement(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder fortyMhzIntolerant(boolean z10) {
            this.fortyMhzIntolerant = z10;
            return this;
        }

        public Builder informationRequested(boolean z10) {
            this.informationRequested = z10;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder obssScanningExemptionGranted(boolean z10) {
            this.obssScanningExemptionGranted = z10;
            return this;
        }

        public Builder obssScanningExemptionRequested(boolean z10) {
            this.obssScanningExemptionRequested = z10;
            return this;
        }

        public Builder twentyMhzBssWidthRequested(boolean z10) {
            this.twentyMhzBssWidthRequested = z10;
            return this;
        }
    }

    private Dot112040BssCoexistenceElement(Builder builder) {
        super(builder);
        this.informationRequested = builder.informationRequested;
        this.fortyMhzIntolerant = builder.fortyMhzIntolerant;
        this.twentyMhzBssWidthRequested = builder.twentyMhzBssWidthRequested;
        this.obssScanningExemptionRequested = builder.obssScanningExemptionRequested;
        this.obssScanningExemptionGranted = builder.obssScanningExemptionGranted;
        this.bit5 = builder.bit5;
        this.bit6 = builder.bit6;
        this.bit7 = builder.bit7;
    }

    private Dot112040BssCoexistenceElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE);
        if (getLengthAsInt() != 1) {
            throw new IllegalRawDataException("The length must be 1 but is actually: " + getLengthAsInt());
        }
        byte b10 = bArr[i10 + 2];
        this.informationRequested = (b10 & 1) != 0;
        this.fortyMhzIntolerant = (b10 & 2) != 0;
        this.twentyMhzBssWidthRequested = (b10 & 4) != 0;
        this.obssScanningExemptionRequested = (b10 & 8) != 0;
        this.obssScanningExemptionGranted = (b10 & 16) != 0;
        this.bit5 = (b10 & 32) != 0;
        this.bit6 = (b10 & 64) != 0;
        this.bit7 = (b10 & 128) != 0;
    }

    public static Dot112040BssCoexistenceElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot112040BssCoexistenceElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = (Dot112040BssCoexistenceElement) obj;
        return this.fortyMhzIntolerant == dot112040BssCoexistenceElement.fortyMhzIntolerant && this.informationRequested == dot112040BssCoexistenceElement.informationRequested && this.obssScanningExemptionGranted == dot112040BssCoexistenceElement.obssScanningExemptionGranted && this.obssScanningExemptionRequested == dot112040BssCoexistenceElement.obssScanningExemptionRequested && this.twentyMhzBssWidthRequested == dot112040BssCoexistenceElement.twentyMhzBssWidthRequested && this.bit5 == dot112040BssCoexistenceElement.bit5 && this.bit6 == dot112040BssCoexistenceElement.bit6 && this.bit7 == dot112040BssCoexistenceElement.bit7;
    }

    public boolean getBit5() {
        return this.bit5;
    }

    public boolean getBit6() {
        return this.bit6;
    }

    public boolean getBit7() {
        return this.bit7;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[3];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        if (this.informationRequested) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.fortyMhzIntolerant) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.twentyMhzBssWidthRequested) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.obssScanningExemptionRequested) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.obssScanningExemptionGranted) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.bit5) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.bit6) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.bit7) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        int hashCode = super.hashCode();
        int i10 = 1231;
        int i11 = this.bit5 ? 1231 : 1237;
        int i12 = this.bit6 ? 1231 : 1237;
        int i13 = this.bit7 ? 1231 : 1237;
        int i14 = this.fortyMhzIntolerant ? 1231 : 1237;
        int i15 = this.informationRequested ? 1231 : 1237;
        int i16 = this.obssScanningExemptionGranted ? 1231 : 1237;
        int i17 = this.obssScanningExemptionRequested ? 1231 : 1237;
        if (!this.twentyMhzBssWidthRequested) {
            i10 = 1237;
        }
        return (((((((((((((((hashCode * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i10;
    }

    public boolean is20MhzBssWidthRequested() {
        return this.twentyMhzBssWidthRequested;
    }

    public boolean is40MhzIntolerant() {
        return this.fortyMhzIntolerant;
    }

    public boolean isInformationRequested() {
        return this.informationRequested;
    }

    public boolean isObssScanningExemptionGranted() {
        return this.obssScanningExemptionGranted;
    }

    public boolean isObssScanningExemptionRequested() {
        return this.obssScanningExemptionRequested;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("20/40 BSS Coexistence:");
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
        sb2.append("  Information Requested: ");
        sb2.append(this.informationRequested);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  40 MHz Intolerant: ");
        sb2.append(this.fortyMhzIntolerant);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  20 MHz BSS Width Requested: ");
        sb2.append(this.twentyMhzBssWidthRequested);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  OBSS Scanning Exemption Requested: ");
        sb2.append(this.obssScanningExemptionRequested);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  OBSS Scanning Exemption Granted: ");
        sb2.append(this.obssScanningExemptionGranted);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bit 5: ");
        sb2.append(this.bit5);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bit 6: ");
        sb2.append(this.bit6);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bit 7: ");
        sb2.append(this.bit7);
        sb2.append(property);
        return sb2.toString();
    }
}
