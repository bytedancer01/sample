package org.pcap4j.packet.factory;

import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/PacketFactoryBinder.class */
public interface PacketFactoryBinder {
    <T, N extends NamedNumber<?, ?>> PacketFactory<T, N> getPacketFactory(Class<T> cls, Class<N> cls2);
}
