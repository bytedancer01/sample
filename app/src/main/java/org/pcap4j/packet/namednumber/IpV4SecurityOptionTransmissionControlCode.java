package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4SecurityOptionTransmissionControlCode.class */
public final class IpV4SecurityOptionTransmissionControlCode extends NamedNumber<Integer, IpV4SecurityOptionTransmissionControlCode> {
    private static final Map<Integer, IpV4SecurityOptionTransmissionControlCode> registry = new HashMap();
    private static final long serialVersionUID = 3041825811304706489L;

    public IpV4SecurityOptionTransmissionControlCode(Integer num, String str) {
        super(num, str);
        if ((num.intValue() & DefaultRenderer.BACKGROUND_COLOR) == 0) {
            return;
        }
        throw new IllegalArgumentException(num + " is invalid value. The value must be between 0 and 16777215");
    }

    public static IpV4SecurityOptionTransmissionControlCode getInstance(Integer num) {
        Map<Integer, IpV4SecurityOptionTransmissionControlCode> map = registry;
        return map.containsKey(num) ? map.get(num) : new IpV4SecurityOptionTransmissionControlCode(num, "unknown");
    }

    public static IpV4SecurityOptionTransmissionControlCode register(IpV4SecurityOptionTransmissionControlCode ipV4SecurityOptionTransmissionControlCode) {
        return registry.put(ipV4SecurityOptionTransmissionControlCode.value(), ipV4SecurityOptionTransmissionControlCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionTransmissionControlCode ipV4SecurityOptionTransmissionControlCode) {
        return value().compareTo(ipV4SecurityOptionTransmissionControlCode.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().intValue(), "");
    }
}
