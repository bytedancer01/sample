package org.pcap4j.packet;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6SimpleFlowLabel.class */
public final class IpV6SimpleFlowLabel implements IpV6Packet.IpV6FlowLabel {
    private static final long serialVersionUID = -5076935770045999373L;
    private final int value;

    private IpV6SimpleFlowLabel(int i10) {
        this.value = i10 & 1048575;
    }

    public static IpV6SimpleFlowLabel newInstance(int i10) {
        return new IpV6SimpleFlowLabel(i10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6SimpleFlowLabel.class.isInstance(obj)) {
            return false;
        }
        if (((IpV6SimpleFlowLabel) IpV6SimpleFlowLabel.class.cast(obj)).value() != this.value) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "0x" + ByteArrays.toHexString(this.value, "").substring(3);
    }

    @Override // org.pcap4j.packet.IpV6Packet.IpV6FlowLabel
    public int value() {
        return this.value;
    }
}
