package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11ChannelUsageMode;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ChannelUsageElement.class */
public final class Dot11ChannelUsageElement extends Dot11InformationElement {
    private static final long serialVersionUID = -6935079967608347323L;
    private final List<Dot11ChannelEntry> channelEntries;
    private final Dot11ChannelUsageMode usageMode;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ChannelUsageElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11ChannelEntry> channelEntries;
        private Dot11ChannelUsageMode usageMode;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.CHANNEL_USAGE.value()));
        }

        private Builder(Dot11ChannelUsageElement dot11ChannelUsageElement) {
            super(dot11ChannelUsageElement);
            this.usageMode = dot11ChannelUsageElement.usageMode;
            this.channelEntries = dot11ChannelUsageElement.channelEntries;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.usageMode == null) {
                throw new NullPointerException("usageMode is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) ((this.channelEntries.size() * 2) + 1));
            }
            return new Dot11ChannelUsageElement(this);
        }

        public Builder channelEntries(List<Dot11ChannelEntry> list) {
            this.channelEntries = list;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder usageMode(Dot11ChannelUsageMode dot11ChannelUsageMode) {
            this.usageMode = dot11ChannelUsageMode;
            return this;
        }
    }

    private Dot11ChannelUsageElement(Builder builder) {
        super(builder);
        if (builder.channelEntries.size() > 127) {
            throw new IllegalArgumentException("Too long channelEntries: " + builder.channelEntries);
        }
        this.usageMode = builder.usageMode;
        if (builder.channelEntries == null) {
            this.channelEntries = Collections.emptyList();
        } else {
            this.channelEntries = new ArrayList(builder.channelEntries);
        }
    }

    private Dot11ChannelUsageElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.CHANNEL_USAGE);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt < 1) {
            throw new IllegalRawDataException("The length must be more than 0 but is actually: " + lengthAsInt);
        }
        if ((lengthAsInt - 1) % 2 != 0) {
            throw new IllegalRawDataException("The ((length - 1) % 2) must be 0. length: " + lengthAsInt);
        }
        this.usageMode = Dot11ChannelUsageMode.getInstance(Byte.valueOf(bArr[i10 + 2]));
        int i12 = lengthAsInt - 1;
        this.channelEntries = new ArrayList((i12 - 1) / 2);
        int i13 = i10 + 3;
        int i14 = i12;
        while (i14 > 0) {
            this.channelEntries.add(new Dot11ChannelEntry(bArr[i13], bArr[i13 + 1]));
            i14 -= 2;
            i13 += 2;
        }
    }

    public static Dot11ChannelUsageElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11ChannelUsageElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot11ChannelUsageElement dot11ChannelUsageElement = (Dot11ChannelUsageElement) obj;
        return this.channelEntries.equals(dot11ChannelUsageElement.channelEntries) && this.usageMode.equals(dot11ChannelUsageElement.usageMode);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public ArrayList<Dot11ChannelEntry> getChannelEntries() {
        return new ArrayList<>(this.channelEntries);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        bArr[2] = this.usageMode.value().byteValue();
        int i10 = 3;
        for (Dot11ChannelEntry dot11ChannelEntry : this.channelEntries) {
            bArr[i10] = dot11ChannelEntry.getOperatingClass();
            bArr[i10 + 1] = dot11ChannelEntry.getChannel();
            i10 += 2;
        }
        return bArr;
    }

    public Dot11ChannelUsageMode getUsageMode() {
        return this.usageMode;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (((super.hashCode() * 31) + this.channelEntries.hashCode()) * 31) + this.usageMode.hashCode();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return (this.channelEntries.size() * 2) + 3;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Channel Usage:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Element ID: ");
        sb2.append(getElementId());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Usage Mode: ");
        sb2.append(this.usageMode);
        sb2.append(property);
        for (Dot11ChannelEntry dot11ChannelEntry : this.channelEntries) {
            sb2.append(str);
            sb2.append("  Channel Entry: ");
            sb2.append(dot11ChannelEntry);
            sb2.append(property);
        }
        return sb2.toString();
    }
}
