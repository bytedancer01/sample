package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpV6NeighborDiscoveryOptionType.class */
public final class IpV6NeighborDiscoveryOptionType extends NamedNumber<Byte, IpV6NeighborDiscoveryOptionType> {
    public static final IpV6NeighborDiscoveryOptionType ADDRESS_REGISTRATION;
    public static final IpV6NeighborDiscoveryOptionType ADVERTISEMENT_INTERVAL;
    public static final IpV6NeighborDiscoveryOptionType AUTHORITATIVE_BORDER_ROUTER;
    public static final IpV6NeighborDiscoveryOptionType CARD_REPLY;
    public static final IpV6NeighborDiscoveryOptionType CARD_REQUEST;
    public static final IpV6NeighborDiscoveryOptionType CERTIFICATE;
    public static final IpV6NeighborDiscoveryOptionType CGA;
    public static final IpV6NeighborDiscoveryOptionType DNS_SEARCH_LIST;
    public static final IpV6NeighborDiscoveryOptionType HANDOVER_ASSIST_INFORMATION;
    public static final IpV6NeighborDiscoveryOptionType HANDOVER_KEY_REPLY;
    public static final IpV6NeighborDiscoveryOptionType HANDOVER_KEY_REQUEST;
    public static final IpV6NeighborDiscoveryOptionType HOME_AGENT_INFORMATION;
    public static final IpV6NeighborDiscoveryOptionType IP_ADDRESS_PREFIX;
    public static final IpV6NeighborDiscoveryOptionType LINK_LAYER_ADDRESS;
    public static final IpV6NeighborDiscoveryOptionType MAP;
    public static final IpV6NeighborDiscoveryOptionType MOBILE_NODE_IDENTIFIER;
    public static final IpV6NeighborDiscoveryOptionType MTU;
    public static final IpV6NeighborDiscoveryOptionType NBMA_SHORTCUT_LIMIT;
    public static final IpV6NeighborDiscoveryOptionType NEIGHBOR_ADVERTISEMENT_ACKNOWLEDGMENT;
    public static final IpV6NeighborDiscoveryOptionType NEW_ROUTER_PREFIX_INFORMATION;
    public static final IpV6NeighborDiscoveryOptionType NONCE;
    public static final IpV6NeighborDiscoveryOptionType PREFIX_INFORMATION;
    public static final IpV6NeighborDiscoveryOptionType PROXY_SIGNATURE;
    public static final IpV6NeighborDiscoveryOptionType RA_FLAGS_EXTENSION;
    public static final IpV6NeighborDiscoveryOptionType RECURSIVE_DNS_SERVER;
    public static final IpV6NeighborDiscoveryOptionType REDIRECTED_HEADER;
    public static final IpV6NeighborDiscoveryOptionType ROUTE_INFORMATION;
    public static final IpV6NeighborDiscoveryOptionType RSA_SIGNATURE;
    public static final IpV6NeighborDiscoveryOptionType SIX_CIO;
    public static final IpV6NeighborDiscoveryOptionType SIX_LOWPAN_CONTEXT;
    public static final IpV6NeighborDiscoveryOptionType SOURCE_ADDRESS_LIST;
    public static final IpV6NeighborDiscoveryOptionType SOURCE_LINK_LAYER_ADDRESS;
    public static final IpV6NeighborDiscoveryOptionType TARGET_ADDRESS_LIST;
    public static final IpV6NeighborDiscoveryOptionType TARGET_LINK_LAYER_ADDRESS;
    public static final IpV6NeighborDiscoveryOptionType TIMESTAMP;
    public static final IpV6NeighborDiscoveryOptionType TRUST_ANCHOR;
    private static final Map<Byte, IpV6NeighborDiscoveryOptionType> registry;
    private static final long serialVersionUID = -4894881455029294238L;

