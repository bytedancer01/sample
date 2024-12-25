package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Dot11VenueInfo.class */
public final class Dot11VenueInfo extends NamedNumber<Short, Dot11VenueInfo> {
    public static final Dot11VenueInfo AIRPLANE;
    public static final Dot11VenueInfo ALCOHOL_AND_DRUG_REHABILITATION_CENTER;
    public static final Dot11VenueInfo ATTORNEY_OFFICE;
    public static final Dot11VenueInfo AUTOMOBILE_OR_TRUCK;
    public static final Dot11VenueInfo AUTOMOTIVE_SERVICE_STATION;
    public static final Dot11VenueInfo BANK;
    public static final Dot11VenueInfo BOARDING_HOUSE;
    public static final Dot11VenueInfo BUS;
    public static final Dot11VenueInfo BUS_STOP;
    public static final Dot11VenueInfo CITY_PARK;
    public static final Dot11VenueInfo DOCTOR_OR_DENTIST_OFFICE;
    public static final Dot11VenueInfo DORMITORY;
    public static final Dot11VenueInfo EMERGENCY_COORDINATION_CENTER;
    public static final Dot11VenueInfo FACTORY;
    public static final Dot11VenueInfo FERRY;
    public static final Dot11VenueInfo FIRE_STATION;
    public static final Dot11VenueInfo GAS_STATION;
    public static final Dot11VenueInfo GROCERY_MARKET;
    public static final Dot11VenueInfo GROUP_HOME;
    public static final Dot11VenueInfo HOSPITAL;
    public static final Dot11VenueInfo HOTEL_OR_MOTEL;
    public static final Dot11VenueInfo KIOSK;
    public static final Dot11VenueInfo LONG_TERM_CARE_FACILITY;
    public static final Dot11VenueInfo MOTOR_BIKE;
    public static final Dot11VenueInfo MUNI_MESH_NETWORK;
    public static final Dot11VenueInfo POLICE_STATION;
    public static final Dot11VenueInfo POST_OFFICE;
    public static final Dot11VenueInfo PRISON_OR_JAIL;
    public static final Dot11VenueInfo PRIVATE_RESIDENCE;
    public static final Dot11VenueInfo PROFESSIONAL_OFFICE;
    public static final Dot11VenueInfo RESEARCH_AND_DEVELOPMENT_FACILITY;
    public static final Dot11VenueInfo REST_AREA;
    public static final Dot11VenueInfo RETAIL_STORE;
    public static final Dot11VenueInfo SCHOOL_PRIMARY;
    public static final Dot11VenueInfo SCHOOL_SECONDARY;
    public static final Dot11VenueInfo SHIP_OR_BOAT;
    public static final Dot11VenueInfo SHOPPING_MALL;
    public static final Dot11VenueInfo TRAFFIC_CONTROL;
    public static final Dot11VenueInfo TRAIN;
    public static final Dot11VenueInfo UNIVERSITY_OR_COLLEGE;
    public static final Dot11VenueInfo UNSPECIFIED_BUSINESS;
    public static final Dot11VenueInfo UNSPECIFIED_EDUCATIONAL;
    public static final Dot11VenueInfo UNSPECIFIED_FACTORY_AND_INDUSTRIAL;
    public static final Dot11VenueInfo UNSPECIFIED_INSTITUTIONAL;
    public static final Dot11VenueInfo UNSPECIFIED_MERCANTILE;
    public static final Dot11VenueInfo UNSPECIFIED_OUTDOOR;
    public static final Dot11VenueInfo UNSPECIFIED_RESIDENTIAL;
    public static final Dot11VenueInfo UNSPECIFIED_STORAGE;
    public static final Dot11VenueInfo UNSPECIFIED_UTILITY_AND_MISCELLANEOUS;
    public static final Dot11VenueInfo UNSPECIFIED_VEHICULAR;
    private static final Map<Short, Dot11VenueInfo> registry;
    private static final long serialVersionUID = 7218904434618722743L;

