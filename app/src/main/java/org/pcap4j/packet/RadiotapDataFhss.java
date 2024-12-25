package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataFhss.class */
public final class RadiotapDataFhss implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = 132223820938643993L;
    private final byte hopPattern;
    private final byte hopSet;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataFhss$Builder.class */
    public static final class Builder {
        private byte hopPattern;
        private byte hopSet;

        public Builder() {
        }

        private Builder(RadiotapDataFhss radiotapDataFhss) {
            this.hopSet = radiotapDataFhss.hopSet;
            this.hopPattern = radiotapDataFhss.hopPattern;
        }

        public RadiotapDataFhss build() {
            return new RadiotapDataFhss(this);
        }

        public Builder hopPattern(byte b10) {
            this.hopPattern = b10;
            return this;
        }

        public Builder hopSet(byte b10) {
            this.hopSet = b10;
            return this;
        }
    }

    private RadiotapDataFhss(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.hopSet = builder.hopSet;
        this.hopPattern = builder.hopPattern;
    }

    private RadiotapDataFhss(byte[] bArr, int i10, int i11) {
        if (i11 >= 2) {
            this.hopSet = ByteArrays.getByte(bArr, i10);
            this.hopPattern = ByteArrays.getByte(bArr, i10 + 1);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapFhss (");
        sb2.append(2);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataFhss newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataFhss(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataFhss.class != obj.getClass()) {
            return false;
        }
        RadiotapDataFhss radiotapDataFhss = (RadiotapDataFhss) obj;
        return this.hopPattern == radiotapDataFhss.hopPattern && this.hopSet == radiotapDataFhss.hopSet;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getHopPattern() {
        return this.hopPattern;
    }

    public int getHopPatternAsInt() {
        return this.hopPattern & 255;
    }

    public byte getHopSet() {
        return this.hopSet;
    }

    public int getHopSetAsInt() {
        return this.hopSet & 255;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return new byte[]{this.hopSet, this.hopPattern};
    }

    public int hashCode() {
        return ((this.hopPattern + 31) * 31) + this.hopSet;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("FHSS: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Hop set: ");
        sb2.append(getHopSetAsInt());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Hop pattern: ");
        sb2.append(getHopPatternAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
