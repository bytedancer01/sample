package org.pcap4j.packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/RadiotapFecType.class */
public enum RadiotapFecType {
    BCC(0),
    LDPC(1);

    private final int value;

    RadiotapFecType(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
