package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4InternetTimestampOptionFlag.class */
public final class IpV4InternetTimestampOptionFlag extends NamedNumber<Byte, IpV4InternetTimestampOptionFlag> {
    public static final IpV4InternetTimestampOptionFlag ADDRESS_PRESPECIFIED;
    public static final IpV4InternetTimestampOptionFlag EACH_TIMESTAMP_PRECEDED_WITH_ADDRESS;
    public static final IpV4InternetTimestampOptionFlag TIMESTAMPS_ONLY;
    private static final Map<Byte, IpV4InternetTimestampOptionFlag> registry;
    private static final long serialVersionUID = -8701646393814443788L;

    static {
        IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag = new IpV4InternetTimestampOptionFlag((byte) 0, "timestamps only");
        TIMESTAMPS_ONLY = ipV4InternetTimestampOptionFlag;
        IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag2 = new IpV4InternetTimestampOptionFlag((byte) 1, "each timestamp is preceded with internet address of the registering entity");
        EACH_TIMESTAMP_PRECEDED_WITH_ADDRESS = ipV4InternetTimestampOptionFlag2;
        IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag3 = new IpV4InternetTimestampOptionFlag((byte) 3, "the internet address fields are prespecified");
        ADDRESS_PRESPECIFIED = ipV4InternetTimestampOptionFlag3;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV4InternetTimestampOptionFlag.value(), ipV4InternetTimestampOptionFlag);
        hashMap.put(ipV4InternetTimestampOptionFlag2.value(), ipV4InternetTimestampOptionFlag2);
        hashMap.put(ipV4InternetTimestampOptionFlag3.value(), ipV4InternetTimestampOptionFlag3);
    }

    public IpV4InternetTimestampOptionFlag(Byte b10, String str) {
        super(b10, str);
        if ((b10.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b10 + " is invalid value. It must be between 0 and 15");
    }

    public static IpV4InternetTimestampOptionFlag getInstance(Byte b10) {
        Map<Byte, IpV4InternetTimestampOptionFlag> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpV4InternetTimestampOptionFlag(b10, "unknown");
    }

    public static IpV4InternetTimestampOptionFlag register(IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
        return registry.put(ipV4InternetTimestampOptionFlag.value(), ipV4InternetTimestampOptionFlag);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4InternetTimestampOptionFlag ipV4InternetTimestampOptionFlag) {
        return value().compareTo(ipV4InternetTimestampOptionFlag.value());
    }
}
