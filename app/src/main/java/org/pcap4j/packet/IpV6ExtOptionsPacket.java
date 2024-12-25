package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpV6OptionType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtOptionsPacket.class */
public abstract class IpV6ExtOptionsPacket extends AbstractPacket {
    private static final long serialVersionUID = 416178196599916582L;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtOptionsPacket$Builder.class */
    public static abstract class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<IpV6ExtOptionsPacket> {
        private boolean correctLengthAtBuild;
        private byte hdrExtLen;
        private IpNumber nextHeader;
        private List<IpV6Option> options;
        private Packet.Builder payloadBuilder;

        public Builder() {
        }

        public Builder(IpV6ExtOptionsPacket ipV6ExtOptionsPacket) {
            this.nextHeader = ipV6ExtOptionsPacket.getHeader().nextHeader;
            this.hdrExtLen = ipV6ExtOptionsPacket.getHeader().hdrExtLen;
            this.options = ipV6ExtOptionsPacket.getHeader().options;
            this.payloadBuilder = ipV6ExtOptionsPacket.payload != null ? ipV6ExtOptionsPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6ExtOptionsPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder hdrExtLen(byte b10) {
            this.hdrExtLen = b10;
            return this;
        }

        public Builder nextHeader(IpNumber ipNumber) {
            this.nextHeader = ipNumber;
            return this;
        }

        public Builder options(List<IpV6Option> list) {
            this.options = list;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtOptionsPacket$IpV6ExtOptionsHeader.class */
    public static abstract class IpV6ExtOptionsHeader extends AbstractPacket.AbstractHeader {
        private static final int HDR_EXT_LEN_OFFSET = 1;
        private static final int HDR_EXT_LEN_SIZE = 1;
        private static final int NEXT_HEADER_OFFSET = 0;
        private static final int NEXT_HEADER_SIZE = 1;
        private static final int OPTIONS_OFFSET = 2;
        private static final long serialVersionUID = 224822728201337667L;
        private final byte hdrExtLen;
        private final IpNumber nextHeader;
        private final List<IpV6Option> options;

        public IpV6ExtOptionsHeader(Builder builder) {
            int i10;
            Iterator it = builder.options.iterator();
            int i11 = 0;
            while (true) {
                i10 = i11;
                if (!it.hasNext()) {
                    break;
                } else {
                    i11 = i10 + ((IpV6Option) it.next()).length();
                }
            }
            int i12 = i10 + 2;
            if (i12 % 8 == 0) {
                this.nextHeader = builder.nextHeader;
                this.options = new ArrayList(builder.options);
                this.hdrExtLen = builder.correctLengthAtBuild ? (byte) ((i12 / 8) - 1) : builder.hdrExtLen;
                return;
            }
            StringBuilder sb2 = new StringBuilder(200);
            String property = System.getProperty("line.separator");
            sb2.append("options length is invalid.");
            sb2.append(" ([options length] + 2) % 8 must be 0.");
            sb2.append(" options: ");
            sb2.append(property);
            Iterator it2 = builder.options.iterator();
            while (it2.hasNext()) {
                sb2.append((IpV6Option) it2.next());
                sb2.append(property);
            }
            throw new IllegalArgumentException(sb2.toString());
        }

        public IpV6ExtOptionsHeader(byte[] bArr, int i10, int i11) {
            if (i11 < 2) {
                StringBuilder sb2 = new StringBuilder(110);
                sb2.append("The data length of ");
                sb2.append(getHeaderName());
                sb2.append(" is must be more than 1. data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.nextHeader = IpNumber.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i10 + 0)));
            this.hdrExtLen = ByteArrays.getByte(bArr, i10 + 1);
            int hdrExtLenAsInt = (getHdrExtLenAsInt() + 1) * 8;
            if (i11 < hdrExtLenAsInt) {
                StringBuilder sb3 = new StringBuilder(110);
                sb3.append("The data is too short to build an ");
                sb3.append(getHeaderName());
                sb3.append("(");
                sb3.append(hdrExtLenAsInt);
                sb3.append(" bytes). data: ");
                sb3.append(ByteArrays.toHexString(bArr, " "));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            this.options = new ArrayList();
            int i12 = 2;
            while (true) {
                int i13 = i12;
                if (i13 >= hdrExtLenAsInt) {
                    return;
                }
                int i14 = i13 + i10;
                try {
                    IpV6Option ipV6Option = (IpV6Option) PacketFactories.getFactory(IpV6Option.class, IpV6OptionType.class).newInstance(bArr, i14, hdrExtLenAsInt - i13, IpV6OptionType.getInstance(Byte.valueOf(bArr[i14])));
                    this.options.add(ipV6Option);
                    i12 = i13 + ipV6Option.length();
                } catch (Exception e10) {
                    return;
                }
            }
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
            sb2.append("  Next Header: ");
            sb2.append(this.nextHeader);
            sb2.append(property);
            sb2.append("  Hdr Ext Len: ");
            sb2.append(getHdrExtLenAsInt());
            sb2.append(" (");
            sb2.append((getHdrExtLenAsInt() + 1) * 8);
            sb2.append(" [bytes])");
            sb2.append(property);
            sb2.append("  Options: ");
            sb2.append(property);
            for (IpV6Option ipV6Option : this.options) {
                sb2.append("    ");
                sb2.append(ipV6Option);
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((527 + this.nextHeader.hashCode()) * 31) + this.hdrExtLen) * 31) + this.options.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<IpV6Option> it = this.options.iterator();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11 + 2;
                }
                i10 = i11 + it.next().length();
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!getClass().isInstance(obj)) {
                return false;
            }
            IpV6ExtOptionsHeader ipV6ExtOptionsHeader = (IpV6ExtOptionsHeader) obj;
            if (!this.nextHeader.equals(ipV6ExtOptionsHeader.nextHeader) || this.hdrExtLen != ipV6ExtOptionsHeader.hdrExtLen || !this.options.equals(ipV6ExtOptionsHeader.options)) {
                z10 = false;
            }
            return z10;
        }

        public byte getHdrExtLen() {
            return this.hdrExtLen;
        }

        public int getHdrExtLenAsInt() {
            return this.hdrExtLen & 255;
        }

        public abstract String getHeaderName();

        public IpNumber getNextHeader() {
            return this.nextHeader;
        }

        public List<IpV6Option> getOptions() {
            return new ArrayList(this.options);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.nextHeader.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.hdrExtLen));
            Iterator<IpV6Option> it = this.options.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6ExtOptionsPacket$IpV6Option.class */
    public interface IpV6Option extends Serializable {
        byte[] getRawData();

        IpV6OptionType getType();

        int length();
    }

    public IpV6ExtOptionsPacket() {
        this.payload = null;
    }

    public IpV6ExtOptionsPacket(Builder builder) {
        if (builder != null && builder.nextHeader != null && builder.options != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.nextHeader: " + builder.nextHeader + " builder.options: " + builder.options);
    }

    public IpV6ExtOptionsPacket(byte[] bArr, int i10, int i11, IpNumber ipNumber) {
        Object newInstance;
        Packet packet;
        PacketFactory factory = PacketFactories.getFactory(Packet.class, IpNumber.class);
        if (factory.getTargetClass(ipNumber).equals(factory.getTargetClass())) {
            Packet packet2 = (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10, i11, NotApplicable.UNKNOWN_IP_V6_EXTENSION);
            packet = packet2;
            newInstance = packet2 instanceof IllegalPacket ? factory.newInstance(bArr, i10, i11) : newInstance;
            this.payload = packet;
        }
        newInstance = factory.newInstance(bArr, i10, i11, ipNumber);
        packet = (Packet) newInstance;
        this.payload = packet;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract IpV6ExtOptionsHeader getHeader();

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
