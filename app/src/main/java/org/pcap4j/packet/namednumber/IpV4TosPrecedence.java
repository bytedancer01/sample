package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4TosPrecedence.class */
public final class IpV4TosPrecedence extends NamedNumber<Byte, IpV4TosPrecedence> {
    public static final IpV4TosPrecedence CRITIC_ECP;
    public static final IpV4TosPrecedence FLASH;
    public static final IpV4TosPrecedence FLASH_OVERRIDE;
    public static final IpV4TosPrecedence IMMEDIATE;
    public static final IpV4TosPrecedence INTERNETWORK_CONTROL;
    public static final IpV4TosPrecedence NETWORK_CONTROL;
    public static final IpV4TosPrecedence PRIORITY;
    public static final IpV4TosPrecedence ROUTINE;
    private static final Map<Byte, IpV4TosPrecedence> registry;
    private static final long serialVersionUID = 3155818580398801532L;

    static {
        IpV4TosPrecedence ipV4TosPrecedence = new IpV4TosPrecedence((byte) 0, "Routine");
        ROUTINE = ipV4TosPrecedence;
        IpV4TosPrecedence ipV4TosPrecedence2 = new IpV4TosPrecedence((byte) 1, "Priority");
        PRIORITY = ipV4TosPrecedence2;
        IpV4TosPrecedence ipV4TosPrecedence3 = new IpV4TosPrecedence((byte) 2, "Immediate");
        IMMEDIATE = ipV4TosPrecedence3;
        IpV4TosPrecedence ipV4TosPrecedence4 = new IpV4TosPrecedence((byte) 3, "Flash");
        FLASH = ipV4TosPrecedence4;
        IpV4TosPrecedence ipV4TosPrecedence5 = new IpV4TosPrecedence((byte) 4, "Flash Override");
        FLASH_OVERRIDE = ipV4TosPrecedence5;
        IpV4TosPrecedence ipV4TosPrecedence6 = new IpV4TosPrecedence((byte) 5, "CRITIC/ECP");
        CRITIC_ECP = ipV4TosPrecedence6;
        IpV4TosPrecedence ipV4TosPrecedence7 = new IpV4TosPrecedence((byte) 6, "Internetwork Control/ECP");
        INTERNETWORK_CONTROL = ipV4TosPrecedence7;
        IpV4TosPrecedence ipV4TosPrecedence8 = new IpV4TosPrecedence((byte) 7, "Network Control");
        NETWORK_CONTROL = ipV4TosPrecedence8;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV4TosPrecedence.value(), ipV4TosPrecedence);
        hashMap.put(ipV4TosPrecedence2.value(), ipV4TosPrecedence2);
        hashMap.put(ipV4TosPrecedence3.value(), ipV4TosPrecedence3);
        hashMap.put(ipV4TosPrecedence4.value(), ipV4TosPrecedence4);
        hashMap.put(ipV4TosPrecedence5.value(), ipV4TosPrecedence5);
        hashMap.put(ipV4TosPrecedence6.value(), ipV4TosPrecedence6);
        hashMap.put(ipV4TosPrecedence7.value(), ipV4TosPrecedence7);
        hashMap.put(ipV4TosPrecedence8.value(), ipV4TosPrecedence8);
    }

    public IpV4TosPrecedence(Byte b10, String str) {
        super(b10, str);
        if ((b10.byteValue() & 248) == 0) {
            return;
        }
        throw new IllegalArgumentException(b10 + " is invalid value. Precedence field of IPv4 TOS must be between 0 and 7");
    }

    public static IpV4TosPrecedence getInstance(Byte b10) {
        Map<Byte, IpV4TosPrecedence> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpV4TosPrecedence(b10, "unknown");
    }

    public static IpV4TosPrecedence register(IpV4TosPrecedence ipV4TosPrecedence) {
        return registry.put(ipV4TosPrecedence.value(), ipV4TosPrecedence);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4TosPrecedence ipV4TosPrecedence) {
        return value().compareTo(ipV4TosPrecedence.value());
    }
}