    static {
        Dot11VenueInfo dot11VenueInfo = new Dot11VenueInfo((short) 271, "Emergency Coordination Center");
        EMERGENCY_COORDINATION_CENTER = dot11VenueInfo;
        Dot11VenueInfo dot11VenueInfo2 = new Dot11VenueInfo((short) 512, "Unspecified Business");
        UNSPECIFIED_BUSINESS = dot11VenueInfo2;
        Dot11VenueInfo dot11VenueInfo3 = new Dot11VenueInfo((short) 513, "Doctor or Dentist office");
        DOCTOR_OR_DENTIST_OFFICE = dot11VenueInfo3;
        Dot11VenueInfo dot11VenueInfo4 = new Dot11VenueInfo((short) 514, "Bank");
        BANK = dot11VenueInfo4;
        Dot11VenueInfo dot11VenueInfo5 = new Dot11VenueInfo((short) 515, "Fire Station");
        FIRE_STATION = dot11VenueInfo5;
        Dot11VenueInfo dot11VenueInfo6 = new Dot11VenueInfo((short) 516, "Police Station");
        POLICE_STATION = dot11VenueInfo6;
        Dot11VenueInfo dot11VenueInfo7 = new Dot11VenueInfo((short) 518, "Post Office");
        POST_OFFICE = dot11VenueInfo7;
        Dot11VenueInfo dot11VenueInfo8 = new Dot11VenueInfo((short) 519, "Professional Office");
        PROFESSIONAL_OFFICE = dot11VenueInfo8;
        Dot11VenueInfo dot11VenueInfo9 = new Dot11VenueInfo((short) 520, "Research and Development Facility");
        RESEARCH_AND_DEVELOPMENT_FACILITY = dot11VenueInfo9;
        Dot11VenueInfo dot11VenueInfo10 = new Dot11VenueInfo((short) 521, "Attorney Office");
        ATTORNEY_OFFICE = dot11VenueInfo10;
        Dot11VenueInfo dot11VenueInfo11 = new Dot11VenueInfo((short) 768, "Unspecified Educational");
        UNSPECIFIED_EDUCATIONAL = dot11VenueInfo11;
        Dot11VenueInfo dot11VenueInfo12 = new Dot11VenueInfo((short) 769, "School Primary");
        SCHOOL_PRIMARY = dot11VenueInfo12;
        Dot11VenueInfo dot11VenueInfo13 = new Dot11VenueInfo((short) 770, "School Secondary");
        SCHOOL_SECONDARY = dot11VenueInfo13;
        Dot11VenueInfo dot11VenueInfo14 = new Dot11VenueInfo((short) 771, "University or College");
        UNIVERSITY_OR_COLLEGE = dot11VenueInfo14;
        Dot11VenueInfo dot11VenueInfo15 = new Dot11VenueInfo((short) 1024, "Unspecified Factory and Industrial");
        UNSPECIFIED_FACTORY_AND_INDUSTRIAL = dot11VenueInfo15;
        Dot11VenueInfo dot11VenueInfo16 = new Dot11VenueInfo((short) 1025, "Factory");
        FACTORY = dot11VenueInfo16;
        Dot11VenueInfo dot11VenueInfo17 = new Dot11VenueInfo((short) 1280, "Unspecified Institutional");
        UNSPECIFIED_INSTITUTIONAL = dot11VenueInfo17;
        Dot11VenueInfo dot11VenueInfo18 = new Dot11VenueInfo((short) 1281, "Hospital");
        HOSPITAL = dot11VenueInfo18;
        Dot11VenueInfo dot11VenueInfo19 = new Dot11VenueInfo((short) 1282, "Long-Term Care Facility");
        LONG_TERM_CARE_FACILITY = dot11VenueInfo19;
        Dot11VenueInfo dot11VenueInfo20 = new Dot11VenueInfo((short) 1283, "Alcohol and Drug Rehabilitation Center");
        ALCOHOL_AND_DRUG_REHABILITATION_CENTER = dot11VenueInfo20;
        Dot11VenueInfo dot11VenueInfo21 = new Dot11VenueInfo((short) 1284, "Group Home");
        GROUP_HOME = dot11VenueInfo21;
        Dot11VenueInfo dot11VenueInfo22 = new Dot11VenueInfo((short) 1285, "Prison or Jail");
        PRISON_OR_JAIL = dot11VenueInfo22;
        Dot11VenueInfo dot11VenueInfo23 = new Dot11VenueInfo((short) 1536, "Unspecified Mercantile");
        UNSPECIFIED_MERCANTILE = dot11VenueInfo23;
        Dot11VenueInfo dot11VenueInfo24 = new Dot11VenueInfo((short) 1537, "Retail Store");
        RETAIL_STORE = dot11VenueInfo24;
        Dot11VenueInfo dot11VenueInfo25 = new Dot11VenueInfo((short) 1538, "Grocery Market");
        GROCERY_MARKET = dot11VenueInfo25;
        Dot11VenueInfo dot11VenueInfo26 = new Dot11VenueInfo((short) 1539, "Automotive Service Station");
        AUTOMOTIVE_SERVICE_STATION = dot11VenueInfo26;
        Dot11VenueInfo dot11VenueInfo27 = new Dot11VenueInfo((short) 1540, "Shopping Mall");
        SHOPPING_MALL = dot11VenueInfo27;
        Dot11VenueInfo dot11VenueInfo28 = new Dot11VenueInfo((short) 1541, "Gas Station");
        GAS_STATION = dot11VenueInfo28;
        Dot11VenueInfo dot11VenueInfo29 = new Dot11VenueInfo((short) 1792, "Unspecified Residential");
        UNSPECIFIED_RESIDENTIAL = dot11VenueInfo29;
        Dot11VenueInfo dot11VenueInfo30 = new Dot11VenueInfo((short) 1793, "Private Residence");
        PRIVATE_RESIDENCE = dot11VenueInfo30;
        Dot11VenueInfo dot11VenueInfo31 = new Dot11VenueInfo((short) 1794, "Hotel or Motel");
        HOTEL_OR_MOTEL = dot11VenueInfo31;
        Dot11VenueInfo dot11VenueInfo32 = new Dot11VenueInfo((short) 1795, "Dormitory");
        DORMITORY = dot11VenueInfo32;
        Dot11VenueInfo dot11VenueInfo33 = new Dot11VenueInfo((short) 1796, "Boarding House");
        BOARDING_HOUSE = dot11VenueInfo33;
        Dot11VenueInfo dot11VenueInfo34 = new Dot11VenueInfo((short) 2048, "Unspecified Storage");
        UNSPECIFIED_STORAGE = dot11VenueInfo34;
        Dot11VenueInfo dot11VenueInfo35 = new Dot11VenueInfo((short) 2304, "Unspecified Utility and Miscellaneous");
        UNSPECIFIED_UTILITY_AND_MISCELLANEOUS = dot11VenueInfo35;
        Dot11VenueInfo dot11VenueInfo36 = new Dot11VenueInfo((short) 2560, "Unspecified Vehicular");
        UNSPECIFIED_VEHICULAR = dot11VenueInfo36;
        Dot11VenueInfo dot11VenueInfo37 = new Dot11VenueInfo((short) 2561, "Automobile or Truck");
        AUTOMOBILE_OR_TRUCK = dot11VenueInfo37;
        Dot11VenueInfo dot11VenueInfo38 = new Dot11VenueInfo((short) 2562, "Airplane");
        AIRPLANE = dot11VenueInfo38;
        Dot11VenueInfo dot11VenueInfo39 = new Dot11VenueInfo((short) 2563, "Bus");
        BUS = dot11VenueInfo39;
        Dot11VenueInfo dot11VenueInfo40 = new Dot11VenueInfo((short) 2564, "Ferry");
        FERRY = dot11VenueInfo40;
        Dot11VenueInfo dot11VenueInfo41 = new Dot11VenueInfo((short) 2565, "Ship or Boat");
        SHIP_OR_BOAT = dot11VenueInfo41;
        Dot11VenueInfo dot11VenueInfo42 = new Dot11VenueInfo((short) 2566, "Train");
        TRAIN = dot11VenueInfo42;
        Dot11VenueInfo dot11VenueInfo43 = new Dot11VenueInfo((short) 2567, "Motor Bike");
        MOTOR_BIKE = dot11VenueInfo43;
        Dot11VenueInfo dot11VenueInfo44 = new Dot11VenueInfo((short) 2816, "Unspecified Outdoor");
        UNSPECIFIED_OUTDOOR = dot11VenueInfo44;
        Dot11VenueInfo dot11VenueInfo45 = new Dot11VenueInfo((short) 2817, "Muni-mesh Network");
        MUNI_MESH_NETWORK = dot11VenueInfo45;
        Dot11VenueInfo dot11VenueInfo46 = new Dot11VenueInfo((short) 2818, "City Park");
        CITY_PARK = dot11VenueInfo46;
        Dot11VenueInfo dot11VenueInfo47 = new Dot11VenueInfo((short) 2819, "Rest Area");
        REST_AREA = dot11VenueInfo47;
        Dot11VenueInfo dot11VenueInfo48 = new Dot11VenueInfo((short) 2820, "Traffic Control");
        TRAFFIC_CONTROL = dot11VenueInfo48;
        Dot11VenueInfo dot11VenueInfo49 = new Dot11VenueInfo((short) 2821, "Bus Stop");
        BUS_STOP = dot11VenueInfo49;
        Dot11VenueInfo dot11VenueInfo50 = new Dot11VenueInfo((short) 2822, "Kiosk");
        KIOSK = dot11VenueInfo50;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dot11VenueInfo.value(), dot11VenueInfo);
        hashMap.put(dot11VenueInfo2.value(), dot11VenueInfo2);
        hashMap.put(dot11VenueInfo3.value(), dot11VenueInfo3);
        hashMap.put(dot11VenueInfo4.value(), dot11VenueInfo4);
        hashMap.put(dot11VenueInfo5.value(), dot11VenueInfo5);
        hashMap.put(dot11VenueInfo6.value(), dot11VenueInfo6);
        hashMap.put(dot11VenueInfo7.value(), dot11VenueInfo7);
        hashMap.put(dot11VenueInfo8.value(), dot11VenueInfo8);
        hashMap.put(dot11VenueInfo9.value(), dot11VenueInfo9);
        hashMap.put(dot11VenueInfo10.value(), dot11VenueInfo10);
        hashMap.put(dot11VenueInfo11.value(), dot11VenueInfo11);
        hashMap.put(dot11VenueInfo12.value(), dot11VenueInfo12);
        hashMap.put(dot11VenueInfo13.value(), dot11VenueInfo13);
        hashMap.put(dot11VenueInfo14.value(), dot11VenueInfo14);
        hashMap.put(dot11VenueInfo15.value(), dot11VenueInfo15);
        hashMap.put(dot11VenueInfo16.value(), dot11VenueInfo16);
        hashMap.put(dot11VenueInfo17.value(), dot11VenueInfo17);
        hashMap.put(dot11VenueInfo18.value(), dot11VenueInfo18);
        hashMap.put(dot11VenueInfo19.value(), dot11VenueInfo19);
        hashMap.put(dot11VenueInfo20.value(), dot11VenueInfo20);
        hashMap.put(dot11VenueInfo21.value(), dot11VenueInfo21);
        hashMap.put(dot11VenueInfo22.value(), dot11VenueInfo22);
        hashMap.put(dot11VenueInfo23.value(), dot11VenueInfo23);
        hashMap.put(dot11VenueInfo24.value(), dot11VenueInfo24);
        hashMap.put(dot11VenueInfo25.value(), dot11VenueInfo25);
        hashMap.put(dot11VenueInfo26.value(), dot11VenueInfo26);
        hashMap.put(dot11VenueInfo27.value(), dot11VenueInfo27);
        hashMap.put(dot11VenueInfo28.value(), dot11VenueInfo28);
        hashMap.put(dot11VenueInfo29.value(), dot11VenueInfo29);
        hashMap.put(dot11VenueInfo30.value(), dot11VenueInfo30);
        hashMap.put(dot11VenueInfo31.value(), dot11VenueInfo31);
        hashMap.put(dot11VenueInfo32.value(), dot11VenueInfo32);
        hashMap.put(dot11VenueInfo33.value(), dot11VenueInfo33);
        hashMap.put(dot11VenueInfo34.value(), dot11VenueInfo34);
        hashMap.put(dot11VenueInfo35.value(), dot11VenueInfo35);
        hashMap.put(dot11VenueInfo36.value(), dot11VenueInfo36);
        hashMap.put(dot11VenueInfo37.value(), dot11VenueInfo37);
        hashMap.put(dot11VenueInfo38.value(), dot11VenueInfo38);
        hashMap.put(dot11VenueInfo39.value(), dot11VenueInfo39);
        hashMap.put(dot11VenueInfo40.value(), dot11VenueInfo40);
        hashMap.put(dot11VenueInfo41.value(), dot11VenueInfo41);
        hashMap.put(dot11VenueInfo42.value(), dot11VenueInfo42);
        hashMap.put(dot11VenueInfo43.value(), dot11VenueInfo43);
        hashMap.put(dot11VenueInfo44.value(), dot11VenueInfo44);
        hashMap.put(dot11VenueInfo45.value(), dot11VenueInfo45);
        hashMap.put(dot11VenueInfo46.value(), dot11VenueInfo46);
        hashMap.put(dot11VenueInfo47.value(), dot11VenueInfo47);
        hashMap.put(dot11VenueInfo48.value(), dot11VenueInfo48);
        hashMap.put(dot11VenueInfo49.value(), dot11VenueInfo49);
        hashMap.put(dot11VenueInfo50.value(), dot11VenueInfo50);
    }

    public Dot11VenueInfo(Short sh2, String str) {
        super(sh2, str);
    }

    public static Dot11VenueInfo getInstance(Short sh2) {
        Map<Short, Dot11VenueInfo> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new Dot11VenueInfo(sh2, "unknown");
    }

    public static Dot11VenueInfo register(Dot11VenueInfo dot11VenueInfo) {
        return registry.put(dot11VenueInfo.value(), dot11VenueInfo);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11VenueInfo dot11VenueInfo) {
        return value().compareTo(dot11VenueInfo.value());
    }

    public Dot11VenueGroup getVenueGroup() {
        return Dot11VenueGroup.getInstance(Byte.valueOf((byte) (value().shortValue() >> 8)));
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String toString() {
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append(getVenueGroup().name());
        sb2.append("/");
        sb2.append(name());
        sb2.append(" (");
        sb2.append(valueAsString());
        sb2.append(")");
        return sb2.toString();
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }
}
