package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.GtpV1ExtensionHeaderType;
import org.pcap4j.packet.namednumber.GtpV1MessageType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpV1Packet.class */
public final class GtpV1Packet extends AbstractPacket {
    private static final long serialVersionUID = 4638029542367352625L;
    private final GtpV1Header header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpV1Packet$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<GtpV1Packet> {
        private boolean correctLengthAtBuild;
        private boolean extensionHeaderFlag;
        private short length;
        private GtpV1MessageType messageType;
        private Byte nPduNumber;
        private boolean nPduNumberFlag;
        private GtpV1ExtensionHeaderType nextExtensionHeaderType;
        private Packet.Builder payloadBuilder;
        private ProtocolType protocolType;
        private boolean reserved;
        private Short sequenceNumber;
        private boolean sequenceNumberFlag;
        private int teid;
        private GtpVersion version;

        public Builder() {
        }

        public Builder(GtpV1Packet gtpV1Packet) {
            this.protocolType = gtpV1Packet.header.protocolType;
            this.version = gtpV1Packet.header.version;
            this.reserved = gtpV1Packet.header.reserved;
            this.length = gtpV1Packet.header.length;
            this.messageType = gtpV1Packet.header.messageType;
            this.nPduNumberFlag = gtpV1Packet.header.nPduNumberFlag;
            this.sequenceNumber = gtpV1Packet.header.sequenceNumber;
            this.nPduNumber = gtpV1Packet.header.nPduNumber;
            this.nextExtensionHeaderType = gtpV1Packet.header.nextExtensionHeaderType;
            this.sequenceNumberFlag = gtpV1Packet.header.sequenceNumberFlag;
            this.teid = gtpV1Packet.header.teid;
            this.extensionHeaderFlag = gtpV1Packet.header.extensionHeaderFlag;
            this.payloadBuilder = gtpV1Packet.payload != null ? gtpV1Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public GtpV1Packet build() {
            return new GtpV1Packet(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<GtpV1Packet> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder extensionHeaderFlag(boolean z10) {
            this.extensionHeaderFlag = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder length(short s10) {
            this.length = s10;
            return this;
        }

        public Builder messageType(GtpV1MessageType gtpV1MessageType) {
            this.messageType = gtpV1MessageType;
            return this;
        }

        public Builder nPduNumber(Byte b10) {
            this.nPduNumber = b10;
            return this;
        }

        public Builder nPduNumberFlag(boolean z10) {
            this.nPduNumberFlag = z10;
            return this;
        }

        public Builder nextExtensionHeaderType(GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType) {
            this.nextExtensionHeaderType = gtpV1ExtensionHeaderType;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder protocolType(ProtocolType protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public Builder reserved(boolean z10) {
            this.reserved = z10;
            return this;
        }

        public Builder sequenceNumber(Short sh2) {
            this.sequenceNumber = sh2;
            return this;
        }

        public Builder sequenceNumberFlag(boolean z10) {
            this.sequenceNumberFlag = z10;
            return this;
        }

        public Builder teid(int i10) {
            this.teid = i10;
            return this;
        }

        public Builder version(GtpVersion gtpVersion) {
            this.version = gtpVersion;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpV1Packet$GtpV1Header.class */
    public static final class GtpV1Header extends AbstractPacket.AbstractHeader {
        private static final int FIRST_OCTET_OFFSET = 0;
        private static final int FIRST_OCTET_SIZE = 1;
        private static final int GTP_V1_HEADER_MAX_SIZE = 12;
        private static final int GTP_V1_HEADER_MIM_SIZE = 8;
        private static final int LENGTH_OFFSET = 2;
        private static final int LENGTH_SIZE = 2;
        private static final int MSG_TYPE_OFFSET = 1;
        private static final int MSG_TYPE_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 11;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int NPDU_OFFSET = 10;
        private static final int NPDU_SIZE = 1;
        private static final int SEQ_OFFSET = 8;
        private static final int SEQ_SIZE = 2;
        private static final int TUNNEL_ID_OFFSET = 4;
        private static final int TUNNEL_ID_SIZE = 4;
        private static final long serialVersionUID = -1746545325551976324L;
        private final boolean extensionHeaderFlag;
        private final short length;
        private final GtpV1MessageType messageType;
        private final Byte nPduNumber;
        private final boolean nPduNumberFlag;
        private final GtpV1ExtensionHeaderType nextExtensionHeaderType;
        private final ProtocolType protocolType;
        private final boolean reserved;
        private final Short sequenceNumber;
        private final boolean sequenceNumberFlag;
        private final int teid;
        private final GtpVersion version;

        private GtpV1Header(Builder builder, int i10) {
            short s10;
            this.protocolType = builder.protocolType;
            this.version = builder.version;
            this.reserved = builder.reserved;
            this.messageType = builder.messageType;
            boolean z10 = builder.nPduNumberFlag;
            this.nPduNumberFlag = z10;
            this.sequenceNumber = builder.sequenceNumber;
            this.nPduNumber = builder.nPduNumber;
            this.nextExtensionHeaderType = builder.nextExtensionHeaderType;
            boolean z11 = builder.sequenceNumberFlag;
            this.sequenceNumberFlag = z11;
            this.teid = builder.teid;
            boolean z12 = builder.extensionHeaderFlag;
            this.extensionHeaderFlag = z12;
            if (builder.correctLengthAtBuild) {
                s10 = (short) ((z11 || z10 || z12) ? i10 + 4 : i10);
            } else {
                s10 = builder.length;
            }
            this.length = s10;
        }

        private GtpV1Header(byte[] bArr, int i10, int i11) {
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType;
            if (i11 < 8) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build a GTPv1 header(");
                sb2.append(8);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            byte b10 = ByteArrays.getByte(bArr, i10 + 0);
            this.version = GtpVersion.getInstance((b10 >> 5) & 7);
            boolean z10 = false;
            this.protocolType = ProtocolType.getInstance((b10 & 16) != 0);
            this.reserved = ((b10 & 8) >> 3) != 0;
            boolean z11 = ((b10 & 4) >> 2) != 0;
            this.extensionHeaderFlag = z11;
            boolean z12 = ((b10 & 2) >> 1) != 0;
            this.sequenceNumberFlag = z12;
            z10 = (b10 & 1) != 0 ? true : z10;
            this.nPduNumberFlag = z10;
            this.messageType = GtpV1MessageType.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 1)));
            this.length = ByteArrays.getShort(bArr, i10 + 2);
            this.teid = ByteArrays.getInt(bArr, i10 + 4);
            if (!(z12 | z10) && !z11) {
                gtpV1ExtensionHeaderType = null;
                this.sequenceNumber = null;
                this.nPduNumber = null;
            } else {
                if (i11 < 12) {
                    StringBuilder sb3 = new StringBuilder(80);
                    sb3.append("The data is too short to build a GTPv1 header(");
                    sb3.append(12);
                    sb3.append(" bytes). data: ");
                    sb3.append(ByteArrays.toHexString(bArr, " "));
                    sb3.append(", offset: ");
                    sb3.append(i10);
                    sb3.append(", length: ");
                    sb3.append(i11);
                    throw new IllegalRawDataException(sb3.toString());
                }
                this.sequenceNumber = Short.valueOf(ByteArrays.getShort(bArr, i10 + 8));
                this.nPduNumber = Byte.valueOf(ByteArrays.getByte(bArr, i10 + 10));
                gtpV1ExtensionHeaderType = GtpV1ExtensionHeaderType.getInstance(Byte.valueOf(bArr[i10 + 11]));
            }
            this.nextExtensionHeaderType = gtpV1ExtensionHeaderType;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[GTPv1 Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Version: ");
            sb2.append(this.version);
            sb2.append(property);
            sb2.append("  Protocol Type: ");
            sb2.append(this.protocolType);
            sb2.append(property);
            sb2.append("  Reserved Flag: ");
            sb2.append(this.reserved);
            sb2.append(property);
            sb2.append("  Extension Flag: ");
            sb2.append(this.extensionHeaderFlag);
            sb2.append(property);
            sb2.append("  Sequence Flag: ");
            sb2.append(this.sequenceNumberFlag);
            sb2.append(property);
            sb2.append("  NPDU Flag: ");
            sb2.append(this.nPduNumberFlag);
            sb2.append(property);
            sb2.append("  Message Type: ");
            sb2.append(this.messageType);
            sb2.append(property);
            sb2.append("  Length: ");
            sb2.append(getLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Tunnel ID: ");
            sb2.append(getTeidAsLong());
            sb2.append(property);
            if (this.sequenceNumber != null) {
                sb2.append("  Sequence Number: ");
                sb2.append(getSequenceNumberAsInt());
                sb2.append(property);
            }
            if (this.nPduNumber != null) {
                sb2.append("  NPDU Number: ");
                sb2.append(getNPduNumberAsInt());
                sb2.append(property);
            }
            if (this.nextExtensionHeaderType != null) {
                sb2.append("  Next Extension Header: ");
                sb2.append(getNextExtensionHeaderType());
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int i10 = 1231;
            int i11 = this.extensionHeaderFlag ? 1231 : 1237;
            short s10 = this.length;
            int hashCode = this.messageType.hashCode();
            Byte b10 = this.nPduNumber;
            int i12 = 0;
            int hashCode2 = b10 == null ? 0 : b10.hashCode();
            int i13 = this.nPduNumberFlag ? 1231 : 1237;
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            int hashCode3 = gtpV1ExtensionHeaderType == null ? 0 : gtpV1ExtensionHeaderType.hashCode();
            int hashCode4 = this.protocolType.hashCode();
            int i14 = this.reserved ? 1231 : 1237;
            Short sh2 = this.sequenceNumber;
            if (sh2 != null) {
                i12 = sh2.hashCode();
            }
            if (!this.sequenceNumberFlag) {
                i10 = 1237;
            }
            return ((((((((((((((((((((((527 + i11) * 31) + s10) * 31) + hashCode) * 31) + hashCode2) * 31) + i13) * 31) + hashCode3) * 31) + hashCode4) * 31) + i14) * 31) + i12) * 31) + i10) * 31) + this.teid) * 31) + this.version.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int i10 = this.sequenceNumber != null ? 10 : 8;
            int i11 = i10;
            if (this.nPduNumber != null) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.nextExtensionHeaderType != null) {
                i12 = i11 + 1;
            }
            return i12;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!GtpV1Header.class.isInstance(obj)) {
                return false;
            }
            GtpV1Header gtpV1Header = (GtpV1Header) obj;
            if (this.extensionHeaderFlag != gtpV1Header.extensionHeaderFlag || this.length != gtpV1Header.length || !this.messageType.equals(gtpV1Header.messageType)) {
                return false;
            }
            Byte b10 = this.nPduNumber;
            if (b10 == null) {
                if (gtpV1Header.nPduNumber != null) {
                    return false;
                }
            } else if (!b10.equals(gtpV1Header.nPduNumber)) {
                return false;
            }
            if (this.nPduNumberFlag != gtpV1Header.nPduNumberFlag) {
                return false;
            }
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            if (gtpV1ExtensionHeaderType == null) {
                if (gtpV1Header.nextExtensionHeaderType != null) {
                    return false;
                }
            } else if (!gtpV1ExtensionHeaderType.equals(gtpV1Header.nextExtensionHeaderType)) {
                return false;
            }
            if (this.protocolType != gtpV1Header.protocolType || this.reserved != gtpV1Header.reserved) {
                return false;
            }
            Short sh2 = this.sequenceNumber;
            if (sh2 == null) {
                if (gtpV1Header.sequenceNumber != null) {
                    return false;
                }
            } else if (!sh2.equals(gtpV1Header.sequenceNumber)) {
                return false;
            }
            return this.sequenceNumberFlag == gtpV1Header.sequenceNumberFlag && this.teid == gtpV1Header.teid && this.version == gtpV1Header.version;
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return this.length & 65535;
        }

        public GtpV1MessageType getMessageType() {
            return this.messageType;
        }

        public Byte getNPduNumber() {
            return this.nPduNumber;
        }

        public Integer getNPduNumberAsInt() {
            Byte b10 = this.nPduNumber;
            if (b10 == null) {
                return null;
            }
            return Integer.valueOf(b10.byteValue() & 255);
        }

        public GtpV1ExtensionHeaderType getNextExtensionHeaderType() {
            return this.nextExtensionHeaderType;
        }

        public ProtocolType getProtocolType() {
            return this.protocolType;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            byte value = (byte) (this.version.getValue() << 5);
            byte b10 = value;
            if (this.protocolType.getValue()) {
                b10 = (byte) (value | 16);
            }
            byte b11 = b10;
            if (this.reserved) {
                b11 = (byte) (b10 | 8);
            }
            byte b12 = b11;
            if (this.extensionHeaderFlag) {
                b12 = (byte) (b11 | 4);
            }
            byte b13 = b12;
            if (this.sequenceNumberFlag) {
                b13 = (byte) (b12 | 2);
            }
            byte b14 = b13;
            if (this.nPduNumberFlag) {
                b14 = (byte) (b13 | 1);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(b14));
            arrayList.add(ByteArrays.toByteArray(this.messageType.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.length));
            arrayList.add(ByteArrays.toByteArray(this.teid));
            Short sh2 = this.sequenceNumber;
            if (sh2 != null) {
                arrayList.add(ByteArrays.toByteArray(sh2.shortValue()));
            }
            Byte b15 = this.nPduNumber;
            if (b15 != null) {
                arrayList.add(ByteArrays.toByteArray(b15.byteValue()));
            }
            GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = this.nextExtensionHeaderType;
            if (gtpV1ExtensionHeaderType != null) {
                arrayList.add(ByteArrays.toByteArray(gtpV1ExtensionHeaderType.value().byteValue()));
            }
            return arrayList;
        }

        public boolean getReserved() {
            return this.reserved;
        }

        public Short getSequenceNumber() {
            return this.sequenceNumber;
        }

        public Integer getSequenceNumberAsInt() {
            Short sh2 = this.sequenceNumber;
            if (sh2 == null) {
                return null;
            }
            return Integer.valueOf(sh2.shortValue() & 65535);
        }

        public int getTeid() {
            return this.teid;
        }

        public long getTeidAsLong() {
            return this.teid & 4294967295L;
        }

        public GtpVersion getVersion() {
            return this.version;
        }

        public boolean isExtensionHeaderFieldPresent() {
            return this.extensionHeaderFlag;
        }

        public boolean isNPduNumberFieldPresent() {
            return this.nPduNumberFlag;
        }

        public boolean isSequenceNumberFieldPresent() {
            return this.sequenceNumberFlag;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpV1Packet$ProtocolType.class */
    public enum ProtocolType {
        GTP_PRIME(false),
        GTP(true);

        private final boolean value;

        ProtocolType(boolean z10) {
            this.value = z10;
        }

        public static ProtocolType getInstance(boolean z10) {
            for (ProtocolType protocolType : values()) {
                if (protocolType.value == z10) {
                    return protocolType;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + z10);
        }

        public boolean getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value ? "GTP" : "GTP'";
        }
    }

    private GtpV1Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.protocolType != null && builder.messageType != null) {
            Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = build;
            this.header = new GtpV1Header(builder, build != null ? build.length() : 0);
            return;
        }
        throw new NullPointerException("builder: " + builder + ", builder.version: " + builder.version + ", builder.protocolType: " + builder.protocolType + ", builder.messageType: " + builder.messageType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.isNPduNumberFieldPresent() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private GtpV1Packet(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = r7
            r0.<init>()
            org.pcap4j.packet.GtpV1Packet$GtpV1Header r0 = new org.pcap4j.packet.GtpV1Packet$GtpV1Header
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r7
            r1 = r12
            r0.header = r1
            r0 = r12
            int r0 = r0.getLengthAsInt()
            r11 = r0
            r0 = r12
            boolean r0 = r0.isExtensionHeaderFieldPresent()
            if (r0 != 0) goto L39
            r0 = r12
            boolean r0 = r0.isSequenceNumberFieldPresent()
            if (r0 != 0) goto L39
            r0 = r11
            r10 = r0
            r0 = r12
            boolean r0 = r0.isNPduNumberFieldPresent()
            if (r0 == 0) goto L3e
        L39:
            r0 = r11
            r1 = 4
            int r0 = r0 - r1
            r10 = r0
        L3e:
            r0 = r10
            if (r0 < 0) goto L97
            r0 = r10
            if (r0 == 0) goto L91
            r0 = r12
            org.pcap4j.packet.namednumber.GtpV1ExtensionHeaderType r0 = r0.getNextExtensionHeaderType()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L6d
            java.lang.Class<org.pcap4j.packet.Packet> r0 = org.pcap4j.packet.Packet.class
            java.lang.Class<org.pcap4j.packet.namednumber.GtpV1ExtensionHeaderType> r1 = org.pcap4j.packet.namednumber.GtpV1ExtensionHeaderType.class
            org.pcap4j.packet.factory.PacketFactory r0 = org.pcap4j.packet.factory.PacketFactories.getFactory(r0, r1)
            r1 = r8
            r2 = r9
            r3 = r12
            int r3 = r3.length()
            int r2 = r2 + r3
            r3 = r10
            r4 = r13
            java.lang.Object r0 = r0.newInstance(r1, r2, r3, r4)
            r8 = r0
            goto L86
        L6d:
            java.lang.Class<org.pcap4j.packet.Packet> r0 = org.pcap4j.packet.Packet.class
            java.lang.Class<org.pcap4j.packet.namednumber.NotApplicable> r1 = org.pcap4j.packet.namednumber.NotApplicable.class
            org.pcap4j.packet.factory.PacketFactory r0 = org.pcap4j.packet.factory.PacketFactories.getFactory(r0, r1)
            r1 = r8
            r2 = r9
            r3 = r12
            int r3 = r3.length()
            int r2 = r2 + r3
            r3 = r10
            org.pcap4j.packet.namednumber.NotApplicable r4 = org.pcap4j.packet.namednumber.NotApplicable.UNKNOWN
            java.lang.Object r0 = r0.newInstance(r1, r2, r3, r4)
            r8 = r0
        L86:
            r0 = r7
            r1 = r8
            org.pcap4j.packet.Packet r1 = (org.pcap4j.packet.Packet) r1
            r0.payload = r1
            goto L96
        L91:
            r0 = r7
            r1 = 0
            r0.payload = r1
        L96:
            return
        L97:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "The value of length field seems to be wrong: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r12
            int r1 = r1.getLengthAsInt()
            java.lang.StringBuilder r0 = r0.append(r1)
            org.pcap4j.packet.IllegalRawDataException r0 = new org.pcap4j.packet.IllegalRawDataException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.packet.GtpV1Packet.<init>(byte[], int, int):void");
    }

    public static GtpV1Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new GtpV1Packet(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public GtpV1Header getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
