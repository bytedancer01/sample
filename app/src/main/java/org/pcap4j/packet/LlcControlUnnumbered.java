package org.pcap4j.packet;

import org.pcap4j.packet.LlcPacket;
import org.pcap4j.packet.namednumber.LlcControlModifierFunction;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlUnnumbered.class */
public final class LlcControlUnnumbered implements LlcPacket.LlcControl {
    private static final long serialVersionUID = 8688698899763120721L;
    private final LlcControlModifierFunction modifierFunction;
    private final boolean pfBit;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcControlUnnumbered$Builder.class */
    public static final class Builder {
        private LlcControlModifierFunction modifierFunction;
        private boolean pfBit;

        public Builder() {
        }

        private Builder(LlcControlUnnumbered llcControlUnnumbered) {
            this.modifierFunction = llcControlUnnumbered.modifierFunction;
            this.pfBit = llcControlUnnumbered.pfBit;
        }

        public LlcControlUnnumbered build() {
            return new LlcControlUnnumbered(this);
        }

        public Builder modifierFunction(LlcControlModifierFunction llcControlModifierFunction) {
            this.modifierFunction = llcControlModifierFunction;
            return this;
        }

        public Builder pfBit(boolean z10) {
            this.pfBit = z10;
            return this;
        }
    }

    private LlcControlUnnumbered(byte b10) {
        if ((b10 & 3) == 3) {
            this.modifierFunction = LlcControlModifierFunction.getInstance(Byte.valueOf((byte) ((b10 >> 2) & 59)));
            this.pfBit = (b10 & 16) != 0;
        } else {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Both the lsb and the second lsb of the value must be 1. value: ");
            sb2.append(ByteArrays.toHexString(b10, " "));
            throw new IllegalRawDataException(sb2.toString());
        }
    }

    private LlcControlUnnumbered(Builder builder) {
        if (builder != null && builder.modifierFunction != null) {
            this.modifierFunction = builder.modifierFunction;
            this.pfBit = builder.pfBit;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.modifierFunction: " + builder.modifierFunction);
    }

    public static LlcControlUnnumbered newInstance(byte b10) {
        return new LlcControlUnnumbered(b10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!LlcControlUnnumbered.class.isInstance(obj)) {
            return false;
        }
        LlcControlUnnumbered llcControlUnnumbered = (LlcControlUnnumbered) obj;
        if (!this.modifierFunction.equals(llcControlUnnumbered.modifierFunction) || this.pfBit != llcControlUnnumbered.pfBit) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public LlcControlModifierFunction getModifierFunction() {
        return this.modifierFunction;
    }

    public boolean getPfBit() {
        return this.pfBit;
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public byte[] getRawData() {
        byte byteValue = (byte) ((this.modifierFunction.value().byteValue() << 2) | 3);
        byte[] bArr = {byteValue};
        if (this.pfBit) {
            bArr[0] = (byte) (byteValue | 16);
        }
        return bArr;
    }

    public int hashCode() {
        return ((this.modifierFunction.hashCode() + 31) * 31) + (this.pfBit ? 1231 : 1237);
    }

    @Override // org.pcap4j.packet.LlcPacket.LlcControl
    public int length() {
        return 1;
    }

    public String toString() {
        return "[modifier function: " + this.modifierFunction + "] [P/F bit: " + (this.pfBit ? 1 : 0) + "]";
    }
}
