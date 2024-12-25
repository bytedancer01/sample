package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpV4InternetTimestampOptionFlag;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOption.class */
public final class IpV4InternetTimestampOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = -7218329498227977405L;
    private final IpV4InternetTimestampOptionData data;
    private final IpV4InternetTimestampOptionFlag flag;
    private final byte length;
    private final byte overflow;
    private final byte pointer;
    private final IpV4OptionType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOption$Builder.class */
    public static final class Builder implements LengthBuilder<IpV4InternetTimestampOption> {
        private boolean correctLengthAtBuild;
        private IpV4InternetTimestampOptionData data;
        private IpV4InternetTimestampOptionFlag flag;
        private byte length;
        private byte overflow;
        private byte pointer;

        public Builder() {
        }

        private Builder(IpV4InternetTimestampOption ipV4InternetTimestampOption) {
            this.length = ipV4InternetTimestampOption.length;
            this.pointer = ipV4InternetTimestampOption.pointer;
            this.overflow = ipV4InternetTimestampOption.overflow;
            this.flag = ipV4InternetTimestampOption.flag;
            this.data = ipV4InternetTimestampOption.data;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV4InternetTimestampOption build() {
            return new IpV4InternetTimestampOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV4InternetTimestampOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder data(IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData) {
            this.data = ipV4InternetTimestampOptionData;
            return this;
        }

        public Builder flag(IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
            this.flag = ipV4InternetTimestampOptionFlag;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder overflow(byte b10) {
            this.overflow = b10;
            return this;
        }

        public Builder pointer(byte b10) {
            this.pointer = b10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4InternetTimestampOption$IpV4InternetTimestampOptionData.class */
    public interface IpV4InternetTimestampOptionData extends Serializable {
        byte[] getRawData();

        int length();
    }

    private IpV4InternetTimestampOption(Builder builder) {
        this.type = IpV4OptionType.INTERNET_TIMESTAMP;
        if (builder == null || builder.flag == null) {
            throw new NullPointerException("builder: " + builder + " builder.flag: " + builder.flag);
        }
        this.pointer = builder.pointer;
        this.overflow = builder.overflow;
        this.flag = builder.flag;
        this.data = builder.data;
        this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
    }

    private IpV4InternetTimestampOption(byte[] bArr, int i10, int i11) {
        this.type = IpV4OptionType.INTERNET_TIMESTAMP;
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
        if (bArr[i10] != getType().value().byteValue()) {
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
        this.length = bArr[i10 + 1];
        int lengthAsInt = getLengthAsInt();
        if (i11 < lengthAsInt) {
            StringBuilder sb4 = new StringBuilder(100);
            sb4.append("The raw data is too short to build this option(");
            sb4.append(getLengthAsInt());
            sb4.append("). data: ");
            sb4.append(ByteArrays.toHexString(bArr, " "));
            sb4.append(", offset: ");
            sb4.append(i10);
            sb4.append(", length: ");
            sb4.append(i11);
            throw new IllegalRawDataException(sb4.toString());
        }
        if (lengthAsInt < 4) {
            StringBuilder sb5 = new StringBuilder(100);
            sb5.append("The length field value must be equal or more than 4 but it is: ");
            sb5.append(lengthAsInt);
            throw new IllegalRawDataException(sb5.toString());
        }
        if (lengthAsInt % 4 != 0) {
            throw new IllegalRawDataException("Invalid length for this option: " + lengthAsInt);
        }
        this.pointer = bArr[i10 + 2];
        byte b10 = bArr[i10 + 3];
        this.overflow = (byte) ((b10 & 240) >> 4);
        IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag = IpV4InternetTimestampOptionFlag.getInstance(Byte.valueOf((byte) (b10 & 15)));
        this.flag = ipV4InternetTimestampOptionFlag;
        this.data = lengthAsInt > 4 ? (IpV4InternetTimestampOptionData) PacketFactories.getFactory(IpV4InternetTimestampOptionData.class, IpV4InternetTimestampOptionFlag.class).newInstance(bArr, i10 + 4, lengthAsInt - 4, ipV4InternetTimestampOptionFlag) : null;
    }

    public static IpV4InternetTimestampOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4InternetTimestampOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV4InternetTimestampOption.class.isInstance(obj)) {
            return false;
        }
        IpV4InternetTimestampOption ipV4InternetTimestampOption = (IpV4InternetTimestampOption) obj;
        if (this.length != ipV4InternetTimestampOption.length || this.pointer != ipV4InternetTimestampOption.pointer || this.overflow != ipV4InternetTimestampOption.overflow || !this.flag.equals(ipV4InternetTimestampOption.flag)) {
            return false;
        }
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData2 = ipV4InternetTimestampOption.data;
        if (ipV4InternetTimestampOptionData != null) {
            return ipV4InternetTimestampOptionData.equals(ipV4InternetTimestampOptionData2);
        }
        if (ipV4InternetTimestampOptionData2 != null) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public IpV4InternetTimestampOptionData getData() {
        return this.data;
    }

    public IpV4InternetTimestampOptionFlag getFlag() {
        return this.flag;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    public byte getOverflow() {
        return this.overflow;
    }

    public int getOverflowAsInt() {
        return this.overflow & 255;
    }

    public byte getPointer() {
        return this.pointer;
    }

    public int getPointerAsInt() {
        return this.pointer & 255;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        bArr[2] = this.pointer;
        byte byteValue = this.flag.value().byteValue();
        bArr[3] = byteValue;
        bArr[3] = (byte) (byteValue | (this.overflow << 4));
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        if (ipV4InternetTimestampOptionData != null) {
            System.arraycopy(ipV4InternetTimestampOptionData.getRawData(), 0, bArr, 4, this.data.length());
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((527 + this.length) * 31) + this.pointer) * 31) + this.overflow) * 31) + this.flag.hashCode();
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        int i10 = hashCode;
        if (ipV4InternetTimestampOptionData != null) {
            i10 = (hashCode * 31) + ipV4InternetTimestampOptionData.hashCode();
        }
        return i10;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        IpV4InternetTimestampOptionData ipV4InternetTimestampOptionData = this.data;
        return (ipV4InternetTimestampOptionData != null ? ipV4InternetTimestampOptionData.length() : 0) + 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[option-type: ");
        sb2.append(getType());
        sb2.append("] [option-length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes] [pointer: ");
        sb2.append(getPointerAsInt());
        sb2.append("] [overflow: ");
        sb2.append(getOverflowAsInt());
        sb2.append("] [flag: ");
        sb2.append(this.flag);
        sb2.append("]");
        if (this.data != null) {
            sb2.append(" [data: ");
            sb2.append(this.data);
            sb2.append("]");
        }
        return sb2.toString();
    }
}
