package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/IpNumber.class */
public final class IpNumber extends NamedNumber<Byte, IpNumber> {
    public static final IpNumber ACTIVE_NETWORKS;

    /* renamed from: AH */
    public static final IpNumber f36282AH;
    public static final IpNumber ARGUS;
    public static final IpNumber ARIS;
    public static final IpNumber AX_25;
    public static final IpNumber BBN_RCC_MON;
    public static final IpNumber BNA;
    public static final IpNumber BR_SAT_MON;
    public static final IpNumber CBT;
    public static final IpNumber CFTP;
    public static final IpNumber CHAOS;
    public static final IpNumber COMPAQ_PEER;
    public static final IpNumber CPHB;
    public static final IpNumber CPNX;
    public static final IpNumber CRTP;
    public static final IpNumber CRUDP;
    public static final IpNumber DCCP;
    public static final IpNumber DCN_MEAS;
    public static final IpNumber DDP;
    public static final IpNumber DDX;
    public static final IpNumber DGP;
    public static final IpNumber DSR;
    public static final IpNumber EGP;
    public static final IpNumber EIGRP;
    public static final IpNumber EMCON;
    public static final IpNumber ENCAP;
    public static final IpNumber ESP;
    public static final IpNumber ETHERIP;

    /* renamed from: FC */
    public static final IpNumber f36283FC;
    public static final IpNumber FIRE;
    public static final IpNumber GGP;
    public static final IpNumber GMTP;
    public static final IpNumber GRE;
    public static final IpNumber HIP;
    public static final IpNumber HMP;
    public static final IpNumber IATP;
    public static final IpNumber ICMPV4;
    public static final IpNumber ICMPV6;
    public static final IpNumber IDPR;
    public static final IpNumber IDPR_CMTP;
    public static final IpNumber IDRP;
    public static final IpNumber IFMP;
    public static final IpNumber IGMP;
    public static final IpNumber IGP;

    /* renamed from: IL */
    public static final IpNumber f36284IL;
    public static final IpNumber IPCOMP;
    public static final IpNumber IPCV;
    public static final IpNumber IPIP;
    public static final IpNumber IPLT;
    public static final IpNumber IPPC;
    public static final IpNumber IPTM;
    public static final IpNumber IPV4;
    public static final IpNumber IPV6;
    public static final IpNumber IPV6_DST_OPTS;
    public static final IpNumber IPV6_FRAG;
    public static final IpNumber IPV6_HOPOPT;
    public static final IpNumber IPV6_NONXT;
    public static final IpNumber IPV6_ROUTE;
    public static final IpNumber IPX_IN_IP;
    public static final IpNumber IRTP;
    public static final IpNumber ISIS_OVER_IPV4;
    public static final IpNumber ISO_IP;
    public static final IpNumber ISO_TP4;
    public static final IpNumber I_NLSP;
    public static final IpNumber KRYPTOLAN;
    public static final IpNumber L2TP;
    public static final IpNumber LARP;
    public static final IpNumber LEAF_1;
    public static final IpNumber LEAF_2;
    public static final IpNumber MANET;
    public static final IpNumber MERIT_INP;
    public static final IpNumber MFE_NSP;
    public static final IpNumber MICP;
    public static final IpNumber MOBILE;
    public static final IpNumber MOBILITY_HEADER;
    public static final IpNumber MPLS_IN_IP;
    public static final IpNumber MTP;
    public static final IpNumber MUX;
    public static final IpNumber NARP;
    public static final IpNumber NETBLT;
    public static final IpNumber NSFNET_IGP;
    public static final IpNumber NVP_II;
    public static final IpNumber OSPFIGP;
    public static final IpNumber PGM;
    public static final IpNumber PIM;
    public static final IpNumber PIPE;
    public static final IpNumber PNNI;
    public static final IpNumber PRM;
    public static final IpNumber PTP;
    public static final IpNumber PUP;
    public static final IpNumber PVP;
    public static final IpNumber QNX;
    public static final IpNumber RDP;
    public static final IpNumber ROHC;
    public static final IpNumber RSVP;
    public static final IpNumber RSVP_E2E_IGNORE;
    public static final IpNumber RVD;
    public static final IpNumber SAT_EXPAK;
    public static final IpNumber SAT_MON;
    public static final IpNumber SCC_SP;
    public static final IpNumber SCPS;
    public static final IpNumber SCTP;
    public static final IpNumber SDRP;
    public static final IpNumber SECURE_VMTP;
    public static final IpNumber SHIM6;
    public static final IpNumber SKIP;

