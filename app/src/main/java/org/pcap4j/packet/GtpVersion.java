package org.pcap4j.packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpVersion.class */
public enum GtpVersion {
    V0(0),
    V1(1),
    V2(2),
    V3(3),
    V4(4),
    V5(5),
    V6(6),
    V7(7);

    private final int value;

    GtpVersion(int i10) {
        this.value = i10;
    }

    public static GtpVersion getInstance(int i10) {
        for (GtpVersion gtpVersion : values()) {
            if (gtpVersion.value == i10) {
                return gtpVersion;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + i10);
    }

    public int getValue() {
        return this.value;
    }
}
