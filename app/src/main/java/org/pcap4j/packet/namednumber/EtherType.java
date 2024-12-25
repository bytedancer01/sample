package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/EtherType.class */
public final class EtherType extends NamedNumber<Short, EtherType> {
    public static final EtherType APPLETALK;
    public static final EtherType ARP;
    public static final EtherType DOT1Q_VLAN_TAGGED_FRAMES;
    public static final int IEEE802_3_MAX_LENGTH = 1500;
    public static final EtherType IPV4;
    public static final EtherType IPV6;
    public static final EtherType MPLS;
    public static final EtherType PPP;
    public static final EtherType PPPOE_DISCOVERY_STAGE;
    public static final EtherType PPPOE_SESSION_STAGE;
    public static final EtherType RARP;
    private static final Map<Short, EtherType> registry;
    private static final long serialVersionUID = 7866667243677334444L;

    static {
        EtherType etherType = new EtherType((short) 2048, "IPv4");
        IPV4 = etherType;
        EtherType etherType2 = new EtherType((short) 2054, "ARP");
        ARP = etherType2;
        EtherType etherType3 = new EtherType((short) -32512, "IEEE 802.1Q VLAN-tagged frames");
        DOT1Q_VLAN_TAGGED_FRAMES = etherType3;
        EtherType etherType4 = new EtherType((short) -32715, "RARP");
        RARP = etherType4;
        EtherType etherType5 = new EtherType((short) -32613, "Appletalk");
        APPLETALK = etherType5;
        EtherType etherType6 = new EtherType((short) -31011, "IPv6");
        IPV6 = etherType6;
        EtherType etherType7 = new EtherType((short) -30709, "PPP");
        PPP = etherType7;
        EtherType etherType8 = new EtherType((short) -30649, "MPLS");
        MPLS = etherType8;
        EtherType etherType9 = new EtherType((short) -30621, "PPPoE Discovery Stage");
        PPPOE_DISCOVERY_STAGE = etherType9;
        EtherType etherType10 = new EtherType((short) -30620, "PPPoE Session Stage");
        PPPOE_SESSION_STAGE = etherType10;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(etherType.value(), etherType);
        hashMap.put(etherType2.value(), etherType2);
        hashMap.put(etherType3.value(), etherType3);
        hashMap.put(etherType4.value(), etherType4);
        hashMap.put(etherType5.value(), etherType5);
        hashMap.put(etherType6.value(), etherType6);
        hashMap.put(etherType7.value(), etherType7);
        hashMap.put(etherType8.value(), etherType8);
        hashMap.put(etherType9.value(), etherType9);
        hashMap.put(etherType10.value(), etherType10);
    }

    public EtherType(Short sh2, String str) {
        super(sh2, str);
    }

    public static EtherType getInstance(Short sh2) {
        Map<Short, EtherType> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : (sh2.shortValue() & 65535) <= 1500 ? new EtherType(sh2, "Length") : new EtherType(sh2, "unknown");
    }

    public static EtherType register(EtherType etherType) {
        return registry.put(etherType.value(), etherType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(EtherType etherType) {
        return value().compareTo(etherType.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String toString() {
        if ((value().shortValue() & 65535) > 1500) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("Length (");
        sb2.append(65535 & value().shortValue());
        sb2.append(" bytes)");
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }
}
