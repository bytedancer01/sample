package org.pcap4j.packet;

import org.pcap4j.util.PropertiesLoader;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PacketPropertiesLoader.class */
public final class PacketPropertiesLoader {
    private PropertiesLoader loader = new PropertiesLoader(System.getProperty(PACKET_PROPERTIES_PATH_KEY, PacketPropertiesLoader.class.getPackage().getName().replace('.', '/') + "/packet.properties"), true, true);
    public static final String PACKET_PROPERTIES_PATH_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".properties";
    public static final String ICMPV4_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".icmpV4.calcChecksumAtBuild";
    public static final String ICMPV6_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".icmpV6.calcChecksumAtBuild";
    public static final String IPV4_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".ipV4.calcChecksumAtBuild";
    public static final String TCPV4_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".tcpV4.calcChecksumAtBuild";
    public static final String TCPV6_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".tcpV6.calcChecksumAtBuild";
    public static final String UDPV4_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".udpV4.calcChecksumAtBuild";
    public static final String UDPV6_CALC_CHECKSUM_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".udpV6.calcChecksumAtBuild";
    public static final String SCTP_CALC_CHECKSUM_BY_ADLER32_KEY = PacketPropertiesLoader.class.getPackage().getName() + ".sctp.calcChecksumByAdler32";
    private static final PacketPropertiesLoader INSTANCE = new PacketPropertiesLoader();

    private PacketPropertiesLoader() {
    }

    public static PacketPropertiesLoader getInstance() {
        return INSTANCE;
    }

    public boolean icmpV4CalcChecksum() {
        return this.loader.getBoolean(ICMPV4_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean icmpV6CalcChecksum() {
        return this.loader.getBoolean(ICMPV6_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean ipV4CalcChecksum() {
        return this.loader.getBoolean(IPV4_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean sctpCalcChecksumByAdler32() {
        return this.loader.getBoolean(SCTP_CALC_CHECKSUM_BY_ADLER32_KEY, Boolean.FALSE).booleanValue();
    }

    public boolean tcpV4CalcChecksum() {
        return this.loader.getBoolean(TCPV4_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean tcpV6CalcChecksum() {
        return this.loader.getBoolean(TCPV6_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean udpV4CalcChecksum() {
        return this.loader.getBoolean(UDPV4_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }

    public boolean udpV6CalcChecksum() {
        return this.loader.getBoolean(UDPV6_CALC_CHECKSUM_KEY, Boolean.TRUE).booleanValue();
    }
}
