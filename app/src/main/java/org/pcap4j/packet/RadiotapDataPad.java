package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataPad.class */
public final class RadiotapDataPad implements RadiotapPacket.RadiotapData {
    private static final long serialVersionUID = 2443487622598511815L;
    private final byte[] pad;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataPad$Builder.class */
    public static final class Builder {
        private byte[] pad;

        public Builder() {
        }

        private Builder(RadiotapDataPad radiotapDataPad) {
            this.pad = radiotapDataPad.pad;
        }

        public RadiotapDataPad build() {
            return new RadiotapDataPad(this);
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }
    }

    private RadiotapDataPad(Builder builder) {
        if (builder != null && builder.pad != null) {
            this.pad = ByteArrays.clone(builder.pad);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.pad: " + builder.pad);
    }

    private RadiotapDataPad(byte[] bArr, int i10, int i11) {
        this.pad = ByteArrays.getSubArray(bArr, i10, i11);
    }

    public static RadiotapDataPad newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataPad(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (RadiotapDataPad.class.isInstance(obj)) {
            return Arrays.equals(this.pad, ((RadiotapDataPad) obj).pad);
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        return ByteArrays.clone(this.pad);
    }

    public int hashCode() {
        return Arrays.hashCode(this.pad);
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return this.pad.length;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Pad: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  data: ");
        sb2.append(ByteArrays.toHexString(this.pad, " "));
        sb2.append(property);
        return sb2.toString();
    }
}
