package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionCompartments;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionHandlingRestrictions;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionSecurity;
import org.pcap4j.packet.namednumber.IpV4SecurityOptionTransmissionControlCode;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc791SecurityOption.class */
public final class IpV4Rfc791SecurityOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -7385398208873489520L;
    private final IpV4SecurityOptionCompartments compartments;
    private final IpV4SecurityOptionHandlingRestrictions handlingRestrictions;
    private final byte length;
    private final IpV4SecurityOptionSecurity security;
    private final IpV4SecurityOptionTransmissionControlCode tcc;
    private final IpV4OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Rfc791SecurityOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV4Rfc791SecurityOption> {
        private IpV4SecurityOptionCompartments compartments;
        private boolean correctLengthAtBuild;
        private IpV4SecurityOptionHandlingRestrictions handlingRestrictions;
        private byte length;
        private IpV4SecurityOptionSecurity security;
        private IpV4SecurityOptionTransmissionControlCode tcc;

        public Builder() {
        }

        private Builder(IpV4Rfc791SecurityOption ipV4Rfc791SecurityOption) {
            this.length = ipV4Rfc791SecurityOption.length;
            this.security = ipV4Rfc791SecurityOption.security;
            this.compartments = ipV4Rfc791SecurityOption.compartments;
            this.handlingRestrictions = ipV4Rfc791SecurityOption.handlingRestrictions;
            this.tcc = ipV4Rfc791SecurityOption.tcc;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4Rfc791SecurityOption build() {
            return new IpV4Rfc791SecurityOption(this);
        }

        public Builder compartments(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
            this.compartments = ipV4SecurityOptionCompartments;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4Rfc791SecurityOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder handlingRestrictions(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
            this.handlingRestrictions = ipV4SecurityOptionHandlingRestrictions;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder security(IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity) {
            this.security = ipV4SecurityOptionSecurity;
            return this;
        }

        public Builder tcc(IpV4SecurityOptionTransmissionControlCode ipV4SecurityOptionTransmissionControlCode) {
            this.tcc = ipV4SecurityOptionTransmissionControlCode;
            return this;
        }
    }

    private IpV4Rfc791SecurityOption(Builder builder) {
        this.type = IpV4OptionType.SECURITY;
        if (builder == null) {
            throw new NullPointerException("builder: " + builder);
        }
        this.security = builder.security;
        this.compartments = builder.compartments;
        this.handlingRestrictions = builder.handlingRestrictions;
        this.tcc = builder.tcc;
        this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
    }

    private IpV4Rfc791SecurityOption(byte[] bArr, int i10, int i11) {
        this.type = IpV4OptionType.SECURITY;
        if (i11 < 11) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 10. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (bArr[i10 + 0] != getType().value().byteValue()) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("The type must be: ");
            sb3.append(getType().valueAsString());
            sb3.append(" rawData: ");
            sb3.append(ByteArrays.toHexString(bArr, " "));
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", length: ");
            sb3.append(i11);
            throw new IllegalRawDataException(sb3.toString());
        }
        int i12 = i10 + 1;
        byte b10 = bArr[i12];
        if (b10 != 11) {
            throw new IllegalRawDataException("Invalid value of length field: " + ((int) bArr[i12]));
        }
        this.length = b10;
        this.security = IpV4SecurityOptionSecurity.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
        this.compartments = IpV4SecurityOptionCompartments.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 4)));
        this.handlingRestrictions = IpV4SecurityOptionHandlingRestrictions.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 6)));
        this.tcc = IpV4SecurityOptionTransmissionControlCode.getInstance(Integer.valueOf(ByteArrays.getInt(bArr, i10 + 7) & 16777215));
    }

    public static IpV4Rfc791SecurityOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4Rfc791SecurityOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV4Rfc791SecurityOption.class.isInstance(obj)) {
            return false;
        }
        IpV4Rfc791SecurityOption ipV4Rfc791SecurityOption = (IpV4Rfc791SecurityOption) obj;
        if (this.length != ipV4Rfc791SecurityOption.length || !this.security.equals(ipV4Rfc791SecurityOption.security) || !this.compartments.equals(ipV4Rfc791SecurityOption.compartments) || !this.handlingRestrictions.equals(ipV4Rfc791SecurityOption.handlingRestrictions) || !this.tcc.equals(ipV4Rfc791SecurityOption.tcc)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4SecurityOptionCompartments getCompartments() {
        return this.compartments;
    }

    public IpV4SecurityOptionHandlingRestrictions getHandlingRestrictions() {
        return this.handlingRestrictions;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = (byte) (this.security.value().shortValue() >> 8);
        bArr[3] = (byte) this.security.value().shortValue();
        bArr[4] = (byte) (this.compartments.value().shortValue() >> 8);
        bArr[5] = (byte) this.compartments.value().shortValue();
        bArr[6] = (byte) (this.handlingRestrictions.value().shortValue() >> 8);
        bArr[7] = (byte) this.handlingRestrictions.value().shortValue();
        bArr[8] = (byte) (this.tcc.value().intValue() >> 16);
        bArr[9] = (byte) (this.tcc.value().intValue() >> 8);
        bArr[10] = (byte) this.tcc.value().shortValue();
        return bArr;
    }

    public IpV4SecurityOptionSecurity getSecurity() {
        return this.security;
    }

    public IpV4SecurityOptionTransmissionControlCode getTcc() {
        return this.tcc;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((527 + this.length) * 31) + this.security.hashCode()) * 31) + this.compartments.hashCode()) * 31) + this.handlingRestrictions.hashCode()) * 31) + this.tcc.hashCode();
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 11;
    }

    public String toString() {
        return "[option-type: " + getType() + "] [option-length: " + getLengthAsInt() + " byte] [security: " + this.security + "] [compartments: " + this.compartments + "] [handlingRestrictions: " + this.handlingRestrictions + "] [tcc: " + this.tcc + "]";
    }
}
