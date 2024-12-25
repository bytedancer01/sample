package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IcmpV6Code.class */
public final class IcmpV6Code extends NamedNumber<Byte, IcmpV6Code> {
    public static final IcmpV6Code ADDR_UNREACHABLE;
    public static final IcmpV6Code BEYOND_SCOPE_OF_SRC_ADDR;
    public static final IcmpV6Code COMMUNICATION_WITH_DST_PROHIBITED;
    public static final IcmpV6Code ERRONEOUS_HEADER_FIELD;
    public static final IcmpV6Code ERROR_IN_SRC_ROUTING_HEADER;
    public static final IcmpV6Code FIRST_FRAGMENT_HAS_INCOMPLETE_IP_V6_HEADER_CHAIN;
    public static final IcmpV6Code FRAGMENT_REASSEMBLY_TIME_EXCEEDED;
    public static final IcmpV6Code HOP_LIMIT_EXCEEDED;
    public static final IcmpV6Code NO_CODE;
    public static final IcmpV6Code NO_ROUTE_TO_DST;
    public static final IcmpV6Code PORT_UNREACHABLE;
    public static final IcmpV6Code REFUSE;
    public static final IcmpV6Code REJECT_ROUTE_TO_DST;
    public static final IcmpV6Code ROUTER_RENUMBERING_COMMAND;
    public static final IcmpV6Code ROUTER_RENUMBERING_RESULT;
    public static final IcmpV6Code SEQUENCE_NUMBER_RESET;
    public static final IcmpV6Code SRC_ADDR_FAILED_POLICY;
    public static final IcmpV6Code SUBJECT_IP_V4_ADDRESS;
    public static final IcmpV6Code SUBJECT_IP_V6_ADDRESS;
    public static final IcmpV6Code SUBJECT_NAME;
    public static final IcmpV6Code SUCCESSFUL_REPLY;
    public static final IcmpV6Code UNKNOWN_QTYPE;
    public static final IcmpV6Code UNRECOGNIZED_IP_V6_OPT;
    public static final IcmpV6Code UNRECOGNIZED_NEXT_HEADER_TYPE;
    private static final Map<Byte, Map<Byte, IcmpV6Code>> registry;
    private static final long serialVersionUID = 1442278011840551830L;

