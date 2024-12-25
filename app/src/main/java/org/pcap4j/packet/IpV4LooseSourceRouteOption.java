package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV4RouteOption;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4LooseSourceRouteOption.class */
public final class IpV4LooseSourceRouteOption extends IpV4RouteOption {
    private static final long serialVersionUID = 6450781975561609234L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4LooseSourceRouteOption$Builder.class */
    public static final class Builder extends IpV4RouteOption.Builder<IpV4LooseSourceRouteOption> {
        public Builder() {
        }

        private Builder(IpV4LooseSourceRouteOption ipV4LooseSourceRouteOption) {
            super(ipV4LooseSourceRouteOption);
        }

        @Override // org.pcap4j.packet.IpV4RouteOption.Builder, org.pcap4j.packet.LengthBuilder
        public IpV4LooseSourceRouteOption build() {
            return new IpV4LooseSourceRouteOption(this);
        }
    }

    private IpV4LooseSourceRouteOption(Builder builder) {
        super(builder);
    }

    private IpV4LooseSourceRouteOption(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public static IpV4LooseSourceRouteOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4LooseSourceRouteOption(bArr, i10, i11);
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
        return IpV4OptionType.LOOSE_SOURCE_ROUTING;
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
