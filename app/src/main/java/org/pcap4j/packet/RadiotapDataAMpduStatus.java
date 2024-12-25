package org.pcap4j.packet;

import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAMpduStatus.class */
public final class RadiotapDataAMpduStatus implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 8;
    private static final long serialVersionUID = 5595179236319330489L;
    private final boolean delimiterCrcError;
    private final byte delimiterCrcValue;
    private final boolean delimiterCrcValueKnown;
    private final boolean driverReportsZeroLengthSubframes;
    private final boolean eighthMsbOfFlags;
    private final boolean fifthMsbOfFlags;
    private final boolean fourthMsbOfFlags;
    private final boolean lastSubframe;
    private final boolean lastSubframeKnown;
    private final boolean msbOfFlags;
    private final boolean ninthMsbOfFlags;
    private final int referenceNumber;
    private final byte reserved;
    private final boolean secondMsbOfFlags;
    private final boolean seventhMsbOfFlags;
    private final boolean sixthMsbOfFlags;
    private final boolean tenthMsbOfFlags;
    private final boolean thirdMsbOfFlags;
    private final boolean zeroLengthSubframe;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataAMpduStatus$Builder.class */
    public static final class Builder {
        private boolean delimiterCrcError;
        private byte delimiterCrcValue;
        private boolean delimiterCrcValueKnown;
        private boolean driverReportsZeroLengthSubframes;
        private boolean eighthMsbOfFlags;
        private boolean fifthMsbOfFlags;
        private boolean fourthMsbOfFlags;
        private boolean lastSubframe;
        private boolean lastSubframeKnown;
        private boolean msbOfFlags;
        private boolean ninthMsbOfFlags;
        private int referenceNumber;
        private byte reserved;
        private boolean secondMsbOfFlags;
        private boolean seventhMsbOfFlags;
        private boolean sixthMsbOfFlags;
        private boolean tenthMsbOfFlags;
        private boolean thirdMsbOfFlags;
        private boolean zeroLengthSubframe;

        public Builder() {
        }

        private Builder(RadiotapDataAMpduStatus radiotapDataAMpduStatus) {
            this.referenceNumber = radiotapDataAMpduStatus.referenceNumber;
            this.driverReportsZeroLengthSubframes = radiotapDataAMpduStatus.driverReportsZeroLengthSubframes;
            this.zeroLengthSubframe = radiotapDataAMpduStatus.zeroLengthSubframe;
            this.lastSubframeKnown = radiotapDataAMpduStatus.lastSubframeKnown;
            this.lastSubframe = radiotapDataAMpduStatus.lastSubframe;
            this.delimiterCrcError = radiotapDataAMpduStatus.delimiterCrcError;
            this.delimiterCrcValueKnown = radiotapDataAMpduStatus.delimiterCrcValueKnown;
            this.tenthMsbOfFlags = radiotapDataAMpduStatus.tenthMsbOfFlags;
            this.ninthMsbOfFlags = radiotapDataAMpduStatus.ninthMsbOfFlags;
            this.eighthMsbOfFlags = radiotapDataAMpduStatus.eighthMsbOfFlags;
            this.seventhMsbOfFlags = radiotapDataAMpduStatus.seventhMsbOfFlags;
            this.sixthMsbOfFlags = radiotapDataAMpduStatus.sixthMsbOfFlags;
            this.fifthMsbOfFlags = radiotapDataAMpduStatus.fifthMsbOfFlags;
            this.fourthMsbOfFlags = radiotapDataAMpduStatus.fourthMsbOfFlags;
            this.thirdMsbOfFlags = radiotapDataAMpduStatus.thirdMsbOfFlags;
            this.secondMsbOfFlags = radiotapDataAMpduStatus.secondMsbOfFlags;
            this.msbOfFlags = radiotapDataAMpduStatus.msbOfFlags;
            this.delimiterCrcValue = radiotapDataAMpduStatus.delimiterCrcValue;
            this.reserved = radiotapDataAMpduStatus.reserved;
        }

        public RadiotapDataAMpduStatus build() {
            return new RadiotapDataAMpduStatus(this);
        }

        public Builder delimiterCrcError(boolean z10) {
            this.delimiterCrcError = z10;
            return this;
        }

        public Builder delimiterCrcValue(byte b10) {
            this.delimiterCrcValue = b10;
            return this;
        }

        public Builder delimiterCrcValueKnown(boolean z10) {
            this.delimiterCrcValueKnown = z10;
            return this;
        }

        public Builder driverReportsZeroLengthSubframes(boolean z10) {
            this.driverReportsZeroLengthSubframes = z10;
            return this;
        }

        public Builder eighthMsbOfFlags(boolean z10) {
            this.eighthMsbOfFlags = z10;
            return this;
        }

        public Builder fifthMsbOfFlags(boolean z10) {
            this.fifthMsbOfFlags = z10;
            return this;
        }

        public Builder fourthMsbOfFlags(boolean z10) {
            this.fourthMsbOfFlags = z10;
            return this;
        }

        public Builder lastSubframe(boolean z10) {
            this.lastSubframe = z10;
            return this;
        }

        public Builder lastSubframeKnown(boolean z10) {
            this.lastSubframeKnown = z10;
            return this;
        }

        public Builder msbOfFlags(boolean z10) {
            this.msbOfFlags = z10;
            return this;
        }

        public Builder ninthMsbOfFlags(boolean z10) {
            this.ninthMsbOfFlags = z10;
            return this;
        }

        public Builder referenceNumber(int i10) {
            this.referenceNumber = i10;
            return this;
        }

        public Builder reserved(byte b10) {
            this.reserved = b10;
            return this;
        }

        public Builder secondMsbOfFlags(boolean z10) {
            this.secondMsbOfFlags = z10;
            return this;
        }

        public Builder seventhMsbOfFlags(boolean z10) {
            this.seventhMsbOfFlags = z10;
            return this;
        }

        public Builder sixthMsbOfFlags(boolean z10) {
            this.sixthMsbOfFlags = z10;
            return this;
        }

        public Builder tenthMsbOfFlags(boolean z10) {
            this.tenthMsbOfFlags = z10;
            return this;
        }

        public Builder thirdMsbOfFlags(boolean z10) {
            this.thirdMsbOfFlags = z10;
            return this;
        }

        public Builder zeroLengthSubframe(boolean z10) {
            this.zeroLengthSubframe = z10;
            return this;
        }
    }

    private RadiotapDataAMpduStatus(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.referenceNumber = builder.referenceNumber;
        this.driverReportsZeroLengthSubframes = builder.driverReportsZeroLengthSubframes;
        this.zeroLengthSubframe = builder.zeroLengthSubframe;
        this.lastSubframeKnown = builder.lastSubframeKnown;
        this.lastSubframe = builder.lastSubframe;
        this.delimiterCrcError = builder.delimiterCrcError;
        this.delimiterCrcValueKnown = builder.delimiterCrcValueKnown;
        this.tenthMsbOfFlags = builder.tenthMsbOfFlags;
        this.ninthMsbOfFlags = builder.ninthMsbOfFlags;
        this.eighthMsbOfFlags = builder.eighthMsbOfFlags;
        this.seventhMsbOfFlags = builder.seventhMsbOfFlags;
        this.sixthMsbOfFlags = builder.sixthMsbOfFlags;
        this.fifthMsbOfFlags = builder.fifthMsbOfFlags;
        this.fourthMsbOfFlags = builder.fourthMsbOfFlags;
        this.thirdMsbOfFlags = builder.thirdMsbOfFlags;
        this.secondMsbOfFlags = builder.secondMsbOfFlags;
        this.msbOfFlags = builder.msbOfFlags;
        this.delimiterCrcValue = builder.delimiterCrcValue;
        this.reserved = builder.reserved;
    }

    private RadiotapDataAMpduStatus(byte[] bArr, int i10, int i11) {
        if (i11 < 8) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapAMpduStatus (");
            sb2.append(8);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.referenceNumber = ByteArrays.getInt(bArr, i10, ByteOrder.LITTLE_ENDIAN);
        byte b10 = bArr[i10 + 4];
        this.driverReportsZeroLengthSubframes = (b10 & 1) != 0;
        this.zeroLengthSubframe = (b10 & 2) != 0;
        this.lastSubframeKnown = (b10 & 4) != 0;
        this.lastSubframe = (b10 & 8) != 0;
        this.delimiterCrcError = (b10 & 16) != 0;
        this.delimiterCrcValueKnown = (b10 & 32) != 0;
        this.tenthMsbOfFlags = (b10 & 64) != 0;
        this.ninthMsbOfFlags = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 5];
        this.eighthMsbOfFlags = (b11 & 1) != 0;
        this.seventhMsbOfFlags = (b11 & 2) != 0;
        this.sixthMsbOfFlags = (b11 & 4) != 0;
        this.fifthMsbOfFlags = (b11 & 8) != 0;
        this.fourthMsbOfFlags = (b11 & 16) != 0;
        this.thirdMsbOfFlags = (b11 & 32) != 0;
        this.secondMsbOfFlags = (b11 & 64) != 0;
        this.msbOfFlags = (b11 & 128) != 0;
        this.delimiterCrcValue = bArr[i10 + 6];
        this.reserved = bArr[i10 + 7];
    }

    public static RadiotapDataAMpduStatus newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataAMpduStatus(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataAMpduStatus.class != obj.getClass()) {
            return false;
        }
        RadiotapDataAMpduStatus radiotapDataAMpduStatus = (RadiotapDataAMpduStatus) obj;
        return this.delimiterCrcError == radiotapDataAMpduStatus.delimiterCrcError && this.delimiterCrcValue == radiotapDataAMpduStatus.delimiterCrcValue && this.delimiterCrcValueKnown == radiotapDataAMpduStatus.delimiterCrcValueKnown && this.driverReportsZeroLengthSubframes == radiotapDataAMpduStatus.driverReportsZeroLengthSubframes && this.eighthMsbOfFlags == radiotapDataAMpduStatus.eighthMsbOfFlags && this.fifthMsbOfFlags == radiotapDataAMpduStatus.fifthMsbOfFlags && this.fourthMsbOfFlags == radiotapDataAMpduStatus.fourthMsbOfFlags && this.lastSubframe == radiotapDataAMpduStatus.lastSubframe && this.lastSubframeKnown == radiotapDataAMpduStatus.lastSubframeKnown && this.msbOfFlags == radiotapDataAMpduStatus.msbOfFlags && this.ninthMsbOfFlags == radiotapDataAMpduStatus.ninthMsbOfFlags && this.referenceNumber == radiotapDataAMpduStatus.referenceNumber && this.reserved == radiotapDataAMpduStatus.reserved && this.secondMsbOfFlags == radiotapDataAMpduStatus.secondMsbOfFlags && this.seventhMsbOfFlags == radiotapDataAMpduStatus.seventhMsbOfFlags && this.sixthMsbOfFlags == radiotapDataAMpduStatus.sixthMsbOfFlags && this.tenthMsbOfFlags == radiotapDataAMpduStatus.tenthMsbOfFlags && this.thirdMsbOfFlags == radiotapDataAMpduStatus.thirdMsbOfFlags && this.zeroLengthSubframe == radiotapDataAMpduStatus.zeroLengthSubframe;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getDelimiterCrcValue() {
        return this.delimiterCrcValue;
    }

    public boolean getDriverReportsZeroLengthSubframes() {
        return this.driverReportsZeroLengthSubframes;
    }

    public boolean getEighthMsbOfFlags() {
        return this.eighthMsbOfFlags;
    }

    public boolean getFifthMsbOfFlags() {
        return this.fifthMsbOfFlags;
    }

    public boolean getFourthMsbOfFlags() {
        return this.fourthMsbOfFlags;
    }

    public boolean getMsbOfFlags() {
        return this.msbOfFlags;
    }

    public boolean getNinthMsbOfFlags() {
        return this.ninthMsbOfFlags;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[8];
        System.arraycopy(ByteArrays.toByteArray(this.referenceNumber, ByteOrder.LITTLE_ENDIAN), 0, bArr, 0, 4);
        if (this.driverReportsZeroLengthSubframes) {
            bArr[4] = (byte) (bArr[4] | 1);
        }
        if (this.zeroLengthSubframe) {
            bArr[4] = (byte) (bArr[4] | 2);
        }
        if (this.lastSubframeKnown) {
            bArr[4] = (byte) (bArr[4] | 4);
        }
        if (this.lastSubframe) {
            bArr[4] = (byte) (bArr[4] | 8);
        }
        if (this.delimiterCrcError) {
            bArr[4] = (byte) (bArr[4] | 16);
        }
        if (this.delimiterCrcValueKnown) {
            bArr[4] = (byte) (bArr[4] | 32);
        }
        if (this.tenthMsbOfFlags) {
            bArr[4] = (byte) (bArr[4] | 64);
        }
        if (this.ninthMsbOfFlags) {
            bArr[4] = (byte) (bArr[4] | 128);
        }
        if (this.eighthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 1);
        }
        if (this.seventhMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 2);
        }
        if (this.sixthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 4);
        }
        if (this.fifthMsbOfFlags) {
            bArr[5] = (byte) (8 | bArr[5]);
        }
        if (this.fourthMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 16);
        }
        if (this.thirdMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 32);
        }
        if (this.secondMsbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 64);
        }
        if (this.msbOfFlags) {
            bArr[5] = (byte) (bArr[5] | 128);
        }
        bArr[6] = this.delimiterCrcValue;
        bArr[7] = this.reserved;
        return bArr;
    }

    public int getReferenceNumber() {
        return this.referenceNumber;
    }

    public long getReferenceNumberAsLong() {
        return this.referenceNumber & 4294967295L;
    }

    public byte getReserved() {
        return this.reserved;
    }

    public boolean getSecondMsbOfFlags() {
        return this.secondMsbOfFlags;
    }

    public boolean getSeventhMsbOfFlags() {
        return this.seventhMsbOfFlags;
    }

    public boolean getSixthMsbOfFlags() {
        return this.sixthMsbOfFlags;
    }

    public boolean getTenthMsbOfFlags() {
        return this.tenthMsbOfFlags;
    }

    public boolean getThirdMsbOfFlags() {
        return this.thirdMsbOfFlags;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.delimiterCrcError ? 1231 : 1237;
        byte b10 = this.delimiterCrcValue;
        int i12 = this.delimiterCrcValueKnown ? 1231 : 1237;
        int i13 = this.driverReportsZeroLengthSubframes ? 1231 : 1237;
        int i14 = this.eighthMsbOfFlags ? 1231 : 1237;
        int i15 = this.fifthMsbOfFlags ? 1231 : 1237;
        int i16 = this.fourthMsbOfFlags ? 1231 : 1237;
        int i17 = this.lastSubframe ? 1231 : 1237;
        int i18 = this.lastSubframeKnown ? 1231 : 1237;
        int i19 = this.msbOfFlags ? 1231 : 1237;
        int i20 = this.ninthMsbOfFlags ? 1231 : 1237;
        int i21 = this.referenceNumber;
        byte b11 = this.reserved;
        int i22 = this.secondMsbOfFlags ? 1231 : 1237;
        int i23 = this.seventhMsbOfFlags ? 1231 : 1237;
        int i24 = this.sixthMsbOfFlags ? 1231 : 1237;
        int i25 = this.tenthMsbOfFlags ? 1231 : 1237;
        int i26 = this.thirdMsbOfFlags ? 1231 : 1237;
        if (!this.zeroLengthSubframe) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((((((((((((i11 + 31) * 31) + b10) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + b11) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i10;
    }

    public boolean isDelimiterCrcError() {
        return this.delimiterCrcError;
    }

    public boolean isDelimiterCrcValueKnown() {
        return this.delimiterCrcValueKnown;
    }

    public boolean isLastSubframe() {
        return this.lastSubframe;
    }

    public boolean isLastSubframeKnown() {
        return this.lastSubframeKnown;
    }

    public boolean isZeroLengthSubframe() {
        return this.zeroLengthSubframe;
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
        sb2.append("A-MPDU status: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  reference number: ");
        sb2.append(getReferenceNumberAsLong());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  driver reports 0-length subframes: ");
        sb2.append(this.driverReportsZeroLengthSubframes);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  0-length subframe: ");
        sb2.append(this.zeroLengthSubframe);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  last subframe is known: ");
        sb2.append(this.lastSubframeKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  last subframe: ");
        sb2.append(this.lastSubframe);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  delimiter CRC error: ");
        sb2.append(this.delimiterCrcError);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  delimiter CRC value is known: ");
        sb2.append(this.delimiterCrcValueKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  10th MSB of flags: ");
        sb2.append(this.tenthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  9th MSB of flags: ");
        sb2.append(this.ninthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  8th MSB of flags: ");
        sb2.append(this.eighthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  7th MSB of flags: ");
        sb2.append(this.seventhMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  6th MSB of flags: ");
        sb2.append(this.sixthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  5th MSB of flags: ");
        sb2.append(this.fifthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  4th MSB of flags: ");
        sb2.append(this.fourthMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  3rd MSB of flags: ");
        sb2.append(this.thirdMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  2nd MSB of flags: ");
        sb2.append(this.secondMsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MSB of flags: ");
        sb2.append(this.msbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  delimiter CRC value: 0x");
        sb2.append(ByteArrays.toHexString(this.delimiterCrcValue, ""));
        sb2.append(property);
        sb2.append(str);
        sb2.append("  reserved: 0x");
        sb2.append(ByteArrays.toHexString(this.reserved, ""));
        sb2.append(property);
        return sb2.toString();
    }
}