    static {
        IcmpV6Code icmpV6Code = new IcmpV6Code((byte) 0, "No Code");
        NO_CODE = icmpV6Code;
        IcmpV6Code icmpV6Code2 = new IcmpV6Code((byte) 0, "no route to destination");
        NO_ROUTE_TO_DST = icmpV6Code2;
        IcmpV6Code icmpV6Code3 = new IcmpV6Code((byte) 1, "communication with destination administratively prohibited");
        COMMUNICATION_WITH_DST_PROHIBITED = icmpV6Code3;
        IcmpV6Code icmpV6Code4 = new IcmpV6Code((byte) 2, "beyond scope of source address");
        BEYOND_SCOPE_OF_SRC_ADDR = icmpV6Code4;
        IcmpV6Code icmpV6Code5 = new IcmpV6Code((byte) 3, "address unreachable");
        ADDR_UNREACHABLE = icmpV6Code5;
        IcmpV6Code icmpV6Code6 = new IcmpV6Code((byte) 4, "port unreachable");
        PORT_UNREACHABLE = icmpV6Code6;
        IcmpV6Code icmpV6Code7 = new IcmpV6Code((byte) 5, "source address failed ingress/egress policy");
        SRC_ADDR_FAILED_POLICY = icmpV6Code7;
        IcmpV6Code icmpV6Code8 = new IcmpV6Code((byte) 6, "reject route to destination");
        REJECT_ROUTE_TO_DST = icmpV6Code8;
        IcmpV6Code icmpV6Code9 = new IcmpV6Code((byte) 7, "Error in Source Routing Header");
        ERROR_IN_SRC_ROUTING_HEADER = icmpV6Code9;
        IcmpV6Code icmpV6Code10 = new IcmpV6Code((byte) 0, "hop limit exceeded in transit");
        HOP_LIMIT_EXCEEDED = icmpV6Code10;
        IcmpV6Code icmpV6Code11 = new IcmpV6Code((byte) 1, "fragment reassembly time exceeded");
        FRAGMENT_REASSEMBLY_TIME_EXCEEDED = icmpV6Code11;
        IcmpV6Code icmpV6Code12 = new IcmpV6Code((byte) 0, "erroneous header field encountered");
        ERRONEOUS_HEADER_FIELD = icmpV6Code12;
        IcmpV6Code icmpV6Code13 = new IcmpV6Code((byte) 1, "unrecognized Next Header type encountered");
        UNRECOGNIZED_NEXT_HEADER_TYPE = icmpV6Code13;
        IcmpV6Code icmpV6Code14 = new IcmpV6Code((byte) 2, "unrecognized IPv6 option encountered");
        UNRECOGNIZED_IP_V6_OPT = icmpV6Code14;
        IcmpV6Code icmpV6Code15 = new IcmpV6Code((byte) 3, "IPv6 First Fragment has incomplete IPv6 Header Chain");
        FIRST_FRAGMENT_HAS_INCOMPLETE_IP_V6_HEADER_CHAIN = icmpV6Code15;
        IcmpV6Code icmpV6Code16 = new IcmpV6Code((byte) 0, "Router Renumbering Command");
        ROUTER_RENUMBERING_COMMAND = icmpV6Code16;
        IcmpV6Code icmpV6Code17 = new IcmpV6Code((byte) 1, "Router Renumbering Result");
        ROUTER_RENUMBERING_RESULT = icmpV6Code17;
        IcmpV6Code icmpV6Code18 = new IcmpV6Code((byte) -1, "Sequence Number Reset");
        SEQUENCE_NUMBER_RESET = icmpV6Code18;
        IcmpV6Code icmpV6Code19 = new IcmpV6Code((byte) 0, "Subject IPv6 address");
        SUBJECT_IP_V6_ADDRESS = icmpV6Code19;
        IcmpV6Code icmpV6Code20 = new IcmpV6Code((byte) 1, "Subject name");
        SUBJECT_NAME = icmpV6Code20;
        IcmpV6Code icmpV6Code21 = new IcmpV6Code((byte) 2, "Subject IPv4 address");
        SUBJECT_IP_V4_ADDRESS = icmpV6Code21;
        IcmpV6Code icmpV6Code22 = new IcmpV6Code((byte) 0, "Successful reply");
        SUCCESSFUL_REPLY = icmpV6Code22;
        IcmpV6Code icmpV6Code23 = new IcmpV6Code((byte) 1, "Refuse");
        REFUSE = icmpV6Code23;
        IcmpV6Code icmpV6Code24 = new IcmpV6Code((byte) 2, "Unknown Qtype");
        UNKNOWN_QTYPE = icmpV6Code24;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(icmpV6Code2.value(), icmpV6Code2);
        hashMap2.put(icmpV6Code3.value(), icmpV6Code3);
        hashMap2.put(icmpV6Code4.value(), icmpV6Code4);
        hashMap2.put(icmpV6Code5.value(), icmpV6Code5);
        hashMap2.put(icmpV6Code6.value(), icmpV6Code6);
        hashMap2.put(icmpV6Code7.value(), icmpV6Code7);
        hashMap2.put(icmpV6Code8.value(), icmpV6Code8);
        hashMap2.put(icmpV6Code9.value(), icmpV6Code9);
        hashMap.put(IcmpV6Type.DESTINATION_UNREACHABLE.value(), hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.PACKET_TOO_BIG.value(), hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(icmpV6Code10.value(), icmpV6Code10);
        hashMap4.put(icmpV6Code11.value(), icmpV6Code11);
        hashMap.put(IcmpV6Type.TIME_EXCEEDED.value(), hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(icmpV6Code12.value(), icmpV6Code12);
        hashMap5.put(icmpV6Code13.value(), icmpV6Code13);
        hashMap5.put(icmpV6Code14.value(), icmpV6Code14);
        hashMap5.put(icmpV6Code15.value(), icmpV6Code15);
        hashMap.put(IcmpV6Type.PARAMETER_PROBLEM.value(), hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.ECHO_REQUEST.value(), hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.ECHO_REPLY.value(), hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.MULTICAST_LISTENER_QUERY.value(), hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.MULTICAST_LISTENER_REPORT.value(), hashMap9);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.MULTICAST_LISTENER_DONE.value(), hashMap10);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.ROUTER_SOLICITATION.value(), hashMap11);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.ROUTER_ADVERTISEMENT.value(), hashMap12);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.NEIGHBOR_SOLICITATION.value(), hashMap13);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.NEIGHBOR_ADVERTISEMENT.value(), hashMap14);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.REDIRECT.value(), hashMap15);
        HashMap hashMap16 = new HashMap();
        hashMap16.put(icmpV6Code16.value(), icmpV6Code16);
        hashMap16.put(icmpV6Code17.value(), icmpV6Code17);
        hashMap16.put(icmpV6Code18.value(), icmpV6Code18);
        hashMap.put(IcmpV6Type.ROUTER_RENUMBERING.value(), hashMap16);
        HashMap hashMap17 = new HashMap();
        hashMap17.put(icmpV6Code19.value(), icmpV6Code19);
        hashMap17.put(icmpV6Code20.value(), icmpV6Code20);
        hashMap17.put(icmpV6Code21.value(), icmpV6Code21);
        hashMap.put(IcmpV6Type.ICMP_NODE_INFORMATION_QUERY.value(), hashMap17);
        HashMap hashMap18 = new HashMap();
        hashMap18.put(icmpV6Code22.value(), icmpV6Code22);
        hashMap18.put(icmpV6Code23.value(), icmpV6Code23);
        hashMap18.put(icmpV6Code24.value(), icmpV6Code24);
        hashMap.put(IcmpV6Type.ICMP_NODE_INFORMATION_RESPONSE.value(), hashMap18);
        HashMap hashMap19 = new HashMap();
        hashMap19.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.INVERSE_NEIGHBOR_DISCOVERY_SOLICITATION.value(), hashMap19);
        HashMap hashMap20 = new HashMap();
        hashMap20.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.INVERSE_NEIGHBOR_DISCOVERY_ADVERTISEMENT.value(), hashMap20);
        HashMap hashMap21 = new HashMap();
        hashMap21.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.HOME_AGENT_ADDRESS_DISCOVERY_REQUEST.value(), hashMap21);
        HashMap hashMap22 = new HashMap();
        hashMap22.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.HOME_AGENT_ADDRESS_DISCOVERY_REPLY.value(), hashMap22);
        HashMap hashMap23 = new HashMap();
        hashMap23.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.MOBILE_PREFIX_SOLICITATION.value(), hashMap23);
        HashMap hashMap24 = new HashMap();
        hashMap24.put(icmpV6Code.value(), icmpV6Code);
        hashMap.put(IcmpV6Type.MOBILE_PREFIX_ADVERTISEMENT.value(), hashMap24);
    }

    public IcmpV6Code(Byte b10, String str) {
        super(b10, str);
    }

    public static IcmpV6Code getInstance(Byte b10, Byte b11) {
        Map<Byte, Map<Byte, IcmpV6Code>> map = registry;
        return (map.containsKey(b10) && map.get(b10).containsKey(b11)) ? map.get(b10).get(b11) : new IcmpV6Code(b11, "unknown");
    }

    public static IcmpV6Code register(IcmpV6Type icmpV6Type, IcmpV6Code icmpV6Code) {
        Map<Byte, Map<Byte, IcmpV6Code>> map = registry;
        if (map.containsKey(icmpV6Type.value())) {
            return map.get(icmpV6Type.value()).put(icmpV6Code.value(), icmpV6Code);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(icmpV6Code.value(), icmpV6Code);
        map.put(icmpV6Type.value(), hashMap);
        return null;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IcmpV6Code icmpV6Code) {
        return value().compareTo(icmpV6Code.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
