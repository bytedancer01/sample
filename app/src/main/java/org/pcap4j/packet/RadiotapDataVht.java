package org.pcap4j.packet;

import java.nio.ByteOrder;
import java.util.Arrays;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.namednumber.RadiotapVhtBandwidth;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataVht.class */
public final class RadiotapDataVht implements RadiotapPacket.RadiotapData {
    private static final int LENGTH = 12;
    private static final long serialVersionUID = -7423738690741454273L;
    private final RadiotapVhtBandwidth bandwidth;
    private final boolean bandwidthKnown;
    private final boolean beamformed;
    private final boolean beamformedKnown;
    private final RadiotapFecType[] fecTypes;
    private final boolean fifthMsbOfKnown;
    private final boolean fourthMsbOfKnown;
    private final byte groupId;
    private final boolean groupIdKnown;
    private final boolean guardIntervalKnown;
    private final boolean ldpcExtraOfdmSymbol;
    private final boolean ldpcExtraOfdmSymbolKnown;
    private final byte[] mcses;
    private final boolean msbOfFlags;
    private final boolean msbOfKnown;
    private final byte[] nsses;
    private final short partialAid;
    private final boolean partialAidKnown;
    private final boolean secondMsbOfFlags;
    private final boolean secondMsbOfKnown;
    private final boolean seventhMsbOfKnown;
    private final boolean shortGiNsymDisambiguation;
    private final boolean shortGiNsymDisambiguationKnown;
    private final boolean shortGuardInterval;
    private final boolean sixthMsbOfKnown;
    private final boolean stbc;
    private final boolean stbcKnown;
    private final boolean thirdMsbOfKnown;
    private final boolean txopPsNotAllowed;
    private final boolean txopPsNotAllowedKnown;
    private final byte unusedInCoding;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapDataVht$Builder.class */
    public static final class Builder {
        private RadiotapVhtBandwidth bandwidth;
        private boolean bandwidthKnown;
        private boolean beamformed;
        private boolean beamformedKnown;
        private RadiotapFecType[] fecTypes;
        private boolean fifthMsbOfKnown;
        private boolean fourthMsbOfKnown;
        private byte groupId;
        private boolean groupIdKnown;
        private boolean guardIntervalKnown;
        private boolean ldpcExtraOfdmSymbol;
        private boolean ldpcExtraOfdmSymbolKnown;
        private byte[] mcses;
        private boolean msbOfFlags;
        private boolean msbOfKnown;
        private byte[] nsses;
        private short partialAid;
        private boolean partialAidKnown;
        private boolean secondMsbOfFlags;
        private boolean secondMsbOfKnown;
        private boolean seventhMsbOfKnown;
        private boolean shortGiNsymDisambiguation;
        private boolean shortGiNsymDisambiguationKnown;
        private boolean shortGuardInterval;
        private boolean sixthMsbOfKnown;
        private boolean stbc;
        private boolean stbcKnown;
        private boolean thirdMsbOfKnown;
        private boolean txopPsNotAllowed;
        private boolean txopPsNotAllowedKnown;
        private byte unusedInCoding;

        public Builder() {
        }

