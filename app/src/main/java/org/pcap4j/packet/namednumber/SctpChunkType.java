package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/SctpChunkType.class */
public final class SctpChunkType extends NamedNumber<Byte, SctpChunkType> {
    public static final SctpChunkType ABORT;
    public static final SctpChunkType COOKIE_ACK;
    public static final SctpChunkType COOKIE_ECHO;
    public static final SctpChunkType CWR;
    public static final SctpChunkType DATA;
    public static final SctpChunkType ECNE;
    public static final SctpChunkType ERROR;
    public static final SctpChunkType HEARTBEAT;
    public static final SctpChunkType HEARTBEAT_ACK;
    public static final SctpChunkType INIT;
    public static final SctpChunkType INIT_ACK;
    public static final SctpChunkType SACK;
    public static final SctpChunkType SHUTDOWN;
    public static final SctpChunkType SHUTDOWN_ACK;
    public static final SctpChunkType SHUTDOWN_COMPLETE;
    private static final Map<Byte, SctpChunkType> registry;
    private static final long serialVersionUID = -5598298520049931819L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/SctpChunkType$ActionForUnkownType.class */
    public enum ActionForUnkownType {
        DISCARD,
        DISCARD_AND_REPORT,
        SKIP,
        SKIP_AND_REPORT
    }

    static {
        SctpChunkType sctpChunkType = new SctpChunkType((byte) 0, "Payload Data");
        DATA = sctpChunkType;
        SctpChunkType sctpChunkType2 = new SctpChunkType((byte) 1, "Initiation");
        INIT = sctpChunkType2;
        SctpChunkType sctpChunkType3 = new SctpChunkType((byte) 2, "Initiation Acknowledgement");
        INIT_ACK = sctpChunkType3;
        SctpChunkType sctpChunkType4 = new SctpChunkType((byte) 3, "Selective Acknowledgement");
        SACK = sctpChunkType4;
        SctpChunkType sctpChunkType5 = new SctpChunkType((byte) 4, "Heartbeat Request");
        HEARTBEAT = sctpChunkType5;
        SctpChunkType sctpChunkType6 = new SctpChunkType((byte) 5, "Heartbeat Acknowledgement");
        HEARTBEAT_ACK = sctpChunkType6;
        SctpChunkType sctpChunkType7 = new SctpChunkType((byte) 6, "Abort");
        ABORT = sctpChunkType7;
        SctpChunkType sctpChunkType8 = new SctpChunkType((byte) 7, "Shutdown");
        SHUTDOWN = sctpChunkType8;
        SctpChunkType sctpChunkType9 = new SctpChunkType((byte) 8, "Shutdown Acknowledgement");
        SHUTDOWN_ACK = sctpChunkType9;
        SctpChunkType sctpChunkType10 = new SctpChunkType((byte) 9, "Operation Error");
        ERROR = sctpChunkType10;
        SctpChunkType sctpChunkType11 = new SctpChunkType((byte) 10, "State Cookie");
        COOKIE_ECHO = sctpChunkType11;
        SctpChunkType sctpChunkType12 = new SctpChunkType((byte) 11, "Cookie Acknowledgement");
        COOKIE_ACK = sctpChunkType12;
        SctpChunkType sctpChunkType13 = new SctpChunkType((byte) 12, "Explicit Congestion Notification Echo");
        ECNE = sctpChunkType13;
        SctpChunkType sctpChunkType14 = new SctpChunkType((byte) 13, "Congestion Window Reduced");
        CWR = sctpChunkType14;
        SctpChunkType sctpChunkType15 = new SctpChunkType((byte) 14, "Shutdown Complete");
        SHUTDOWN_COMPLETE = sctpChunkType15;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(sctpChunkType.value(), sctpChunkType);
        hashMap.put(sctpChunkType2.value(), sctpChunkType2);
        hashMap.put(sctpChunkType3.value(), sctpChunkType3);
        hashMap.put(sctpChunkType4.value(), sctpChunkType4);
        hashMap.put(sctpChunkType5.value(), sctpChunkType5);
        hashMap.put(sctpChunkType6.value(), sctpChunkType6);
        hashMap.put(sctpChunkType7.value(), sctpChunkType7);
        hashMap.put(sctpChunkType8.value(), sctpChunkType8);
        hashMap.put(sctpChunkType9.value(), sctpChunkType9);
        hashMap.put(sctpChunkType10.value(), sctpChunkType10);
        hashMap.put(sctpChunkType11.value(), sctpChunkType11);
        hashMap.put(sctpChunkType12.value(), sctpChunkType12);
        hashMap.put(sctpChunkType13.value(), sctpChunkType13);
        hashMap.put(sctpChunkType14.value(), sctpChunkType14);
        hashMap.put(sctpChunkType15.value(), sctpChunkType15);
    }

    public SctpChunkType(Byte b10, String str) {
        super(b10, str);
    }

    public static SctpChunkType getInstance(Byte b10) {
        Map<Byte, SctpChunkType> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new SctpChunkType(b10, "unknown");
    }

    public static SctpChunkType register(SctpChunkType sctpChunkType) {
        return registry.put(sctpChunkType.value(), sctpChunkType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(SctpChunkType sctpChunkType) {
        return value().compareTo(sctpChunkType.value());
    }

    public ActionForUnkownType getActionForUnkownType() {
        return ActionForUnkownType.values()[(value().byteValue() >> 6) & 3];
    }

    public int valueAsInt() {
        return value().byteValue() & 255;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(valueAsInt());
    }
}
