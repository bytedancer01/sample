package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalRadiotapData.class */
public final class IllegalRadiotapData implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 6405498375843386046L;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalRadiotapData$Builder.class */
    public static final class Builder {
        private byte[] rawData;

        public Builder() {
        }

        private Builder(IllegalRadiotapData illegalRadiotapData) {
            this.rawData = illegalRadiotapData.rawData;
        }

        public IllegalRadiotapData build() {
            return new IllegalRadiotapData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }
    }

    private IllegalRadiotapData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }

    private IllegalRadiotapData(byte[] bArr, int i10, int i11) {
        this.rawData = ByteArrays.getSubArray(bArr, i10, i11);
    }

    public static IllegalRadiotapData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalRadiotapData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalRadiotapData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((IllegalRadiotapData) obj).rawData);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.clone(this.rawData);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return this.rawData.length;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Illegal Data: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  data: ");
        sb2.append(ByteArrays.toHexString(this.rawData, ""));
        sb2.append(property);
        return sb2.toString();
    }
}
