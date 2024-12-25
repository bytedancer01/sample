package org.pcap4j.packet.namednumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/NotApplicable.class */
public final class NotApplicable extends NamedNumber<Byte, NotApplicable> {
    private static final long serialVersionUID = -1260181531930282735L;
    public static final NotApplicable UNKNOWN = new NotApplicable((byte) 0, "Unknown");
    public static final NotApplicable FRAGMENTED = new NotApplicable((byte) 1, "Fragmented");
    public static final NotApplicable COMPRESSED = new NotApplicable((byte) 2, "Compressed");
    public static final NotApplicable ENCRYPTED = new NotApplicable((byte) 3, "Encrypted");
    public static final NotApplicable UNKNOWN_IP_V6_EXTENSION = new NotApplicable((byte) 4, "Unknown IPv6 Extension");

    private NotApplicable(Byte b10, String str) {
        super(b10, str);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(NotApplicable notApplicable) {
        return value().compareTo(notApplicable.value());
    }
}
