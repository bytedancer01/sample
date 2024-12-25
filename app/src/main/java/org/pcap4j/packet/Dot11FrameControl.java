package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.packet.namednumber.Dot11FrameType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11FrameControl.class */
public final class Dot11FrameControl implements Serializable {
    private static final long serialVersionUID = -5402534865955179413L;
    private final boolean fromDs;
    private final boolean moreData;
    private final boolean moreFragments;
    private final boolean order;
    private final boolean powerManagement;
    private final boolean protectedFrame;
    private final ProtocolVersion protocolVersion;
    private final boolean retry;
    private final boolean toDs;
    private final Dot11FrameType type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11FrameControl$Builder.class */
    public static final class Builder {
        private boolean fromDs;
        private boolean moreData;
        private boolean moreFragments;
        private boolean order;
        private boolean powerManagement;
        private boolean protectedFrame;
        private ProtocolVersion protocolVersion;
        private boolean retry;
        private boolean toDs;
        private Dot11FrameType type;

        public Builder() {
        }

        private Builder(Dot11FrameControl dot11FrameControl) {
            this.protocolVersion = dot11FrameControl.protocolVersion;
            this.type = dot11FrameControl.type;
            this.toDs = dot11FrameControl.toDs;
            this.fromDs = dot11FrameControl.fromDs;
            this.moreFragments = dot11FrameControl.moreFragments;
            this.retry = dot11FrameControl.retry;
            this.powerManagement = dot11FrameControl.powerManagement;
            this.moreData = dot11FrameControl.moreData;
            this.protectedFrame = dot11FrameControl.protectedFrame;
            this.order = dot11FrameControl.order;
        }

        public Dot11FrameControl build() {
            return new Dot11FrameControl(this);
        }

        public Builder fromDs(boolean z10) {
            this.fromDs = z10;
            return this;
        }

        public Builder moreData(boolean z10) {
            this.moreData = z10;
            return this;
        }

        public Builder moreFragments(boolean z10) {
            this.moreFragments = z10;
            return this;
        }

        public Builder order(boolean z10) {
            this.order = z10;
            return this;
        }

        public Builder powerManagement(boolean z10) {
            this.powerManagement = z10;
            return this;
        }

        public Builder protectedFrame(boolean z10) {
            this.protectedFrame = z10;
            return this;
        }

        public Builder protocolVersion(ProtocolVersion protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder retry(boolean z10) {
            this.retry = z10;
            return this;
        }

        public Builder toDs(boolean z10) {
            this.toDs = z10;
            return this;
        }

        public Builder type(Dot11FrameType dot11FrameType) {
            this.type = dot11FrameType;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11FrameControl$ProtocolVersion.class */
    public enum ProtocolVersion {
        V0(0),
        V1(1),
        V2(2),
        V3(3);

        private final int value;

        ProtocolVersion(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    private Dot11FrameControl(Builder builder) {
        if (builder == null || builder.protocolVersion == null || builder.type == null) {
            throw new NullPointerException("builder" + builder + " builder.protocolVersion: " + builder.protocolVersion + " builder.type: " + builder.type);
        }
        this.protocolVersion = builder.protocolVersion;
        this.type = builder.type;
        this.toDs = builder.toDs;
        this.fromDs = builder.fromDs;
        this.moreFragments = builder.moreFragments;
        this.retry = builder.retry;
        this.powerManagement = builder.powerManagement;
        this.moreData = builder.moreData;
        this.protectedFrame = builder.protectedFrame;
        this.order = builder.order;
    }

    private Dot11FrameControl(byte[] bArr, int i10, int i11) {
        ProtocolVersion protocolVersion;
        if (i11 < 2) {
            StringBuilder sb2 = new StringBuilder(200);
            sb2.append("The data is too short to build a Dot11FrameControl (");
            sb2.append(2);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        byte b10 = bArr[i10];
        int i12 = b10 & 3;
        if (i12 == 0) {
            protocolVersion = ProtocolVersion.V0;
        } else if (i12 == 1) {
            protocolVersion = ProtocolVersion.V1;
        } else if (i12 == 2) {
            protocolVersion = ProtocolVersion.V2;
        } else {
            if (i12 != 3) {
                throw new AssertionError("Never get here.");
            }
            protocolVersion = ProtocolVersion.V3;
        }
        this.protocolVersion = protocolVersion;
        this.type = Dot11FrameType.getInstance(Byte.valueOf((byte) (((b10 >> 4) & 15) | ((b10 << 2) & 48))));
        byte b11 = bArr[i10 + 1];
        this.toDs = (b11 & 1) != 0;
        this.fromDs = (b11 & 2) != 0;
        this.moreFragments = (b11 & 4) != 0;
        this.retry = (b11 & 8) != 0;
        this.powerManagement = (b11 & 16) != 0;
        this.moreData = (b11 & 32) != 0;
        this.protectedFrame = (b11 & 64) != 0;
        this.order = (b11 & 128) != 0;
    }

    public static Dot11FrameControl newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11FrameControl(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11FrameControl.class != obj.getClass()) {
            return false;
        }
        Dot11FrameControl dot11FrameControl = (Dot11FrameControl) obj;
        return this.fromDs == dot11FrameControl.fromDs && this.moreData == dot11FrameControl.moreData && this.moreFragments == dot11FrameControl.moreFragments && this.order == dot11FrameControl.order && this.powerManagement == dot11FrameControl.powerManagement && this.protectedFrame == dot11FrameControl.protectedFrame && this.protocolVersion == dot11FrameControl.protocolVersion && this.retry == dot11FrameControl.retry && this.toDs == dot11FrameControl.toDs && this.type.equals(dot11FrameControl.type);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    public byte[] getRawData() {
        byte b10 = (byte) (r0[0] | this.protocolVersion.value);
        byte[] bArr = {b10, 0};
        byte value = (byte) (b10 | (this.type.getType().getValue() << 2));
        bArr[0] = value;
        bArr[0] = (byte) (value | (this.type.value().byteValue() << 4));
        if (this.toDs) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.fromDs) {
            bArr[1] = (byte) (2 | bArr[1]);
        }
        if (this.moreFragments) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.retry) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.powerManagement) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.moreData) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.protectedFrame) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.order) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        return bArr;
    }

