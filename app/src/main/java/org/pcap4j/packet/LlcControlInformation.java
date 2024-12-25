package org.pcap4j.packet;

import org.pcap4j.packet.LlcPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlInformation.class */
public final class LlcControlInformation implements LlcPacket.LlcControl {
    private static final long serialVersionUID = -4014592337107864662L;
    private final boolean pfBit;
    private final byte receiveSequenceNumber;
    private final byte sendSequenceNumber;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlInformation$Builder.class */
    public static final class Builder {
        private boolean pfBit;
        private byte receiveSequenceNumber;
        private byte sendSequenceNumber;

        public Builder() {
        }

        private Builder(LlcControlInformation llcControlInformation) {
            this.receiveSequenceNumber = llcControlInformation.receiveSequenceNumber;
            this.pfBit = llcControlInformation.pfBit;
            this.sendSequenceNumber = llcControlInformation.sendSequenceNumber;
        }

        public LlcControlInformation build() {
            return new LlcControlInformation(this);
        }

        public Builder pfBit(boolean z10) {
            this.pfBit = z10;
            return this;
        }

        public Builder receiveSequenceNumber(byte b10) {
            this.receiveSequenceNumber = b10;
            return this;
        }

        public Builder sendSequenceNumber(byte b10) {
            this.sendSequenceNumber = b10;
            return this;
        }
    }

    private LlcControlInformation(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder must not be null.");
        }
        if (builder.receiveSequenceNumber < 0) {
            throw new IllegalArgumentException("receiveSequenceNumber must be positive. receiveSequenceNumber: " + ((int) builder.receiveSequenceNumber));
        }
        if (builder.sendSequenceNumber >= 0) {
            this.receiveSequenceNumber = builder.receiveSequenceNumber;
            this.pfBit = builder.pfBit;
            this.sendSequenceNumber = builder.sendSequenceNumber;
        } else {
            throw new IllegalArgumentException("sendSequenceNumber must be positive. sendSequenceNumber: " + ((int) builder.sendSequenceNumber));
        }
    }

    private LlcControlInformation(short s10) {
        if ((s10 & 256) == 0) {
            this.receiveSequenceNumber = (byte) ((s10 >> 1) & 127);
            this.pfBit = (s10 & 1) != 0;
            this.sendSequenceNumber = (byte) ((s10 >> 9) & 127);
        } else {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("value & 0x0100 must be 0. value: ");
            sb2.append(ByteArrays.toHexString(s10, " "));
            throw new IllegalRawDataException(sb2.toString());
        }
    }

    public static LlcControlInformation newInstance(short s10) {
        return new LlcControlInformation(s10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!LlcControlInformation.class.isInstance(obj)) {
            return false;
        }
        LlcControlInformation llcControlInformation = (LlcControlInformation) obj;
        if (this.receiveSequenceNumber != llcControlInformation.receiveSequenceNumber || this.sendSequenceNumber != llcControlInformation.sendSequenceNumber || this.pfBit != llcControlInformation.pfBit) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
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
        bArr[0] = (byte) (this.sendSequenceNumber << 1);
        return bArr;
    }

    public byte getReceiveSequenceNumber() {
        return this.receiveSequenceNumber;
    }

    public int getReceiveSequenceNumberAsInt() {
        return this.receiveSequenceNumber;
    }

    public byte getSendSequenceNumber() {
        return this.sendSequenceNumber;
    }

    public int getSendSequenceNumberAsInt() {
        return this.sendSequenceNumber;
    }

    public int hashCode() {
        return ((((this.receiveSequenceNumber + 31) * 31) + (this.pfBit ? 1231 : 1237)) * 31) + this.sendSequenceNumber;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 2;
    }

    public String toString() {
        return "[receive sequence number: " + ((int) this.receiveSequenceNumber) + "] [P/F bit: " + (this.pfBit ? 1 : 0) + "] [send sequence number: " + ((int) this.sendSequenceNumber) + "]";
    }
}
