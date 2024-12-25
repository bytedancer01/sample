package org.pcap4j.packet;

import java.nio.charset.Charset;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SsidElement.class */
public final class Dot11SsidElement extends Dot11InformationElement {
    private static final Charset ENCODING = Charset.forName("UTF-8");
    private static final long serialVersionUID = 2213115521616826185L;
    private final String ssid;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SsidElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private String ssid;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SSID.value()));
        }

        private Builder(Dot11SsidElement dot11SsidElement) {
            super(dot11SsidElement);
            this.ssid = dot11SsidElement.ssid;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.ssid != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) this.ssid.getBytes(Dot11SsidElement.ENCODING).length);
                }
                return new Dot11SsidElement(this);
            }
            throw new NullPointerException("ssid: " + this.ssid);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder ssid(String str) {
            this.ssid = str;
            return this;
        }
    }

    private Dot11SsidElement(Builder builder) {
        super(builder);
        if (builder.ssid.getBytes(ENCODING).length <= 255) {
            this.ssid = builder.ssid;
            return;
        }
        throw new IllegalArgumentException("Too long ssid: " + builder.ssid);
    }

    private Dot11SsidElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.SSID);
        this.ssid = new String(bArr, i10 + 2, getLengthAsInt(), ENCODING);
    }

    public static Dot11SsidElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11SsidElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ssid.equals(((Dot11SsidElement) obj).ssid);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bytes = this.ssid.getBytes(ENCODING);
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return bArr;
    }

    public String getSsid() {
        return this.ssid;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.ssid.hashCode();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.ssid.getBytes(ENCODING).length + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("SSID:");
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
        sb2.append("  SSID: ");
        sb2.append(this.ssid);
        sb2.append(property);
        return sb2.toString();
    }
}
