package org.pcap4j.packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/LengthBuilder.class */
public interface LengthBuilder<T> {
    T build();

    LengthBuilder<T> correctLengthAtBuild(boolean z10);
}
