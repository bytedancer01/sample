package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpVersion;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/SctpPort.class */
public final class SctpPort extends Port {
    public static final SctpPort BGP;
    public static final SctpPort DISCARD;
    public static final SctpPort FTP;
    public static final SctpPort FTP_DATA;
    public static final SctpPort HTTP;
    public static final SctpPort HTTPS;
    public static final SctpPort SSH;
    private static final Map<Short, SctpPort> registry;
    private static final long serialVersionUID = 8265462534894583620L;

    static {
        SctpPort sctpPort = new SctpPort((short) 9, "Discard");
        DISCARD = sctpPort;
        SctpPort sctpPort2 = new SctpPort((short) 20, "File Transfer [Default Data]");
        FTP_DATA = sctpPort2;
        SctpPort sctpPort3 = new SctpPort((short) 21, "File Transfer [Control]");
        FTP = sctpPort3;
        SctpPort sctpPort4 = new SctpPort((short) 22, "SSH");
        SSH = sctpPort4;
        SctpPort sctpPort5 = new SctpPort((short) 80, HttpVersion.HTTP);
        HTTP = sctpPort5;
        SctpPort sctpPort6 = new SctpPort((short) 179, "Border Gateway Protocol");
        BGP = sctpPort6;
        SctpPort sctpPort7 = new SctpPort((short) 443, "HTTPS");
        HTTPS = sctpPort7;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(sctpPort.value(), sctpPort);
        hashMap.put(sctpPort2.value(), sctpPort2);
        hashMap.put(sctpPort3.value(), sctpPort3);
        hashMap.put(sctpPort4.value(), sctpPort4);
        hashMap.put(sctpPort5.value(), sctpPort5);
        hashMap.put(sctpPort6.value(), sctpPort6);
        hashMap.put(sctpPort7.value(), sctpPort7);
    }

    public SctpPort(Short sh2, String str) {
        super(sh2, str);
    }

    public static SctpPort getInstance(Short sh2) {
        Map<Short, SctpPort> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new SctpPort(sh2, "unknown");
    }

    public static SctpPort register(SctpPort sctpPort) {
        return registry.put(sctpPort.value(), sctpPort);
    }
}
