package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IcmpV6Type.class */
public final class IcmpV6Type extends NamedNumber<Byte, IcmpV6Type> {
    public static final IcmpV6Type CERTIFICATION_PATH_ADVERTISEMENT;
    public static final IcmpV6Type CERTIFICATION_PATH_SOLICITATION;
    public static final IcmpV6Type DESTINATION_UNREACHABLE;
    public static final IcmpV6Type DUPLICATE_ADDRESS_CONFIRMATION;
    public static final IcmpV6Type DUPLICATE_ADDRESS_REQUEST;
    public static final IcmpV6Type ECHO_REPLY;
    public static final IcmpV6Type ECHO_REQUEST;
    public static final IcmpV6Type FMIP_V6;
    public static final IcmpV6Type HOME_AGENT_ADDRESS_DISCOVERY_REPLY;
    public static final IcmpV6Type HOME_AGENT_ADDRESS_DISCOVERY_REQUEST;
    public static final IcmpV6Type ICMP_NODE_INFORMATION_QUERY;
    public static final IcmpV6Type ICMP_NODE_INFORMATION_RESPONSE;
    public static final IcmpV6Type ILNP_V6_LOCATOR_UPDATE;
    public static final IcmpV6Type INVERSE_NEIGHBOR_DISCOVERY_ADVERTISEMENT;
    public static final IcmpV6Type INVERSE_NEIGHBOR_DISCOVERY_SOLICITATION;
    public static final IcmpV6Type MOBILE_PREFIX_ADVERTISEMENT;
    public static final IcmpV6Type MOBILE_PREFIX_SOLICITATION;
    public static final IcmpV6Type MULTICAST_LISTENER_DONE;
    public static final IcmpV6Type MULTICAST_LISTENER_QUERY;
    public static final IcmpV6Type MULTICAST_LISTENER_REPORT;
    public static final IcmpV6Type MULTICAST_ROUTER_ADVERTISEMENT;
    public static final IcmpV6Type MULTICAST_ROUTER_SOLICITATION;
    public static final IcmpV6Type MULTICAST_ROUTER_TERMINATION;
    public static final IcmpV6Type NEIGHBOR_ADVERTISEMENT;
    public static final IcmpV6Type NEIGHBOR_SOLICITATION;
    public static final IcmpV6Type PACKET_TOO_BIG;
    public static final IcmpV6Type PARAMETER_PROBLEM;
    public static final IcmpV6Type REDIRECT;
    public static final IcmpV6Type ROUTER_ADVERTISEMENT;
    public static final IcmpV6Type ROUTER_RENUMBERING;
    public static final IcmpV6Type ROUTER_SOLICITATION;
    public static final IcmpV6Type RPL_CONTROL;
    public static final IcmpV6Type TIME_EXCEEDED;
    public static final IcmpV6Type V2_MULTICAST_LISTENER_REPORT;
    private static final Map<Byte, IcmpV6Type> registry;
    private static final long serialVersionUID = 9190204239119018362L;

