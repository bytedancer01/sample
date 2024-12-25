package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11LinkAdaptationControl.class */
public final class Dot11LinkAdaptationControl implements Serializable {
    public static final byte ASELI = 14;
    private static final long serialVersionUID = 7735461000002622072L;
    private final Aselc aselc;
    private final boolean aseli;
    private final Mai mai;
    private final Byte mfb;
    private final byte mfsi;
    private final boolean trq;
    private final boolean vhtMfb;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11LinkAdaptationControl$AselCommand.class */
    public enum AselCommand {
        TXASSI(0, "TXASSI"),
        TXASSR(1, "TXASSR"),
        RXASSI(2, "RXASSI"),
        RXASSR(3, "RXASSR"),
        SOUNDING_LABEL(4, "Sounding Label"),
        NO_FEEDBACK(5, "No Feedback"),
        TXASSI_CSI(6, "TXASSI-CSI"),
        SEVEN(7, "Reserved");

        private final String name;
        private final int value;

        AselCommand(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static AselCommand getInstance(int i10) {
            for (AselCommand aselCommand : values()) {
                if (aselCommand.value == i10) {
                    return aselCommand;
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

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11LinkAdaptationControl$Aselc.class */
    public static final class Aselc implements Serializable {
        private static final long serialVersionUID = -5404846090809709793L;
        private final AselCommand command;
        private final byte data;

        public Aselc(byte b10) {
            this.command = AselCommand.getInstance(b10 & 7);
            this.data = (byte) ((b10 >> 3) & 15);
        }

        public Aselc(AselCommand aselCommand, byte b10) {
            if (aselCommand == null) {
                throw new IllegalArgumentException("command is null.");
            }
            if ((b10 & 240) == 0) {
                this.command = aselCommand;
                this.data = b10;
            } else {
                throw new IllegalArgumentException("(data & 0xF0) must be zero. data: " + ((int) b10));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Aselc.class != obj.getClass()) {
                return false;
            }
            Aselc aselc = (Aselc) obj;
            return this.command == aselc.command && this.data == aselc.data;
        }

        public AselCommand getCommand() {
            return this.command;
        }

        public byte getData() {
            return this.data;
        }

        public byte getRawData() {
            return (byte) ((this.command.value << 4) | this.data);
        }

        public int hashCode() {
            return ((this.command.hashCode() + 31) * 31) + this.data;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(250);
            sb2.append("[ASEL Command: ");
            sb2.append(this.command);
            sb2.append(", ASEL Data: ");
            sb2.append((int) this.data);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11LinkAdaptationControl$Builder.class */
    public static final class Builder {
        private byte maiOrAseli;
        private byte mfbOrAselc;
        private byte mfsi;
        private boolean trq;
        private boolean vhtMfb;

        public Builder() {
        }

        private Builder(Dot11LinkAdaptationControl dot11LinkAdaptationControl) {
            this.vhtMfb = dot11LinkAdaptationControl.vhtMfb;
            this.trq = dot11LinkAdaptationControl.trq;
            this.maiOrAseli = dot11LinkAdaptationControl.mai.getRawData();
            this.mfsi = dot11LinkAdaptationControl.mfsi;
            this.mfbOrAselc = dot11LinkAdaptationControl.mfb.byteValue();
        }

        public Dot11LinkAdaptationControl build() {
            return new Dot11LinkAdaptationControl(this);
        }

        public Builder maiOrAseli(byte b10) {
            this.maiOrAseli = b10;
            return this;
        }

        public Builder maiOrAseli(Mai mai) {
            this.maiOrAseli = mai.getRawData();
            return this;
        }

        public Builder mfbOrAselc(byte b10) {
            this.mfbOrAselc = b10;
            return this;
        }

        public Builder mfbOrAselc(Aselc aselc) {
            this.mfbOrAselc = aselc.getRawData();
            return this;
        }

        public Builder mfsi(byte b10) {
            this.mfsi = b10;
            return this;
        }

        public Builder trq(boolean z10) {
            this.trq = z10;
            return this;
        }

        public Builder vhtMfb(boolean z10) {
            this.vhtMfb = z10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11LinkAdaptationControl$Mai.class */
    public static final class Mai implements Serializable {
        private static final long serialVersionUID = -7417614720576047794L;
        private final boolean mrq;
        private final byte msi;

        public Mai(byte b10) {
            this.mrq = (b10 & 1) != 0;
            this.msi = (byte) ((b10 >> 1) & 7);
        }

        public Mai(boolean z10, byte b10) {
            if (b10 >= 0 && b10 <= 6) {
                this.mrq = z10;
                this.msi = b10;
            } else {
                throw new IllegalArgumentException("msi must be between 0 and 6 but is actually: " + ((int) b10));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Mai.class != obj.getClass()) {
                return false;
            }
            Mai mai = (Mai) obj;
            return this.mrq == mai.mrq && this.msi == mai.msi;
        }

        public byte getMsi() {
            return this.msi;
        }

        public byte getRawData() {
            return (byte) (this.mrq ? (this.msi << 1) | 1 : this.msi << 1);
        }

        public int hashCode() {
            return (((this.mrq ? 1231 : 1237) + 31) * 31) + this.msi;
        }

        public boolean isMrq() {
            return this.mrq;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(250);
            sb2.append("[MRQ: ");
            sb2.append(this.mrq);
            sb2.append(", MSI: ");
            sb2.append((int) this.msi);
            sb2.append("]");
            return sb2.toString();
        }
    }

    private Dot11LinkAdaptationControl(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null.");
        }
        if ((builder.maiOrAseli & 240) != 0) {
            throw new IllegalArgumentException("(builder.maiOrAseli & 0xF0) must be zero. builder.maiOrAseli: " + ((int) builder.maiOrAseli));
        }
        if ((builder.mfsi & 248) != 0) {
            throw new IllegalArgumentException("(builder.mfsi & 0xF8) must be zero. builder.mfsi: " + ((int) builder.mfsi));
        }
        if ((builder.mfbOrAselc & 128) != 0) {
            throw new IllegalArgumentException("(builder.mfbOrAselc & 0x80) must be zero. builder.mfbOrAselc: " + ((int) builder.mfbOrAselc));
        }
        this.vhtMfb = builder.vhtMfb;
        this.trq = builder.trq;
        boolean z10 = builder.maiOrAseli == 14;
        this.aseli = z10;
        this.mai = z10 ? null : new Mai(builder.maiOrAseli);
        this.mfsi = builder.mfsi;
        this.mfb = Byte.valueOf(builder.mfbOrAselc);
        this.aselc = new Aselc(builder.mfbOrAselc);
    }

    private Dot11LinkAdaptationControl(byte[] bArr, int i10, int i11) {
        Mai mai;
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a Dot11LinkAdaptationControl (");
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
        byte b11 = bArr[i10 + 1];
        this.vhtMfb = (b10 & 1) != 0;
        this.trq = (b10 & 2) != 0;
        boolean z10 = ((b10 >> 2) & 15) == 14;
        this.aseli = z10;
        if (z10) {
            mai = null;
        } else {
            mai = new Mai((b10 & 4) != 0, (byte) ((b10 >> 3) & 7));
        }
        this.mai = mai;
        this.mfsi = (byte) (((b10 >> 6) & 3) | ((b11 & 1) << 2));
        byte b12 = (byte) ((b11 >> 1) & 127);
        this.mfb = Byte.valueOf(b12);
        this.aselc = new Aselc(b12);
    }

    public static Dot11LinkAdaptationControl newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11LinkAdaptationControl(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11LinkAdaptationControl.class != obj.getClass()) {
            return false;
        }
        Dot11LinkAdaptationControl dot11LinkAdaptationControl = (Dot11LinkAdaptationControl) obj;
        Mai mai = this.mai;
        if (mai == null) {
            if (dot11LinkAdaptationControl.mai != null) {
                return false;
            }
        } else if (!mai.equals(dot11LinkAdaptationControl.mai)) {
            return false;
        }
        return this.mfb.equals(dot11LinkAdaptationControl.mfb) && this.mfsi == dot11LinkAdaptationControl.mfsi && this.aseli == dot11LinkAdaptationControl.aseli && this.vhtMfb == dot11LinkAdaptationControl.vhtMfb && this.trq == dot11LinkAdaptationControl.trq;
    }

    public Aselc getAselc() {
        if (this.aseli) {
            return this.aselc;
        }
        return null;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Mai getMai() {
        return this.mai;
    }

    public Byte getMfb() {
        if (this.aseli) {
            return null;
        }
        return this.mfb;
    }

    public Integer getMfbAsInteger() {
        if (this.aseli) {
            return null;
        }
        return Integer.valueOf(this.mfb.byteValue());
    }

    public byte getMfsi() {
        return this.mfsi;
    }

    public int getMfsiAsInt() {
        return this.mfsi;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[2];
        byte rawData = (byte) (((this.aseli ? (byte) 14 : this.mai.getRawData()) << 2) | (this.mfsi << 6));
        bArr[0] = rawData;
        if (this.trq) {
            bArr[0] = (byte) (2 | rawData);
        }
        if (this.vhtMfb) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        byte byteValue = (byte) (this.mfb.byteValue() << 1);
        bArr[1] = byteValue;
        if ((this.mfsi & 4) != 0) {
            bArr[1] = (byte) (byteValue | 1);
        }
        return bArr;
    }

    public int hashCode() {
        Mai mai = this.mai;
        int hashCode = mai == null ? 0 : mai.hashCode();
        int hashCode2 = this.mfb.hashCode();
        byte b10 = this.mfsi;
        int i10 = 1231;
        int i11 = this.aseli ? 1231 : 1237;
        int i12 = this.vhtMfb ? 1231 : 1237;
        if (!this.trq) {
            i10 = 1237;
        }
        return ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + b10) * 31) + i11) * 31) + i12) * 31) + i10;
    }

    public boolean isAselIndicated() {
        return this.aseli;
    }

    public boolean isTrq() {
        return this.trq;
    }

    public boolean isVhtMfb() {
        return this.vhtMfb;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(250);
        sb2.append("[VHT_MFB: ");
        sb2.append(this.vhtMfb);
        sb2.append(", TRQ: ");
        sb2.append(this.trq);
        sb2.append(", ASELI: ");
        sb2.append(this.aseli);
        if (!this.aseli) {
            sb2.append(", MAI: ");
            sb2.append(this.mai);
        }
        sb2.append(", MFSI: ");
        sb2.append((int) this.mfsi);
        if (this.aseli) {
            sb2.append(", ASELC: ");
            obj = this.aselc;
        } else {
            sb2.append(", MFB: ");
            obj = this.mfb;
        }
        sb2.append(obj);
        sb2.append("]");
        return sb2.toString();
    }
}
