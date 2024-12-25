package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IcmpV4Code.class */
public final class IcmpV4Code extends NamedNumber<Byte, IcmpV4Code> {
    public static final IcmpV4Code ALTERNATE_ADDRESS_FOR_HOST;
    public static final IcmpV4Code AUTHENTICATION_FAILED;
    public static final IcmpV4Code BAD_LENGTH;
    public static final IcmpV4Code BAD_SPI;
    public static final IcmpV4Code COMMUNICATION_PROHIBITED;
    public static final IcmpV4Code DECOMPRESSION_FAILED;
    public static final IcmpV4Code DECRYPTION_FAILED;
    public static final IcmpV4Code DOES_NOT_ROUTE_COMMON_TRAFFIC;
    public static final IcmpV4Code DST_HOST_PROHIBITED;
    public static final IcmpV4Code DST_HOST_UNKNOWN;
    public static final IcmpV4Code DST_HOST_UNREACHABLE_FOR_TOS;
    public static final IcmpV4Code DST_NETWORK_PROHIBITED;
    public static final IcmpV4Code DST_NETWORK_UNKNOWN;
    public static final IcmpV4Code DST_NETWORK_UNREACHABLE_FOR_TOS;
    public static final IcmpV4Code FRAGMENTATION_BLOCKED;
    public static final IcmpV4Code FRAGMENT_REASSEMBLY_TIME_EXCEEDED;
    public static final IcmpV4Code HOST_PRECEDENCE_VIOLATION;
    public static final IcmpV4Code HOST_UNREACHABLE;
    public static final IcmpV4Code MISSING_REQUIRED_OPTION;
    public static final IcmpV4Code NEED_AUTHENTICATION;
    public static final IcmpV4Code NEED_AUTHORIZATION;
    public static final IcmpV4Code NETWORK_UNREACHABLE;
    public static final IcmpV4Code NORMAL_ROUTER_ADVERTISEMENT;
    public static final IcmpV4Code NO_CODE;
    public static final IcmpV4Code POINTER_INDICATES_ERROR;
    public static final IcmpV4Code PORT_UNREACHABLE;
    public static final IcmpV4Code PRECEDENCE_CUTOFF_IN_EFFECT;
    public static final IcmpV4Code PROTOCOL_UNREACHABLE;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_HOST;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_NETWORK;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_TOS_AND_HOST;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_TOS_AND_NETWORK;
    public static final IcmpV4Code SRC_HOST_ISOLATED;
    public static final IcmpV4Code SRC_ROUTE_FAILED;
    public static final IcmpV4Code TIME_TO_LIVE_EXCEEDED;
    private static final Map<Byte, Map<Byte, IcmpV4Code>> registry;
    private static final long serialVersionUID = 7592798859079852877L;

