package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleFlowLabel;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticIpV6FlowLabelFactory.class */
public final class StaticIpV6FlowLabelFactory implements PacketFactory<IpV6Packet.IpV6FlowLabel, NotApplicable> {
    private static final StaticIpV6FlowLabelFactory INSTANCE = new StaticIpV6FlowLabelFactory();

    public static StaticIpV6FlowLabelFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends IpV6Packet.IpV6FlowLabel> getTargetClass() {
        return IpV6SimpleFlowLabel.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public Class<? extends IpV6Packet.IpV6FlowLabel> getTargetClass(NotApplicable notApplicable) {
        return getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public IpV6Packet.IpV6FlowLabel newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        if (i11 >= 4) {
            return IpV6SimpleFlowLabel.newInstance(ByteArrays.getInt(bArr, i10));
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("rawData is too short: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(i10);
        sb2.append(", length: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    @Deprecated
    public IpV6Packet.IpV6FlowLabel newInstance(byte[] bArr, int i10, int i11, NotApplicable notApplicable) {
        return newInstance(bArr, i10, i11);
    }
}
