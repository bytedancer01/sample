package org.pcap4j.packet;

import java.io.Serializable;
import java.nio.ByteOrder;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SequenceControl.class */
public final class Dot11SequenceControl implements Serializable {
    private static final long serialVersionUID = 8383319258993027L;
    private final byte fragmentNumber;
    private final short sequenceNumber;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SequenceControl$Builder.class */
    public static final class Builder {
        private byte fragmentNumber;
        private short sequenceNumber;

        public Builder() {
        }

        private Builder(Dot11SequenceControl dot11SequenceControl) {
            this.fragmentNumber = dot11SequenceControl.fragmentNumber;
            this.sequenceNumber = dot11SequenceControl.sequenceNumber;
        }

        public Dot11SequenceControl build() {
            return new Dot11SequenceControl(this);
        }

        public Builder fragmentNumber(byte b10) {
            this.fragmentNumber = b10;
            return this;
        }

        public Builder sequenceNumber(short s10) {
            this.sequenceNumber = s10;
            return this;
        }
    }

    private Dot11SequenceControl(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        if ((builder.fragmentNumber & 240) != 0) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("(builder.fragmentNumber & 0xF0) must be zero. builder.fragmentNumber: ");
            sb2.append((int) builder.fragmentNumber);
            throw new IllegalArgumentException(sb2.toString());
        }
        if ((builder.sequenceNumber & 61440) == 0) {
            this.fragmentNumber = builder.fragmentNumber;
            this.sequenceNumber = builder.sequenceNumber;
        } else {
            StringBuilder sb3 = new StringBuilder(200);
            sb3.append("(builder.sequenceNumber & 0xF000) must be zero. builder.sequenceNumber: ");
            sb3.append((int) builder.sequenceNumber);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private Dot11SequenceControl(byte[] bArr, int i10, int i11) {
        if (i11 >= 2) {
            this.fragmentNumber = (byte) (bArr[i10] & 15);
            this.sequenceNumber = (short) ((ByteArrays.getShort(bArr, i10, ByteOrder.LITTLE_ENDIAN) >> 4) & 4095);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a Dot11SequenceControl (");
        sb2.append(2);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static Dot11SequenceControl newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11SequenceControl(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11SequenceControl.class != obj.getClass()) {
            return false;
        }
        Dot11SequenceControl dot11SequenceControl = (Dot11SequenceControl) obj;
        return this.fragmentNumber == dot11SequenceControl.fragmentNumber && this.sequenceNumber == dot11SequenceControl.sequenceNumber;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getFragmentNumber() {
        return this.fragmentNumber;
    }

    public int getFragmentNumberAsInt() {
        return this.fragmentNumber;
    }

    public byte[] getRawData() {
        byte[] byteArray = ByteArrays.toByteArray((short) (this.sequenceNumber << 4), ByteOrder.LITTLE_ENDIAN);
        byteArray[0] = (byte) (byteArray[0] | this.fragmentNumber);
        return byteArray;
    }

    public short getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int getSequenceNumberAsInt() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        return ((this.fragmentNumber + 31) * 31) + this.sequenceNumber;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(250);
        sb2.append("[Fragment Number: ");
        sb2.append(getFragmentNumberAsInt());
        sb2.append(", Sequence Number: ");
        sb2.append(getSequenceNumberAsInt());
        sb2.append("]");
        return sb2.toString();
    }
}
