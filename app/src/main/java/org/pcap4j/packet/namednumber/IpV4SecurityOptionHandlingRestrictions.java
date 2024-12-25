package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4SecurityOptionHandlingRestrictions.class */
public final class IpV4SecurityOptionHandlingRestrictions extends NamedNumber<Short, IpV4SecurityOptionHandlingRestrictions> {
    private static final Map<Short, IpV4SecurityOptionHandlingRestrictions> registry = new HashMap();
    private static final long serialVersionUID = 3041825811304706489L;

    public IpV4SecurityOptionHandlingRestrictions(Short sh2, String str) {
        super(sh2, str);
    }

    public static IpV4SecurityOptionHandlingRestrictions getInstance(Short sh2) {
        Map<Short, IpV4SecurityOptionHandlingRestrictions> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new IpV4SecurityOptionHandlingRestrictions(sh2, "unknown");
    }

    public static IpV4SecurityOptionHandlingRestrictions register(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
        return registry.put(ipV4SecurityOptionHandlingRestrictions.value(), ipV4SecurityOptionHandlingRestrictions);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
        return value().compareTo(ipV4SecurityOptionHandlingRestrictions.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }
}