        private Builder(RadiotapDataVht radiotapDataVht) {
            this.stbcKnown = radiotapDataVht.stbcKnown;
            this.txopPsNotAllowedKnown = radiotapDataVht.txopPsNotAllowedKnown;
            this.guardIntervalKnown = radiotapDataVht.guardIntervalKnown;
            this.shortGiNsymDisambiguationKnown = radiotapDataVht.shortGiNsymDisambiguationKnown;
            this.ldpcExtraOfdmSymbolKnown = radiotapDataVht.ldpcExtraOfdmSymbolKnown;
            this.beamformedKnown = radiotapDataVht.beamformedKnown;
            this.bandwidthKnown = radiotapDataVht.bandwidthKnown;
            this.groupIdKnown = radiotapDataVht.groupIdKnown;
            this.partialAidKnown = radiotapDataVht.partialAidKnown;
            this.seventhMsbOfKnown = radiotapDataVht.seventhMsbOfKnown;
            this.sixthMsbOfKnown = radiotapDataVht.sixthMsbOfKnown;
            this.fifthMsbOfKnown = radiotapDataVht.fifthMsbOfKnown;
            this.fourthMsbOfKnown = radiotapDataVht.fourthMsbOfKnown;
            this.thirdMsbOfKnown = radiotapDataVht.thirdMsbOfKnown;
            this.secondMsbOfKnown = radiotapDataVht.secondMsbOfKnown;
            this.msbOfKnown = radiotapDataVht.msbOfKnown;
            this.stbc = radiotapDataVht.stbc;
            this.txopPsNotAllowed = radiotapDataVht.txopPsNotAllowed;
            this.shortGuardInterval = radiotapDataVht.shortGuardInterval;
            this.shortGiNsymDisambiguation = radiotapDataVht.shortGiNsymDisambiguation;
            this.ldpcExtraOfdmSymbol = radiotapDataVht.ldpcExtraOfdmSymbol;
            this.beamformed = radiotapDataVht.beamformed;
            this.secondMsbOfFlags = radiotapDataVht.secondMsbOfFlags;
            this.msbOfFlags = radiotapDataVht.msbOfFlags;
            this.bandwidth = radiotapDataVht.bandwidth;
            this.mcses = radiotapDataVht.mcses;
            this.nsses = radiotapDataVht.nsses;
            this.fecTypes = radiotapDataVht.fecTypes;
            this.unusedInCoding = radiotapDataVht.unusedInCoding;
            this.groupId = radiotapDataVht.groupId;
            this.partialAid = radiotapDataVht.partialAid;
        }

        public Builder bandwidth(RadiotapVhtBandwidth radiotapVhtBandwidth) {
            this.bandwidth = radiotapVhtBandwidth;
            return this;
        }

        public Builder bandwidthKnown(boolean z10) {
            this.bandwidthKnown = z10;
            return this;
        }

        public Builder beamformed(boolean z10) {
            this.beamformed = z10;
            return this;
        }

        public Builder beamformedKnown(boolean z10) {
            this.beamformedKnown = z10;
            return this;
        }

        public RadiotapDataVht build() {
            return new RadiotapDataVht(this);
        }

        public Builder fecTypes(RadiotapFecType[] radiotapFecTypeArr) {
            this.fecTypes = radiotapFecTypeArr;
            return this;
        }

        public Builder fifthMsbOfKnown(boolean z10) {
            this.fifthMsbOfKnown = z10;
            return this;
        }

        public Builder fourthMsbOfKnown(boolean z10) {
            this.fourthMsbOfKnown = z10;
            return this;
        }

        public Builder groupId(byte b10) {
            this.groupId = b10;
            return this;
        }

        public Builder groupIdKnown(boolean z10) {
            this.groupIdKnown = z10;
            return this;
        }

        public Builder guardIntervalKnown(boolean z10) {
            this.guardIntervalKnown = z10;
            return this;
        }

        public Builder ldpcExtraOfdmSymbol(boolean z10) {
            this.ldpcExtraOfdmSymbol = z10;
            return this;
        }

        public Builder ldpcExtraOfdmSymbolKnown(boolean z10) {
            this.ldpcExtraOfdmSymbolKnown = z10;
            return this;
        }

        public Builder mcses(byte[] bArr) {
            this.mcses = bArr;
            return this;
        }

        public Builder msbOfFlags(boolean z10) {
            this.msbOfFlags = z10;
            return this;
        }

        public Builder msbOfKnown(boolean z10) {
            this.msbOfKnown = z10;
            return this;
        }

        public Builder nsses(byte[] bArr) {
            this.nsses = bArr;
            return this;
        }

        public Builder partialAid(short s10) {
            this.partialAid = s10;
            return this;
        }

        public Builder partialAidKnown(boolean z10) {
            this.partialAidKnown = z10;
            return this;
        }

        public Builder secondMsbOfFlags(boolean z10) {
            this.secondMsbOfFlags = z10;
            return this;
        }

        public Builder secondMsbOfKnown(boolean z10) {
            this.secondMsbOfKnown = z10;
            return this;
        }

        public Builder seventhMsbOfKnown(boolean z10) {
            this.seventhMsbOfKnown = z10;
            return this;
        }

        public Builder shortGiNsymDisambiguation(boolean z10) {
            this.shortGiNsymDisambiguation = z10;
            return this;
        }

        public Builder shortGiNsymDisambiguationKnown(boolean z10) {
            this.shortGiNsymDisambiguationKnown = z10;
            return this;
        }

