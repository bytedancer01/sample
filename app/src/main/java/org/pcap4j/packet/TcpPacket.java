package org.pcap4j.packet;

import java.io.Serializable;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpPacket.class */
public final class TcpPacket extends AbstractPacket implements TransportPacket {
    private static final long serialVersionUID = 7904566782140471299L;
    private final TcpHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<TcpPacket>, ChecksumBuilder<TcpPacket> {
        private boolean ack;
        private int acknowledgmentNumber;
        private short checksum;
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private byte dataOffset;
        private InetAddress dstAddr;
        private TcpPort dstPort;
        private boolean fin;
        private List<TcpOption> options;
        private byte[] padding;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private boolean psh;
        private byte reserved;
        private boolean rst;
        private int sequenceNumber;
        private InetAddress srcAddr;
        private TcpPort srcPort;
        private boolean syn;
        private boolean urg;
        private short urgentPointer;
        private short window;

        public Builder() {
        }

        public Builder(TcpPacket tcpPacket) {
            this.srcPort = tcpPacket.header.srcPort;
            this.dstPort = tcpPacket.header.dstPort;
            this.sequenceNumber = tcpPacket.header.sequenceNumber;
            this.acknowledgmentNumber = tcpPacket.header.acknowledgmentNumber;
            this.dataOffset = tcpPacket.header.dataOffset;
            this.reserved = tcpPacket.header.reserved;
            this.urg = tcpPacket.header.urg;
            this.ack = tcpPacket.header.ack;
            this.psh = tcpPacket.header.psh;
            this.rst = tcpPacket.header.rst;
            this.syn = tcpPacket.header.syn;
            this.fin = tcpPacket.header.fin;
            this.window = tcpPacket.header.window;
            this.checksum = tcpPacket.header.checksum;
            this.urgentPointer = tcpPacket.header.urgentPointer;
            this.options = tcpPacket.header.options;
            this.padding = tcpPacket.header.padding;
            this.payloadBuilder = tcpPacket.payload != null ? tcpPacket.payload.getBuilder() : null;
        }

        public Builder ack(boolean z10) {
            this.ack = z10;
            return this;
        }

        public Builder acknowledgmentNumber(int i10) {
            this.acknowledgmentNumber = i10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public TcpPacket build() {
            return new TcpPacket(this);
        }

        public Builder checksum(short s10) {
            this.checksum = s10;
            return this;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<TcpPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<TcpPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dataOffset(byte b10) {
            this.dataOffset = b10;
            return this;
        }

        public Builder dstAddr(InetAddress inetAddress) {
            this.dstAddr = inetAddress;
            return this;
        }

        public Builder dstPort(TcpPort tcpPort) {
            this.dstPort = tcpPort;
            return this;
        }

        public Builder fin(boolean z10) {
            this.fin = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder options(List<TcpOption> list) {
            this.options = list;
            return this;
        }

        public Builder padding(byte[] bArr) {
            this.padding = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z10) {
            this.paddingAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder psh(boolean z10) {
            this.psh = z10;
            return this;
        }

        public Builder reserved(byte b10) {
            this.reserved = b10;
            return this;
        }

        public Builder rst(boolean z10) {
            this.rst = z10;
            return this;
        }

        public Builder sequenceNumber(int i10) {
            this.sequenceNumber = i10;
            return this;
        }

        public Builder srcAddr(InetAddress inetAddress) {
            this.srcAddr = inetAddress;
            return this;
        }

        public Builder srcPort(TcpPort tcpPort) {
            this.srcPort = tcpPort;
            return this;
        }

        public Builder syn(boolean z10) {
            this.syn = z10;
            return this;
        }

        public Builder urg(boolean z10) {
            this.urg = z10;
            return this;
        }

        public Builder urgentPointer(short s10) {
            this.urgentPointer = s10;
            return this;
        }

        public Builder window(short s10) {
            this.window = s10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpPacket$TcpHeader.class */
    public static final class TcpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int ACKNOWLEDGMENT_NUMBER_OFFSET = 8;
        private static final int ACKNOWLEDGMENT_NUMBER_SIZE = 4;
        private static final int CHECKSUM_OFFSET = 16;
        private static final int CHECKSUM_SIZE = 2;
        private static final int DATA_OFFSET_AND_RESERVED_AND_CONTROL_BITS_OFFSET = 12;
        private static final int DATA_OFFSET_AND_RESERVED_AND_CONTROL_BITS_SIZE = 2;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int IPV4_PSEUDO_HEADER_SIZE = 12;
        private static final int IPV6_PSEUDO_HEADER_SIZE = 40;
        private static final int MIN_TCP_HEADER_SIZE = 20;
        private static final int OPTIONS_OFFSET = 20;
        private static final int SEQUENCE_NUMBER_OFFSET = 4;
        private static final int SEQUENCE_NUMBER_SIZE = 4;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int URGENT_POINTER_OFFSET = 18;
        private static final int URGENT_POINTER_SIZE = 2;
        private static final int WINDOW_OFFSET = 14;
        private static final int WINDOW_SIZE = 2;
        private static final Logger logger = LoggerFactory.getLogger((Class<?>) TcpHeader.class);
        private static final long serialVersionUID = -795185420055823677L;
        private final boolean ack;
        private final int acknowledgmentNumber;
        private final short checksum;
        private final byte dataOffset;
        private final TcpPort dstPort;
        private final boolean fin;
        private final List<TcpOption> options;
        private final byte[] padding;
        private final boolean psh;
        private final byte reserved;
        private final boolean rst;
        private final int sequenceNumber;
        private final TcpPort srcPort;
        private final boolean syn;
        private final boolean urg;
        private final short urgentPointer;
        private final short window;

        private TcpHeader(Builder builder, byte[] bArr) {
            byte b10;
            short s10;
            if ((builder.reserved & 192) != 0) {
                throw new IllegalArgumentException("Invalid reserved: " + ((int) builder.reserved));
            }
            this.srcPort = builder.srcPort;
            this.dstPort = builder.dstPort;
            this.sequenceNumber = builder.sequenceNumber;
            this.acknowledgmentNumber = builder.acknowledgmentNumber;
            this.reserved = builder.reserved;
            this.urg = builder.urg;
            this.ack = builder.ack;
            this.psh = builder.psh;
            this.rst = builder.rst;
            this.syn = builder.syn;
            this.fin = builder.fin;
            this.window = builder.window;
            this.urgentPointer = builder.urgentPointer;
            this.options = builder.options != null ? new ArrayList(builder.options) : new ArrayList(0);
            if (builder.paddingAtBuild) {
                int measureLengthWithoutPadding = measureLengthWithoutPadding() % 4;
                if (measureLengthWithoutPadding != 0) {
                    this.padding = new byte[4 - measureLengthWithoutPadding];
                } else {
                    this.padding = new byte[0];
                }
            } else if (builder.padding != null) {
                byte[] bArr2 = new byte[builder.padding.length];
                this.padding = bArr2;
                System.arraycopy(builder.padding, 0, bArr2, 0, bArr2.length);
            } else {
                this.padding = new byte[0];
            }
            if (builder.correctLengthAtBuild) {
                b10 = (byte) (length() / 4);
            } else {
                if ((builder.dataOffset & 240) != 0) {
                    throw new IllegalArgumentException("Invalid dataOffset: " + ((int) builder.dataOffset));
                }
                b10 = builder.dataOffset;
            }
            this.dataOffset = b10;
            if (!builder.correctChecksumAtBuild) {
                s10 = builder.checksum;
            } else {
                if ((!(builder.srcAddr instanceof Inet4Address) || !PacketPropertiesLoader.getInstance().tcpV4CalcChecksum()) && (!(builder.srcAddr instanceof Inet6Address) || !PacketPropertiesLoader.getInstance().tcpV6CalcChecksum())) {
                    this.checksum = (short) 0;
                    return;
                }
                s10 = calcChecksum(builder.srcAddr, builder.dstAddr, buildRawData(true), bArr);
            }
            this.checksum = s10;
        }

        private TcpHeader(byte[] bArr, int i10, int i11) {
            int i12;
            if (i11 < 20) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build this header(");
                sb2.append(20);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.srcPort = TcpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
            this.dstPort = TcpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
            this.sequenceNumber = ByteArrays.getInt(bArr, i10 + 4);
            this.acknowledgmentNumber = ByteArrays.getInt(bArr, i10 + 8);
            short s10 = ByteArrays.getShort(bArr, i10 + 12);
            this.dataOffset = (byte) ((61440 & s10) >> 12);
            this.reserved = (byte) ((s10 & 4032) >> 6);
            this.urg = (s10 & 32) != 0;
            this.ack = (s10 & 16) != 0;
            this.psh = (s10 & 8) != 0;
            this.rst = (s10 & 4) != 0;
            this.syn = (s10 & 2) != 0;
            this.fin = (s10 & 1) != 0;
            this.window = ByteArrays.getShort(bArr, i10 + 14);
            this.checksum = ByteArrays.getShort(bArr, i10 + 16);
            this.urgentPointer = ByteArrays.getShort(bArr, i10 + 18);
            int dataOffsetAsInt = getDataOffsetAsInt() * 4;
            if (i11 < dataOffsetAsInt) {
                StringBuilder sb3 = new StringBuilder(110);
                sb3.append("The data is too short to build this header(");
                sb3.append(dataOffsetAsInt);
                sb3.append(" bytes). data: ");
                sb3.append(ByteArrays.toHexString(bArr, " "));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            if (dataOffsetAsInt < 20) {
                StringBuilder sb4 = new StringBuilder(100);
                sb4.append("The data offset must be equal or more than ");
                sb4.append(5);
                sb4.append(", but it is: ");
                sb4.append(getDataOffsetAsInt());
                throw new IllegalRawDataException(sb4.toString());
            }
            this.options = new ArrayList();
            int i13 = 20;
            while (true) {
                i12 = i13;
                if (i13 >= dataOffsetAsInt) {
                    break;
                }
                int i14 = i13 + i10;
                i12 = i13;
                try {
                    TcpOptionKind tcpOptionKind = TcpOptionKind.getInstance(Byte.valueOf(bArr[i14]));
                    int i15 = i13;
                    TcpOption tcpOption = (TcpOption) PacketFactories.getFactory(TcpOption.class, TcpOptionKind.class).newInstance(bArr, i14, dataOffsetAsInt - i13, tcpOptionKind);
                    int i16 = i13;
                    this.options.add(tcpOption);
                    int i17 = i13;
                    int length = i13 + tcpOption.length();
                    i13 = length;
                    if (tcpOption.getKind().equals(TcpOptionKind.END_OF_OPTION_LIST)) {
                        i12 = length;
                        break;
                    }
                } catch (Exception e10) {
                    logger.error("Exception occurred during analyzing TCP options: ", (Throwable) e10);
                }
            }
            int i18 = dataOffsetAsInt - i12;
            if (i18 != 0) {
                this.padding = ByteArrays.getSubArray(bArr, i12 + i10, i18);
            } else {
                this.padding = new byte[0];
            }
        }

        private byte[] buildRawData(boolean z10) {
            return ByteArrays.concatenate(getRawFields(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short calcChecksum(InetAddress inetAddress, InetAddress inetAddress2, byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            int i10;
            int length = bArr2.length + length();
            boolean z10 = inetAddress instanceof Inet4Address;
            int i11 = z10 ? 12 : 40;
            if (length % 2 != 0) {
                int i12 = length + 1;
                bArr3 = new byte[i11 + i12];
                i10 = i12;
            } else {
                bArr3 = new byte[i11 + length];
                i10 = length;
            }
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            System.arraycopy(inetAddress.getAddress(), 0, bArr3, i10, inetAddress.getAddress().length);
            int length2 = i10 + inetAddress.getAddress().length;
            System.arraycopy(inetAddress2.getAddress(), 0, bArr3, length2, inetAddress2.getAddress().length);
            int length3 = length2 + inetAddress2.getAddress().length;
            int i13 = z10 ? length3 + 1 : length3 + 3;
            bArr3[i13] = IpNumber.TCP.value().byteValue();
            System.arraycopy(ByteArrays.toByteArray((short) length), 0, bArr3, i13 + 1, 2);
            return ByteArrays.calcChecksum(bArr3);
        }

        private List<byte[]> getRawFields(boolean z10) {
            boolean z11 = this.fin;
            byte b10 = z11 ? 1 : 0;
            if (this.syn) {
                b10 = (byte) ((z11 ? 1 : 0) | 2);
            }
            byte b11 = b10;
            if (this.rst) {
                b11 = (byte) (b10 | 4);
            }
            byte b12 = b11;
            if (this.psh) {
                b12 = (byte) (b11 | 8);
            }
            byte b13 = b12;
            if (this.ack) {
                b13 = (byte) (b12 | 16);
            }
            byte b14 = b13;
            if (this.urg) {
                b14 = (byte) (b13 | 32);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.sequenceNumber));
            arrayList.add(ByteArrays.toByteArray(this.acknowledgmentNumber));
            arrayList.add(ByteArrays.toByteArray((short) (b14 | (this.dataOffset << 12) | (this.reserved << 6))));
            arrayList.add(ByteArrays.toByteArray(this.window));
            arrayList.add(ByteArrays.toByteArray(z10 ? (short) 0 : this.checksum));
            arrayList.add(ByteArrays.toByteArray(this.urgentPointer));
            Iterator<TcpOption> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            arrayList.add(this.padding);
            return arrayList;
        }

        private int measureLengthWithoutPadding() {
            Iterator<TcpOption> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 20;
                }
                i10 = i11 + it.next().length();
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[TCP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Source port: ");
            sb2.append(getSrcPort());
            sb2.append(property);
            sb2.append("  Destination port: ");
            sb2.append(getDstPort());
            sb2.append(property);
            sb2.append("  Sequence Number: ");
            sb2.append(getSequenceNumberAsLong());
            sb2.append(property);
            sb2.append("  Acknowledgment Number: ");
            sb2.append(getAcknowledgmentNumberAsLong());
            sb2.append(property);
            sb2.append("  Data Offset: ");
            sb2.append((int) this.dataOffset);
            sb2.append(" (");
            sb2.append(this.dataOffset * 4);
            sb2.append(" [bytes])");
            sb2.append(property);
            sb2.append("  Reserved: ");
            sb2.append((int) this.reserved);
            sb2.append(property);
            sb2.append("  URG: ");
            sb2.append(this.urg);
            sb2.append(property);
            sb2.append("  ACK: ");
            sb2.append(this.ack);
            sb2.append(property);
            sb2.append("  PSH: ");
            sb2.append(this.psh);
            sb2.append(property);
            sb2.append("  RST: ");
            sb2.append(this.rst);
            sb2.append(property);
            sb2.append("  SYN: ");
            sb2.append(this.syn);
            sb2.append(property);
            sb2.append("  FIN: ");
            sb2.append(this.fin);
            sb2.append(property);
            sb2.append("  Window: ");
            sb2.append(getWindowAsInt());
            sb2.append(property);
            sb2.append("  Checksum: 0x");
            sb2.append(ByteArrays.toHexString(this.checksum, ""));
            sb2.append(property);
            sb2.append("  Urgent Pointer: ");
            sb2.append(getUrgentPointerAsInt());
            sb2.append(property);
            for (TcpOption tcpOption : this.options) {
                sb2.append("  Option: ");
                sb2.append(tcpOption);
                sb2.append(property);
            }
            if (this.padding.length != 0) {
                sb2.append("  Padding: 0x");
                sb2.append(ByteArrays.toHexString(this.padding, " "));
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int hashCode = this.srcPort.hashCode();
            int hashCode2 = this.dstPort.hashCode();
            int i10 = this.sequenceNumber;
            int i11 = this.acknowledgmentNumber;
            byte b10 = this.dataOffset;
            byte b11 = this.reserved;
            int i12 = 1231;
            int i13 = this.urg ? 1231 : 1237;
            int i14 = this.ack ? 1231 : 1237;
            int i15 = this.psh ? 1231 : 1237;
            int i16 = this.rst ? 1231 : 1237;
            int i17 = this.syn ? 1231 : 1237;
            if (!this.fin) {
                i12 = 1237;
            }
            return ((((((((((((((((((((((((((((((((527 + hashCode) * 31) + hashCode2) * 31) + i10) * 31) + i11) * 31) + b10) * 31) + b11) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i12) * 31) + this.window) * 31) + this.checksum) * 31) + this.urgentPointer) * 31) + this.options.hashCode()) * 31) + Arrays.hashCode(this.padding);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return measureLengthWithoutPadding() + this.padding.length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!TcpHeader.class.isInstance(obj)) {
                return false;
            }
            TcpHeader tcpHeader = (TcpHeader) obj;
            if (this.checksum != tcpHeader.checksum || this.sequenceNumber != tcpHeader.sequenceNumber || this.acknowledgmentNumber != tcpHeader.acknowledgmentNumber || this.dataOffset != tcpHeader.dataOffset || !this.srcPort.equals(tcpHeader.srcPort) || !this.dstPort.equals(tcpHeader.dstPort) || this.urg != tcpHeader.urg || this.ack != tcpHeader.ack || this.psh != tcpHeader.psh || this.rst != tcpHeader.rst || this.syn != tcpHeader.syn || this.fin != tcpHeader.fin || this.window != tcpHeader.window || this.urgentPointer != tcpHeader.urgentPointer || this.reserved != tcpHeader.reserved || !this.options.equals(tcpHeader.options) || !Arrays.equals(this.padding, tcpHeader.padding)) {
                z10 = false;
            }
            return z10;
        }

        public boolean getAck() {
            return this.ack;
        }

        public int getAcknowledgmentNumber() {
            return this.acknowledgmentNumber;
        }

        public long getAcknowledgmentNumberAsLong() {
            return this.acknowledgmentNumber & 4294967295L;
        }

        public short getChecksum() {
            return this.checksum;
        }

        public byte getDataOffset() {
            return this.dataOffset;
        }

        public int getDataOffsetAsInt() {
            return this.dataOffset & 255;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public TcpPort getDstPort() {
            return this.dstPort;
        }

        public boolean getFin() {
            return this.fin;
        }

        public List<TcpOption> getOptions() {
            return new ArrayList(this.options);
        }

        public byte[] getPadding() {
            byte[] bArr = this.padding;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public boolean getPsh() {
            return this.psh;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public byte getReserved() {
            return this.reserved;
        }

        public boolean getRst() {
            return this.rst;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public long getSequenceNumberAsLong() {
            return this.sequenceNumber & 4294967295L;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public TcpPort getSrcPort() {
            return this.srcPort;
        }

        public boolean getSyn() {
            return this.syn;
        }

        public boolean getUrg() {
            return this.urg;
        }

        public short getUrgentPointer() {
            return this.urgentPointer;
        }

        public int getUrgentPointerAsInt() {
            return this.urgentPointer & 65535;
        }

        public short getWindow() {
            return this.window;
        }

        public int getWindowAsInt() {
            return this.window & 65535;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/TcpPacket$TcpOption.class */
    public interface TcpOption extends Serializable {
        TcpOptionKind getKind();

        byte[] getRawData();

        int length();
    }

    private TcpPacket(Builder builder) {
        if (builder == null || builder.srcPort == null || builder.dstPort == null) {
            throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
        }
        if (builder.correctChecksumAtBuild) {
            if (builder.srcAddr == null || builder.dstAddr == null) {
                throw new NullPointerException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
            }
            if (!builder.srcAddr.getClass().isInstance(builder.dstAddr)) {
                throw new IllegalArgumentException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
            }
        }
        Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
        this.payload = build;
        this.header = new TcpHeader(builder, build != null ? build.getRawData() : new byte[0]);
    }

    private TcpPacket(byte[] bArr, int i10, int i11) {
        TcpHeader tcpHeader = new TcpHeader(bArr, i10, i11);
        this.header = tcpHeader;
        int length = i11 - tcpHeader.length();
        if (length <= 0) {
            this.payload = null;
        } else {
            PacketFactory factory = PacketFactories.getFactory(Packet.class, TcpPort.class);
            this.payload = (Packet) factory.newInstance(bArr, i10 + tcpHeader.length(), length, factory.getTargetClass(tcpHeader.getDstPort()).equals(factory.getTargetClass()) ? tcpHeader.getSrcPort() : tcpHeader.getDstPort());
        }
    }

    public static TcpPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new TcpPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public TcpHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(InetAddress inetAddress, InetAddress inetAddress2, boolean z10) {
        if (inetAddress == null || inetAddress2 == null) {
            throw new NullPointerException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        if (inetAddress.getClass().isInstance(inetAddress2)) {
            Packet packet = this.payload;
            byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
            TcpHeader tcpHeader = this.header;
            if (tcpHeader.calcChecksum(inetAddress, inetAddress2, tcpHeader.getRawData(), rawData) == 0) {
                return true;
            }
            return this.header.checksum == 0 && z10;
        }
        throw new IllegalArgumentException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
    }
}
