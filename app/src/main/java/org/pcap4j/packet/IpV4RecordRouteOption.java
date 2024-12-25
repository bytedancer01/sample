package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV4RouteOption;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4RecordRouteOption.class */
public final class IpV4RecordRouteOption extends IpV4RouteOption {
    private static final long serialVersionUID = -3620689882998826146L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4RecordRouteOption$Builder.class */
    public static final class Builder extends IpV4RouteOption.Builder<IpV4RecordRouteOption> {
        public Builder() {
        }

        private Builder(IpV4RecordRouteOption ipV4RecordRouteOption) {
            super(ipV4RecordRouteOption);
        }

        @Override // org.pcap4j.packet.IpV4RouteOption.Builder, org.pcap4j.packet.LengthBuilder
        public IpV4RecordRouteOption build() {
            return new IpV4RecordRouteOption(this);
        }
    }

    private IpV4RecordRouteOption(Builder builder) {
        super(builder);
    }

    private IpV4RecordRouteOption(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public static IpV4RecordRouteOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4RecordRouteOption(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ byte getLength() {
        return super.getLength();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ int getLengthAsInt() {
        return super.getLengthAsInt();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ byte getPointer() {
        return super.getPointer();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ int getPointerAsInt() {
        return super.getPointerAsInt();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption, org.pcap4j.packet.IpV4Packet.IpV4Option
    public /* bridge */ /* synthetic */ byte[] getRawData() {
        return super.getRawData();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ List getRouteData() {
        return super.getRouteData();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption, org.pcap4j.packet.IpV4Packet.IpV4Option
    public IpV4OptionType getType() {
        return IpV4OptionType.RECORD_ROUTE;
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption, org.pcap4j.packet.IpV4Packet.IpV4Option
    public /* bridge */ /* synthetic */ int length() {
        return super.length();
    }

    @Override // org.pcap4j.packet.IpV4RouteOption
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
