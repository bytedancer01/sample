package org.pcap4j.packet;

import java.math.BigInteger;
import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataTsft.class */
public final class RadiotapDataTsft implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 8;
    private static final long serialVersionUID = -6492811566937170319L;
    private final BigInteger macTimestamp;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataTsft$Builder.class */
    public static final class Builder {
        private BigInteger macTimestamp;

        public Builder() {
        }

        private Builder(RadiotapDataTsft radiotapDataTsft) {
            this.macTimestamp = radiotapDataTsft.macTimestamp;
        }

        public RadiotapDataTsft build() {
            return new RadiotapDataTsft(this);
        }

        public Builder macTimestamp(BigInteger bigInteger) {
            this.macTimestamp = bigInteger;
            return this;
        }
    }

    private RadiotapDataTsft(Builder builder) {
        if (builder == null || builder.macTimestamp == null) {
            throw new NullPointerException("builder: " + builder + " builder.macTimestamp: " + builder.macTimestamp);
        }
        if (builder.macTimestamp.signum() == -1) {
            throw new IllegalArgumentException("macTimestamp must be positive.");
        }
        if (builder.macTimestamp.bitLength() > 64) {
            throw new IllegalArgumentException("macTimestamp must be less than 18446744073709551616.");
        }
        this.macTimestamp = builder.macTimestamp;
    }

    private RadiotapDataTsft(byte[] bArr, int i10, int i11) {
        if (i11 >= 8) {
            this.macTimestamp = new BigInteger(new byte[]{0, bArr[i10 + 7], bArr[i10 + 6], bArr[i10 + 5], bArr[i10 + 4], bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10 + 0]});
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapTsft (");
        sb2.append(8);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataTsft newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataTsft(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (RadiotapDataTsft.class.isInstance(obj)) {
            return this.macTimestamp.equals(((RadiotapDataTsft) obj).macTimestamp);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public BigInteger getMacTimestamp() {
        return this.macTimestamp;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.macTimestamp.longValue(), ByteOrder.LITTLE_ENDIAN);
    }

    public int hashCode() {
        return this.macTimestamp.hashCode();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 8;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("TSFT: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MAC timestamp: ");
        sb2.append(this.macTimestamp);
        sb2.append(" microseconds");
        sb2.append(property);
        return sb2.toString();
    }
}
