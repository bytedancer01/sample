package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.LlcNumber;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcPacket.class */
public final class LlcPacket extends AbstractPacket {
    private static final long serialVersionUID = -4394376906462242290L;
    private final LlcHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private LlcControl control;
        private LlcNumber dsap;
        private Packet.Builder payloadBuilder;
        private LlcNumber ssap;

        public Builder() {
        }

        private Builder(LlcPacket llcPacket) {
            this.dsap = llcPacket.header.dsap;
            this.ssap = llcPacket.header.ssap;
            this.control = llcPacket.header.control;
            this.payloadBuilder = llcPacket.payload != null ? llcPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public LlcPacket build() {
            return new LlcPacket(this);
        }

        public Builder control(LlcControl llcControl) {
            this.control = llcControl;
            return this;
        }

        public Builder dsap(LlcNumber llcNumber) {
            this.dsap = llcNumber;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder ssap(LlcNumber llcNumber) {
            this.ssap = llcNumber;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcPacket$LlcControl.class */
    public interface LlcControl extends Serializable {
        byte[] getRawData();

        int length();
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LlcPacket$LlcHeader.class */
    public static final class LlcHeader extends AbstractPacket.AbstractHeader {
        private static final int CONTROL_OFFSET = 2;
        private static final int DSAP_OFFSET = 0;
        private static final int DSAP_SIZE = 1;
        private static final int SSAP_OFFSET = 1;
        private static final int SSAP_SIZE = 1;
        private static final long serialVersionUID = -6228127495653535606L;
        private final LlcControl control;
        private final LlcNumber dsap;
        private final LlcNumber ssap;

        private LlcHeader(Builder builder) {
            this.dsap = builder.dsap;
            this.ssap = builder.ssap;
            this.control = builder.control;
        }

        private LlcHeader(byte[] bArr, int i10, int i11) {
            LlcControl newInstance;
            if (i11 < 3) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build an LLC header(");
                sb2.append(3);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.dsap = LlcNumber.getInstance(Byte.valueOf(bArr[i10 + 0]));
            this.ssap = LlcNumber.getInstance(Byte.valueOf(bArr[i10 + 1]));
            int i12 = i10 + 2;
            byte b10 = bArr[i12];
            int i13 = b10 & 3;
            if (i13 == 3) {
                newInstance = LlcControlUnnumbered.newInstance(b10);
            } else {
                if (i11 < 4) {
                    StringBuilder sb3 = new StringBuilder(200);
                    sb3.append("The data is too short to build an LLC header(");
                    sb3.append(4);
                    sb3.append(" bytes). data: ");
                    sb3.append(ByteArrays.toHexString(bArr, " "));
                    sb3.append(", offset: ");
                    sb3.append(i10);
                    sb3.append(", length: ");
                    sb3.append(i11);
                    throw new IllegalRawDataException(sb3.toString());
                }
                short s10 = ByteArrays.getShort(bArr, i12);
                newInstance = i13 == 1 ? LlcControlSupervisory.newInstance(s10) : LlcControlInformation.newInstance(s10);
            }
            this.control = newInstance;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[Logical Link Control header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  DSAP: ");
            sb2.append(this.dsap);
            sb2.append(property);
            sb2.append("  SSAP: ");
            sb2.append(this.ssap);
            sb2.append(property);
            sb2.append("  Control: ");
            sb2.append(this.control);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.dsap.hashCode()) * 31) + this.ssap.hashCode()) * 31) + this.control.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.control.length() + 2;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!LlcHeader.class.isInstance(obj)) {
                return false;
            }
            LlcHeader llcHeader = (LlcHeader) obj;
            if (!this.dsap.equals(llcHeader.dsap) || !this.control.equals(llcHeader.control) || !this.ssap.equals(llcHeader.ssap)) {
                z10 = false;
            }
            return z10;
        }

        public LlcControl getControl() {
            return this.control;
        }

        public LlcNumber getDsap() {
            return this.dsap;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.dsap.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.ssap.value().byteValue()));
            arrayList.add(this.control.getRawData());
            return arrayList;
        }

        public LlcNumber getSsap() {
            return this.ssap;
        }
    }

    private LlcPacket(Builder builder) {
        if (builder != null && builder.dsap != null && builder.ssap != null && builder.control != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new LlcHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.dsap: " + builder.dsap + " builder.ssap: " + builder.ssap + " builder.control: " + builder.control);
    }

    private LlcPacket(byte[] bArr, int i10, int i11) {
        LlcHeader llcHeader = new LlcHeader(bArr, i10, i11);
        this.header = llcHeader;
        int length = i11 - llcHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, LlcNumber.class).newInstance(bArr, i10 + llcHeader.length(), length, llcHeader.getDsap());
        } else {
            this.payload = null;
        }
    }

    public static LlcPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new LlcPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public LlcHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
