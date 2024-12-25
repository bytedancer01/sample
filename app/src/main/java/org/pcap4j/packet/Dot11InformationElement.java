package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11InformationElement.class */
public abstract class Dot11InformationElement implements Serializable {
    private static final long serialVersionUID = 3620485938137514351L;
    private final Dot11InformationElementId elementId;
    private final byte length;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11InformationElement$Builder.class */
    public static abstract class Builder implements LengthBuilder<Dot11InformationElement> {
        private boolean correctLengthAtBuild;
        private Dot11InformationElementId elementId;
        private byte length;

        public Builder() {
        }

        public Builder(Dot11InformationElement dot11InformationElement) {
            this.elementId = dot11InformationElement.elementId;
            this.length = dot11InformationElement.length;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.LengthBuilder
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder elementId(Dot11InformationElementId dot11InformationElementId) {
            this.elementId = dot11InformationElementId;
            return this;
        }

        public boolean getCorrectLengthAtBuild() {
            return this.correctLengthAtBuild;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }
    }

    public Dot11InformationElement(Builder builder) {
        if (builder != null && builder.elementId != null) {
            this.elementId = builder.elementId;
            this.length = builder.length;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.elementId: " + builder.elementId);
    }

    public Dot11InformationElement(byte[] bArr, int i10, int i11, Dot11InformationElementId dot11InformationElementId) {
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The raw data length must be more than 1. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (bArr[i10] != dot11InformationElementId.value().byteValue()) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The element ID must be ");
            sb3.append(dot11InformationElementId.valueAsString());
            sb3.append(" but is actually ");
            sb3.append((int) bArr[i10]);
            sb3.append(". rawData: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }
        this.elementId = dot11InformationElementId;
        this.length = bArr[i10 + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt <= i11 - 2) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(100);
        sb4.append("rawData is too short. length field: ");
        sb4.append(lengthAsInt);
        sb4.append(", rawData: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dot11InformationElement dot11InformationElement = (Dot11InformationElement) obj;
        return this.elementId.equals(dot11InformationElement.elementId) && this.length == dot11InformationElement.length;
    }

    public Dot11InformationElementId getElementId() {
        return this.elementId;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public abstract byte[] getRawData();

    public int hashCode() {
        return ((this.elementId.hashCode() + 31) * 31) + this.length;
    }

    public abstract int length();
}
