package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.net.imap.IMAP;
import org.jsoup.parser.CharacterReader;
import org.pcap4j.Pcap4jPropertiesLoader;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/DataLinkType.class */
public final class DataLinkType extends NamedNumber<Integer, DataLinkType> {
    public static final DataLinkType DOCSIS;
    public static final DataLinkType EN10MB;
    public static final DataLinkType FDDI;
    public static final DataLinkType IEEE802;
    public static final DataLinkType IEEE802_11;
    public static final DataLinkType IEEE802_11_RADIO;
    public static final DataLinkType LINUX_SLL;
    public static final DataLinkType NULL;
    public static final DataLinkType PPP;
    public static final DataLinkType PPP_SERIAL;
    public static final DataLinkType RAW;
    private static final Map<Integer, DataLinkType> registry;
    private static final long serialVersionUID = -4299486028394578120L;

    static {
        DataLinkType dataLinkType = new DataLinkType(0, "Null");
        NULL = dataLinkType;
        DataLinkType dataLinkType2 = new DataLinkType(1, "Ethernet");
        EN10MB = dataLinkType2;
        DataLinkType dataLinkType3 = new DataLinkType(6, "Token Ring");
        IEEE802 = dataLinkType3;
        DataLinkType dataLinkType4 = new DataLinkType(9, "PPP");
        PPP = dataLinkType4;
        DataLinkType dataLinkType5 = new DataLinkType(10, "FDDI");
        FDDI = dataLinkType5;
        DataLinkType dataLinkType6 = new DataLinkType(50, "PPP over serial with HDLC encapsulation");
        PPP_SERIAL = dataLinkType6;
        DataLinkType dataLinkType7 = new DataLinkType(105, "Wireless");
        IEEE802_11 = dataLinkType7;
        DataLinkType dataLinkType8 = new DataLinkType(113, "Linux cooked-mode capture");
        LINUX_SLL = dataLinkType8;
        DataLinkType dataLinkType9 = new DataLinkType(127, "Radiotap");
        IEEE802_11_RADIO = dataLinkType9;
        DataLinkType dataLinkType10 = new DataLinkType(Integer.valueOf(IMAP.DEFAULT_PORT), "DOCSIS");
        DOCSIS = dataLinkType10;
        HashMap hashMap = new HashMap(15);
        registry = hashMap;
        DataLinkType dataLinkType11 = new DataLinkType(Pcap4jPropertiesLoader.getInstance().getDltRaw(), "RAW");
        RAW = dataLinkType11;
        hashMap.put(dataLinkType.value(), dataLinkType);
        hashMap.put(dataLinkType2.value(), dataLinkType2);
        hashMap.put(dataLinkType3.value(), dataLinkType3);
        hashMap.put(dataLinkType4.value(), dataLinkType4);
        hashMap.put(dataLinkType5.value(), dataLinkType5);
        hashMap.put(dataLinkType11.value(), dataLinkType11);
        hashMap.put(dataLinkType6.value(), dataLinkType6);
        hashMap.put(dataLinkType7.value(), dataLinkType7);
        hashMap.put(dataLinkType8.value(), dataLinkType8);
        hashMap.put(dataLinkType9.value(), dataLinkType9);
        hashMap.put(dataLinkType10.value(), dataLinkType10);
    }

    public DataLinkType(Integer num, String str) {
        super(num, str);
    }

    public static DataLinkType getInstance(Integer num) {
        Map<Integer, DataLinkType> map = registry;
        return map.containsKey(num) ? map.get(num) : new DataLinkType(num, "unknown");
    }

    public static DataLinkType register(DataLinkType dataLinkType) {
        return registry.put(dataLinkType.value(), dataLinkType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DataLinkType dataLinkType) {
        return value().compareTo(dataLinkType.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().intValue() & CharacterReader.EOF);
    }
}
