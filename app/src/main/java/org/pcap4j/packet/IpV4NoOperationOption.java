package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4NoOperationOption.class */
public final class IpV4NoOperationOption implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = 194338954674452009L;
    private static final IpV4NoOperationOption INSTANCE = new IpV4NoOperationOption();
    private static final IpV4OptionType type = IpV4OptionType.NO_OPERATION;

    private IpV4NoOperationOption() {
    }

    public static IpV4NoOperationOption getInstance() {
        return INSTANCE;
    }

    public static IpV4NoOperationOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        byte b10 = bArr[i10];
        IpV4OptionType ipV4OptionType = type;
        if (b10 == ipV4OptionType.value().byteValue()) {
            return getInstance();
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("The type must be: ");
        sb2.append(ipV4OptionType.valueAsString());
        sb2.append(" rawData: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalRawDataException(sb2.toString());
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public byte[] getRawData() {
        return new byte[]{1};
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return type;
    }

    @Override // org.pcap4j.packet.IpV4Packet.IpV4Option
    public int length() {
        return 1;
    }

    public String toString() {
        return "[option-type: " + type + "]";
    }
}
