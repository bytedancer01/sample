package org.pcap4j.packet;

import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11DsssParameterSetElement.class */
public final class Dot11DsssParameterSetElement extends Dot11InformationElement {
    private static final long serialVersionUID = 3289074676325930942L;
    private final byte currentChannel;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11DsssParameterSetElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private byte currentChannel;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.DSSS_PARAMETER_SET.value()));
        }

        private Builder(Dot11DsssParameterSetElement dot11DsssParameterSetElement) {
            super(dot11DsssParameterSetElement);
            this.currentChannel = dot11DsssParameterSetElement.currentChannel;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 1);
            }
            return new Dot11DsssParameterSetElement(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder currentChannel(byte b10) {
            this.currentChannel = b10;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }
    }

    private Dot11DsssParameterSetElement(Builder builder) {
        super(builder);
        this.currentChannel = builder.currentChannel;
    }

    private Dot11DsssParameterSetElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.DSSS_PARAMETER_SET);
        if (getLengthAsInt() == 1) {
            this.currentChannel = bArr[i10 + 2];
            return;
        }
        throw new IllegalRawDataException("The length must be 1 but is actually: " + getLengthAsInt());
    }

    public static Dot11DsssParameterSetElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11DsssParameterSetElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.currentChannel == ((Dot11DsssParameterSetElement) obj).currentChannel;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte getCurrentChannel() {
        return this.currentChannel;
    }

    public int getCurrentChannelAsInt() {
        return this.currentChannel & 255;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        return new byte[]{getElementId().value().byteValue(), getLength(), this.currentChannel};
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.currentChannel;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 3;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("DSSS Parameter Set:");
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
        sb2.append("  Current Channel: ");
        sb2.append(getCurrentChannelAsInt());
        sb2.append(property);
        return sb2.toString();
    }
}
