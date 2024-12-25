package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownRadiotapData.class */
public final class UnknownRadiotapData implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 6405498375843386046L;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/UnknownRadiotapData$Builder.class */
    public static final class Builder {
        private byte[] rawData;

        public Builder() {
        }

        private Builder(UnknownRadiotapData unknownRadiotapData) {
            this.rawData = unknownRadiotapData.rawData;
        }

        public UnknownRadiotapData build() {
            return new UnknownRadiotapData(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }
    }

    private UnknownRadiotapData(Builder builder) {
        if (builder != null && builder.rawData != null) {
            this.rawData = ByteArrays.clone(builder.rawData);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
    }

    private UnknownRadiotapData(byte[] bArr, int i10, int i11) {
        this.rawData = ByteArrays.getSubArray(bArr, i10, i11);
    }

    public static UnknownRadiotapData newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new UnknownRadiotapData(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (UnknownRadiotapData.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((UnknownRadiotapData) obj).rawData);
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
        sb2.append("Unknown Data: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  data: ");
        sb2.append(ByteArrays.toHexString(this.rawData, ""));
        sb2.append(property);
        return sb2.toString();
    }
}
