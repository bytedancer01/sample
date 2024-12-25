package org.pcap4j.packet.factory;

import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/PacketFactory.class */
public interface PacketFactory<T, N extends NamedNumber<?, ?>> {
    Class<? extends T> getTargetClass();

    Class<? extends T> getTargetClass(N n10);

    T newInstance(byte[] bArr, int i10, int i11);

    T newInstance(byte[] bArr, int i10, int i11, N n10);
}
