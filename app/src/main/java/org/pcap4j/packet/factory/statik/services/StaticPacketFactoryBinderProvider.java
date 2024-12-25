package org.pcap4j.packet.factory.statik.services;

import org.pcap4j.packet.factory.PacketFactoryBinder;
import org.pcap4j.packet.factory.PacketFactoryBinderProvider;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/services/StaticPacketFactoryBinderProvider.class */
public class StaticPacketFactoryBinderProvider implements PacketFactoryBinderProvider {
    @Override // org.pcap4j.packet.factory.PacketFactoryBinderProvider
    public PacketFactoryBinder getBinder() {
        return StaticPacketFactoryBinder.getInstance();
    }
}
