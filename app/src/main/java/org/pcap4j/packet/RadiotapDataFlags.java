package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataFlags.class */
public final class RadiotapDataFlags implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 1;
    private static final long serialVersionUID = 3144457914168529098L;
    private final boolean badFcs;
    private final boolean cfp;
    private final boolean fragmented;
    private final boolean includingFcs;
    private final boolean padding;
    private final boolean shortGuardInterval;
    private final boolean shortPreamble;
    private final boolean wepEncrypted;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataFlags$Builder.class */
    public static final class Builder {
        private boolean badFcs;
        private boolean cfp;
        private boolean fragmented;
        private boolean includingFcs;
        private boolean padding;
        private boolean shortGuardInterval;
        private boolean shortPreamble;
        private boolean wepEncrypted;

        public Builder() {
        }

        private Builder(RadiotapDataFlags radiotapDataFlags) {
            this.cfp = radiotapDataFlags.cfp;
        }

        public Builder badFcs(boolean z10) {
            this.badFcs = z10;
            return this;
        }

        public RadiotapDataFlags build() {
            return new RadiotapDataFlags(this);
        }

        public Builder cfp(boolean z10) {
            this.cfp = z10;
            return this;
        }

        public Builder fragmented(boolean z10) {
            this.fragmented = z10;
            return this;
        }

        public Builder includingFcs(boolean z10) {
            this.includingFcs = z10;
            return this;
        }

        public Builder padding(boolean z10) {
            this.padding = z10;
            return this;
        }

        public Builder shortGuardInterval(boolean z10) {
            this.shortGuardInterval = z10;
            return this;
        }

        public Builder shortPreamble(boolean z10) {
            this.shortPreamble = z10;
            return this;
        }

        public Builder wepEncrypted(boolean z10) {
            this.wepEncrypted = z10;
            return this;
        }
    }

    private RadiotapDataFlags(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.cfp = builder.cfp;
        this.shortPreamble = builder.shortPreamble;
        this.wepEncrypted = builder.wepEncrypted;
        this.fragmented = builder.fragmented;
        this.includingFcs = builder.includingFcs;
        this.padding = builder.padding;
        this.badFcs = builder.badFcs;
        this.shortGuardInterval = builder.shortGuardInterval;
    }

    private RadiotapDataFlags(byte[] bArr, int i10, int i11) {
        if (i11 >= 1) {
            byte b10 = bArr[i10];
            this.cfp = (b10 & 1) != 0;
            this.shortPreamble = (b10 & 2) != 0;
            this.wepEncrypted = (b10 & 4) != 0;
            this.fragmented = (b10 & 8) != 0;
            this.includingFcs = (b10 & 16) != 0;
            this.padding = (b10 & 32) != 0;
            this.badFcs = (b10 & 64) != 0;
            this.shortGuardInterval = (b10 & 128) != 0;
            return;
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("The data is too short to build a RadiotapFlags (");
        sb2.append(1);
        sb2.append(" bytes). data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    public static RadiotapDataFlags newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataFlags(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataFlags.class != obj.getClass()) {
            return false;
        }
        RadiotapDataFlags radiotapDataFlags = (RadiotapDataFlags) obj;
        return this.badFcs == radiotapDataFlags.badFcs && this.cfp == radiotapDataFlags.cfp && this.fragmented == radiotapDataFlags.fragmented && this.includingFcs == radiotapDataFlags.includingFcs && this.padding == radiotapDataFlags.padding && this.shortGuardInterval == radiotapDataFlags.shortGuardInterval && this.shortPreamble == radiotapDataFlags.shortPreamble && this.wepEncrypted == radiotapDataFlags.wepEncrypted;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[1];
        if (this.cfp) {
            bArr[0] = (byte) (1 | bArr[0]);
        }
        if (this.shortPreamble) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.wepEncrypted) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.fragmented) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.includingFcs) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.padding) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.badFcs) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.shortGuardInterval) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        return bArr;
    }

    public boolean hasPadding() {
        return this.padding;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.badFcs ? 1231 : 1237;
        int i12 = this.cfp ? 1231 : 1237;
        int i13 = this.fragmented ? 1231 : 1237;
        int i14 = this.includingFcs ? 1231 : 1237;
        int i15 = this.padding ? 1231 : 1237;
        int i16 = this.shortGuardInterval ? 1231 : 1237;
        int i17 = this.shortPreamble ? 1231 : 1237;
        if (!this.wepEncrypted) {
            i10 = 1237;
        }
        return ((((((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i10;
    }

    public boolean isBadFcs() {
        return this.badFcs;
    }

    public boolean isCfp() {
        return this.cfp;
    }

    public boolean isFragmented() {
        return this.fragmented;
    }

    public boolean isIncludingFcs() {
        return this.includingFcs;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isShortPreamble() {
        return this.shortPreamble;
    }

    public boolean isWepEncrypted() {
        return this.wepEncrypted;
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
        sb2.append("Flags: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  CFP: ");
        sb2.append(this.cfp);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Short Preamble: ");
        sb2.append(this.shortPreamble);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  WEP: ");
        sb2.append(this.wepEncrypted);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Fragmented: ");
        sb2.append(this.fragmented);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  FCS: ");
        sb2.append(this.includingFcs);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  PAD: ");
        sb2.append(this.padding);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bad FCS: ");
        sb2.append(this.badFcs);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Short Guard Interval: ");
        sb2.append(this.shortGuardInterval);
        sb2.append(property);
        return sb2.toString();
    }
}
