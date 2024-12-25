package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataRate.class */
public final class RadiotapDataRate implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3381222627210403160L;
    private final byte rate;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataRate$Builder.class */
    public static final class Builder {
        private byte rate;

        public Builder() {
        }

        private Builder(RadiotapDataRate radiotapDataRate) {
            this.rate = radiotapDataRate.rate;
        }

        public RadiotapDataRate build() {
            return new RadiotapDataRate(this);
        }

        public Builder rate(byte b10) {
            this.rate = b10;
            return this;
        }
    }

    private RadiotapDataRate(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.rate = builder.rate;
    }

    private RadiotapDataRate(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.rate = ByteArrays.getByte(bArr, i10);
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

    public static RadiotapDataRate newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataRate(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataRate.class.isInstance(obj)) {
            return false;
        }
        if (this.rate != ((RadiotapDataRate) obj).rate) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getRate() {
        return this.rate;
    }

    public int getRateAsInt() {
        return this.rate & 255;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.rate);
    }

    public int hashCode() {
        return this.rate;
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
        sb2.append("Rate: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Rate: ");
        sb2.append(getRateAsInt() * 500);
        sb2.append(" Kbps");
        sb2.append(property);
        return sb2.toString();
    }
}
