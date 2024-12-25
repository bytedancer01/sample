package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntennaSignal.class */
public final class RadiotapDataAntennaSignal implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -358697672561390506L;
    private final byte antennaSignal;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAntennaSignal$Builder.class */
    public static final class Builder {
        private byte antennaSignal;

        public Builder() {
        }

        private Builder(RadiotapDataAntennaSignal radiotapDataAntennaSignal) {
            this.antennaSignal = radiotapDataAntennaSignal.antennaSignal;
        }

        public Builder antennaSignal(byte b10) {
            this.antennaSignal = b10;
            return this;
        }

        public RadiotapDataAntennaSignal build() {
            return new RadiotapDataAntennaSignal(this);
        }
    }

    private RadiotapDataAntennaSignal(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.antennaSignal = builder.antennaSignal;
    }

    private RadiotapDataAntennaSignal(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.antennaSignal = ByteArrays.getByte(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapAntennaSignal (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataAntennaSignal newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataAntennaSignal(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataAntennaSignal.class.isInstance(obj)) {
            return false;
        }
        if (this.antennaSignal != ((RadiotapDataAntennaSignal) obj).antennaSignal) {
            z10 = false;
        }
        return z10;
    }

    public byte getAntennaSignal() {
        return this.antennaSignal;
    }

    public int getAntennaSignalAsInt() {
        return this.antennaSignal;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.antennaSignal);
    }

    public int hashCode() {
        return this.antennaSignal;
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
        sb2.append("Antenna signal: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Antenna signal: ");
        sb2.append((int) this.antennaSignal);
        sb2.append(" dBm");
        sb2.append(property);
        return sb2.toString();
    }
}