    /* renamed from: SM */
    public static final IpNumber f36285SM;
    public static final IpNumber SMP;
    public static final IpNumber SNP;
    public static final IpNumber SPRITE_RPC;
    public static final IpNumber SPS;
    public static final IpNumber SRP;
    public static final IpNumber SSCOPMCE;

    /* renamed from: ST */
    public static final IpNumber f36286ST;
    public static final IpNumber STP;
    public static final IpNumber SUN_ND;
    public static final IpNumber SWIPE;
    public static final IpNumber TCF;
    public static final IpNumber TCP;
    public static final IpNumber TLSP;
    public static final IpNumber TPC;
    public static final IpNumber TP_PP;
    public static final IpNumber TRUNK_1;
    public static final IpNumber TRUNK_2;
    public static final IpNumber TTP;
    public static final IpNumber UDP;
    public static final IpNumber UDPLITE;
    public static final IpNumber UTI;
    public static final IpNumber VINES;
    public static final IpNumber VISA;
    public static final IpNumber VMTP;
    public static final IpNumber VRRP;
    public static final IpNumber WB_EXPAK;
    public static final IpNumber WB_MON;
    public static final IpNumber WESP;
    public static final IpNumber WSN;
    public static final IpNumber XNET;
    public static final IpNumber XNS_IDP;
    public static final IpNumber XTP;
    private static final Map<Byte, IpNumber> registry;
    private static final long serialVersionUID = -3109332132272568136L;

