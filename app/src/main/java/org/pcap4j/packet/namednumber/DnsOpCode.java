package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/DnsOpCode.class */
public final class DnsOpCode extends NamedNumber<Byte, DnsOpCode> {
    public static final DnsOpCode IQUERY;
    public static final DnsOpCode NOTIFY;
    public static final DnsOpCode QUERY;
    public static final DnsOpCode STATUS;
    public static final DnsOpCode UPDATE;
    private static final Map<Byte, DnsOpCode> registry;
    private static final long serialVersionUID = -7397483318208343692L;

    static {
        DnsOpCode dnsOpCode = new DnsOpCode((byte) 0, "Query");
        QUERY = dnsOpCode;
        DnsOpCode dnsOpCode2 = new DnsOpCode((byte) 1, "IQuery");
        IQUERY = dnsOpCode2;
        DnsOpCode dnsOpCode3 = new DnsOpCode((byte) 2, "Status");
        STATUS = dnsOpCode3;
        DnsOpCode dnsOpCode4 = new DnsOpCode((byte) 4, "Notify");
        NOTIFY = dnsOpCode4;
        DnsOpCode dnsOpCode5 = new DnsOpCode((byte) 5, "Update");
        UPDATE = dnsOpCode5;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dnsOpCode.value(), dnsOpCode);
        hashMap.put(dnsOpCode2.value(), dnsOpCode2);
        hashMap.put(dnsOpCode3.value(), dnsOpCode3);
        hashMap.put(dnsOpCode4.value(), dnsOpCode4);
        hashMap.put(dnsOpCode5.value(), dnsOpCode5);
    }

    public DnsOpCode(Byte b10, String str) {
        super(b10, str);
        if ((b10.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b10 + " is invalid value. DNS OpCode must be between 0 and 15");
    }

    public static DnsOpCode getInstance(Byte b10) {
        Map<Byte, DnsOpCode> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new DnsOpCode(b10, "unknown");
    }

    public static DnsOpCode register(DnsOpCode dnsOpCode) {
        return registry.put(dnsOpCode.value(), dnsOpCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsOpCode dnsOpCode) {
        return value().compareTo(dnsOpCode.value());
    }
}
