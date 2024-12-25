package org.pcap4j.packet;

import org.pcap4j.packet.SimplePacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/EncryptedPacket.class */
public final class EncryptedPacket extends SimplePacket {
    private static final long serialVersionUID = 1942694224438957128L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/EncryptedPacket$Builder.class */
    public static final class Builder extends SimplePacket.Builder {
        public Builder() {
        }

        private Builder(EncryptedPacket encryptedPacket) {
            super(encryptedPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public EncryptedPacket build() {
            return new EncryptedPacket(this);
        }

        public Builder rawData(byte[] bArr) {
            setRawData(bArr);
            return this;
        }
    }

    private EncryptedPacket(Builder builder) {
        super(builder);
    }

    private EncryptedPacket(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public static EncryptedPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new EncryptedPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ byte[] getRawData() {
        return super.getRawData();
    }

    @Override // org.pcap4j.packet.SimplePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ int length() {
        return super.length();
    }

    @Override // org.pcap4j.packet.SimplePacket
    public String modifier() {
        return "Encrypted ";
    }
}
