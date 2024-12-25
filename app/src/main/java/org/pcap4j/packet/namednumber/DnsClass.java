package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/DnsClass.class */
public final class DnsClass extends NamedNumber<Short, DnsClass> {
    public static final DnsClass ANY;

    /* renamed from: CH */
    public static final DnsClass f36262CH;

    /* renamed from: HS */
    public static final DnsClass f36263HS;

    /* renamed from: IN */
    public static final DnsClass f36264IN;
    public static final DnsClass NONE;
    private static final Map<Short, DnsClass> registry;
    private static final long serialVersionUID = -8563135157139346618L;

    static {
        DnsClass dnsClass = new DnsClass((short) 1, "Internet (IN)");
        f36264IN = dnsClass;
        DnsClass dnsClass2 = new DnsClass((short) 3, "Chaos (CH)");
        f36262CH = dnsClass2;
        DnsClass dnsClass3 = new DnsClass((short) 4, "Hesiod (HS)");
        f36263HS = dnsClass3;
        DnsClass dnsClass4 = new DnsClass((short) 254, "NONE");
        NONE = dnsClass4;
        DnsClass dnsClass5 = new DnsClass((short) 255, "ANY");
        ANY = dnsClass5;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dnsClass.value(), dnsClass);
        hashMap.put(dnsClass2.value(), dnsClass2);
        hashMap.put(dnsClass3.value(), dnsClass3);
        hashMap.put(dnsClass4.value(), dnsClass4);
        hashMap.put(dnsClass5.value(), dnsClass5);
    }

    public DnsClass(Short sh2, String str) {
        super(sh2, str);
    }

    public static DnsClass getInstance(Short sh2) {
        Map<Short, DnsClass> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new DnsClass(sh2, "unknown");
    }

    public static DnsClass register(DnsClass dnsClass) {
        return registry.put(dnsClass.value(), dnsClass);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsClass dnsClass) {
        return value().compareTo(dnsClass.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().shortValue() & 65535);
    }
}
