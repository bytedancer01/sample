package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV4RouteOption;
import org.pcap4j.packet.namednumber.IpV4OptionType;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4StrictSourceRouteOption.class */
public final class IpV4StrictSourceRouteOption extends IpV4RouteOption {
    private static final long serialVersionUID = 4439878660976426283L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV4StrictSourceRouteOption$Builder.class */
    public static final class Builder extends IpV4RouteOption.Builder<IpV4StrictSourceRouteOption> {
        public Builder() {
        }

        private Builder(IpV4StrictSourceRouteOption ipV4StrictSourceRouteOption) {
            super(ipV4StrictSourceRouteOption);
        }

        @Override // org.pcap4j.packet.IpV4RouteOption.Builder, org.pcap4j.packet.LengthBuilder
        public IpV4StrictSourceRouteOption build() {
            return new IpV4StrictSourceRouteOption(this);
        }
    }

    private IpV4StrictSourceRouteOption(Builder builder) {
        super(builder);
    }

    private IpV4StrictSourceRouteOption(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public static IpV4StrictSourceRouteOption newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new IpV4StrictSourceRouteOption(bArr, i10, i11);
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
        return IpV4OptionType.STRICT_SOURCE_ROUTING;
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
