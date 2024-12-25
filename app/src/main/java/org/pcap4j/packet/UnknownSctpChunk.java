package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.SctpPacket;
import org.pcap4j.packet.namednumber.SctpChunkType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownSctpChunk.class */
public final class UnknownSctpChunk implements SctpPacket.SctpChunk {
    private static final long serialVersionUID = 2870805088630768174L;
    private final byte flags;
    private final short length;
    private final byte[] padding;
    private final SctpChunkType type;
    private final byte[] value;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownSctpChunk$Builder.class */
    public static final class Builder implements LengthBuilder<UnknownSctpChunk> {
        private boolean correctLengthAtBuild;
        private byte flags;
        private short length;
        private byte[] padding;
        private boolean paddingAtBuild;
        private SctpChunkType type;
        private byte[] value;

        public Builder() {
        }

        private Builder(UnknownSctpChunk unknownSctpChunk) {
            this.type = unknownSctpChunk.type;
            this.flags = unknownSctpChunk.flags;
            this.length = unknownSctpChunk.length;
            this.value = unknownSctpChunk.value;
            this.padding = unknownSctpChunk.padding;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public UnknownSctpChunk build() {
            return new UnknownSctpChunk(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UnknownSctpChunk> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder flags(byte b10) {
            this.flags = b10;
            return this;
        }

        public Builder length(short s10) {
            this.length = s10;
            return this;
        }

        public Builder padding(byte[] bArr) {
            this.padding = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z10) {
            this.paddingAtBuild = z10;
            return this;
        }

        public Builder type(SctpChunkType sctpChunkType) {
            this.type = sctpChunkType;
            return this;
        }

        public Builder value(byte[] bArr) {
            this.value = bArr;
            return this;
        }
    }

    private UnknownSctpChunk(Builder builder) {
        if (builder == null || builder.type == null) {
            throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type);
        }
        if (builder.value.length + 4 > 65535) {
            throw new IllegalArgumentException("(value.length + 4) must be less than or equal to 0xFFFF. builder.value: " + ByteArrays.toHexString(builder.value, " "));
        }
        this.type = builder.type;
        this.flags = builder.flags;
        if (builder.value != null) {
            this.value = ByteArrays.clone(builder.value);
        } else {
            this.value = new byte[0];
        }
        this.length = builder.correctLengthAtBuild ? (short) (this.value.length + 4) : builder.length;
        if (!builder.paddingAtBuild) {
            if (builder.padding != null) {
                this.padding = ByteArrays.clone(builder.padding);
                return;
            } else {
                this.padding = new byte[0];
                return;
            }
        }
        int length = 4 - ((this.value.length + 4) % 4);
        if (length == 0 || length == 4) {
            this.padding = new byte[0];
        } else {
            this.padding = new byte[length];
        }
    }

    private UnknownSctpChunk(byte[] bArr, int i10, int i11) {
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The raw data length must be more than 3. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.type = SctpChunkType.getInstance(Byte.valueOf(bArr[i10]));
        this.flags = bArr[i10 + 1];
        this.length = ByteArrays.getShort(bArr, i10 + 2);
        int lengthAsInt = getLengthAsInt();
        if (i11 < lengthAsInt) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The raw data is too short to build this option (");
            sb3.append(lengthAsInt);
            sb3.append("). data: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }
        if (lengthAsInt < 4) {
            StringBuilder sb4 = new StringBuilder(100);
            sb4.append("The value of the length field must be more than 3. data: ");
            sb4.append(ByteArrays.toHexString(bArr, " "));
            sb4.append(", offset: ");
            sb4.append(i10);
            sb4.append(", length: ");
            sb4.append(i11);
            throw new IllegalRawDataException(sb4.toString());
        }
        if (lengthAsInt <= 4) {
            this.value = new byte[0];
            this.padding = new byte[0];
            return;
        }
        this.value = ByteArrays.getSubArray(bArr, i10 + 4, lengthAsInt - 4);
        int i12 = 4 - (lengthAsInt % 4);
        if (i12 == 0 || i12 == 4 || i11 < lengthAsInt + i12) {
            this.padding = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[i12];
        this.padding = bArr2;
        System.arraycopy(bArr, lengthAsInt + i10, bArr2, 0, i12);
    }

    public static UnknownSctpChunk newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownSctpChunk(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnknownSctpChunk.class != obj.getClass()) {
            return false;
        }
        UnknownSctpChunk unknownSctpChunk = (UnknownSctpChunk) obj;
        return this.flags == unknownSctpChunk.flags && this.length == unknownSctpChunk.length && Arrays.equals(this.padding, unknownSctpChunk.padding) && this.type.equals(unknownSctpChunk.type) && Arrays.equals(this.value, unknownSctpChunk.value);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getFlags() {
        return this.flags;
    }

    public short getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 65535;
    }

    public byte[] getPadding() {
        return ByteArrays.clone(this.padding);
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.type.value().byteValue();
        bArr[1] = this.flags;
        short s10 = this.length;
        bArr[2] = (byte) (s10 >> 8);
        bArr[3] = (byte) s10;
        byte[] bArr2 = this.value;
        if (bArr2.length != 0) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
        byte[] bArr3 = this.padding;
        if (bArr3.length != 0) {
            System.arraycopy(bArr3, 0, bArr, this.value.length + 4, bArr3.length);
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public SctpChunkType getType() {
        return this.type;
    }

    public byte[] getValue() {
        return ByteArrays.clone(this.value);
    }

    public int hashCode() {
        return ((((((((this.flags + 31) * 31) + this.length) * 31) + Arrays.hashCode(this.padding)) * 31) + this.type.hashCode()) * 31) + Arrays.hashCode(this.value);
    }

    @Override // org.pcap4j.packet.SctpPacket.SctpChunk
    public int length() {
        return this.value.length + 4 + this.padding.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Type: ");
        sb2.append(this.type);
        sb2.append(", Flags: 0x");
        sb2.append(ByteArrays.toHexString(this.flags, " "));
        sb2.append(", Length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes");
        if (this.value.length != 0) {
            sb2.append(", Value: 0x");
            sb2.append(ByteArrays.toHexString(this.value, ""));
        }
        if (this.padding.length != 0) {
            sb2.append(", Padding: 0x");
            sb2.append(ByteArrays.toHexString(this.padding, ""));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
