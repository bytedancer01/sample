package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/LlcNumber.class */
public final class LlcNumber extends NamedNumber<Byte, LlcNumber> {
    public static final LlcNumber ARP;
    public static final LlcNumber DOD_IP;
    public static final LlcNumber EIA_RS_511;
    public static final LlcNumber GLOBAL_DSAP;
    public static final LlcNumber ISI_IP;
    public static final LlcNumber ISO_CLNS_IS_8473;
    public static final LlcNumber LLC_SUBLAYER_MGT_GROUP;
    public static final LlcNumber LLC_SUBLAYER_MGT_INDIVIDUAL;
    public static final LlcNumber NETBIOS;
    public static final LlcNumber NULL_LSAP;
    public static final LlcNumber PROWAY_LAN;
    public static final LlcNumber PROWAY_LAN_IEC_955;
    public static final LlcNumber SNAP;
    public static final LlcNumber SNA_PATH_CONTROL_GROUP;
    public static final LlcNumber SNA_PATH_CONTROL_INDIVIDUAL;
    private static final Map<Byte, LlcNumber> registry;
    private static final long serialVersionUID = -8810011448282399402L;

    static {
        LlcNumber llcNumber = new LlcNumber((byte) 0, "NULL LSAP");
        NULL_LSAP = llcNumber;
        LlcNumber llcNumber2 = new LlcNumber((byte) 2, "LLC Sublayer Mgt (individual)");
        LLC_SUBLAYER_MGT_INDIVIDUAL = llcNumber2;
        LlcNumber llcNumber3 = new LlcNumber((byte) 3, "LLC Sublayer Mgt (group)");
        LLC_SUBLAYER_MGT_GROUP = llcNumber3;
        LlcNumber llcNumber4 = new LlcNumber((byte) 4, "SNA Path Control (individual)");
        SNA_PATH_CONTROL_INDIVIDUAL = llcNumber4;
        LlcNumber llcNumber5 = new LlcNumber((byte) 5, "SNA Path Control (group)");
        SNA_PATH_CONTROL_GROUP = llcNumber5;
        LlcNumber llcNumber6 = new LlcNumber((byte) 6, "DOD IP");
        DOD_IP = llcNumber6;
        LlcNumber llcNumber7 = new LlcNumber((byte) 14, "ProWay-LAN");
        PROWAY_LAN = llcNumber7;
        LlcNumber llcNumber8 = new LlcNumber((byte) 78, "EIA-RS 511");
        EIA_RS_511 = llcNumber8;
        LlcNumber llcNumber9 = new LlcNumber((byte) 94, "ISI IP");
        ISI_IP = llcNumber9;
        LlcNumber llcNumber10 = new LlcNumber((byte) -114, "ProWay-LAN (IEC 955)");
        PROWAY_LAN_IEC_955 = llcNumber10;
        LlcNumber llcNumber11 = new LlcNumber((byte) -104, "ARP");
        ARP = llcNumber11;
        LlcNumber llcNumber12 = new LlcNumber((byte) -86, "SNAP");
        SNAP = llcNumber12;
        LlcNumber llcNumber13 = new LlcNumber((byte) -16, "NetBIOS");
        NETBIOS = llcNumber13;
        LlcNumber llcNumber14 = new LlcNumber((byte) -2, "ISO CLNS IS 8473");
        ISO_CLNS_IS_8473 = llcNumber14;
        LlcNumber llcNumber15 = new LlcNumber((byte) -1, "Global DSAP");
        GLOBAL_DSAP = llcNumber15;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(llcNumber.value(), llcNumber);
        hashMap.put(llcNumber2.value(), llcNumber2);
        hashMap.put(llcNumber3.value(), llcNumber3);
        hashMap.put(llcNumber4.value(), llcNumber4);
        hashMap.put(llcNumber5.value(), llcNumber5);
        hashMap.put(llcNumber6.value(), llcNumber6);
        hashMap.put(llcNumber7.value(), llcNumber7);
        hashMap.put(llcNumber8.value(), llcNumber8);
        hashMap.put(llcNumber9.value(), llcNumber9);
        hashMap.put(llcNumber10.value(), llcNumber10);
        hashMap.put(llcNumber11.value(), llcNumber11);
        hashMap.put(llcNumber12.value(), llcNumber12);
        hashMap.put(llcNumber13.value(), llcNumber13);
        hashMap.put(llcNumber14.value(), llcNumber14);
        hashMap.put(llcNumber15.value(), llcNumber15);
    }

    public LlcNumber(Byte b10, String str) {
        super(b10, str);
    }

    public static LlcNumber getInstance(Byte b10) {
        Map<Byte, LlcNumber> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new LlcNumber(b10, "unknown");
    }

    public static LlcNumber register(LlcNumber llcNumber) {
        return registry.put(llcNumber.value(), llcNumber);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LlcNumber llcNumber) {
        return value().compareTo(llcNumber.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
