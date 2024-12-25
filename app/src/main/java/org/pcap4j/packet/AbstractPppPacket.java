package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPppPacket.class */
abstract class AbstractPppPacket extends AbstractPacket {
    private static final long serialVersionUID = 9184646119975504414L;
    private final byte[] pad;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPppPacket$AbstractPppHeader.class */
    public static abstract class AbstractPppHeader extends AbstractPacket.AbstractHeader {
        public static final int PPP_HEADER_SIZE = 2;
        private static final int PROTOCOL_OFFSET = 0;
        private static final int PROTOCOL_SIZE = 2;
        private static final long serialVersionUID = -9126636226651383452L;
        private final PppDllProtocol protocol;

        public AbstractPppHeader(Builder builder) {
            this.protocol = builder.protocol;
        }

        public AbstractPppHeader(byte[] bArr, int i10, int i11) {
            if (i11 < 2) {
                this.protocol = null;
                return;
            }
            try {
                this.protocol = PppDllProtocol.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
            } catch (IllegalArgumentException e10) {
                throw new IllegalRawDataException(e10);
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[PPP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Protocol: ");
            sb2.append(this.protocol);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.protocol.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (getClass().isInstance(obj)) {
                return this.protocol.equals(((AbstractPppHeader) obj).protocol);
            }
            return false;
        }

        public PppDllProtocol getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 2;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/AbstractPppPacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] pad;
        private Packet.Builder payloadBuilder;
        private PppDllProtocol protocol;

        public Builder() {
        }

        public Builder(AbstractPppPacket abstractPppPacket) {
            this.protocol = abstractPppPacket.getHeader().protocol;
            this.payloadBuilder = abstractPppPacket.payload != null ? abstractPppPacket.payload.getBuilder() : null;
            this.pad = abstractPppPacket.pad;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder protocol(PppDllProtocol pppDllProtocol) {
            this.protocol = pppDllProtocol;
            return this;
        }
    }

    public AbstractPppPacket(Builder builder) {
        if (builder == null || builder.protocol == null) {
            throw new NullPointerException("builder: " + builder + " builder.protocol: " + builder.protocol);
        }
        this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        if (builder.pad == null || builder.pad.length == 0) {
            this.pad = new byte[0];
            return;
        }
        byte[] bArr = new byte[builder.pad.length];
        this.pad = bArr;
        System.arraycopy(builder.pad, 0, bArr, 0, builder.pad.length);
    }

    public AbstractPppPacket(byte[] bArr, int i10, int i11, AbstractPppHeader abstractPppHeader) {
        int length = i11 - abstractPppHeader.length();
        if (length <= 0) {
            this.payload = null;
            this.pad = new byte[0];
            return;
        }
        int length2 = i10 + abstractPppHeader.length();
        Packet packet = (Packet) PacketFactories.getFactory(Packet.class, PppDllProtocol.class).newInstance(bArr, length2, length, abstractPppHeader.getProtocol());
        this.payload = packet;
        int length3 = length - packet.length();
        if (length3 > 0) {
            this.pad = ByteArrays.getSubArray(bArr, length2 + packet.length(), length3);
        } else {
            this.pad = new byte[0];
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] buildRawData = super.buildRawData();
        byte[] bArr = this.pad;
        if (bArr.length != 0) {
            System.arraycopy(bArr, 0, buildRawData, buildRawData.length - bArr.length, bArr.length);
        }
        return buildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getHeader().toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb2.append(packet.toString());
        }
        if (this.pad.length != 0) {
            String property = System.getProperty("line.separator");
            sb2.append("[PPP Pad (");
            sb2.append(this.pad.length);
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Hex stream: ");
            sb2.append(ByteArrays.toHexString(this.pad, " "));
            sb2.append(property);
        }
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return (super.calcHashCode() * 31) + Arrays.hashCode(this.pad);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        return super.calcLength() + this.pad.length;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Arrays.equals(this.pad, ((AbstractPppPacket) obj).pad);
        }
        return false;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract AbstractPppHeader getHeader();

    public byte[] getPad() {
        byte[] bArr = this.pad;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
