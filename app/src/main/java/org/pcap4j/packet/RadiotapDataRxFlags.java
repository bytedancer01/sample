package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataRxFlags.class */
public final class RadiotapDataRxFlags implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 2;
    private static final long serialVersionUID = -1269108995049803687L;
    private final boolean badPlcpCrc;
    private final boolean eighthLsb;
    private final boolean eleventhLsb;
    private final boolean fifteenthLsb;
    private final boolean fifthLsb;
    private final boolean fourteenthLsb;
    private final boolean fourthLsb;
    private final boolean lsb;
    private final boolean ninthLsb;
    private final boolean seventhLsb;
    private final boolean sixteenthLsb;
    private final boolean sixthLsb;
    private final boolean tenthLsb;
    private final boolean thirdLsb;
    private final boolean thirteenthLsb;
    private final boolean twelvethLsb;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataRxFlags$Builder.class */
    public static final class Builder {
        private boolean badPlcpCrc;
        private boolean eighthLsb;
        private boolean eleventhLsb;
        private boolean fifteenthLsb;
        private boolean fifthLsb;
        private boolean fourteenthLsb;
        private boolean fourthLsb;
        private boolean lsb;
        private boolean ninthLsb;
        private boolean seventhLsb;
        private boolean sixteenthLsb;
        private boolean sixthLsb;
        private boolean tenthLsb;
        private boolean thirdLsb;
        private boolean thirteenthLsb;
        private boolean twelvethLsb;

        public Builder() {
        }

        private Builder(RadiotapDataRxFlags radiotapDataRxFlags) {
            this.lsb = radiotapDataRxFlags.lsb;
            this.badPlcpCrc = radiotapDataRxFlags.badPlcpCrc;
            this.thirdLsb = radiotapDataRxFlags.thirdLsb;
            this.fourthLsb = radiotapDataRxFlags.fourthLsb;
            this.fifthLsb = radiotapDataRxFlags.fifthLsb;
            this.sixthLsb = radiotapDataRxFlags.sixthLsb;
            this.seventhLsb = radiotapDataRxFlags.seventhLsb;
            this.eighthLsb = radiotapDataRxFlags.eighthLsb;
            this.ninthLsb = radiotapDataRxFlags.ninthLsb;
            this.tenthLsb = radiotapDataRxFlags.tenthLsb;
            this.eleventhLsb = radiotapDataRxFlags.eleventhLsb;
            this.twelvethLsb = radiotapDataRxFlags.twelvethLsb;
            this.thirteenthLsb = radiotapDataRxFlags.thirteenthLsb;
            this.fourteenthLsb = radiotapDataRxFlags.fourteenthLsb;
            this.fifteenthLsb = radiotapDataRxFlags.fifteenthLsb;
            this.sixteenthLsb = radiotapDataRxFlags.sixteenthLsb;
        }

        public Builder badPlcpCrc(boolean z10) {
            this.badPlcpCrc = z10;
            return this;
        }

        public RadiotapDataRxFlags build() {
            return new RadiotapDataRxFlags(this);
        }

        public Builder eighthLsb(boolean z10) {
            this.eighthLsb = z10;
            return this;
        }

        public Builder eleventhLsb(boolean z10) {
            this.eleventhLsb = z10;
            return this;
        }

        public Builder fifteenthLsb(boolean z10) {
            this.fifteenthLsb = z10;
            return this;
        }

        public Builder fifthLsb(boolean z10) {
            this.fifthLsb = z10;
            return this;
        }

        public Builder fourteenthLsb(boolean z10) {
            this.fourteenthLsb = z10;
            return this;
        }

        public Builder fourthLsb(boolean z10) {
            this.fourthLsb = z10;
            return this;
        }

        public Builder lsb(boolean z10) {
            this.lsb = z10;
            return this;
        }

        public Builder ninthLsb(boolean z10) {
            this.ninthLsb = z10;
            return this;
        }

        public Builder seventhLsb(boolean z10) {
            this.seventhLsb = z10;
            return this;
        }

        public Builder sixteenthLsb(boolean z10) {
            this.sixteenthLsb = z10;
            return this;
        }

        public Builder sixthLsb(boolean z10) {
            this.sixthLsb = z10;
            return this;
        }

        public Builder tenthLsb(boolean z10) {
            this.tenthLsb = z10;
            return this;
        }

        public Builder thirdLsb(boolean z10) {
            this.thirdLsb = z10;
            return this;
        }

        public Builder thirteenthLsb(boolean z10) {
            this.thirteenthLsb = z10;
            return this;
        }

        public Builder twelvethLsb(boolean z10) {
            this.twelvethLsb = z10;
            return this;
        }
    }

    private RadiotapDataRxFlags(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.lsb = builder.lsb;
        this.badPlcpCrc = builder.badPlcpCrc;
        this.thirdLsb = builder.thirdLsb;
        this.fourthLsb = builder.fourthLsb;
        this.fifthLsb = builder.fifthLsb;
        this.sixthLsb = builder.sixthLsb;
        this.seventhLsb = builder.seventhLsb;
        this.eighthLsb = builder.eighthLsb;
        this.ninthLsb = builder.ninthLsb;
        this.tenthLsb = builder.tenthLsb;
        this.eleventhLsb = builder.eleventhLsb;
        this.twelvethLsb = builder.twelvethLsb;
        this.thirteenthLsb = builder.thirteenthLsb;
        this.fourteenthLsb = builder.fourteenthLsb;
        this.fifteenthLsb = builder.fifteenthLsb;
        this.sixteenthLsb = builder.sixteenthLsb;
    }

    private RadiotapDataRxFlags(byte[] bArr, int i10, int i11) {
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapRxFlags (");
            sb2.append(2);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        this.lsb = (b10 & 1) != 0;
        this.badPlcpCrc = (b10 & 2) != 0;
        this.thirdLsb = (b10 & 4) != 0;
        this.fourthLsb = (b10 & 8) != 0;
        this.fifthLsb = (b10 & 16) != 0;
        this.sixthLsb = (b10 & 32) != 0;
        this.seventhLsb = (b10 & 64) != 0;
        this.eighthLsb = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 1];
        this.ninthLsb = (b11 & 1) != 0;
        this.tenthLsb = (b11 & 2) != 0;
        this.eleventhLsb = (b11 & 4) != 0;
        this.twelvethLsb = (b11 & 8) != 0;
        this.thirteenthLsb = (b11 & 16) != 0;
        this.fourteenthLsb = (b11 & 32) != 0;
        this.fifteenthLsb = (b11 & 64) != 0;
        this.sixteenthLsb = (b11 & 128) != 0;
    }

    public static RadiotapDataRxFlags newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataRxFlags(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataRxFlags.class != obj.getClass()) {
            return false;
        }
        RadiotapDataRxFlags radiotapDataRxFlags = (RadiotapDataRxFlags) obj;
        return this.sixthLsb == radiotapDataRxFlags.sixthLsb && this.eleventhLsb == radiotapDataRxFlags.eleventhLsb && this.ninthLsb == radiotapDataRxFlags.ninthLsb && this.fourthLsb == radiotapDataRxFlags.fourthLsb && this.twelvethLsb == radiotapDataRxFlags.twelvethLsb && this.thirteenthLsb == radiotapDataRxFlags.thirteenthLsb && this.fifteenthLsb == radiotapDataRxFlags.fifteenthLsb && this.lsb == radiotapDataRxFlags.lsb && this.seventhLsb == radiotapDataRxFlags.seventhLsb && this.tenthLsb == radiotapDataRxFlags.tenthLsb && this.sixteenthLsb == radiotapDataRxFlags.sixteenthLsb && this.badPlcpCrc == radiotapDataRxFlags.badPlcpCrc && this.fourteenthLsb == radiotapDataRxFlags.fourteenthLsb && this.thirdLsb == radiotapDataRxFlags.thirdLsb && this.fifthLsb == radiotapDataRxFlags.fifthLsb && this.eighthLsb == radiotapDataRxFlags.eighthLsb;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getEighthLsb() {
        return this.eighthLsb;
    }

    public boolean getEleventhLsb() {
        return this.eleventhLsb;
    }

    public boolean getFifteenthLsb() {
        return this.fifteenthLsb;
    }

    public boolean getFifthLsb() {
        return this.fifthLsb;
    }

    public boolean getFourteenthLsb() {
        return this.fourteenthLsb;
    }

    public boolean getFourthLsb() {
        return this.fourthLsb;
    }

    public boolean getLsb() {
        return this.lsb;
    }

    public boolean getNinthLsb() {
        return this.ninthLsb;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[2];
        if (this.lsb) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.badPlcpCrc) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.thirdLsb) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.fourthLsb) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.fifthLsb) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.sixthLsb) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.seventhLsb) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.eighthLsb) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        if (this.ninthLsb) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.tenthLsb) {
            bArr[1] = (byte) (2 | bArr[1]);
        }
        if (this.eleventhLsb) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.twelvethLsb) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.thirteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.fourteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.fifteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.sixteenthLsb) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        return bArr;
    }

    public boolean getSeventhLsb() {
        return this.seventhLsb;
    }

    public boolean getSixteenthLsb() {
        return this.sixteenthLsb;
    }

    public boolean getSixthLsb() {
        return this.sixthLsb;
    }

    public boolean getTenthLsb() {
        return this.tenthLsb;
    }

    public boolean getThirdLsb() {
        return this.thirdLsb;
    }

    public boolean getThirteenthLsb() {
        return this.thirteenthLsb;
    }

    public boolean getTwelvethLsb() {
        return this.twelvethLsb;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.sixthLsb ? 1231 : 1237;
        int i12 = this.eleventhLsb ? 1231 : 1237;
        int i13 = this.ninthLsb ? 1231 : 1237;
        int i14 = this.fourthLsb ? 1231 : 1237;
        int i15 = this.twelvethLsb ? 1231 : 1237;
        int i16 = this.thirteenthLsb ? 1231 : 1237;
        int i17 = this.fifteenthLsb ? 1231 : 1237;
        int i18 = this.lsb ? 1231 : 1237;
        int i19 = this.seventhLsb ? 1231 : 1237;
        int i20 = this.tenthLsb ? 1231 : 1237;
        int i21 = this.sixteenthLsb ? 1231 : 1237;
        int i22 = this.badPlcpCrc ? 1231 : 1237;
        int i23 = this.fourteenthLsb ? 1231 : 1237;
        int i24 = this.thirdLsb ? 1231 : 1237;
        int i25 = this.fifthLsb ? 1231 : 1237;
        if (!this.eighthLsb) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i10;
    }

    public boolean isBadPlcpCrc() {
        return this.badPlcpCrc;
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
        sb2.append("RX flags: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  LSB: ");
        sb2.append(this.lsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bad PLCP CRC: ");
        sb2.append(this.badPlcpCrc);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  3rd LSB: ");
        sb2.append(this.thirdLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  4th LSB: ");
        sb2.append(this.fourthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  5th LSB: ");
        sb2.append(this.fifthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  6th LSB: ");
        sb2.append(this.sixthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  7th LSB: ");
        sb2.append(this.seventhLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  8th LSB: ");
        sb2.append(this.eighthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  9th LSB: ");
        sb2.append(this.ninthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  10th LSB: ");
        sb2.append(this.tenthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  11th LSB: ");
        sb2.append(this.eleventhLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  12th LSB: ");
        sb2.append(this.twelvethLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  13th LSB: ");
        sb2.append(this.thirteenthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  14th LSB: ");
        sb2.append(this.fourteenthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  15th LSB: ");
        sb2.append(this.fifteenthLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  16th LSB: ");
        sb2.append(this.sixteenthLsb);
        sb2.append(property);
        return sb2.toString();
    }
}
