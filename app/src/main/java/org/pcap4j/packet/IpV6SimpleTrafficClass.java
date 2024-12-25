package org.pcap4j.packet;

import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IpV6SimpleTrafficClass.class */
public final class IpV6SimpleTrafficClass implements IpV6Packet.IpV6TrafficClass {
    private static final long serialVersionUID = -5076935770045999373L;
    private final byte value;

    private IpV6SimpleTrafficClass(byte b10) {
        this.value = b10;
    }

    public static IpV6SimpleTrafficClass newInstance(byte b10) {
        return new IpV6SimpleTrafficClass(b10);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!IpV6SimpleTrafficClass.class.isInstance(obj)) {
            return false;
        }
        if (((IpV6SimpleTrafficClass) IpV6SimpleTrafficClass.class.cast(obj)).value() != this.value) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "0x" + ByteArrays.toHexString(this.value, "");
    }

    @Override // org.pcap4j.packet.IpV6Packet.IpV6TrafficClass
    public byte value() {
        return this.value;
    }
}
