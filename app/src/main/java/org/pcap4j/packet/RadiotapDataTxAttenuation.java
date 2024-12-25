package org.pcap4j.packet;

import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataTxAttenuation.class */
public final class RadiotapDataTxAttenuation implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = 8847948493831117966L;
    private final short txAttenuation;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataTxAttenuation$Builder.class */
    public static final class Builder {
        private short txAttenuation;

        public Builder() {
        }

        private Builder(RadiotapDataTxAttenuation radiotapDataTxAttenuation) {
            this.txAttenuation = radiotapDataTxAttenuation.txAttenuation;
        }

        public RadiotapDataTxAttenuation build() {
            return new RadiotapDataTxAttenuation(this);
        }

        public Builder txAttenuation(short s10) {
            this.txAttenuation = s10;
            return this;
        }
    }

    private RadiotapDataTxAttenuation(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.txAttenuation = builder.txAttenuation;
    }

    private RadiotapDataTxAttenuation(byte[] bArr, int i10, int i11) {
        if (i11 >= 2) {
            this.txAttenuation = ByteArrays.getShort(bArr, i10, ByteOrder.LITTLE_ENDIAN);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapTxAttenuation (");
        sb2.append(2);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataTxAttenuation newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataTxAttenuation(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataTxAttenuation.class.isInstance(obj)) {
            return false;
        }
        if (this.txAttenuation != ((RadiotapDataTxAttenuation) obj).txAttenuation) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.txAttenuation, ByteOrder.LITTLE_ENDIAN);
    }

    public short getTxAttenuation() {
        return this.txAttenuation;
    }

    public int getTxAttenuationAsInt() {
        return this.txAttenuation & 65535;
    }

    public int hashCode() {
        return this.txAttenuation;
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
        sb2.append("TX attenuation: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  TX attenuation: ");
        sb2.append(getTxAttenuationAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