    static {
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType = new IpV6NeighborDiscoveryOptionType((byte) 1, "Source Link-layer Address");
        SOURCE_LINK_LAYER_ADDRESS = ipV6NeighborDiscoveryOptionType;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType2 = new IpV6NeighborDiscoveryOptionType((byte) 2, "Target Link-layer Address");
        TARGET_LINK_LAYER_ADDRESS = ipV6NeighborDiscoveryOptionType2;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType3 = new IpV6NeighborDiscoveryOptionType((byte) 3, "Prefix Information");
        PREFIX_INFORMATION = ipV6NeighborDiscoveryOptionType3;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType4 = new IpV6NeighborDiscoveryOptionType((byte) 4, "Redirected Header");
        REDIRECTED_HEADER = ipV6NeighborDiscoveryOptionType4;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType5 = new IpV6NeighborDiscoveryOptionType((byte) 5, "MTU");
        MTU = ipV6NeighborDiscoveryOptionType5;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType6 = new IpV6NeighborDiscoveryOptionType((byte) 6, "NBMA Shortcut Limit");
        NBMA_SHORTCUT_LIMIT = ipV6NeighborDiscoveryOptionType6;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType7 = new IpV6NeighborDiscoveryOptionType((byte) 7, "Advertisement Interval");
        ADVERTISEMENT_INTERVAL = ipV6NeighborDiscoveryOptionType7;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType8 = new IpV6NeighborDiscoveryOptionType((byte) 8, "Home Agent Information");
        HOME_AGENT_INFORMATION = ipV6NeighborDiscoveryOptionType8;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType9 = new IpV6NeighborDiscoveryOptionType((byte) 9, "Source Address List");
        SOURCE_ADDRESS_LIST = ipV6NeighborDiscoveryOptionType9;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType10 = new IpV6NeighborDiscoveryOptionType((byte) 10, "Target Address List");
        TARGET_ADDRESS_LIST = ipV6NeighborDiscoveryOptionType10;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType11 = new IpV6NeighborDiscoveryOptionType((byte) 11, "CGA");
        CGA = ipV6NeighborDiscoveryOptionType11;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType12 = new IpV6NeighborDiscoveryOptionType((byte) 12, "RSA Signature");
        RSA_SIGNATURE = ipV6NeighborDiscoveryOptionType12;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType13 = new IpV6NeighborDiscoveryOptionType((byte) 13, "Timestamp");
        TIMESTAMP = ipV6NeighborDiscoveryOptionType13;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType14 = new IpV6NeighborDiscoveryOptionType((byte) 14, "Nonce");
        NONCE = ipV6NeighborDiscoveryOptionType14;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType15 = new IpV6NeighborDiscoveryOptionType((byte) 15, "Trust Anchor");
        TRUST_ANCHOR = ipV6NeighborDiscoveryOptionType15;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType16 = new IpV6NeighborDiscoveryOptionType((byte) 16, "Certificate");
        CERTIFICATE = ipV6NeighborDiscoveryOptionType16;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType17 = new IpV6NeighborDiscoveryOptionType((byte) 17, "IP Address/Prefix");
        IP_ADDRESS_PREFIX = ipV6NeighborDiscoveryOptionType17;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType18 = new IpV6NeighborDiscoveryOptionType((byte) 18, "New Router Prefix Information");
        NEW_ROUTER_PREFIX_INFORMATION = ipV6NeighborDiscoveryOptionType18;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType19 = new IpV6NeighborDiscoveryOptionType((byte) 19, "Link-layer Address");
        LINK_LAYER_ADDRESS = ipV6NeighborDiscoveryOptionType19;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType20 = new IpV6NeighborDiscoveryOptionType((byte) 20, "Neighbor Advertisement Acknowledgment");
        NEIGHBOR_ADVERTISEMENT_ACKNOWLEDGMENT = ipV6NeighborDiscoveryOptionType20;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType21 = new IpV6NeighborDiscoveryOptionType((byte) 23, "MAP");
        MAP = ipV6NeighborDiscoveryOptionType21;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType22 = new IpV6NeighborDiscoveryOptionType((byte) 24, "Route Information");
        ROUTE_INFORMATION = ipV6NeighborDiscoveryOptionType22;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType23 = new IpV6NeighborDiscoveryOptionType((byte) 25, "Recursive DNS Server");
        RECURSIVE_DNS_SERVER = ipV6NeighborDiscoveryOptionType23;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType24 = new IpV6NeighborDiscoveryOptionType((byte) 26, "RA Flags Extension");
        RA_FLAGS_EXTENSION = ipV6NeighborDiscoveryOptionType24;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType25 = new IpV6NeighborDiscoveryOptionType((byte) 27, "Handover Key Request");
        HANDOVER_KEY_REQUEST = ipV6NeighborDiscoveryOptionType25;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType26 = new IpV6NeighborDiscoveryOptionType((byte) 28, "Handover Key Reply");
        HANDOVER_KEY_REPLY = ipV6NeighborDiscoveryOptionType26;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType27 = new IpV6NeighborDiscoveryOptionType((byte) 29, "Handover Assist Information");
        HANDOVER_ASSIST_INFORMATION = ipV6NeighborDiscoveryOptionType27;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType28 = new IpV6NeighborDiscoveryOptionType((byte) 30, "Mobile Node Identifier");
        MOBILE_NODE_IDENTIFIER = ipV6NeighborDiscoveryOptionType28;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType29 = new IpV6NeighborDiscoveryOptionType((byte) 31, "DNS Search List");
        DNS_SEARCH_LIST = ipV6NeighborDiscoveryOptionType29;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType30 = new IpV6NeighborDiscoveryOptionType((byte) 32, "Proxy Signature");
        PROXY_SIGNATURE = ipV6NeighborDiscoveryOptionType30;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType31 = new IpV6NeighborDiscoveryOptionType((byte) 33, "Address Registration");
        ADDRESS_REGISTRATION = ipV6NeighborDiscoveryOptionType31;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType32 = new IpV6NeighborDiscoveryOptionType((byte) 34, "6LoWPAN Context");
        SIX_LOWPAN_CONTEXT = ipV6NeighborDiscoveryOptionType32;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType33 = new IpV6NeighborDiscoveryOptionType((byte) 35, "Authoritative Border Router");
        AUTHORITATIVE_BORDER_ROUTER = ipV6NeighborDiscoveryOptionType33;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType34 = new IpV6NeighborDiscoveryOptionType((byte) 36, "6CIO");
        SIX_CIO = ipV6NeighborDiscoveryOptionType34;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType35 = new IpV6NeighborDiscoveryOptionType((byte) -118, "CARD Request");
        CARD_REQUEST = ipV6NeighborDiscoveryOptionType35;
        IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType36 = new IpV6NeighborDiscoveryOptionType((byte) -117, "CARD Reply");
        CARD_REPLY = ipV6NeighborDiscoveryOptionType36;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipV6NeighborDiscoveryOptionType.value(), ipV6NeighborDiscoveryOptionType);
        hashMap.put(ipV6NeighborDiscoveryOptionType2.value(), ipV6NeighborDiscoveryOptionType2);
        hashMap.put(ipV6NeighborDiscoveryOptionType3.value(), ipV6NeighborDiscoveryOptionType3);
        hashMap.put(ipV6NeighborDiscoveryOptionType4.value(), ipV6NeighborDiscoveryOptionType4);
        hashMap.put(ipV6NeighborDiscoveryOptionType5.value(), ipV6NeighborDiscoveryOptionType5);
        hashMap.put(ipV6NeighborDiscoveryOptionType6.value(), ipV6NeighborDiscoveryOptionType6);
        hashMap.put(ipV6NeighborDiscoveryOptionType7.value(), ipV6NeighborDiscoveryOptionType7);
        hashMap.put(ipV6NeighborDiscoveryOptionType8.value(), ipV6NeighborDiscoveryOptionType8);
        hashMap.put(ipV6NeighborDiscoveryOptionType9.value(), ipV6NeighborDiscoveryOptionType9);
        hashMap.put(ipV6NeighborDiscoveryOptionType10.value(), ipV6NeighborDiscoveryOptionType10);
        hashMap.put(ipV6NeighborDiscoveryOptionType11.value(), ipV6NeighborDiscoveryOptionType11);
        hashMap.put(ipV6NeighborDiscoveryOptionType12.value(), ipV6NeighborDiscoveryOptionType12);
        hashMap.put(ipV6NeighborDiscoveryOptionType13.value(), ipV6NeighborDiscoveryOptionType13);
        hashMap.put(ipV6NeighborDiscoveryOptionType14.value(), ipV6NeighborDiscoveryOptionType14);
        hashMap.put(ipV6NeighborDiscoveryOptionType15.value(), ipV6NeighborDiscoveryOptionType15);
        hashMap.put(ipV6NeighborDiscoveryOptionType16.value(), ipV6NeighborDiscoveryOptionType16);
        hashMap.put(ipV6NeighborDiscoveryOptionType17.value(), ipV6NeighborDiscoveryOptionType17);
        hashMap.put(ipV6NeighborDiscoveryOptionType18.value(), ipV6NeighborDiscoveryOptionType18);
        hashMap.put(ipV6NeighborDiscoveryOptionType19.value(), ipV6NeighborDiscoveryOptionType19);
        hashMap.put(ipV6NeighborDiscoveryOptionType20.value(), ipV6NeighborDiscoveryOptionType20);
        hashMap.put(ipV6NeighborDiscoveryOptionType21.value(), ipV6NeighborDiscoveryOptionType21);
        hashMap.put(ipV6NeighborDiscoveryOptionType22.value(), ipV6NeighborDiscoveryOptionType22);
        hashMap.put(ipV6NeighborDiscoveryOptionType23.value(), ipV6NeighborDiscoveryOptionType23);
        hashMap.put(ipV6NeighborDiscoveryOptionType24.value(), ipV6NeighborDiscoveryOptionType24);
        hashMap.put(ipV6NeighborDiscoveryOptionType25.value(), ipV6NeighborDiscoveryOptionType25);
        hashMap.put(ipV6NeighborDiscoveryOptionType26.value(), ipV6NeighborDiscoveryOptionType26);
        hashMap.put(ipV6NeighborDiscoveryOptionType27.value(), ipV6NeighborDiscoveryOptionType27);
        hashMap.put(ipV6NeighborDiscoveryOptionType28.value(), ipV6NeighborDiscoveryOptionType28);
        hashMap.put(ipV6NeighborDiscoveryOptionType29.value(), ipV6NeighborDiscoveryOptionType29);
        hashMap.put(ipV6NeighborDiscoveryOptionType30.value(), ipV6NeighborDiscoveryOptionType30);
        hashMap.put(ipV6NeighborDiscoveryOptionType31.value(), ipV6NeighborDiscoveryOptionType31);
        hashMap.put(ipV6NeighborDiscoveryOptionType32.value(), ipV6NeighborDiscoveryOptionType32);
        hashMap.put(ipV6NeighborDiscoveryOptionType33.value(), ipV6NeighborDiscoveryOptionType33);
        hashMap.put(ipV6NeighborDiscoveryOptionType34.value(), ipV6NeighborDiscoveryOptionType34);
        hashMap.put(ipV6NeighborDiscoveryOptionType35.value(), ipV6NeighborDiscoveryOptionType35);
        hashMap.put(ipV6NeighborDiscoveryOptionType36.value(), ipV6NeighborDiscoveryOptionType36);
    }

    public IpV6NeighborDiscoveryOptionType(Byte b10, String str) {
        super(b10, str);
    }

    public static IpV6NeighborDiscoveryOptionType getInstance(Byte b10) {
        Map<Byte, IpV6NeighborDiscoveryOptionType> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpV6NeighborDiscoveryOptionType(b10, "unknown");
    }

    public static IpV6NeighborDiscoveryOptionType register(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
        return registry.put(ipV6NeighborDiscoveryOptionType.value(), ipV6NeighborDiscoveryOptionType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV6NeighborDiscoveryOptionType ipV6NeighborDiscoveryOptionType) {
        return value().compareTo(ipV6NeighborDiscoveryOptionType.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
