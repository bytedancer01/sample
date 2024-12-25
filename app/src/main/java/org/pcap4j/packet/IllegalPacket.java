package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalPacket.class */
public final class IllegalPacket extends AbstractPacket {
    private static final long serialVersionUID = -8028013257441150031L;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IllegalPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] rawData;

        public Builder() {
            this.rawData = new byte[0];
        }

        private Builder(IllegalPacket illegalPacket) {
            this.rawData = new byte[0];
            this.rawData = illegalPacket.rawData;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IllegalPacket build() {
            return new IllegalPacket(this);
        }

        public Builder rawData(byte[] bArr) {
            this.rawData = bArr;
            return this;
        }
    }

    private IllegalPacket(Builder builder) {
        if (builder == null || builder.rawData == null) {
            throw null;
        }
        byte[] bArr = new byte[builder.rawData.length];
        this.rawData = bArr;
        System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
    }

    private IllegalPacket(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static IllegalPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IllegalPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append("[Illegal Packet (");
        sb2.append(length());
        sb2.append(" bytes)]");
        sb2.append(property);
        sb2.append("  Hex stream: ");
        sb2.append(ByteArrays.toHexString(this.rawData, " "));
        sb2.append(property);
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return Arrays.hashCode(this.rawData);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (IllegalPacket.class.isInstance(obj)) {
            return Arrays.equals(this.rawData, ((IllegalPacket) obj).rawData);
        }
        return false;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public byte[] getRawData() {
        byte[] bArr = this.rawData;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public int length() {
        return this.rawData.length;
    }
}
