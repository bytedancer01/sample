package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntenna.class */
public final class RadiotapDataAntenna implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -4959721095331063491L;
    private final byte antenna;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntenna$Builder.class */
    public static final class Builder {
        private byte antenna;

        public Builder() {
        }

        private Builder(RadiotapDataAntenna radiotapDataAntenna) {
            this.antenna = radiotapDataAntenna.antenna;
        }

        public Builder antenna(byte b10) {
            this.antenna = b10;
            return this;
        }

        public RadiotapDataAntenna build() {
            return new RadiotapDataAntenna(this);
        }
    }

    private RadiotapDataAntenna(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.antenna = builder.antenna;
    }

    private RadiotapDataAntenna(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.antenna = ByteArrays.getByte(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapRate (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataAntenna newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataAntenna(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataAntenna.class.isInstance(obj)) {
            return false;
        }
        if (this.antenna != ((RadiotapDataAntenna) obj).antenna) {
            z10 = false;
        }
        return z10;
    }

    public byte getAntenna() {
        return this.antenna;
    }

    public int getAntennaAsInt() {
        return this.antenna & 255;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antenna);
    }

    public int hashCode() {
        return this.antenna;
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
        sb2.append("Antenna: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Antenna: ");
        sb2.append(getAntennaAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
