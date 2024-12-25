package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataDbAntennaNoise.class */
public final class RadiotapDataDbAntennaNoise implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3285930614145918404L;
    private final byte antennaNoise;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataDbAntennaNoise$Builder.class */
    public static final class Builder {
        private byte antennaNoise;

        public Builder() {
        }

        private Builder(RadiotapDataDbAntennaNoise radiotapDataDbAntennaNoise) {
            this.antennaNoise = radiotapDataDbAntennaNoise.antennaNoise;
        }

        public Builder antennaNoise(byte b10) {
            this.antennaNoise = b10;
            return this;
        }

        public RadiotapDataDbAntennaNoise build() {
            return new RadiotapDataDbAntennaNoise(this);
        }
    }

    private RadiotapDataDbAntennaNoise(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.antennaNoise = builder.antennaNoise;
    }

    private RadiotapDataDbAntennaNoise(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.antennaNoise = ByteArrays.getByte(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapDbAntennaNoise (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataDbAntennaNoise newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataDbAntennaNoise(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataDbAntennaNoise.class.isInstance(obj)) {
            return false;
        }
        if (this.antennaNoise != ((RadiotapDataDbAntennaNoise) obj).antennaNoise) {
            z10 = false;
        }
        return z10;
    }

    public byte getAntennaNoise() {
        return this.antennaNoise;
    }

    public int getAntennaNoiseAsInt() {
        return this.antennaNoise & 255;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antennaNoise);
    }

    public int hashCode() {
        return this.antennaNoise;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 1;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("dB antenna noise: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Antenna noise: ");
        sb2.append(getAntennaNoiseAsInt());
        sb2.append(" dB");
        sb2.append(property);
        return sb2.toString();
    }
}
