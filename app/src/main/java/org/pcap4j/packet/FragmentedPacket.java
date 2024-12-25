package org.pcap4j.packet;

import org.pcap4j.packet.SimplePacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/FragmentedPacket.class */
public final class FragmentedPacket extends SimplePacket {
    private static final long serialVersionUID = 8065880017691703511L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/FragmentedPacket$Builder.class */
    public static final class Builder extends SimplePacket.Builder {
        public Builder() {
        }

        private Builder(FragmentedPacket fragmentedPacket) {
            super(fragmentedPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public FragmentedPacket build() {
            return new FragmentedPacket(this);
        }

        public Builder rawData(byte[] bArr) {
            setRawData(bArr);
            return this;
        }
    }

    private FragmentedPacket(Builder builder) {
        super(builder);
    }

    private FragmentedPacket(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public static FragmentedPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new FragmentedPacket(bArr, i10, i11);
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
        return "Fragmented ";
    }
}
