package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IcmpV4Type.class */
public final class IcmpV4Type extends NamedNumber<Byte, IcmpV4Type> {
    public static final IcmpV4Type ADDRESS_MASK_REPLY;
    public static final IcmpV4Type ADDRESS_MASK_REQUEST;
    public static final IcmpV4Type ALTERNATE_HOST_ADDRESS;
    public static final IcmpV4Type DATAGRAM_CONVERSION_ERROR;
    public static final IcmpV4Type DESTINATION_UNREACHABLE;
    public static final IcmpV4Type DOMAIN_NAME_REPLY;
    public static final IcmpV4Type DOMAIN_NAME_REQUEST;
    public static final IcmpV4Type ECHO;
    public static final IcmpV4Type ECHO_REPLY;
    public static final IcmpV4Type INFORMATION_REPLY;
    public static final IcmpV4Type INFORMATION_REQUEST;
    public static final IcmpV4Type IPV6_I_AM_HERE;
    public static final IcmpV4Type IPV6_WHERE_ARE_YOU;
    public static final IcmpV4Type MOBILE_HOST_REDIRECT;
    public static final IcmpV4Type MOBILE_REGISTRATION_REPLY;
    public static final IcmpV4Type MOBILE_REGISTRATION_REQUEST;
    public static final IcmpV4Type PARAMETER_PROBLEM;
    public static final IcmpV4Type PHOTURIS;
    public static final IcmpV4Type REDIRECT;
    public static final IcmpV4Type ROUTER_ADVERTISEMENT;
    public static final IcmpV4Type ROUTER_SOLICITATION;
    public static final IcmpV4Type SKIP;
    public static final IcmpV4Type SOURCE_QUENCH;
    public static final IcmpV4Type TIMESTAMP;
    public static final IcmpV4Type TIMESTAMP_REPLY;
    public static final IcmpV4Type TIME_EXCEEDED;
    public static final IcmpV4Type TRACEROUTE;
    private static final Map<Byte, IcmpV4Type> registry;
    private static final long serialVersionUID = -6737808159892354431L;

