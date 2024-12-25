package org.pcap4j.packet.namednumber;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11FrameType.class */
public final class Dot11FrameType extends NamedNumber<Byte, Dot11FrameType> {
    public static final Dot11FrameType ACK;
    public static final Dot11FrameType ACTION;
    public static final Dot11FrameType ACTION_NO_ACK;
    public static final Dot11FrameType ASSOCIATION_REQUEST;
    public static final Dot11FrameType ASSOCIATION_RESPONSE;
    public static final Dot11FrameType ATIM;
    public static final Dot11FrameType AUTHENTICATION;
    public static final Dot11FrameType BEACON;
    public static final Dot11FrameType BLOCK_ACK;
    public static final Dot11FrameType BLOCK_ACK_REQUEST;
    public static final Dot11FrameType CF_ACK;
    public static final Dot11FrameType CF_ACK_CF_POLL;
    public static final Dot11FrameType CF_END;
    public static final Dot11FrameType CF_END_CF_ACK;
    public static final Dot11FrameType CF_POLL;
    public static final Dot11FrameType CONTROL_WRAPPER;
    public static final Dot11FrameType CTS;
    public static final Dot11FrameType DATA;
    public static final Dot11FrameType DATA_CF_ACK;
    public static final Dot11FrameType DATA_CF_ACK_CF_POLL;
    public static final Dot11FrameType DATA_CF_POLL;
    public static final Dot11FrameType DEAUTHENTICATION;
    public static final Dot11FrameType DISASSOCIATION;
    public static final Dot11FrameType NULL;
    public static final Dot11FrameType PROBE_REQUEST;
    public static final Dot11FrameType PROBE_RESPONSE;
    public static final Dot11FrameType PS_POLL;
    public static final Dot11FrameType QOS_CF_ACK_CF_POLL;
    public static final Dot11FrameType QOS_CF_POLL;
    public static final Dot11FrameType QOS_DATA;
    public static final Dot11FrameType QOS_DATA_CF_ACK;
    public static final Dot11FrameType QOS_DATA_CF_ACK_CF_POLL;
    public static final Dot11FrameType QOS_DATA_CF_POLL;
    public static final Dot11FrameType QOS_NULL;
    public static final Dot11FrameType REASSOCIATION_REQUEST;
    public static final Dot11FrameType REASSOCIATION_RESPONSE;
    public static final Dot11FrameType RTS;
    public static final Dot11FrameType TIMING_ADVERTISEMENT;
    private static final Map<Byte, Dot11FrameType> registry;
    private static final long serialVersionUID = 863329177944877431L;
    private final Type type;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11FrameType$Type.class */
    public enum Type {
        MANAGEMENT(0),
        CONTROL(1),
        DATA(2),
        RESERVED(3);

        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        Dot11FrameType dot11FrameType = new Dot11FrameType((byte) 0, "Association request");
        ASSOCIATION_REQUEST = dot11FrameType;
        Dot11FrameType dot11FrameType2 = new Dot11FrameType((byte) 1, "Association response");
        ASSOCIATION_RESPONSE = dot11FrameType2;
        Dot11FrameType dot11FrameType3 = new Dot11FrameType((byte) 2, "Reassociation request");
        REASSOCIATION_REQUEST = dot11FrameType3;
        Dot11FrameType dot11FrameType4 = new Dot11FrameType((byte) 3, "Reassociation response");
        REASSOCIATION_RESPONSE = dot11FrameType4;
        Dot11FrameType dot11FrameType5 = new Dot11FrameType((byte) 4, "Probe request");
        PROBE_REQUEST = dot11FrameType5;
        Dot11FrameType dot11FrameType6 = new Dot11FrameType((byte) 5, "Probe response");
        PROBE_RESPONSE = dot11FrameType6;
        Dot11FrameType dot11FrameType7 = new Dot11FrameType((byte) 6, "Timing Advertisement");
        TIMING_ADVERTISEMENT = dot11FrameType7;
        Dot11FrameType dot11FrameType8 = new Dot11FrameType((byte) 8, "Beacon");
        BEACON = dot11FrameType8;
        Dot11FrameType dot11FrameType9 = new Dot11FrameType((byte) 9, "ATIM");
        ATIM = dot11FrameType9;
        Dot11FrameType dot11FrameType10 = new Dot11FrameType((byte) 10, "Disassociation");
        DISASSOCIATION = dot11FrameType10;
        Dot11FrameType dot11FrameType11 = new Dot11FrameType((byte) 11, "Authentication");
        AUTHENTICATION = dot11FrameType11;
        Dot11FrameType dot11FrameType12 = new Dot11FrameType((byte) 12, "Deauthentication");
        DEAUTHENTICATION = dot11FrameType12;
        Dot11FrameType dot11FrameType13 = new Dot11FrameType((byte) 13, JsonDocumentFields.ACTION);
        ACTION = dot11FrameType13;
        Dot11FrameType dot11FrameType14 = new Dot11FrameType((byte) 14, "Action No Ack");
        ACTION_NO_ACK = dot11FrameType14;
        Dot11FrameType dot11FrameType15 = new Dot11FrameType((byte) 23, "Control Wrapper");
        CONTROL_WRAPPER = dot11FrameType15;
        Dot11FrameType dot11FrameType16 = new Dot11FrameType((byte) 24, "Block Ack Request");
        BLOCK_ACK_REQUEST = dot11FrameType16;
        Dot11FrameType dot11FrameType17 = new Dot11FrameType((byte) 25, "Block Ack");
        BLOCK_ACK = dot11FrameType17;
        Dot11FrameType dot11FrameType18 = new Dot11FrameType((byte) 26, "PS-Poll");
        PS_POLL = dot11FrameType18;
        Dot11FrameType dot11FrameType19 = new Dot11FrameType((byte) 27, "RTS");
        RTS = dot11FrameType19;
        Dot11FrameType dot11FrameType20 = new Dot11FrameType((byte) 28, "CTS");
        CTS = dot11FrameType20;
        Dot11FrameType dot11FrameType21 = new Dot11FrameType((byte) 29, "ACK");
        ACK = dot11FrameType21;
        Dot11FrameType dot11FrameType22 = new Dot11FrameType((byte) 30, "CF-End");
        CF_END = dot11FrameType22;
        Dot11FrameType dot11FrameType23 = new Dot11FrameType((byte) 31, "CF-End + CF-Ack");
        CF_END_CF_ACK = dot11FrameType23;
        Dot11FrameType dot11FrameType24 = new Dot11FrameType((byte) 32, "Data");
        DATA = dot11FrameType24;
        Dot11FrameType dot11FrameType25 = new Dot11FrameType((byte) 33, "Data + CF-Ack");
        DATA_CF_ACK = dot11FrameType25;
        Dot11FrameType dot11FrameType26 = new Dot11FrameType((byte) 34, "Data + CF-Poll");
        DATA_CF_POLL = dot11FrameType26;
        Dot11FrameType dot11FrameType27 = new Dot11FrameType((byte) 35, "Data + CF-Ack + CF-Poll");
        DATA_CF_ACK_CF_POLL = dot11FrameType27;
        Dot11FrameType dot11FrameType28 = new Dot11FrameType((byte) 36, "Null");
        NULL = dot11FrameType28;
        Dot11FrameType dot11FrameType29 = new Dot11FrameType((byte) 37, "CF-Ack");
        CF_ACK = dot11FrameType29;
        Dot11FrameType dot11FrameType30 = new Dot11FrameType((byte) 38, "CF-Poll");
        CF_POLL = dot11FrameType30;
        Dot11FrameType dot11FrameType31 = new Dot11FrameType((byte) 39, "CF-Ack + CF-Poll");
        CF_ACK_CF_POLL = dot11FrameType31;
        Dot11FrameType dot11FrameType32 = new Dot11FrameType((byte) 40, "QoS Data");
        QOS_DATA = dot11FrameType32;
        Dot11FrameType dot11FrameType33 = new Dot11FrameType((byte) 41, "QoS Data + CF-Ack");
        QOS_DATA_CF_ACK = dot11FrameType33;
        Dot11FrameType dot11FrameType34 = new Dot11FrameType((byte) 42, "QoS Data + CF-Poll");
        QOS_DATA_CF_POLL = dot11FrameType34;
        Dot11FrameType dot11FrameType35 = new Dot11FrameType((byte) 43, "QoS Data + CF-Ack + CF-Poll");
        QOS_DATA_CF_ACK_CF_POLL = dot11FrameType35;
        Dot11FrameType dot11FrameType36 = new Dot11FrameType((byte) 44, "QoS Null");
        QOS_NULL = dot11FrameType36;
        Dot11FrameType dot11FrameType37 = new Dot11FrameType((byte) 46, "QoS CF-Poll");
        QOS_CF_POLL = dot11FrameType37;
        Dot11FrameType dot11FrameType38 = new Dot11FrameType((byte) 47, "QoS CF-Ack + CF-Poll");
        QOS_CF_ACK_CF_POLL = dot11FrameType38;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dot11FrameType.value(), dot11FrameType);
        hashMap.put(dot11FrameType2.value(), dot11FrameType2);
        hashMap.put(dot11FrameType3.value(), dot11FrameType3);
        hashMap.put(dot11FrameType4.value(), dot11FrameType4);
        hashMap.put(dot11FrameType5.value(), dot11FrameType5);
        hashMap.put(dot11FrameType6.value(), dot11FrameType6);
        hashMap.put(dot11FrameType7.value(), dot11FrameType7);
        hashMap.put(dot11FrameType8.value(), dot11FrameType8);
        hashMap.put(dot11FrameType9.value(), dot11FrameType9);
        hashMap.put(dot11FrameType10.value(), dot11FrameType10);
        hashMap.put(dot11FrameType11.value(), dot11FrameType11);
        hashMap.put(dot11FrameType12.value(), dot11FrameType12);
        hashMap.put(dot11FrameType13.value(), dot11FrameType13);
        hashMap.put(dot11FrameType14.value(), dot11FrameType14);
        hashMap.put(dot11FrameType15.value(), dot11FrameType15);
        hashMap.put(dot11FrameType16.value(), dot11FrameType16);
        hashMap.put(dot11FrameType17.value(), dot11FrameType17);
        hashMap.put(dot11FrameType18.value(), dot11FrameType18);
        hashMap.put(dot11FrameType19.value(), dot11FrameType19);
        hashMap.put(dot11FrameType20.value(), dot11FrameType20);
        hashMap.put(dot11FrameType21.value(), dot11FrameType21);
        hashMap.put(dot11FrameType22.value(), dot11FrameType22);
        hashMap.put(dot11FrameType23.value(), dot11FrameType23);
        hashMap.put(dot11FrameType24.value(), dot11FrameType24);
        hashMap.put(dot11FrameType25.value(), dot11FrameType25);
        hashMap.put(dot11FrameType26.value(), dot11FrameType26);
        hashMap.put(dot11FrameType27.value(), dot11FrameType27);
        hashMap.put(dot11FrameType28.value(), dot11FrameType28);
        hashMap.put(dot11FrameType29.value(), dot11FrameType29);
        hashMap.put(dot11FrameType30.value(), dot11FrameType30);
        hashMap.put(dot11FrameType31.value(), dot11FrameType31);
        hashMap.put(dot11FrameType32.value(), dot11FrameType32);
        hashMap.put(dot11FrameType33.value(), dot11FrameType33);
        hashMap.put(dot11FrameType34.value(), dot11FrameType34);
        hashMap.put(dot11FrameType35.value(), dot11FrameType35);
        hashMap.put(dot11FrameType36.value(), dot11FrameType36);
        hashMap.put(dot11FrameType37.value(), dot11FrameType37);
        hashMap.put(dot11FrameType38.value(), dot11FrameType38);
    }

    public Dot11FrameType(Byte b10, String str) {
        super(b10, str);
        Type type;
        if ((b10.byteValue() & 192) != 0) {
            throw new IllegalArgumentException(b10 + " is invalid value. (value & 0xC0) must be 0.");
        }
        int byteValue = b10.byteValue() >> 4;
        if (byteValue == 0) {
            type = Type.MANAGEMENT;
        } else if (byteValue == 1) {
            type = Type.CONTROL;
        } else if (byteValue == 2) {
            type = Type.DATA;
        } else {
            if (byteValue != 3) {
                throw new AssertionError("Never get here.");
            }
            type = Type.RESERVED;
        }
        this.type = type;
    }

    public static Dot11FrameType getInstance(Byte b10) {
        Map<Byte, Dot11FrameType> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new Dot11FrameType(b10, "unknown");
    }

    public static Dot11FrameType register(Dot11FrameType dot11FrameType) {
        return registry.put(dot11FrameType.value(), dot11FrameType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11FrameType dot11FrameType) {
        return value().compareTo(dot11FrameType.value());
    }

    public Type getType() {
        return this.type;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
