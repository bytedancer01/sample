package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SsidListElement.class */
public final class Dot11SsidListElement extends Dot11InformationElement {
    private static final long serialVersionUID = 1424839847229135121L;
    private final List<Dot11SsidElement> ssidList;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SsidListElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private List<Dot11SsidElement> ssidList;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SSID_LIST.value()));
        }

        private Builder(Dot11SsidListElement dot11SsidListElement) {
            super(dot11SsidListElement);
            this.ssidList = dot11SsidListElement.ssidList;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            List<Dot11SsidElement> list = this.ssidList;
            if (list == null) {
                throw new NullPointerException("ssidList: " + this.ssidList);
            }
            int i10 = 0;
            Iterator<Dot11SsidElement> it = list.iterator();
            while (it.hasNext()) {
                i10 += it.next().length();
            }
            if (i10 <= 255) {
                if (getCorrectLengthAtBuild()) {
                    length((byte) i10);
                }
                return new Dot11SsidListElement(this);
            }
            throw new IllegalArgumentException("Too long ssidList: " + this.ssidList);
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

        public Builder ssidList(List<Dot11SsidElement> list) {
            this.ssidList = list;
            return this;
        }
    }

    private Dot11SsidListElement(Builder builder) {
        super(builder);
        this.ssidList = new ArrayList(builder.ssidList);
    }

    private Dot11SsidListElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.SSID_LIST);
        int lengthAsInt = getLengthAsInt();
        this.ssidList = new ArrayList();
        int i12 = i10 + 2;
        int i13 = lengthAsInt;
        int i14 = i12;
        while (true) {
            int i15 = i14;
            if (i13 <= 0) {
                return;
            }
            Dot11SsidElement newInstance = Dot11SsidElement.newInstance(bArr, i15, i13);
            this.ssidList.add(newInstance);
            int length = newInstance.length();
            i13 -= length;
            i14 = i15 + length;
        }
    }

    public static Dot11SsidListElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11SsidListElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ssidList.equals(((Dot11SsidListElement) obj).ssidList);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Dot11SsidElement> it = this.ssidList.iterator();
        int i10 = 2;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return bArr;
            }
            byte[] rawData = it.next().getRawData();
            System.arraycopy(rawData, 0, bArr, i11, rawData.length);
            i10 = i11 + rawData.length;
        }
    }

    public List<Dot11SsidElement> getSsidList() {
        return new ArrayList(this.ssidList);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.ssidList.hashCode();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        Iterator<Dot11SsidElement> it = this.ssidList.iterator();
        int i10 = 2;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            i10 = i11 + it.next().length();
        }
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("SSID List:");
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
        for (Dot11SsidElement dot11SsidElement : this.ssidList) {
            sb2.append(str);
            sb2.append("  SSID: ");
            sb2.append(dot11SsidElement.getSsid());
            sb2.append(property);
        }
        return sb2.toString();
    }
}
