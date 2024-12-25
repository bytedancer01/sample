package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11RequestElement.class */
public final class Dot11RequestElement extends Dot11InformationElement {
    private static final long serialVersionUID = -4248529314922213901L;
    private final List<Dot11InformationElementId> requestedElementIds;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11RequestElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11InformationElementId> requestedElementIds;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.REQUEST.value()));
        }

        private Builder(Dot11RequestElement dot11RequestElement) {
            super(dot11RequestElement);
            this.requestedElementIds = dot11RequestElement.requestedElementIds;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (this.requestedElementIds != null) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) this.requestedElementIds.size());
                }
                return new Dot11RequestElement(this);
            }
            throw new NullPointerException("requestedElementIds: " + this.requestedElementIds);
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

        public Builder requestedElementIds(List<Dot11InformationElementId> list) {
            this.requestedElementIds = list;
            return this;
        }
    }

    private Dot11RequestElement(Builder builder) {
        super(builder);
        if (builder.requestedElementIds.size() <= 255) {
            this.requestedElementIds = new ArrayList(builder.requestedElementIds);
            return;
        }
        throw new IllegalArgumentException("Too long requestedElementIds: " + builder.requestedElementIds);
    }

    private Dot11RequestElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.REQUEST);
        int lengthAsInt = getLengthAsInt();
        this.requestedElementIds = new ArrayList(lengthAsInt);
        for (int i12 = 0; i12 < lengthAsInt; i12++) {
            this.requestedElementIds.add(Dot11InformationElementId.getInstance(Byte.valueOf(bArr[i10 + 2 + i12])));
        }
    }

    public static Dot11RequestElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11RequestElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.requestedElementIds.equals(((Dot11RequestElement) obj).requestedElementIds);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        int i10 = 0;
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Dot11InformationElementId> it = this.requestedElementIds.iterator();
        while (it.hasNext()) {
            bArr[i10 + 2] = it.next().value().byteValue();
            i10++;
        }
        return bArr;
    }

    public List<Dot11InformationElementId> getRequestedElementIds() {
        return new ArrayList(this.requestedElementIds);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.requestedElementIds.hashCode();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.requestedElementIds.size() + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Request:");
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
        for (Dot11InformationElementId dot11InformationElementId : this.requestedElementIds) {
            sb2.append(str);
            sb2.append("  Requested Element: ");
            sb2.append(dot11InformationElementId);
            sb2.append(property);
        }
        return sb2.toString();
    }
}
