package org.pcap4j.packet;

import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpSackPermittedOption.class */
public final class TcpSackPermittedOption implements TcpPacket.TcpOption {
    private static final TcpSackPermittedOption INSTANCE = new TcpSackPermittedOption();
    private static final TcpOptionKind kind = TcpOptionKind.SACK_PERMITTED;
    private static final byte length = 2;
    private static final long serialVersionUID = -5364948716212977767L;

    private TcpSackPermittedOption() {
    }

    public static TcpSackPermittedOption getInstance() {
        return INSTANCE;
    }

    public static TcpSackPermittedOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("The raw data length must be more than 1. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        TcpOptionKind tcpOptionKind = kind;
        if (b10 == tcpOptionKind.value().byteValue()) {
            int i12 = i10 + 1;
            if (bArr[i12] == 2) {
                return INSTANCE;
            }
            throw new IllegalRawDataException("The value of length field must be 2 but: " + ((int) bArr[i12]));
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append("The kind must be: ");
        sb3.append(tcpOptionKind.valueAsString());
        sb3.append(" rawData: ");
        sb3.append(ByteArrays.toHexString(bArr, " "));
        sb3.append(", offset: ");
        sb3.append(i10);
        sb3.append(", length: ");
        sb3.append(i11);
        throw new IllegalRawDataException(sb3.toString());
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return kind;
    }

    public byte getLength() {
        return (byte) 2;
    }

    public int getLengthAsInt() {
        return 2;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = kind.value().byteValue();
        bArr[1] = 2;
        return bArr;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return 2;
    }

    public String toString() {
        return "[Kind: " + kind + "] [Length: " + getLengthAsInt() + " bytes]";
    }
}
