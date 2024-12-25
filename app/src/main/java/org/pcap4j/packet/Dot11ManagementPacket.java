package org.pcap4j.packet;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ManagementPacket.class */
public abstract class Dot11ManagementPacket extends AbstractPacket {
    private static final long serialVersionUID = -3972573868672848666L;
    private final Integer fcs;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ManagementPacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<Dot11ManagementPacket> {
        private MacAddress address1;
        private MacAddress address2;
        private MacAddress address3;
        private boolean correctChecksumAtBuild;
        private short duration;
        private Integer fcs;
        private Dot11FrameControl frameControl;
        private Dot11HtControl htControl;
        private Dot11SequenceControl sequenceControl;

        public Builder() {
        }

        public Builder(Dot11ManagementPacket dot11ManagementPacket) {
            this.frameControl = dot11ManagementPacket.getHeader().frameControl;
            this.duration = dot11ManagementPacket.getHeader().duration;
            this.address1 = dot11ManagementPacket.getHeader().address1;
            this.address2 = dot11ManagementPacket.getHeader().address2;
            this.address3 = dot11ManagementPacket.getHeader().address3;
            this.sequenceControl = dot11ManagementPacket.getHeader().sequenceControl;
            this.htControl = dot11ManagementPacket.getHeader().htControl;
            this.fcs = dot11ManagementPacket.fcs;
        }

        public Builder address1(MacAddress macAddress) {
            this.address1 = macAddress;
            return this;
        }

        public Builder address2(MacAddress macAddress) {
            this.address2 = macAddress;
            return this;
        }

        public Builder address3(MacAddress macAddress) {
            this.address3 = macAddress;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public abstract Dot11ManagementPacket build();

        public void checkForNull() {
            if (this.frameControl == null || this.address1 == null || this.address2 == null || this.address3 == null) {
                throw new NullPointerException("frameControl: " + this.frameControl + " address1: " + this.address1 + " address2: " + this.address2 + " address3: " + this.address3);
            }
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<Dot11ManagementPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        public Builder duration(short s10) {
            this.duration = s10;
            return this;
        }

        public Builder fcs(Integer num) {
            this.fcs = num;
            return this;
        }

        public Builder frameControl(Dot11FrameControl dot11FrameControl) {
            this.frameControl = dot11FrameControl;
            return this;
        }

        public Builder htControl(Dot11HtControl dot11HtControl) {
            this.htControl = dot11HtControl;
            return this;
        }

        public Builder sequenceControl(Dot11SequenceControl dot11SequenceControl) {
            this.sequenceControl = dot11SequenceControl;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ManagementPacket$Dot11ManagementHeader.class */
    public static abstract class Dot11ManagementHeader extends AbstractPacket.AbstractHeader {
        private static final int ADDRESS1_OFFSET = 4;
        private static final int ADDRESS1_SIZE = 6;
        private static final int ADDRESS2_OFFSET = 10;
        private static final int ADDRESS2_SIZE = 6;
        private static final int ADDRESS3_OFFSET = 16;
        private static final int ADDRESS3_SIZE = 6;
        private static final int DOT11_HEADER_MIN_SIZE = 24;
        private static final int DURATION_OFFSET = 2;
        private static final int DURATION_SIZE = 2;
        private static final int FRAME_CONTROL_OFFSET = 0;
        private static final int FRAME_CONTROL_SIZE = 2;
        private static final int HT_CONTROL_OFFSET = 24;
        private static final int HT_CONTROL_SIZE = 4;
        private static final int SEQUENCE_CONTROL_OFFSET = 22;
        private static final int SEQUENCE_CONTROL_SIZE = 2;
        private static final long serialVersionUID = 615170086003609919L;
        private final MacAddress address1;
        private final MacAddress address2;
        private final MacAddress address3;
        private final short duration;
        private final Dot11FrameControl frameControl;
        private final Dot11HtControl htControl;
        private final Dot11SequenceControl sequenceControl;

        public Dot11ManagementHeader(Builder builder) {
            this.frameControl = builder.frameControl;
            this.duration = builder.duration;
            this.address1 = builder.address1;
            this.address2 = builder.address2;
            this.address3 = builder.address3;
            this.sequenceControl = builder.sequenceControl;
            this.htControl = builder.htControl;
        }

        public Dot11ManagementHeader(byte[] bArr, int i10, int i11) {
            Dot11HtControl dot11HtControl;
            if (i11 < 24) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build a Dot11ManagementHeader (");
                sb2.append(24);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            Dot11FrameControl newInstance = Dot11FrameControl.newInstance(bArr, i10 + 0, i11);
            this.frameControl = newInstance;
            this.duration = ByteArrays.getShort(bArr, i10 + 2, ByteOrder.LITTLE_ENDIAN);
            this.address1 = ByteArrays.getMacAddress(bArr, i10 + 4);
            this.address2 = ByteArrays.getMacAddress(bArr, i10 + 10);
            this.address3 = ByteArrays.getMacAddress(bArr, i10 + 16);
            this.sequenceControl = Dot11SequenceControl.newInstance(bArr, i10 + 22, i11 - 22);
            if (!newInstance.isOrder()) {
                dot11HtControl = null;
            } else {
                if (i11 < 28) {
                    StringBuilder sb3 = new StringBuilder(200);
                    sb3.append("The data is too short to build a Dot11ManagementHeader (");
                    sb3.append(28);
                    sb3.append(" bytes). data: ");
                    sb3.append(ByteArrays.toHexString(bArr, " "));
                    sb3.append(", offset: ");
                    sb3.append(i10);
                    sb3.append(", length: ");
                    sb3.append(i11);
                    throw new IllegalRawDataException(sb3.toString());
                }
                dot11HtControl = Dot11HtControl.newInstance(bArr, i10 + 24, i11 - 24);
            }
            this.htControl = dot11HtControl;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[");
            sb2.append(getHeaderName());
            sb2.append(" (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Frame Control:");
            sb2.append(property);
            sb2.append(this.frameControl.toString("    "));
            sb2.append("  Duration: ");
            sb2.append(getDurationAsInt());
            sb2.append(property);
            sb2.append("  Address1: ");
            sb2.append(this.address1);
            sb2.append(property);
            sb2.append("  Address2: ");
            sb2.append(this.address2);
            sb2.append(property);
            sb2.append("  Address3: ");
            sb2.append(this.address3);
            sb2.append(property);
            sb2.append("  Sequence Control: ");
            sb2.append(this.sequenceControl);
            sb2.append(property);
            if (this.htControl != null) {
                sb2.append("  HT Control:");
                sb2.append(property);
                sb2.append(this.htControl.toString("    "));
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int hashCode = this.address1.hashCode();
            int hashCode2 = this.address2.hashCode();
            int hashCode3 = this.address3.hashCode();
            short s10 = this.duration;
            int hashCode4 = this.frameControl.hashCode();
            Dot11HtControl dot11HtControl = this.htControl;
            return ((((((((((((527 + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + s10) * 31) + hashCode4) * 31) + (dot11HtControl != null ? dot11HtControl.hashCode() : 0)) * 31) + this.sequenceControl.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return this.htControl != null ? 28 : 24;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Dot11ManagementHeader dot11ManagementHeader = (Dot11ManagementHeader) obj;
            if (!this.address1.equals(dot11ManagementHeader.address1) || !this.address2.equals(dot11ManagementHeader.address2) || !this.address3.equals(dot11ManagementHeader.address3) || this.duration != dot11ManagementHeader.duration || !this.frameControl.equals(dot11ManagementHeader.frameControl)) {
                return false;
            }
            Dot11HtControl dot11HtControl = this.htControl;
            if (dot11HtControl == null) {
                if (dot11ManagementHeader.htControl != null) {
                    return false;
                }
            } else if (!dot11HtControl.equals(dot11ManagementHeader.htControl)) {
                return false;
            }
            return this.sequenceControl.equals(dot11ManagementHeader.sequenceControl);
        }

        public MacAddress getAddress1() {
            return this.address1;
        }

        public MacAddress getAddress2() {
            return this.address2;
        }

        public MacAddress getAddress3() {
            return this.address3;
        }

        public short getDuration() {
            return this.duration;
        }

        public int getDurationAsInt() {
            return this.duration & 65535;
        }

        public Dot11FrameControl getFrameControl() {
            return this.frameControl;
        }

        public abstract String getHeaderName();

        public Dot11HtControl getHtControl() {
            return this.htControl;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.frameControl.getRawData());
            arrayList.add(ByteArrays.toByteArray(this.duration, ByteOrder.LITTLE_ENDIAN));
            arrayList.add(this.address1.getAddress());
            arrayList.add(this.address2.getAddress());
            arrayList.add(this.address3.getAddress());
            arrayList.add(this.sequenceControl.getRawData());
            Dot11HtControl dot11HtControl = this.htControl;
            if (dot11HtControl != null) {
                arrayList.add(dot11HtControl.getRawData());
            }
            return arrayList;
        }

        public Dot11SequenceControl getSequenceControl() {
            return this.sequenceControl;
        }
    }

    public Dot11ManagementPacket(Builder builder, Dot11ManagementHeader dot11ManagementHeader) {
        this.fcs = builder.correctChecksumAtBuild ? Integer.valueOf(ByteArrays.calcCrc32Checksum(dot11ManagementHeader.getRawData())) : builder.fcs;
    }

    public Dot11ManagementPacket(byte[] bArr, int i10, int i11, int i12) {
        this.fcs = i11 - i12 >= 4 ? Integer.valueOf(ByteArrays.getInt(bArr, i10 + i12, ByteOrder.LITTLE_ENDIAN)) : null;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] buildRawData = super.buildRawData();
        Integer num = this.fcs;
        if (num != null) {
            System.arraycopy(ByteArrays.toByteArray(num.intValue(), ByteOrder.LITTLE_ENDIAN), 0, buildRawData, buildRawData.length - 4, 4);
        }
        return buildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getHeader().toString());
        if (this.fcs != null) {
            String property = System.getProperty("line.separator");
            sb2.append("[IEEE802.11 Management Packet FCS]");
            sb2.append(property);
            sb2.append("  FCS: 0x");
            sb2.append(ByteArrays.toHexString(this.fcs.intValue(), ""));
            sb2.append(property);
        }
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        int calcLength = super.calcLength();
        int i10 = calcLength;
        if (this.fcs != null) {
            i10 = calcLength + 4;
        }
        return i10;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract Builder getBuilder();

    public Integer getFcs() {
        return this.fcs;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract Dot11ManagementHeader getHeader();

    public boolean hasValidFcs() {
        boolean z10 = false;
        if (this.fcs == null) {
            return false;
        }
        if (ByteArrays.calcCrc32Checksum(getHeader().getRawData()) == this.fcs.intValue()) {
            z10 = true;
        }
        return z10;
    }
}