    static {
        IcmpV6Type icmpV6Type = new IcmpV6Type((byte) 1, "Destination Unreachable");
        DESTINATION_UNREACHABLE = icmpV6Type;
        IcmpV6Type icmpV6Type2 = new IcmpV6Type((byte) 2, "Packet Too Big");
        PACKET_TOO_BIG = icmpV6Type2;
        IcmpV6Type icmpV6Type3 = new IcmpV6Type((byte) 3, "Time Exceeded");
        TIME_EXCEEDED = icmpV6Type3;
        IcmpV6Type icmpV6Type4 = new IcmpV6Type((byte) 4, "Parameter Problem");
        PARAMETER_PROBLEM = icmpV6Type4;
        IcmpV6Type icmpV6Type5 = new IcmpV6Type(Byte.MIN_VALUE, "Echo Request");
        ECHO_REQUEST = icmpV6Type5;
        IcmpV6Type icmpV6Type6 = new IcmpV6Type((byte) -127, "Echo Reply");
        ECHO_REPLY = icmpV6Type6;
        IcmpV6Type icmpV6Type7 = new IcmpV6Type((byte) -126, "Multicast Listener Query");
        MULTICAST_LISTENER_QUERY = icmpV6Type7;
        IcmpV6Type icmpV6Type8 = new IcmpV6Type((byte) -125, "Multicast Listener Report");
        MULTICAST_LISTENER_REPORT = icmpV6Type8;
        IcmpV6Type icmpV6Type9 = new IcmpV6Type((byte) -124, "Multicast Listener Done");
        MULTICAST_LISTENER_DONE = icmpV6Type9;
        IcmpV6Type icmpV6Type10 = new IcmpV6Type((byte) -123, "Router Solicitation");
        ROUTER_SOLICITATION = icmpV6Type10;
        IcmpV6Type icmpV6Type11 = new IcmpV6Type((byte) -122, "Router Advertisement");
        ROUTER_ADVERTISEMENT = icmpV6Type11;
        IcmpV6Type icmpV6Type12 = new IcmpV6Type((byte) -121, "Neighbor Solicitation");
        NEIGHBOR_SOLICITATION = icmpV6Type12;
        IcmpV6Type icmpV6Type13 = new IcmpV6Type((byte) -120, "Neighbor Advertisement");
        NEIGHBOR_ADVERTISEMENT = icmpV6Type13;
        IcmpV6Type icmpV6Type14 = new IcmpV6Type((byte) -119, "Redirect");
        REDIRECT = icmpV6Type14;
        IcmpV6Type icmpV6Type15 = new IcmpV6Type((byte) -118, "Router Renumbering");
        ROUTER_RENUMBERING = icmpV6Type15;
        IcmpV6Type icmpV6Type16 = new IcmpV6Type((byte) -117, "ICMP Node Information Query");
        ICMP_NODE_INFORMATION_QUERY = icmpV6Type16;
        IcmpV6Type icmpV6Type17 = new IcmpV6Type((byte) -116, "ICMP Node Information Response");
        ICMP_NODE_INFORMATION_RESPONSE = icmpV6Type17;
        IcmpV6Type icmpV6Type18 = new IcmpV6Type((byte) -115, "Inverse Neighbor Discovery Solicitation");
        INVERSE_NEIGHBOR_DISCOVERY_SOLICITATION = icmpV6Type18;
        IcmpV6Type icmpV6Type19 = new IcmpV6Type((byte) -114, "Inverse Neighbor Discovery Advertisement");
        INVERSE_NEIGHBOR_DISCOVERY_ADVERTISEMENT = icmpV6Type19;
        IcmpV6Type icmpV6Type20 = new IcmpV6Type((byte) -113, "Version 2 Multicast Listener Report");
        V2_MULTICAST_LISTENER_REPORT = icmpV6Type20;
        IcmpV6Type icmpV6Type21 = new IcmpV6Type((byte) -112, "Home Agent Address Discovery Request");
        HOME_AGENT_ADDRESS_DISCOVERY_REQUEST = icmpV6Type21;
        IcmpV6Type icmpV6Type22 = new IcmpV6Type((byte) -111, "Home Agent Address Discovery Reply");
        HOME_AGENT_ADDRESS_DISCOVERY_REPLY = icmpV6Type22;
        IcmpV6Type icmpV6Type23 = new IcmpV6Type((byte) -110, "Mobile Prefix Solicitation");
        MOBILE_PREFIX_SOLICITATION = icmpV6Type23;
        IcmpV6Type icmpV6Type24 = new IcmpV6Type((byte) -109, "Mobile Prefix Advertisement");
        MOBILE_PREFIX_ADVERTISEMENT = icmpV6Type24;
        IcmpV6Type icmpV6Type25 = new IcmpV6Type((byte) -108, "Certification Path Solicitation");
        CERTIFICATION_PATH_SOLICITATION = icmpV6Type25;
        IcmpV6Type icmpV6Type26 = new IcmpV6Type((byte) -107, "Certification Path Advertisement");
        CERTIFICATION_PATH_ADVERTISEMENT = icmpV6Type26;
        IcmpV6Type icmpV6Type27 = new IcmpV6Type((byte) -105, "Multicast Router Advertisement");
        MULTICAST_ROUTER_ADVERTISEMENT = icmpV6Type27;
        IcmpV6Type icmpV6Type28 = new IcmpV6Type((byte) -104, "Multicast Router Solicitation");
        MULTICAST_ROUTER_SOLICITATION = icmpV6Type28;
        IcmpV6Type icmpV6Type29 = new IcmpV6Type((byte) -103, "Multicast Router Termination");
        MULTICAST_ROUTER_TERMINATION = icmpV6Type29;
        IcmpV6Type icmpV6Type30 = new IcmpV6Type((byte) -102, "FMIPv6");
        FMIP_V6 = icmpV6Type30;
        IcmpV6Type icmpV6Type31 = new IcmpV6Type((byte) -101, "RPL Control");
        RPL_CONTROL = icmpV6Type31;
        IcmpV6Type icmpV6Type32 = new IcmpV6Type((byte) -100, "ILNPv6 Locator Update");
        ILNP_V6_LOCATOR_UPDATE = icmpV6Type32;
        IcmpV6Type icmpV6Type33 = new IcmpV6Type((byte) -99, "Duplicate Address Request");
        DUPLICATE_ADDRESS_REQUEST = icmpV6Type33;
        IcmpV6Type icmpV6Type34 = new IcmpV6Type((byte) -98, "Duplicate Address Confirmation");
        DUPLICATE_ADDRESS_CONFIRMATION = icmpV6Type34;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(icmpV6Type.value(), icmpV6Type);
        hashMap.put(icmpV6Type2.value(), icmpV6Type2);
        hashMap.put(icmpV6Type3.value(), icmpV6Type3);
        hashMap.put(icmpV6Type4.value(), icmpV6Type4);
        hashMap.put(icmpV6Type5.value(), icmpV6Type5);
        hashMap.put(icmpV6Type6.value(), icmpV6Type6);
        hashMap.put(icmpV6Type7.value(), icmpV6Type7);
        hashMap.put(icmpV6Type8.value(), icmpV6Type8);
        hashMap.put(icmpV6Type9.value(), icmpV6Type9);
        hashMap.put(icmpV6Type10.value(), icmpV6Type10);
        hashMap.put(icmpV6Type11.value(), icmpV6Type11);
        hashMap.put(icmpV6Type12.value(), icmpV6Type12);
        hashMap.put(icmpV6Type13.value(), icmpV6Type13);
        hashMap.put(icmpV6Type14.value(), icmpV6Type14);
        hashMap.put(icmpV6Type15.value(), icmpV6Type15);
        hashMap.put(icmpV6Type16.value(), icmpV6Type16);
        hashMap.put(icmpV6Type17.value(), icmpV6Type17);
        hashMap.put(icmpV6Type18.value(), icmpV6Type18);
        hashMap.put(icmpV6Type19.value(), icmpV6Type19);
        hashMap.put(icmpV6Type20.value(), icmpV6Type20);
        hashMap.put(icmpV6Type21.value(), icmpV6Type21);
        hashMap.put(icmpV6Type22.value(), icmpV6Type22);
        hashMap.put(icmpV6Type23.value(), icmpV6Type23);
        hashMap.put(icmpV6Type24.value(), icmpV6Type24);
        hashMap.put(icmpV6Type25.value(), icmpV6Type25);
        hashMap.put(icmpV6Type26.value(), icmpV6Type26);
        hashMap.put(icmpV6Type27.value(), icmpV6Type27);
        hashMap.put(icmpV6Type28.value(), icmpV6Type28);
        hashMap.put(icmpV6Type29.value(), icmpV6Type29);
        hashMap.put(icmpV6Type30.value(), icmpV6Type30);
        hashMap.put(icmpV6Type31.value(), icmpV6Type31);
        hashMap.put(icmpV6Type32.value(), icmpV6Type32);
        hashMap.put(icmpV6Type33.value(), icmpV6Type33);
        hashMap.put(icmpV6Type34.value(), icmpV6Type34);
    }

    public IcmpV6Type(Byte b10, String str) {
        super(b10, str);
    }

    public static IcmpV6Type getInstance(Byte b10) {
        Map<Byte, IcmpV6Type> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IcmpV6Type(b10, "unknown");
    }

    public static IcmpV6Type register(IcmpV6Type icmpV6Type) {
        return registry.put(icmpV6Type.value(), icmpV6Type);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IcmpV6Type icmpV6Type) {
        return value().compareTo(icmpV6Type.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
