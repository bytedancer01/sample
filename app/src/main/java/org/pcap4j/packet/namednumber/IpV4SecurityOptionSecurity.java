package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4SecurityOptionSecurity.class */
public final class IpV4SecurityOptionSecurity extends NamedNumber<Short, IpV4SecurityOptionSecurity> {
    public static final IpV4SecurityOptionSecurity CONFIDENTIAL;
    public static final IpV4SecurityOptionSecurity EFTO;
    public static final IpV4SecurityOptionSecurity MMMM;
    public static final IpV4SecurityOptionSecurity PROG;
    public static final IpV4SecurityOptionSecurity RESTRICTED;
    public static final IpV4SecurityOptionSecurity SECRET;
    public static final IpV4SecurityOptionSecurity TOP_SECRET;
    public static final IpV4SecurityOptionSecurity UNCLASSIFIED;
    private static final Map<Short, IpV4SecurityOptionSecurity> registry;
    private static final long serialVersionUID = -5609708606668323329L;

    static {
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity = new IpV4SecurityOptionSecurity((short) 0, "Unclassified");
        UNCLASSIFIED = ipV4SecurityOptionSecurity;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity2 = new IpV4SecurityOptionSecurity((short) -3787, "Confidential");
        CONFIDENTIAL = ipV4SecurityOptionSecurity2;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity3 = new IpV4SecurityOptionSecurity((short) 30874, "EFTO");
        EFTO = ipV4SecurityOptionSecurity3;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity4 = new IpV4SecurityOptionSecurity((short) -17331, "MMMM");
        MMMM = ipV4SecurityOptionSecurity4;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity5 = new IpV4SecurityOptionSecurity((short) 24102, "PROG");
        PROG = ipV4SecurityOptionSecurity5;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity6 = new IpV4SecurityOptionSecurity((short) -20717, "Restricted");
        RESTRICTED = ipV4SecurityOptionSecurity6;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity7 = new IpV4SecurityOptionSecurity((short) -10360, "Secret");
        SECRET = ipV4SecurityOptionSecurity7;
        IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity8 = new IpV4SecurityOptionSecurity((short) 27589, "Top Secret");
        TOP_SECRET = ipV4SecurityOptionSecurity8;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV4SecurityOptionSecurity.value(), ipV4SecurityOptionSecurity);
        hashMap.put(ipV4SecurityOptionSecurity2.value(), ipV4SecurityOptionSecurity2);
        hashMap.put(ipV4SecurityOptionSecurity3.value(), ipV4SecurityOptionSecurity3);
        hashMap.put(ipV4SecurityOptionSecurity4.value(), ipV4SecurityOptionSecurity4);
        hashMap.put(ipV4SecurityOptionSecurity5.value(), ipV4SecurityOptionSecurity5);
        hashMap.put(ipV4SecurityOptionSecurity6.value(), ipV4SecurityOptionSecurity6);
        hashMap.put(ipV4SecurityOptionSecurity7.value(), ipV4SecurityOptionSecurity7);
        hashMap.put(ipV4SecurityOptionSecurity8.value(), ipV4SecurityOptionSecurity8);
    }

    public IpV4SecurityOptionSecurity(Short sh2, String str) {
        super(sh2, str);
    }

    public static IpV4SecurityOptionSecurity getInstance(Short sh2) {
        Map<Short, IpV4SecurityOptionSecurity> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new IpV4SecurityOptionSecurity(sh2, "unknown");
    }

    public static IpV4SecurityOptionSecurity register(IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity) {
        return registry.put(ipV4SecurityOptionSecurity.value(), ipV4SecurityOptionSecurity);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionSecurity ipV4SecurityOptionSecurity) {
        return value().compareTo(ipV4SecurityOptionSecurity.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }
}
