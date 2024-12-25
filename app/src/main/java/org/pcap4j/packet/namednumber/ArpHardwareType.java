package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/ArpHardwareType.class */
public final class ArpHardwareType extends NamedNumber<Short, ArpHardwareType> {
    public static final ArpHardwareType AMATEUR_RADIO_AX_25;
    public static final ArpHardwareType ARCNET;
    public static final ArpHardwareType ARPSEC;
    public static final ArpHardwareType ATM_16;
    public static final ArpHardwareType ATM_19;
    public static final ArpHardwareType ATM_21;
    public static final ArpHardwareType AUTONET_SHORT_ADDRESS;
    public static final ArpHardwareType CAI;
    public static final ArpHardwareType CHAOS;
    public static final ArpHardwareType ETHERNET;
    public static final ArpHardwareType EUI_64;
    public static final ArpHardwareType EXPERIMENTAL_ETHERNET;
    public static final ArpHardwareType FIBRE_CHANNEL;
    public static final ArpHardwareType FRAME_RELAY;
    public static final ArpHardwareType HDLC;
    public static final ArpHardwareType HFI;
    public static final ArpHardwareType HIPARP;
    public static final ArpHardwareType HW_EXP1;
    public static final ArpHardwareType HW_EXP2;
    public static final ArpHardwareType HYPERCHANNEL;
    public static final ArpHardwareType IEEE_1394_1995;
    public static final ArpHardwareType IEEE_802_NETWORKS;
    public static final ArpHardwareType INFINIBAND;
    public static final ArpHardwareType IPSEC_TUNNEL;
    public static final ArpHardwareType IP_AND_ARP_OVER_ISO_7816_3;
    public static final ArpHardwareType LANSTAR;
    public static final ArpHardwareType LOCALNET;
    public static final ArpHardwareType LOCALTALK;
    public static final ArpHardwareType MAPOS;
    public static final ArpHardwareType METRICOM;
    public static final ArpHardwareType MIL_STD_188_220;
    public static final ArpHardwareType PROTEON_PRONET_TOKEN_RING;
    public static final ArpHardwareType PURE_IP;
    public static final ArpHardwareType SERIAL_LINE;
    public static final ArpHardwareType SMDS;
    public static final ArpHardwareType TWINAXIAL;
    public static final ArpHardwareType ULTRA_LINK;
    public static final ArpHardwareType WIEGAND_INTERFACE;
    private static final Map<Short, ArpHardwareType> registry;
    private static final long serialVersionUID = -4679864421785826910L;

