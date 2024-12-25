package org.pcap4j.packet;

import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataLockQuality.class */
public final class RadiotapDataLockQuality implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = -7889325752343077807L;
    private final short lockQuality;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataLockQuality$Builder.class */
    public static final class Builder {
        private short lockQuality;

        public Builder() {
        }

        private Builder(RadiotapDataLockQuality radiotapDataLockQuality) {
            this.lockQuality = radiotapDataLockQuality.lockQuality;
        }

        public RadiotapDataLockQuality build() {
            return new RadiotapDataLockQuality(this);
        }

        public Builder lockQuality(short s10) {
            this.lockQuality = s10;
            return this;
        }
    }

    private RadiotapDataLockQuality(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.lockQuality = builder.lockQuality;
    }

    private RadiotapDataLockQuality(byte[] bArr, int i10, int i11) {
        if (i11 >= 2) {
            this.lockQuality = ByteArrays.getShort(bArr, i10, ByteOrder.LITTLE_ENDIAN);
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapLockQuality (");
        sb2.append(2);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataLockQuality newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataLockQuality(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!RadiotapDataLockQuality.class.isInstance(obj)) {
            return false;
        }
        if (this.lockQuality != ((RadiotapDataLockQuality) obj).lockQuality) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public short getLockQuality() {
        return this.lockQuality;
    }

    public int getLockQualityAsInt() {
        return this.lockQuality & 65535;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.toByteArray(this.lockQuality, ByteOrder.LITTLE_ENDIAN);
    }

    public int hashCode() {
        return this.lockQuality;
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
        sb2.append("Lock quality: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Lock quality: ");
        sb2.append(getLockQualityAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
