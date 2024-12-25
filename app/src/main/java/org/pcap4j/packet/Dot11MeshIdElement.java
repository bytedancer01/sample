package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11MeshIdElement.class */
public final class Dot11MeshIdElement extends Dot11InformationElement {
    private static final long serialVersionUID = 8808363321385383483L;
    private final byte[] meshId;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11MeshIdElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private byte[] meshId;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.MESH_ID.value()));
        }

        private Builder(Dot11MeshIdElement dot11MeshIdElement) {
            super(dot11MeshIdElement);
            this.meshId = dot11MeshIdElement.meshId;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.meshId == null) {
                throw new NullPointerException("meshId is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.meshId.length);
            }
            return new Dot11MeshIdElement(this);
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

        public Builder meshId(byte[] bArr) {
            this.meshId = bArr;
            return this;
        }
    }

    private Dot11MeshIdElement(Builder builder) {
        super(builder);
        if (builder.meshId.length <= 255) {
            this.meshId = ByteArrays.clone(builder.meshId);
            return;
        }
        throw new IllegalArgumentException("Too long meshId: " + builder.meshId);
    }

    private Dot11MeshIdElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.MESH_ID);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt == 0) {
            this.meshId = new byte[0];
        } else {
            this.meshId = ByteArrays.getSubArray(bArr, i10 + 2, lengthAsInt);
        }
    }

    public static Dot11MeshIdElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11MeshIdElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && Arrays.equals(this.meshId, ((Dot11MeshIdElement) obj).meshId);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getMeshId() {
        return ByteArrays.clone(this.meshId);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte[] bArr2 = this.meshId;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.meshId);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.meshId.length + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Mesh ID:");
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
        sb2.append("  Mesh ID: ");
        sb2.append(new String(this.meshId));
        sb2.append(" (0x");
        sb2.append(ByteArrays.toHexString(this.meshId, ""));
        sb2.append(")");
        sb2.append(property);
        return sb2.toString();
    }
}
