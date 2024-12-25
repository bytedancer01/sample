package org.pcap4j.packet;

import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6Pad1Option.class */
public final class IpV6Pad1Option implements IpV6ExtOptionsPacket.IpV6Option {
    private static final long serialVersionUID = 2182260121605325195L;
    private static final IpV6Pad1Option INSTANCE = new IpV6Pad1Option();
    private static final IpV6OptionType type = IpV6OptionType.getInstance((byte) 0);

    private IpV6Pad1Option() {
    }

    public static IpV6Pad1Option getInstance() {
        return INSTANCE;
    }

    public static IpV6Pad1Option newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        byte b10 = bArr[i10];
        IpV6OptionType ipV6OptionType = type;
        if (b10 == ipV6OptionType.value().byteValue()) {
            return INSTANCE;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("The type must be: ");
        sb2.append(ipV6OptionType.valueAsString());
        sb2.append(" rawData: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        throw new IllegalRawDataException(sb2.toString());
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public byte[] getRawData() {
        return new byte[1];
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public IpV6OptionType getType() {
        return type;
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6Option
    public int length() {
        return 1;
    }

    public String toString() {
        return "[Option Type: " + type + "]";
    }
}
