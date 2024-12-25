package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/LinuxSllPacketType.class */
public final class LinuxSllPacketType extends NamedNumber<Short, LinuxSllPacketType> {
    public static final LinuxSllPacketType LINUX_SLL_BROADCAST;
    public static final LinuxSllPacketType LINUX_SLL_HOST;
    public static final LinuxSllPacketType LINUX_SLL_MULTICAST;
    public static final LinuxSllPacketType LINUX_SLL_OTHERHOST;
    public static final LinuxSllPacketType LINUX_SLL_OUTGOING;
    private static final Map<Short, LinuxSllPacketType> registry;
    private static final long serialVersionUID = 8331027096398154722L;

    static {
        LinuxSllPacketType linuxSllPacketType = new LinuxSllPacketType((short) 0, "A packet addressed to the local host");
        LINUX_SLL_HOST = linuxSllPacketType;
        LinuxSllPacketType linuxSllPacketType2 = new LinuxSllPacketType((short) 1, "A physical layer broadcast packet");
        LINUX_SLL_BROADCAST = linuxSllPacketType2;
        LinuxSllPacketType linuxSllPacketType3 = new LinuxSllPacketType((short) 2, "A packet sent to a physical layer multicast address");
        LINUX_SLL_MULTICAST = linuxSllPacketType3;
        LinuxSllPacketType linuxSllPacketType4 = new LinuxSllPacketType((short) 3, "A packet to some other host");
        LINUX_SLL_OTHERHOST = linuxSllPacketType4;
        LinuxSllPacketType linuxSllPacketType5 = new LinuxSllPacketType((short) 4, "A packet originated from the local host");
        LINUX_SLL_OUTGOING = linuxSllPacketType5;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(linuxSllPacketType.value(), linuxSllPacketType);
        hashMap.put(linuxSllPacketType2.value(), linuxSllPacketType2);
        hashMap.put(linuxSllPacketType3.value(), linuxSllPacketType3);
        hashMap.put(linuxSllPacketType4.value(), linuxSllPacketType4);
        hashMap.put(linuxSllPacketType5.value(), linuxSllPacketType5);
    }

    public LinuxSllPacketType(Short sh2, String str) {
        super(sh2, str);
    }

    public static LinuxSllPacketType getInstance(Short sh2) {
        Map<Short, LinuxSllPacketType> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new LinuxSllPacketType(sh2, "unknown");
    }

    public static LinuxSllPacketType register(LinuxSllPacketType linuxSllPacketType) {
        return registry.put(linuxSllPacketType.value(), linuxSllPacketType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LinuxSllPacketType linuxSllPacketType) {
        return value().compareTo(linuxSllPacketType.value());
    }
}
