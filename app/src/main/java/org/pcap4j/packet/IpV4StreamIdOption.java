package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4StreamIdOption.class */
public final class IpV4StreamIdOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -2067863811913941432L;
    private final byte length;
    private final short streamId;
    private final IpV4OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4StreamIdOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV4StreamIdOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private short streamId;

        public Builder() {
        }

        private Builder(IpV4StreamIdOption ipV4StreamIdOption) {
            this.length = ipV4StreamIdOption.length;
            this.streamId = ipV4StreamIdOption.streamId;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4StreamIdOption build() {
            return new IpV4StreamIdOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4StreamIdOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder streamId(short s10) {
            this.streamId = s10;
            return this;
        }
    }

    private IpV4StreamIdOption(Builder builder) {
        this.type = IpV4OptionType.STREAM_ID;
        if (builder != null) {
            this.streamId = builder.streamId;
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }

    private IpV4StreamIdOption(byte[] bArr, int i10, int i11) {
        this.type = IpV4OptionType.STREAM_ID;
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 3. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        if (bArr[i10 + 0] == getType().value().byteValue()) {
            int i12 = i10 + 1;
            byte b10 = bArr[i12];
            if (b10 == 4) {
                this.length = b10;
                this.streamId = ByteArrays.getShort(bArr, i10 + 2);
                return;
            } else {
                throw new IllegalRawDataException("Invalid value of length field: " + ((int) bArr[i12]));
            }
        }
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

    public static IpV4StreamIdOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4StreamIdOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV4StreamIdOption.class.isInstance(obj)) {
            return false;
        }
        IpV4StreamIdOption ipV4StreamIdOption = (IpV4StreamIdOption) obj;
        if (this.streamId != ipV4StreamIdOption.streamId || this.length != ipV4StreamIdOption.length) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
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
        short s10 = this.streamId;
        bArr[2] = (byte) (s10 >> 8);
        bArr[3] = (byte) s10;
        return bArr;
    }

    public short getStreamId() {
        return this.streamId;
    }

    public int getStreamIdAsInt() {
        return this.streamId & 65535;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.streamId;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 4;
    }

    public String toString() {
        return "[option-type: " + getType() + "] [option-length: " + getLengthAsInt() + " bytes] [streamId: " + getStreamIdAsInt() + "]";
    }
}