    public Dot11FrameType getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = 1231;
        int i11 = this.fromDs ? 1231 : 1237;
        int i12 = this.moreData ? 1231 : 1237;
        int i13 = this.moreFragments ? 1231 : 1237;
        int i14 = this.order ? 1231 : 1237;
        int i15 = this.powerManagement ? 1231 : 1237;
        int i16 = this.protectedFrame ? 1231 : 1237;
        ProtocolVersion protocolVersion = this.protocolVersion;
        int i17 = 0;
        int hashCode = protocolVersion == null ? 0 : protocolVersion.hashCode();
        int i18 = this.retry ? 1231 : 1237;
        if (!this.toDs) {
            i10 = 1237;
        }
        Dot11FrameType dot11FrameType = this.type;
        if (dot11FrameType != null) {
            i17 = dot11FrameType.hashCode();
        }
        return ((((((((((((((((((i11 + 31) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + hashCode) * 31) + i18) * 31) + i10) * 31) + i17;
    }

    public boolean isFromDs() {
        return this.fromDs;
    }

    public boolean isMoreData() {
        return this.moreData;
    }

    public boolean isMoreFragments() {
        return this.moreFragments;
    }

    public boolean isOrder() {
        return this.order;
    }

    public boolean isPowerManagement() {
        return this.powerManagement;
    }

    public boolean isProtectedFrame() {
        return this.protectedFrame;
    }

    public boolean isRetry() {
        return this.retry;
    }

    public boolean isToDs() {
        return this.toDs;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Protocol Version: ");
        sb2.append(this.protocolVersion);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Type/Subtype: ");
        sb2.append(this.type);
        sb2.append(property);
        sb2.append(str);
        sb2.append("To DS: ");
        sb2.append(this.toDs);
        sb2.append(property);
        sb2.append(str);
        sb2.append("From DS: ");
        sb2.append(this.fromDs);
        sb2.append(property);
        sb2.append(str);
        sb2.append("More Fragments: ");
        sb2.append(this.moreFragments);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Retry: ");
        sb2.append(this.retry);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Power Management: ");
        sb2.append(this.powerManagement);
        sb2.append(property);
        sb2.append(str);
        sb2.append("More Data: ");
        sb2.append(this.moreData);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Protected Frame: ");
        sb2.append(this.protectedFrame);
        sb2.append(property);
        sb2.append(str);
        sb2.append("Order: ");
        sb2.append(this.order);
        sb2.append(property);
        return sb2.toString();
    }
}
