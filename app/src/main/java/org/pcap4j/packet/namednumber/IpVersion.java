package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpVersion.class */
public final class IpVersion extends NamedNumber<Byte, IpVersion> {
    public static final IpVersion IPV4;
    public static final IpVersion IPV6;
    public static final IpVersion PIP;

    /* renamed from: ST */
    public static final IpVersion f36287ST;
    public static final IpVersion TP_IX;
    public static final IpVersion TUBA;
    private static final Map<Byte, IpVersion> registry;
    private static final long serialVersionUID = 3155818580398801532L;

    static {
        IpVersion ipVersion = new IpVersion((byte) 4, "IPv4");
        IPV4 = ipVersion;
        IpVersion ipVersion2 = new IpVersion((byte) 5, "ST");
        f36287ST = ipVersion2;
        IpVersion ipVersion3 = new IpVersion((byte) 6, "IPv6");
        IPV6 = ipVersion3;
        IpVersion ipVersion4 = new IpVersion((byte) 7, "TP/IX");
        TP_IX = ipVersion4;
        IpVersion ipVersion5 = new IpVersion((byte) 8, "PIP");
        PIP = ipVersion5;
        IpVersion ipVersion6 = new IpVersion((byte) 9, "TUBA");
        TUBA = ipVersion6;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipVersion.value(), ipVersion);
        hashMap.put(ipVersion2.value(), ipVersion2);
        hashMap.put(ipVersion3.value(), ipVersion3);
        hashMap.put(ipVersion4.value(), ipVersion4);
        hashMap.put(ipVersion5.value(), ipVersion5);
        hashMap.put(ipVersion6.value(), ipVersion6);
    }

    public IpVersion(Byte b10, String str) {
        super(b10, str);
        if ((b10.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b10 + " is invalid value. Version field of IP header must be between 0 and 15");
    }

    public static IpVersion getInstance(Byte b10) {
        Map<Byte, IpVersion> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpVersion(b10, "unknown");
    }

    public static IpVersion register(IpVersion ipVersion) {
        return registry.put(ipVersion.value(), ipVersion);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpVersion ipVersion) {
        return value().compareTo(ipVersion.value());
    }
}
