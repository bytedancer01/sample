package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4SecurityOptionCompartments.class */
public final class IpV4SecurityOptionCompartments extends NamedNumber<Short, IpV4SecurityOptionCompartments> {
    public static final IpV4SecurityOptionCompartments NOT_COMPARTMENTED;
    private static final Map<Short, IpV4SecurityOptionCompartments> registry;
    private static final long serialVersionUID = -420949071267484565L;

    static {
        IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments = new IpV4SecurityOptionCompartments((short) 0, "not compartmented");
        NOT_COMPARTMENTED = ipV4SecurityOptionCompartments;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV4SecurityOptionCompartments.value(), ipV4SecurityOptionCompartments);
    }

    public IpV4SecurityOptionCompartments(Short sh2, String str) {
        super(sh2, str);
    }

    public static IpV4SecurityOptionCompartments getInstance(Short sh2) {
        Map<Short, IpV4SecurityOptionCompartments> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new IpV4SecurityOptionCompartments(sh2, "unknown");
    }

    public static IpV4SecurityOptionCompartments register(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
        return registry.put(ipV4SecurityOptionCompartments.value(), ipV4SecurityOptionCompartments);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
        return value().compareTo(ipV4SecurityOptionCompartments.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }
}
