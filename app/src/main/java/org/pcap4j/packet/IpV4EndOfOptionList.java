package org.pcap4j.packet;

import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4EndOfOptionList.class */
public final class IpV4EndOfOptionList implements IpV4Packet.IpV4Option {
    private static final long serialVersionUID = 5323215977996813586L;
    private static final IpV4EndOfOptionList INSTANCE = new IpV4EndOfOptionList();
    private static final IpV4OptionType type = IpV4OptionType.END_OF_OPTION_LIST;

    private IpV4EndOfOptionList() {
    }

    public static IpV4EndOfOptionList getInstance() {
        return INSTANCE;
    }

    public static IpV4EndOfOptionList newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        byte b10 = bArr[i10 + 0];
        IpV4OptionType ipV4OptionType = type;
        if (b10 == ipV4OptionType.value().byteValue()) {
            return INSTANCE;
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
        return new byte[1];
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