        public Builder shortGuardInterval(boolean z10) {
            this.shortGuardInterval = z10;
            return this;
        }

        public Builder sixthMsbOfKnown(boolean z10) {
            this.sixthMsbOfKnown = z10;
            return this;
        }

        public Builder stbc(boolean z10) {
            this.stbc = z10;
            return this;
        }

        public Builder stbcKnown(boolean z10) {
            this.stbcKnown = z10;
            return this;
        }

        public Builder thirdMsbOfKnown(boolean z10) {
            this.thirdMsbOfKnown = z10;
            return this;
        }

        public Builder txopPsNotAllowed(boolean z10) {
            this.txopPsNotAllowed = z10;
            return this;
        }

        public Builder txopPsNotAllowedKnown(boolean z10) {
            this.txopPsNotAllowedKnown = z10;
            return this;
        }

        public Builder unusedInCoding(byte b10) {
            this.unusedInCoding = b10;
            return this;
        }
    }

    private RadiotapDataVht(Builder builder) {
        if (builder == null || builder.bandwidth == null || builder.mcses == null || builder.nsses == null || builder.fecTypes == null) {
            throw new NullPointerException("builder: " + builder + " builder.bandwidth: " + builder.bandwidth + " builder.mcses: " + builder.mcses + " builder.nsses: " + builder.nsses + " builder.fecTypes: " + builder.fecTypes);
        }
        if ((builder.unusedInCoding & 240) != 0) {
            throw new IllegalArgumentException("builder.unusedInCoding & 0xF0 must be 0. builder.unusedInCoding: " + ((int) builder.unusedInCoding));
        }
        if (builder.mcses.length != 4) {
            throw new IllegalArgumentException("builder.mcses.length must be 4. builder.mcses: " + Arrays.toString(builder.mcses));
        }
        if (builder.nsses.length != 4) {
            throw new IllegalArgumentException("builder.nsses.length must be 4. builder.nsses: " + Arrays.toString(builder.nsses));
        }
        if (builder.fecTypes.length != 4) {
            throw new IllegalArgumentException("builder.fecTypes.length must be 4. builder.fecTypes: " + Arrays.toString(builder.fecTypes));
        }
        for (byte b10 : builder.mcses) {
            if ((b10 & 240) != 0) {
                throw new IllegalArgumentException("(mcs & 0xF0) must be zero. builder.mcses: " + Arrays.toString(builder.mcses));
            }
        }
        for (byte b11 : builder.nsses) {
            if ((b11 & 240) != 0) {
                throw new IllegalArgumentException("(nss & 0xF0) must be zero. builder.nsses: " + Arrays.toString(builder.nsses));
            }
        }
        this.stbcKnown = builder.stbcKnown;
        this.txopPsNotAllowedKnown = builder.txopPsNotAllowedKnown;
        this.guardIntervalKnown = builder.guardIntervalKnown;
        this.shortGiNsymDisambiguationKnown = builder.shortGiNsymDisambiguationKnown;
        this.ldpcExtraOfdmSymbolKnown = builder.ldpcExtraOfdmSymbolKnown;
        this.beamformedKnown = builder.beamformedKnown;
        this.bandwidthKnown = builder.bandwidthKnown;
        this.groupIdKnown = builder.groupIdKnown;
        this.partialAidKnown = builder.partialAidKnown;
        this.seventhMsbOfKnown = builder.seventhMsbOfKnown;
        this.sixthMsbOfKnown = builder.sixthMsbOfKnown;
        this.fifthMsbOfKnown = builder.fifthMsbOfKnown;
        this.fourthMsbOfKnown = builder.fourthMsbOfKnown;
        this.thirdMsbOfKnown = builder.thirdMsbOfKnown;
        this.secondMsbOfKnown = builder.secondMsbOfKnown;
        this.msbOfKnown = builder.msbOfKnown;
        this.stbc = builder.stbc;
        this.txopPsNotAllowed = builder.txopPsNotAllowed;
        this.shortGuardInterval = builder.shortGuardInterval;
        this.shortGiNsymDisambiguation = builder.shortGiNsymDisambiguation;
        this.ldpcExtraOfdmSymbol = builder.ldpcExtraOfdmSymbol;
        this.beamformed = builder.beamformed;
        this.secondMsbOfFlags = builder.secondMsbOfFlags;
        this.msbOfFlags = builder.msbOfFlags;
        this.bandwidth = builder.bandwidth;
        this.mcses = ByteArrays.clone(builder.mcses);
        this.nsses = ByteArrays.clone(builder.nsses);
        this.fecTypes = (RadiotapFecType[]) builder.fecTypes.clone();
        this.unusedInCoding = builder.unusedInCoding;
        this.groupId = builder.groupId;
        this.partialAid = builder.partialAid;
    }