    static {
        IcmpV4Code icmpV4Code = new IcmpV4Code((byte) 0, "No Code");
        NO_CODE = icmpV4Code;
        IcmpV4Code icmpV4Code2 = new IcmpV4Code((byte) 0, "Network Unreachable");
        NETWORK_UNREACHABLE = icmpV4Code2;
        IcmpV4Code icmpV4Code3 = new IcmpV4Code((byte) 1, "Host Unreachable");
        HOST_UNREACHABLE = icmpV4Code3;
        IcmpV4Code icmpV4Code4 = new IcmpV4Code((byte) 2, "Protocol Unreachable");
        PROTOCOL_UNREACHABLE = icmpV4Code4;
        IcmpV4Code icmpV4Code5 = new IcmpV4Code((byte) 3, "Port Unreachable");
        PORT_UNREACHABLE = icmpV4Code5;
        IcmpV4Code icmpV4Code6 = new IcmpV4Code((byte) 4, "Fragmentation needed but no fragment bit set");
        FRAGMENTATION_BLOCKED = icmpV4Code6;
        IcmpV4Code icmpV4Code7 = new IcmpV4Code((byte) 5, "Source routing failed");
        SRC_ROUTE_FAILED = icmpV4Code7;
        IcmpV4Code icmpV4Code8 = new IcmpV4Code((byte) 6, "Destination network unknown");
        DST_NETWORK_UNKNOWN = icmpV4Code8;
        IcmpV4Code icmpV4Code9 = new IcmpV4Code((byte) 7, "Destination host unknown");
        DST_HOST_UNKNOWN = icmpV4Code9;
        IcmpV4Code icmpV4Code10 = new IcmpV4Code((byte) 8, "Source host isolated");
        SRC_HOST_ISOLATED = icmpV4Code10;
        IcmpV4Code icmpV4Code11 = new IcmpV4Code((byte) 9, "Destination network administratively prohibited");
        DST_NETWORK_PROHIBITED = icmpV4Code11;
        IcmpV4Code icmpV4Code12 = new IcmpV4Code((byte) 10, "Destination host administratively prohibited");
        DST_HOST_PROHIBITED = icmpV4Code12;
        IcmpV4Code icmpV4Code13 = new IcmpV4Code((byte) 11, "Network unreachable for TOS");
        DST_NETWORK_UNREACHABLE_FOR_TOS = icmpV4Code13;
        IcmpV4Code icmpV4Code14 = new IcmpV4Code((byte) 12, "Host unreachable for TOS");
        DST_HOST_UNREACHABLE_FOR_TOS = icmpV4Code14;
        IcmpV4Code icmpV4Code15 = new IcmpV4Code((byte) 13, "Communication administratively prohibited by filtering");
        COMMUNICATION_PROHIBITED = icmpV4Code15;
        IcmpV4Code icmpV4Code16 = new IcmpV4Code((byte) 14, "Host precedence violation");
        HOST_PRECEDENCE_VIOLATION = icmpV4Code16;
        IcmpV4Code icmpV4Code17 = new IcmpV4Code((byte) 15, "Precedence cutoff in effect");
        PRECEDENCE_CUTOFF_IN_EFFECT = icmpV4Code17;
        IcmpV4Code icmpV4Code18 = new IcmpV4Code((byte) 0, "Redirect datagrams for the Network");
        REDIRECT_DATAGRAMS_FOR_NETWORK = icmpV4Code18;
        IcmpV4Code icmpV4Code19 = new IcmpV4Code((byte) 1, "Redirect datagrams for the Host");
        REDIRECT_DATAGRAMS_FOR_HOST = icmpV4Code19;
        IcmpV4Code icmpV4Code20 = new IcmpV4Code((byte) 2, "Redirect datagrams for the Type of Service and Network");
        REDIRECT_DATAGRAMS_FOR_TOS_AND_NETWORK = icmpV4Code20;
        IcmpV4Code icmpV4Code21 = new IcmpV4Code((byte) 3, "Redirect datagrams for the Type of Service and Host");
        REDIRECT_DATAGRAMS_FOR_TOS_AND_HOST = icmpV4Code21;
        IcmpV4Code icmpV4Code22 = new IcmpV4Code((byte) 0, "Alternate Address for Host");
        ALTERNATE_ADDRESS_FOR_HOST = icmpV4Code22;
        IcmpV4Code icmpV4Code23 = new IcmpV4Code((byte) 0, "Normal router advertisement");
        NORMAL_ROUTER_ADVERTISEMENT = icmpV4Code23;
        IcmpV4Code icmpV4Code24 = new IcmpV4Code((byte) 16, "Does not route common traffic");
        DOES_NOT_ROUTE_COMMON_TRAFFIC = icmpV4Code24;
        IcmpV4Code icmpV4Code25 = new IcmpV4Code((byte) 0, "Time to Live exceeded during transit");
        TIME_TO_LIVE_EXCEEDED = icmpV4Code25;
        IcmpV4Code icmpV4Code26 = new IcmpV4Code((byte) 1, "Fragment Reassembly Time Exceeded");
        FRAGMENT_REASSEMBLY_TIME_EXCEEDED = icmpV4Code26;
        IcmpV4Code icmpV4Code27 = new IcmpV4Code((byte) 0, "Pointer indicates the error");
        POINTER_INDICATES_ERROR = icmpV4Code27;
        IcmpV4Code icmpV4Code28 = new IcmpV4Code((byte) 1, "Missing a Required Option");
        MISSING_REQUIRED_OPTION = icmpV4Code28;
        IcmpV4Code icmpV4Code29 = new IcmpV4Code((byte) 2, "Bad Length");
        BAD_LENGTH = icmpV4Code29;
        IcmpV4Code icmpV4Code30 = new IcmpV4Code((byte) 0, "Bad SPI");
        BAD_SPI = icmpV4Code30;
        IcmpV4Code icmpV4Code31 = new IcmpV4Code((byte) 1, "Authentication Failed");
        AUTHENTICATION_FAILED = icmpV4Code31;
        IcmpV4Code icmpV4Code32 = new IcmpV4Code((byte) 2, "Decompression Failed");
        DECOMPRESSION_FAILED = icmpV4Code32;
        IcmpV4Code icmpV4Code33 = new IcmpV4Code((byte) 3, "Decryption Failed");
        DECRYPTION_FAILED = icmpV4Code33;
        IcmpV4Code icmpV4Code34 = new IcmpV4Code((byte) 4, "Need Authentication");
        NEED_AUTHENTICATION = icmpV4Code34;
        IcmpV4Code icmpV4Code35 = new IcmpV4Code((byte) 5, "Need Authorization");
        NEED_AUTHORIZATION = icmpV4Code35;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.ECHO_REPLY.value(), hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(icmpV4Code2.value(), icmpV4Code2);
        hashMap3.put(icmpV4Code3.value(), icmpV4Code3);
        hashMap3.put(icmpV4Code4.value(), icmpV4Code4);
        hashMap3.put(icmpV4Code5.value(), icmpV4Code5);
        hashMap3.put(icmpV4Code6.value(), icmpV4Code6);
        hashMap3.put(icmpV4Code7.value(), icmpV4Code7);
        hashMap3.put(icmpV4Code8.value(), icmpV4Code8);
        hashMap3.put(icmpV4Code9.value(), icmpV4Code9);
        hashMap3.put(icmpV4Code10.value(), icmpV4Code10);
        hashMap3.put(icmpV4Code11.value(), icmpV4Code11);
        hashMap3.put(icmpV4Code12.value(), icmpV4Code12);
        hashMap3.put(icmpV4Code13.value(), icmpV4Code13);
        hashMap3.put(icmpV4Code14.value(), icmpV4Code14);
        hashMap3.put(icmpV4Code15.value(), icmpV4Code15);
        hashMap3.put(icmpV4Code16.value(), icmpV4Code16);
        hashMap3.put(icmpV4Code17.value(), icmpV4Code17);
        hashMap.put(IcmpV4Type.DESTINATION_UNREACHABLE.value(), hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.SOURCE_QUENCH.value(), hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(icmpV4Code18.value(), icmpV4Code18);
        hashMap5.put(icmpV4Code19.value(), icmpV4Code19);
        hashMap5.put(icmpV4Code20.value(), icmpV4Code20);
        hashMap5.put(icmpV4Code21.value(), icmpV4Code21);
        hashMap.put(IcmpV4Type.REDIRECT.value(), hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(icmpV4Code22.value(), icmpV4Code22);
        hashMap.put(IcmpV4Type.ALTERNATE_HOST_ADDRESS.value(), hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.ECHO.value(), hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(icmpV4Code23.value(), icmpV4Code23);
        hashMap8.put(icmpV4Code24.value(), icmpV4Code24);
        hashMap.put(IcmpV4Type.ROUTER_ADVERTISEMENT.value(), hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.ROUTER_SOLICITATION.value(), hashMap9);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(icmpV4Code25.value(), icmpV4Code25);
        hashMap10.put(icmpV4Code26.value(), icmpV4Code26);
        hashMap.put(IcmpV4Type.TIME_EXCEEDED.value(), hashMap10);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(icmpV4Code27.value(), icmpV4Code27);
        hashMap11.put(icmpV4Code28.value(), icmpV4Code28);
        hashMap11.put(icmpV4Code29.value(), icmpV4Code29);
        hashMap.put(IcmpV4Type.PARAMETER_PROBLEM.value(), hashMap11);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.TIMESTAMP.value(), hashMap12);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.TIMESTAMP_REPLY.value(), hashMap13);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.INFORMATION_REQUEST.value(), hashMap14);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.INFORMATION_REPLY.value(), hashMap15);
        HashMap hashMap16 = new HashMap();
        hashMap16.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.ADDRESS_MASK_REQUEST.value(), hashMap16);
        HashMap hashMap17 = new HashMap();
        hashMap17.put(icmpV4Code.value(), icmpV4Code);
        hashMap.put(IcmpV4Type.ADDRESS_MASK_REPLY.value(), hashMap17);
        HashMap hashMap18 = new HashMap();
        hashMap18.put(icmpV4Code30.value(), icmpV4Code30);
        hashMap18.put(icmpV4Code31.value(), icmpV4Code31);
        hashMap18.put(icmpV4Code32.value(), icmpV4Code32);
        hashMap18.put(icmpV4Code33.value(), icmpV4Code33);
        hashMap18.put(icmpV4Code34.value(), icmpV4Code34);
        hashMap18.put(icmpV4Code35.value(), icmpV4Code35);
        hashMap.put(IcmpV4Type.PHOTURIS.value(), hashMap18);
    }

    public IcmpV4Code(Byte b10, String str) {
        super(b10, str);
    }

    public static IcmpV4Code getInstance(Byte b10, Byte b11) {
        Map<Byte, Map<Byte, IcmpV4Code>> map = registry;
        return (map.containsKey(b10) && map.get(b10).containsKey(b11)) ? map.get(b10).get(b11) : new IcmpV4Code(b11, "unknown");
    }

    public static IcmpV4Code register(IcmpV4Type icmpV4Type, IcmpV4Code icmpV4Code) {
        Map<Byte, Map<Byte, IcmpV4Code>> map = registry;
        if (map.containsKey(icmpV4Type.value())) {
            return map.get(icmpV4Type.value()).put(icmpV4Code.value(), icmpV4Code);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(icmpV4Code.value(), icmpV4Code);
        map.put(icmpV4Type.value(), hashMap);
        return null;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IcmpV4Code icmpV4Code) {
        return value().compareTo(icmpV4Code.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
