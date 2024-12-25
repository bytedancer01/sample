package org.pcap4j.packet;

import java.nio.ByteOrder;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataChannel.class */
public final class RadiotapDataChannel implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 4;
    private static final long serialVersionUID = 3645927613193110605L;
    private final boolean cck;
    private final boolean dynamicCckOfdm;
    private final boolean fiveGhzSpectrum;
    private final boolean fourthLsbOfFlags;
    private final short frequency;
    private final boolean gfsk;
    private final boolean gsm;
    private final boolean halfRate;
    private final boolean lsbOfFlags;
    private final boolean ofdm;
    private final boolean onlyPassiveScan;
    private final boolean quarterRate;
    private final boolean secondLsbOfFlags;
    private final boolean staticTurbo;
    private final boolean thirdLsbOfFlags;
    private final boolean turbo;
    private final boolean twoGhzSpectrum;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataChannel$Builder.class */
    public static final class Builder {
        private boolean cck;
        private boolean dynamicCckOfdm;
        private boolean fiveGhzSpectrum;
        private boolean fourthLsbOfFlags;
        private short frequency;
        private boolean gfsk;
        private boolean gsm;
        private boolean halfRate;
        private boolean lsbOfFlags;
        private boolean ofdm;
        private boolean onlyPassiveScan;
        private boolean quarterRate;
        private boolean secondLsbOfFlags;
        private boolean staticTurbo;
        private boolean thirdLsbOfFlags;
        private boolean turbo;
        private boolean twoGhzSpectrum;

        public Builder() {
        }

        private Builder(RadiotapDataChannel radiotapDataChannel) {
            this.frequency = radiotapDataChannel.frequency;
            this.lsbOfFlags = radiotapDataChannel.lsbOfFlags;
            this.secondLsbOfFlags = radiotapDataChannel.secondLsbOfFlags;
            this.thirdLsbOfFlags = radiotapDataChannel.thirdLsbOfFlags;
            this.fourthLsbOfFlags = radiotapDataChannel.fourthLsbOfFlags;
            this.turbo = radiotapDataChannel.turbo;
            this.cck = radiotapDataChannel.cck;
            this.ofdm = radiotapDataChannel.ofdm;
            this.twoGhzSpectrum = radiotapDataChannel.twoGhzSpectrum;
            this.fiveGhzSpectrum = radiotapDataChannel.fiveGhzSpectrum;
            this.onlyPassiveScan = radiotapDataChannel.onlyPassiveScan;
            this.dynamicCckOfdm = radiotapDataChannel.dynamicCckOfdm;
            this.gfsk = radiotapDataChannel.gfsk;
            this.gsm = radiotapDataChannel.gsm;
            this.staticTurbo = radiotapDataChannel.staticTurbo;
            this.halfRate = radiotapDataChannel.halfRate;
            this.quarterRate = radiotapDataChannel.quarterRate;
        }

        public RadiotapDataChannel build() {
            return new RadiotapDataChannel(this);
        }

        public Builder cck(boolean z10) {
            this.cck = z10;
            return this;
        }

        public Builder dynamicCckOfdm(boolean z10) {
            this.dynamicCckOfdm = z10;
            return this;
        }

        public Builder fiveGhzSpectrum(boolean z10) {
            this.fiveGhzSpectrum = z10;
            return this;
        }

        public Builder fourthLsbOfFlags(boolean z10) {
            this.fourthLsbOfFlags = z10;
            return this;
        }

        public Builder frequency(short s10) {
            this.frequency = s10;
            return this;
        }

        public Builder gfsk(boolean z10) {
            this.gfsk = z10;
            return this;
        }

        public Builder gsm(boolean z10) {
            this.gsm = z10;
            return this;
        }

        public Builder halfRate(boolean z10) {
            this.halfRate = z10;
            return this;
        }

        public Builder lsbOfFlags(boolean z10) {
            this.lsbOfFlags = z10;
            return this;
        }

        public Builder ofdm(boolean z10) {
            this.ofdm = z10;
            return this;
        }

        public Builder onlyPassiveScan(boolean z10) {
            this.onlyPassiveScan = z10;
            return this;
        }

        public Builder quarterRate(boolean z10) {
            this.quarterRate = z10;
            return this;
        }

        public Builder secondLsbOfFlags(boolean z10) {
            this.secondLsbOfFlags = z10;
            return this;
        }

        public Builder staticTurbo(boolean z10) {
            this.staticTurbo = z10;
            return this;
        }

        public Builder thirdLsbOfFlags(boolean z10) {
            this.thirdLsbOfFlags = z10;
            return this;
        }

        public Builder turbo(boolean z10) {
            this.turbo = z10;
            return this;
        }

        public Builder twoGhzSpectrum(boolean z10) {
            this.twoGhzSpectrum = z10;
            return this;
        }
    }

    private RadiotapDataChannel(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        this.frequency = builder.frequency;
        this.lsbOfFlags = builder.lsbOfFlags;
        this.secondLsbOfFlags = builder.secondLsbOfFlags;
        this.thirdLsbOfFlags = builder.thirdLsbOfFlags;
        this.fourthLsbOfFlags = builder.fourthLsbOfFlags;
        this.turbo = builder.turbo;
        this.cck = builder.cck;
        this.ofdm = builder.ofdm;
        this.twoGhzSpectrum = builder.twoGhzSpectrum;
        this.fiveGhzSpectrum = builder.fiveGhzSpectrum;
        this.onlyPassiveScan = builder.onlyPassiveScan;
        this.dynamicCckOfdm = builder.dynamicCckOfdm;
        this.gfsk = builder.gfsk;
        this.gsm = builder.gsm;
        this.staticTurbo = builder.staticTurbo;
        this.halfRate = builder.halfRate;
        this.quarterRate = builder.quarterRate;
    }

    private RadiotapDataChannel(byte[] bArr, int i10, int i11) {
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapChannel (");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.frequency = ByteArrays.getShort(bArr, i10, ByteOrder.LITTLE_ENDIAN);
        byte b10 = bArr[i10 + 2];
        this.lsbOfFlags = (b10 & 1) != 0;
        this.secondLsbOfFlags = (b10 & 2) != 0;
        this.thirdLsbOfFlags = (b10 & 4) != 0;
        this.fourthLsbOfFlags = (b10 & 8) != 0;
        this.turbo = (b10 & 16) != 0;
        this.cck = (b10 & 32) != 0;
        this.ofdm = (b10 & 64) != 0;
        this.twoGhzSpectrum = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 3];
        this.fiveGhzSpectrum = (b11 & 1) != 0;
        this.onlyPassiveScan = (b11 & 2) != 0;
        this.dynamicCckOfdm = (b11 & 4) != 0;
        this.gfsk = (b11 & 8) != 0;
        this.gsm = (b11 & 16) != 0;
        this.staticTurbo = (b11 & 32) != 0;
        this.halfRate = (b11 & 64) != 0;
        this.quarterRate = (b11 & 128) != 0;
    }

    public static RadiotapDataChannel newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataChannel(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataChannel.class != obj.getClass()) {
            return false;
        }
        RadiotapDataChannel radiotapDataChannel = (RadiotapDataChannel) obj;
        return this.cck == radiotapDataChannel.cck && this.dynamicCckOfdm == radiotapDataChannel.dynamicCckOfdm && this.fiveGhzSpectrum == radiotapDataChannel.fiveGhzSpectrum && this.fourthLsbOfFlags == radiotapDataChannel.fourthLsbOfFlags && this.frequency == radiotapDataChannel.frequency && this.gfsk == radiotapDataChannel.gfsk && this.gsm == radiotapDataChannel.gsm && this.halfRate == radiotapDataChannel.halfRate && this.lsbOfFlags == radiotapDataChannel.lsbOfFlags && this.ofdm == radiotapDataChannel.ofdm && this.onlyPassiveScan == radiotapDataChannel.onlyPassiveScan && this.quarterRate == radiotapDataChannel.quarterRate && this.secondLsbOfFlags == radiotapDataChannel.secondLsbOfFlags && this.staticTurbo == radiotapDataChannel.staticTurbo && this.thirdLsbOfFlags == radiotapDataChannel.thirdLsbOfFlags && this.turbo == radiotapDataChannel.turbo && this.twoGhzSpectrum == radiotapDataChannel.twoGhzSpectrum;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getFourthLsbOfFlags() {
        return this.fourthLsbOfFlags;
    }

    public short getFrequency() {
        return this.frequency;
    }

    public int getFrequencyAsInt() {
        return this.frequency & 65535;
    }

    public boolean getLsbOfFlags() {
        return this.lsbOfFlags;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[4];
        System.arraycopy(ByteArrays.toByteArray(this.frequency, ByteOrder.LITTLE_ENDIAN), 0, bArr, 0, 2);
        if (this.lsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.secondLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.thirdLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.fourthLsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.turbo) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.cck) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.ofdm) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.twoGhzSpectrum) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        if (this.fiveGhzSpectrum) {
            bArr[3] = (byte) (bArr[3] | 1);
        }
        if (this.onlyPassiveScan) {
            bArr[3] = (byte) (bArr[3] | 2);
        }
        if (this.dynamicCckOfdm) {
            bArr[3] = (byte) (4 | bArr[3]);
        }
        if (this.gfsk) {
            bArr[3] = (byte) (bArr[3] | 8);
        }
        if (this.gsm) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.staticTurbo) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.halfRate) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.quarterRate) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public boolean getSecondLsbOfFlags() {
        return this.secondLsbOfFlags;
    }

    public boolean getThirdLsbOfFlags() {
        return this.thirdLsbOfFlags;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.cck ? 1231 : 1237;
        int i12 = this.dynamicCckOfdm ? 1231 : 1237;
        int i13 = this.fiveGhzSpectrum ? 1231 : 1237;
        int i14 = this.fourthLsbOfFlags ? 1231 : 1237;
        short s10 = this.frequency;
        int i15 = this.gfsk ? 1231 : 1237;
        int i16 = this.gsm ? 1231 : 1237;
        int i17 = this.halfRate ? 1231 : 1237;
        int i18 = this.lsbOfFlags ? 1231 : 1237;
        int i19 = this.ofdm ? 1231 : 1237;
        int i20 = this.onlyPassiveScan ? 1231 : 1237;
        int i21 = this.quarterRate ? 1231 : 1237;
        int i22 = this.secondLsbOfFlags ? 1231 : 1237;
        int i23 = this.staticTurbo ? 1231 : 1237;
        int i24 = this.thirdLsbOfFlags ? 1231 : 1237;
        int i25 = this.turbo ? 1231 : 1237;
        if (!this.twoGhzSpectrum) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + s10) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i10;
    }

    public boolean isCck() {
        return this.cck;
    }

    public boolean isDynamicCckOfdm() {
        return this.dynamicCckOfdm;
    }

    public boolean isFiveGhzSpectrum() {
        return this.fiveGhzSpectrum;
    }

    public boolean isGfsk() {
        return this.gfsk;
    }

    public boolean isGsm() {
        return this.gsm;
    }

    public boolean isHalfRate() {
        return this.halfRate;
    }

    public boolean isOfdm() {
        return this.ofdm;
    }

    public boolean isOnlyPassiveScan() {
        return this.onlyPassiveScan;
    }

    public boolean isQuarterRate() {
        return this.quarterRate;
    }

    public boolean isStaticTurbo() {
        return this.staticTurbo;
    }

    public boolean isTurbo() {
        return this.turbo;
    }

    public boolean isTwoGhzSpectrum() {
        return this.twoGhzSpectrum;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Channel: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Frequency: ");
        sb2.append(getFrequencyAsInt());
        sb2.append(" MHz");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  LSB of flags: ");
        sb2.append(this.lsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  2nd LSB of flags: ");
        sb2.append(this.secondLsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  3rd LSB of flags: ");
        sb2.append(this.thirdLsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  4th LSB of flags: ");
        sb2.append(this.fourthLsbOfFlags);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Turbo: ");
        sb2.append(this.turbo);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  CCK: ");
        sb2.append(this.cck);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  OFDM: ");
        sb2.append(this.ofdm);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  2 GHz spectrum: ");
        sb2.append(this.twoGhzSpectrum);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  5 GHz spectrum: ");
        sb2.append(this.fiveGhzSpectrum);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Only passive scan: ");
        sb2.append(this.onlyPassiveScan);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Dynamic CCK-OFDM: ");
        sb2.append(this.dynamicCckOfdm);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  GFSK: ");
        sb2.append(this.gfsk);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  GSM: ");
        sb2.append(this.gsm);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Static Turbo: ");
        sb2.append(this.staticTurbo);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Half rate: ");
        sb2.append(this.halfRate);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Quarter rate: ");
        sb2.append(this.quarterRate);
        sb2.append(property);
        return sb2.toString();
    }
}
