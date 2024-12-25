package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4TosPrecedence;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc791Tos.class */
public final class IpV4Rfc791Tos implements IpV4Packet.IpV4Tos {
    private static final long serialVersionUID = 1760697525836662144L;
    private final boolean eighthBit;
    private final boolean highReliability;
    private final boolean highThroughput;
    private final boolean lowDelay;
    private final IpV4TosPrecedence precedence;
    private final boolean seventhBit;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc791Tos$Builder.class */
    public static final class Builder {
        private boolean eighthBit;
        private boolean highReliability;
        private boolean highThroughput;
        private boolean lowDelay;
        private IpV4TosPrecedence precedence;
        private boolean seventhBit;

        public Builder() {
        }

        private Builder(IpV4Rfc791Tos ipV4Rfc791Tos) {
            this.precedence = ipV4Rfc791Tos.precedence;
            this.lowDelay = ipV4Rfc791Tos.lowDelay;
            this.highThroughput = ipV4Rfc791Tos.highThroughput;
            this.highReliability = ipV4Rfc791Tos.highReliability;
            this.seventhBit = ipV4Rfc791Tos.seventhBit;
            this.eighthBit = ipV4Rfc791Tos.eighthBit;
        }

        public IpV4Rfc791Tos build() {
            return new IpV4Rfc791Tos(this);
        }

        public Builder eighthBit(boolean z10) {
            this.eighthBit = z10;
            return this;
        }

        public Builder highReliability(boolean z10) {
            this.highReliability = z10;
            return this;
        }

        public Builder highThroughput(boolean z10) {
            this.highThroughput = z10;
            return this;
        }

        public Builder lowDelay(boolean z10) {
            this.lowDelay = z10;
            return this;
        }

        public Builder precedence(IpV4TosPrecedence ipV4TosPrecedence) {
            this.precedence = ipV4TosPrecedence;
            return this;
        }

        public Builder seventhBit(boolean z10) {
            this.seventhBit = z10;
            return this;
        }
    }

    private IpV4Rfc791Tos(byte b10) {
        this.precedence = IpV4TosPrecedence.getInstance(Byte.valueOf((byte) ((b10 & 224) >> 5)));
        this.lowDelay = (b10 & 16) != 0;
        this.highThroughput = (b10 & 8) != 0;
        this.highReliability = (b10 & 4) != 0;
        this.seventhBit = (b10 & 2) != 0;
        this.eighthBit = (b10 & 1) != 0;
    }

    private IpV4Rfc791Tos(Builder builder) {
        if (builder == null || builder.precedence == null) {
            throw new NullPointerException("builder" + builder + " builder.precedence: " + builder.precedence);
        }
        this.precedence = builder.precedence;
        this.lowDelay = builder.lowDelay;
        this.highThroughput = builder.highThroughput;
        this.highReliability = builder.highReliability;
        this.seventhBit = builder.seventhBit;
        this.eighthBit = builder.eighthBit;
    }

    public static IpV4Rfc791Tos newInstance(byte b10) {
        return new IpV4Rfc791Tos(b10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV4Rfc791Tos.class.isInstance(obj)) {
            return false;
        }
        if (((IpV4Rfc791Tos) IpV4Rfc791Tos.class.cast(obj)).value() != value()) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public boolean getEighthBit() {
        return this.eighthBit;
    }

    public IpV4TosPrecedence getPrecedence() {
        return this.precedence;
    }

    public boolean getSeventhBit() {
        return this.seventhBit;
    }

    public int hashCode() {
        return value();
    }

    public boolean isHighReliability() {
        return this.highReliability;
    }

    public boolean isHighThroughput() {
        return this.highThroughput;
    }

    public boolean isLowDelay() {
        return this.lowDelay;
    }

    public String toString() {
        return "[precedence: " + this.precedence + "] [lowDelay: " + this.lowDelay + "] [highThroughput: " + this.highThroughput + "] [highReliability: " + this.highReliability + "] [seventhBit: " + (this.seventhBit ? 1 : 0) + "] [eighthBit: " + (this.eighthBit ? 1 : 0) + "]";
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Tos
    public byte value() {
        byte byteValue = (byte) (this.precedence.value().byteValue() << 5);
        byte b10 = byteValue;
        if (this.lowDelay) {
            b10 = (byte) (byteValue | 16);
        }
        byte b11 = b10;
        if (this.highThroughput) {
            b11 = (byte) (b10 | 8);
        }
        byte b12 = b11;
        if (this.highReliability) {
            b12 = (byte) (b11 | 4);
        }
        byte b13 = b12;
        if (this.seventhBit) {
            b13 = (byte) (b12 | 2);
        }
        byte b14 = b13;
        if (this.eighthBit) {
            b14 = (byte) (b13 | 1);
        }
        return b14;
    }
}
