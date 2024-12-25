package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.parser.CharacterReader;
import org.pcap4j.core.Inets;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/ProtocolFamily.class */
public final class ProtocolFamily extends NamedNumber<Integer, ProtocolFamily> {
    public static final ProtocolFamily PF_INET;
    public static final ProtocolFamily PF_INET6;
    public static final ProtocolFamily PF_LINK;
    public static final ProtocolFamily PF_UNSPEC;
    private static final Map<Integer, ProtocolFamily> registry;
    private static final long serialVersionUID = 2803732603678906217L;

    static {
        ProtocolFamily protocolFamily = new ProtocolFamily(0, "PF_UNSPEC");
        PF_UNSPEC = protocolFamily;
        ProtocolFamily protocolFamily2 = new ProtocolFamily(Integer.valueOf(Inets.AF_INET & 65535), "PF_INET");
        PF_INET = protocolFamily2;
        ProtocolFamily protocolFamily3 = new ProtocolFamily(Integer.valueOf(Inets.AF_LINK & 65535), "PF_LINK");
        PF_LINK = protocolFamily3;
        ProtocolFamily protocolFamily4 = new ProtocolFamily(Integer.valueOf(65535 & Inets.AF_INET6), "PF_INET6");
        PF_INET6 = protocolFamily4;
        HashMap hashMap = new HashMap(10);
        registry = hashMap;
        hashMap.put(protocolFamily.value(), protocolFamily);
        hashMap.put(protocolFamily2.value(), protocolFamily2);
        hashMap.put(protocolFamily3.value(), protocolFamily3);
        hashMap.put(protocolFamily4.value(), protocolFamily4);
    }

    public ProtocolFamily(Integer num, String str) {
        super(num, str);
    }

    public static ProtocolFamily getInstance(Integer num) {
        Map<Integer, ProtocolFamily> map = registry;
        return map.containsKey(num) ? map.get(num) : new ProtocolFamily(num, "unknown");
    }

    public static ProtocolFamily register(ProtocolFamily protocolFamily) {
        return registry.put(protocolFamily.value(), protocolFamily);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(ProtocolFamily protocolFamily) {
        return value().compareTo(protocolFamily.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().intValue() & CharacterReader.EOF);
    }
}
