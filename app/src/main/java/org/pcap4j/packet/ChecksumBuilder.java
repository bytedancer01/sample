package org.pcap4j.packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/ChecksumBuilder.class */
public interface ChecksumBuilder<T> {
    T build();

    ChecksumBuilder<T> correctChecksumAtBuild(boolean z10);
}