    static {
        ArpHardwareType arpHardwareType = new ArpHardwareType((short) 1, "Ethernet (10Mb)");
        ETHERNET = arpHardwareType;
        ArpHardwareType arpHardwareType2 = new ArpHardwareType((short) 2, "Experimental Ethernet (3Mb)");
        EXPERIMENTAL_ETHERNET = arpHardwareType2;
        ArpHardwareType arpHardwareType3 = new ArpHardwareType((short) 3, "Amateur Radio AX.25");
        AMATEUR_RADIO_AX_25 = arpHardwareType3;
        ArpHardwareType arpHardwareType4 = new ArpHardwareType((short) 4, "Proteon ProNET Token Ring");
        PROTEON_PRONET_TOKEN_RING = arpHardwareType4;
        ArpHardwareType arpHardwareType5 = new ArpHardwareType((short) 5, "Chaos");
        CHAOS = arpHardwareType5;
        ArpHardwareType arpHardwareType6 = new ArpHardwareType((short) 6, "IEEE 802 Networks");
        IEEE_802_NETWORKS = arpHardwareType6;
        ArpHardwareType arpHardwareType7 = new ArpHardwareType((short) 7, "ARCNET");
        ARCNET = arpHardwareType7;
        ArpHardwareType arpHardwareType8 = new ArpHardwareType((short) 8, "Hyperchannel");
        HYPERCHANNEL = arpHardwareType8;
        ArpHardwareType arpHardwareType9 = new ArpHardwareType((short) 9, "Lanstar");
        LANSTAR = arpHardwareType9;
        ArpHardwareType arpHardwareType10 = new ArpHardwareType((short) 10, "Autonet Short Address");
        AUTONET_SHORT_ADDRESS = arpHardwareType10;
        ArpHardwareType arpHardwareType11 = new ArpHardwareType((short) 11, "LocalTalk");
        LOCALTALK = arpHardwareType11;
        ArpHardwareType arpHardwareType12 = new ArpHardwareType((short) 12, "LocalNet (IBM PCNet or SYTEK LocalNET)");
        LOCALNET = arpHardwareType12;
        ArpHardwareType arpHardwareType13 = new ArpHardwareType((short) 13, "Ultra link");
        ULTRA_LINK = arpHardwareType13;
        ArpHardwareType arpHardwareType14 = new ArpHardwareType((short) 14, "SMDS");
        SMDS = arpHardwareType14;
        ArpHardwareType arpHardwareType15 = new ArpHardwareType((short) 15, "Frame Relay");
        FRAME_RELAY = arpHardwareType15;
        ArpHardwareType arpHardwareType16 = new ArpHardwareType((short) 16, "Asynchronous Transmission Mode (ATM)");
        ATM_16 = arpHardwareType16;
        ArpHardwareType arpHardwareType17 = new ArpHardwareType((short) 17, "HDLC");
        HDLC = arpHardwareType17;
        ArpHardwareType arpHardwareType18 = new ArpHardwareType((short) 18, "Fibre Channel");
        FIBRE_CHANNEL = arpHardwareType18;
        ArpHardwareType arpHardwareType19 = new ArpHardwareType((short) 19, "Asynchronous Transmission Mode (ATM)");
        ATM_19 = arpHardwareType19;
        ArpHardwareType arpHardwareType20 = new ArpHardwareType((short) 20, "Serial Line");
        SERIAL_LINE = arpHardwareType20;
        ArpHardwareType arpHardwareType21 = new ArpHardwareType((short) 21, "Asynchronous Transmission Mode (ATM)");
        ATM_21 = arpHardwareType21;
        ArpHardwareType arpHardwareType22 = new ArpHardwareType((short) 22, "MIL-STD-188-220");
        MIL_STD_188_220 = arpHardwareType22;
        ArpHardwareType arpHardwareType23 = new ArpHardwareType((short) 23, "Metricom");
        METRICOM = arpHardwareType23;
        ArpHardwareType arpHardwareType24 = new ArpHardwareType((short) 24, "IEEE 1394.1995");
        IEEE_1394_1995 = arpHardwareType24;
        ArpHardwareType arpHardwareType25 = new ArpHardwareType((short) 25, "MAPOS");
        MAPOS = arpHardwareType25;
        ArpHardwareType arpHardwareType26 = new ArpHardwareType((short) 26, "Twinaxial");
        TWINAXIAL = arpHardwareType26;
        ArpHardwareType arpHardwareType27 = new ArpHardwareType((short) 27, "EUI-64");
        EUI_64 = arpHardwareType27;
        ArpHardwareType arpHardwareType28 = new ArpHardwareType((short) 28, "HIPARP");
        HIPARP = arpHardwareType28;
        ArpHardwareType arpHardwareType29 = new ArpHardwareType((short) 29, "IP and ARP over ISO 7816-3");
        IP_AND_ARP_OVER_ISO_7816_3 = arpHardwareType29;
        ArpHardwareType arpHardwareType30 = new ArpHardwareType((short) 30, "ARPSec");
        ARPSEC = arpHardwareType30;
        ArpHardwareType arpHardwareType31 = new ArpHardwareType((short) 31, "IPsec tunnel");
        IPSEC_TUNNEL = arpHardwareType31;
        ArpHardwareType arpHardwareType32 = new ArpHardwareType((short) 32, "InfiniBand");
        INFINIBAND = arpHardwareType32;
        ArpHardwareType arpHardwareType33 = new ArpHardwareType((short) 33, "TIA-102 Project 25 Common Air Interface (CAI)");
        CAI = arpHardwareType33;
        ArpHardwareType arpHardwareType34 = new ArpHardwareType((short) 34, "Wiegand Interface");
        WIEGAND_INTERFACE = arpHardwareType34;
        ArpHardwareType arpHardwareType35 = new ArpHardwareType((short) 35, "Pure IP");
        PURE_IP = arpHardwareType35;
        ArpHardwareType arpHardwareType36 = new ArpHardwareType((short) 36, "HW_EXP1");
        HW_EXP1 = arpHardwareType36;
        ArpHardwareType arpHardwareType37 = new ArpHardwareType((short) 37, "HFI");
        HFI = arpHardwareType37;
        ArpHardwareType arpHardwareType38 = new ArpHardwareType((short) 256, "HW_EXP2");
        HW_EXP2 = arpHardwareType38;
        HashMap hashMap = new HashMap(40);
        registry = hashMap;
        hashMap.put(arpHardwareType.value(), arpHardwareType);
        hashMap.put(arpHardwareType2.value(), arpHardwareType2);
        hashMap.put(arpHardwareType3.value(), arpHardwareType3);
        hashMap.put(arpHardwareType4.value(), arpHardwareType4);
        hashMap.put(arpHardwareType5.value(), arpHardwareType5);
        hashMap.put(arpHardwareType6.value(), arpHardwareType6);
        hashMap.put(arpHardwareType7.value(), arpHardwareType7);
        hashMap.put(arpHardwareType8.value(), arpHardwareType8);
        hashMap.put(arpHardwareType9.value(), arpHardwareType9);
        hashMap.put(arpHardwareType10.value(), arpHardwareType10);
        hashMap.put(arpHardwareType11.value(), arpHardwareType11);
        hashMap.put(arpHardwareType12.value(), arpHardwareType12);
        hashMap.put(arpHardwareType13.value(), arpHardwareType13);
        hashMap.put(arpHardwareType14.value(), arpHardwareType14);
        hashMap.put(arpHardwareType15.value(), arpHardwareType15);
        hashMap.put(arpHardwareType16.value(), arpHardwareType16);
        hashMap.put(arpHardwareType17.value(), arpHardwareType17);
        hashMap.put(arpHardwareType18.value(), arpHardwareType18);
        hashMap.put(arpHardwareType19.value(), arpHardwareType19);
        hashMap.put(arpHardwareType20.value(), arpHardwareType20);
        hashMap.put(arpHardwareType21.value(), arpHardwareType21);
        hashMap.put(arpHardwareType22.value(), arpHardwareType22);
        hashMap.put(arpHardwareType23.value(), arpHardwareType23);
        hashMap.put(arpHardwareType24.value(), arpHardwareType24);
        hashMap.put(arpHardwareType25.value(), arpHardwareType25);
        hashMap.put(arpHardwareType26.value(), arpHardwareType26);
        hashMap.put(arpHardwareType27.value(), arpHardwareType27);
        hashMap.put(arpHardwareType28.value(), arpHardwareType28);
        hashMap.put(arpHardwareType29.value(), arpHardwareType29);
        hashMap.put(arpHardwareType30.value(), arpHardwareType30);
        hashMap.put(arpHardwareType31.value(), arpHardwareType31);
        hashMap.put(arpHardwareType32.value(), arpHardwareType32);
        hashMap.put(arpHardwareType33.value(), arpHardwareType33);
        hashMap.put(arpHardwareType34.value(), arpHardwareType34);
        hashMap.put(arpHardwareType35.value(), arpHardwareType35);
        hashMap.put(arpHardwareType36.value(), arpHardwareType36);
        hashMap.put(arpHardwareType37.value(), arpHardwareType37);
        hashMap.put(arpHardwareType38.value(), arpHardwareType38);
    }

    public ArpHardwareType(Short sh2, String str) {
        super(sh2, str);
    }

    public static ArpHardwareType getInstance(Short sh2) {
        Map<Short, ArpHardwareType> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new ArpHardwareType(sh2, "unknown");
    }

    public static ArpHardwareType register(ArpHardwareType arpHardwareType) {
        return registry.put(arpHardwareType.value(), arpHardwareType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(ArpHardwareType arpHardwareType) {
        return value().compareTo(arpHardwareType.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().shortValue() & 65535);
    }
}
