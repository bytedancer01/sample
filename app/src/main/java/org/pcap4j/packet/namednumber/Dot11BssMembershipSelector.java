package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11BssMembershipSelector.class */
public final class Dot11BssMembershipSelector extends NamedNumber<Byte, Dot11BssMembershipSelector> {
    public static final Dot11BssMembershipSelector HT_PHY;
    private static final Map<Byte, Dot11BssMembershipSelector> registry;
    private static final long serialVersionUID = -8967573178793261461L;

    static {
        Dot11BssMembershipSelector dot11BssMembershipSelector = new Dot11BssMembershipSelector(Byte.MAX_VALUE, "HT PHY");
        HT_PHY = dot11BssMembershipSelector;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dot11BssMembershipSelector.value(), dot11BssMembershipSelector);
    }

    public Dot11BssMembershipSelector(Byte b10, String str) {
        super(b10, str);
        if (b10.byteValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException("The value must be between 0 to 127 but actually is: " + b10);
    }

    public static Dot11BssMembershipSelector getInstance(Byte b10) {
        Map<Byte, Dot11BssMembershipSelector> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new Dot11BssMembershipSelector(b10, "unknown");
    }

    public static boolean isRegistered(Byte b10) {
        return registry.containsKey(b10);
    }

    public static Dot11BssMembershipSelector register(Dot11BssMembershipSelector dot11BssMembershipSelector) {
        return registry.put(dot11BssMembershipSelector.value(), dot11BssMembershipSelector);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11BssMembershipSelector dot11BssMembershipSelector) {
        return value().compareTo(dot11BssMembershipSelector.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