    static {
        IpNumber ipNumber = new IpNumber((byte) 0, "IPv6 Hop-by-Hop Option");
        IPV6_HOPOPT = ipNumber;
        IpNumber ipNumber2 = new IpNumber((byte) 1, "ICMPv4");
        ICMPV4 = ipNumber2;
        IpNumber ipNumber3 = new IpNumber((byte) 2, "IGMP");
        IGMP = ipNumber3;
        IpNumber ipNumber4 = new IpNumber((byte) 3, "GGP");
        GGP = ipNumber4;
        IpNumber ipNumber5 = new IpNumber((byte) 4, "IPv4 encapsulation");
        IPV4 = ipNumber5;
        IpNumber ipNumber6 = new IpNumber((byte) 5, "Stream");
        f36286ST = ipNumber6;
        IpNumber ipNumber7 = new IpNumber((byte) 6, "TCP");
        TCP = ipNumber7;
        IpNumber ipNumber8 = new IpNumber((byte) 7, "CBT");
        CBT = ipNumber8;
        IpNumber ipNumber9 = new IpNumber((byte) 8, "EGP");
        EGP = ipNumber9;
        IpNumber ipNumber10 = new IpNumber((byte) 9, "IGP");
        IGP = ipNumber10;
        IpNumber ipNumber11 = new IpNumber((byte) 10, "BBN RCC Monitoring");
        BBN_RCC_MON = ipNumber11;
        IpNumber ipNumber12 = new IpNumber((byte) 11, "NVP-II");
        NVP_II = ipNumber12;
        IpNumber ipNumber13 = new IpNumber((byte) 12, "PUP");
        PUP = ipNumber13;
        IpNumber ipNumber14 = new IpNumber((byte) 13, "ARGUS");
        ARGUS = ipNumber14;
        IpNumber ipNumber15 = new IpNumber((byte) 14, "EMCON");
        EMCON = ipNumber15;
        IpNumber ipNumber16 = new IpNumber((byte) 15, "XNET");
        XNET = ipNumber16;
        IpNumber ipNumber17 = new IpNumber((byte) 16, "Chaos");
        CHAOS = ipNumber17;
        IpNumber ipNumber18 = new IpNumber((byte) 17, "UDP");
        UDP = ipNumber18;
        IpNumber ipNumber19 = new IpNumber((byte) 18, "Multiplexing");
        MUX = ipNumber19;
        IpNumber ipNumber20 = new IpNumber((byte) 19, "DCN-MEAS");
        DCN_MEAS = ipNumber20;
        IpNumber ipNumber21 = new IpNumber((byte) 20, "HMP");
        HMP = ipNumber21;
        IpNumber ipNumber22 = new IpNumber((byte) 21, "PRM");
        PRM = ipNumber22;
        IpNumber ipNumber23 = new IpNumber((byte) 22, "XEROX NS IDP");
        XNS_IDP = ipNumber23;
        IpNumber ipNumber24 = new IpNumber((byte) 23, "Trunk-1");
        TRUNK_1 = ipNumber24;
        IpNumber ipNumber25 = new IpNumber((byte) 24, "Trunk-2");
        TRUNK_2 = ipNumber25;
        IpNumber ipNumber26 = new IpNumber((byte) 25, "Leaf-1");
        LEAF_1 = ipNumber26;
        IpNumber ipNumber27 = new IpNumber((byte) 26, "Leaf-2");
        LEAF_2 = ipNumber27;
        IpNumber ipNumber28 = new IpNumber((byte) 27, "RDP");
        RDP = ipNumber28;
        IpNumber ipNumber29 = new IpNumber((byte) 28, "IRTP");
        IRTP = ipNumber29;
        IpNumber ipNumber30 = new IpNumber((byte) 29, "ISO-TP4");
        ISO_TP4 = ipNumber30;
        IpNumber ipNumber31 = new IpNumber((byte) 30, "NETBLT");
        NETBLT = ipNumber31;
        IpNumber ipNumber32 = new IpNumber((byte) 31, "MFE-NSP");
        MFE_NSP = ipNumber32;
        IpNumber ipNumber33 = new IpNumber((byte) 32, "MERIT-INP");
        MERIT_INP = ipNumber33;
        IpNumber ipNumber34 = new IpNumber((byte) 33, "DCCP");
        DCCP = ipNumber34;
        IpNumber ipNumber35 = new IpNumber((byte) 34, "3PC");
        TPC = ipNumber35;
        IpNumber ipNumber36 = new IpNumber((byte) 35, "IDPR");
        IDPR = ipNumber36;
        IpNumber ipNumber37 = new IpNumber((byte) 36, "XTP");
        XTP = ipNumber37;
        IpNumber ipNumber38 = new IpNumber((byte) 37, "DDP");
        DDP = ipNumber38;
        IpNumber ipNumber39 = new IpNumber((byte) 38, "IDPR-CMTP");
        IDPR_CMTP = ipNumber39;
        IpNumber ipNumber40 = new IpNumber((byte) 39, "TP++");
        TP_PP = ipNumber40;
        IpNumber ipNumber41 = new IpNumber((byte) 40, "IL");
        f36284IL = ipNumber41;
        IpNumber ipNumber42 = new IpNumber((byte) 41, "IPv6 encapsulation");
        IPV6 = ipNumber42;
        IpNumber ipNumber43 = new IpNumber((byte) 42, "SDRP");
        SDRP = ipNumber43;
        IpNumber ipNumber44 = new IpNumber((byte) 43, "Routing Header for IPv6");
        IPV6_ROUTE = ipNumber44;
        IpNumber ipNumber45 = new IpNumber((byte) 44, "Fragment Header for IPv6");
        IPV6_FRAG = ipNumber45;
        IpNumber ipNumber46 = new IpNumber((byte) 45, "IDRP");
        IDRP = ipNumber46;
        IpNumber ipNumber47 = new IpNumber((byte) 46, "RSVP");
        RSVP = ipNumber47;
        IpNumber ipNumber48 = new IpNumber((byte) 47, "GRE");
        GRE = ipNumber48;
        IpNumber ipNumber49 = new IpNumber((byte) 48, "DSR");
        DSR = ipNumber49;
        IpNumber ipNumber50 = new IpNumber((byte) 49, "BNA");
        BNA = ipNumber50;
        IpNumber ipNumber51 = new IpNumber((byte) 50, "ESP");
        ESP = ipNumber51;
        IpNumber ipNumber52 = new IpNumber((byte) 51, "Authentication Header");
        f36282AH = ipNumber52;
        IpNumber ipNumber53 = new IpNumber((byte) 52, "I-NLSP");
        I_NLSP = ipNumber53;
        IpNumber ipNumber54 = new IpNumber((byte) 53, "SWIPE");
        SWIPE = ipNumber54;
        IpNumber ipNumber55 = new IpNumber((byte) 54, "NARP");
        NARP = ipNumber55;
        IpNumber ipNumber56 = new IpNumber((byte) 55, "IP Mobility");
        MOBILE = ipNumber56;
        IpNumber ipNumber57 = new IpNumber((byte) 56, "TLSP");
        TLSP = ipNumber57;
        IpNumber ipNumber58 = new IpNumber((byte) 57, "SKIP");
        SKIP = ipNumber58;
        IpNumber ipNumber59 = new IpNumber((byte) 58, "ICMPv6");
        ICMPV6 = ipNumber59;
        IpNumber ipNumber60 = new IpNumber((byte) 59, "No Next Header for IPv6");
        IPV6_NONXT = ipNumber60;
        IpNumber ipNumber61 = new IpNumber((byte) 60, "Destination Options for IPv6");
        IPV6_DST_OPTS = ipNumber61;
        IpNumber ipNumber62 = new IpNumber((byte) 62, "CFTP");
        CFTP = ipNumber62;
        IpNumber ipNumber63 = new IpNumber((byte) 64, "SATNET and Backroom EXPAK");
        SAT_EXPAK = ipNumber63;
        IpNumber ipNumber64 = new IpNumber((byte) 65, "Kryptolan");
        KRYPTOLAN = ipNumber64;
        IpNumber ipNumber65 = new IpNumber((byte) 66, "RVD");
        RVD = ipNumber65;
        IpNumber ipNumber66 = new IpNumber((byte) 67, "IPPC");
        IPPC = ipNumber66;
        IpNumber ipNumber67 = new IpNumber((byte) 69, "SATNET Monitoring");
        SAT_MON = ipNumber67;
        IpNumber ipNumber68 = new IpNumber((byte) 70, "VISA");
        VISA = ipNumber68;
        IpNumber ipNumber69 = new IpNumber((byte) 71, "IPCV");
        IPCV = ipNumber69;
        IpNumber ipNumber70 = new IpNumber((byte) 72, "CPNX");
        CPNX = ipNumber70;
        IpNumber ipNumber71 = new IpNumber((byte) 73, "CPHB");
        CPHB = ipNumber71;
        IpNumber ipNumber72 = new IpNumber((byte) 74, "WSN");
        WSN = ipNumber72;
        IpNumber ipNumber73 = new IpNumber((byte) 75, "PVP");
        PVP = ipNumber73;
        IpNumber ipNumber74 = new IpNumber((byte) 76, "Backroom SATNET Monitoring");
        BR_SAT_MON = ipNumber74;
        IpNumber ipNumber75 = new IpNumber((byte) 77, "SUN-ND");
        SUN_ND = ipNumber75;
        IpNumber ipNumber76 = new IpNumber((byte) 78, "WIDEBAND Monitoring");
        WB_MON = ipNumber76;
        IpNumber ipNumber77 = new IpNumber((byte) 79, "WIDEBAND EXPAK");
        WB_EXPAK = ipNumber77;
        IpNumber ipNumber78 = new IpNumber((byte) 80, "ISO-IP");
        ISO_IP = ipNumber78;
        IpNumber ipNumber79 = new IpNumber((byte) 81, "VMTP");
        VMTP = ipNumber79;
        IpNumber ipNumber80 = new IpNumber((byte) 82, "SECURE-VMTP");
        SECURE_VMTP = ipNumber80;
        IpNumber ipNumber81 = new IpNumber((byte) 83, "VINES");
        VINES = ipNumber81;
        IpNumber ipNumber82 = new IpNumber((byte) 84, "TTP");
        TTP = ipNumber82;
        IpNumber ipNumber83 = new IpNumber((byte) 84, "IPTM");
        IPTM = ipNumber83;
        IpNumber ipNumber84 = new IpNumber((byte) 85, "NSFNET-IGP");
        NSFNET_IGP = ipNumber84;
        IpNumber ipNumber85 = new IpNumber((byte) 86, "DGP");
        DGP = ipNumber85;
        IpNumber ipNumber86 = new IpNumber((byte) 87, "TCF");
        TCF = ipNumber86;
        IpNumber ipNumber87 = new IpNumber((byte) 88, "EIGRP");
        EIGRP = ipNumber87;
        IpNumber ipNumber88 = new IpNumber((byte) 89, "OSPFIGP");
        OSPFIGP = ipNumber88;
        IpNumber ipNumber89 = new IpNumber((byte) 90, "Sprite RPC");
        SPRITE_RPC = ipNumber89;
        IpNumber ipNumber90 = new IpNumber((byte) 91, "LARP");
        LARP = ipNumber90;
        IpNumber ipNumber91 = new IpNumber((byte) 92, "MTP");
        MTP = ipNumber91;
        IpNumber ipNumber92 = new IpNumber((byte) 93, "AX.25");
        AX_25 = ipNumber92;
        IpNumber ipNumber93 = new IpNumber((byte) 94, "IPIP");
        IPIP = ipNumber93;
        IpNumber ipNumber94 = new IpNumber((byte) 95, "MICP");
        MICP = ipNumber94;
        IpNumber ipNumber95 = new IpNumber((byte) 96, "SCC-SP");
        SCC_SP = ipNumber95;
        IpNumber ipNumber96 = new IpNumber((byte) 97, "Ethernet-within-IP Encapsulation");
        ETHERIP = ipNumber96;
        IpNumber ipNumber97 = new IpNumber((byte) 98, "Encapsulation Header");
        ENCAP = ipNumber97;
        IpNumber ipNumber98 = new IpNumber((byte) 100, "GMTP");
        GMTP = ipNumber98;
        IpNumber ipNumber99 = new IpNumber((byte) 101, "IFMP");
        IFMP = ipNumber99;
        IpNumber ipNumber100 = new IpNumber((byte) 102, "PNNI over IP");
        PNNI = ipNumber100;
        IpNumber ipNumber101 = new IpNumber((byte) 103, "PIM");
        PIM = ipNumber101;
        IpNumber ipNumber102 = new IpNumber((byte) 104, "ARIS");
        ARIS = ipNumber102;
        IpNumber ipNumber103 = new IpNumber((byte) 105, "SCPS");
        SCPS = ipNumber103;
        IpNumber ipNumber104 = new IpNumber((byte) 106, "QNX");
        QNX = ipNumber104;
        IpNumber ipNumber105 = new IpNumber((byte) 107, "Active Networks");
        ACTIVE_NETWORKS = ipNumber105;
        IpNumber ipNumber106 = new IpNumber((byte) 108, "IPCOMP");
        IPCOMP = ipNumber106;
        IpNumber ipNumber107 = new IpNumber((byte) 109, "SNP");
        SNP = ipNumber107;
        IpNumber ipNumber108 = new IpNumber((byte) 110, "Compaq Peer");
        COMPAQ_PEER = ipNumber108;
        IpNumber ipNumber109 = new IpNumber((byte) 111, "IPX in IP");
        IPX_IN_IP = ipNumber109;
        IpNumber ipNumber110 = new IpNumber((byte) 112, "VRRP");
        VRRP = ipNumber110;
        IpNumber ipNumber111 = new IpNumber((byte) 113, "PGM");
        PGM = ipNumber111;
        IpNumber ipNumber112 = new IpNumber((byte) 115, "L2TP");
        L2TP = ipNumber112;
        IpNumber ipNumber113 = new IpNumber((byte) 116, "DDX");
        DDX = ipNumber113;
        IpNumber ipNumber114 = new IpNumber((byte) 117, "IATP");
        IATP = ipNumber114;
        IpNumber ipNumber115 = new IpNumber((byte) 118, "STP");
        STP = ipNumber115;
        IpNumber ipNumber116 = new IpNumber((byte) 119, "SRP");
        SRP = ipNumber116;
        IpNumber ipNumber117 = new IpNumber((byte) 120, "UTI");
        UTI = ipNumber117;
        IpNumber ipNumber118 = new IpNumber((byte) 121, "SMP");
        SMP = ipNumber118;
        IpNumber ipNumber119 = new IpNumber((byte) 122, "SM");
        f36285SM = ipNumber119;
        IpNumber ipNumber120 = new IpNumber((byte) 123, "PTP");
        PTP = ipNumber120;
        IpNumber ipNumber121 = new IpNumber((byte) 124, "ISIS over IPv4");
        ISIS_OVER_IPV4 = ipNumber121;
        IpNumber ipNumber122 = new IpNumber((byte) 125, "FIRE");
        FIRE = ipNumber122;
        IpNumber ipNumber123 = new IpNumber((byte) 126, "CRTP");
        CRTP = ipNumber123;
        IpNumber ipNumber124 = new IpNumber(Byte.MAX_VALUE, "CRUDP");
        CRUDP = ipNumber124;
        IpNumber ipNumber125 = new IpNumber(Byte.MIN_VALUE, "SSCOPMCE");
        SSCOPMCE = ipNumber125;
        IpNumber ipNumber126 = new IpNumber((byte) -127, "IPLT");
        IPLT = ipNumber126;
        IpNumber ipNumber127 = new IpNumber((byte) -126, "SPS");
        SPS = ipNumber127;
        IpNumber ipNumber128 = new IpNumber((byte) -125, "PIPE");
        PIPE = ipNumber128;
        IpNumber ipNumber129 = new IpNumber((byte) -124, "SCTP");
        SCTP = ipNumber129;
        IpNumber ipNumber130 = new IpNumber((byte) -123, "Fibre Channel");
        f36283FC = ipNumber130;
        IpNumber ipNumber131 = new IpNumber((byte) -122, "RSVP-E2E-IGNORE");
        RSVP_E2E_IGNORE = ipNumber131;
        IpNumber ipNumber132 = new IpNumber((byte) -121, "Mobility Header");
        MOBILITY_HEADER = ipNumber132;
        IpNumber ipNumber133 = new IpNumber((byte) -120, "UDPLite");
        UDPLITE = ipNumber133;
        IpNumber ipNumber134 = new IpNumber((byte) -119, "MPLS-in-IP");
        MPLS_IN_IP = ipNumber134;
        IpNumber ipNumber135 = new IpNumber((byte) -118, "MANET");
        MANET = ipNumber135;
        IpNumber ipNumber136 = new IpNumber((byte) -117, "HIP");
        HIP = ipNumber136;
        IpNumber ipNumber137 = new IpNumber((byte) -116, "Shim6");
        SHIM6 = ipNumber137;
        IpNumber ipNumber138 = new IpNumber((byte) -115, "WESP");
        WESP = ipNumber138;
        IpNumber ipNumber139 = new IpNumber((byte) -114, "ROHC");
        ROHC = ipNumber139;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ipNumber.value(), ipNumber);
        hashMap.put(ipNumber2.value(), ipNumber2);
        hashMap.put(ipNumber3.value(), ipNumber3);
        hashMap.put(ipNumber4.value(), ipNumber4);
        hashMap.put(ipNumber5.value(), ipNumber5);
        hashMap.put(ipNumber6.value(), ipNumber6);
        hashMap.put(ipNumber7.value(), ipNumber7);
        hashMap.put(ipNumber8.value(), ipNumber8);
        hashMap.put(ipNumber9.value(), ipNumber9);
        hashMap.put(ipNumber10.value(), ipNumber10);
        hashMap.put(ipNumber11.value(), ipNumber11);
        hashMap.put(ipNumber12.value(), ipNumber12);
        hashMap.put(ipNumber13.value(), ipNumber13);
        hashMap.put(ipNumber14.value(), ipNumber14);
        hashMap.put(ipNumber15.value(), ipNumber15);
        hashMap.put(ipNumber16.value(), ipNumber16);
        hashMap.put(ipNumber17.value(), ipNumber17);
        hashMap.put(ipNumber18.value(), ipNumber18);
        hashMap.put(ipNumber19.value(), ipNumber19);
        hashMap.put(ipNumber20.value(), ipNumber20);
        hashMap.put(ipNumber21.value(), ipNumber21);
        hashMap.put(ipNumber22.value(), ipNumber22);
        hashMap.put(ipNumber23.value(), ipNumber23);
        hashMap.put(ipNumber24.value(), ipNumber24);
        hashMap.put(ipNumber25.value(), ipNumber25);
        hashMap.put(ipNumber26.value(), ipNumber26);
        hashMap.put(ipNumber27.value(), ipNumber27);
        hashMap.put(ipNumber28.value(), ipNumber28);
        hashMap.put(ipNumber29.value(), ipNumber29);
        hashMap.put(ipNumber30.value(), ipNumber30);
        hashMap.put(ipNumber31.value(), ipNumber31);
        hashMap.put(ipNumber32.value(), ipNumber32);
        hashMap.put(ipNumber33.value(), ipNumber33);
        hashMap.put(ipNumber34.value(), ipNumber34);
        hashMap.put(ipNumber35.value(), ipNumber35);
        hashMap.put(ipNumber36.value(), ipNumber36);
        hashMap.put(ipNumber37.value(), ipNumber37);
        hashMap.put(ipNumber38.value(), ipNumber38);
        hashMap.put(ipNumber39.value(), ipNumber39);
        hashMap.put(ipNumber40.value(), ipNumber40);
        hashMap.put(ipNumber41.value(), ipNumber41);
        hashMap.put(ipNumber42.value(), ipNumber42);
        hashMap.put(ipNumber43.value(), ipNumber43);
        hashMap.put(ipNumber44.value(), ipNumber44);
        hashMap.put(ipNumber45.value(), ipNumber45);
        hashMap.put(ipNumber46.value(), ipNumber46);
        hashMap.put(ipNumber47.value(), ipNumber47);
        hashMap.put(ipNumber48.value(), ipNumber48);
        hashMap.put(ipNumber49.value(), ipNumber49);
        hashMap.put(ipNumber50.value(), ipNumber50);
        hashMap.put(ipNumber51.value(), ipNumber51);
        hashMap.put(ipNumber52.value(), ipNumber52);
        hashMap.put(ipNumber53.value(), ipNumber53);
        hashMap.put(ipNumber54.value(), ipNumber54);
        hashMap.put(ipNumber55.value(), ipNumber55);
        hashMap.put(ipNumber56.value(), ipNumber56);
        hashMap.put(ipNumber57.value(), ipNumber57);
        hashMap.put(ipNumber58.value(), ipNumber58);
        hashMap.put(ipNumber59.value(), ipNumber59);
        hashMap.put(ipNumber60.value(), ipNumber60);
        hashMap.put(ipNumber61.value(), ipNumber61);
        hashMap.put(ipNumber62.value(), ipNumber62);
        hashMap.put(ipNumber63.value(), ipNumber63);
        hashMap.put(ipNumber64.value(), ipNumber64);
        hashMap.put(ipNumber65.value(), ipNumber65);
        hashMap.put(ipNumber66.value(), ipNumber66);
        hashMap.put(ipNumber67.value(), ipNumber67);
        hashMap.put(ipNumber68.value(), ipNumber68);
        hashMap.put(ipNumber69.value(), ipNumber69);
        hashMap.put(ipNumber70.value(), ipNumber70);
        hashMap.put(ipNumber71.value(), ipNumber71);
        hashMap.put(ipNumber72.value(), ipNumber72);
        hashMap.put(ipNumber73.value(), ipNumber73);
        hashMap.put(ipNumber74.value(), ipNumber74);
        hashMap.put(ipNumber75.value(), ipNumber75);
        hashMap.put(ipNumber76.value(), ipNumber76);
        hashMap.put(ipNumber77.value(), ipNumber77);
        hashMap.put(ipNumber78.value(), ipNumber78);
        hashMap.put(ipNumber79.value(), ipNumber79);
        hashMap.put(ipNumber80.value(), ipNumber80);
        hashMap.put(ipNumber81.value(), ipNumber81);
        hashMap.put(ipNumber82.value(), ipNumber82);
        hashMap.put(ipNumber83.value(), ipNumber83);
        hashMap.put(ipNumber84.value(), ipNumber84);
        hashMap.put(ipNumber85.value(), ipNumber85);
        hashMap.put(ipNumber86.value(), ipNumber86);
        hashMap.put(ipNumber87.value(), ipNumber87);
        hashMap.put(ipNumber88.value(), ipNumber88);
        hashMap.put(ipNumber89.value(), ipNumber89);
        hashMap.put(ipNumber90.value(), ipNumber90);
        hashMap.put(ipNumber91.value(), ipNumber91);
        hashMap.put(ipNumber92.value(), ipNumber92);
        hashMap.put(ipNumber93.value(), ipNumber93);
        hashMap.put(ipNumber94.value(), ipNumber94);
        hashMap.put(ipNumber95.value(), ipNumber95);
        hashMap.put(ipNumber96.value(), ipNumber96);
        hashMap.put(ipNumber97.value(), ipNumber97);
        hashMap.put(ipNumber98.value(), ipNumber98);
        hashMap.put(ipNumber99.value(), ipNumber99);
        hashMap.put(ipNumber100.value(), ipNumber100);
        hashMap.put(ipNumber101.value(), ipNumber101);
        hashMap.put(ipNumber102.value(), ipNumber102);
        hashMap.put(ipNumber103.value(), ipNumber103);
        hashMap.put(ipNumber104.value(), ipNumber104);
        hashMap.put(ipNumber105.value(), ipNumber105);
        hashMap.put(ipNumber106.value(), ipNumber106);
        hashMap.put(ipNumber107.value(), ipNumber107);
        hashMap.put(ipNumber108.value(), ipNumber108);
        hashMap.put(ipNumber109.value(), ipNumber109);
        hashMap.put(ipNumber110.value(), ipNumber110);
        hashMap.put(ipNumber111.value(), ipNumber111);
        hashMap.put(ipNumber112.value(), ipNumber112);
        hashMap.put(ipNumber113.value(), ipNumber113);
        hashMap.put(ipNumber114.value(), ipNumber114);
        hashMap.put(ipNumber115.value(), ipNumber115);
        hashMap.put(ipNumber116.value(), ipNumber116);
        hashMap.put(ipNumber117.value(), ipNumber117);
        hashMap.put(ipNumber118.value(), ipNumber118);
        hashMap.put(ipNumber119.value(), ipNumber119);
        hashMap.put(ipNumber120.value(), ipNumber120);
        hashMap.put(ipNumber121.value(), ipNumber121);
        hashMap.put(ipNumber122.value(), ipNumber122);
        hashMap.put(ipNumber123.value(), ipNumber123);
        hashMap.put(ipNumber124.value(), ipNumber124);
        hashMap.put(ipNumber125.value(), ipNumber125);
        hashMap.put(ipNumber126.value(), ipNumber126);
        hashMap.put(ipNumber127.value(), ipNumber127);
        hashMap.put(ipNumber128.value(), ipNumber128);
        hashMap.put(ipNumber129.value(), ipNumber129);
        hashMap.put(ipNumber130.value(), ipNumber130);
        hashMap.put(ipNumber131.value(), ipNumber131);
        hashMap.put(ipNumber132.value(), ipNumber132);
        hashMap.put(ipNumber133.value(), ipNumber133);
        hashMap.put(ipNumber134.value(), ipNumber134);
        hashMap.put(ipNumber135.value(), ipNumber135);
        hashMap.put(ipNumber136.value(), ipNumber136);
        hashMap.put(ipNumber137.value(), ipNumber137);
        hashMap.put(ipNumber138.value(), ipNumber138);
        hashMap.put(ipNumber139.value(), ipNumber139);
    }

    public IpNumber(Byte b10, String str) {
        super(b10, str);
    }

    public static IpNumber getInstance(Byte b10) {
        Map<Byte, IpNumber> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new IpNumber(b10, "unknown");
    }

    public static IpNumber register(IpNumber ipNumber) {
        return registry.put(ipNumber.value(), ipNumber);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpNumber ipNumber) {
        return value().compareTo(ipNumber.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
