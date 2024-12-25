package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Oui.class */
public final class Oui extends NamedNumber<Integer, Oui> {
    public static final Oui ALAXALA_0012E2;
    public static final Oui CISCO_00000C;
    public static final Oui CISCO_000142;
    public static final Oui CISCO_000143;
    public static final Oui FUJITSU_00000E;
    public static final Oui FUJI_XEROX_080037;
    public static final Oui HEWLETT_PACKARD_080009;
    public static final Oui HITACHI_CABLE_004066;
    public static final Oui Hitachi_001F67;
    public static final Oui IBM_08005A;
    private static final Map<Integer, Oui> registry;
    private static final long serialVersionUID = 8322878251680068566L;

    static {
        Oui oui = new Oui(12, "Cisco");
        CISCO_00000C = oui;
        Oui oui2 = new Oui(14, "Fujitsu");
        FUJITSU_00000E = oui2;
        Oui oui3 = new Oui(524297, "Hewlett-Packard");
        HEWLETT_PACKARD_080009 = oui3;
        Oui oui4 = new Oui(524343, "Fuji-Xerox");
        FUJI_XEROX_080037 = oui4;
        Oui oui5 = new Oui(524378, "IBM");
        IBM_08005A = oui5;
        Oui oui6 = new Oui(322, "Cisco");
        CISCO_000142 = oui6;
        Oui oui7 = new Oui(323, "Cisco");
        CISCO_000143 = oui7;
        Oui oui8 = new Oui(4834, "AlaxalA");
        ALAXALA_0012E2 = oui8;
        Oui oui9 = new Oui(8039, "Hitachi");
        Hitachi_001F67 = oui9;
        Oui oui10 = new Oui(16486, "Hitachi Cable");
        HITACHI_CABLE_004066 = oui10;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(oui.value(), oui);
        hashMap.put(oui2.value(), oui2);
        hashMap.put(oui3.value(), oui3);
        hashMap.put(oui4.value(), oui4);
        hashMap.put(oui5.value(), oui5);
        hashMap.put(oui6.value(), oui6);
        hashMap.put(oui7.value(), oui7);
        hashMap.put(oui8.value(), oui8);
        hashMap.put(oui9.value(), oui9);
        hashMap.put(oui10.value(), oui10);
    }

    public Oui(Integer num, String str) {
        super(num, str);
        if ((num.intValue() & DefaultRenderer.BACKGROUND_COLOR) == 0) {
            return;
        }
        throw new IllegalArgumentException(num + " is invalid value. value must be between 0 and 0x00FFFFFF");
    }

    public static Oui getInstance(Integer num) {
        Map<Integer, Oui> map = registry;
        return map.containsKey(num) ? map.get(num) : new Oui(num, "unknown");
    }

    public static Oui getInstance(byte[] bArr) {
        if (bArr.length == 3) {
            return getInstance(Integer.valueOf(ByteArrays.getInt(new byte[]{0, bArr[0], bArr[1], bArr[2]}, 0)));
        }
        throw new IllegalArgumentException("value length must be 3");
    }

    public static Oui register(Oui oui) {
        return registry.put(oui.value(), oui);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Oui oui) {
        return value().compareTo(oui.value());
    }

    public byte[] valueAsByteArray() {
        return ByteArrays.getSubArray(ByteArrays.toByteArray(value().intValue()), 1, 3);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return ByteArrays.toHexString(value().intValue(), "-").substring(3);
    }
}
