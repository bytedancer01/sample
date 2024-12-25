package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4OptionType.class */
public final class IpV4OptionType extends NamedNumber<Byte, IpV4OptionType> {
    public static final IpV4OptionType ADDRESS_EXTENSION;
    public static final IpV4OptionType CIPSO;
    public static final IpV4OptionType DYNAMIC_PACKET_STATE;
    public static final IpV4OptionType EIP;
    public static final IpV4OptionType ENCODE;
    public static final IpV4OptionType END_OF_OPTION_LIST;
    public static final IpV4OptionType EXTENDED_SECURITY;
    public static final IpV4OptionType FINN;
    public static final IpV4OptionType IMITD;
    public static final IpV4OptionType INTERNET_TIMESTAMP;
    public static final IpV4OptionType LOOSE_SOURCE_ROUTING;
    public static final IpV4OptionType MTUP;
    public static final IpV4OptionType MTUR;
    public static final IpV4OptionType NO_OPERATION;
    public static final IpV4OptionType QUICK_START;
    public static final IpV4OptionType RECORD_ROUTE;
    public static final IpV4OptionType ROUTER_ALERT;
    public static final IpV4OptionType SECURITY;
    public static final IpV4OptionType SELECTIVE_DIRECTED_BROADCAST;
    public static final IpV4OptionType STREAM_ID;
    public static final IpV4OptionType STRICT_SOURCE_ROUTING;
    public static final IpV4OptionType TRACEROUTE;
    public static final IpV4OptionType UPSTREAM_MULTICAST_PACKET;
    public static final IpV4OptionType VISA;
    public static final IpV4OptionType ZSU;
    private static final Map<Byte, IpV4OptionType> registry;
    private static final long serialVersionUID = -7033971699970069137L;
    private final boolean copied;
    private final byte number;
    private final IpV4OptionClass optionClass;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV4OptionType$IpV4OptionClass.class */
    public enum IpV4OptionClass {
        CONTROL((byte) 0),
        RESERVED_FOR_FUTURE_USE1((byte) 1),
        DEBUGGING_AND_MEASUREMENT((byte) 2),
        RESERVED_FOR_FUTURE_USE3((byte) 3);

        private final byte value;