    private RadiotapDataVht(byte[] bArr, int i10, int i11) {
        if (i11 < 12) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a RadiotapVht (");
            sb2.append(12);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        this.stbcKnown = (b10 & 1) != 0;
        this.txopPsNotAllowedKnown = (b10 & 2) != 0;
        this.guardIntervalKnown = (b10 & 4) != 0;
        this.shortGiNsymDisambiguationKnown = (b10 & 8) != 0;
        this.ldpcExtraOfdmSymbolKnown = (b10 & 16) != 0;
        this.beamformedKnown = (b10 & 32) != 0;
        this.bandwidthKnown = (b10 & 64) != 0;
        this.groupIdKnown = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 1];
        this.partialAidKnown = (b11 & 1) != 0;
        this.seventhMsbOfKnown = (b11 & 2) != 0;
        this.sixthMsbOfKnown = (b11 & 4) != 0;
        this.fifthMsbOfKnown = (b11 & 8) != 0;
        this.fourthMsbOfKnown = (b11 & 16) != 0;
        this.thirdMsbOfKnown = (b11 & 32) != 0;
        this.secondMsbOfKnown = (b11 & 64) != 0;
        this.msbOfKnown = (b11 & 128) != 0;
        byte b12 = bArr[i10 + 2];
        this.stbc = (b12 & 1) != 0;
        this.txopPsNotAllowed = (b12 & 2) != 0;
        this.shortGuardInterval = (b12 & 4) != 0;
        this.shortGiNsymDisambiguation = (b12 & 8) != 0;
        this.ldpcExtraOfdmSymbol = (b12 & 16) != 0;
        this.beamformed = (b12 & 32) != 0;
        this.secondMsbOfFlags = (b12 & 64) != 0;
        this.msbOfFlags = (b12 & 128) != 0;
        this.bandwidth = RadiotapVhtBandwidth.getInstance(Byte.valueOf(bArr[i10 + 3]));
        this.mcses = new byte[4];
        this.nsses = new byte[4];
        for (int i12 = 0; i12 < 4; i12++) {
            byte b13 = bArr[i10 + 4 + i12];
            this.mcses[i12] = (byte) ((b13 >> 4) & 15);
            this.nsses[i12] = (byte) (b13 & 15);
        }
        this.fecTypes = new RadiotapFecType[4];
        int i13 = 0;
        while (true) {
            int i14 = i10 + 8;
            if (i13 >= 4) {
                this.unusedInCoding = (byte) ((bArr[i14] >> 4) & 15);
                this.groupId = bArr[i10 + 9];
                this.partialAid = ByteArrays.getShort(bArr, i10 + 10, ByteOrder.LITTLE_ENDIAN);
                return;
            } else {
                if (((bArr[i14] >> i13) & 1) != 0) {
                    this.fecTypes[i13] = RadiotapFecType.LDPC;
                } else {
                    this.fecTypes[i13] = RadiotapFecType.BCC;
                }
                i13++;
            }
        }
    }

