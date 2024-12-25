package org.pcap4j.packet;

import java.io.Serializable;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Packet.class */
public final class IpV4Packet extends AbstractPacket implements IpPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV4Packet.class);
    private static final long serialVersionUID = 5348211496230027548L;
    private final IpV4Header header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Packet$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<IpV4Packet>, LengthBuilder<IpV4Packet> {
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private boolean dontFragmentFlag;
        private Inet4Address dstAddr;
        private short fragmentOffset;
        private short headerChecksum;
        private short identification;
        private byte ihl;
        private boolean moreFragmentFlag;
        private List<IpV4Option> options;
        private byte[] padding;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private IpNumber protocol;
        private boolean reservedFlag;
        private Inet4Address srcAddr;
        private IpV4Tos tos;
        private short totalLength;
        private byte ttl;
        private IpVersion version;

        public Builder() {
        }

        public Builder(IpV4Packet ipV4Packet) {
            this.version = ipV4Packet.header.version;
            this.ihl = ipV4Packet.header.ihl;
            this.tos = ipV4Packet.header.tos;
            this.totalLength = ipV4Packet.header.totalLength;
            this.identification = ipV4Packet.header.identification;
            this.reservedFlag = ipV4Packet.header.reservedFlag;
            this.dontFragmentFlag = ipV4Packet.header.dontFragmentFlag;
            this.moreFragmentFlag = ipV4Packet.header.moreFragmentFlag;
            this.fragmentOffset = ipV4Packet.header.fragmentOffset;
            this.ttl = ipV4Packet.header.ttl;
            this.protocol = ipV4Packet.header.protocol;
            this.headerChecksum = ipV4Packet.header.headerChecksum;
            this.srcAddr = ipV4Packet.header.srcAddr;
            this.dstAddr = ipV4Packet.header.dstAddr;
            this.options = ipV4Packet.header.options;
            this.padding = ipV4Packet.header.padding;
            this.payloadBuilder = ipV4Packet.payload != null ? ipV4Packet.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV4Packet build() {
            return new IpV4Packet(this);
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<IpV4Packet> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: merged with bridge method [inline-methods] */
        public LengthBuilder<IpV4Packet> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dontFragmentFlag(boolean z10) {
            this.dontFragmentFlag = z10;
            return this;
        }

        public Builder dstAddr(Inet4Address inet4Address) {
            this.dstAddr = inet4Address;
            return this;
        }

        public Builder fragmentOffset(short s10) {
            this.fragmentOffset = s10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder headerChecksum(short s10) {
            this.headerChecksum = s10;
            return this;
        }

        public Builder identification(short s10) {
            this.identification = s10;
            return this;
        }

        public Builder ihl(byte b10) {
            this.ihl = b10;
            return this;
        }

        public Builder moreFragmentFlag(boolean z10) {
            this.moreFragmentFlag = z10;
            return this;
        }

        public Builder options(List<IpV4Option> list) {
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

        public Builder protocol(IpNumber ipNumber) {
            this.protocol = ipNumber;
            return this;
        }

        public Builder reservedFlag(boolean z10) {
            this.reservedFlag = z10;
            return this;
        }

        public Builder srcAddr(Inet4Address inet4Address) {
            this.srcAddr = inet4Address;
            return this;
        }

        public Builder tos(IpV4Tos ipV4Tos) {
            this.tos = ipV4Tos;
            return this;
        }

        public Builder totalLength(short s10) {
            this.totalLength = s10;
            return this;
        }

        public Builder ttl(byte b10) {
            this.ttl = b10;
            return this;
        }

        public Builder version(IpVersion ipVersion) {
            this.version = ipVersion;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Packet$IpV4Header.class */
    public static final class IpV4Header extends AbstractPacket.AbstractHeader implements IpPacket.IpHeader {
        private static final int DST_ADDR_OFFSET = 16;
        private static final int DST_ADDR_SIZE = 4;
        private static final int FLAGS_AND_FRAGMENT_OFFSET_OFFSET = 6;
        private static final int FLAGS_AND_FRAGMENT_OFFSET_SIZE = 2;
        private static final int HEADER_CHECKSUM_OFFSET = 10;
        private static final int HEADER_CHECKSUM_SIZE = 2;
        private static final int IDENTIFICATION_OFFSET = 4;
        private static final int IDENTIFICATION_SIZE = 2;
        private static final int MIN_IPV4_HEADER_SIZE = 20;
        private static final int OPTIONS_OFFSET = 20;
        private static final int PROTOCOL_OFFSET = 9;
        private static final int PROTOCOL_SIZE = 1;
        private static final int SRC_ADDR_OFFSET = 12;
        private static final int SRC_ADDR_SIZE = 4;
        private static final int TOS_OFFSET = 1;
        private static final int TOS_SIZE = 1;
        private static final int TOTAL_LENGTH_OFFSET = 2;
        private static final int TOTAL_LENGTH_SIZE = 2;
        private static final int TTL_OFFSET = 8;
        private static final int TTL_SIZE = 1;
        private static final int VERSION_AND_IHL_OFFSET = 0;
        private static final int VERSION_AND_IHL_SIZE = 1;
        private static final Logger logger = LoggerFactory.getLogger((Class<?>) IpV4Header.class);
        private static final long serialVersionUID = -7583326842445453539L;
        private final boolean dontFragmentFlag;
        private final Inet4Address dstAddr;
        private final short fragmentOffset;
        private final short headerChecksum;
        private final short identification;
        private final byte ihl;
        private final boolean moreFragmentFlag;
        private final List<IpV4Option> options;
        private final byte[] padding;
        private final IpNumber protocol;
        private final boolean reservedFlag;
        private final Inet4Address srcAddr;
        private final IpV4Tos tos;
        private final short totalLength;
        private final byte ttl;
        private final IpVersion version;

        private IpV4Header(Builder builder, Packet packet) {
            short s10;
            short s11;
            if ((builder.fragmentOffset & 57344) != 0) {
                throw new IllegalArgumentException("Invalid fragmentOffset: " + ((int) builder.fragmentOffset));
            }
            this.version = builder.version;
            this.tos = builder.tos;
            this.identification = builder.identification;
            this.reservedFlag = builder.reservedFlag;
            this.dontFragmentFlag = builder.dontFragmentFlag;
            this.moreFragmentFlag = builder.moreFragmentFlag;
            this.fragmentOffset = builder.fragmentOffset;
            this.ttl = builder.ttl;
            this.protocol = builder.protocol;
            this.srcAddr = builder.srcAddr;
            this.dstAddr = builder.dstAddr;
            this.options = builder.options != null ? new ArrayList(builder.options) : new ArrayList(0);
            if (builder.paddingAtBuild) {
                int measureLengthWithoutPadding = measureLengthWithoutPadding() % 4;
                if (measureLengthWithoutPadding != 0) {
                    this.padding = new byte[4 - measureLengthWithoutPadding];
                } else {
                    this.padding = new byte[0];
                }
            } else if (builder.padding != null) {
                byte[] bArr = new byte[builder.padding.length];
                this.padding = bArr;
                System.arraycopy(builder.padding, 0, bArr, 0, bArr.length);
            } else {
                this.padding = new byte[0];
            }
            if (builder.correctLengthAtBuild) {
                this.ihl = (byte) (length() / 4);
                s10 = (short) (packet != null ? packet.length() + length() : length());
            } else {
                if ((builder.ihl & 240) != 0) {
                    throw new IllegalArgumentException("Invalid ihl: " + ((int) builder.ihl));
                }
                this.ihl = builder.ihl;
                s10 = builder.totalLength;
            }
            this.totalLength = s10;
            if (!builder.correctChecksumAtBuild) {
                s11 = builder.headerChecksum;
            } else {
                if (!PacketPropertiesLoader.getInstance().ipV4CalcChecksum()) {
                    this.headerChecksum = (short) 0;
                    return;
                }
                s11 = calcHeaderChecksum(true);
            }
            this.headerChecksum = s11;
        }

        private IpV4Header(byte[] bArr, int i10, int i11) {
            int i12;
            if (i11 < 20) {
                StringBuilder sb2 = new StringBuilder(110);
                sb2.append("The data is too short to build an IPv4 header. ");
                sb2.append("It must be at least ");
                sb2.append(20);
                sb2.append(" bytes. data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            byte b10 = ByteArrays.getByte(bArr, i10 + 0);
            this.version = IpVersion.getInstance(Byte.valueOf((byte) ((b10 & 240) >> 4)));
            this.ihl = (byte) (b10 & 15);
            this.tos = (IpV4Tos) PacketFactories.getFactory(IpV4Tos.class, NotApplicable.class).newInstance(bArr, i10 + 1, 1);
            this.totalLength = ByteArrays.getShort(bArr, i10 + 2);
            this.identification = ByteArrays.getShort(bArr, i10 + 4);
            short s10 = ByteArrays.getShort(bArr, i10 + 6);
            this.reservedFlag = (32768 & s10) != 0;
            this.dontFragmentFlag = (s10 & 16384) != 0;
            this.moreFragmentFlag = (s10 & 8192) != 0;
            this.fragmentOffset = (short) (s10 & 8191);
            this.ttl = ByteArrays.getByte(bArr, i10 + 8);
            this.protocol = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 9)));
            this.headerChecksum = ByteArrays.getShort(bArr, i10 + 10);
            this.srcAddr = ByteArrays.getInet4Address(bArr, i10 + 12);
            this.dstAddr = ByteArrays.getInet4Address(bArr, i10 + 16);
            int ihlAsInt = getIhlAsInt() * 4;
            if (i11 < ihlAsInt) {
                StringBuilder sb3 = new StringBuilder(110);
                sb3.append("The data is too short to build an IPv4 header(");
                sb3.append(ihlAsInt);
                sb3.append(" bytes). data: ");
                sb3.append(ByteArrays.toHexString(bArr, " "));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            if (ihlAsInt < 20) {
                StringBuilder sb4 = new StringBuilder(100);
                sb4.append("The ihl must be equal or more than");
                sb4.append(5);
                sb4.append("but it is: ");
                sb4.append(getIhlAsInt());
                throw new IllegalRawDataException(sb4.toString());
            }
            this.options = new ArrayList();
            int i13 = 20;
            while (true) {
                i12 = i13;
                if (i13 >= ihlAsInt) {
                    break;
                }
                int i14 = i13 + i10;
                i12 = i13;
                try {
                    IpV4OptionType ipV4OptionType = IpV4OptionType.getInstance(Byte.valueOf(bArr[i14]));
                    int i15 = i13;
                    IpV4Option ipV4Option = (IpV4Option) PacketFactories.getFactory(IpV4Option.class, IpV4OptionType.class).newInstance(bArr, i14, ihlAsInt - i13, ipV4OptionType);
                    int i16 = i13;
                    this.options.add(ipV4Option);
                    int i17 = i13;
                    int length = i13 + ipV4Option.length();
                    i13 = length;
                    if (ipV4Option.getType().equals(IpV4OptionType.END_OF_OPTION_LIST)) {
                        i12 = length;
                        break;
                    }
                } catch (Exception e10) {
                    logger.error("Exception occurred during analyzing IPv4 options: ", (Throwable) e10);
                }
            }
            int i18 = ihlAsInt - i12;
            if (i18 != 0) {
                this.padding = ByteArrays.getSubArray(bArr, i12 + i10, i18);
            } else {
                this.padding = new byte[0];
            }
        }

        private byte[] buildRawData(boolean z10) {
            return ByteArrays.concatenate(getRawFields(z10));
        }

        private short calcHeaderChecksum(boolean z10) {
            return ByteArrays.calcChecksum(buildRawData(z10));
        }

        private List<byte[]> getRawFields(boolean z10) {
            boolean z11 = this.moreFragmentFlag;
            byte b10 = z11 ? 1 : 0;
            if (this.dontFragmentFlag) {
                b10 = (byte) ((z11 ? 1 : 0) | 2);
            }
            byte b11 = b10;
            if (this.reservedFlag) {
                b11 = (byte) (b10 | 4);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((byte) ((this.version.value().byteValue() << 4) | this.ihl)));
            short s10 = 0;
            arrayList.add(new byte[]{this.tos.value()});
            arrayList.add(ByteArrays.toByteArray(this.totalLength));
            arrayList.add(ByteArrays.toByteArray(this.identification));
            arrayList.add(ByteArrays.toByteArray((short) ((b11 << 13) | this.fragmentOffset)));
            arrayList.add(ByteArrays.toByteArray(this.ttl));
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().byteValue()));
            if (!z10) {
                s10 = this.headerChecksum;
            }
            arrayList.add(ByteArrays.toByteArray(s10));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            Iterator<IpV4Option> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            arrayList.add(this.padding);
            return arrayList;
        }

        private int measureLengthWithoutPadding() {
            Iterator<IpV4Option> it = this.options.iterator();
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
            sb2.append("[IPv4 Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Version: ");
            sb2.append(this.version);
            sb2.append(property);
            sb2.append("  IHL: ");
            sb2.append((int) this.ihl);
            sb2.append(" (");
            sb2.append(this.ihl * 4);
            sb2.append(" [bytes])");
            sb2.append(property);
            sb2.append("  TOS: ");
            sb2.append(this.tos);
            sb2.append(property);
            sb2.append("  Total length: ");
            sb2.append(getTotalLengthAsInt());
            sb2.append(" [bytes]");
            sb2.append(property);
            sb2.append("  Identification: ");
            sb2.append(getIdentificationAsInt());
            sb2.append(property);
            sb2.append("  Flags: (Reserved, Don't Fragment, More Fragment) = (");
            sb2.append(getReservedFlag());
            sb2.append(", ");
            sb2.append(getDontFragmentFlag());
            sb2.append(", ");
            sb2.append(getMoreFragmentFlag());
            sb2.append(")");
            sb2.append(property);
            sb2.append("  Fragment offset: ");
            sb2.append((int) this.fragmentOffset);
            sb2.append(" (");
            sb2.append(this.fragmentOffset * 8);
            sb2.append(" [bytes])");
            sb2.append(property);
            sb2.append("  TTL: ");
            sb2.append(getTtlAsInt());
            sb2.append(property);
            sb2.append("  Protocol: ");
            sb2.append(this.protocol);
            sb2.append(property);
            sb2.append("  Header checksum: 0x");
            sb2.append(ByteArrays.toHexString(this.headerChecksum, ""));
            sb2.append(property);
            sb2.append("  Source address: ");
            sb2.append(this.srcAddr);
            sb2.append(property);
            sb2.append("  Destination address: ");
            sb2.append(this.dstAddr);
            sb2.append(property);
            for (IpV4Option ipV4Option : this.options) {
                sb2.append("  Option: ");
                sb2.append(ipV4Option);
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
            int hashCode = this.version.hashCode();
            byte b10 = this.ihl;
            int hashCode2 = this.tos.hashCode();
            short s10 = this.totalLength;
            short s11 = this.identification;
            int i10 = 1231;
            int i11 = this.reservedFlag ? 1231 : 1237;
            int i12 = this.dontFragmentFlag ? 1231 : 1237;
            if (!this.moreFragmentFlag) {
                i10 = 1237;
            }
            return ((((((((((((((((((((((((((((((527 + hashCode) * 31) + b10) * 31) + hashCode2) * 31) + s10) * 31) + s11) * 31) + i11) * 31) + i12) * 31) + i10) * 31) + this.fragmentOffset) * 31) + this.ttl) * 31) + this.protocol.hashCode()) * 31) + this.headerChecksum) * 31) + this.srcAddr.hashCode()) * 31) + this.dstAddr.hashCode()) * 31) + Arrays.hashCode(this.padding)) * 31) + this.options.hashCode();
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
            if (!IpV4Header.class.isInstance(obj)) {
                return false;
            }
            IpV4Header ipV4Header = (IpV4Header) obj;
            if (this.identification != ipV4Header.identification || this.headerChecksum != ipV4Header.headerChecksum || !this.srcAddr.equals(ipV4Header.srcAddr) || !this.dstAddr.equals(ipV4Header.dstAddr) || this.totalLength != ipV4Header.totalLength || !this.protocol.equals(ipV4Header.protocol) || this.ttl != ipV4Header.ttl || this.fragmentOffset != ipV4Header.fragmentOffset || this.reservedFlag != ipV4Header.reservedFlag || this.dontFragmentFlag != ipV4Header.dontFragmentFlag || this.moreFragmentFlag != ipV4Header.moreFragmentFlag || !this.tos.equals(ipV4Header.tos) || this.ihl != ipV4Header.ihl || !this.version.equals(ipV4Header.version) || !this.options.equals(ipV4Header.options) || !Arrays.equals(this.padding, ipV4Header.padding)) {
                z10 = false;
            }
            return z10;
        }

        public boolean getDontFragmentFlag() {
            return this.dontFragmentFlag;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet4Address getDstAddr() {
            return this.dstAddr;
        }

        public short getFragmentOffset() {
            return this.fragmentOffset;
        }

        public short getHeaderChecksum() {
            return this.headerChecksum;
        }

        public short getIdentification() {
            return this.identification;
        }

        public int getIdentificationAsInt() {
            return this.identification & 65535;
        }

        public byte getIhl() {
            return this.ihl;
        }

        public int getIhlAsInt() {
            return this.ihl & 255;
        }

        public boolean getMoreFragmentFlag() {
            return this.moreFragmentFlag;
        }

        public List<IpV4Option> getOptions() {
            return new ArrayList(this.options);
        }

        public byte[] getPadding() {
            byte[] bArr = this.padding;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpNumber getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public boolean getReservedFlag() {
            return this.reservedFlag;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public Inet4Address getSrcAddr() {
            return this.srcAddr;
        }

        public IpV4Tos getTos() {
            return this.tos;
        }

        public short getTotalLength() {
            return this.totalLength;
        }

        public int getTotalLengthAsInt() {
            return this.totalLength & 65535;
        }

        public byte getTtl() {
            return this.ttl;
        }

        public int getTtlAsInt() {
            return this.ttl & 255;
        }

        @Override // org.pcap4j.packet.IpPacket.IpHeader
        public IpVersion getVersion() {
            return this.version;
        }

        public boolean hasValidChecksum(boolean z10) {
            if (calcHeaderChecksum(false) == 0) {
                return true;
            }
            return this.headerChecksum == 0 && z10;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Packet$IpV4Option.class */
    public interface IpV4Option extends Serializable {
        byte[] getRawData();

        IpV4OptionType getType();

        int length();
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4Packet$IpV4Tos.class */
    public interface IpV4Tos extends Serializable {
        byte value();
    }

    private IpV4Packet(Builder builder) {
        if (builder != null && builder.version != null && builder.tos != null && builder.protocol != null && builder.srcAddr != null && builder.dstAddr != null) {
            Packet build = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = build;
            this.header = new IpV4Header(builder, build);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.version: " + builder.version + " builder.tos: " + builder.tos + " builder.protocol: " + builder.protocol + " builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
    }

    private IpV4Packet(byte[] bArr, int i10, int i11) {
        IpV4Header ipV4Header = new IpV4Header(bArr, i10, i11);
        this.header = ipV4Header;
        int length = i11 - ipV4Header.length();
        int totalLengthAsInt = ipV4Header.getTotalLengthAsInt();
        if (totalLengthAsInt == 0) {
            logger.debug("Total Length is 0. Assuming segmentation offload to be working.");
        } else {
            int length2 = totalLengthAsInt - ipV4Header.length();
            if (length2 < 0) {
                throw new IllegalRawDataException("The value of total length field seems to be wrong: " + totalLengthAsInt);
            }
            if (length2 <= length) {
                length = length2;
            }
        }
        if (length != 0) {
            this.payload = (Packet) ((ipV4Header.getMoreFragmentFlag() || ipV4Header.getFragmentOffset() != 0) ? PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, ipV4Header.length() + i10, length, NotApplicable.FRAGMENTED) : PacketFactories.getFactory(Packet.class, IpNumber.class).newInstance(bArr, ipV4Header.length() + i10, length, ipV4Header.getProtocol()));
        } else {
            this.payload = null;
        }
    }

    public static IpV4Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4Packet(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV4Header getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
