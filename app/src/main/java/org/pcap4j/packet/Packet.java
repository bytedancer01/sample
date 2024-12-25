package org.pcap4j.packet;

import java.io.Serializable;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Packet.class */
public interface Packet extends Iterable<Packet>, Serializable {

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Packet$Builder.class */
    public interface Builder extends Iterable<Builder> {
        Packet build();

        <T extends Builder> T get(Class<T> cls);

        Builder getOuterOf(Class<? extends Builder> cls);

        Builder getPayloadBuilder();

        Builder payloadBuilder(Builder builder);
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Packet$Header.class */
    public interface Header extends Serializable {
        byte[] getRawData();

        int length();
    }

    <T extends Packet> boolean contains(Class<T> cls);

    <T extends Packet> T get(Class<T> cls);

    Builder getBuilder();

    Header getHeader();

    Packet getOuterOf(Class<? extends Packet> cls);

    Packet getPayload();

    byte[] getRawData();

    int length();
}
