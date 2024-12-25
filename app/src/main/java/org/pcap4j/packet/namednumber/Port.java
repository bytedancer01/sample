package org.pcap4j.packet.namednumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Port.class */
public abstract class Port extends NamedNumber<Short, Port> {
    public Port(Short sh2, String str) {
        super(sh2, str);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Port port) {
        return value().compareTo(port.value());
    }

    public int valueAsInt() {
        return value().shortValue() & 65535;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(valueAsInt());
    }
}
