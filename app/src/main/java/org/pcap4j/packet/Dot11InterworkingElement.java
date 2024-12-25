package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11AccessNetworkType;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.packet.namednumber.Dot11VenueInfo;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11InterworkingElement.class */
public final class Dot11InterworkingElement extends Dot11InformationElement {
    private static final long serialVersionUID = -5151120333283703306L;
    private final Dot11AccessNetworkType accessnetworkType;
    private final boolean asra;
    private final boolean esr;
    private final byte[] hessid;
    private final boolean internet;
    private final boolean uesa;
    private final Dot11VenueInfo venueInfo;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11InterworkingElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private Dot11AccessNetworkType accessnetworkType;
        private boolean asra;
        private boolean esr;
        private byte[] hessid;
        private boolean internet;
        private boolean uesa;
        private Dot11VenueInfo venueInfo;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.INTERWORKING.value()));
        }

        private Builder(Dot11InterworkingElement dot11InterworkingElement) {
            super(dot11InterworkingElement);
            this.accessnetworkType = dot11InterworkingElement.accessnetworkType;
            this.internet = dot11InterworkingElement.internet;
            this.asra = dot11InterworkingElement.asra;
            this.esr = dot11InterworkingElement.esr;
            this.uesa = dot11InterworkingElement.uesa;
            this.venueInfo = dot11InterworkingElement.venueInfo;
            this.hessid = dot11InterworkingElement.hessid;
        }

        public Builder accessnetworkType(Dot11AccessNetworkType dot11AccessNetworkType) {
            this.accessnetworkType = dot11AccessNetworkType;
            return this;
        }

        public Builder asra(boolean z10) {
            this.asra = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                int i10 = 1;
                if (this.venueInfo != null) {
                    i10 = 3;
                }
                int i11 = i10;
                if (this.hessid != null) {
                    i11 = i10 + 6;
                }
                length((byte) i11);
            }
            return new Dot11InterworkingElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder esr(boolean z10) {
            this.esr = z10;
            return this;
        }

        public Builder hessid(byte[] bArr) {
            this.hessid = bArr;
            return this;
        }

        public Builder internet(boolean z10) {
            this.internet = z10;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder uesa(boolean z10) {
            this.uesa = z10;
            return this;
        }

        public Builder venueInfo(Dot11VenueInfo dot11VenueInfo) {
            this.venueInfo = dot11VenueInfo;
            return this;
        }
    }

    private Dot11InterworkingElement(Builder builder) {
        super(builder);
        if (builder.accessnetworkType == null) {
            throw new NullPointerException("builder.accessnetworkType is null.");
        }
        if (builder.hessid.length != 6) {
            throw new IllegalArgumentException("builder.hessid.length must be 6. builder.hessid.length: " + ByteArrays.toHexString(builder.hessid, " "));
        }
        this.accessnetworkType = builder.accessnetworkType;
        this.internet = builder.internet;
        this.asra = builder.asra;
        this.esr = builder.esr;
        this.uesa = builder.uesa;
        this.venueInfo = builder.venueInfo;
        this.hessid = builder.hessid;
    }

    private Dot11InterworkingElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.INTERWORKING);
        int lengthAsInt = getLengthAsInt();
        if (lengthAsInt != 1 && lengthAsInt != 3 && lengthAsInt != 7 && lengthAsInt != 9) {
            throw new IllegalRawDataException("The length must be 1 or 3 or 7 or 9 but is actually: " + lengthAsInt);
        }
        int i12 = i10 + 2;
        this.accessnetworkType = Dot11AccessNetworkType.getInstance(Byte.valueOf((byte) (bArr[i12] & 15)));
        byte b10 = bArr[i12];
        this.internet = (b10 & 16) != 0;
        this.asra = (b10 & 32) != 0;
        this.esr = (b10 & 64) != 0;
        this.uesa = (b10 & 128) != 0;
        if (lengthAsInt == 3 || lengthAsInt == 9) {
            this.venueInfo = Dot11VenueInfo.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 3)));
        } else {
            this.venueInfo = null;
        }
        if (lengthAsInt == 7) {
            this.hessid = ByteArrays.getSubArray(bArr, i10 + 3, 6);
        } else if (lengthAsInt == 9) {
            this.hessid = ByteArrays.getSubArray(bArr, i10 + 5, 6);
        } else {
            this.hessid = null;
        }
    }

    public static Dot11InterworkingElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11InterworkingElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || Dot11InterworkingElement.class != obj.getClass()) {
            return false;
        }
        Dot11InterworkingElement dot11InterworkingElement = (Dot11InterworkingElement) obj;
        if (!this.accessnetworkType.equals(dot11InterworkingElement.accessnetworkType) || this.asra != dot11InterworkingElement.asra || this.esr != dot11InterworkingElement.esr || !Arrays.equals(this.hessid, dot11InterworkingElement.hessid) || this.internet != dot11InterworkingElement.internet || this.uesa != dot11InterworkingElement.uesa) {
            return false;
        }
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        Dot11VenueInfo dot11VenueInfo2 = dot11InterworkingElement.venueInfo;
        return dot11VenueInfo == null ? dot11VenueInfo2 == null : dot11VenueInfo.equals(dot11VenueInfo2);
    }

    public Dot11AccessNetworkType getAccessnetworkType() {
        return this.accessnetworkType;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public byte[] getHessid() {
        byte[] bArr = this.hessid;
        if (bArr == null) {
            return null;
        }
        return ByteArrays.clone(bArr);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte byteValue = this.accessnetworkType.value().byteValue();
        bArr[2] = byteValue;
        if (this.internet) {
            bArr[2] = (byte) (byteValue | 16);
        }
        if (this.asra) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.esr) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.uesa) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        int i10 = 3;
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        if (dot11VenueInfo != null) {
            System.arraycopy(ByteArrays.toByteArray(dot11VenueInfo.value().shortValue()), 0, bArr, 3, 2);
            i10 = 5;
        }
        byte[] bArr2 = this.hessid;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i10, 6);
        }
        return bArr;
    }

    public Dot11VenueInfo getVenueInfo() {
        return this.venueInfo;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.accessnetworkType.hashCode();
        int i10 = 1231;
        int i11 = this.asra ? 1231 : 1237;
        int i12 = this.esr ? 1231 : 1237;
        int hashCode3 = Arrays.hashCode(this.hessid);
        int i13 = this.internet ? 1231 : 1237;
        if (!this.uesa) {
            i10 = 1237;
        }
        Dot11VenueInfo dot11VenueInfo = this.venueInfo;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i11) * 31) + i12) * 31) + hashCode3) * 31) + i13) * 31) + i10) * 31) + (dot11VenueInfo == null ? 0 : dot11VenueInfo.hashCode());
    }

    public boolean isAsra() {
        return this.asra;
    }

    public boolean isEsr() {
        return this.esr;
    }

    public boolean isInternetAccessible() {
        return this.internet;
    }

    public boolean isUesa() {
        return this.uesa;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        int i10 = this.venueInfo != null ? 5 : 3;
        int i11 = i10;
        if (this.hessid != null) {
            i11 = i10 + 6;
        }
        return i11;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Interworking:");
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
        sb2.append("  Access Network Type: ");
        sb2.append(this.accessnetworkType);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Internet Accessible: ");
        sb2.append(this.internet);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  ASRA: ");
        sb2.append(this.asra);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  ESR: ");
        sb2.append(this.esr);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  UESA: ");
        sb2.append(this.uesa);
        sb2.append(property);
        if (this.venueInfo != null) {
            sb2.append(str);
            sb2.append("  Venue Info: ");
            sb2.append(this.venueInfo);
            sb2.append(property);
        }
        if (this.hessid != null) {
            sb2.append(str);
            sb2.append("  HESSID: 0x");
            sb2.append(ByteArrays.toHexString(this.hessid, ""));
            sb2.append(property);
        }
        return sb2.toString();
    }
}
