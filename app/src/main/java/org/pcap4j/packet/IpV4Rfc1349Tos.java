package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4TosPrecedence;
import org.pcap4j.packet.namednumber.IpV4TosTos;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc1349Tos.class */
public final class IpV4Rfc1349Tos implements IpV4Packet.IpV4Tos {
    private static final long serialVersionUID = 1760697525836662144L;
    private final boolean mbz;
    private final IpV4TosPrecedence precedence;
    private final IpV4TosTos tos;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc1349Tos$Builder.class */
    public static final class Builder {
        private boolean mbz;
        private IpV4TosPrecedence precedence;
        private IpV4TosTos tos;

        public Builder() {
        }

        private Builder(IpV4Rfc1349Tos ipV4Rfc1349Tos) {
            this.precedence = ipV4Rfc1349Tos.precedence;
            this.tos = ipV4Rfc1349Tos.tos;
            this.mbz = ipV4Rfc1349Tos.mbz;
        }

        public IpV4Rfc1349Tos build() {
            return new IpV4Rfc1349Tos(this);
        }

        public Builder mbz(boolean z10) {
            this.mbz = z10;
            return this;
        }

        public Builder precedence(IpV4TosPrecedence ipV4TosPrecedence) {
            this.precedence = ipV4TosPrecedence;
            return this;
        }

        public Builder tos(IpV4TosTos ipV4TosTos) {
            this.tos = ipV4TosTos;
            return this;
        }
    }

    private IpV4Rfc1349Tos(byte b10) {
        this.precedence = IpV4TosPrecedence.getInstance(Byte.valueOf((byte) ((b10 & 224) >> 5)));
        this.tos = IpV4TosTos.getInstance(Byte.valueOf((byte) ((b10 >> 1) & 15)));
        this.mbz = (b10 & 1) == 0 ? false : true;
    }

    private IpV4Rfc1349Tos(Builder builder) {
        if (builder != null && builder.precedence != null && builder.tos != null) {
            this.precedence = builder.precedence;
            this.tos = builder.tos;
            this.mbz = builder.mbz;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.precedence: " + builder.precedence + " builder.tos: " + builder.tos);
    }

    public static IpV4Rfc1349Tos newInstance(byte b10) {
        return new IpV4Rfc1349Tos(b10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV4Rfc1349Tos.class.isInstance(obj)) {
            return false;
        }
        if (((IpV4Rfc1349Tos) IpV4Rfc1349Tos.class.cast(obj)).value() != value()) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4TosPrecedence getPrecedence() {
        return this.precedence;
    }

    public IpV4TosTos getTos() {
        return this.tos;
    }

    public int hashCode() {
        return value();
    }

    public boolean mbz() {
        return this.mbz;
    }

    public String toString() {
        return "[precedence: " + this.precedence + "] [tos: " + this.tos + "] [mbz: " + (this.mbz ? 1 : 0) + "]";
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Tos
    public byte value() {
        byte byteValue = (byte) (((byte) (this.precedence.value().byteValue() << 5)) | (this.tos.value().byteValue() << 1));
        byte b10 = byteValue;
        if (this.mbz) {
            b10 = (byte) (byteValue | 1);
        }
        return b10;
    }
}
