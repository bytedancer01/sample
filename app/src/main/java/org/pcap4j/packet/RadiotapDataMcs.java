package org.pcap4j.packet;

import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataMcs.class */
public final class RadiotapDataMcs implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 3;
    private static final long serialVersionUID = 8914690461479810322L;
    private final Bandwidth bandwidth;
    private final boolean bandwidthKnown;
    private final RadiotapFecType fecType;
    private final boolean fecTypeKnown;
    private final boolean guardIntervalKnown;
    private final HtFormat htFormat;
    private final boolean htFormatKnown;
    private final boolean mcsIndexKnown;
    private final byte mcsRateIndex;
    private final boolean nessKnown;
    private final boolean nessLsb;
    private final boolean nessMsb;
    private final byte numStbcStreams;
    private final boolean shortGuardInterval;
    private final boolean stbcKnown;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataMcs$Bandwidth.class */
    public enum Bandwidth {
        BW_20(0, "20"),
        BW_40(1, "40"),
        BW_20L(2, "20L"),
        BW_20U(3, "20U");

        private final String name;
        private final int value;

        Bandwidth(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value + " (" + this.name + ")";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataMcs$Builder.class */
    public static final class Builder {
        private Bandwidth bandwidth;
        private boolean bandwidthKnown;
        private RadiotapFecType fecType;
        private boolean fecTypeKnown;
        private boolean guardIntervalKnown;
        private HtFormat htFormat;
        private boolean htFormatKnown;
        private boolean mcsIndexKnown;
        private byte mcsRateIndex;
        private boolean nessKnown;
        private boolean nessLsb;
        private boolean nessMsb;
        private byte numStbcStreams;
        private boolean shortGuardInterval;
        private boolean stbcKnown;

        public Builder() {
        }

        private Builder(RadiotapDataMcs radiotapDataMcs) {
            this.bandwidthKnown = radiotapDataMcs.bandwidthKnown;
            this.mcsIndexKnown = radiotapDataMcs.mcsIndexKnown;
            this.guardIntervalKnown = radiotapDataMcs.guardIntervalKnown;
            this.htFormatKnown = radiotapDataMcs.htFormatKnown;
            this.fecTypeKnown = radiotapDataMcs.fecTypeKnown;
            this.stbcKnown = radiotapDataMcs.stbcKnown;
            this.nessKnown = radiotapDataMcs.nessKnown;
            this.nessMsb = radiotapDataMcs.nessMsb;
            this.bandwidth = radiotapDataMcs.bandwidth;
            this.shortGuardInterval = radiotapDataMcs.shortGuardInterval;
            this.htFormat = radiotapDataMcs.htFormat;
            this.fecType = radiotapDataMcs.fecType;
            this.numStbcStreams = radiotapDataMcs.numStbcStreams;
            this.nessLsb = radiotapDataMcs.nessLsb;
            this.mcsRateIndex = radiotapDataMcs.mcsRateIndex;
        }

        public Builder bandwidth(Bandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder bandwidthKnown(boolean z10) {
            this.bandwidthKnown = z10;
            return this;
        }

        public RadiotapDataMcs build() {
            return new RadiotapDataMcs(this);
        }

        public Builder fecType(RadiotapFecType radiotapFecType) {
            this.fecType = radiotapFecType;
            return this;
        }

        public Builder fecTypeKnown(boolean z10) {
            this.fecTypeKnown = z10;
            return this;
        }

        public Builder guardIntervalKnown(boolean z10) {
            this.guardIntervalKnown = z10;
            return this;
        }

        public Builder htFormat(HtFormat htFormat) {
            this.htFormat = htFormat;
            return this;
        }

        public Builder htFormatKnown(boolean z10) {
            this.htFormatKnown = z10;
            return this;
        }

        public Builder mcsIndexKnown(boolean z10) {
            this.mcsIndexKnown = z10;
            return this;
        }

        public Builder mcsRateIndex(byte b10) {
            this.mcsRateIndex = b10;
            return this;
        }

        public Builder nessKnown(boolean z10) {
            this.nessKnown = z10;
            return this;
        }

        public Builder nessLsb(boolean z10) {
            this.nessLsb = z10;
            return this;
        }

        public Builder nessMsb(boolean z10) {
            this.nessMsb = z10;
            return this;
        }

        public Builder numStbcStreams(byte b10) {
            this.numStbcStreams = b10;
            return this;
        }

        public Builder shortGuardInterval(boolean z10) {
            this.shortGuardInterval = z10;
            return this;
        }

        public Builder stbcKnown(boolean z10) {
            this.stbcKnown = z10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataMcs$HtFormat.class */
    public enum HtFormat {
        MIXED(0),
        GREENFIELD(1);

        private final int value;

        HtFormat(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    private RadiotapDataMcs(Builder builder) {
        if (builder == null || builder.bandwidth == null || builder.htFormat == null || builder.fecType == null) {
            throw new NullPointerException("builder: " + builder + " builder.bandwidth: " + builder.bandwidth + " builder.htFormat: " + builder.htFormat + " builder.fecType: " + builder.fecType);
        }
        if ((builder.numStbcStreams & 252) != 0) {
            throw new IllegalArgumentException("(builder.numStbcStreams & 0xFC) must be 0. builder.numStbcStreams: " + ((int) builder.numStbcStreams));
        }
        this.bandwidthKnown = builder.bandwidthKnown;
        this.mcsIndexKnown = builder.mcsIndexKnown;
        this.guardIntervalKnown = builder.guardIntervalKnown;
        this.htFormatKnown = builder.htFormatKnown;
        this.fecTypeKnown = builder.fecTypeKnown;
        this.stbcKnown = builder.stbcKnown;
        this.nessKnown = builder.nessKnown;
        this.nessMsb = builder.nessMsb;
        this.bandwidth = builder.bandwidth;
        this.shortGuardInterval = builder.shortGuardInterval;
        this.htFormat = builder.htFormat;
        this.fecType = builder.fecType;
        this.numStbcStreams = builder.numStbcStreams;
        this.nessLsb = builder.nessLsb;
        this.mcsRateIndex = builder.mcsRateIndex;
    }

    private RadiotapDataMcs(byte[] bArr, int i10, int i11) {
        Bandwidth bandwidth;
        if (i11 < 3) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapMcs (");
            sb2.append(3);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        this.bandwidthKnown = (b10 & 1) != 0;
        this.mcsIndexKnown = (b10 & 2) != 0;
        this.guardIntervalKnown = (b10 & 4) != 0;
        this.htFormatKnown = (b10 & 8) != 0;
        this.fecTypeKnown = (b10 & 16) != 0;
        this.stbcKnown = (b10 & 32) != 0;
        this.nessKnown = (b10 & 64) != 0;
        this.nessMsb = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 1];
        int i12 = b11 & 3;
        if (i12 == 0) {
            bandwidth = Bandwidth.BW_20;
        } else if (i12 == 1) {
            bandwidth = Bandwidth.BW_40;
        } else if (i12 == 2) {
            bandwidth = Bandwidth.BW_20L;
        } else {
            if (i12 != 3) {
                throw new AssertionError("Never get here.");
            }
            bandwidth = Bandwidth.BW_20U;
        }
        this.bandwidth = bandwidth;
        this.shortGuardInterval = (b11 & 4) != 0;
        this.htFormat = (b11 & 8) != 0 ? HtFormat.GREENFIELD : HtFormat.MIXED;
        this.fecType = (b11 & 16) != 0 ? RadiotapFecType.LDPC : RadiotapFecType.BCC;
        this.numStbcStreams = (byte) ((b11 & 96) >> 5);
        this.nessLsb = (b11 & 128) != 0;
        this.mcsRateIndex = bArr[i10 + 2];
    }

    public static RadiotapDataMcs newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataMcs(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataMcs.class != obj.getClass()) {
            return false;
        }
        RadiotapDataMcs radiotapDataMcs = (RadiotapDataMcs) obj;
        return this.bandwidth == radiotapDataMcs.bandwidth && this.bandwidthKnown == radiotapDataMcs.bandwidthKnown && this.fecType == radiotapDataMcs.fecType && this.fecTypeKnown == radiotapDataMcs.fecTypeKnown && this.guardIntervalKnown == radiotapDataMcs.guardIntervalKnown && this.htFormat == radiotapDataMcs.htFormat && this.htFormatKnown == radiotapDataMcs.htFormatKnown && this.mcsIndexKnown == radiotapDataMcs.mcsIndexKnown && this.mcsRateIndex == radiotapDataMcs.mcsRateIndex && this.nessLsb == radiotapDataMcs.nessLsb && this.nessMsb == radiotapDataMcs.nessMsb && this.nessKnown == radiotapDataMcs.nessKnown && this.numStbcStreams == radiotapDataMcs.numStbcStreams && this.shortGuardInterval == radiotapDataMcs.shortGuardInterval && this.stbcKnown == radiotapDataMcs.stbcKnown;
    }

    public Bandwidth getBandwidth() {
        return this.bandwidth;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public RadiotapFecType getFecType() {
        return this.fecType;
    }

    public HtFormat getHtFormat() {
        return this.htFormat;
    }

    public byte getMcsRateIndex() {
        return this.mcsRateIndex;
    }

    public int getMcsRateIndexAsInt() {
        return this.mcsRateIndex & 255;
    }

    public boolean getNessLsb() {
        return this.nessLsb;
    }

    public boolean getNessMsb() {
        return this.nessMsb;
    }

    public byte getNumStbcStreams() {
        return this.numStbcStreams;
    }

    public int getNumStbcStreamsAsInt() {
        return this.numStbcStreams;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[3];
        if (this.bandwidthKnown) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.mcsIndexKnown) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.guardIntervalKnown) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.htFormatKnown) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.fecTypeKnown) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.stbcKnown) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.nessKnown) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.nessMsb) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        byte b10 = (byte) this.bandwidth.value;
        bArr[1] = b10;
        if (this.shortGuardInterval) {
            bArr[1] = (byte) (b10 | 4);
        }
        if (this.htFormat == HtFormat.GREENFIELD) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.fecType == RadiotapFecType.LDPC) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        byte b11 = (byte) (bArr[1] | (this.numStbcStreams << 5));
        bArr[1] = b11;
        if (this.nessLsb) {
            bArr[1] = (byte) (b11 | 128);
        }
        bArr[2] = this.mcsRateIndex;
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.bandwidth.hashCode();
        int i10 = 1231;
        int i11 = this.bandwidthKnown ? 1231 : 1237;
        int hashCode2 = this.fecType.hashCode();
        int i12 = this.fecTypeKnown ? 1231 : 1237;
        int i13 = this.guardIntervalKnown ? 1231 : 1237;
        int hashCode3 = this.htFormat.hashCode();
        int i14 = this.htFormatKnown ? 1231 : 1237;
        int i15 = this.mcsIndexKnown ? 1231 : 1237;
        byte b10 = this.mcsRateIndex;
        int i16 = this.nessLsb ? 1231 : 1237;
        int i17 = this.nessMsb ? 1231 : 1237;
        int i18 = this.nessKnown ? 1231 : 1237;
        byte b11 = this.numStbcStreams;
        int i19 = this.shortGuardInterval ? 1231 : 1237;
        if (!this.stbcKnown) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((((hashCode + 31) * 31) + i11) * 31) + hashCode2) * 31) + i12) * 31) + i13) * 31) + hashCode3) * 31) + i14) * 31) + i15) * 31) + b10) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + b11) * 31) + i19) * 31) + i10;
    }

    public boolean isBandwidthKnown() {
        return this.bandwidthKnown;
    }

    public boolean isFecTypeKnown() {
        return this.fecTypeKnown;
    }

    public boolean isGuardIntervalKnown() {
        return this.guardIntervalKnown;
    }

    public boolean isHtFormatKnown() {
        return this.htFormatKnown;
    }

    public boolean isMcsIndexKnown() {
        return this.mcsIndexKnown;
    }

    public boolean isNessKnown() {
        return this.nessKnown;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isStbcKnown() {
        return this.stbcKnown;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("MCS: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  bandwidth known: ");
        sb2.append(this.bandwidthKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MCS index known: ");
        sb2.append(this.mcsIndexKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  guard interval known: ");
        sb2.append(this.guardIntervalKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  HT format known: ");
        sb2.append(this.htFormatKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  FEC type known: ");
        sb2.append(this.fecTypeKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  STBC known: ");
        sb2.append(this.stbcKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Ness known: ");
        sb2.append(this.nessKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Ness data known: ");
        sb2.append(this.nessMsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  bandwidth: ");
        sb2.append(this.bandwidth);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  short guard interval: ");
        sb2.append(this.shortGuardInterval);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  HT format: ");
        sb2.append(this.htFormat);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  FEC type: ");
        sb2.append(this.fecType);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Number of STBC streams: ");
        sb2.append((int) this.numStbcStreams);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Ness: ");
        sb2.append(this.nessLsb);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MCS rate index: ");
        sb2.append(getMcsRateIndexAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
