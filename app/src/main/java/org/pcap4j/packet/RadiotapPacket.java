package org.pcap4j.packet;

import java.io.Serializable;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.packet.namednumber.RadiotapPresentBitNumber;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPacket.class */
public final class RadiotapPacket extends AbstractPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) RadiotapPacket.class);
    private static final long serialVersionUID = 4121827899399388949L;
    private final RadiotapHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<RadiotapPacket> {
        private boolean correctLengthAtBuild;
        private List<RadiotapData> dataFields;
        private short length;
        private byte pad;
        private Packet.Builder payloadBuilder;
        private List<RadiotapPresentBitmask> presentBitmasks;
        private byte version;

        public Builder() {
        }

        private Builder(RadiotapPacket radiotapPacket) {
            this.version = radiotapPacket.header.version;
            this.pad = radiotapPacket.header.pad;
            this.length = radiotapPacket.header.length;
            this.presentBitmasks = radiotapPacket.header.presentBitmasks;
            this.dataFields = radiotapPacket.header.dataFields;
            this.payloadBuilder = radiotapPacket.payload != null ? radiotapPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public RadiotapPacket build() {
            return new RadiotapPacket(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<RadiotapPacket> correctLengthAtBuild2(boolean z10) {
            this.correctLengthAtBuild = z10;
            return this;
        }

        public Builder dataFields(List<RadiotapData> list) {
            this.dataFields = list;
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

        public Builder pad(byte b10) {
            this.pad = b10;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder presentBitmasks(List<RadiotapPresentBitmask> list) {
            this.presentBitmasks = list;
            return this;
        }

        public Builder version(byte b10) {
            this.version = b10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPacket$RadiotapData.class */
    public interface RadiotapData extends Serializable {
        byte[] getRawData();

        int length();

        String toString(String str);
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapPacket$RadiotapHeader.class */
    public static final class RadiotapHeader extends AbstractPacket.AbstractHeader {
        private static final int LENGTH_OFFSET = 2;
        private static final int LENGTH_SIZE = 2;
        private static final int MIN_RADIOTAP_HEADER_SIZE = 8;
        private static final int PAD_OFFSET = 1;
        private static final int PAD_SIZE = 1;
        private static final int PRESENT_OFFSET = 4;
        private static final int PRESENT_SIZE = 4;
        private static final int VERSION_OFFSET = 0;
        private static final int VERSION_SIZE = 1;
        private static final long serialVersionUID = -5384412750993783312L;
        private final List<RadiotapData> dataFields;
        private final short length;
        private final byte pad;
        private final List<RadiotapPresentBitmask> presentBitmasks;
        private final byte version;

        private RadiotapHeader(Builder builder) {
            this.version = builder.version;
            this.pad = builder.pad;
            this.presentBitmasks = new ArrayList(builder.presentBitmasks);
            this.dataFields = new ArrayList(builder.dataFields);
            this.length = builder.correctLengthAtBuild ? (short) calcLength() : builder.length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private RadiotapHeader(byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            if (i11 < 8) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build a RadiotapHeader (");
                sb2.append(8);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.version = ByteArrays.getByte(bArr, i10 + 0);
            this.pad = ByteArrays.getByte(bArr, i10 + 1);
            this.length = ByteArrays.getShort(bArr, i10 + 2, ByteOrder.LITTLE_ENDIAN);
            this.presentBitmasks = new ArrayList();
            if (i11 < getLengthAsInt()) {
                StringBuilder sb3 = new StringBuilder(200);
                sb3.append("The data is too short to build a RadiotapHeader (");
                sb3.append(getLengthAsInt());
                sb3.append(" bytes). data: ");
                sb3.append(ByteArrays.toHexString(bArr, " "));
                sb3.append(", offset: ");
                sb3.append(i10);
                sb3.append(", length: ");
                sb3.append(i11);
                throw new IllegalRawDataException(sb3.toString());
            }
            if (getLengthAsInt() < 8) {
                StringBuilder sb4 = new StringBuilder(200);
                sb4.append("The value of the length field is too small to build a RadiotapHeader (");
                sb4.append(8);
                sb4.append(" bytes). data: ");
                sb4.append(ByteArrays.toHexString(bArr, " "));
                sb4.append(", offset: ");
                sb4.append(i10);
                sb4.append(", length: ");
                sb4.append(i11);
                throw new IllegalRawDataException(sb4.toString());
            }
            int lengthAsInt = getLengthAsInt() - 4;
            int i14 = i10 + 4;
            while (true) {
                String str = "";
                while (true) {
                    String str2 = str;
                    int i15 = 0;
                    while (lengthAsInt >= 4) {
                        RadiotapPresentBitmask newInstance = RadiotapPresentBitmask.newInstance(bArr, i14, lengthAsInt, i15, str2);
                        this.presentBitmasks.add(newInstance);
                        i14 += 4;
                        lengthAsInt -= 4;
                        if (!newInstance.isAnotherBitmapFollows()) {
                            this.dataFields = new ArrayList();
                            PacketFactory factory = PacketFactories.getFactory(RadiotapData.class, RadiotapPresentBitNumber.class);
                            Class targetClass = factory.getTargetClass();
                            try {
                                Iterator<RadiotapPresentBitmask> it = this.presentBitmasks.iterator();
                                boolean z10 = false;
                                int i16 = i14;
                                int i17 = lengthAsInt;
                                while (true) {
                                    i13 = i17;
                                    i12 = i16;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    int i18 = i17;
                                    RadiotapPresentBitmask next = it.next();
                                    if (z10) {
                                        i13 = i17;
                                        i12 = i16;
                                        break;
                                    }
                                    Iterator<RadiotapPresentBitNumber> it2 = next.getBitNumbers().iterator();
                                    while (true) {
                                        int i19 = i17;
                                        if (it2.hasNext()) {
                                            int i20 = i17;
                                            RadiotapPresentBitNumber next2 = it2.next();
                                            int i21 = i17;
                                            int requiredAlignment = next2.getRequiredAlignment();
                                            int i22 = requiredAlignment - ((i16 - i10) % requiredAlignment);
                                            if (i22 != requiredAlignment) {
                                                if (i17 < i22) {
                                                    int i23 = i17;
                                                    StringBuilder sb5 = new StringBuilder(200);
                                                    int i24 = i17;
                                                    sb5.append("Not enough length for a RadiotapDataPad: ");
                                                    int i25 = i17;
                                                    sb5.append(ByteArrays.toHexString(bArr, " "));
                                                    int i26 = i17;
                                                    sb5.append(", offset: ");
                                                    int i27 = i17;
                                                    sb5.append(i10);
                                                    int i28 = i17;
                                                    sb5.append(", length: ");
                                                    int i29 = i17;
                                                    sb5.append(i11);
                                                    int i30 = i17;
                                                    int i31 = i17;
                                                    IllegalRawDataException illegalRawDataException = new IllegalRawDataException(sb5.toString());
                                                    int i32 = i17;
                                                    throw illegalRawDataException;
                                                }
                                                RadiotapDataPad newInstance2 = RadiotapDataPad.newInstance(bArr, i16, i22);
                                                int i33 = i17;
                                                this.dataFields.add(newInstance2);
                                                i16 += i22;
                                                i17 -= i22;
                                            }
                                            if (i17 <= 0) {
                                                int i34 = i17;
                                                StringBuilder sb6 = new StringBuilder(200);
                                                int i35 = i17;
                                                sb6.append("No data is remaining for a RadiotapDataField: ");
                                                int i36 = i17;
                                                sb6.append(ByteArrays.toHexString(bArr, " "));
                                                int i37 = i17;
                                                sb6.append(", offset: ");
                                                int i38 = i17;
                                                sb6.append(i10);
                                                int i39 = i17;
                                                sb6.append(", length: ");
                                                int i40 = i17;
                                                sb6.append(i11);
                                                int i41 = i17;
                                                int i42 = i17;
                                                IllegalRawDataException illegalRawDataException2 = new IllegalRawDataException(sb6.toString());
                                                int i43 = i17;
                                                throw illegalRawDataException2;
                                            }
                                            RadiotapData radiotapData = (RadiotapData) factory.newInstance(bArr, i16, i17, next2);
                                            int i44 = i17;
                                            this.dataFields.add(radiotapData);
                                            int i45 = i17;
                                            int length = radiotapData.length();
                                            i16 += length;
                                            i17 -= length;
                                            if (radiotapData.getClass().equals(targetClass)) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                RadiotapPacket.logger.error("Exception occurred during analyzing Radiotap data fields: ", (Throwable) e10);
                                i12 = i14;
                                i13 = lengthAsInt;
                            }
                            if (i13 != 0) {
                                this.dataFields.add(factory.newInstance(bArr, i12, i13));
                                return;
                            }
                            return;
                        }
                        if (newInstance.isRadiotapNamespaceNext()) {
                            break;
                        } else if (newInstance.isVendorNamespaceNext()) {
                            break;
                        } else {
                            i15 += 32;
                        }
                    }
                    StringBuilder sb7 = new StringBuilder(200);
                    sb7.append("Something went wrong during parsing present bitmasks. data: ");
                    sb7.append(ByteArrays.toHexString(bArr, " "));
                    sb7.append(", offset: ");
                    sb7.append(i10);
                    sb7.append(", length: ");
                    sb7.append(i11);
                    throw new IllegalRawDataException(sb7.toString());
                    str = "unknown";
                }
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[Radiotap header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Version: ");
            sb2.append(getVersionAsInt());
            sb2.append(property);
            sb2.append("  Pad: ");
            sb2.append((int) this.pad);
            sb2.append(property);
            sb2.append("  Length: ");
            sb2.append(getLengthAsInt());
            sb2.append(property);
            Iterator<RadiotapPresentBitmask> it = this.presentBitmasks.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString("  "));
            }
            sb2.append("  Data Fields: ");
            sb2.append(property);
            Iterator<RadiotapData> it2 = this.dataFields.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString("    "));
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((527 + this.version) * 31) + this.pad) * 31) + this.length) * 31) + this.presentBitmasks.hashCode()) * 31) + this.dataFields.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int size = (this.presentBitmasks.size() * 4) + 4;
            Iterator<RadiotapData> it = this.dataFields.iterator();
            while (it.hasNext()) {
                size += it.next().length();
            }
            return size;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!RadiotapHeader.class.isInstance(obj)) {
                return false;
            }
            RadiotapHeader radiotapHeader = (RadiotapHeader) obj;
            if (this.length != radiotapHeader.length || this.version != radiotapHeader.version || this.pad != radiotapHeader.pad || !this.presentBitmasks.equals(radiotapHeader.presentBitmasks) || !this.dataFields.equals(radiotapHeader.dataFields)) {
                z10 = false;
            }
            return z10;
        }

        public ArrayList<RadiotapData> getDataFields() {
            return new ArrayList<>(this.dataFields);
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return this.length & 65535;
        }

        public byte getPad() {
            return this.pad;
        }

        public ArrayList<RadiotapPresentBitmask> getPresentBitmasks() {
            return new ArrayList<>(this.presentBitmasks);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.version));
            arrayList.add(ByteArrays.toByteArray(this.pad));
            arrayList.add(ByteArrays.toByteArray(this.length, ByteOrder.LITTLE_ENDIAN));
            Iterator<RadiotapPresentBitmask> it = this.presentBitmasks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            Iterator<RadiotapData> it2 = this.dataFields.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getRawData());
            }
            return arrayList;
        }

        public byte getVersion() {
            return this.version;
        }

        public int getVersionAsInt() {
            return this.version & 255;
        }
    }

    private RadiotapPacket(Builder builder) {
        if (builder != null && builder.presentBitmasks != null && builder.dataFields != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new RadiotapHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.presentBitmasks: " + builder.presentBitmasks + " builder.dataFields: " + builder.dataFields);
    }

    private RadiotapPacket(byte[] bArr, int i10, int i11) {
        RadiotapHeader radiotapHeader = new RadiotapHeader(bArr, i10, i11);
        this.header = radiotapHeader;
        int length = i11 - radiotapHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(bArr, i10 + radiotapHeader.length(), length, DataLinkType.IEEE802_11);
        } else {
            this.payload = null;
        }
    }

    public static RadiotapPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new RadiotapPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public RadiotapHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }
}
