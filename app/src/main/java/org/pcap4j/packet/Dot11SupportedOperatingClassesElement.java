package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SupportedOperatingClassesElement.class */
public final class Dot11SupportedOperatingClassesElement extends Dot11InformationElement {
    private static final long serialVersionUID = 2089786652681023988L;
    private final byte currentOperatingClass;
    private final byte[] operatingClasses;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SupportedOperatingClassesElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private byte currentOperatingClass;
        private byte[] operatingClasses;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES.value()));
        }

        private Builder(Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement) {
            super(dot11SupportedOperatingClassesElement);
            this.currentOperatingClass = dot11SupportedOperatingClassesElement.currentOperatingClass;
            this.operatingClasses = dot11SupportedOperatingClassesElement.operatingClasses;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.operatingClasses != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) (this.operatingClasses.length + 1));
                }
                return new Dot11SupportedOperatingClassesElement(this);
            }
            throw new NullPointerException("operatingClasses: " + this.operatingClasses);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder currentOperatingClass(byte b10) {
            this.currentOperatingClass = b10;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder operatingClasses(byte[] bArr) {
            this.operatingClasses = bArr;
            return this;
        }
    }

    private Dot11SupportedOperatingClassesElement(Builder builder) {
        super(builder);
        if (builder.operatingClasses.length <= 254) {
            this.currentOperatingClass = builder.currentOperatingClass;
            this.operatingClasses = ByteArrays.clone(builder.operatingClasses);
        } else {
            throw new IllegalArgumentException("Too long operatingClasses: " + ByteArrays.toHexString(builder.operatingClasses, " "));
        }
    }

    private Dot11SupportedOperatingClassesElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 1) {
            throw new IllegalRawDataException("The length must be more than 0 but is actually: " + lengthAsInt);
        }
        this.currentOperatingClass = bArr[i10 + 2];
        if (lengthAsInt == 1) {
            this.operatingClasses = new byte[0];
        } else {
            this.operatingClasses = ByteArrays.getSubArray(bArr, i10 + 3, lengthAsInt - 1);
        }
    }

    public static Dot11SupportedOperatingClassesElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11SupportedOperatingClassesElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = (Dot11SupportedOperatingClassesElement) obj;
        return this.currentOperatingClass == dot11SupportedOperatingClassesElement.currentOperatingClass && Arrays.equals(this.operatingClasses, dot11SupportedOperatingClassesElement.operatingClasses);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getCurrentOperatingClass() {
        return this.currentOperatingClass;
    }

    public int getCurrentOperatingClassAsInt() {
        return this.currentOperatingClass & 255;
    }

    public byte[] getOperatingClasses() {
        return ByteArrays.clone(this.operatingClasses);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        bArr[2] = this.currentOperatingClass;
        byte[] bArr2 = this.operatingClasses;
        System.arraycopy(bArr2, 0, bArr, 3, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (((super.hashCode() * 31) + this.currentOperatingClass) * 31) + Arrays.hashCode(this.operatingClasses);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.operatingClasses.length + 3;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Supported Operating Classes:");
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
        sb2.append("  Current Operating Class: ");
        sb2.append(getCurrentOperatingClassAsInt());
        sb2.append(property);
        for (byte b10 : this.operatingClasses) {
            sb2.append(str);
            sb2.append("  Operating Class: ");
            sb2.append(b10 & 255);
            sb2.append(property);
        }
        return sb2.toString();
    }
}
