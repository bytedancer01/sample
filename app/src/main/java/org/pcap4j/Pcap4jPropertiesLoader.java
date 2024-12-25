package org.pcap4j;

import org.pcap4j.util.PropertiesLoader;
import p447zg.C10229t;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/Pcap4jPropertiesLoader.class */
public final class Pcap4jPropertiesLoader {
    private static final int AF_INET6_DEFAULT = 23;
    private static final int AF_INET6_FREEBSD = 28;
    public static final String AF_INET6_KEY;
    private static final int AF_INET6_LINUX = 10;
    private static final int AF_INET6_MAC = 30;
    private static final int AF_INET_DEFAULT = 2;
    public static final String AF_INET_KEY;
    private static final int AF_LINK_DEFAULT = 18;
    public static final String AF_LINK_KEY;
    private static final int AF_PACKET_DEFAULT = 17;
    public static final String AF_PACKET_KEY;
    private static final int DLT_RAW_DEFAULT = 12;
    public static final String DLT_RAW_KEY;
    private static final int DLT_RAW_OPENBSD = 14;
    private static final Pcap4jPropertiesLoader INSTANCE;
    private static final String KEY_PREFIX;
    public static final String PCAP4J_PROPERTIES_PATH_KEY;
    private PropertiesLoader loader = new PropertiesLoader(System.getProperty(PCAP4J_PROPERTIES_PATH_KEY, KEY_PREFIX.replace('.', '/') + "/pcap4j.properties"), true, true);

    static {
        String name = Pcap4jPropertiesLoader.class.getPackage().getName();
        KEY_PREFIX = name;
        PCAP4J_PROPERTIES_PATH_KEY = name + ".properties";
        AF_INET_KEY = name + ".af.inet";
        AF_INET6_KEY = name + ".af.inet6";
        AF_PACKET_KEY = name + ".af.packet";
        AF_LINK_KEY = name + ".af.link";
        DLT_RAW_KEY = name + ".dlt.raw";
        INSTANCE = new Pcap4jPropertiesLoader();
    }

    private Pcap4jPropertiesLoader() {
    }

    private int getDefaultAfInet6() {
        int m42798d = C10229t.m42798d();
        if (m42798d == 0) {
            return 30;
        }
        if (m42798d == 1) {
            return 10;
        }
        if (m42798d == 4) {
            return 28;
        }
        if (m42798d != 8) {
            return m42798d != 10 ? 23 : 28;
        }
        return 10;
    }

    private int getDefaultDltRaw() {
        return C10229t.m42798d() != 5 ? 12 : 14;
    }

    public static Pcap4jPropertiesLoader getInstance() {
        return INSTANCE;
    }

    public Integer getAfInet() {
        return this.loader.getInteger(AF_INET_KEY, 2);
    }

    public Integer getAfInet6() {
        return this.loader.getInteger(AF_INET6_KEY, Integer.valueOf(getDefaultAfInet6()));
    }

    public Integer getAfLink() {
        return this.loader.getInteger(AF_LINK_KEY, 18);
    }

    public Integer getAfPacket() {
        return this.loader.getInteger(AF_PACKET_KEY, 17);
    }

    public Integer getDltRaw() {
        return this.loader.getInteger(DLT_RAW_KEY, Integer.valueOf(getDefaultDltRaw()));
    }
}