    public static RadiotapDataVht newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapDataVht(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadiotapDataVht.class != obj.getClass()) {
            return false;
        }
        RadiotapDataVht radiotapDataVht = (RadiotapDataVht) obj;
        return this.bandwidth.equals(radiotapDataVht.bandwidth) && this.bandwidthKnown == radiotapDataVht.bandwidthKnown && this.beamformed == radiotapDataVht.beamformed && this.beamformedKnown == radiotapDataVht.beamformedKnown && Arrays.equals(this.fecTypes, radiotapDataVht.fecTypes) && this.fifthMsbOfKnown == radiotapDataVht.fifthMsbOfKnown && this.fourthMsbOfKnown == radiotapDataVht.fourthMsbOfKnown && this.groupId == radiotapDataVht.groupId && this.groupIdKnown == radiotapDataVht.groupIdKnown && this.guardIntervalKnown == radiotapDataVht.guardIntervalKnown && this.ldpcExtraOfdmSymbol == radiotapDataVht.ldpcExtraOfdmSymbol && this.ldpcExtraOfdmSymbolKnown == radiotapDataVht.ldpcExtraOfdmSymbolKnown && Arrays.equals(this.mcses, radiotapDataVht.mcses) && this.msbOfFlags == radiotapDataVht.msbOfFlags && this.msbOfKnown == radiotapDataVht.msbOfKnown && Arrays.equals(this.nsses, radiotapDataVht.nsses) && this.partialAid == radiotapDataVht.partialAid && this.partialAidKnown == radiotapDataVht.partialAidKnown && this.secondMsbOfFlags == radiotapDataVht.secondMsbOfFlags && this.secondMsbOfKnown == radiotapDataVht.secondMsbOfKnown && this.seventhMsbOfKnown == radiotapDataVht.seventhMsbOfKnown && this.shortGiNsymDisambiguation == radiotapDataVht.shortGiNsymDisambiguation && this.shortGiNsymDisambiguationKnown == radiotapDataVht.shortGiNsymDisambiguationKnown && this.shortGuardInterval == radiotapDataVht.shortGuardInterval && this.sixthMsbOfKnown == radiotapDataVht.sixthMsbOfKnown && this.stbc == radiotapDataVht.stbc && this.stbcKnown == radiotapDataVht.stbcKnown && this.thirdMsbOfKnown == radiotapDataVht.thirdMsbOfKnown && this.txopPsNotAllowed == radiotapDataVht.txopPsNotAllowed && this.txopPsNotAllowedKnown == radiotapDataVht.txopPsNotAllowedKnown && this.unusedInCoding == radiotapDataVht.unusedInCoding;
    }

    public RadiotapVhtBandwidth getBandwidth() {
        return this.bandwidth;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public RadiotapFecType[] getFecTypes() {
        return (RadiotapFecType[]) this.fecTypes.clone();
    }

    public boolean getFifthMsbOfKnown() {
        return this.fifthMsbOfKnown;
    }

    public boolean getFourthMsbOfKnown() {
        return this.fourthMsbOfKnown;
    }

    public byte getGroupId() {
        return this.groupId;
    }

    public int getGroupIdAsInt() {
        return this.groupId & 255;
    }

    public byte[] getMcses() {
        return ByteArrays.clone(this.mcses);
    }

    public boolean getMsbOfFlags() {
        return this.msbOfFlags;
    }

    public boolean getMsbOfKnown() {
        return this.msbOfKnown;
    }

    public byte[] getNsses() {
        return ByteArrays.clone(this.nsses);
    }

    public short getPartialAid() {
        return this.partialAid;
    }

    public int getPartialAidAsInt() {
        return this.partialAid & 65535;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public byte[] getRawData() {
        byte[] bArr = new byte[12];
        if (this.stbcKnown) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        if (this.txopPsNotAllowedKnown) {
            bArr[0] = (byte) (bArr[0] | 2);
        }
        if (this.guardIntervalKnown) {
            bArr[0] = (byte) (bArr[0] | 4);
        }
        if (this.shortGiNsymDisambiguationKnown) {
            bArr[0] = (byte) (bArr[0] | 8);
        }
        if (this.ldpcExtraOfdmSymbolKnown) {
            bArr[0] = (byte) (bArr[0] | 16);
        }
        if (this.beamformedKnown) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        if (this.bandwidthKnown) {
            bArr[0] = (byte) (bArr[0] | 64);
        }
        if (this.groupIdKnown) {
            bArr[0] = (byte) (bArr[0] | 128);
        }
        if (this.partialAidKnown) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.seventhMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 2);
        }
        if (this.sixthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.fifthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.fourthMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.thirdMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.secondMsbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.msbOfKnown) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        if (this.stbc) {
            bArr[2] = (byte) (bArr[2] | 1);
        }
        if (this.txopPsNotAllowed) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.shortGuardInterval) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        if (this.shortGiNsymDisambiguation) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.ldpcExtraOfdmSymbol) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.beamformed) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.secondMsbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.msbOfFlags) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        bArr[3] = this.bandwidth.value().byteValue();
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10 + 4] = (byte) (this.nsses[i10] | (this.mcses[i10] << 4));
        }
        byte b10 = (byte) (this.unusedInCoding << 4);
        bArr[8] = b10;
        RadiotapFecType[] radiotapFecTypeArr = this.fecTypes;
        RadiotapFecType radiotapFecType = radiotapFecTypeArr[0];
        RadiotapFecType radiotapFecType2 = RadiotapFecType.LDPC;
        if (radiotapFecType == radiotapFecType2) {
            bArr[8] = (byte) (b10 | 1);
        }
        if (radiotapFecTypeArr[1] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 2);
        }
        if (radiotapFecTypeArr[2] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 4);
        }
        if (radiotapFecTypeArr[3] == radiotapFecType2) {
            bArr[8] = (byte) (bArr[8] | 8);
        }
        bArr[9] = this.groupId;
        System.arraycopy(ByteArrays.toByteArray(this.partialAid, ByteOrder.LITTLE_ENDIAN), 0, bArr, 10, 2);
        return bArr;
    }

    public boolean getSecondMsbOfFlags() {
        return this.secondMsbOfFlags;
    }

    public boolean getSecondMsbOfKnown() {
        return this.secondMsbOfKnown;
    }

    public boolean getSeventhMsbOfKnown() {
        return this.seventhMsbOfKnown;
    }

    public boolean getSixthMsbOfKnown() {
        return this.sixthMsbOfKnown;
    }

    public boolean getThirdMsbOfKnown() {
        return this.thirdMsbOfKnown;
    }

    public byte getUnusedInCoding() {
        return this.unusedInCoding;
    }

    public int hashCode() {
        int hashCode = this.bandwidth.hashCode();
        int i10 = 1231;
        int i11 = this.bandwidthKnown ? 1231 : 1237;
        int i12 = this.beamformed ? 1231 : 1237;
        int i13 = this.beamformedKnown ? 1231 : 1237;
        int hashCode2 = Arrays.hashCode(this.fecTypes);
        int i14 = this.fifthMsbOfKnown ? 1231 : 1237;
        int i15 = this.fourthMsbOfKnown ? 1231 : 1237;
        byte b10 = this.groupId;
        int i16 = this.groupIdKnown ? 1231 : 1237;
        int i17 = this.guardIntervalKnown ? 1231 : 1237;
        int i18 = this.ldpcExtraOfdmSymbol ? 1231 : 1237;
        int i19 = this.ldpcExtraOfdmSymbolKnown ? 1231 : 1237;
        int hashCode3 = Arrays.hashCode(this.mcses);
        int i20 = this.msbOfFlags ? 1231 : 1237;
        int i21 = this.msbOfKnown ? 1231 : 1237;
        int hashCode4 = Arrays.hashCode(this.nsses);
        short s10 = this.partialAid;
        int i22 = this.partialAidKnown ? 1231 : 1237;
        int i23 = this.secondMsbOfFlags ? 1231 : 1237;
        int i24 = this.secondMsbOfKnown ? 1231 : 1237;
        int i25 = this.seventhMsbOfKnown ? 1231 : 1237;
        int i26 = this.shortGiNsymDisambiguation ? 1231 : 1237;
        int i27 = this.shortGiNsymDisambiguationKnown ? 1231 : 1237;
        int i28 = this.shortGuardInterval ? 1231 : 1237;
        int i29 = this.sixthMsbOfKnown ? 1231 : 1237;
        int i30 = this.stbc ? 1231 : 1237;
        int i31 = this.stbcKnown ? 1231 : 1237;
        int i32 = this.thirdMsbOfKnown ? 1231 : 1237;
        int i33 = this.txopPsNotAllowed ? 1231 : 1237;
        if (!this.txopPsNotAllowedKnown) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode + 31) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + hashCode2) * 31) + i14) * 31) + i15) * 31) + b10) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + hashCode3) * 31) + i20) * 31) + i21) * 31) + hashCode4) * 31) + s10) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i27) * 31) + i28) * 31) + i29) * 31) + i30) * 31) + i31) * 31) + i32) * 31) + i33) * 31) + i10) * 31) + this.unusedInCoding;
    }

    public boolean isBandwidthKnown() {
        return this.bandwidthKnown;
    }

    public boolean isBeamformed() {
        return this.beamformed;
    }

    public boolean isBeamformedKnown() {
        return this.beamformedKnown;
    }

    public boolean isGroupIdKnown() {
        return this.groupIdKnown;
    }

    public boolean isGuardIntervalKnown() {
        return this.guardIntervalKnown;
    }

    public boolean isLdpcExtraOfdmSymbol() {
        return this.ldpcExtraOfdmSymbol;
    }

    public boolean isLdpcExtraOfdmSymbolKnown() {
        return this.ldpcExtraOfdmSymbolKnown;
    }

    public boolean isPartialAidKnown() {
        return this.partialAidKnown;
    }

    public boolean isShortGiNsymDisambiguation() {
        return this.shortGiNsymDisambiguation;
    }

    public boolean isShortGiNsymDisambiguationKnown() {
        return this.shortGiNsymDisambiguationKnown;
    }

    public boolean isShortGuardInterval() {
        return this.shortGuardInterval;
    }

    public boolean isStbc() {
        return this.stbc;
    }

    public boolean isStbcKnown() {
        return this.stbcKnown;
    }

    public boolean isTxopPsNotAllowed() {
        return this.txopPsNotAllowed;
    }

    public boolean isTxopPsNotAllowedKnown() {
        return this.txopPsNotAllowedKnown;
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public int length() {
        return 12;
    }

    public String toString() {
        return toString("");
    }

    @Override // org.pcap4j.packet.RadiotapPacket.RadiotapData
    public String toString(String str) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("VHT: ");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  STBC known: ");
        sb2.append(this.stbcKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  TXOP_PS_NOT_ALLOWED known: ");
        sb2.append(this.txopPsNotAllowedKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Guard interval known: ");
        sb2.append(this.guardIntervalKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Short GI NSYM disambiguation known: ");
        sb2.append(this.shortGiNsymDisambiguationKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  LDPC extra OFDM symbol known: ");
        sb2.append(this.ldpcExtraOfdmSymbolKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Beamformed known: ");
        sb2.append(this.beamformedKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Bandwidth known: ");
        sb2.append(this.bandwidthKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Group ID known: ");
        sb2.append(this.groupIdKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Partial AID known: ");
        sb2.append(this.partialAidKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  7th MSB of known: ");
        sb2.append(this.seventhMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  6th MSB of known: ");
        sb2.append(this.sixthMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  5th MSB of known: ");
        sb2.append(this.fifthMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  4th MSB of known: ");
        sb2.append(this.fourthMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  3rd MSB of known: ");
        sb2.append(this.thirdMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  2nd MSB of known: ");
        sb2.append(this.secondMsbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  MSB of known: ");
        sb2.append(this.msbOfKnown);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  STBC: ");
        sb2.append(this.stbc);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  TXOP_PS_NOT_ALLOWED: ");
        sb2.append(this.txopPsNotAllowed);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Short Guard interval: ");
        sb2.append(this.shortGuardInterval);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Short GI NSYM disambiguation: ");
        sb2.append(this.shortGiNsymDisambiguation);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  LDPC extra OFDM symbol: ");
        sb2.append(this.ldpcExtraOfdmSymbol);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Beamformed: ");
        sb2.append(this.beamformed);
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
        sb2.append("  Bandwidth: ");
        sb2.append(this.bandwidth);
        sb2.append(property);
        for (int i11 = 0; i11 < 4; i11++) {
            sb2.append(str);
            sb2.append("  NSS-");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append((int) this.nsses[i11]);
            sb2.append(property);
        }
        int i12 = 0;
        while (true) {
            i10 = 0;
            if (i12 >= 4) {
                break;
            }
            sb2.append(str);
            sb2.append("  MCS-");
            sb2.append(i12);
            sb2.append(": ");
            sb2.append((int) this.mcses[i12]);
            sb2.append(property);
            i12++;
        }
        while (true) {
            sb2.append(str);
            if (i10 >= 4) {
                sb2.append("  Group ID: ");
                sb2.append(getGroupIdAsInt());
                sb2.append(property);
                sb2.append(str);
                sb2.append("  Partial AID: ");
                sb2.append(getPartialAidAsInt());
                sb2.append(property);
                return sb2.toString();
            }
            sb2.append("  FEC-");
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(this.fecTypes[i10]);
            sb2.append(property);
            i10++;
        }
    }
}
