package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SimplePacket.class */
abstract class SimplePacket extends AbstractPacket {
    private static final long serialVersionUID = -1565433651791063490L;
    private final byte[] rawData;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SimplePacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] rawData;

        public Builder() {
        }

        public Builder(SimplePacket simplePacket) {
            this.rawData = simplePacket.rawData;
        }

        public void setRawData(byte[] bArr) {
            this.rawData = bArr;
        }
    }

    public SimplePacket(Builder builder) {
        if (builder != null && builder.rawData != null) {
            byte[] bArr = new byte[builder.rawData.length];
            this.rawData = bArr;
            System.arraycopy(builder.rawData, 0, bArr, 0, builder.rawData.length);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.rawData: " + builder.rawData);
        }
    }

    public SimplePacket(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.rawData = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append("[");
        sb2.append(modifier());
        sb2.append("data (");
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
        if (getClass().isInstance(obj)) {
            return Arrays.equals(this.rawData, ((SimplePacket) obj).rawData);
        }
        return false;
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

    public abstract String modifier();
}
