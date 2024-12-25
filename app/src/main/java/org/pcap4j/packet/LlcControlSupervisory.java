package org.pcap4j.packet;

import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.namednumber.LlcControlSupervisoryFunction;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlSupervisory.class */
public final class LlcControlSupervisory implements LlcPacket.LlcControl {
    private static final long serialVersionUID = 2248935134729569341L;
    private final boolean pfBit;
    private final byte receiveSequenceNumber;
    private final byte reserved;
    private final LlcControlSupervisoryFunction supervisoryFunction;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlSupervisory$Builder.class */
    public static final class Builder {
        private boolean pfBit;
        private byte receiveSequenceNumber;
        private byte reserved;
        private LlcControlSupervisoryFunction supervisoryFunction;

        public Builder() {
        }

        private Builder(LlcControlSupervisory llcControlSupervisory) {
            this.receiveSequenceNumber = llcControlSupervisory.receiveSequenceNumber;
            this.pfBit = llcControlSupervisory.pfBit;
            this.reserved = llcControlSupervisory.reserved;
            this.supervisoryFunction = llcControlSupervisory.supervisoryFunction;
        }

        public LlcControlSupervisory build() {
            return new LlcControlSupervisory(this);
        }

        public Builder pfBit(boolean z10) {
            this.pfBit = z10;
            return this;
        }

        public Builder receiveSequenceNumber(byte b10) {
            this.receiveSequenceNumber = b10;
            return this;
        }

        public Builder reserved(byte b10) {
            this.reserved = b10;
            return this;
        }

        public Builder supervisoryFunction(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
            this.supervisoryFunction = llcControlSupervisoryFunction;
            return this;
        }
    }

    private LlcControlSupervisory(Builder builder) {
        if (builder == null || builder.supervisoryFunction == null) {
            throw new NullPointerException("builder: " + builder + " builder.supervisoryFunction: " + builder.supervisoryFunction);
        }
        if (builder.receiveSequenceNumber < 0) {
            throw new IllegalArgumentException("receiveSequenceNumber must be positive. receiveSequenceNumber: " + ((int) builder.receiveSequenceNumber));
        }
        if ((builder.reserved & 65280) != 0) {
            throw new IllegalArgumentException("reserved & 0xFF00 must be 0. reserved: " + ((int) builder.reserved));
        }
        this.receiveSequenceNumber = builder.receiveSequenceNumber;
        this.pfBit = builder.pfBit;
        this.reserved = builder.reserved;
        this.supervisoryFunction = builder.supervisoryFunction;
    }

    private LlcControlSupervisory(short s10) {
        if ((s10 & 768) != 256) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("value & 0x0300 must be 0x0100. value: ");
            sb2.append(ByteArrays.toHexString(s10, " "));
            throw new IllegalRawDataException(sb2.toString());
        }
        this.receiveSequenceNumber = (byte) ((s10 >> 1) & 127);
        this.pfBit = (s10 & 1) != 0;
        this.reserved = (byte) ((s10 >> 12) & 15);
        this.supervisoryFunction = LlcControlSupervisoryFunction.getInstance(Byte.valueOf((byte) ((s10 >> 10) & 3)));
    }

    public static LlcControlSupervisory newInstance(short s10) {
        return new LlcControlSupervisory(s10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!LlcControlSupervisory.class.isInstance(obj)) {
            return false;
        }
        LlcControlSupervisory llcControlSupervisory = (LlcControlSupervisory) obj;
        if (this.receiveSequenceNumber != llcControlSupervisory.receiveSequenceNumber || !this.supervisoryFunction.equals(llcControlSupervisory.supervisoryFunction) || this.reserved != llcControlSupervisory.reserved || this.pfBit != llcControlSupervisory.pfBit) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public LlcControlSupervisoryFunction getLlcSupervisoryFunction() {
        return this.supervisoryFunction;
    }

    public boolean getPfBit() {
        return this.pfBit;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public byte[] getRawData() {
        byte b10 = (byte) (this.receiveSequenceNumber << 1);
        byte[] bArr = {0, b10};
        if (this.pfBit) {
            bArr[1] = (byte) (b10 | 1);
        }
        bArr[0] = (byte) ((this.supervisoryFunction.value().byteValue() << 2) | 1 | (this.reserved << 4));
        return bArr;
    }

    public byte getReceiveSequenceNumber() {
        return this.receiveSequenceNumber;
    }

    public int getReceiveSequenceNumberAsInt() {
        return this.receiveSequenceNumber;
    }

    public byte getReserved() {
        return this.reserved;
    }

    public int hashCode() {
        return ((((((this.receiveSequenceNumber + 31) * 31) + (this.pfBit ? 1231 : 1237)) * 31) + this.reserved) * 31) + this.supervisoryFunction.hashCode();
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 2;
    }

    public String toString() {
        return "[receive sequence number: " + ((int) this.receiveSequenceNumber) + "] [P/F bit: " + (this.pfBit ? 1 : 0) + "] [reserved: " + ((int) this.reserved) + "] [supervisory function: " + this.supervisoryFunction + "]";
    }
}
