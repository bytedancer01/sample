package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpSackOption.class */
public final class TcpSackOption implements TcpPacket.TcpOption {
    private static final long serialVersionUID = -3308738405807657257L;
    private final TcpOptionKind kind;
    private final byte length;
    private final List<Sack> sacks;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpSackOption$Builder.class */
    public static final class Builder implements LengthBuilder<TcpSackOption> {
        private boolean correctLengthAtBuild;
        private byte length;
        private List<Sack> sacks;

        public Builder() {
        }

        private Builder(TcpSackOption tcpSackOption) {
            this.length = tcpSackOption.length;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public TcpSackOption build() {
            return new TcpSackOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpSackOption> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder length(byte b10) {
            this.length = b10;
            return this;
        }

        public Builder sacks(List<Sack> list) {
            this.sacks = list;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpSackOption$Sack.class */
    public static final class Sack implements Serializable {
        private static final long serialVersionUID = 1218420566089129438L;
        private final int leftEdge;
        private final int rightEdge;

        public Sack(int i10, int i11) {
            this.leftEdge = i10;
            this.rightEdge = i11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!Sack.class.isInstance(obj)) {
                return false;
            }
            Sack sack = (Sack) obj;
            if (this.leftEdge != sack.leftEdge || this.rightEdge != sack.rightEdge) {
                z10 = false;
            }
            return z10;
        }

        public int getLeftEdge() {
            return this.leftEdge;
        }

        public long getLeftEdgeAsLong() {
            return this.leftEdge & 4294967295L;
        }

        public int getRightEdge() {
            return this.rightEdge;
        }

        public long getRightEdgeAsLong() {
            return this.rightEdge & 4294967295L;
        }

        public int hashCode() {
            return ((527 + this.leftEdge) * 31) + this.rightEdge;
        }
    }

    private TcpSackOption(Builder builder) {
        this.kind = TcpOptionKind.SACK;
        ArrayList arrayList = new ArrayList();
        this.sacks = arrayList;
        if (builder != null && builder.sacks != null) {
            arrayList.addAll(builder.sacks);
            this.length = builder.correctLengthAtBuild ? (byte) length() : builder.length;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.sacks: " + builder.sacks);
    }

    private TcpSackOption(byte[] bArr, int i10, int i11) {
        TcpOptionKind tcpOptionKind = TcpOptionKind.SACK;
        this.kind = tcpOptionKind;
        this.sacks = new ArrayList();
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
        if (bArr[i10] != tcpOptionKind.value().byteValue()) {
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
        this.length = bArr[i10 + 1];
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 2) {
            throw new IllegalRawDataException("The value of length field must be  more than 1 but: " + lengthAsInt);
        }
        if ((lengthAsInt - 2) % 8 != 0) {
            StringBuilder sb4 = new StringBuilder(100);
            sb4.append("The value of length field must be an integer multiple of 8 octets long but: ");
            sb4.append(lengthAsInt);
            throw new IllegalRawDataException(sb4.toString());
        }
        if (i11 >= lengthAsInt) {
            for (int i12 = 2; i12 < lengthAsInt; i12 += 8) {
                this.sacks.add(new Sack(ByteArrays.getInt(bArr, i12 + i10), ByteArrays.getInt(bArr, i12 + 4 + i10)));
            }
            return;
        }
        StringBuilder sb5 = new StringBuilder(100);
        sb5.append("rawData is too short. length field: ");
        sb5.append(lengthAsInt);
        sb5.append(", rawData: ");
        sb5.append(ByteArrays.toHexString(bArr, " "));
        sb5.append(", offset: ");
        sb5.append(i10);
        sb5.append(", length: ");
        sb5.append(i11);
        throw new IllegalRawDataException(sb5.toString());
    }

    public static TcpSackOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new TcpSackOption(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!TcpSackOption.class.isInstance(obj)) {
            return false;
        }
        TcpSackOption tcpSackOption = (TcpSackOption) obj;
        if (this.length != tcpSackOption.length || !this.sacks.equals(tcpSackOption.sacks)) {
            z10 = false;
        }
        return z10;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public TcpOptionKind getKind() {
        return this.kind;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = this.kind.value().byteValue();
        bArr[1] = this.length;
        int i10 = 2;
        for (Sack sack : this.sacks) {
            System.arraycopy(ByteArrays.toByteArray(sack.leftEdge), 0, bArr, i10, 4);
            System.arraycopy(ByteArrays.toByteArray(sack.rightEdge), 0, bArr, i10 + 4, 4);
            i10 += 8;
        }
        return bArr;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.sacks.hashCode();
    }

    @Override // org.pcap4j.packet.TcpPacket.TcpOption
    public int length() {
        return (this.sacks.size() * 4 * 2) + 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Kind: ");
        sb2.append(this.kind);
        sb2.append("] [Length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes]");
        for (Sack sack : this.sacks) {
            sb2.append(" [LE: ");
            sb2.append(sack.getLeftEdgeAsLong());
            sb2.append(" RE: ");
            sb2.append(sack.getRightEdgeAsLong());
            sb2.append("]");
        }
        return sb2.toString();
    }
}