        IpV4OptionClass(byte b10) {
            this.value = b10;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        IpV4OptionType ipV4OptionType = new IpV4OptionType((byte) 0, "End of Option List");
        END_OF_OPTION_LIST = ipV4OptionType;
        IpV4OptionType ipV4OptionType2 = new IpV4OptionType((byte) 1, "No Operation");
        NO_OPERATION = ipV4OptionType2;
        IpV4OptionType ipV4OptionType3 = new IpV4OptionType((byte) -126, "Security");
        SECURITY = ipV4OptionType3;
        IpV4OptionType ipV4OptionType4 = new IpV4OptionType((byte) -125, "Loose Source Routing");
        LOOSE_SOURCE_ROUTING = ipV4OptionType4;
        IpV4OptionType ipV4OptionType5 = new IpV4OptionType((byte) 68, "Internet Timestamp");
        INTERNET_TIMESTAMP = ipV4OptionType5;
        IpV4OptionType ipV4OptionType6 = new IpV4OptionType((byte) -123, "Extended Security");
        EXTENDED_SECURITY = ipV4OptionType6;
        IpV4OptionType ipV4OptionType7 = new IpV4OptionType((byte) -122, "CIPSO");
        CIPSO = ipV4OptionType7;
        IpV4OptionType ipV4OptionType8 = new IpV4OptionType((byte) 7, "Record Route");
        RECORD_ROUTE = ipV4OptionType8;
        IpV4OptionType ipV4OptionType9 = new IpV4OptionType((byte) -120, "Stream ID");
        STREAM_ID = ipV4OptionType9;
        IpV4OptionType ipV4OptionType10 = new IpV4OptionType((byte) -119, "Strict Source Routing");
        STRICT_SOURCE_ROUTING = ipV4OptionType10;
        IpV4OptionType ipV4OptionType11 = new IpV4OptionType((byte) 10, "ZSU");
        ZSU = ipV4OptionType11;
        IpV4OptionType ipV4OptionType12 = new IpV4OptionType((byte) 11, "MTUP");
        MTUP = ipV4OptionType12;
        IpV4OptionType ipV4OptionType13 = new IpV4OptionType((byte) 12, "MTUR");
        MTUR = ipV4OptionType13;
        IpV4OptionType ipV4OptionType14 = new IpV4OptionType((byte) -51, "FINN");
        FINN = ipV4OptionType14;
        IpV4OptionType ipV4OptionType15 = new IpV4OptionType((byte) -114, "VISA");
        VISA = ipV4OptionType15;
        IpV4OptionType ipV4OptionType16 = new IpV4OptionType((byte) 15, "ENCODE");
        ENCODE = ipV4OptionType16;
        IpV4OptionType ipV4OptionType17 = new IpV4OptionType((byte) -112, "IMITD");
        IMITD = ipV4OptionType17;
        IpV4OptionType ipV4OptionType18 = new IpV4OptionType((byte) -111, "EIP");
        EIP = ipV4OptionType18;
        IpV4OptionType ipV4OptionType19 = new IpV4OptionType((byte) 82, "Traceroute");
        TRACEROUTE = ipV4OptionType19;
        IpV4OptionType ipV4OptionType20 = new IpV4OptionType((byte) -109, "Address Extension");
        ADDRESS_EXTENSION = ipV4OptionType20;
        IpV4OptionType ipV4OptionType21 = new IpV4OptionType((byte) -108, "Router Alert");
        ROUTER_ALERT = ipV4OptionType21;
        IpV4OptionType ipV4OptionType22 = new IpV4OptionType((byte) -107, "Selective Directed Broadcast");
        SELECTIVE_DIRECTED_BROADCAST = ipV4OptionType22;
        IpV4OptionType ipV4OptionType23 = new IpV4OptionType((byte) -105, "Dynamic Packet State");
        DYNAMIC_PACKET_STATE = ipV4OptionType23;
        IpV4OptionType ipV4OptionType24 = new IpV4OptionType((byte) -104, "Upstream Multicast Packet");
        UPSTREAM_MULTICAST_PACKET = ipV4OptionType24;
        IpV4OptionType ipV4OptionType25 = new IpV4OptionType((byte) 25, "Quick-Start");
        QUICK_START = ipV4OptionType25;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV4OptionType.value(), ipV4OptionType);
        hashMap.put(ipV4OptionType2.value(), ipV4OptionType2);
        hashMap.put(ipV4OptionType3.value(), ipV4OptionType3);
        hashMap.put(ipV4OptionType4.value(), ipV4OptionType4);
        hashMap.put(ipV4OptionType5.value(), ipV4OptionType5);
        hashMap.put(ipV4OptionType6.value(), ipV4OptionType6);
        hashMap.put(ipV4OptionType7.value(), ipV4OptionType7);
        hashMap.put(ipV4OptionType8.value(), ipV4OptionType8);
        hashMap.put(ipV4OptionType9.value(), ipV4OptionType9);
        hashMap.put(ipV4OptionType10.value(), ipV4OptionType10);
        hashMap.put(ipV4OptionType11.value(), ipV4OptionType11);
        hashMap.put(ipV4OptionType12.value(), ipV4OptionType12);
        hashMap.put(ipV4OptionType13.value(), ipV4OptionType13);
        hashMap.put(ipV4OptionType14.value(), ipV4OptionType14);
        hashMap.put(ipV4OptionType15.value(), ipV4OptionType15);
        hashMap.put(ipV4OptionType16.value(), ipV4OptionType16);
        hashMap.put(ipV4OptionType17.value(), ipV4OptionType17);
        hashMap.put(ipV4OptionType18.value(), ipV4OptionType18);
        hashMap.put(ipV4OptionType19.value(), ipV4OptionType19);
        hashMap.put(ipV4OptionType20.value(), ipV4OptionType20);
        hashMap.put(ipV4OptionType21.value(), ipV4OptionType21);
        hashMap.put(ipV4OptionType22.value(), ipV4OptionType22);
        hashMap.put(ipV4OptionType23.value(), ipV4OptionType23);
        hashMap.put(ipV4OptionType24.value(), ipV4OptionType24);
        hashMap.put(ipV4OptionType25.value(), ipV4OptionType25);
    }

    public IpV4OptionType(Byte b10, String str) {
        super(b10, str);
        IpV4OptionClass ipV4OptionClass;
        this.copied = (b10.byteValue() & 128) != 0;
        this.number = (byte) (b10.byteValue() & 31);
        int byteValue = b10.byteValue() & 96;
        if (byteValue == 0) {
            ipV4OptionClass = IpV4OptionClass.CONTROL;
        } else if (byteValue == 32) {
            ipV4OptionClass = IpV4OptionClass.RESERVED_FOR_FUTURE_USE1;
        } else if (byteValue == 64) {
            ipV4OptionClass = IpV4OptionClass.DEBUGGING_AND_MEASUREMENT;
        } else {
            if (byteValue != 96) {
                throw new AssertionError("Never get here");
            }
            ipV4OptionClass = IpV4OptionClass.RESERVED_FOR_FUTURE_USE3;
        }
        this.optionClass = ipV4OptionClass;
    }

    public static IpV4OptionType getInstance(Byte b10) {
        Map<Byte, IpV4OptionType> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpV4OptionType(b10, "unknown");
    }

    public static IpV4OptionType register(IpV4OptionType ipV4OptionType) {
        return registry.put(ipV4OptionType.value(), ipV4OptionType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4OptionType ipV4OptionType) {
        return value().compareTo(ipV4OptionType.value());
    }

    public byte getNumber() {
        return this.number;
    }

    public IpV4OptionClass getOptionClass() {
        return this.optionClass;
    }

    public boolean isCopied() {
        return this.copied;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
