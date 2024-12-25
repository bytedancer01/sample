package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntennaNoise.class */
public final class RadiotapDataAntennaNoise implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -7455538178480770078L;
    private final byte antennaNoise;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntennaNoise$Builder.class */
    public static final class Builder {
        private byte antennaNoise;

        public Builder() {
        }

        private Builder(RadiotapDataAntennaNoise radiotapDataAntennaNoise) {
            this.antennaNoise = radiotapDataAntennaNoise.antennaNoise;
        }

        public Builder antennaNoise(byte b10) {
            this.antennaNoise = b10;
            return this;
        }

        public RadiotapDataAntennaNoise build() {
            return new RadiotapDataAntennaNoise(this);
        }
    }

    private RadiotapDataAntennaNoise(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.antennaNoise = builder.antennaNoise;
    }

    private RadiotapDataAntennaNoise(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.antennaNoise = ByteArrays.getByte(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapAntennaNoise (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataAntennaNoise newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataAntennaNoise(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataAntennaNoise.class.isInstance(obj)) {
            return false;
        }
        if (this.antennaNoise != ((RadiotapDataAntennaNoise) obj).antennaNoise) {
            z10 = false;
        }
        return z10;
    }

    public byte getAntennaNoise() {
        return this.antennaNoise;
    }

    public int getAntennaNoiseAsInt() {
        return this.antennaNoise;
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
        sb2.append("Antenna noise: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Antenna noise: ");
        sb2.append((int) this.antennaNoise);
        sb2.append(" dBm");
        sb2.append(property);
        return sb2.toString();
    }
}
