package org.pcap4j.packet;

import java.io.Serializable;
import org.apache.commons.net.ftp.FTPReply;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HtControl.class */
public final class Dot11HtControl implements Serializable {
    private static final long serialVersionUID = 8919536873635707080L;
    private final boolean acConstraint;
    private final boolean bit20;
    private final boolean bit21;
    private final boolean bit25;
    private final boolean bit26;
    private final boolean bit27;
    private final boolean bit28;
    private final boolean bit29;
    private final CalibrationPosition calibrationPosition;
    private final byte calibrationSequence;
    private final CsiOrSteering csiOrSteering;
    private final Dot11LinkAdaptationControl linkAdaptationControl;
    private final boolean ndpAnnouncement;
    private final boolean rdgOrMorePpdu;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HtControl$Builder.class */
    public static final class Builder {
        private boolean acConstraint;
        private boolean bit20;
        private boolean bit21;
        private boolean bit25;
        private boolean bit26;
        private boolean bit27;
        private boolean bit28;
        private boolean bit29;
        private CalibrationPosition calibrationPosition;
        private byte calibrationSequence;
        private CsiOrSteering csiOrSteering;
        private Dot11LinkAdaptationControl linkAdaptationControl;
        private boolean ndpAnnouncement;
        private boolean rdgOrMorePpdu;

        public Builder() {
        }

        private Builder(Dot11HtControl dot11HtControl) {
            this.linkAdaptationControl = dot11HtControl.linkAdaptationControl;
            this.calibrationPosition = dot11HtControl.calibrationPosition;
            this.calibrationSequence = dot11HtControl.calibrationSequence;
            this.bit20 = dot11HtControl.bit20;
            this.bit21 = dot11HtControl.bit21;
            this.csiOrSteering = dot11HtControl.csiOrSteering;
            this.ndpAnnouncement = dot11HtControl.ndpAnnouncement;
            this.bit25 = dot11HtControl.bit25;
            this.bit26 = dot11HtControl.bit26;
            this.bit27 = dot11HtControl.bit27;
            this.bit28 = dot11HtControl.bit28;
            this.bit29 = dot11HtControl.bit29;
            this.acConstraint = dot11HtControl.acConstraint;
            this.rdgOrMorePpdu = dot11HtControl.rdgOrMorePpdu;
        }

        public Builder acConstraint(boolean z10) {
            this.acConstraint = z10;
            return this;
        }

        public Builder bit20(boolean z10) {
            this.bit20 = z10;
            return this;
        }

        public Builder bit21(boolean z10) {
            this.bit21 = z10;
            return this;
        }

        public Builder bit25(boolean z10) {
            this.bit25 = z10;
            return this;
        }

        public Builder bit26(boolean z10) {
            this.bit26 = z10;
            return this;
        }

        public Builder bit27(boolean z10) {
            this.bit27 = z10;
            return this;
        }

        public Builder bit28(boolean z10) {
            this.bit28 = z10;
            return this;
        }

        public Builder bit29(boolean z10) {
            this.bit29 = z10;
            return this;
        }

        public Dot11HtControl build() {
            return new Dot11HtControl(this);
        }

        public Builder calibrationPosition(CalibrationPosition calibrationPosition) {
            this.calibrationPosition = calibrationPosition;
            return this;
        }

        public Builder calibrationSequence(byte b10) {
            this.calibrationSequence = b10;
            return this;
        }

        public Builder csiOrSteering(CsiOrSteering csiOrSteering) {
            this.csiOrSteering = csiOrSteering;
            return this;
        }

        public Builder linkAdaptationControl(Dot11LinkAdaptationControl dot11LinkAdaptationControl) {
            this.linkAdaptationControl = dot11LinkAdaptationControl;
            return this;
        }

        public Builder ndpAnnouncement(boolean z10) {
            this.ndpAnnouncement = z10;
            return this;
        }

