package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11VenueGroup.class */
public final class Dot11VenueGroup extends NamedNumber<Byte, Dot11VenueGroup> {
    public static final Dot11VenueGroup ASSEMBLY;
    public static final Dot11VenueGroup BUSINESS;
    public static final Dot11VenueGroup EDUCATIONAL;
    public static final Dot11VenueGroup FACTORY_AND_INDUSTRIAL;
    public static final Dot11VenueGroup INSTITUTIONAL;
    public static final Dot11VenueGroup MERCANTILE;
    public static final Dot11VenueGroup OUTDOOR;
    public static final Dot11VenueGroup RESIDENTIAL;
    public static final Dot11VenueGroup STORAGE;
    public static final Dot11VenueGroup UNSPECIFIED;
    public static final Dot11VenueGroup UTILITY_AND_MISCELLANEOUS;
    public static final Dot11VenueGroup VEHICULAR;
    private static final Map<Byte, Dot11VenueGroup> registry;
    private static final long serialVersionUID = 1522500014088468419L;

    static {
        Dot11VenueGroup dot11VenueGroup = new Dot11VenueGroup((byte) 0, "Unspecified");
        UNSPECIFIED = dot11VenueGroup;
        Dot11VenueGroup dot11VenueGroup2 = new Dot11VenueGroup((byte) 1, "Assembly");
        ASSEMBLY = dot11VenueGroup2;
        Dot11VenueGroup dot11VenueGroup3 = new Dot11VenueGroup((byte) 2, "Business");
        BUSINESS = dot11VenueGroup3;
        Dot11VenueGroup dot11VenueGroup4 = new Dot11VenueGroup((byte) 3, "Educational");
        EDUCATIONAL = dot11VenueGroup4;
        Dot11VenueGroup dot11VenueGroup5 = new Dot11VenueGroup((byte) 4, "Factory and Industrial");
        FACTORY_AND_INDUSTRIAL = dot11VenueGroup5;
        Dot11VenueGroup dot11VenueGroup6 = new Dot11VenueGroup((byte) 5, "Institutional");
        INSTITUTIONAL = dot11VenueGroup6;
        Dot11VenueGroup dot11VenueGroup7 = new Dot11VenueGroup((byte) 6, "Mercantile");
        MERCANTILE = dot11VenueGroup7;
        Dot11VenueGroup dot11VenueGroup8 = new Dot11VenueGroup((byte) 7, "Residential");
        RESIDENTIAL = dot11VenueGroup8;
        Dot11VenueGroup dot11VenueGroup9 = new Dot11VenueGroup((byte) 8, "Storage");
        STORAGE = dot11VenueGroup9;
        Dot11VenueGroup dot11VenueGroup10 = new Dot11VenueGroup((byte) 9, "Utility and Miscellaneous");
        UTILITY_AND_MISCELLANEOUS = dot11VenueGroup10;
        Dot11VenueGroup dot11VenueGroup11 = new Dot11VenueGroup((byte) 10, "Vehicular");
        VEHICULAR = dot11VenueGroup11;
        Dot11VenueGroup dot11VenueGroup12 = new Dot11VenueGroup((byte) 11, "Outdoor");
        OUTDOOR = dot11VenueGroup12;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dot11VenueGroup.value(), dot11VenueGroup);
        hashMap.put(dot11VenueGroup2.value(), dot11VenueGroup2);
        hashMap.put(dot11VenueGroup3.value(), dot11VenueGroup3);
        hashMap.put(dot11VenueGroup4.value(), dot11VenueGroup4);
        hashMap.put(dot11VenueGroup5.value(), dot11VenueGroup5);
        hashMap.put(dot11VenueGroup6.value(), dot11VenueGroup6);
        hashMap.put(dot11VenueGroup7.value(), dot11VenueGroup7);
        hashMap.put(dot11VenueGroup8.value(), dot11VenueGroup8);
        hashMap.put(dot11VenueGroup9.value(), dot11VenueGroup9);
        hashMap.put(dot11VenueGroup10.value(), dot11VenueGroup10);
        hashMap.put(dot11VenueGroup11.value(), dot11VenueGroup11);
        hashMap.put(dot11VenueGroup12.value(), dot11VenueGroup12);
    }

    public Dot11VenueGroup(Byte b10, String str) {
        super(b10, str);
    }

    public static Dot11VenueGroup getInstance(Byte b10) {
        Map<Byte, Dot11VenueGroup> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new Dot11VenueGroup(b10, "unknown");
    }

    public static Dot11VenueGroup register(Dot11VenueGroup dot11VenueGroup) {
        return registry.put(dot11VenueGroup.value(), dot11VenueGroup);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11VenueGroup dot11VenueGroup) {
        return value().compareTo(dot11VenueGroup.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
