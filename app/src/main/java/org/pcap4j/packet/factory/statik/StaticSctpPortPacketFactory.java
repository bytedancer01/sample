package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.namednumber.SctpPort;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticSctpPortPacketFactory.class */
public final class StaticSctpPortPacketFactory extends AbstractStaticPacketFactory<SctpPort> {
    private static final StaticSctpPortPacketFactory INSTANCE = new StaticSctpPortPacketFactory();

    private StaticSctpPortPacketFactory() {
    }

    public static StaticSctpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