        public Builder rdgOrMorePpdu(boolean z10) {
            this.rdgOrMorePpdu = z10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HtControl$CalibrationPosition.class */
    public enum CalibrationPosition {
        NOT_CALIBRATION(0, "not a calibration frame"),
        CALIBRATION_START(1, "calibration start"),
        SOUNDING_RESPONSE(2, "sounding response"),
        SOUNDING_COMPLETE(3, "sounding complete");

        private final String name;
        private final int value;

        CalibrationPosition(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static CalibrationPosition getInstance(int i10) {
            for (CalibrationPosition calibrationPosition : values()) {
                if (calibrationPosition.value == i10) {
                    return calibrationPosition;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HtControl$CsiOrSteering.class */
    public enum CsiOrSteering {
        NO_FEEDBACK_REQUIRED(0, "No feedback required"),
        CSI(1, "CSI"),
        NONCOMPRESSED_BEAMFORMING(2, "Noncompressed beamforming"),
        COMPRESSED_BEAMFORMING(3, "Compressed beamforming");

        private final String name;
        private final int value;

        CsiOrSteering(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static CsiOrSteering getInstance(int i10) {
            for (CsiOrSteering csiOrSteering : values()) {
                if (csiOrSteering.value == i10) {
                    return csiOrSteering;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private Dot11HtControl(Builder builder) {
        if (builder == null || builder.linkAdaptationControl == null || builder.calibrationPosition == null || builder.csiOrSteering == null) {
            throw new NullPointerException("builder: " + builder + " builder.linkAdaptationControl: " + builder.linkAdaptationControl + " builder.calibrationPosition: " + builder.calibrationPosition + " builder.csiOrSteering: " + builder.csiOrSteering);
        }
        if ((builder.calibrationSequence & 252) != 0) {
            StringBuilder sb2 = new StringBuilder(FTPReply.FILE_STATUS_OK);
            sb2.append("(builder.calibrationSequence & 0xFC) must be zero.");
            sb2.append(" builder.calibrationSequence: ");
            sb2.append((int) builder.calibrationSequence);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.linkAdaptationControl = builder.linkAdaptationControl;
        this.calibrationPosition = builder.calibrationPosition;
        this.calibrationSequence = builder.calibrationSequence;
        this.bit20 = builder.bit20;
        this.bit21 = builder.bit21;
        this.csiOrSteering = builder.csiOrSteering;
        this.ndpAnnouncement = builder.ndpAnnouncement;
        this.bit25 = builder.bit25;
        this.bit26 = builder.bit26;
        this.bit27 = builder.bit27;
        this.bit28 = builder.bit28;
        this.bit29 = builder.bit29;
        this.acConstraint = builder.acConstraint;
        this.rdgOrMorePpdu = builder.rdgOrMorePpdu;
    }

    private Dot11HtControl(byte[] bArr, int i10, int i11) {
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a Dot11HtControl (");
            sb2.append(2);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        this.linkAdaptationControl = Dot11LinkAdaptationControl.newInstance(bArr, i10, 2);
        byte b10 = bArr[i10 + 2];
        this.calibrationPosition = CalibrationPosition.getInstance(b10 & 3);
        this.calibrationSequence = (byte) ((b10 >> 2) & 3);
        this.bit20 = (b10 & 16) != 0;
        this.bit21 = (b10 & 32) != 0;
        this.csiOrSteering = CsiOrSteering.getInstance((b10 >> 6) & 3);
        byte b11 = bArr[i10 + 3];
        this.ndpAnnouncement = (b11 & 1) != 0;
        this.bit25 = (b11 & 2) != 0;
        this.bit26 = (b11 & 4) != 0;
        this.bit27 = (b11 & 8) != 0;
        this.bit28 = (b11 & 16) != 0;
        this.bit29 = (b11 & 32) != 0;
        this.acConstraint = (b11 & 64) != 0;
        this.rdgOrMorePpdu = (b11 & 128) != 0;
    }

    public static Dot11HtControl newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11HtControl(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11HtControl.class != obj.getClass()) {
            return false;
        }
        Dot11HtControl dot11HtControl = (Dot11HtControl) obj;
        return this.acConstraint == dot11HtControl.acConstraint && this.bit20 == dot11HtControl.bit20 && this.bit21 == dot11HtControl.bit21 && this.bit25 == dot11HtControl.bit25 && this.bit26 == dot11HtControl.bit26 && this.bit27 == dot11HtControl.bit27 && this.bit28 == dot11HtControl.bit28 && this.bit29 == dot11HtControl.bit29 && this.calibrationPosition == dot11HtControl.calibrationPosition && this.calibrationSequence == dot11HtControl.calibrationSequence && this.csiOrSteering == dot11HtControl.csiOrSteering && this.linkAdaptationControl.equals(dot11HtControl.linkAdaptationControl) && this.ndpAnnouncement == dot11HtControl.ndpAnnouncement && this.rdgOrMorePpdu == dot11HtControl.rdgOrMorePpdu;
    }

    public boolean getAcConstraint() {
        return this.acConstraint;
    }

    public boolean getBit20() {
        return this.bit20;
    }

    public boolean getBit21() {
        return this.bit21;
    }

    public boolean getBit25() {
        return this.bit25;
    }

    public boolean getBit26() {
        return this.bit26;
    }

    public boolean getBit27() {
        return this.bit27;
    }

    public boolean getBit28() {
        return this.bit28;
    }

    public boolean getBit29() {
        return this.bit29;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public CalibrationPosition getCalibrationPosition() {
        return this.calibrationPosition;
    }

    public byte getCalibrationSequence() {
        return this.calibrationSequence;
    }

    public int getCalibrationSequenceAsInt() {
        return this.calibrationSequence;
    }

    public CsiOrSteering getCsiOrSteering() {
        return this.csiOrSteering;
    }

    public Dot11LinkAdaptationControl getLinkAdaptationControl() {
        return this.linkAdaptationControl;
    }

    public boolean getNdpAnnouncement() {
        return this.ndpAnnouncement;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        System.arraycopy(this.linkAdaptationControl.getRawData(), 0, bArr, 0, 2);
        byte b10 = (byte) ((this.csiOrSteering.value << 6) | (this.calibrationSequence << 2) | this.calibrationPosition.value);
        bArr[2] = b10;
        if (this.bit20) {
            bArr[2] = (byte) (b10 | 16);
        }
        if (this.bit21) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.ndpAnnouncement) {
            bArr[3] = (byte) (bArr[3] | 1);
        }
        if (this.bit25) {
            bArr[3] = (byte) (bArr[3] | 2);
        }
        if (this.bit26) {
            bArr[3] = (byte) (bArr[3] | 4);
        }
        if (this.bit27) {
            bArr[3] = (byte) (bArr[3] | 8);
        }
        if (this.bit28) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.bit29) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.acConstraint) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.rdgOrMorePpdu) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        return bArr;
    }

    public boolean getRdgOrMorePpdu() {
        return this.rdgOrMorePpdu;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.acConstraint ? 1231 : 1237;
        int i12 = this.bit20 ? 1231 : 1237;
        int i13 = this.bit21 ? 1231 : 1237;
        int i14 = this.bit25 ? 1231 : 1237;
        int i15 = this.bit26 ? 1231 : 1237;
        int i16 = this.bit27 ? 1231 : 1237;
        int i17 = this.bit28 ? 1231 : 1237;
        int i18 = this.bit29 ? 1231 : 1237;
        int hashCode = this.calibrationPosition.hashCode();
        byte b10 = this.calibrationSequence;
        int hashCode2 = this.csiOrSteering.hashCode();
        int hashCode3 = this.linkAdaptationControl.hashCode();
        int i19 = this.ndpAnnouncement ? 1231 : 1237;
        if (!this.rdgOrMorePpdu) {
            i10 = 1237;
        }
        return ((((((((((((((((((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + hashCode) * 31) + b10) * 31) + hashCode2) * 31) + hashCode3) * 31) + i19) * 31) + i10;
    }

    public int length() {
        return 4;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Link Adaptation Control: ");
        sb2.append(this.linkAdaptationControl);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Calibration Position: ");
        sb2.append(this.calibrationPosition);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Calibration Sequence: ");
        sb2.append((int) this.calibrationSequence);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 20: ");
        sb2.append(this.bit20);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 21: ");
        sb2.append(this.bit21);
        sb2.append(property);
        sb2.append(str);
        sb2.append("CSI/Steering: ");
        sb2.append(this.csiOrSteering);
        sb2.append(property);
        sb2.append(str);
        sb2.append("NDP Announcement: ");
        sb2.append(this.ndpAnnouncement);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 25: ");
        sb2.append(this.bit25);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 26: ");
        sb2.append(this.bit26);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 27: ");
        sb2.append(this.bit27);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 28: ");
        sb2.append(this.bit28);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Bit 29: ");
        sb2.append(this.bit29);
        sb2.append(property);
        sb2.append(str);
        sb2.append("AC Constraint: ");
        sb2.append(this.acConstraint);
        sb2.append(property);
        sb2.append(str);
        sb2.append("RDG/More PPDU: ");
        sb2.append(this.rdgOrMorePpdu);
        sb2.append(property);
        return sb2.toString();
    }
}
