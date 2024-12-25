package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataDbmTxPower.class */
public final class RadiotapDataDbmTxPower implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = -7046612192280202993L;
    private final byte txPower;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataDbmTxPower$Builder.class */
    public static final class Builder {
        private byte txPower;

        public Builder() {
        }

        private Builder(RadiotapDataDbmTxPower radiotapDataDbmTxPower) {
            this.txPower = radiotapDataDbmTxPower.txPower;
        }

        public RadiotapDataDbmTxPower build() {
            return new RadiotapDataDbmTxPower(this);
        }

        public Builder txPower(byte b10) {
            this.txPower = b10;
            return this;
        }
    }

    private RadiotapDataDbmTxPower(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.txPower = builder.txPower;
    }

    private RadiotapDataDbmTxPower(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            this.txPower = ByteArrays.getByte(bArr, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapDbmTxPower (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataDbmTxPower newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataDbmTxPower(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataDbmTxPower.class.isInstance(obj)) {
            return false;
        }
        if (this.txPower != ((RadiotapDataDbmTxPower) obj).txPower) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.txPower);
    }

    public byte getTxPower() {
        return this.txPower;
    }

    public int getTxPowerAsInt() {
        return this.txPower;
    }

    public int hashCode() {
        return this.txPower;
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
        sb2.append("dBm TX power: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  TX power: ");
        sb2.append((int) this.txPower);
        sb2.append(" dBm");
        sb2.append(property);
        return sb2.toString();
    }
}
