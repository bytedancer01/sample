package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/ArpOperation.class */
public final class ArpOperation extends NamedNumber<Short, ArpOperation> {
    public static final ArpOperation ARP_NAK;
    public static final ArpOperation DRARP_ERROR;
    public static final ArpOperation DRARP_REPLY;
    public static final ArpOperation DRARP_REQUEST;
    public static final ArpOperation INARP_REPLY;
    public static final ArpOperation INARP_REQUEST;
    public static final ArpOperation MAPOS_UNARP;
    public static final ArpOperation MARS_GROUPLIST_REPLY;
    public static final ArpOperation MARS_GROUPLIST_REQUEST;
    public static final ArpOperation MARS_JOIN;
    public static final ArpOperation MARS_LEAVE;
    public static final ArpOperation MARS_MSERV;
    public static final ArpOperation MARS_MULTI;
    public static final ArpOperation MARS_NAK;
    public static final ArpOperation MARS_REDIRECT_MAP;
    public static final ArpOperation MARS_REQUEST;
    public static final ArpOperation MARS_SJOIN;
    public static final ArpOperation MARS_SLEAVE;
    public static final ArpOperation MARS_UNSERV;
    public static final ArpOperation OP_EXP1;
    public static final ArpOperation OP_EXP2;
    public static final ArpOperation REPLY;
    public static final ArpOperation REPLY_REVERSE;
    public static final ArpOperation REQUEST;
    public static final ArpOperation REQUEST_REVERSE;
    private static final Map<Short, ArpOperation> registry;
    private static final long serialVersionUID = 5558693543482950163L;

    static {
        ArpOperation arpOperation = new ArpOperation((short) 1, "REQUEST");
        REQUEST = arpOperation;
        ArpOperation arpOperation2 = new ArpOperation((short) 2, "REPLY");
        REPLY = arpOperation2;
        ArpOperation arpOperation3 = new ArpOperation((short) 3, "request Reverse");
        REQUEST_REVERSE = arpOperation3;
        ArpOperation arpOperation4 = new ArpOperation((short) 4, "reply Reverse");
        REPLY_REVERSE = arpOperation4;
        ArpOperation arpOperation5 = new ArpOperation((short) 5, "DRARP-Request");
        DRARP_REQUEST = arpOperation5;
        ArpOperation arpOperation6 = new ArpOperation((short) 6, "DRARP-Reply");
        DRARP_REPLY = arpOperation6;
        ArpOperation arpOperation7 = new ArpOperation((short) 7, "DRARP-Error");
        DRARP_ERROR = arpOperation7;
        ArpOperation arpOperation8 = new ArpOperation((short) 8, "InARP-Request");
        INARP_REQUEST = arpOperation8;
        ArpOperation arpOperation9 = new ArpOperation((short) 9, "InARP-Reply");
        INARP_REPLY = arpOperation9;
        ArpOperation arpOperation10 = new ArpOperation((short) 10, "ARP-NAK");
        ARP_NAK = arpOperation10;
        ArpOperation arpOperation11 = new ArpOperation((short) 11, "MARS-Request");
        MARS_REQUEST = arpOperation11;
        ArpOperation arpOperation12 = new ArpOperation((short) 12, "MARS-Multi");
        MARS_MULTI = arpOperation12;
        ArpOperation arpOperation13 = new ArpOperation((short) 13, "MARS-MServ");
        MARS_MSERV = arpOperation13;
        ArpOperation arpOperation14 = new ArpOperation((short) 14, "MARS-Join");
        MARS_JOIN = arpOperation14;
        ArpOperation arpOperation15 = new ArpOperation((short) 15, "MARS-Leave");
        MARS_LEAVE = arpOperation15;
        ArpOperation arpOperation16 = new ArpOperation((short) 16, "MARS-NAK");
        MARS_NAK = arpOperation16;
        ArpOperation arpOperation17 = new ArpOperation((short) 17, "MARS-Unserv");
        MARS_UNSERV = arpOperation17;
        ArpOperation arpOperation18 = new ArpOperation((short) 18, "MARS-SJoin");
        MARS_SJOIN = arpOperation18;
        ArpOperation arpOperation19 = new ArpOperation((short) 19, "MARS-SLeave");
        MARS_SLEAVE = arpOperation19;
        ArpOperation arpOperation20 = new ArpOperation((short) 20, "MARS-Grouplist-Request");
        MARS_GROUPLIST_REQUEST = arpOperation20;
        ArpOperation arpOperation21 = new ArpOperation((short) 21, "MARS-Grouplist-Reply");
        MARS_GROUPLIST_REPLY = arpOperation21;
        ArpOperation arpOperation22 = new ArpOperation((short) 22, "MARS-Redirect-Map");
        MARS_REDIRECT_MAP = arpOperation22;
        ArpOperation arpOperation23 = new ArpOperation((short) 23, "MAPOS-UNARP");
        MAPOS_UNARP = arpOperation23;
        ArpOperation arpOperation24 = new ArpOperation((short) 24, "OP_EXP1");
        OP_EXP1 = arpOperation24;
        ArpOperation arpOperation25 = new ArpOperation((short) 25, "OP_EXP2");
        OP_EXP2 = arpOperation25;
        HashMap hashMap = new HashMap(30);
        registry = hashMap;
        hashMap.put(arpOperation.value(), arpOperation);
        hashMap.put(arpOperation2.value(), arpOperation2);
        hashMap.put(arpOperation3.value(), arpOperation3);
        hashMap.put(arpOperation4.value(), arpOperation4);
        hashMap.put(arpOperation5.value(), arpOperation5);
        hashMap.put(arpOperation6.value(), arpOperation6);
        hashMap.put(arpOperation7.value(), arpOperation7);
        hashMap.put(arpOperation8.value(), arpOperation8);
        hashMap.put(arpOperation9.value(), arpOperation9);
        hashMap.put(arpOperation10.value(), arpOperation10);
        hashMap.put(arpOperation11.value(), arpOperation11);
        hashMap.put(arpOperation12.value(), arpOperation12);
        hashMap.put(arpOperation13.value(), arpOperation13);
        hashMap.put(arpOperation14.value(), arpOperation14);
        hashMap.put(arpOperation15.value(), arpOperation15);
        hashMap.put(arpOperation16.value(), arpOperation16);
        hashMap.put(arpOperation17.value(), arpOperation17);
        hashMap.put(arpOperation18.value(), arpOperation18);
        hashMap.put(arpOperation19.value(), arpOperation19);
        hashMap.put(arpOperation20.value(), arpOperation20);
        hashMap.put(arpOperation21.value(), arpOperation21);
        hashMap.put(arpOperation22.value(), arpOperation22);
        hashMap.put(arpOperation23.value(), arpOperation23);
        hashMap.put(arpOperation24.value(), arpOperation24);
        hashMap.put(arpOperation25.value(), arpOperation25);
    }

    public ArpOperation(Short sh2, String str) {
        super(sh2, str);
    }

    public static ArpOperation getInstance(Short sh2) {
        Map<Short, ArpOperation> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new ArpOperation(sh2, "unknown");
    }

    public static ArpOperation register(ArpOperation arpOperation) {
        return registry.put(arpOperation.value(), arpOperation);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(ArpOperation arpOperation) {
        return value().compareTo(arpOperation.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().shortValue() & 65535);
    }
}