    static {
        IcmpV4Type icmpV4Type = new IcmpV4Type((byte) 0, "Echo Reply");
        ECHO_REPLY = icmpV4Type;
        IcmpV4Type icmpV4Type2 = new IcmpV4Type((byte) 3, "Destination Unreachable");
        DESTINATION_UNREACHABLE = icmpV4Type2;
        IcmpV4Type icmpV4Type3 = new IcmpV4Type((byte) 4, "Source Quench");
        SOURCE_QUENCH = icmpV4Type3;
        IcmpV4Type icmpV4Type4 = new IcmpV4Type((byte) 5, "Redirect");
        REDIRECT = icmpV4Type4;
        IcmpV4Type icmpV4Type5 = new IcmpV4Type((byte) 6, "Alternate Host Address");
        ALTERNATE_HOST_ADDRESS = icmpV4Type5;
        IcmpV4Type icmpV4Type6 = new IcmpV4Type((byte) 8, "Echo");
        ECHO = icmpV4Type6;
        IcmpV4Type icmpV4Type7 = new IcmpV4Type((byte) 9, "Router Advertisement");
        ROUTER_ADVERTISEMENT = icmpV4Type7;
        IcmpV4Type icmpV4Type8 = new IcmpV4Type((byte) 10, "Router Solicitation");
        ROUTER_SOLICITATION = icmpV4Type8;
        IcmpV4Type icmpV4Type9 = new IcmpV4Type((byte) 11, "Time Exceeded");
        TIME_EXCEEDED = icmpV4Type9;
        IcmpV4Type icmpV4Type10 = new IcmpV4Type((byte) 12, "Parameter Problem");
        PARAMETER_PROBLEM = icmpV4Type10;
        IcmpV4Type icmpV4Type11 = new IcmpV4Type((byte) 13, "Timestamp");
        TIMESTAMP = icmpV4Type11;
        IcmpV4Type icmpV4Type12 = new IcmpV4Type((byte) 14, "Timestamp Reply");
        TIMESTAMP_REPLY = icmpV4Type12;
        IcmpV4Type icmpV4Type13 = new IcmpV4Type((byte) 15, "Information Request");
        INFORMATION_REQUEST = icmpV4Type13;
        IcmpV4Type icmpV4Type14 = new IcmpV4Type((byte) 16, "Information Reply");
        INFORMATION_REPLY = icmpV4Type14;
        IcmpV4Type icmpV4Type15 = new IcmpV4Type((byte) 17, "Address Mask Request");
        ADDRESS_MASK_REQUEST = icmpV4Type15;
        IcmpV4Type icmpV4Type16 = new IcmpV4Type((byte) 18, "Address Mask Reply");
        ADDRESS_MASK_REPLY = icmpV4Type16;
        IcmpV4Type icmpV4Type17 = new IcmpV4Type((byte) 30, "Traceroute");
        TRACEROUTE = icmpV4Type17;
        IcmpV4Type icmpV4Type18 = new IcmpV4Type((byte) 31, "Datagram Conversion Error");
        DATAGRAM_CONVERSION_ERROR = icmpV4Type18;
        IcmpV4Type icmpV4Type19 = new IcmpV4Type((byte) 32, "Mobile Host Redirect");
        MOBILE_HOST_REDIRECT = icmpV4Type19;
        IcmpV4Type icmpV4Type20 = new IcmpV4Type((byte) 33, "IPv6 Where-Are-You");
        IPV6_WHERE_ARE_YOU = icmpV4Type20;
        IcmpV4Type icmpV4Type21 = new IcmpV4Type((byte) 34, "IPv6 I-Am-Here");
        IPV6_I_AM_HERE = icmpV4Type21;
        IcmpV4Type icmpV4Type22 = new IcmpV4Type((byte) 35, "Mobile Registration Request");
        MOBILE_REGISTRATION_REQUEST = icmpV4Type22;
        IcmpV4Type icmpV4Type23 = new IcmpV4Type((byte) 36, "Mobile Registration Reply");
        MOBILE_REGISTRATION_REPLY = icmpV4Type23;
        IcmpV4Type icmpV4Type24 = new IcmpV4Type((byte) 37, "Domain Name Request");
        DOMAIN_NAME_REQUEST = icmpV4Type24;
        IcmpV4Type icmpV4Type25 = new IcmpV4Type((byte) 38, "Domain Name Reply");
        DOMAIN_NAME_REPLY = icmpV4Type25;
        IcmpV4Type icmpV4Type26 = new IcmpV4Type((byte) 39, "SKIP");
        SKIP = icmpV4Type26;
        IcmpV4Type icmpV4Type27 = new IcmpV4Type((byte) 40, "Photuris");
        PHOTURIS = icmpV4Type27;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(icmpV4Type.value(), icmpV4Type);
        hashMap.put(icmpV4Type2.value(), icmpV4Type2);
        hashMap.put(icmpV4Type3.value(), icmpV4Type3);
        hashMap.put(icmpV4Type4.value(), icmpV4Type4);
        hashMap.put(icmpV4Type5.value(), icmpV4Type5);
        hashMap.put(icmpV4Type6.value(), icmpV4Type6);
        hashMap.put(icmpV4Type7.value(), icmpV4Type7);
        hashMap.put(icmpV4Type8.value(), icmpV4Type8);
        hashMap.put(icmpV4Type9.value(), icmpV4Type9);
        hashMap.put(icmpV4Type10.value(), icmpV4Type10);
        hashMap.put(icmpV4Type11.value(), icmpV4Type11);
        hashMap.put(icmpV4Type12.value(), icmpV4Type12);
        hashMap.put(icmpV4Type13.value(), icmpV4Type13);
        hashMap.put(icmpV4Type14.value(), icmpV4Type14);
        hashMap.put(icmpV4Type15.value(), icmpV4Type15);
        hashMap.put(icmpV4Type16.value(), icmpV4Type16);
        hashMap.put(icmpV4Type17.value(), icmpV4Type17);
        hashMap.put(icmpV4Type18.value(), icmpV4Type18);
        hashMap.put(icmpV4Type19.value(), icmpV4Type19);
        hashMap.put(icmpV4Type20.value(), icmpV4Type20);
        hashMap.put(icmpV4Type21.value(), icmpV4Type21);
        hashMap.put(icmpV4Type22.value(), icmpV4Type22);
        hashMap.put(icmpV4Type23.value(), icmpV4Type23);
        hashMap.put(icmpV4Type24.value(), icmpV4Type24);
        hashMap.put(icmpV4Type25.value(), icmpV4Type25);
        hashMap.put(icmpV4Type26.value(), icmpV4Type26);
        hashMap.put(icmpV4Type27.value(), icmpV4Type27);
    }

    public IcmpV4Type(Byte b10, String str) {
        super(b10, str);
    }

    public static IcmpV4Type getInstance(Byte b10) {
        Map<Byte, IcmpV4Type> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IcmpV4Type(b10, "unknown");
    }

    public static IcmpV4Type register(IcmpV4Type icmpV4Type) {
        return registry.put(icmpV4Type.value(), icmpV4Type);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IcmpV4Type icmpV4Type) {
        return value().compareTo(icmpV4Type.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
