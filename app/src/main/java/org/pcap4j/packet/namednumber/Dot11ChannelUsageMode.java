package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11ChannelUsageMode.class */
public final class Dot11ChannelUsageMode extends NamedNumber<Byte, Dot11ChannelUsageMode> {
    public static final Dot11ChannelUsageMode NONINFRASTRUCTURE_DOT_11;
    public static final Dot11ChannelUsageMode OFF_CHANNEL_TDLS_DIRECT_LINK;
    private static final Map<Byte, Dot11ChannelUsageMode> registry;
    private static final long serialVersionUID = -8113989723106251697L;

    static {
        Dot11ChannelUsageMode dot11ChannelUsageMode = new Dot11ChannelUsageMode((byte) 0, "Noninfrastructure IEEE 802.11 network");
        NONINFRASTRUCTURE_DOT_11 = dot11ChannelUsageMode;
        Dot11ChannelUsageMode dot11ChannelUsageMode2 = new Dot11ChannelUsageMode((byte) 1, "Off-channel TDLS direct link");
        OFF_CHANNEL_TDLS_DIRECT_LINK = dot11ChannelUsageMode2;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dot11ChannelUsageMode.value(), dot11ChannelUsageMode);
        hashMap.put(dot11ChannelUsageMode2.value(), dot11ChannelUsageMode2);
    }

    public Dot11ChannelUsageMode(Byte b10, String str) {
        super(b10, str);
    }

    public static Dot11ChannelUsageMode getInstance(Byte b10) {
        Map<Byte, Dot11ChannelUsageMode> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new Dot11ChannelUsageMode(b10, "unknown");
    }

    public static Dot11ChannelUsageMode register(Dot11ChannelUsageMode dot11ChannelUsageMode) {
        return registry.put(dot11ChannelUsageMode.value(), dot11ChannelUsageMode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11ChannelUsageMode dot11ChannelUsageMode) {
        return value().compareTo(dot11ChannelUsageMode.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
