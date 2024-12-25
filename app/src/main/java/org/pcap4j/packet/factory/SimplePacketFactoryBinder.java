package org.pcap4j.packet.factory;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/SimplePacketFactoryBinder.class */
final class SimplePacketFactoryBinder {
    private static final SimplePacketFactoryBinder INSTANCE = new SimplePacketFactoryBinder();

    private SimplePacketFactoryBinder() {
    }

    public static SimplePacketFactoryBinder getInstance() {
        return INSTANCE;
    }

    public <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getPacketFactory(Class<T> cls, Class<N> cls2) {
        if (Packet.class.isAssignableFrom(cls)) {
            return StaticUnknownPacketFactory.getInstance();
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("targetClass: ");
        sb2.append(cls);
        sb2.append(" numberClass: ");
        sb2.append(cls2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
