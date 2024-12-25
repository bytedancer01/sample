package org.pcap4j.packet;

import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpEndOfOptionList.class */
public final class TcpEndOfOptionList implements TcpPacket.TcpOption {
    private static final TcpEndOfOptionList INSTANCE = new TcpEndOfOptionList();
    private static final TcpOptionKind kind = TcpOptionKind.END_OF_OPTION_LIST;
    private static final long serialVersionUID = -4181756738827638374L;

    private TcpEndOfOptionList() {
    }

    public static TcpEndOfOptionList getInstance() {
        return INSTANCE;
    }

    public static TcpEndOfOptionList newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        byte b10 = bArr[i10];
        TcpOptionKind tcpOptionKind = kind;
        if (b10 == tcpOptionKind.value().byteValue()) {
            return INSTANCE;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("The kind must be: ");
        sb2.append(tcpOptionKind.valueAsString());
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

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return kind;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        return new byte[1];
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 1;
    }

    public String toString() {
        return "[Kind: " + kind + "]";
    }
}
